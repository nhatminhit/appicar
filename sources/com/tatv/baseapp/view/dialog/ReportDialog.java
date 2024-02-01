package com.tatv.baseapp.view.dialog;

import android.content.Context;
import com.tatv.baseapp.a;
import d.m0;
import nc.g;

public class ReportDialog extends BaseDialog<g> {
    public ReportDialog(@m0 Context context) {
        super(context);
        setCancelable(false);
    }

    public int a() {
        return a.l.dialog_report;
    }

    public void b() {
    }

    public void e(String str) {
        ((g) this.P).f21232u0.setText(str);
    }
}
