package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;
import com.tencent.wxcloudrun.enums.TaskEnum;
import com.tencent.wxcloudrun.factory.TaskFactory;
import com.tencent.wxcloudrun.manger.tasks.TaskManager;
import com.tencent.wxcloudrun.service.TaskService;
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
    public TaskFactory taskFactory;

    @Override
    public List<TaskRenderVO> queryTaskList(TaskRequestParam param) {
        TaskEnum[] tasks = TaskEnum.values();
        List<TaskRenderVO> taskRenders = new ArrayList<>();
        Arrays.stream(tasks).forEach(task -> {
            TaskManager taskManager = TaskFactory.getTaskManager(task);
            if (Objects.nonNull(taskManager)) {
                taskRenders.add(taskManager.getTask(param));
            }
        });
        return taskRenders;
    }
}
