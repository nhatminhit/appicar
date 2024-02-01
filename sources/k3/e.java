package k3;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import d.m0;
import d.t0;
import d.x0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public abstract class e {

    /* renamed from: d  reason: collision with root package name */
    public static final String f9934d = "VersionedParcel";

    /* renamed from: e  reason: collision with root package name */
    public static final int f9935e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9936f = -2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9937g = -3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9938h = -4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f9939i = -5;

    /* renamed from: j  reason: collision with root package name */
    public static final int f9940j = -6;

    /* renamed from: k  reason: collision with root package name */
    public static final int f9941k = -7;

    /* renamed from: l  reason: collision with root package name */
    public static final int f9942l = -9;

    /* renamed from: m  reason: collision with root package name */
    public static final int f9943m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f9944n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f9945o = 3;

    /* renamed from: p  reason: collision with root package name */
    public static final int f9946p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f9947q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final int f9948r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f9949s = 8;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.collection.a<String, Method> f9950a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.collection.a<String, Method> f9951b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.collection.a<String, Class> f9952c;

    public class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public static class b extends RuntimeException {
        public b(Throwable th2) {
            super(th2);
        }
    }

    public e(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f9950a = aVar;
        this.f9951b = aVar2;
        this.f9952c = aVar3;
    }

    @m0
    public static Throwable f(@m0 Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public double[] A() {
        int L = L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i10 = 0; i10 < L; i10++) {
            dArr[i10] = y();
        }
        return dArr;
    }

    public final <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
            return;
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int g10 = g(collection.iterator().next());
            L0(g10);
            switch (g10) {
                case 1:
                    for (T l12 : collection) {
                        l1(l12);
                    }
                    return;
                case 2:
                    for (T W0 : collection) {
                        W0(W0);
                    }
                    return;
                case 3:
                    for (T Y0 : collection) {
                        Y0(Y0);
                    }
                    return;
                case 4:
                    for (T e12 : collection) {
                        e1(e12);
                    }
                    return;
                case 5:
                    for (T g12 : collection) {
                        g1(g12);
                    }
                    return;
                case 7:
                    for (T intValue : collection) {
                        L0(intValue.intValue());
                    }
                    return;
                case 8:
                    for (T floatValue : collection) {
                        H0(floatValue.floatValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public double[] B(double[] dArr, int i10) {
        return !F(i10) ? dArr : A();
    }

    public final <T> void B0(Collection<T> collection, int i10) {
        i0(i10);
        A0(collection);
    }

    public final Exception C(int i10, String str) {
        return b(i10, str);
    }

    public abstract void C0(double d10);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = E();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Exception D(java.lang.Exception r1, int r2) {
        /*
            r0 = this;
            boolean r2 = r0.F(r2)
            if (r2 != 0) goto L_0x0007
            return r1
        L_0x0007:
            int r2 = r0.E()
            if (r2 == 0) goto L_0x0015
            java.lang.String r1 = r0.c0()
            java.lang.Exception r1 = r0.C(r2, r1)
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.e.D(java.lang.Exception, int):java.lang.Exception");
    }

    public void D0(double d10, int i10) {
        i0(i10);
        C0(d10);
    }

    public final int E() {
        return L();
    }

    public void E0(double[] dArr) {
        if (dArr != null) {
            L0(r0);
            for (double C0 : dArr) {
                C0(C0);
            }
            return;
        }
        L0(-1);
    }

    public abstract boolean F(int i10);

    public void F0(double[] dArr, int i10) {
        i0(i10);
        E0(dArr);
    }

    public abstract float G();

    public void G0(Exception exc, int i10) {
        i0(i10);
        if (exc == null) {
            V0();
            return;
        }
        int i11 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i11 = -9;
        } else if (exc instanceof SecurityException) {
            i11 = -1;
        } else if (exc instanceof BadParcelableException) {
            i11 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i11 = -3;
        } else if (exc instanceof NullPointerException) {
            i11 = -4;
        } else if (exc instanceof IllegalStateException) {
            i11 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i11 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i11 = -7;
        }
        L0(i11);
        if (i11 != 0) {
            e1(exc.getMessage());
            if (i11 == -9) {
                W0((Parcelable) exc);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    public float H(float f10, int i10) {
        return !F(i10) ? f10 : G();
    }

    public abstract void H0(float f10);

    public float[] I() {
        int L = L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i10 = 0; i10 < L; i10++) {
            fArr[i10] = G();
        }
        return fArr;
    }

    public void I0(float f10, int i10) {
        i0(i10);
        H0(f10);
    }

    public float[] J(float[] fArr, int i10) {
        return !F(i10) ? fArr : I();
    }

    public void J0(float[] fArr) {
        if (fArr != null) {
            L0(r0);
            for (float H0 : fArr) {
                H0(H0);
            }
            return;
        }
        L0(-1);
    }

    public <T extends h> T K(String str, e eVar) {
        try {
            return (h) e(str).invoke((Object) null, new Object[]{eVar});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public void K0(float[] fArr, int i10) {
        i0(i10);
        J0(fArr);
    }

    public abstract int L();

    public abstract void L0(int i10);

    public int M(int i10, int i11) {
        return !F(i11) ? i10 : L();
    }

    public void M0(int i10, int i11) {
        i0(i11);
        L0(i10);
    }

    public int[] N() {
        int L = L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i10 = 0; i10 < L; i10++) {
            iArr[i10] = L();
        }
        return iArr;
    }

    public void N0(int[] iArr) {
        if (iArr != null) {
            L0(r0);
            for (int L0 : iArr) {
                L0(L0);
            }
            return;
        }
        L0(-1);
    }

    public int[] O(int[] iArr, int i10) {
        return !F(i10) ? iArr : N();
    }

    public void O0(int[] iArr, int i10) {
        i0(i10);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i10) {
        return !F(i10) ? list : (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i10) {
        B0(list, i10);
    }

    public abstract long Q();

    public abstract void Q0(long j10);

    public long R(long j10, int i10) {
        return !F(i10) ? j10 : Q();
    }

    public void R0(long j10, int i10) {
        i0(i10);
        Q0(j10);
    }

    public long[] S() {
        int L = L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i10 = 0; i10 < L; i10++) {
            jArr[i10] = Q();
        }
        return jArr;
    }

    public void S0(long[] jArr) {
        if (jArr != null) {
            L0(r0);
            for (long Q0 : jArr) {
                Q0(Q0);
            }
            return;
        }
        L0(-1);
    }

    public long[] T(long[] jArr, int i10) {
        return !F(i10) ? jArr : S();
    }

    public void T0(long[] jArr, int i10) {
        i0(i10);
        S0(jArr);
    }

    public <K, V> Map<K, V> U(Map<K, V> map, int i10) {
        if (!F(i10)) {
            return map;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        androidx.collection.a aVar = new androidx.collection.a();
        if (L == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x(arrayList);
        x(arrayList2);
        for (int i11 = 0; i11 < L; i11++) {
            aVar.put(arrayList.get(i11), arrayList2.get(i11));
        }
        return aVar;
    }

    public <K, V> void U0(Map<K, V> map, int i10) {
        i0(i10);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(next.getKey());
                arrayList2.add(next.getValue());
            }
            A0(arrayList);
            A0(arrayList2);
        }
    }

    public abstract <T extends Parcelable> T V();

    public void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t10, int i10) {
        return !F(i10) ? t10 : V();
    }

    public abstract void W0(Parcelable parcelable);

    public Serializable X() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + c02 + ")", e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + c02 + ")", e11);
        }
    }

    public void X0(Parcelable parcelable, int i10) {
        i0(i10);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i10) {
        return !F(i10) ? set : (Set) x(new androidx.collection.b());
    }

    public final void Y0(Serializable serializable) {
        if (serializable == null) {
            e1((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e10);
        }
    }

    @t0(api = 21)
    public Size Z(Size size, int i10) {
        if (!F(i10)) {
            return size;
        }
        if (l()) {
            return new Size(L(), L());
        }
        return null;
    }

    public void Z0(Serializable serializable, int i10) {
        i0(i10);
        Y0(serializable);
    }

    public abstract void a();

    @t0(api = 21)
    public SizeF a0(SizeF sizeF, int i10) {
        if (!F(i10)) {
            return sizeF;
        }
        if (l()) {
            return new SizeF(G(), G());
        }
        return null;
    }

    public <T> void a1(Set<T> set, int i10) {
        B0(set, i10);
    }

    public final Exception b(int i10, String str) {
        switch (i10) {
            case f9942l /*-9*/:
                return (Exception) V();
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
            default:
                return new RuntimeException("Unknown exception code: " + i10 + " msg " + str);
        }
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i10) {
        if (!F(i10)) {
            return sparseBooleanArray;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
        for (int i11 = 0; i11 < L; i11++) {
            sparseBooleanArray2.put(L(), l());
        }
        return sparseBooleanArray2;
    }

    @t0(api = 21)
    public void b1(Size size, int i10) {
        i0(i10);
        m0(size != null);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    public abstract e c();

    public abstract String c0();

    @t0(api = 21)
    public void c1(SizeF sizeF, int i10) {
        i0(i10);
        m0(sizeF != null);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public final Class d(Class<? extends h> cls) throws ClassNotFoundException {
        Class cls2 = this.f9952c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f9952c.put(cls.getName(), cls3);
        return cls3;
    }

    public String d0(String str, int i10) {
        return !F(i10) ? str : c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i10) {
        i0(i10);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i11 = 0; i11 < size; i11++) {
            L0(sparseBooleanArray.keyAt(i11));
            m0(sparseBooleanArray.valueAt(i11));
        }
    }

    public final Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<e> cls = e.class;
        Method method = this.f9950a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f9950a.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract IBinder e0();

    public abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i10) {
        return !F(i10) ? iBinder : e0();
    }

    public void f1(String str, int i10) {
        i0(i10);
        e1(str);
    }

    public final <T> int g(T t10) {
        if (t10 instanceof String) {
            return 4;
        }
        if (t10 instanceof Parcelable) {
            return 2;
        }
        if (t10 instanceof h) {
            return 1;
        }
        if (t10 instanceof Serializable) {
            return 3;
        }
        if (t10 instanceof IBinder) {
            return 5;
        }
        if (t10 instanceof Integer) {
            return 7;
        }
        if (t10 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t10.getClass().getName() + " cannot be VersionedParcelled");
    }

    public <T extends h> T g0() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        return K(c02, c());
    }

    public abstract void g1(IBinder iBinder);

    public final Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f9951b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class d10 = d(cls);
        System.currentTimeMillis();
        Method declaredMethod = d10.getDeclaredMethod("write", new Class[]{cls, e.class});
        this.f9951b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public <T extends h> T h0(T t10, int i10) {
        return !F(i10) ? t10 : g0();
    }

    public void h1(IBinder iBinder, int i10) {
        i0(i10);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    public abstract void i0(int i10);

    public abstract void i1(IInterface iInterface);

    public <T> T[] j(T[] tArr) {
        int L = L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    arrayList.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    arrayList.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    arrayList.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    arrayList.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    arrayList.add(e0());
                    L--;
                }
            }
        }
        return arrayList.toArray(tArr);
    }

    public void j0(boolean z10, boolean z11) {
    }

    public void j1(IInterface iInterface, int i10) {
        i0(i10);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i10) {
        return !F(i10) ? tArr : j(tArr);
    }

    public <T> void k0(T[] tArr) {
        if (tArr == null) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i10 = 0;
            int g10 = g(tArr[0]);
            L0(g10);
            if (g10 == 1) {
                while (i10 < length) {
                    l1((h) tArr[i10]);
                    i10++;
                }
            } else if (g10 == 2) {
                while (i10 < length) {
                    W0((Parcelable) tArr[i10]);
                    i10++;
                }
            } else if (g10 == 3) {
                while (i10 < length) {
                    Y0((Serializable) tArr[i10]);
                    i10++;
                }
            } else if (g10 == 4) {
                while (i10 < length) {
                    e1((String) tArr[i10]);
                    i10++;
                }
            } else if (g10 == 5) {
                while (i10 < length) {
                    g1((IBinder) tArr[i10]);
                    i10++;
                }
            }
        }
    }

    public <T extends h> void k1(T t10, e eVar) {
        try {
            h(t10.getClass()).invoke((Object) null, new Object[]{t10, eVar});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract boolean l();

    public <T> void l0(T[] tArr, int i10) {
        i0(i10);
        k0(tArr);
    }

    public void l1(h hVar) {
        if (hVar == null) {
            e1((String) null);
            return;
        }
        n1(hVar);
        e c10 = c();
        k1(hVar, c10);
        c10.a();
    }

    public boolean m(boolean z10, int i10) {
        return !F(i10) ? z10 : l();
    }

    public abstract void m0(boolean z10);

    public void m1(h hVar, int i10) {
        i0(i10);
        l1(hVar);
    }

    public boolean[] n() {
        int L = L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i10 = 0; i10 < L; i10++) {
            zArr[i10] = L() != 0;
        }
        return zArr;
    }

    public void n0(boolean z10, int i10) {
        i0(i10);
        m0(z10);
    }

    public final void n1(h hVar) {
        try {
            e1(d(hVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(hVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    public boolean[] o(boolean[] zArr, int i10) {
        return !F(i10) ? zArr : n();
    }

    public void o0(boolean[] zArr) {
        if (zArr != null) {
            L0(r0);
            for (boolean z10 : zArr) {
                L0(z10 ? 1 : 0);
            }
            return;
        }
        L0(-1);
    }

    public abstract Bundle p();

    public void p0(boolean[] zArr, int i10) {
        i0(i10);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i10) {
        return !F(i10) ? bundle : p();
    }

    public abstract void q0(Bundle bundle);

    public byte r(byte b10, int i10) {
        return !F(i10) ? b10 : (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i10) {
        i0(i10);
        q0(bundle);
    }

    public abstract byte[] s();

    public void s0(byte b10, int i10) {
        i0(i10);
        L0(b10);
    }

    public byte[] t(byte[] bArr, int i10) {
        return !F(i10) ? bArr : s();
    }

    public abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i10) {
        if (!F(i10)) {
            return cArr;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        char[] cArr2 = new char[L];
        for (int i11 = 0; i11 < L; i11++) {
            cArr2[i11] = (char) L();
        }
        return cArr2;
    }

    public void u0(byte[] bArr, int i10) {
        i0(i10);
        t0(bArr);
    }

    public abstract CharSequence v();

    public abstract void v0(byte[] bArr, int i10, int i11);

    public CharSequence w(CharSequence charSequence, int i10) {
        return !F(i10) ? charSequence : v();
    }

    public void w0(byte[] bArr, int i10, int i11, int i12) {
        i0(i12);
        v0(bArr, i10, i11);
    }

    public final <T, S extends Collection<T>> S x(S s10) {
        int L = L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    s10.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    s10.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    s10.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    s10.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    s10.add(e0());
                    L--;
                }
            }
        }
        return s10;
    }

    public void x0(char[] cArr, int i10) {
        i0(i10);
        if (cArr != null) {
            L0(r4);
            for (char L0 : cArr) {
                L0(L0);
            }
            return;
        }
        L0(-1);
    }

    public abstract double y();

    public abstract void y0(CharSequence charSequence);

    public double z(double d10, int i10) {
        return !F(i10) ? d10 : y();
    }

    public void z0(CharSequence charSequence, int i10) {
        i0(i10);
        y0(charSequence);
    }
}
