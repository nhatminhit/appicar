package vn.icar.entertaiment.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;
import d.m0;
import sj.f;
import ui.a;
import vn.icar.entertaiment.R;

public class UpdateDialog extends Dialog {
    public Context O;
    public ProgressBar P;

    public UpdateDialog(@m0 Context context) {
        super(context);
        this.O = context;
    }

    public final void a() {
        getWindow().setBackgroundDrawableResource(R.drawable.bg_transparent);
        getWindow().setLayout(-1, -1);
        setCancelable(false);
        this.P = (ProgressBar) findViewById(R.id.progress_bar);
        if (a.b().J == null || !a.b().J.b().equals("")) {
            f.h(this.O, a.b().J.b(), "iCarE", this.P, this);
        } else {
            Toast.makeText(this.O, R.string.link_not_found, 0);
        }
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_update);
        a();
    }
}
