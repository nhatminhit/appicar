package com.tatv.baseapp.view.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tatv.baseapp.a;
import d.m0;
import id.c;
import kd.b;

public class ConfirmDialog extends BaseDialog<nc.a> {
    public static ConfirmDialog U;
    public a Q;
    public String R;
    public String S;
    public int T;

    public interface a {
        void a(ConfirmDialog confirmDialog);

        void b(ConfirmDialog confirmDialog);
    }

    public ConfirmDialog(@m0 Context context, a aVar) {
        super(context);
        this.Q = aVar;
        this.T = context.getColor(a.e.orange);
    }

    public static ConfirmDialog g(Context context, a aVar) {
        if (U == null) {
            U = new ConfirmDialog(context, aVar);
        }
        return U;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.b(this);
        }
        c.a(view);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public int a() {
        return a.l.dialog_confirm;
    }

    public void b() {
        ((nc.a) this.P).f21213w0.setOnClickListener(new kd.a(this));
        ((nc.a) this.P).f21212v0.setOnClickListener(new b(this));
    }

    public void c() {
        super.c();
        ((nc.a) this.P).f21215y0.setText(this.R);
        ((nc.a) this.P).f21214x0.setText(this.S);
        ((nc.a) this.P).f21210t0.setBackgroundColor(this.T);
    }

    public ConfirmDialog j(int i10) {
        this.T = i10;
        return this;
    }

    public ConfirmDialog k(String str) {
        this.S = str;
        return this;
    }

    public ConfirmDialog l(String str) {
        this.R = str;
        return this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }
}
