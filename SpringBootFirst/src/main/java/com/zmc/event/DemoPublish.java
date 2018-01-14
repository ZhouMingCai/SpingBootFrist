package com.zmc.event;

import com.zmc.model.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Demo 事件发布者
 */
@Component
public class DemoPublish {


    @Autowired
    ApplicationContext applicationContext;

    public  void demoPublish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

}
