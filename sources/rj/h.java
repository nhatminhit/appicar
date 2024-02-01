package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class h {
    public void a(Context context) {
        AppDatabaseChannel.M(context).L().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).L().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).L().c();
    }

    public void d(e eVar, Context context) {
        AppDatabaseChannel.M(context).L().d(eVar);
    }
}
