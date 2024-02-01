package nf;

import fh.g;
import nf.r;
import xe.w;

@l
public final class c implements r {
    @g
    public final r O;
    public final long P;

    public c(r rVar, long j10) {
        this.O = rVar;
        this.P = j10;
    }

    public /* synthetic */ c(r rVar, long j10, w wVar) {
        this(rVar, j10);
    }

    public boolean a() {
        return r.a.b(this);
    }

    public long b() {
        return e.g0(this.O.b(), this.P);
    }

    @g
    public r c(long j10) {
        return r.a.c(this, j10);
    }

    public boolean d() {
        return r.a.a(this);
    }

    public final long e() {
        return this.P;
    }

    @g
    public r f(long j10) {
        return new c(this.O, e.h0(this.P, j10), (w) null);
    }

    @g
    public final r i() {
        return this.O;
    }
}
