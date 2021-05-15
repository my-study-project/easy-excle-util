package com.js.annotation;

import java.lang.annotation.*;

/**
 * @Description: 自定义Map注解为重写过滤器做准备
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 5/15/21 6:25 PM
 * @return
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Map {
}
