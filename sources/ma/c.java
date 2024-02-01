package ma;

import ha.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f20998d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20999b = d();

    /* renamed from: c  reason: collision with root package name */
    public final Field f21000c = c();

    public static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f20998d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (!(this.f20999b == null || this.f21000c == null)) {
            try {
                long longValue = ((Long) f20998d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f20999b, new Object[]{this.f21000c})).longValue();
                f20998d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f20999b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
