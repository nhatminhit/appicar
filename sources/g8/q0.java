package g8;

import b8.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import d.m0;
import f8.k;
import f8.u;
import f8.v;

public final class q0 implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f8265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8266b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f8267c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f8268d;

    public q0(q qVar, p pVar, boolean z10, k kVar) {
        this.f8268d = qVar;
        this.f8265a = pVar;
        this.f8266b = z10;
        this.f8267c = kVar;
    }

    public final /* bridge */ /* synthetic */ void a(@m0 u uVar) {
        Status status = (Status) uVar;
        b.b(this.f8268d.f5714i).i();
        if (status.r1() && this.f8268d.u()) {
            q qVar = this.f8268d;
            qVar.i();
            qVar.g();
        }
        this.f8265a.o(status);
        if (this.f8266b) {
            this.f8267c.i();
        }
    }
}
