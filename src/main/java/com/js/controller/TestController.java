package com.js.controller;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.js.pojo.TestPojo;
import com.js.util.EasyExcleUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("test")
    public void test(HttpServletRequest request, HttpServletResponse response) throws Exception{
        TestPojo testPojo = new TestPojo();
        testPojo.setName("zhangsan");
        Map<String,String> map = new HashMap<>();
        map.put("key","key");
        map.put("value","value");
        List<TestPojo> pojoList = new ArrayList<>();
        pojoList.add(testPojo);


        TestPojo testPojo2 = new TestPojo();
        testPojo.setName("zhangsan2");
        Map<String,String> map3 = new HashMap<>();
        map3.put("key2","ke2y");
        map3.put("valu2e","valu2e");
        pojoList.add(testPojo2);
        Map<String, List<TestPojo>> map1 = new HashMap<>();
        map1.put("test1",pojoList);
        map1.put("test2",pojoList);

    }
}
