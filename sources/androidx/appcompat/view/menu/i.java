package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.w1;
import l.d;

@x0({x0.a.Q})
public class i implements g {

    /* renamed from: m  reason: collision with root package name */
    public static final int f980m = 48;

    /* renamed from: a  reason: collision with root package name */
    public final Context f981a;

    /* renamed from: b  reason: collision with root package name */
    public final e f982b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f983c;

    /* renamed from: d  reason: collision with root package name */
    public final int f984d;

    /* renamed from: e  reason: collision with root package name */
    public final int f985e;

    /* renamed from: f  reason: collision with root package name */
    public View f986f;

    /* renamed from: g  reason: collision with root package name */
    public int f987g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f988h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f989i;

    /* renamed from: j  reason: collision with root package name */
    public d f990j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f991k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f992l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            i.this.g();
        }
    }

    public i(@m0 Context context, @m0 e eVar) {
        this(context, eVar, (View) null, false, a.c.popupMenuStyle, 0);
    }

    public i(@m0 Context context, @m0 e eVar, @m0 View view) {
        this(context, eVar, view, false, a.c.popupMenuStyle, 0);
    }

    public i(@m0 Context context, @m0 e eVar, @m0 View view, boolean z10, @f int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public i(@m0 Context context, @m0 e eVar, @m0 View view, boolean z10, @f int i10, @b1 int i11) {
        this.f987g = f1.j.f7185b;
        this.f992l = new a();
        this.f981a = context;
        this.f982b = eVar;
        this.f986f = view;
        this.f983c = z10;
        this.f984d = i10;
        this.f985e = i11;
    }

    public void a(@o0 j.a aVar) {
        this.f989i = aVar;
        d dVar = this.f990j;
        if (dVar != null) {
            dVar.h(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [l.d, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l.d b() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f981a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f981a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = f.a.f.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f981a
            android.view.View r3 = r14.f986f
            int r4 = r14.f984d
            int r5 = r14.f985e
            boolean r6 = r14.f983c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r8 = r14.f981a
            androidx.appcompat.view.menu.e r9 = r14.f982b
            android.view.View r10 = r14.f986f
            int r11 = r14.f984d
            int r12 = r14.f985e
            boolean r13 = r14.f983c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.e r1 = r14.f982b
            r0.o(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f992l
            r0.x(r1)
            android.view.View r1 = r14.f986f
            r0.s(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f989i
            r0.h(r1)
            boolean r1 = r14.f988h
            r0.u(r1)
            int r1 = r14.f987g
            r0.v(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.b():l.d");
    }

    public int c() {
        return this.f987g;
    }

    public ListView d() {
        return e().k();
    }

    public void dismiss() {
        if (f()) {
            this.f990j.dismiss();
        }
    }

    @x0({x0.a.O})
    @m0
    public d e() {
        if (this.f990j == null) {
            this.f990j = b();
        }
        return this.f990j;
    }

    public boolean f() {
        d dVar = this.f990j;
        return dVar != null && dVar.c();
    }

    public void g() {
        this.f990j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f991k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@m0 View view) {
        this.f986f = view;
    }

    public void i(boolean z10) {
        this.f988h = z10;
        d dVar = this.f990j;
        if (dVar != null) {
            dVar.u(z10);
        }
    }

    public void j(int i10) {
        this.f987g = i10;
    }

    public void k(@o0 PopupWindow.OnDismissListener onDismissListener) {
        this.f991k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i10, int i11) {
        if (!p(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void n(int i10, int i11, boolean z10, boolean z11) {
        d e10 = e();
        e10.y(z11);
        if (z10) {
            if ((f1.j.d(this.f987g, w1.X(this.f986f)) & 7) == 5) {
                i10 -= this.f986f.getWidth();
            }
            e10.w(i10);
            e10.z(i11);
            int i12 = (int) ((this.f981a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e10.t(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        e10.a();
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f986f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i10, int i11) {
        if (f()) {
            return true;
        }
        if (this.f986f == null) {
            return false;
        }
        n(i10, i11, true, true);
        return true;
    }
}
