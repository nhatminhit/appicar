package androidx.lifecycle;

import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import fh.g;
import fh.h;
import hf.d;
import i2.a;
import ve.i;
import xe.l0;
import xe.n0;
import xe.w;
import zd.d0;

public final class w0<VM extends v0> implements d0<VM> {
    @g
    public final d<VM> O;
    @g
    public final we.a<a1> P;
    @g
    public final we.a<x0.b> Q;
    @g
    public final we.a<i2.a> R;
    @h
    public VM S;

    public static final class a extends n0 implements we.a<a.C0151a> {
        public static final a P = new a();

        public a() {
            super(0);
        }

        @g
        /* renamed from: c */
        public final a.C0151a n() {
            return a.C0151a.f9017b;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @i
    public w0(@g d<VM> dVar, @g we.a<? extends a1> aVar, @g we.a<? extends x0.b> aVar2) {
        this(dVar, aVar, aVar2, (we.a) null, 8, (w) null);
        l0.p(dVar, "viewModelClass");
        l0.p(aVar, "storeProducer");
        l0.p(aVar2, "factoryProducer");
    }

    @i
    public w0(@g d<VM> dVar, @g we.a<? extends a1> aVar, @g we.a<? extends x0.b> aVar2, @g we.a<? extends i2.a> aVar3) {
        l0.p(dVar, "viewModelClass");
        l0.p(aVar, "storeProducer");
        l0.p(aVar2, "factoryProducer");
        l0.p(aVar3, "extrasProducer");
        this.O = dVar;
        this.P = aVar;
        this.Q = aVar2;
        this.R = aVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(d dVar, we.a aVar, we.a aVar2, we.a aVar3, int i10, w wVar) {
        this(dVar, aVar, aVar2, (i10 & 8) != 0 ? a.P : aVar3);
    }

    public boolean a() {
        return this.S != null;
    }

    @g
    /* renamed from: b */
    public VM getValue() {
        VM vm = this.S;
        if (vm != null) {
            return vm;
        }
        VM a10 = new x0(this.P.n(), this.Q.n(), this.R.n()).a(ve.a.d(this.O));
        this.S = a10;
        return a10;
    }
}
