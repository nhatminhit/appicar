package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class f0 {
    public void a(Context context) {
        AppDatabaseChannel.M(context).S().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).S().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).S().c();
    }

    public void d(c0 c0Var, Context context) {
        AppDatabaseChannel.M(context).S().d(c0Var);
    }
}
