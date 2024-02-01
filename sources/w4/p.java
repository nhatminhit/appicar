package w4;

import p7.a;

public enum p {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT(a.f11638i, 1),
    END_OBJECT(a.f11639j, 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    
    public final String O;
    public final char[] P;
    public final byte[] Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;

    /* access modifiers changed from: public */
    p(String str, int i10) {
        boolean z10 = false;
        if (str == null) {
            this.O = null;
            this.P = null;
            this.Q = null;
        } else {
            this.O = str;
            char[] charArray = str.toCharArray();
            this.P = charArray;
            int length = charArray.length;
            this.Q = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.Q[i11] = (byte) this.P[i11];
            }
        }
        this.R = i10;
        this.V = i10 == 10 || i10 == 9;
        this.U = i10 == 7 || i10 == 8;
        boolean z11 = i10 == 1 || i10 == 3;
        this.S = z11;
        boolean z12 = i10 == 2 || i10 == 4;
        this.T = z12;
        if (!z11 && !z12 && i10 != 5 && i10 != -1) {
            z10 = true;
        }
        this.W = z10;
    }

    public final byte[] a() {
        return this.Q;
    }

    public final char[] b() {
        return this.P;
    }

    public final String d() {
        return this.O;
    }

    public final int e() {
        return this.R;
    }

    public final boolean i() {
        return this.V;
    }

    public final boolean j() {
        return this.U;
    }

    public final boolean k() {
        return this.W;
    }

    public final boolean l() {
        return this.T;
    }

    public final boolean m() {
        return this.S;
    }
}
