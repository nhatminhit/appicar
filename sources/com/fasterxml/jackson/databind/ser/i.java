package com.fasterxml.jackson.databind.ser;

import i5.d;
import i5.e0;
import i5.j;
import i5.o;
import y5.m0;

public abstract class i<T> extends m0<T> {
    public i(i<?> iVar) {
        super(iVar.O, false);
    }

    public i(j jVar) {
        super(jVar);
    }

    public i(Class<T> cls) {
        super(cls);
    }

    public i(Class<?> cls, boolean z10) {
        super(cls, z10);
    }

    public abstract i<?> M(u5.i iVar);

    public abstract o<?> N();

    public abstract j O();

    @Deprecated
    public boolean P(e0 e0Var, d dVar) {
        return false;
    }

    public abstract boolean Q(T t10);

    public i<?> R(u5.i iVar) {
        return iVar == null ? this : M(iVar);
    }
}
