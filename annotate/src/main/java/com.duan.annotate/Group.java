package com.duan.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Group {

    /**
     * 分组名
     *
     * @return
     */
    String groupName();

    /**
     * 唯一标识
     * @return
     */
    String key();

}
