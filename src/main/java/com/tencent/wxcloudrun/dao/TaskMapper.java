package com.tencent.wxcloudrun.dao;

import java.util.List;

import com.tencent.wxcloudrun.model.TaskDAO;
/**
*  @author author
*/
public interface TaskMapper {

    int insertTaskDAO(TaskDAO object);

    int updateTaskDAO(TaskDAO object);

    int update(TaskDAO.UpdateBuilder object);

    List<TaskDAO> queryTaskDAO(TaskDAO object);

    TaskDAO queryTaskDAOLimit1(TaskDAO object);

}