package com.fasterxml.jackson.databind.node;

import i5.e0;
import i5.m;
import java.io.IOException;
import java.io.Serializable;
import w4.i;
import w4.l;
import w4.n;
import w4.p;
import w4.s;

public abstract class b extends m implements Serializable {
    public static final long O = 1;

    public l D(s sVar) {
        return new y(this, sVar);
    }

    public l F() {
        return new y(this);
    }

    public abstract int hashCode();

    public m i1(int i10) {
        return (m) V("Node of type `%s` has no indexed values", getClass().getSimpleName());
    }

    public m j1(String str) {
        return (m) V("Node of type `%s` has no fields", getClass().getSimpleName());
    }

    public String o1() {
        return k.b(this);
    }

    public l.b q() {
        return null;
    }

    public abstract void r(i iVar, e0 e0Var) throws IOException, n;

    /* access modifiers changed from: package-private */
    public Object r1() {
        return r.a(this);
    }

    public String toString() {
        return k.c(this);
    }

    public abstract p w();

    public abstract void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException, n;

    public final m y0(String str) {
        m z02 = z0(str);
        return z02 == null ? p.t1() : z02;
    }
}
