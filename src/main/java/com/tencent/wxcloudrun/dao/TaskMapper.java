package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.task.TaskDAO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Desc: 任务mapper
 * @Author: 泽露
 * @Date: 2022/11/14 5:52 PM
 * @Version: 1.initial version; 2022/11/14 5:52 PM
 */
@Mapper
public interface TaskMapper {

    /**
     * 获取任务列表
     *
     * @param userId
     * @return
     */
    List<TaskDAO> queryTaskList(Long userId);

    /**
     * 获取任务详情
     *
     * @param userId
     * @param taskId
     * @return
     */
    TaskDAO queryTask(Long userId, Long taskId);
}
