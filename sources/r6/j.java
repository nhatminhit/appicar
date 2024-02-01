package r6;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import i7.d;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r6.h0;
import w7.s;
import w7.w;

public final class j implements h0.c {

    /* renamed from: c  reason: collision with root package name */
    public static final int f12296c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12297d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12298e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f12299f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final int f12300g = 16;

    /* renamed from: h  reason: collision with root package name */
    public static final int f12301h = 32;

    /* renamed from: i  reason: collision with root package name */
    public static final int f12302i = 64;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12303j = 134;

    /* renamed from: a  reason: collision with root package name */
    public final int f12304a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Format> f12305b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j() {
        this(0);
    }

    public j(int i10) {
        this(i10, Collections.singletonList(Format.z((String) null, s.f14800a0, 0, (String) null)));
    }

    public j(int i10, List<Format> list) {
        this.f12304a = i10;
        this.f12305b = list;
    }

    public SparseArray<h0> a() {
        return new SparseArray<>();
    }

    public h0 b(int i10, h0.b bVar) {
        if (i10 == 2) {
            return new u(new n(d(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new u(new s(bVar.f12261b));
        }
        if (i10 != 15) {
            if (i10 != 17) {
                if (i10 == 21) {
                    return new u(new q());
                }
                if (i10 != 27) {
                    if (i10 == 36) {
                        return new u(new p(c(bVar)));
                    }
                    if (i10 == 89) {
                        return new u(new l(bVar.f12262c));
                    }
                    if (i10 != 138) {
                        if (i10 == 172) {
                            return new u(new f(bVar.f12261b));
                        }
                        if (i10 != 129) {
                            if (i10 != 130) {
                                if (i10 != 134) {
                                    if (i10 != 135) {
                                        return null;
                                    }
                                } else if (f(16)) {
                                    return null;
                                } else {
                                    return new a0(new c0());
                                }
                            } else if (!f(64)) {
                                return null;
                            }
                        }
                        return new u(new c(bVar.f12261b));
                    }
                    return new u(new k(bVar.f12261b));
                } else if (f(4)) {
                    return null;
                } else {
                    return new u(new o(c(bVar), f(1), f(8)));
                }
            } else if (f(2)) {
                return null;
            } else {
                return new u(new r(bVar.f12261b));
            }
        } else if (f(2)) {
            return null;
        } else {
            return new u(new i(false, bVar.f12261b));
        }
    }

    public final b0 c(h0.b bVar) {
        return new b0(e(bVar));
    }

    public final j0 d(h0.b bVar) {
        return new j0(e(bVar));
    }

    public final List<Format> e(h0.b bVar) {
        int i10;
        String str;
        List<byte[]> list;
        if (f(32)) {
            return this.f12305b;
        }
        w wVar = new w(bVar.f12263d);
        List<Format> list2 = this.f12305b;
        while (wVar.a() > 0) {
            int D = wVar.D();
            int c10 = wVar.c() + wVar.D();
            if (D == 134) {
                list2 = new ArrayList<>();
                int D2 = wVar.D() & 31;
                for (int i11 = 0; i11 < D2; i11++) {
                    String A = wVar.A(3);
                    int D3 = wVar.D();
                    boolean z10 = true;
                    boolean z11 = (D3 & 128) != 0;
                    if (z11) {
                        i10 = D3 & 63;
                        str = s.f14802b0;
                    } else {
                        str = s.f14800a0;
                        i10 = 1;
                    }
                    byte D4 = (byte) wVar.D();
                    wVar.R(1);
                    if (z11) {
                        if ((D4 & 64) == 0) {
                            z10 = false;
                        }
                        list = d.a(z10);
                    } else {
                        list = null;
                    }
                    list2.add(Format.C((String) null, str, (String) null, -1, 0, A, i10, (DrmInitData) null, Long.MAX_VALUE, list));
                }
            }
            wVar.Q(c10);
        }
        return list2;
    }

    public final boolean f(int i10) {
        return (i10 & this.f12304a) != 0;
    }
}
