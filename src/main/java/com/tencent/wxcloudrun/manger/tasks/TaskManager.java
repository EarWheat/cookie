package com.tencent.wxcloudrun.manger.tasks;

import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;

/**
 * @Desc:
 * @Author: 泽露
 * @Date: 2022/11/13 2:55 PM
 * @Version: 1.initial version; 2022/11/13 2:55 PM
 */
public interface TaskManager {

    /**
     * 获取任务
     *
     * @param param
     * @return
     */
    public TaskRenderVO getTask(TaskRequestParam param);
}
