package a4;

import a4.j;
import android.annotation.SuppressLint;
import d.m0;
import d.o0;
import t4.h;
import v3.f;
import y3.v;

public class i extends h<f, v<?>> implements j {

    /* renamed from: e  reason: collision with root package name */
    public j.a f166e;

    public i(long j10) {
        super(j10);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(e() / 2);
        }
    }

    @o0
    public /* bridge */ /* synthetic */ v f(@m0 f fVar) {
        return (v) super.p(fVar);
    }

    @o0
    public /* bridge */ /* synthetic */ v g(@m0 f fVar, @o0 v vVar) {
        return (v) super.o(fVar, vVar);
    }

    public void h(@m0 j.a aVar) {
        this.f166e = aVar;
    }

    /* renamed from: r */
    public int m(@o0 v<?> vVar) {
        return vVar == null ? super.m(null) : vVar.c();
    }

    /* renamed from: s */
    public void n(@m0 f fVar, @o0 v<?> vVar) {
        j.a aVar = this.f166e;
        if (aVar != null && vVar != null) {
            aVar.b(vVar);
        }
    }
}
