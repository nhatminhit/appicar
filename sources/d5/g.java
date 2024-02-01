package d5;

import w4.c;
import w4.i;

public enum g implements c {
    QUOTE_FIELD_NAMES(true, i.b.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, i.b.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, i.b.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, i.b.ESCAPE_NON_ASCII);
    
    public final boolean O;
    public final int P;
    public final i.b Q;

    /* access modifiers changed from: public */
    g(boolean z10, i.b bVar) {
        this.O = z10;
        this.P = 1 << ordinal();
        this.Q = bVar;
    }

    public static int e() {
        int i10 = 0;
        for (g gVar : values()) {
            if (gVar.b()) {
                i10 |= gVar.a();
            }
        }
        return i10;
    }

    public int a() {
        return this.P;
    }

    public boolean b() {
        return this.O;
    }

    public boolean d(int i10) {
        return (i10 & this.P) != 0;
    }

    public i.b i() {
        return this.Q;
    }
}
