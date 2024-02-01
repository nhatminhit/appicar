package z8;

import android.os.IBinder;
import d.m0;
import e8.a;
import j8.s;
import java.lang.reflect.Field;
import w8.y;
import z8.d;

@a
@y
public final class f<T> extends d.a {
    public final Object O;

    public f(Object obj) {
        this.O = obj;
    }

    @a
    @m0
    public static <T> T J(@m0 d dVar) {
        if (dVar instanceof f) {
            return ((f) dVar).O;
        }
        IBinder asBinder = dVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            s.l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    @a
    @m0
    public static <T> d b0(@m0 T t10) {
        return new f(t10);
    }
}
