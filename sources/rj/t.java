package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class t {
    public void a(Context context) {
        AppDatabaseChannel.M(context).P().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).P().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).P().c();
    }

    public void d(q qVar, Context context) {
        AppDatabaseChannel.M(context).P().d(qVar);
    }
}
