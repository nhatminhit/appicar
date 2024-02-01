package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import d.m0;
import d.o0;

public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public ViewStub f2355a;

    /* renamed from: b  reason: collision with root package name */
    public ViewDataBinding f2356b;

    /* renamed from: c  reason: collision with root package name */
    public View f2357c;

    /* renamed from: d  reason: collision with root package name */
    public ViewStub.OnInflateListener f2358d;

    /* renamed from: e  reason: collision with root package name */
    public ViewDataBinding f2359e;

    /* renamed from: f  reason: collision with root package name */
    public ViewStub.OnInflateListener f2360f;

    public class a implements ViewStub.OnInflateListener {
        public a() {
        }

        public void onInflate(ViewStub viewStub, View view) {
            View unused = e0.this.f2357c = view;
            e0 e0Var = e0.this;
            ViewDataBinding unused2 = e0Var.f2356b = m.c(e0Var.f2359e.Z, view, viewStub.getLayoutResource());
            ViewStub unused3 = e0.this.f2355a = null;
            if (e0.this.f2358d != null) {
                e0.this.f2358d.onInflate(viewStub, view);
                ViewStub.OnInflateListener unused4 = e0.this.f2358d = null;
            }
            e0.this.f2359e.b0();
            e0.this.f2359e.x();
        }
    }

    public e0(@m0 ViewStub viewStub) {
        a aVar = new a();
        this.f2360f = aVar;
        this.f2355a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @o0
    public ViewDataBinding g() {
        return this.f2356b;
    }

    public View h() {
        return this.f2357c;
    }

    @o0
    public ViewStub i() {
        return this.f2355a;
    }

    public boolean j() {
        return this.f2357c != null;
    }

    public void k(@m0 ViewDataBinding viewDataBinding) {
        this.f2359e = viewDataBinding;
    }

    public void l(@o0 ViewStub.OnInflateListener onInflateListener) {
        if (this.f2355a != null) {
            this.f2358d = onInflateListener;
        }
    }
}
