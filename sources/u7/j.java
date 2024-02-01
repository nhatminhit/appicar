package u7;

import b6.c;
import d.m0;
import d.o0;
import java.io.File;

public class j implements Comparable<j> {
    public final String O;
    public final long P;
    public final long Q;
    public final boolean R;
    @o0
    public final File S;
    public final long T;

    public j(String str, long j10, long j11) {
        this(str, j10, j11, c.f4201b, (File) null);
    }

    public j(String str, long j10, long j11, long j12, @o0 File file) {
        this.O = str;
        this.P = j10;
        this.Q = j11;
        this.R = file != null;
        this.S = file;
        this.T = j12;
    }

    /* renamed from: a */
    public int compareTo(@m0 j jVar) {
        if (!this.O.equals(jVar.O)) {
            return this.O.compareTo(jVar.O);
        }
        int i10 = ((this.P - jVar.P) > 0 ? 1 : ((this.P - jVar.P) == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.R;
    }

    public boolean d() {
        return this.Q == -1;
    }
}
