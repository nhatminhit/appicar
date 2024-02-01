package a6;

import java.lang.reflect.Array;
import java.util.List;

public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static final int f259e = 16384;

    /* renamed from: f  reason: collision with root package name */
    public static final int f260f = 262144;

    /* renamed from: a  reason: collision with root package name */
    public r<Object[]> f261a;

    /* renamed from: b  reason: collision with root package name */
    public r<Object[]> f262b;

    /* renamed from: c  reason: collision with root package name */
    public int f263c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f264d;

    public final void a(Object obj, int i10, Object[] objArr, int i11) {
        int i12 = 0;
        for (r<Object[]> rVar = this.f261a; rVar != null; rVar = rVar.c()) {
            Object[] d10 = rVar.d();
            int length = d10.length;
            System.arraycopy(d10, 0, obj, i12, length);
            i12 += length;
        }
        System.arraycopy(objArr, 0, obj, i12, i11);
        int i13 = i12 + i11;
        if (i13 != i10) {
            throw new IllegalStateException("Should have gotten " + i10 + " entries, got " + i13);
        }
    }

    public void b() {
        r<Object[]> rVar = this.f262b;
        if (rVar != null) {
            this.f264d = rVar.d();
        }
        this.f262b = null;
        this.f261a = null;
        this.f263c = 0;
    }

    public Object[] c(Object[] objArr) {
        r<Object[]> rVar = new r<>(objArr, (r) null);
        if (this.f261a == null) {
            this.f262b = rVar;
            this.f261a = rVar;
        } else {
            this.f262b.b(rVar);
            this.f262b = rVar;
        }
        int length = objArr.length;
        this.f263c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int d() {
        return this.f263c;
    }

    public void e(Object[] objArr, int i10, List<Object> list) {
        int i11;
        r<Object[]> rVar = this.f261a;
        while (true) {
            i11 = 0;
            if (rVar == null) {
                break;
            }
            Object[] d10 = rVar.d();
            int length = d10.length;
            while (i11 < length) {
                list.add(d10[i11]);
                i11++;
            }
            rVar = rVar.c();
        }
        while (i11 < i10) {
            list.add(objArr[i11]);
            i11++;
        }
        b();
    }

    public Object[] f(Object[] objArr, int i10) {
        int i11 = this.f263c + i10;
        Object[] objArr2 = new Object[i11];
        a(objArr2, i11, objArr, i10);
        b();
        return objArr2;
    }

    public <T> T[] g(Object[] objArr, int i10, Class<T> cls) {
        int i11 = this.f263c + i10;
        T[] tArr = (Object[]) Array.newInstance(cls, i11);
        a(tArr, i11, objArr, i10);
        b();
        return tArr;
    }

    public int h() {
        Object[] objArr = this.f264d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] i() {
        b();
        Object[] objArr = this.f264d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f264d = objArr2;
        return objArr2;
    }

    public Object[] j(Object[] objArr, int i10) {
        b();
        Object[] objArr2 = this.f264d;
        if (objArr2 == null || objArr2.length < i10) {
            this.f264d = new Object[Math.max(12, i10)];
        }
        System.arraycopy(objArr, 0, this.f264d, 0, i10);
        return this.f264d;
    }
}
