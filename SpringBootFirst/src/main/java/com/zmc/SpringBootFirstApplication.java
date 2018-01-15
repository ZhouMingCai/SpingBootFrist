package com.zmc;

import com.zmc.common.util.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext  context= SpringApplication.run(SpringBootFirstApplication.class, args);

		if (context.isActive()){

			LogUtil.info("SpringBoot系统", "系统启动完成");
		}
	}



}
