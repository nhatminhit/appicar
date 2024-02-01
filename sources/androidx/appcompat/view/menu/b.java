package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.j0;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import f.a;
import f1.w1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class b extends l.d implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: p0  reason: collision with root package name */
    public static final int f927p0 = a.k.abc_cascading_menu_item_layout;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f928q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f929r0 = 1;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f930s0 = 200;
    public final Context P;
    public final int Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final Handler U;
    public final List<e> V = new ArrayList();
    public final List<d> W = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener X = new a();
    public final View.OnAttachStateChangeListener Y = new C0021b();
    public final j0 Z = new c();

    /* renamed from: a0  reason: collision with root package name */
    public int f931a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public int f932b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public View f933c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f934d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f935e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f936f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f937g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f938h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f939i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f940j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f941k0;

    /* renamed from: l0  reason: collision with root package name */
    public j.a f942l0;

    /* renamed from: m0  reason: collision with root package name */
    public ViewTreeObserver f943m0;

    /* renamed from: n0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f944n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f945o0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (b.this.c() && b.this.W.size() > 0 && !b.this.W.get(0).f946a.L()) {
                View view = b.this.f934d0;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.W) {
                    dVar.f946a.a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0021b implements View.OnAttachStateChangeListener {
        public C0021b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f943m0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f943m0 = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f943m0.removeGlobalOnLayoutListener(bVar.X);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements j0 {

        public class a implements Runnable {
            public final /* synthetic */ d O;
            public final /* synthetic */ MenuItem P;
            public final /* synthetic */ e Q;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.O = dVar;
                this.P = menuItem;
                this.Q = eVar;
            }

            public void run() {
                d dVar = this.O;
                if (dVar != null) {
                    b.this.f945o0 = true;
                    dVar.f947b.f(false);
                    b.this.f945o0 = false;
                }
                if (this.P.isEnabled() && this.P.hasSubMenu()) {
                    this.Q.O(this.P, 4);
                }
            }
        }

        public c() {
        }

        public void e(@m0 e eVar, @m0 MenuItem menuItem) {
            d dVar = null;
            b.this.U.removeCallbacksAndMessages((Object) null);
            int size = b.this.W.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.W.get(i10).f947b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                int i11 = i10 + 1;
                if (i11 < b.this.W.size()) {
                    dVar = b.this.W.get(i11);
                }
                b.this.U.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void h(@m0 e eVar, @m0 MenuItem menuItem) {
            b.this.U.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f946a;

        /* renamed from: b  reason: collision with root package name */
        public final e f947b;

        /* renamed from: c  reason: collision with root package name */
        public final int f948c;

        public d(@m0 MenuPopupWindow menuPopupWindow, @m0 e eVar, int i10) {
            this.f946a = menuPopupWindow;
            this.f947b = eVar;
            this.f948c = i10;
        }

        public ListView a() {
            return this.f946a.k();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public b(@m0 Context context, @m0 View view, @f int i10, @b1 int i11, boolean z10) {
        this.P = context;
        this.f933c0 = view;
        this.R = i10;
        this.S = i11;
        this.T = z10;
        this.f940j0 = false;
        this.f935e0 = G();
        Resources resources = context.getResources();
        this.Q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.abc_config_prefDialogWidth));
        this.U = new Handler();
    }

    public final MenuPopupWindow C() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.P, (AttributeSet) null, this.R, this.S);
        menuPopupWindow.r0(this.Z);
        menuPopupWindow.f0(this);
        menuPopupWindow.e0(this);
        menuPopupWindow.S(this.f933c0);
        menuPopupWindow.W(this.f932b0);
        menuPopupWindow.d0(true);
        menuPopupWindow.a0(2);
        return menuPopupWindow;
    }

    public final int D(@m0 e eVar) {
        int size = this.W.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.W.get(i10).f947b) {
                return i10;
            }
        }
        return -1;
    }

    public final MenuItem E(@m0 e eVar, @m0 e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @o0
    public final View F(@m0 d dVar, @m0 e eVar) {
        int i10;
        d dVar2;
        int firstVisiblePosition;
        MenuItem E = E(dVar.f947b, eVar);
        if (E == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (E == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int G() {
        return w1.X(this.f933c0) == 1 ? 0 : 1;
    }

    public final int H(int i10) {
        List<d> list = this.W;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f934d0.getWindowVisibleDisplayFrame(rect);
        return this.f935e0 == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void I(@m0 e eVar) {
        View view;
        d dVar;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.P);
        d dVar2 = new d(eVar, from, this.T, f927p0);
        if (!c() && this.f940j0) {
            dVar2.e(true);
        } else if (c()) {
            dVar2.e(l.d.A(eVar));
        }
        int r10 = l.d.r(dVar2, (ViewGroup) null, this.P, this.Q);
        MenuPopupWindow C = C();
        C.q(dVar2);
        C.U(r10);
        C.W(this.f932b0);
        if (this.W.size() > 0) {
            List<d> list = this.W;
            dVar = list.get(list.size() - 1);
            view = F(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.s0(false);
            C.p0((Object) null);
            int H = H(r10);
            boolean z10 = H == 1;
            this.f935e0 = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.S(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f933c0.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f932b0 & 7) == 5) {
                    iArr[0] = iArr[0] + this.f933c0.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f932b0 & 5) != 5) {
                if (z10) {
                    r10 = view.getWidth();
                }
                i12 = i10 - r10;
                C.f(i12);
                C.h0(true);
                C.l(i11);
            } else if (!z10) {
                r10 = view.getWidth();
                i12 = i10 - r10;
                C.f(i12);
                C.h0(true);
                C.l(i11);
            }
            i12 = i10 + r10;
            C.f(i12);
            C.h0(true);
            C.l(i11);
        } else {
            if (this.f936f0) {
                C.f(this.f938h0);
            }
            if (this.f937g0) {
                C.l(this.f939i0);
            }
            C.X(q());
        }
        this.W.add(new d(C, eVar, this.f935e0));
        C.a();
        ListView k10 = C.k();
        k10.setOnKeyListener(this);
        if (dVar == null && this.f941k0 && eVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(a.k.abc_popup_menu_header_item_layout, k10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.A());
            k10.addHeaderView(frameLayout, (Object) null, false);
            C.a();
        }
    }

    public void a() {
        if (!c()) {
            for (e I : this.V) {
                I(I);
            }
            this.V.clear();
            View view = this.f933c0;
            this.f934d0 = view;
            if (view != null) {
                boolean z10 = this.f943m0 == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f943m0 = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.X);
                }
                this.f934d0.addOnAttachStateChangeListener(this.Y);
            }
        }
    }

    public void b(e eVar, boolean z10) {
        int D = D(eVar);
        if (D >= 0) {
            int i10 = D + 1;
            if (i10 < this.W.size()) {
                this.W.get(i10).f947b.f(false);
            }
            d remove = this.W.remove(D);
            remove.f947b.S(this);
            if (this.f945o0) {
                remove.f946a.q0((Object) null);
                remove.f946a.T(0);
            }
            remove.f946a.dismiss();
            int size = this.W.size();
            this.f935e0 = size > 0 ? this.W.get(size - 1).f948c : G();
            if (size == 0) {
                dismiss();
                j.a aVar = this.f942l0;
                if (aVar != null) {
                    aVar.b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f943m0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f943m0.removeGlobalOnLayoutListener(this.X);
                    }
                    this.f943m0 = null;
                }
                this.f934d0.removeOnAttachStateChangeListener(this.Y);
                this.f944n0.onDismiss();
            } else if (z10) {
                this.W.get(0).f947b.f(false);
            }
        }
    }

    public boolean c() {
        return this.W.size() > 0 && this.W.get(0).f946a.c();
    }

    public void d(boolean z10) {
        for (d a10 : this.W) {
            l.d.B(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        int size = this.W.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.W.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f946a.c()) {
                    dVar.f946a.dismiss();
                }
            }
        }
    }

    public boolean e() {
        return false;
    }

    public void h(j.a aVar) {
        this.f942l0 = aVar;
    }

    public void j(Parcelable parcelable) {
    }

    public ListView k() {
        if (this.W.isEmpty()) {
            return null;
        }
        List<d> list = this.W;
        return list.get(list.size() - 1).a();
    }

    public boolean l(m mVar) {
        for (d next : this.W) {
            if (mVar == next.f947b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        o(mVar);
        j.a aVar = this.f942l0;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    public Parcelable n() {
        return null;
    }

    public void o(e eVar) {
        eVar.c(this, this.P);
        if (c()) {
            I(eVar);
        } else {
            this.V.add(eVar);
        }
    }

    public void onDismiss() {
        d dVar;
        int size = this.W.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.W.get(i10);
            if (!dVar.f946a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f947b.f(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean p() {
        return false;
    }

    public void s(@m0 View view) {
        if (this.f933c0 != view) {
            this.f933c0 = view;
            this.f932b0 = f1.j.d(this.f931a0, w1.X(view));
        }
    }

    public void u(boolean z10) {
        this.f940j0 = z10;
    }

    public void v(int i10) {
        if (this.f931a0 != i10) {
            this.f931a0 = i10;
            this.f932b0 = f1.j.d(i10, w1.X(this.f933c0));
        }
    }

    public void w(int i10) {
        this.f936f0 = true;
        this.f938h0 = i10;
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f944n0 = onDismissListener;
    }

    public void y(boolean z10) {
        this.f941k0 = z10;
    }

    public void z(int i10) {
        this.f937g0 = true;
        this.f939i0 = i10;
    }
}
