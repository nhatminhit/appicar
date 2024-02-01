package u2;

import d.t0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import u2.z0;

@t0(16)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface y0 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    z0.a matchInfo() default z0.a.P;

    String[] notIndexed() default {};

    z0.b order() default z0.b.O;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
