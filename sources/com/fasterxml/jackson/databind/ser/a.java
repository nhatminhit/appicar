package com.fasterxml.jackson.databind.ser;

import i5.c0;
import i5.d;
import i5.e0;
import i5.l;
import i5.o;
import i5.q;
import java.util.Map;
import q5.h;
import w4.i;
import y5.u;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f5023a;

    /* renamed from: b  reason: collision with root package name */
    public final h f5024b;

    /* renamed from: c  reason: collision with root package name */
    public o<Object> f5025c;

    /* renamed from: d  reason: collision with root package name */
    public u f5026d;

    public a(d dVar, h hVar, o<?> oVar) {
        this.f5024b = hVar;
        this.f5023a = dVar;
        this.f5025c = oVar;
        if (oVar instanceof u) {
            this.f5026d = (u) oVar;
        }
    }

    public void a(c0 c0Var) {
        this.f5024b.l(c0Var.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void b(Object obj, i iVar, e0 e0Var, n nVar) throws Exception {
        Object r10 = this.f5024b.r(obj);
        if (r10 != null) {
            if (!(r10 instanceof Map)) {
                e0Var.z(this.f5023a.e(), String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", new Object[]{this.f5024b.f(), r10.getClass().getName()}));
            }
            u uVar = this.f5026d;
            if (uVar != null) {
                uVar.j0(e0Var, iVar, obj, (Map) r10, nVar, (Object) null);
                return;
            }
            this.f5025c.m(r10, iVar, e0Var);
        }
    }

    public void c(Object obj, i iVar, e0 e0Var) throws Exception {
        Object r10 = this.f5024b.r(obj);
        if (r10 != null) {
            if (!(r10 instanceof Map)) {
                e0Var.z(this.f5023a.e(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{this.f5024b.f(), r10.getClass().getName()}));
            }
            u uVar = this.f5026d;
            if (uVar != null) {
                uVar.o0((Map) r10, iVar, e0Var);
            } else {
                this.f5025c.m(r10, iVar, e0Var);
            }
        }
    }

    public void d(e0 e0Var) throws l {
        o<Object> oVar = this.f5025c;
        if (oVar instanceof j) {
            o<?> r02 = e0Var.r0(oVar, this.f5023a);
            this.f5025c = r02;
            if (r02 instanceof u) {
                this.f5026d = (u) r02;
            }
        }
    }
}
