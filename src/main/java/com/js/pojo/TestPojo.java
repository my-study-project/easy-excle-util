package com.js.pojo;

import lombok.Data;

import java.util.Map;

@Data
public class TestPojo {
    private String name;

    private Map<String,String> map;
}
