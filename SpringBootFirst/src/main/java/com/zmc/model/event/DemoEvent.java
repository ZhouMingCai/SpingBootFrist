package com.zmc.model.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Spring 事件传递 定义消息载体
 */

public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source , String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
