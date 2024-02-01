package be;

import fh.g;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import oe.f;
import ve.h;
import xe.l0;
import zd.a1;
import zd.h1;

public class m {
    @g
    public static final <T> T[] a(@g T[] tArr, int i10) {
        l0.p(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        l0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    @h1(version = "1.3")
    @a1
    @h(name = "contentDeepHashCode")
    public static final <T> int b(@fh.h T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @h1(version = "1.3")
    public static final void c(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
        }
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        l0.y(0, "T?");
        return new Object[0];
    }

    @f
    public static final String e(byte[] bArr, Charset charset) {
        l0.p(bArr, "<this>");
        l0.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        l0.p(collection, "<this>");
        l0.y(0, "T?");
        return collection.toArray(new Object[0]);
    }
}
