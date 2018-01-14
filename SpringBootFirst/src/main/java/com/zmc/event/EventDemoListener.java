package com.zmc.event;

import com.zmc.model.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 */
@Component
public class EventDemoListener  implements ApplicationListener<DemoEvent>{



    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("我收到DemoEvent消息了"+demoEvent.getMsg());
    }
}
