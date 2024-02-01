package zb;

import android.graphics.Rect;
import java.util.List;
import yb.x;

public class o {

    /* renamed from: e  reason: collision with root package name */
    public static final String f25089e = "o";

    /* renamed from: a  reason: collision with root package name */
    public x f25090a;

    /* renamed from: b  reason: collision with root package name */
    public int f25091b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25092c = false;

    /* renamed from: d  reason: collision with root package name */
    public t f25093d = new p();

    public o(int i10) {
        this.f25091b = i10;
    }

    public o(int i10, x xVar) {
        this.f25091b = i10;
        this.f25090a = xVar;
    }

    public x a(List<x> list, boolean z10) {
        return this.f25093d.b(list, b(z10));
    }

    public x b(boolean z10) {
        x xVar = this.f25090a;
        if (xVar == null) {
            return null;
        }
        return z10 ? xVar.d() : xVar;
    }

    public t c() {
        return this.f25093d;
    }

    public int d() {
        return this.f25091b;
    }

    public x e() {
        return this.f25090a;
    }

    public Rect f(x xVar) {
        return this.f25093d.d(xVar, this.f25090a);
    }

    public void g(t tVar) {
        this.f25093d = tVar;
    }
}
