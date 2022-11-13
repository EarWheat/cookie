package com.tencent.wxcloudrun.manger;

import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;

import java.util.List;

/**
 * @Desc:
 * @Author: 泽露
 * @Date: 2022/11/13 2:55 PM
 * @Version: 1.initial version; 2022/11/13 2:55 PM
 */
public interface AbstractTaskManager {

    /**
     * 获取任务
     *
     * @param param
     * @return
     */
    public TaskRenderVO getTask(TaskRequestParam param);

    /**
     * 获取任务详情
     *
     * @param param
     * @return
     */
    public List<TaskRenderVO> getTaskList(TaskRequestParam param);
}
