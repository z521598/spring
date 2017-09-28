package com.baidu.langshiquan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by langshiquan on 17/9/28.
 */

@Target(ElementType.METHOD)
public @interface LogExecTime {
    String value();
}
