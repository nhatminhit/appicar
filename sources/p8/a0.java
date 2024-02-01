package p8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import b9.v;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import f8.a;
import f8.j;
import f8.m;
import g8.q;
import h9.p;
import j8.s;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o8.c;
import o8.d;

public final class a0 extends j implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final a.g f11732m;

    /* renamed from: n  reason: collision with root package name */
    public static final a.C0126a f11733n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f11734o;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f11735p = 0;

    static {
        a.g gVar = new a.g();
        f11732m = gVar;
        s sVar = new s();
        f11733n = sVar;
        f11734o = new a("ModuleInstall.API", sVar, gVar);
    }

    public a0(Activity activity) {
        super(activity, f11734o, a.d.f7423w, j.a.f7467c);
    }

    public a0(Context context) {
        super(context, f11734o, a.d.f7423w, j.a.f7467c);
    }

    public static final ApiFeatureRequest g0(boolean z10, m... mVarArr) {
        s.m(mVarArr, "Requested APIs must not be null.");
        s.b(r0 > 0, "Please provide at least one OptionalModuleApi.");
        for (m m10 : mVarArr) {
            s.m(m10, "Requested API must not be null.");
        }
        return ApiFeatureRequest.f1(Arrays.asList(mVarArr), z10);
    }

    public final h9.m<Void> F(m... mVarArr) {
        ApiFeatureRequest g02 = g0(false, mVarArr);
        if (g02.Z0().isEmpty()) {
            return p.g(null);
        }
        q.a a10 = q.a();
        a10.e(v.f4757a);
        a10.f(27303);
        a10.d(false);
        a10.c(new n(this, g02));
        return O(a10.a());
    }

    public final h9.m<ModuleInstallIntentResponse> H(m... mVarArr) {
        ApiFeatureRequest g02 = g0(true, mVarArr);
        if (g02.Z0().isEmpty()) {
            return p.g(new ModuleInstallIntentResponse((PendingIntent) null));
        }
        q.a a10 = q.a();
        a10.e(v.f4757a);
        a10.f(27307);
        a10.c(new o(this, g02));
        return O(a10.a());
    }

    public final h9.m<Void> j(m... mVarArr) {
        ApiFeatureRequest g02 = g0(false, mVarArr);
        if (g02.Z0().isEmpty()) {
            return p.g(null);
        }
        q.a a10 = q.a();
        a10.e(v.f4757a);
        a10.f(27302);
        a10.d(false);
        a10.c(new p(this, g02));
        return O(a10.a());
    }

    public final h9.m<Boolean> k(o8.a aVar) {
        return S(g.c(aVar, o8.a.class.getSimpleName()), 27306);
    }

    public final h9.m<ModuleAvailabilityResponse> m(m... mVarArr) {
        ApiFeatureRequest g02 = g0(false, mVarArr);
        if (g02.Z0().isEmpty()) {
            return p.g(new ModuleAvailabilityResponse(true, 0));
        }
        q.a a10 = q.a();
        a10.e(v.f4757a);
        a10.f(27301);
        a10.d(false);
        a10.c(new r(this, g02));
        return O(a10.a());
    }

    public final h9.m<ModuleInstallResponse> q(d dVar) {
        Class<o8.a> cls = o8.a.class;
        ApiFeatureRequest X0 = ApiFeatureRequest.X0(dVar);
        o8.a b10 = dVar.b();
        Executor c10 = dVar.c();
        boolean e10 = dVar.e();
        if (X0.Z0().isEmpty()) {
            return p.g(new ModuleInstallResponse(0));
        }
        if (b10 == null) {
            q.a a10 = q.a();
            a10.e(v.f4757a);
            a10.d(e10);
            a10.f(27304);
            a10.c(new q(this, X0));
            return O(a10.a());
        }
        s.l(b10);
        String simpleName = cls.getSimpleName();
        f a02 = c10 == null ? a0(b10, simpleName) : g.b(b10, c10, simpleName);
        c cVar = new c(a02);
        AtomicReference atomicReference = new AtomicReference();
        k kVar = new k(this, atomicReference, b10, X0, cVar);
        l lVar = new l(this, cVar);
        i.a a11 = i.a();
        a11.h(a02);
        a11.e(v.f4757a);
        a11.d(e10);
        a11.c(kVar);
        a11.g(lVar);
        a11.f(27305);
        return Q(a11.a()).w(new m(atomicReference));
    }
}
