package com.zmc;

import com.zmc.event.DemoPublish;
import com.zmc.model.event.DemoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFirstApplicationTests {

	@Test
	public void contextLoads() {


	}


	@Test
	public  void  eventDemoTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoPublish demoPublish = context.getBean(DemoPublish.class);
		demoPublish.demoPublish("hello event msg");
		context.close();
	}

}
