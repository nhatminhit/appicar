package p5;

import i5.k;
import i5.o;
import java.nio.file.Path;

public class f extends e {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f11509b = Path.class;

    public Class<?> a() {
        return this.f11509b;
    }

    public k<?> b(Class<?> cls) {
        if (cls == this.f11509b) {
            return new i();
        }
        return null;
    }

    public o<?> c(Class<?> cls) {
        if (this.f11509b.isAssignableFrom(cls)) {
            return new j();
        }
        return null;
    }
}
