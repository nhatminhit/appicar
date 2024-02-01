package rj;

import android.content.Context;
import java.util.List;
import vn.icar.entertaiment.room.channels.AppDatabaseChannel;

public class p {
    public void a(Context context) {
        AppDatabaseChannel.M(context).O().a();
    }

    public void b(String str, String str2, Context context) {
        AppDatabaseChannel.M(context).O().b(str, str2);
    }

    public List<m> c(Context context) {
        return AppDatabaseChannel.M(context).O().c();
    }

    public void d(m mVar, Context context) {
        AppDatabaseChannel.M(context).O().d(mVar);
    }
}
