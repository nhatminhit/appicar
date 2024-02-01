package com.fasterxml.jackson.databind.ser;

import i5.c0;
import i5.e0;
import i5.j;
import i5.l;
import i5.o;
import u5.i;

public abstract class r {
    @Deprecated
    public abstract o<Object> a(c0 c0Var, j jVar, o<Object> oVar) throws l;

    public o<Object> b(e0 e0Var, j jVar, o<Object> oVar) throws l {
        return a(e0Var.q(), jVar, oVar);
    }

    public abstract o<Object> c(e0 e0Var, j jVar) throws l;

    public abstract i d(c0 c0Var, j jVar) throws l;

    public abstract r e(s sVar);

    public abstract r f(s sVar);

    public abstract r g(h hVar);
}
