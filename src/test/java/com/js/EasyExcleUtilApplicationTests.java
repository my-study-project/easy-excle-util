package com.js;

import com.js.easyexcel.domain.ExcelParams;
import com.js.easyexcel.domain.FreezePane;
import com.js.easyexcel.util.EasyExcleUtil;
import com.js.pojo.TestPojo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class EasyExcleUtilApplicationTests {

    @Test
    void contextLoads() {
        TestPojo testPojo = new TestPojo();
        testPojo.setName("zhangsan");
        Map<String, String> map = new HashMap<>();
        map.put("key", "key");
        map.put("value", "value");
    }

    @Test
    void testRead() throws Exception {
        String fileName = "D:\\write1.xlsx";

        File file = new File(fileName);
        InputStream is = new FileInputStream(file);

        // 封装Excel参数
        ExcelParams<TestPojo> params = new ExcelParams<>(is, TestPojo.class);
        // 读取Excel文件
        List<TestPojo> dataList = EasyExcleUtil.readExcelSync(params);

        for (int i = 0; i < dataList.size(); i++) {
            System.out.println(dataList.get(i));
        }
    }

    @Test
    void testWrite() throws Exception {
        String fileName = "D:\\write1.xlsx";

        File file = new File(fileName);
        OutputStream os = new FileOutputStream(file);

        // 封装Excel参数
        ExcelParams<TestPojo> params = new ExcelParams<>("学生统计", os, "学生", TestPojo.class, getData(20));
        params.setFreezePane(new FreezePane(0, 1));
        // 写Excel文件
        EasyExcleUtil.writeExcel(params);
    }

    //创建方法返回list集合
    public static List<TestPojo> getData(int count) {
        List<TestPojo> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            TestPojo data = new TestPojo();
            list.add(data);
        }
        return list;
    }

}
