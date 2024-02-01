package xe;

import androidx.lifecycle.n0;
import be.s0;
import fh.g;
import gf.m;

public abstract class c1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f24519a;

    /* renamed from: b  reason: collision with root package name */
    public int f24520b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final T[] f24521c;

    public c1(int i10) {
        this.f24519a = i10;
        this.f24521c = new Object[i10];
    }

    public static /* synthetic */ void d() {
    }

    public final void a(@g T t10) {
        l0.p(t10, "spreadArgument");
        T[] tArr = this.f24521c;
        int i10 = this.f24520b;
        this.f24520b = i10 + 1;
        tArr[i10] = t10;
    }

    public final int b() {
        return this.f24520b;
    }

    public abstract int c(@g T t10);

    public final void e(int i10) {
        this.f24520b = i10;
    }

    public final int f() {
        int i10 = 0;
        s0 o10 = new m(0, this.f24519a - 1).iterator();
        while (o10.hasNext()) {
            T t10 = this.f24521c[o10.nextInt()];
            i10 += t10 != null ? c(t10) : 1;
        }
        return i10;
    }

    @g
    public final T g(@g T t10, @g T t11) {
        l0.p(t10, n0.f2813g);
        l0.p(t11, "result");
        s0 o10 = new m(0, this.f24519a - 1).iterator();
        int i10 = 0;
        int i11 = 0;
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            T t12 = this.f24521c[nextInt];
            if (t12 != null) {
                if (i10 < nextInt) {
                    int i12 = nextInt - i10;
                    System.arraycopy(t10, i10, t11, i11, i12);
                    i11 += i12;
                }
                int c10 = c(t12);
                System.arraycopy(t12, 0, t11, i11, c10);
                i11 += c10;
                i10 = nextInt + 1;
            }
        }
        int i13 = this.f24519a;
        if (i10 < i13) {
            System.arraycopy(t10, i10, t11, i11, i13 - i10);
        }
        return t11;
    }
}
