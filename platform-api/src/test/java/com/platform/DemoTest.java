package com.platform;

import com.platform.redis.OrderKey;
import com.platform.redis.RedisService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import redis.clients.jedis.Jedis;


public class DemoTest {
    private Integer num = 0;

    @Test
    public void test() {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);
        jedis.close();
     }

}
