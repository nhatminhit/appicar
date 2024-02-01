package g6;

public abstract class a {
    public int O;

    public final void i(int i10) {
        this.O = i10 | this.O;
    }

    public void j() {
        this.O = 0;
    }

    public final void k(int i10) {
        this.O = (~i10) & this.O;
    }

    public final boolean l(int i10) {
        return (this.O & i10) == i10;
    }

    public final boolean m() {
        return l(Integer.MIN_VALUE);
    }

    public final boolean n() {
        return l(4);
    }

    public final boolean o() {
        return l(1);
    }

    public final void p(int i10) {
        this.O = i10;
    }
}
