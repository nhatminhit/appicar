package xb;

import vb.h;
import vb.j;

public final class f {

    /* renamed from: f  reason: collision with root package name */
    public static final int f24503f = 8;

    /* renamed from: a  reason: collision with root package name */
    public h f24504a;

    /* renamed from: b  reason: collision with root package name */
    public vb.f f24505b;

    /* renamed from: c  reason: collision with root package name */
    public j f24506c;

    /* renamed from: d  reason: collision with root package name */
    public int f24507d = -1;

    /* renamed from: e  reason: collision with root package name */
    public b f24508e;

    public static boolean f(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public vb.f a() {
        return this.f24505b;
    }

    public int b() {
        return this.f24507d;
    }

    public b c() {
        return this.f24508e;
    }

    public h d() {
        return this.f24504a;
    }

    public j e() {
        return this.f24506c;
    }

    public void g(vb.f fVar) {
        this.f24505b = fVar;
    }

    public void h(int i10) {
        this.f24507d = i10;
    }

    public void i(b bVar) {
        this.f24508e = bVar;
    }

    public void j(h hVar) {
        this.f24504a = hVar;
    }

    public void k(j jVar) {
        this.f24506c = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f24504a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f24505b);
        sb2.append("\n version: ");
        sb2.append(this.f24506c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f24507d);
        if (this.f24508e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f24508e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
