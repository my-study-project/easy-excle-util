package com.js;

import com.js.pojo.TestPojo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class EasyExcleUtilApplicationTests {

    @Test
    void contextLoads() {
        TestPojo testPojo = new TestPojo();
        testPojo.setName("zhangsan");
        Map<String,String> map = new HashMap<>();
        map.put("key","key");
        map.put("value","value");
    }

}
