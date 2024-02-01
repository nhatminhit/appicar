package h9;

import c9.a;

public final /* synthetic */ class u0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f8952a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f8953b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f8954c;

    public /* synthetic */ u0(a aVar, n nVar, x xVar) {
        this.f8952a = aVar;
        this.f8953b = nVar;
        this.f8954c = xVar;
    }

    public final void a(m mVar) {
        a aVar = this.f8952a;
        n nVar = this.f8953b;
        x xVar = this.f8954c;
        aVar.removeCallbacksAndMessages((Object) null);
        if (mVar.v()) {
            nVar.e(mVar.r());
        } else if (mVar.t()) {
            xVar.c();
        } else {
            Exception q10 = mVar.q();
            q10.getClass();
            nVar.d(q10);
        }
    }
}
