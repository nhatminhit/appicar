package androidx.databinding;

import androidx.databinding.u;
import d.m0;

public class a implements u {
    public transient c0 O;

    public void a(@m0 u.a aVar) {
        synchronized (this) {
            if (this.O == null) {
                this.O = new c0();
            }
        }
        this.O.a(aVar);
    }

    public void b(@m0 u.a aVar) {
        synchronized (this) {
            c0 c0Var = this.O;
            if (c0Var != null) {
                c0Var.t(aVar);
            }
        }
    }

    public void c() {
        synchronized (this) {
            c0 c0Var = this.O;
            if (c0Var != null) {
                c0Var.n(this, 0, null);
            }
        }
    }

    public void d(int i10) {
        synchronized (this) {
            c0 c0Var = this.O;
            if (c0Var != null) {
                c0Var.n(this, i10, null);
            }
        }
    }
}
