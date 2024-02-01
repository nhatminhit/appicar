package ph;

import android.content.Context;
import java.io.File;

public class e {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, f fVar);
    }

    public interface b {
        String a(String str);

        void b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    public interface c {
        void a();

        void b(Throwable th2);
    }

    public interface d {
        void a(String str);
    }

    public static f a() {
        return new f().c();
    }

    public static void b(Context context, String str) {
        d(context, str, (String) null, (c) null);
    }

    public static void c(Context context, String str, String str2) {
        d(context, str, str2, (c) null);
    }

    public static void d(Context context, String str, String str2, c cVar) {
        new f().h(context, str, str2, cVar);
    }

    public static void e(Context context, String str, c cVar) {
        d(context, str, (String) null, cVar);
    }

    public static f f(d dVar) {
        return new f().k(dVar);
    }

    public static f g() {
        return new f().n();
    }
}
