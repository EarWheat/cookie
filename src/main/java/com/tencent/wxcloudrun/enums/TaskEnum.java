package com.tencent.wxcloudrun.enums;

import lombok.Getter;

/**
 * @Desc: 任务枚举类
 * @Author: 泽露
 * @Date: 2022/11/13 3:02 PM
 * @Version: 1.initial version; 2022/11/13 3:02 PM
 */
@Getter
public enum TaskEnum {
    SIGN_IN(100001,"SignIn", "签到任务");

    private Integer taskId;
    private String code;
    private String name;

    TaskEnum(Integer taskId, String code, String name) {
        this.taskId = taskId;
        this.code = code;
        this.name = name;
    }


}
