package gf;

import fh.g;
import java.lang.Comparable;
import xe.l0;
import zd.h1;
import zd.r;

@h1(version = "1.7")
@r
public interface s<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@g s<T> sVar, @g T t10) {
            l0.p(t10, "value");
            return t10.compareTo(sVar.c()) >= 0 && t10.compareTo(sVar.f()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@g s<T> sVar) {
            return sVar.c().compareTo(sVar.f()) >= 0;
        }
    }

    boolean b(@g T t10);

    @g
    T c();

    @g
    T f();

    boolean isEmpty();
}
