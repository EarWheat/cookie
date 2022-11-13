package com.tencent.wxcloudrun.factory;

import com.tencent.wxcloudrun.annotations.Task;
import com.tencent.wxcloudrun.enums.TaskEnum;
import com.tencent.wxcloudrun.manger.AbstractTaskManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Desc: 任务工厂类
 * @Author: 泽露
 * @Date: 2022/11/13 3:14 PM
 * @Version: 1.initial version; 2022/11/13 3:14 PM
 */
@Component
@Slf4j
public class TaskFactory implements ApplicationContextAware, InitializingBean {

    public ApplicationContext applicationContext;

    /**
     * 任务容器
     */
    public static Map<TaskEnum, AbstractTaskManager> taskContainer;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static AbstractTaskManager getTaskManager(TaskEnum taskEnum) {
        return taskContainer.get(taskEnum);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, Object> taskManagers = applicationContext.getBeansWithAnnotation(Task.class);
        taskManagers.forEach((key, value) -> {
            try {
                TaskEnum taskEnum = value.getClass().getAnnotation(Task.class).value();
                taskContainer.put(taskEnum, (AbstractTaskManager) value);
            } catch (Exception e) {
                log.error("");
            }
        });
    }
}
