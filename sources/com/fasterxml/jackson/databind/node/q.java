package com.fasterxml.jackson.databind.node;

import i5.m;
import java.util.Iterator;
import java.util.Map;
import w4.o;
import w4.p;

public abstract class q extends o {

    /* renamed from: f  reason: collision with root package name */
    public final q f5012f;

    /* renamed from: g  reason: collision with root package name */
    public String f5013g;

    /* renamed from: h  reason: collision with root package name */
    public Object f5014h;

    public static final class a extends q {

        /* renamed from: i  reason: collision with root package name */
        public Iterator<m> f5015i;

        /* renamed from: j  reason: collision with root package name */
        public m f5016j;

        public a(m mVar, q qVar) {
            super(1, qVar);
            this.f5015i = mVar.s0();
        }

        public /* bridge */ /* synthetic */ o e() {
            return q.super.e();
        }

        public m r() {
            return this.f5016j;
        }

        public p u() {
            if (!this.f5015i.hasNext()) {
                this.f5016j = null;
                return p.END_ARRAY;
            }
            this.f14649b++;
            m next = this.f5015i.next();
            this.f5016j = next;
            return next.w();
        }

        public q w() {
            return new a(this.f5016j, this);
        }

        public q x() {
            return new b(this.f5016j, this);
        }
    }

    public static final class b extends q {

        /* renamed from: i  reason: collision with root package name */
        public Iterator<Map.Entry<String, m>> f5017i;

        /* renamed from: j  reason: collision with root package name */
        public Map.Entry<String, m> f5018j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5019k = true;

        public b(m mVar, q qVar) {
            super(2, qVar);
            this.f5017i = ((u) mVar).u0();
        }

        public /* bridge */ /* synthetic */ o e() {
            return q.super.e();
        }

        public m r() {
            Map.Entry<String, m> entry = this.f5018j;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        public p u() {
            if (this.f5019k) {
                String str = null;
                if (!this.f5017i.hasNext()) {
                    this.f5013g = null;
                    this.f5018j = null;
                    return p.END_OBJECT;
                }
                this.f14649b++;
                this.f5019k = false;
                Map.Entry<String, m> next = this.f5017i.next();
                this.f5018j = next;
                if (next != null) {
                    str = next.getKey();
                }
                this.f5013g = str;
                return p.FIELD_NAME;
            }
            this.f5019k = true;
            return this.f5018j.getValue().w();
        }

        public q w() {
            return new a(r(), this);
        }

        public q x() {
            return new b(r(), this);
        }
    }

    public static final class c extends q {

        /* renamed from: i  reason: collision with root package name */
        public m f5020i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5021j = false;

        public c(m mVar, q qVar) {
            super(0, qVar);
            this.f5020i = mVar;
        }

        public /* bridge */ /* synthetic */ o e() {
            return q.super.e();
        }

        public m r() {
            if (this.f5021j) {
                return this.f5020i;
            }
            return null;
        }

        public p u() {
            if (!this.f5021j) {
                this.f14649b++;
                this.f5021j = true;
                return this.f5020i.w();
            }
            this.f5020i = null;
            return null;
        }

        public void v(String str) {
        }

        public q w() {
            return new a(this.f5020i, this);
        }

        public q x() {
            return new b(this.f5020i, this);
        }
    }

    public q(int i10, q qVar) {
        this.f14648a = i10;
        this.f14649b = -1;
        this.f5012f = qVar;
    }

    public final String b() {
        return this.f5013g;
    }

    public Object c() {
        return this.f5014h;
    }

    public void p(Object obj) {
        this.f5014h = obj;
    }

    public abstract m r();

    /* renamed from: s */
    public final q e() {
        return this.f5012f;
    }

    public final q t() {
        m r10 = r();
        if (r10 == null) {
            throw new IllegalStateException("No current node");
        } else if (r10.P()) {
            return new a(r10, this);
        } else {
            if (r10.O()) {
                return new b(r10, this);
            }
            throw new IllegalStateException("Current node of type " + r10.getClass().getName());
        }
    }

    public abstract p u();

    public void v(String str) {
        this.f5013g = str;
    }

    public abstract q w();

    public abstract q x();
}
