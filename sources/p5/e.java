package p5;

import a6.h;
import i5.k;
import i5.o;
import java.util.logging.Logger;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f11508a;

    static {
        e eVar;
        try {
            eVar = (e) h.l(f.class, false);
        } catch (Throwable unused) {
            Logger.getLogger(e.class.getName()).warning("Unable to load JDK7 types (java.nio.file.Path): no Java7 type support added");
            eVar = null;
        }
        f11508a = eVar;
    }

    public static e d() {
        return f11508a;
    }

    public abstract Class<?> a();

    public abstract k<?> b(Class<?> cls);

    public abstract o<?> c(Class<?> cls);
}
