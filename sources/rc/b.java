package rc;

import com.tatv.baseapp.service.BaseService;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ BaseService O;
    public final /* synthetic */ String P;

    public /* synthetic */ b(BaseService baseService, String str) {
        this.O = baseService;
        this.P = str;
    }

    public final void run() {
        this.O.m(this.P);
    }
}
