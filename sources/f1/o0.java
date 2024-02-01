package f1;

import android.view.View;
import android.view.ViewGroup;
import d.m0;

public class o0 {

    /* renamed from: a  reason: collision with root package name */
    public int f7223a;

    /* renamed from: b  reason: collision with root package name */
    public int f7224b;

    public o0(@m0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f7223a | this.f7224b;
    }

    public void b(@m0 View view, @m0 View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(@m0 View view, @m0 View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f7224b = i10;
        } else {
            this.f7223a = i10;
        }
    }

    public void d(@m0 View view) {
        e(view, 0);
    }

    public void e(@m0 View view, int i10) {
        if (i10 == 1) {
            this.f7224b = 0;
        } else {
            this.f7223a = 0;
        }
    }
}
