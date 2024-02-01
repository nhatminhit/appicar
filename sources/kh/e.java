package kh;

import java.util.ArrayList;

public class e extends ArrayList<d> {
    public static final int P = 16;
    public final int O;

    public e(int i10, int i11) {
        super(i10);
        this.O = i11;
    }

    public static e m() {
        return new e(0, 0);
    }

    public static e n(int i10) {
        return new e(16, i10);
    }

    public boolean i() {
        return size() < this.O;
    }

    public int j() {
        return this.O;
    }
}
