package me;

import fh.g;
import xe.l0;
import xe.n0;
import zd.a1;
import zd.h1;
import zd.r;

public final class b {

    public static final class a extends n0 implements we.a<E[]> {
        public final /* synthetic */ E[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(E[] eArr) {
            super(0);
            this.P = eArr;
        }

        @g
        /* renamed from: c */
        public final E[] n() {
            return this.P;
        }
    }

    @h1(version = "1.8")
    @a1
    @g
    @r
    public static final <E extends Enum<E>> a<E> a(@g we.a<E[]> aVar) {
        l0.p(aVar, "entriesProvider");
        return new c(aVar);
    }

    @h1(version = "1.8")
    @a1
    @g
    @r
    public static final <E extends Enum<E>> a<E> b(@g E[] eArr) {
        l0.p(eArr, "entries");
        c cVar = new c(new a(eArr));
        cVar.size();
        return cVar;
    }
}
