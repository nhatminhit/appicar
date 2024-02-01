package ug;

import ch.e;
import javax.annotation.Nullable;
import og.e0;
import og.m0;

public final class h extends m0 {
    @Nullable
    public final String P;
    public final long Q;
    public final e R;

    public h(@Nullable String str, long j10, e eVar) {
        this.P = str;
        this.Q = j10;
        this.R = eVar;
    }

    public long k() {
        return this.Q;
    }

    public e0 l() {
        String str = this.P;
        if (str != null) {
            return e0.d(str);
        }
        return null;
    }

    public e w() {
        return this.R;
    }
}
