package lf;

public enum q implements i {
    IGNORE_CASE(2, 0, 2, (int) null),
    MULTILINE(8, 0, 2, (int) null),
    LITERAL(16, 0, 2, (int) null),
    UNIX_LINES(1, 0, 2, (int) null),
    COMMENTS(4, 0, 2, (int) null),
    DOT_MATCHES_ALL(32, 0, 2, (int) null),
    CANON_EQ(128, 0, 2, (int) null);
    
    public final int O;
    public final int P;

    /* access modifiers changed from: public */
    q(int i10, int i11) {
        this.O = i10;
        this.P = i11;
    }

    public int a() {
        return this.P;
    }

    public int getValue() {
        return this.O;
    }
}
