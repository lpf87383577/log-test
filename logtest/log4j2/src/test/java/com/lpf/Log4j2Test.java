package com.lpf;




import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test {

    // 定义日志记录器对象
    // public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);
    // 为了保证使用时，不需要每次都去创建logger 对象，我们声明静态常量
    public static final Logger LOGGER = LoggerFactory.getLogger(Log4j2Test.class);

    // 快速入门
    @Test
    public void testQuick() throws Exception {
        // 日志消息输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        // 字符串拼接
        LOGGER.error("这是一个{}等级","error");
    }

    @Test
    public void test2() throws Exception {

        for (int i = 0;i<100;i++){
            LOGGER.error("测试日志"+i);
        }
    }

}
