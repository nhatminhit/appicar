package a6;

import i5.j;
import z5.n;

public abstract class z<IN, OUT> implements j<IN, OUT> {
    public abstract OUT a(IN in);

    public j b(n nVar) {
        return d(nVar).a(0);
    }

    public j c(n nVar) {
        return d(nVar).a(1);
    }

    public j d(n nVar) {
        j C = nVar.Y(getClass()).C(j.class);
        if (C != null && C.b() >= 2) {
            return C;
        }
        throw new IllegalStateException("Cannot find OUT type parameter for Converter of type " + getClass().getName());
    }
}
