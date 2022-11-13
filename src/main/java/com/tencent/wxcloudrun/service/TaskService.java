package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;

import java.util.List;

/**
 * @Desc: 任务服务
 * @Author: 泽露
 * @Date: 2022/11/13 3:10 PM
 * @Version: 1.initial version; 2022/11/13 3:10 PM
 */
public interface TaskService {

    /**
     * 获取任务列表
     *
     * @param param
     * @return
     */
    public List<TaskRenderVO> queryTaskList(TaskRequestParam param);
}
