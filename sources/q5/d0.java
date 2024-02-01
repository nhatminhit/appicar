package q5;

import i5.j;
import java.lang.reflect.Type;
import z5.m;
import z5.n;

public interface d0 {

    public static class a implements d0 {
        public final n O;
        public final m P;

        public a(n nVar, m mVar) {
            this.O = nVar;
            this.P = mVar;
        }

        public j a(Type type) {
            return this.O.b0(type, this.P);
        }
    }

    j a(Type type);
}
