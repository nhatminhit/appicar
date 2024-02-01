package com.google.android.material.internal;

import d.m0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Deprecated
@Retention(RetentionPolicy.CLASS)
public @interface d {
    @m0
    String value() default "";
}
