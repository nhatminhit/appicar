package pl.droidsonroids.gif;

import d.e0;
import d.o0;
import d.v;
import java.io.IOException;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public final GifInfoHandle f22134a;

    public k(m mVar, @o0 i iVar) throws IOException {
        iVar = iVar == null ? new i() : iVar;
        GifInfoHandle c10 = mVar.c();
        this.f22134a = c10;
        c10.K(iVar.f22131a, iVar.f22132b);
        c10.t();
    }

    public int a() {
        return this.f22134a.d();
    }

    public int b() {
        return this.f22134a.g();
    }

    public int c(@e0(from = 0) int i10) {
        return this.f22134a.h(i10);
    }

    public int d() {
        return this.f22134a.i();
    }

    public int e() {
        return this.f22134a.n();
    }

    public int f() {
        return this.f22134a.q();
    }

    public final void finalize() throws Throwable {
        try {
            i();
        } finally {
            super.finalize();
        }
    }

    public void g(int i10, int i11) {
        this.f22134a.r(i10, i11);
    }

    public void h(int i10, int i11) {
        this.f22134a.s(i10, i11);
    }

    public void i() {
        GifInfoHandle gifInfoHandle = this.f22134a;
        if (gifInfoHandle != null) {
            gifInfoHandle.A();
        }
    }

    public void j(@e0(from = 0) int i10) {
        this.f22134a.H(i10);
    }

    public void k(@v(from = 0.0d, fromInclusive = false) float f10) {
        this.f22134a.L(f10);
    }

    public void l() {
        this.f22134a.M();
    }

    public void m() {
        this.f22134a.N();
    }
}
