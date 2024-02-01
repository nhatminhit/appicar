package gf;

import fh.g;
import java.lang.Comparable;
import xe.l0;

public interface h<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@g h<T> hVar, @g T t10) {
            l0.p(t10, "value");
            return t10.compareTo(hVar.c()) >= 0 && t10.compareTo(hVar.h()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@g h<T> hVar) {
            return hVar.c().compareTo(hVar.h()) > 0;
        }
    }

    boolean b(@g T t10);

    @g
    T c();

    @g
    T h();

    boolean isEmpty();
}
