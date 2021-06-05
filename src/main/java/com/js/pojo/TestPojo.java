package com.js.pojo;

import com.js.easyexcel.domain.BaseExcelData;
import lombok.Data;

import java.util.Map;

@SuppressWarnings("ALL")
@Data
public class TestPojo extends BaseExcelData {
    private String name;

    private Map<String, String> map;
}
