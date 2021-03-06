package com.databind.library.annotation;

import com.databind.library.CheckMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by minyangcheng on 2016/11/11.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FieldCheck {
    int order() default 0;
    String[] msg() default "";
    CheckMode[] checkFlows() default {};
}
