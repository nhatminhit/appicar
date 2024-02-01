package com.tatv.baseapp.view.dialog;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tatv.baseapp.a;
import d.m0;
import kd.d;
import nc.c;

public class ErrorDialog extends BaseDialog<c> {
    public static ErrorDialog W;
    public a Q;
    public String R;
    public String S;
    public String T;
    public boolean U = false;
    public boolean V = false;

    public interface a {
        void l(ErrorDialog errorDialog);

        void v(ErrorDialog errorDialog);
    }

    public ErrorDialog(@m0 Context context, a aVar) {
        super(context);
        this.Q = aVar;
    }

    public static ErrorDialog h(Context context, a aVar) {
        if (W == null) {
            W = new ErrorDialog(context, aVar);
        }
        return W;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.v(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.l(this);
        }
        id.c.a(view);
    }

    public int a() {
        return a.l.dialog_error_message;
    }

    public void b() {
        ((c) this.P).f21217t0.setOnClickListener(new kd.c(this));
        ((c) this.P).f21218u0.setOnClickListener(new d(this));
    }

    public void c() {
        int i10;
        TextView textView;
        super.c();
        if (this.V) {
            ((c) this.P).f21222y0.setBackground(i0.d.i(this.O, a.g.bg_popup_white));
            ((c) this.P).f21221x0.setTextColor(-16777216);
            ((c) this.P).f21220w0.setTextColor(-16777216);
            ((c) this.P).f21217t0.setTextColor(-16777216);
            ((c) this.P).f21218u0.setTextColor(Color.parseColor("#FF5722"));
        }
        String str = this.R;
        if (str != null && !str.equals("")) {
            ((c) this.P).f21221x0.setText(this.R);
        }
        String str2 = this.T;
        if (str2 != null && !str2.equals("")) {
            ((c) this.P).f21218u0.setText(this.T);
        }
        ((c) this.P).f21220w0.setText(this.S);
        if (this.U) {
            textView = ((c) this.P).f21217t0;
            i10 = 0;
        } else {
            textView = ((c) this.P).f21217t0;
            i10 = 8;
        }
        textView.setVisibility(i10);
    }

    public ErrorDialog g(boolean z10) {
        this.V = z10;
        return this;
    }

    public ErrorDialog k(String str) {
        this.S = str;
        return this;
    }

    public ErrorDialog l(String str) {
        this.T = str;
        return this;
    }

    public ErrorDialog m(String str) {
        this.R = str;
        return this;
    }

    public ErrorDialog n(boolean z10) {
        this.U = z10;
        return this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }
}
