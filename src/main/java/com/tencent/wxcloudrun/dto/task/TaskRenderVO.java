package com.tencent.wxcloudrun.dto.task;

import com.tencent.wxcloudrun.enums.TaskEnum;
import lombok.Data;

/**
 * @Desc: 前端渲染任务VO
 * @Author: 泽露
 * @Date: 2022/11/13 2:58 PM
 * @Version: 1.initial version; 2022/11/13 2:58 PM
 */
@Data
public class TaskRenderVO {

    /**
     * 任务类型
     */
    public TaskEnum task;
    /**
     * 任务标题
     */
    public String taskTitle;

    /**
     * 任务icon
     */
    public String taskIcon;
}
