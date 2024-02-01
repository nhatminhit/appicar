package jd;

import com.tatv.baseapp.view.activity.BaseActivity;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ BaseActivity O;
    public final /* synthetic */ String P;

    public /* synthetic */ a(BaseActivity baseActivity, String str) {
        this.O = baseActivity;
        this.P = str;
    }

    public final void run() {
        this.O.Q0(this.P);
    }
}
