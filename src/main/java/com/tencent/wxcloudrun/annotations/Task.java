package com.tencent.wxcloudrun.annotations;

import com.tencent.wxcloudrun.enums.TaskEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Desc:
 * @Author: 泽露
 * @Date: 2022/11/11 8:52 PM
 * @Version: 1.initial version; 2022/11/11 8:52 PM
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Task {

    public TaskEnum value();
}
