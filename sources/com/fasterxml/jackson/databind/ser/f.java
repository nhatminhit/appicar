package com.fasterxml.jackson.databind.ser;

import i5.c;
import i5.c0;
import i5.o;
import i5.q;
import java.util.Collections;
import java.util.List;
import q5.b;
import q5.h;
import x5.i;

public class f {

    /* renamed from: i  reason: collision with root package name */
    public static final d[] f5041i = new d[0];

    /* renamed from: a  reason: collision with root package name */
    public final c f5042a;

    /* renamed from: b  reason: collision with root package name */
    public c0 f5043b;

    /* renamed from: c  reason: collision with root package name */
    public List<d> f5044c = Collections.emptyList();

    /* renamed from: d  reason: collision with root package name */
    public d[] f5045d;

    /* renamed from: e  reason: collision with root package name */
    public a f5046e;

    /* renamed from: f  reason: collision with root package name */
    public Object f5047f;

    /* renamed from: g  reason: collision with root package name */
    public h f5048g;

    /* renamed from: h  reason: collision with root package name */
    public i f5049h;

    public f(f fVar) {
        this.f5042a = fVar.f5042a;
        this.f5044c = fVar.f5044c;
        this.f5045d = fVar.f5045d;
        this.f5046e = fVar.f5046e;
        this.f5047f = fVar.f5047f;
    }

    public f(c cVar) {
        this.f5042a = cVar;
    }

    public o<?> a() {
        d[] dVarArr;
        List<d> list = this.f5044c;
        if (list != null && !list.isEmpty()) {
            List<d> list2 = this.f5044c;
            dVarArr = (d[]) list2.toArray(new d[list2.size()]);
            if (this.f5043b.T(q.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (d A : dVarArr) {
                    A.A(this.f5043b);
                }
            }
        } else if (this.f5046e == null && this.f5049h == null) {
            return null;
        } else {
            dVarArr = f5041i;
        }
        d[] dVarArr2 = this.f5045d;
        if (dVarArr2 == null || dVarArr2.length == this.f5044c.size()) {
            a aVar = this.f5046e;
            if (aVar != null) {
                aVar.a(this.f5043b);
            }
            if (this.f5048g != null && this.f5043b.T(q.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                this.f5048g.l(this.f5043b.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new e(this.f5042a.E(), this, dVarArr, this.f5045d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", new Object[]{Integer.valueOf(this.f5044c.size()), Integer.valueOf(this.f5045d.length)}));
    }

    public e b() {
        return e.c0(this.f5042a.E(), this);
    }

    public a c() {
        return this.f5046e;
    }

    public c d() {
        return this.f5042a;
    }

    public b e() {
        return this.f5042a.z();
    }

    public Object f() {
        return this.f5047f;
    }

    public d[] g() {
        return this.f5045d;
    }

    public i h() {
        return this.f5049h;
    }

    public List<d> i() {
        return this.f5044c;
    }

    public h j() {
        return this.f5048g;
    }

    public boolean k() {
        List<d> list = this.f5044c;
        return list != null && list.size() > 0;
    }

    public void l(a aVar) {
        this.f5046e = aVar;
    }

    public void m(c0 c0Var) {
        this.f5043b = c0Var;
    }

    public void n(Object obj) {
        this.f5047f = obj;
    }

    public void o(d[] dVarArr) {
        if (dVarArr == null || dVarArr.length == this.f5044c.size()) {
            this.f5045d = dVarArr;
        } else {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", new Object[]{Integer.valueOf(dVarArr.length), Integer.valueOf(this.f5044c.size())}));
        }
    }

    public void p(i iVar) {
        this.f5049h = iVar;
    }

    public void q(List<d> list) {
        this.f5044c = list;
    }

    public void r(h hVar) {
        if (this.f5048g == null) {
            this.f5048g = hVar;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f5048g + " and " + hVar);
    }
}
