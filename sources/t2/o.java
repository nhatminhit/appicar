package t2;

import d.m0;
import d.o0;
import e1.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class o<K> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f12888b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12889c = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f12890a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public o(int i10) {
        boolean z10 = true;
        if (!(i10 == 0 || i10 == 1)) {
            z10 = false;
        }
        n.a(z10);
        this.f12890a = i10;
    }

    @o0
    public abstract K a(int i10);

    public abstract int b(@m0 K k10);

    public final boolean c(int i10) {
        return i10 == this.f12890a;
    }
}
