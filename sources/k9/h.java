package k9;

import android.view.View;
import f1.w1;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final View f19995a;

    /* renamed from: b  reason: collision with root package name */
    public int f19996b;

    /* renamed from: c  reason: collision with root package name */
    public int f19997c;

    /* renamed from: d  reason: collision with root package name */
    public int f19998d;

    /* renamed from: e  reason: collision with root package name */
    public int f19999e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f20000f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20001g = true;

    public h(View view) {
        this.f19995a = view;
    }

    public void a() {
        View view = this.f19995a;
        w1.d1(view, this.f19998d - (view.getTop() - this.f19996b));
        View view2 = this.f19995a;
        w1.c1(view2, this.f19999e - (view2.getLeft() - this.f19997c));
    }

    public int b() {
        return this.f19997c;
    }

    public int c() {
        return this.f19996b;
    }

    public int d() {
        return this.f19999e;
    }

    public int e() {
        return this.f19998d;
    }

    public boolean f() {
        return this.f20001g;
    }

    public boolean g() {
        return this.f20000f;
    }

    public void h() {
        this.f19996b = this.f19995a.getTop();
        this.f19997c = this.f19995a.getLeft();
    }

    public void i(boolean z10) {
        this.f20001g = z10;
    }

    public boolean j(int i10) {
        if (!this.f20001g || this.f19999e == i10) {
            return false;
        }
        this.f19999e = i10;
        a();
        return true;
    }

    public boolean k(int i10) {
        if (!this.f20000f || this.f19998d == i10) {
            return false;
        }
        this.f19998d = i10;
        a();
        return true;
    }

    public void l(boolean z10) {
        this.f20000f = z10;
    }
}
