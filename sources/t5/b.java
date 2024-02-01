package t5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import v4.a;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface b {
    public static final String P = "##irrelevant";

    String id() default "";

    @Deprecated
    String schemaItemDefinition() default "##irrelevant";

    @Deprecated
    String schemaObjectPropertiesDefinition() default "##irrelevant";

    String schemaType() default "any";
}
