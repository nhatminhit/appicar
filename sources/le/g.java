package le;

import h0.w1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import ve.h;
import xe.l0;
import zd.h1;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f20747a = 1;

    public static final void a(int i10, int i11) {
        if (i11 > i10) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
        }
    }

    public static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    public static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField(w1.f8777k);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @h1(version = "1.3")
    @h(name = "getSpilledVariableFieldMapping")
    @fh.h
    public static final String[] d(@fh.g a aVar) {
        l0.p(aVar, "<this>");
        f b10 = b(aVar);
        if (b10 == null) {
            return null;
        }
        a(1, b10.v());
        ArrayList arrayList = new ArrayList();
        int c10 = c(aVar);
        int[] i10 = b10.i();
        int length = i10.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10[i11] == c10) {
                arrayList.add(b10.s()[i11]);
                arrayList.add(b10.n()[i11]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @h1(version = "1.3")
    @h(name = "getStackTraceElement")
    @fh.h
    public static final StackTraceElement e(@fh.g a aVar) {
        String str;
        l0.p(aVar, "<this>");
        f b10 = b(aVar);
        if (b10 == null) {
            return null;
        }
        a(1, b10.v());
        int c10 = c(aVar);
        int i10 = c10 < 0 ? -1 : b10.l()[c10];
        String b11 = i.f20748a.b(aVar);
        if (b11 == null) {
            str = b10.c();
        } else {
            str = b11 + '/' + b10.c();
        }
        return new StackTraceElement(str, b10.m(), b10.f(), i10);
    }
}
