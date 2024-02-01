package ej;

import android.content.Context;
import android.util.DisplayMetrics;

public class a {

    /* renamed from: q  reason: collision with root package name */
    public static a f18699q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18700a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18701b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18702c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18703d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18704e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18705f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18706g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18707h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18708i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18709j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18710k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18711l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f18712m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18713n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18714o = false;

    /* renamed from: p  reason: collision with root package name */
    public double f18715p = 0.0d;

    public static a b() {
        if (f18699q == null) {
            f18699q = new a();
        }
        return f18699q;
    }

    public void A(boolean z10) {
        this.f18703d = z10;
    }

    public void B(boolean z10) {
        this.f18710k = z10;
    }

    public void C(boolean z10) {
        this.f18701b = z10;
    }

    public void D(boolean z10) {
        this.f18700a = z10;
    }

    public void E(boolean z10) {
        this.f18713n = z10;
    }

    public void F(boolean z10) {
        this.f18712m = z10;
    }

    public void G(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        if (i10 > i11) {
            this.f18715p = ((double) i10) / ((double) i11);
        } else {
            this.f18715p = ((double) i11) / ((double) i10);
        }
    }

    public void H(boolean z10) {
        this.f18711l = z10;
    }

    public void a() {
        f18699q = null;
    }

    public double c() {
        return this.f18715p;
    }

    public boolean d() {
        return this.f18714o;
    }

    public boolean e() {
        return this.f18708i;
    }

    public boolean f() {
        return this.f18704e;
    }

    public boolean g() {
        return this.f18707h;
    }

    public boolean h() {
        return this.f18709j;
    }

    public boolean i() {
        return this.f18706g;
    }

    public boolean j() {
        return this.f18702c;
    }

    public boolean k() {
        return this.f18705f;
    }

    public boolean l() {
        return this.f18703d;
    }

    public boolean m() {
        return this.f18710k;
    }

    public boolean n() {
        return this.f18701b;
    }

    public boolean o() {
        return this.f18700a;
    }

    public boolean p() {
        return this.f18713n;
    }

    public boolean q() {
        return this.f18712m;
    }

    public boolean r() {
        return this.f18711l;
    }

    public void s(boolean z10) {
        this.f18714o = z10;
    }

    public void t(boolean z10) {
        this.f18708i = z10;
    }

    public void u(boolean z10) {
        this.f18704e = z10;
    }

    public void v(boolean z10) {
        this.f18707h = z10;
    }

    public void w(boolean z10) {
        this.f18709j = z10;
    }

    public void x(boolean z10) {
        this.f18706g = z10;
    }

    public void y(boolean z10) {
        this.f18702c = z10;
    }

    public void z(boolean z10) {
        this.f18705f = z10;
    }
}
