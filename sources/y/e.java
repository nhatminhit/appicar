package y;

import x.d;
import z.h;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final x.e f15224a;

    /* renamed from: b  reason: collision with root package name */
    public int f15225b;

    /* renamed from: c  reason: collision with root package name */
    public h f15226c;

    /* renamed from: d  reason: collision with root package name */
    public int f15227d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f15228e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f15229f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public Object f15230g;

    public e(x.e eVar) {
        this.f15224a = eVar;
    }

    public void a(Object obj) {
        this.f15230g = obj;
    }

    public void apply() {
        this.f15226c.f2(this.f15225b);
        int i10 = this.f15227d;
        if (i10 != -1) {
            this.f15226c.a2(i10);
            return;
        }
        int i11 = this.f15228e;
        if (i11 != -1) {
            this.f15226c.b2(i11);
        } else {
            this.f15226c.c2(this.f15229f);
        }
    }

    public void b(z.e eVar) {
        this.f15226c = eVar instanceof h ? (h) eVar : null;
    }

    public z.e c() {
        if (this.f15226c == null) {
            this.f15226c = new h();
        }
        return this.f15226c;
    }

    public void d(Object obj) {
        this.f15227d = -1;
        this.f15228e = this.f15224a.f(obj);
        this.f15229f = 0.0f;
    }

    public int e() {
        return this.f15225b;
    }

    public void f(float f10) {
        this.f15227d = -1;
        this.f15228e = -1;
        this.f15229f = f10;
    }

    public void g(int i10) {
        this.f15225b = i10;
    }

    public Object getKey() {
        return this.f15230g;
    }

    public void h(Object obj) {
        this.f15227d = this.f15224a.f(obj);
        this.f15228e = -1;
        this.f15229f = 0.0f;
    }
}
