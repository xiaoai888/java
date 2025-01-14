package com.zhuangxv.bot.core.framework;

import lombok.Data;

import java.lang.reflect.Method;

@Data
public class HandlerMethod {

    private Class<?> type;

    private Object object;

    private Method method;

}
