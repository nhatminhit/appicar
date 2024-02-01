package d9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
public @interface r {
    public static final int B = 100;
    public static final int C = 102;
    public static final int D = 104;
    public static final int E = 105;
}
