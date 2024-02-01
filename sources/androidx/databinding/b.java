package androidx.databinding;

import androidx.databinding.u;

public abstract class b extends a {

    public class a extends u.a {
        public a() {
        }

        public void f(u uVar, int i10) {
            b.this.c();
        }
    }

    public b() {
    }

    public b(u... uVarArr) {
        if (uVarArr != null && uVarArr.length != 0) {
            a aVar = new a();
            for (u a10 : uVarArr) {
                a10.a(aVar);
            }
        }
    }
}
