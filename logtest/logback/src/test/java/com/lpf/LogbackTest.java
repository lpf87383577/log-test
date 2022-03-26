package com.lpf;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    // 快速入门
    @Test
    public void test() throws Exception {
        // 日志消息输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        // 字符串拼接
        LOGGER.error("这是一个{}等级","error");
    }
}
