package com.gbs.staging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//标记这个是个springboot应用
@SpringBootApplication

@ComponentScan(value = {"com.gbs.outRangeBean","com.gbs.staging"})
public class StagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagingApplication.class, args);
	}

}
