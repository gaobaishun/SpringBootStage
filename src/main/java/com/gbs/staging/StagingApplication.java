package com.gbs.staging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


//标记这个是个springboot应用
@SpringBootApplication

//开启异步注解
@EnableAsync
//开启定时任务
@EnableScheduling
@ComponentScan(value = {"com.gbs.outRangeBean","com.gbs.staging"})
public class StagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagingApplication.class, args);
	}

}
