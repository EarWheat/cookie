package com.tencent.wxcloudrun.controller.task;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.task.TaskRenderVO;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;
import com.tencent.wxcloudrun.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @Desc: 主任务
 * @Author: 泽露
 * @Date: 2022/11/11 8:52 PM
 * @Version: 1.initial version; 2022/11/11 8:52 PM
 */
@RestController
@RequestMapping("/task")
@Slf4j
public class TaskController {

    @Resource
    public TaskService taskService;

    @RequestMapping("/getTask")
    public ApiResponse getTask() {
        return ApiResponse.ok("task empty");
    }

    @RequestMapping("/queryTaskList")
    public ApiResponse queryTaskLists(@RequestBody TaskRequestParam param){
        List<TaskRenderVO> taskRenderVOS = null;
        try {
            taskRenderVOS = taskService.queryTaskList(param);
            if(CollectionUtils.isEmpty(taskRenderVOS)){

            }
        } catch (Exception e){

        } finally {

        }
        return ApiResponse.ok(taskRenderVOS);
    }

}
