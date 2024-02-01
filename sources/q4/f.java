package q4;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.i;
import d.b0;
import d.g1;
import d.m0;
import d.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4.d;
import t4.k;

public abstract class f<T extends View, Z> implements p<Z> {
    public static final String T = "CustomViewTarget";
    @b0
    public static final int U = i.e.glide_custom_view_target_tag;
    public final b O;
    public final T P;
    @o0
    public View.OnAttachStateChangeListener Q;
    public boolean R;
    public boolean S;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        public void onViewAttachedToWindow(View view) {
            f.this.p();
        }

        public void onViewDetachedFromWindow(View view) {
            f.this.n();
        }
    }

    @g1
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f11883e = 0;
        @o0
        @g1

        /* renamed from: f  reason: collision with root package name */
        public static Integer f11884f;

        /* renamed from: a  reason: collision with root package name */
        public final View f11885a;

        /* renamed from: b  reason: collision with root package name */
        public final List<o> f11886b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public boolean f11887c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public a f11888d;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<b> O;

            public a(@m0 b bVar) {
                this.O = new WeakReference<>(bVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(f.T, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("OnGlobalLayoutListener called attachStateListener=");
                    sb2.append(this);
                }
                b bVar = this.O.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@m0 View view) {
            this.f11885a = view;
        }

        public static int c(@m0 Context context) {
            if (f11884f == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f11884f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f11884f.intValue();
        }

        public void a() {
            if (!this.f11886b.isEmpty()) {
                int g10 = g();
                int f10 = f();
                if (i(g10, f10)) {
                    j(g10, f10);
                    b();
                }
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f11885a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f11888d);
            }
            this.f11888d = null;
            this.f11886b.clear();
        }

        public void d(@m0 o oVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                oVar.d(g10, f10);
                return;
            }
            if (!this.f11886b.contains(oVar)) {
                this.f11886b.add(oVar);
            }
            if (this.f11888d == null) {
                ViewTreeObserver viewTreeObserver = this.f11885a.getViewTreeObserver();
                a aVar = new a(this);
                this.f11888d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f11887c && this.f11885a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f11885a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            Log.isLoggable(f.T, 4);
            return c(this.f11885a.getContext());
        }

        public final int f() {
            int paddingTop = this.f11885a.getPaddingTop() + this.f11885a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f11885a.getLayoutParams();
            return e(this.f11885a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f11885a.getPaddingLeft() + this.f11885a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f11885a.getLayoutParams();
            return e(this.f11885a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f11886b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        public void k(@m0 o oVar) {
            this.f11886b.remove(oVar);
        }
    }

    public f(@m0 T t10) {
        this.P = (View) k.d(t10);
        this.O = new b(t10);
    }

    public void a() {
    }

    public void b() {
    }

    @m0
    public final f<T, Z> c() {
        if (this.Q != null) {
            return this;
        }
        this.Q = new a();
        i();
        return this;
    }

    @o0
    public final Object d() {
        return this.P.getTag(U);
    }

    public final void e(@m0 o oVar) {
        this.O.k(oVar);
    }

    @m0
    public final T g() {
        return this.P;
    }

    public final void h(@o0 d dVar) {
        t(dVar);
    }

    public final void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Q;
        if (onAttachStateChangeListener != null && !this.S) {
            this.P.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.S = true;
        }
    }

    public final void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.Q;
        if (onAttachStateChangeListener != null && this.S) {
            this.P.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.S = false;
        }
    }

    public abstract void k(@o0 Drawable drawable);

    public final void l(@o0 Drawable drawable) {
        i();
        m(drawable);
    }

    public void m(@o0 Drawable drawable) {
    }

    public final void n() {
        d q10 = q();
        if (q10 != null) {
            this.R = true;
            q10.clear();
            this.R = false;
        }
    }

    public final void o(@m0 o oVar) {
        this.O.d(oVar);
    }

    public void onDestroy() {
    }

    public final void p() {
        d q10 = q();
        if (q10 != null && q10.g()) {
            q10.h();
        }
    }

    @o0
    public final d q() {
        Object d10 = d();
        if (d10 == null) {
            return null;
        }
        if (d10 instanceof d) {
            return (d) d10;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void r(@o0 Drawable drawable) {
        this.O.b();
        k(drawable);
        if (!this.R) {
            j();
        }
    }

    public final void t(@o0 Object obj) {
        this.P.setTag(U, obj);
    }

    public String toString() {
        return "Target for: " + this.P;
    }

    @Deprecated
    public final f<T, Z> u(@b0 int i10) {
        return this;
    }

    @m0
    public final f<T, Z> v() {
        this.O.f11887c = true;
        return this;
    }
}
