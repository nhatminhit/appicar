package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.MenuPopupWindow;
import f.a;
import f1.w1;
import l.d;

public final class l extends d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: j0  reason: collision with root package name */
    public static final int f993j0 = a.k.abc_popup_menu_item_layout;
    public final Context P;
    public final e Q;
    public final d R;
    public final boolean S;
    public final int T;
    public final int U;
    public final int V;
    public final MenuPopupWindow W;
    public final ViewTreeObserver.OnGlobalLayoutListener X = new a();
    public final View.OnAttachStateChangeListener Y = new b();
    public PopupWindow.OnDismissListener Z;

    /* renamed from: a0  reason: collision with root package name */
    public View f994a0;

    /* renamed from: b0  reason: collision with root package name */
    public View f995b0;

    /* renamed from: c0  reason: collision with root package name */
    public j.a f996c0;

    /* renamed from: d0  reason: collision with root package name */
    public ViewTreeObserver f997d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f998e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f999f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1000g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1001h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1002i0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (l.this.c() && !l.this.W.L()) {
                View view = l.this.f995b0;
                if (view == null || !view.isShown()) {
                    l.this.dismiss();
                } else {
                    l.this.W.a();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f997d0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f997d0 = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f997d0.removeGlobalOnLayoutListener(lVar.X);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.P = context;
        this.Q = eVar;
        this.S = z10;
        this.R = new d(eVar, LayoutInflater.from(context), z10, f993j0);
        this.U = i10;
        this.V = i11;
        Resources resources = context.getResources();
        this.T = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.abc_config_prefDialogWidth));
        this.f994a0 = view;
        this.W = new MenuPopupWindow(context, (AttributeSet) null, i10, i11);
        eVar.c(this, context);
    }

    public final boolean C() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f998e0 || (view = this.f994a0) == null) {
            return false;
        }
        this.f995b0 = view;
        this.W.e0(this);
        this.W.f0(this);
        this.W.d0(true);
        View view2 = this.f995b0;
        boolean z10 = this.f997d0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f997d0 = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.X);
        }
        view2.addOnAttachStateChangeListener(this.Y);
        this.W.S(view2);
        this.W.W(this.f1001h0);
        if (!this.f999f0) {
            this.f1000g0 = d.r(this.R, (ViewGroup) null, this.P, this.T);
            this.f999f0 = true;
        }
        this.W.U(this.f1000g0);
        this.W.a0(2);
        this.W.X(q());
        this.W.a();
        ListView k10 = this.W.k();
        k10.setOnKeyListener(this);
        if (this.f1002i0 && this.Q.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.P).inflate(a.k.abc_popup_menu_header_item_layout, k10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.Q.A());
            }
            frameLayout.setEnabled(false);
            k10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.W.q(this.R);
        this.W.a();
        return true;
    }

    public void a() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void b(e eVar, boolean z10) {
        if (eVar == this.Q) {
            dismiss();
            j.a aVar = this.f996c0;
            if (aVar != null) {
                aVar.b(eVar, z10);
            }
        }
    }

    public boolean c() {
        return !this.f998e0 && this.W.c();
    }

    public void d(boolean z10) {
        this.f999f0 = false;
        d dVar = this.R;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public void dismiss() {
        if (c()) {
            this.W.dismiss();
        }
    }

    public boolean e() {
        return false;
    }

    public void h(j.a aVar) {
        this.f996c0 = aVar;
    }

    public void j(Parcelable parcelable) {
    }

    public ListView k() {
        return this.W.k();
    }

    public boolean l(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.P, mVar, this.f995b0, this.S, this.U, this.V);
            iVar.a(this.f996c0);
            iVar.i(d.A(mVar));
            iVar.k(this.Z);
            this.Z = null;
            this.Q.f(false);
            int d10 = this.W.d();
            int o10 = this.W.o();
            if ((Gravity.getAbsoluteGravity(this.f1001h0, w1.X(this.f994a0)) & 7) == 5) {
                d10 += this.f994a0.getWidth();
            }
            if (iVar.p(d10, o10)) {
                j.a aVar = this.f996c0;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    public Parcelable n() {
        return null;
    }

    public void o(e eVar) {
    }

    public void onDismiss() {
        this.f998e0 = true;
        this.Q.close();
        ViewTreeObserver viewTreeObserver = this.f997d0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f997d0 = this.f995b0.getViewTreeObserver();
            }
            this.f997d0.removeGlobalOnLayoutListener(this.X);
            this.f997d0 = null;
        }
        this.f995b0.removeOnAttachStateChangeListener(this.Y);
        PopupWindow.OnDismissListener onDismissListener = this.Z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void s(View view) {
        this.f994a0 = view;
    }

    public void u(boolean z10) {
        this.R.e(z10);
    }

    public void v(int i10) {
        this.f1001h0 = i10;
    }

    public void w(int i10) {
        this.W.f(i10);
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.Z = onDismissListener;
    }

    public void y(boolean z10) {
        this.f1002i0 = z10;
    }

    public void z(int i10) {
        this.W.l(i10);
    }
}
