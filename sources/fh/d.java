package fh;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class d {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        @eh.d(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        String childrenArray() default "";

        @eh.d(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        String hasChildren() default "";

        @eh.d(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        String text() default "";
    }
}
