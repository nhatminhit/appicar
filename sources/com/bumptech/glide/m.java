package com.bumptech.glide;

import com.bumptech.glide.m;
import d.m0;
import r4.e;
import r4.g;
import r4.h;
import r4.i;
import r4.j;
import t4.k;

public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public g<? super TranscodeType> O = e.c();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @m0
    public final CHILD d() {
        return k(e.c());
    }

    public final g<? super TranscodeType> g() {
        return this.O;
    }

    public final CHILD i() {
        return this;
    }

    @m0
    public final CHILD j(int i10) {
        return k(new h(i10));
    }

    @m0
    public final CHILD k(@m0 g<? super TranscodeType> gVar) {
        this.O = (g) k.d(gVar);
        return i();
    }

    @m0
    public final CHILD m(@m0 j.a aVar) {
        return k(new i(aVar));
    }
}
