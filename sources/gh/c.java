package gh;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import jh.f;
import kh.g;
import lh.a;
import lh.b;

public class c {
    public static String a(String str, String str2, b bVar) {
        return new a(bVar).c(o(str, str2)).u2().x1();
    }

    public static String b(String str, String str2, b bVar, f.a aVar) {
        f c10 = new a(bVar).c(o(str, str2));
        c10.J2(aVar);
        return c10.u2().x1();
    }

    public static String c(String str, b bVar) {
        return a(str, "", bVar);
    }

    public static a d(String str) {
        return hh.c.J(str);
    }

    public static boolean e(String str, b bVar) {
        return new a(bVar).g(str);
    }

    public static f f(File file, String str) throws IOException {
        return hh.b.e(file, str, file.getAbsolutePath());
    }

    public static f g(File file, String str, String str2) throws IOException {
        return hh.b.e(file, str, str2);
    }

    public static f h(InputStream inputStream, String str, String str2) throws IOException {
        return hh.b.f(inputStream, str, str2);
    }

    public static f i(InputStream inputStream, String str, String str2, g gVar) throws IOException {
        return hh.b.g(inputStream, str, str2, gVar);
    }

    public static f j(String str) {
        return g.e(str, "");
    }

    public static f k(String str, String str2) {
        return g.e(str, str2);
    }

    public static f l(String str, String str2, g gVar) {
        return gVar.k(str, str2);
    }

    public static f m(URL url, int i10) throws IOException {
        a K = hh.c.K(url);
        K.k(i10);
        return K.get();
    }

    public static f n(String str) {
        return g.f(str, "");
    }

    public static f o(String str, String str2) {
        return g.f(str, str2);
    }
}
