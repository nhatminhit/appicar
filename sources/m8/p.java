package m8;

import android.content.Context;
import b9.f;
import com.google.android.gms.common.internal.TelemetryData;
import f8.a;
import f8.j;
import g8.q;
import h9.m;
import j8.a0;
import j8.z;

public final class p extends j implements z {

    /* renamed from: m  reason: collision with root package name */
    public static final a.g f10656m;

    /* renamed from: n  reason: collision with root package name */
    public static final a.C0126a f10657n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f10658o;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f10659p = 0;

    static {
        a.g gVar = new a.g();
        f10656m = gVar;
        o oVar = new o();
        f10657n = oVar;
        f10658o = new a("ClientTelemetry.API", oVar, gVar);
    }

    public p(Context context, a0 a0Var) {
        super(context, f10658o, a0Var, j.a.f7467c);
    }

    public final m<Void> g(TelemetryData telemetryData) {
        q.a a10 = q.a();
        a10.e(f.f4745a);
        a10.d(false);
        a10.c(new n(telemetryData));
        return M(a10.a());
    }
}
