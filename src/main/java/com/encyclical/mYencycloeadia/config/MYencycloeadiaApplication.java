package com.encyclical.mYencycloeadia.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
@ComponentScan("com.encyclical")
@SpringBootApplication
public class MYencycloeadiaApplication {
			private static final Logger LOG=LoggerFactory.getLogger(MYencycloeadiaApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MYencycloeadiaApplication.class);
		ConfigurableEnvironment env = app.run(args).getEnvironment();

		LOG.info("启动成功!!!");
		LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));


	}

}
