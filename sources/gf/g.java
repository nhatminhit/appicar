package gf;

import java.lang.Comparable;
import xe.l0;
import zd.h1;

@h1(version = "1.1")
public interface g<T extends Comparable<? super T>> extends h<T> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@fh.g g<T> gVar, @fh.g T t10) {
            l0.p(t10, "value");
            return gVar.e(gVar.c(), t10) && gVar.e(t10, gVar.h());
        }

        public static <T extends Comparable<? super T>> boolean b(@fh.g g<T> gVar) {
            return !gVar.e(gVar.c(), gVar.h());
        }
    }

    boolean b(@fh.g T t10);

    boolean e(@fh.g T t10, @fh.g T t11);

    boolean isEmpty();
}
