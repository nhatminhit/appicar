package androidx.recyclerview.widget;

import android.view.View;
import b1.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f3446c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3447d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3448e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f3449f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f3450g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f3451h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f3452i = 4;

    /* renamed from: j  reason: collision with root package name */
    public static final int f3453j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f3454k = 16;

    /* renamed from: l  reason: collision with root package name */
    public static final int f3455l = 32;

    /* renamed from: m  reason: collision with root package name */
    public static final int f3456m = 64;

    /* renamed from: n  reason: collision with root package name */
    public static final int f3457n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final int f3458o = 256;

    /* renamed from: p  reason: collision with root package name */
    public static final int f3459p = 512;

    /* renamed from: q  reason: collision with root package name */
    public static final int f3460q = 1024;

    /* renamed from: r  reason: collision with root package name */
    public static final int f3461r = 12;

    /* renamed from: s  reason: collision with root package name */
    public static final int f3462s = 4096;

    /* renamed from: t  reason: collision with root package name */
    public static final int f3463t = 8192;

    /* renamed from: u  reason: collision with root package name */
    public static final int f3464u = 16384;

    /* renamed from: v  reason: collision with root package name */
    public static final int f3465v = 7;

    /* renamed from: a  reason: collision with root package name */
    public final b f3466a;

    /* renamed from: b  reason: collision with root package name */
    public a f3467b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3468a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f3469b;

        /* renamed from: c  reason: collision with root package name */
        public int f3470c;

        /* renamed from: d  reason: collision with root package name */
        public int f3471d;

        /* renamed from: e  reason: collision with root package name */
        public int f3472e;

        public void a(int i10) {
            this.f3468a = i10 | this.f3468a;
        }

        public boolean b() {
            int i10 = this.f3468a;
            if ((i10 & 7) != 0 && (i10 & (c(this.f3471d, this.f3469b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f3468a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3471d, this.f3470c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3468a;
            if ((i12 & a.b.f4057f) != 0 && (i12 & (c(this.f3472e, this.f3469b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3468a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3472e, this.f3470c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f3468a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f3469b = i10;
            this.f3470c = i11;
            this.f3471d = i12;
            this.f3472e = i13;
        }
    }

    public interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public g0(b bVar) {
        this.f3466a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f3466a.c();
        int d10 = this.f3466a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f3466a.a(i10);
            this.f3467b.e(c10, d10, this.f3466a.b(a10), this.f3466a.e(a10));
            if (i12 != 0) {
                this.f3467b.d();
                this.f3467b.a(i12);
                if (this.f3467b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f3467b.d();
                this.f3467b.a(i13);
                if (this.f3467b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f3467b.e(this.f3466a.c(), this.f3466a.d(), this.f3466a.b(view), this.f3466a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f3467b.d();
        this.f3467b.a(i10);
        return this.f3467b.b();
    }
}
