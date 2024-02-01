package w4;

import b6.c;

public enum e {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE(c.f4249n, false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);
    
    public final String O;
    public final boolean P;
    public final int Q;

    /* access modifiers changed from: public */
    e(String str, boolean z10, int i10) {
        this.O = str;
        this.P = z10;
        this.Q = i10;
    }

    public int a() {
        return this.Q;
    }

    public String b() {
        return this.O;
    }

    public boolean d() {
        return this.P;
    }
}
