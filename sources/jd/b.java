package jd;

import com.tatv.baseapp.view.activity.BaseFragment;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ BaseFragment O;
    public final /* synthetic */ String P;

    public /* synthetic */ b(BaseFragment baseFragment, String str) {
        this.O = baseFragment;
        this.P = str;
    }

    public final void run() {
        this.O.M0(this.P);
    }
}
