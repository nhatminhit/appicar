package n0;

import android.graphics.Typeface;
import d.t0;
import d.x0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@t0(28)
@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class b1 extends a1 {
    public static final String B = "createFromFamiliesWithDefault";
    public static final int C = -1;
    public static final String D = "sans-serif";

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10678m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10684s.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
