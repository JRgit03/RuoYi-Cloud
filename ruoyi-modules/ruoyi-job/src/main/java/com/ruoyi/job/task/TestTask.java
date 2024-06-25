package com.ruoyi.job.task;

import com.alibaba.fastjson2.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 定时任务测试
 */
@Component("testTask")
public class TestTask {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void test1(Integer num1,Integer num2){
        String nowTime = DateUtils.format(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss");
        logger.info("当前时间：{}, 计算表达式 {} + {} = {}", nowTime, num1, num2, num1 + num2);
    }
}
