package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.TaskMapper;
import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;
import com.tencent.wxcloudrun.enums.TaskEnum;
import com.tencent.wxcloudrun.factory.TaskFactory;
import com.tencent.wxcloudrun.manger.tasks.TaskManager;
import com.tencent.wxcloudrun.model.TaskDAO;
import com.tencent.wxcloudrun.service.TaskService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Desc: 任务服务类
 * @Author: 泽露
 * @Date: 2022/11/13 3:11 PM
 * @Version: 1.initial version; 2022/11/13 3:11 PM
 */
@Component
public class TaskServiceImpl implements TaskService {


    @Resource
    public TaskMapper taskMapper;

    @Override
    public List<TaskRenderVO> queryTaskList(TaskRequestParam param) {
        List<TaskRenderVO> taskRenderList = new ArrayList<>();
        List<TaskDAO> taskDAOS = taskMapper.queryTaskDAO(new TaskDAO());
        taskDAOS.forEach(dao -> {
            TaskRenderVO renderVO = new TaskRenderVO();
            BeanUtils.copyProperties(dao, renderVO);
            taskRenderList.add(renderVO);
        });
        return taskRenderList;
    }
}
