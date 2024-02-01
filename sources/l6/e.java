package l6;

import b6.j0;
import j6.s;
import w7.w;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final s f10242a;

    public static final class a extends j0 {
        public a(String str) {
            super(str);
        }
    }

    public e(s sVar) {
        this.f10242a = sVar;
    }

    public final boolean a(w wVar, long j10) throws j0 {
        return b(wVar) && c(wVar, j10);
    }

    public abstract boolean b(w wVar) throws j0;

    public abstract boolean c(w wVar, long j10) throws j0;

    public abstract void d();
}
