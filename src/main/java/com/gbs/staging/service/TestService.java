package com.gbs.staging.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private static Logger logger= LogManager.getLogger(TestService.class);

    @Async
    public void testAsync() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info("异步任务执行完成");
    }

    @Scheduled(cron = "0/30 * * * * ?")
    public void scheduledTest(){
        logger.info("定时任务执行-----");
    }
}
