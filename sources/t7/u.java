package t7;

import android.content.Context;
import d.o0;
import t7.l;

public final class u implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13220a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final r0 f13221b;

    /* renamed from: c  reason: collision with root package name */
    public final l.a f13222c;

    public u(Context context, String str) {
        this(context, str, (r0) null);
    }

    public u(Context context, String str, @o0 r0 r0Var) {
        this(context, r0Var, (l.a) new w(str, r0Var));
    }

    public u(Context context, l.a aVar) {
        this(context, (r0) null, aVar);
    }

    public u(Context context, @o0 r0 r0Var, l.a aVar) {
        this.f13220a = context.getApplicationContext();
        this.f13221b = r0Var;
        this.f13222c = aVar;
    }

    /* renamed from: f */
    public t a() {
        t tVar = new t(this.f13220a, this.f13222c.a());
        r0 r0Var = this.f13221b;
        if (r0Var != null) {
            tVar.d(r0Var);
        }
        return tVar;
    }
}
