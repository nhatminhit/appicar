package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class x {
    public void a(Context context) {
        AppDatabaseChannel.M(context).Q().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).Q().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).Q().d();
    }

    public void d(u uVar, Context context) {
        AppDatabaseChannel.M(context).Q().c(uVar);
    }
}
