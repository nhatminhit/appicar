package vn.icar.entertaiment.app;

import cd.b;
import com.tatv.baseapp.application.BaseApplication;
import ej.a;
import vc.c;
import vn.icar.entertaiment.view.widget.BaseAppWidgetProvider;

public class App extends BaseApplication {
    public void onCreate() {
        super.onCreate();
        c.g().k(a());
        ad.c.n().s(a(), "icar/icarE");
        BaseAppWidgetProvider.h(a());
        a.b();
        if (new b(this).k()) {
            oj.c.v(a());
        }
    }
}
