package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;
import com.tencent.wxcloudrun.enums.TaskEnum;
import com.tencent.wxcloudrun.service.TaskService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc:
 * @Author: 泽露
 * @Date: 2022/11/13 3:11 PM
 * @Version: 1.initial version; 2022/11/13 3:11 PM
 */
public class TaskServiceImpl implements TaskService {



    @Override
    public List<TaskRenderVO> queryTaskList(TaskRequestParam param) {
        TaskEnum[] tasks = TaskEnum.values();
        List<TaskRenderVO> taskRenders = new ArrayList<>();
        Arrays.stream(tasks).forEach(task -> {
//            taskRenders.add()
        });
        return null;
    }
}
