package le;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import zd.h1;

@h1(version = "1.3")
public abstract class j extends a {
    public j(@h d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.e() == i.O)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @g
    public ie.g e() {
        return i.O;
    }
}
