package z4;

import w4.j;
import w4.l;
import w4.n;

public abstract class b extends n {
    public static final long S = 1;
    public transient l Q;
    public h5.l R;

    public b(String str, j jVar, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this.O = jVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, lVar == null ? null : lVar.W0());
        this.Q = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str, Throwable th2) {
        super(str, lVar == null ? null : lVar.W0(), th2);
        this.Q = lVar;
    }

    public b(l lVar, String str, j jVar) {
        super(str, jVar, (Throwable) null);
        this.Q = lVar;
    }

    /* renamed from: f */
    public l e() {
        return this.Q;
    }

    public h5.l g() {
        return this.R;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (this.R == null) {
            return message;
        }
        return message + "\nRequest payload : " + this.R.toString();
    }

    public String h() {
        h5.l lVar = this.R;
        if (lVar != null) {
            return lVar.toString();
        }
        return null;
    }

    public abstract b i(l lVar);

    public abstract b j(h5.l lVar);
}
