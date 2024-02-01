package u2;

import d.t0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@t0(16)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface x0 {
    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
