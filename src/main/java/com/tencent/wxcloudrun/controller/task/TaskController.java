package com.tencent.wxcloudrun.controller.task;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.task.TaskRequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Author: 泽露
 * @Date: 2022/11/11 8:52 PM
 * @Version: 1.initial version; 2022/11/11 8:52 PM
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @RequestMapping("/getTask")
    public ApiResponse getTask() {
        return ApiResponse.ok("task empty");
    }

    @RequestMapping("/queryTaskList")
    public ApiResponse queryTaskLists(@RequestBody TaskRequestParam param){
        try {

        } catch (Exception e){

        } finally {

        }
        return null;
    }

}
