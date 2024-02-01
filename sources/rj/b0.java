package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class b0 {
    public void a(Context context) {
        AppDatabaseChannel.M(context).R().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).R().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).R().c();
    }

    public void d(y yVar, Context context) {
        AppDatabaseChannel.M(context).R().d(yVar);
    }
}
