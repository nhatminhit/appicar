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
import d.g1;
import d.m0;
import d.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4.d;
import t4.k;

@Deprecated
public abstract class r<T extends View, Z> extends b<Z> {
    public static final String U = "ViewTarget";
    public static boolean V;
    public static int W = i.e.glide_custom_view_target_tag;
    public final T P;
    public final b Q;
    @o0
    public View.OnAttachStateChangeListener R;
    public boolean S;
    public boolean T;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        public void onViewAttachedToWindow(View view) {
            r.this.p();
        }

        public void onViewDetachedFromWindow(View view) {
            r.this.n();
        }
    }

    @g1
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f11898e = 0;
        @o0
        @g1

        /* renamed from: f  reason: collision with root package name */
        public static Integer f11899f;

        /* renamed from: a  reason: collision with root package name */
        public final View f11900a;

        /* renamed from: b  reason: collision with root package name */
        public final List<o> f11901b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public boolean f11902c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public a f11903d;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<b> O;

            public a(@m0 b bVar) {
                this.O = new WeakReference<>(bVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(r.U, 2)) {
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
            this.f11900a = view;
        }

        public static int c(@m0 Context context) {
            if (f11899f == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f11899f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f11899f.intValue();
        }

        public void a() {
            if (!this.f11901b.isEmpty()) {
                int g10 = g();
                int f10 = f();
                if (i(g10, f10)) {
                    j(g10, f10);
                    b();
                }
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f11900a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f11903d);
            }
            this.f11903d = null;
            this.f11901b.clear();
        }

        public void d(@m0 o oVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                oVar.d(g10, f10);
                return;
            }
            if (!this.f11901b.contains(oVar)) {
                this.f11901b.add(oVar);
            }
            if (this.f11903d == null) {
                ViewTreeObserver viewTreeObserver = this.f11900a.getViewTreeObserver();
                a aVar = new a(this);
                this.f11903d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f11902c && this.f11900a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f11900a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            Log.isLoggable(r.U, 4);
            return c(this.f11900a.getContext());
        }

        public final int f() {
            int paddingTop = this.f11900a.getPaddingTop() + this.f11900a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f11900a.getLayoutParams();
            return e(this.f11900a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f11900a.getPaddingLeft() + this.f11900a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f11900a.getLayoutParams();
            return e(this.f11900a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f11901b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        public void k(@m0 o oVar) {
            this.f11901b.remove(oVar);
        }
    }

    public r(@m0 T t10) {
        this.P = (View) k.d(t10);
        this.Q = new b(t10);
    }

    @Deprecated
    public r(@m0 T t10, boolean z10) {
        this(t10);
        if (z10) {
            v();
        }
    }

    @Deprecated
    public static void u(int i10) {
        if (!V) {
            W = i10;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    @m0
    public T d() {
        return this.P;
    }

    @d.i
    public void e(@m0 o oVar) {
        this.Q.k(oVar);
    }

    public void h(@o0 d dVar) {
        t(dVar);
    }

    @m0
    public final r<T, Z> i() {
        if (this.R != null) {
            return this;
        }
        this.R = new a();
        k();
        return this;
    }

    @o0
    public final Object j() {
        return this.P.getTag(W);
    }

    public final void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.R;
        if (onAttachStateChangeListener != null && !this.T) {
            this.P.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.T = true;
        }
    }

    @d.i
    public void l(@o0 Drawable drawable) {
        super.l(drawable);
        k();
    }

    public final void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.R;
        if (onAttachStateChangeListener != null && this.T) {
            this.P.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.T = false;
        }
    }

    public void n() {
        d q10 = q();
        if (q10 != null) {
            this.S = true;
            q10.clear();
            this.S = false;
        }
    }

    @d.i
    public void o(@m0 o oVar) {
        this.Q.d(oVar);
    }

    public void p() {
        d q10 = q();
        if (q10 != null && q10.g()) {
            q10.h();
        }
    }

    @o0
    public d q() {
        Object j10 = j();
        if (j10 == null) {
            return null;
        }
        if (j10 instanceof d) {
            return (d) j10;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @d.i
    public void r(@o0 Drawable drawable) {
        super.r(drawable);
        this.Q.b();
        if (!this.S) {
            m();
        }
    }

    public final void t(@o0 Object obj) {
        V = true;
        this.P.setTag(W, obj);
    }

    public String toString() {
        return "Target for: " + this.P;
    }

    @m0
    public final r<T, Z> v() {
        this.Q.f11902c = true;
        return this;
    }
}
