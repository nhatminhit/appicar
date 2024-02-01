package j8;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import d.m0;
import d.o0;
import d8.e;
import e8.a;
import f8.a;
import f8.k;
import g8.j;
import j8.d;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import w8.d0;

@a
public abstract class h<T extends IInterface> extends d<T> implements a.f, o0 {
    @o0
    public static volatile Executor B0;
    @o0
    public final Account A0;

    /* renamed from: y0  reason: collision with root package name */
    public final e f9764y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Set f9765z0;

    @e8.a
    @d0
    public h(@m0 Context context, @m0 Handler handler, int i10, @m0 e eVar) {
        super(context, handler, i.d(context), e.x(), i10, (d.a) null, (d.b) null);
        this.f9764y0 = (e) s.l(eVar);
        this.A0 = eVar.b();
        this.f9765z0 = t0(eVar.e());
    }

    @e8.a
    public h(@m0 Context context, @m0 Looper looper, int i10, @m0 e eVar) {
        this(context, looper, i.d(context), e.x(), i10, eVar, (g8.d) null, (j) null);
    }

    @e8.a
    @Deprecated
    public h(@m0 Context context, @m0 Looper looper, int i10, @m0 e eVar, @m0 k.b bVar, @m0 k.c cVar) {
        this(context, looper, i10, eVar, (g8.d) bVar, (j) cVar);
    }

    @e8.a
    public h(@m0 Context context, @m0 Looper looper, int i10, @m0 e eVar, @m0 g8.d dVar, @m0 j jVar) {
        this(context, looper, i.d(context), e.x(), i10, eVar, (g8.d) s.l(dVar), (j) s.l(jVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @w8.d0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(@d.m0 android.content.Context r11, @d.m0 android.os.Looper r12, @d.m0 j8.i r13, @d.m0 d8.e r14, int r15, @d.m0 j8.e r16, @d.o0 g8.d r17, @d.o0 g8.j r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            j8.m0 r3 = new j8.m0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            j8.n0 r0 = new j8.n0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.m()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f9764y0 = r0
            android.accounts.Account r1 = r16.b()
            r9.A0 = r1
            java.util.Set r0 = r16.e()
            java.util.Set r0 = r10.t0(r0)
            r9.f9765z0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.h.<init>(android.content.Context, android.os.Looper, j8.i, d8.e, int, j8.e, g8.d, g8.j):void");
    }

    @o0
    public final Account C() {
        return this.A0;
    }

    @o0
    public final Executor E() {
        return null;
    }

    @e8.a
    @m0
    public final Set<Scope> L() {
        return this.f9765z0;
    }

    @e8.a
    @m0
    public Set<Scope> h() {
        return v() ? this.f9765z0 : Collections.emptySet();
    }

    @e8.a
    @m0
    public Feature[] m() {
        return new Feature[0];
    }

    @e8.a
    @m0
    public final e r0() {
        return this.f9764y0;
    }

    @e8.a
    @m0
    public Set<Scope> s0(@m0 Set<Scope> set) {
        return set;
    }

    public final Set t0(@m0 Set set) {
        Set<Scope> s02 = s0(set);
        for (Scope contains : s02) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return s02;
    }
}
