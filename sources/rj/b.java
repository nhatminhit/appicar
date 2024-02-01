package rj;

import java.util.List;
import u2.c1;
import u2.j1;
import u2.l0;

@l0
public interface b {
    @j1("DELETE From  car")
    void a();

    @j1("DELETE From  car WHERE Idcar=:idCar")
    void b(String str);

    @j1("SELECT IdCar FROM car ")
    List<String> c();

    @c1
    void d(a aVar);
}
