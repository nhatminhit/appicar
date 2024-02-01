package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class l {
    public void a(Context context) {
        AppDatabaseChannel.M(context).N().a();
    }

    public void b(String str, Context context) {
        AppDatabaseChannel.M(context).N().b(str);
    }

    public List<String> c(Context context) {
        return AppDatabaseChannel.M(context).N().c();
    }

    public void d(i iVar, Context context) {
        AppDatabaseChannel.M(context).N().d(iVar);
    }
}
