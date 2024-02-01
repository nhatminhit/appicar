package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class j0 {
    public void a(Context context) {
        AppDatabaseChannel.M(context).T().a();
    }

    public void b(String str, String str2, Context context) {
        AppDatabaseChannel.M(context).T().b(str, str2);
    }

    public List<g0> c(Context context) {
        return AppDatabaseChannel.M(context).T().d();
    }

    public void d(g0 g0Var, Context context) {
        AppDatabaseChannel.M(context).T().c(g0Var);
    }
}
