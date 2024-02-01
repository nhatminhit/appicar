package q7;

import b6.t0;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import w7.q0;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f12036a;

    /* renamed from: b  reason: collision with root package name */
    public final t0[] f12037b;

    /* renamed from: c  reason: collision with root package name */
    public final m f12038c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12039d;

    public o(t0[] t0VarArr, f[] fVarArr, Object obj) {
        this.f12037b = t0VarArr;
        this.f12038c = new m(fVarArr);
        this.f12039d = obj;
        this.f12036a = t0VarArr.length;
    }

    public boolean a(@o0 o oVar) {
        if (oVar == null || oVar.f12038c.f12031a != this.f12038c.f12031a) {
            return false;
        }
        for (int i10 = 0; i10 < this.f12038c.f12031a; i10++) {
            if (!b(oVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(@o0 o oVar, int i10) {
        return oVar != null && q0.e(this.f12037b[i10], oVar.f12037b[i10]) && q0.e(this.f12038c.a(i10), oVar.f12038c.a(i10));
    }

    public boolean c(int i10) {
        return this.f12037b[i10] != null;
    }
}
