package q4;

import android.graphics.drawable.Drawable;
import d.m0;
import d.o0;
import p4.d;
import t4.m;

public abstract class e<T> implements p<T> {
    public final int O;
    public final int P;
    @o0
    public d Q;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public e(int i10, int i11) {
        if (m.v(i10, i11)) {
            this.O = i10;
            this.P = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    public void a() {
    }

    public void b() {
    }

    public final void e(@m0 o oVar) {
    }

    public void f(@o0 Drawable drawable) {
    }

    public final void h(@o0 d dVar) {
        this.Q = dVar;
    }

    public void l(@o0 Drawable drawable) {
    }

    public final void o(@m0 o oVar) {
        oVar.d(this.O, this.P);
    }

    public void onDestroy() {
    }

    @o0
    public final d q() {
        return this.Q;
    }
}
