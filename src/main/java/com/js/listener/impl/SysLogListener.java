package com.js.listener.impl;

import com.js.listener.ExcelListener;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@SuppressWarnings("ALL")
@Slf4j
public class SysLogListener<T> extends ExcelListener<T> {
    @Override
    public void doSomething(List<T> object) {
        // 写数据库，类型转换,生成id等操作
        log.info("{}", object);
    }
}