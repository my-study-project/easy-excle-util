package com.js;

import com.alibaba.excel.EasyExcel;
import com.js.easyexcel.domain.ExcelParams;
import com.js.easyexcel.domain.FreezePane;
import com.js.easyexcel.util.EasyExcleUtil;
import com.js.easyexcel.util.ObjectIsNullUitl;
import com.js.impl.OwnThirdExcelListener;
import com.js.impl.ThirdAllExcelListener;
import com.js.pojo.OwnRelationThird;
import com.js.pojo.TestPojo;
import com.js.pojo.ThirdAndStep;
import com.js.pojo.Total;
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
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    @Test
    public void thirdIdRelationOwn() throws Exception {
        String fileName1 = "/Users/a2021/Desktop/外贸共享签约信息失败的/资方合同号对应期次.xlsx";
        File file1 = new File(fileName1);
        ThirdAllExcelListener thirdAllExcelListener = new ThirdAllExcelListener();
        EasyExcleUtil.importExcleNoSplit(file1, ThirdAndStep.class, thirdAllExcelListener);
//        List<ThirdAndStep> datas = thirdAllExcelListener.getDatas();
//
//        String fileName2 = "/Users/a2021/Desktop/外贸共享签约信息失败的/我方借款订单对应资方借款订单.xlsx";
//        OwnThirdExcelListener ownThirdExcelListener = new OwnThirdExcelListener();
//        File file2 = new File(fileName2);
//        EasyExcleUtil.importExcleNoSplit(file2, OwnRelationThird.class, ownThirdExcelListener);
//        List<OwnRelationThird> datas1 = ownThirdExcelListener.getDatas();
//        Map<String, OwnRelationThird> thirdMap = datas1.stream().collect(Collectors.toMap(OwnRelationThird::getThirdLoanId, Function.identity()));
//
//        List<Total> totals = datas.stream().map(thirdAndStep -> Total.builder()
//                .loanNo(Objects.isNull(thirdMap.get(thirdAndStep.getThirdLoanId())) ? "" : thirdMap.get(thirdAndStep.getThirdLoanId()).getLoanNo())
//                .step(thirdAndStep.getStep())
//                .thirdLoanId(thirdAndStep.getThirdLoanId())
//                .build()).collect(Collectors.toList());
//        Map<Object, List<Total>> collect = totals.stream().filter(total -> !Objects.isNull(total.getStep())).collect(Collectors.groupingBy(Total::getStep));
//
//        collect.forEach((object, totals1) -> {
//            String fileName = "/Users/a2021/Desktop/外贸共享签约信息失败的/Total" + object + ".xlsx";
//            System.out.println("第一批次");
//            EasyExcel.write(fileName, Total.class).sheet("双方汇总信息").doWrite(totals1);
//
//        });


    }

}
