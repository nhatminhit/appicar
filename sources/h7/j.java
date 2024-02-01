package h7;

import g6.g;
import java.util.List;
import w7.a;

public abstract class j extends g implements e {
    public e R;
    public long S;

    public int a(long j10) {
        return ((e) a.g(this.R)).a(j10 - this.S);
    }

    public long b(int i10) {
        return ((e) a.g(this.R)).b(i10) + this.S;
    }

    public List<b> d(long j10) {
        return ((e) a.g(this.R)).d(j10 - this.S);
    }

    public int e() {
        return ((e) a.g(this.R)).e();
    }

    public void j() {
        super.j();
        this.R = null;
    }

    public abstract void q();

    public void r(long j10, e eVar, long j11) {
        this.P = j10;
        this.R = eVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.S = j10;
    }
}
