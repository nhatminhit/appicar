package g8;

import android.app.Dialog;

public final class p2 extends f1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f8256a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q2 f8257b;

    public p2(q2 q2Var, Dialog dialog) {
        this.f8257b = q2Var;
        this.f8256a = dialog;
    }

    public final void a() {
        this.f8257b.P.p();
        if (this.f8256a.isShowing()) {
            this.f8256a.dismiss();
        }
    }
}
