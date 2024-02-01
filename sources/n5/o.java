package n5;

import i5.k;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import n5.n;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f10860a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i10 = 0; i10 < 5; i10++) {
            f10860a.add(clsArr[i10].getName());
        }
        for (Class name : n.I0()) {
            f10860a.add(name.getName());
        }
    }

    public static k<?> a(Class<?> cls, String str) {
        if (!f10860a.contains(str)) {
            return null;
        }
        n.a H0 = n.H0(cls);
        if (H0 != null) {
            return H0;
        }
        if (cls == UUID.class) {
            return new l0();
        }
        if (cls == StackTraceElement.class) {
            return new y();
        }
        if (cls == AtomicBoolean.class) {
            return new b();
        }
        if (cls == ByteBuffer.class) {
            return new e();
        }
        if (cls == Void.class) {
            return t.U;
        }
        return null;
    }

    public static boolean b(Class<?> cls) {
        return f10860a.contains(cls.getName());
    }
}
