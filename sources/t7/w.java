package t7;

import d.o0;
import t7.e0;
import w7.a;
import w7.y;

public final class w extends e0.a {

    /* renamed from: b  reason: collision with root package name */
    public final String f13244b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final r0 f13245c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13246d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13247e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13248f;

    public w(String str) {
        this(str, (r0) null);
    }

    public w(String str, int i10, int i11, boolean z10) {
        this(str, (r0) null, i10, i11, z10);
    }

    public w(String str, @o0 r0 r0Var) {
        this(str, r0Var, 8000, 8000, false);
    }

    public w(String str, @o0 r0 r0Var, int i10, int i11, boolean z10) {
        this.f13244b = a.e(str);
        this.f13245c = r0Var;
        this.f13246d = i10;
        this.f13247e = i11;
        this.f13248f = z10;
    }

    /* renamed from: g */
    public v f(e0.f fVar) {
        v vVar = new v(this.f13244b, (y<String>) null, this.f13246d, this.f13247e, this.f13248f, fVar);
        r0 r0Var = this.f13245c;
        if (r0Var != null) {
            vVar.d(r0Var);
        }
        return vVar;
    }
}
