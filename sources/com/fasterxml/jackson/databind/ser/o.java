package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.node.u;
import i5.e0;
import i5.x;
import i5.y;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import q5.s;
import q5.v;
import s5.l;
import w4.i;

public abstract class o extends v implements Serializable {
    public static final long R = 1;

    public o(o oVar) {
        super((v) oVar);
    }

    public o(x xVar) {
        super(xVar);
    }

    public o(s sVar) {
        super(sVar.d());
    }

    public abstract y a();

    public abstract void b(l lVar, e0 e0Var) throws i5.l;

    @Deprecated
    public abstract void c(u uVar, e0 e0Var) throws i5.l;

    public <A extends Annotation> A f(Class<A> cls) {
        A annotation = getAnnotation(cls);
        return annotation == null ? l(cls) : annotation;
    }

    public abstract void g(Object obj, i iVar, e0 e0Var) throws Exception;

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public abstract String getName();

    public abstract void h(Object obj, i iVar, e0 e0Var) throws Exception;

    public abstract <A extends Annotation> A l(Class<A> cls);

    public abstract void r(Object obj, i iVar, e0 e0Var) throws Exception;

    public abstract void s(Object obj, i iVar, e0 e0Var) throws Exception;
}
