package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class d {
    public void a(Context context) {
        AppDatabaseChannel.M(context).K().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).K().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).K().c();
    }

    public void d(a aVar, Context context) {
        AppDatabaseChannel.M(context).K().d(aVar);
    }
}
