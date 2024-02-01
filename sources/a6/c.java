package a6;

import java.lang.reflect.Array;
import java.util.HashSet;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public b f226a = null;

    /* renamed from: b  reason: collision with root package name */
    public C0005c f227b = null;

    /* renamed from: c  reason: collision with root package name */
    public h f228c = null;

    /* renamed from: d  reason: collision with root package name */
    public f f229d = null;

    /* renamed from: e  reason: collision with root package name */
    public g f230e = null;

    /* renamed from: f  reason: collision with root package name */
    public e f231f = null;

    /* renamed from: g  reason: collision with root package name */
    public d f232g = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f233a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f234b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f235c;

        public a(Class cls, int i10, Object obj) {
            this.f233a = cls;
            this.f234b = i10;
            this.f235c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!h.O(obj, this.f233a) || Array.getLength(obj) != this.f234b) {
                return false;
            }
            for (int i10 = 0; i10 < this.f234b; i10++) {
                Object obj2 = Array.get(this.f235c, i10);
                Object obj3 = Array.get(obj, i10);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class b extends v<boolean[]> {
        /* renamed from: g */
        public final boolean[] a(int i10) {
            return new boolean[i10];
        }
    }

    /* renamed from: a6.c$c  reason: collision with other inner class name */
    public static final class C0005c extends v<byte[]> {
        /* renamed from: g */
        public final byte[] a(int i10) {
            return new byte[i10];
        }
    }

    public static final class d extends v<double[]> {
        /* renamed from: g */
        public final double[] a(int i10) {
            return new double[i10];
        }
    }

    public static final class e extends v<float[]> {
        /* renamed from: g */
        public final float[] a(int i10) {
            return new float[i10];
        }
    }

    public static final class f extends v<int[]> {
        /* renamed from: g */
        public final int[] a(int i10) {
            return new int[i10];
        }
    }

    public static final class g extends v<long[]> {
        /* renamed from: g */
        public final long[] a(int i10) {
            return new long[i10];
        }
    }

    public static final class h extends v<short[]> {
        /* renamed from: g */
        public final short[] a(int i10) {
            return new short[i10];
        }
    }

    public static <T> HashSet<T> a(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(r0);
        for (T add : tArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static Object b(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }

    public static <T> T[] j(T[] tArr, T t10) {
        int length = tArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (tArr[i10] != t10) {
                i10++;
            } else if (i10 == 0) {
                return tArr;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length);
                System.arraycopy(tArr, 0, tArr2, 1, i10);
                tArr2[0] = t10;
                int i11 = i10 + 1;
                int i12 = length - i11;
                if (i12 > 0) {
                    System.arraycopy(tArr, i11, tArr2, i11, i12);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t10;
        return tArr3;
    }

    public b c() {
        if (this.f226a == null) {
            this.f226a = new b();
        }
        return this.f226a;
    }

    public C0005c d() {
        if (this.f227b == null) {
            this.f227b = new C0005c();
        }
        return this.f227b;
    }

    public d e() {
        if (this.f232g == null) {
            this.f232g = new d();
        }
        return this.f232g;
    }

    public e f() {
        if (this.f231f == null) {
            this.f231f = new e();
        }
        return this.f231f;
    }

    public f g() {
        if (this.f229d == null) {
            this.f229d = new f();
        }
        return this.f229d;
    }

    public g h() {
        if (this.f230e == null) {
            this.f230e = new g();
        }
        return this.f230e;
    }

    public h i() {
        if (this.f228c == null) {
            this.f228c = new h();
        }
        return this.f228c;
    }
}
