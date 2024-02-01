package u1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import d.v;
import d.x0;
import f1.w1;
import java.util.ArrayList;
import u1.a;
import u1.b;

public abstract class b<T extends b<T>> implements a.b {
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    public static final float E = Float.MAX_VALUE;
    public static final float F = 0.75f;

    /* renamed from: m  reason: collision with root package name */
    public static final s f13420m = new g(v.e.f13924t);

    /* renamed from: n  reason: collision with root package name */
    public static final s f13421n = new h(v.e.f13925u);

    /* renamed from: o  reason: collision with root package name */
    public static final s f13422o = new i(v.e.f13926v);

    /* renamed from: p  reason: collision with root package name */
    public static final s f13423p = new j(v.e.f13919o);

    /* renamed from: q  reason: collision with root package name */
    public static final s f13424q = new k(v.e.f13920p);

    /* renamed from: r  reason: collision with root package name */
    public static final s f13425r = new l(v.e.f13913i);

    /* renamed from: s  reason: collision with root package name */
    public static final s f13426s = new m(v.e.f13914j);

    /* renamed from: t  reason: collision with root package name */
    public static final s f13427t = new n(v.e.f13915k);

    /* renamed from: u  reason: collision with root package name */
    public static final s f13428u = new o("x");

    /* renamed from: v  reason: collision with root package name */
    public static final s f13429v = new a("y");

    /* renamed from: w  reason: collision with root package name */
    public static final s f13430w = new C0225b("z");

    /* renamed from: x  reason: collision with root package name */
    public static final s f13431x = new c(v.e.f13911g);

    /* renamed from: y  reason: collision with root package name */
    public static final s f13432y = new d("scrollX");

    /* renamed from: z  reason: collision with root package name */
    public static final s f13433z = new e("scrollY");

    /* renamed from: a  reason: collision with root package name */
    public float f13434a;

    /* renamed from: b  reason: collision with root package name */
    public float f13435b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13436c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13437d;

    /* renamed from: e  reason: collision with root package name */
    public final d f13438e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13439f;

    /* renamed from: g  reason: collision with root package name */
    public float f13440g;

    /* renamed from: h  reason: collision with root package name */
    public float f13441h;

    /* renamed from: i  reason: collision with root package name */
    public long f13442i;

    /* renamed from: j  reason: collision with root package name */
    public float f13443j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<q> f13444k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<r> f13445l;

    public static class a extends s {
        public a(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getY();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setY(f10);
        }
    }

    /* renamed from: u1.b$b  reason: collision with other inner class name */
    public static class C0225b extends s {
        public C0225b(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return w1.E0(view);
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            w1.z2(view, f10);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getAlpha();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f13446b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, e eVar) {
            super(str);
            this.f13446b = eVar;
        }

        public float b(Object obj) {
            return this.f13446b.a();
        }

        public void c(Object obj, float f10) {
            this.f13446b.b(f10);
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getTranslationX();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getTranslationY();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return w1.z0(view);
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            w1.u2(view, f10);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getScaleX();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getScaleY();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getRotation();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getRotationX();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getRotationY();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, (g) null);
        }

        /* renamed from: d */
        public float b(View view) {
            return view.getX();
        }

        /* renamed from: e */
        public void c(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public float f13448a;

        /* renamed from: b  reason: collision with root package name */
        public float f13449b;
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void a(b bVar, float f10, float f11);
    }

    public static abstract class s extends d<View> {
        public s(String str) {
            super(str);
        }

        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }
    }

    public <K> b(K k10, d<K> dVar) {
        float f10;
        this.f13434a = 0.0f;
        this.f13435b = Float.MAX_VALUE;
        this.f13436c = false;
        this.f13439f = false;
        this.f13440g = Float.MAX_VALUE;
        this.f13441h = -Float.MAX_VALUE;
        this.f13442i = 0;
        this.f13444k = new ArrayList<>();
        this.f13445l = new ArrayList<>();
        this.f13437d = k10;
        this.f13438e = dVar;
        if (dVar == f13425r || dVar == f13426s || dVar == f13427t) {
            f10 = 0.1f;
        } else if (dVar == f13431x || dVar == f13423p || dVar == f13424q) {
            this.f13443j = 0.00390625f;
            return;
        } else {
            f10 = 1.0f;
        }
        this.f13443j = f10;
    }

    public b(e eVar) {
        this.f13434a = 0.0f;
        this.f13435b = Float.MAX_VALUE;
        this.f13436c = false;
        this.f13439f = false;
        this.f13440g = Float.MAX_VALUE;
        this.f13441h = -Float.MAX_VALUE;
        this.f13442i = 0;
        this.f13444k = new ArrayList<>();
        this.f13445l = new ArrayList<>();
        this.f13437d = null;
        this.f13438e = new f("FloatValueHolder", eVar);
        this.f13443j = 1.0f;
    }

    public static <T> void m(ArrayList<T> arrayList, T t10) {
        int indexOf = arrayList.indexOf(t10);
        if (indexOf >= 0) {
            arrayList.set(indexOf, (Object) null);
        }
    }

    public static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @x0({x0.a.LIBRARY})
    public boolean a(long j10) {
        long j11 = this.f13442i;
        if (j11 == 0) {
            this.f13442i = j10;
            s(this.f13435b);
            return false;
        }
        this.f13442i = j10;
        boolean y10 = y(j10 - j11);
        float min = Math.min(this.f13435b, this.f13440g);
        this.f13435b = min;
        float max = Math.max(min, this.f13441h);
        this.f13435b = max;
        s(max);
        if (y10) {
            e(false);
        }
        return y10;
    }

    public T b(q qVar) {
        if (!this.f13444k.contains(qVar)) {
            this.f13444k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (!k()) {
            if (!this.f13445l.contains(rVar)) {
                this.f13445l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f13439f) {
            e(true);
        }
    }

    public final void e(boolean z10) {
        this.f13439f = false;
        a.e().h(this);
        this.f13442i = 0;
        this.f13436c = false;
        for (int i10 = 0; i10 < this.f13444k.size(); i10++) {
            if (this.f13444k.get(i10) != null) {
                this.f13444k.get(i10).a(this, z10, this.f13435b, this.f13434a);
            }
        }
        n(this.f13444k);
    }

    public abstract float f(float f10, float f11);

    public float g() {
        return this.f13443j;
    }

    public final float h() {
        return this.f13438e.b(this.f13437d);
    }

    public float i() {
        return this.f13443j * 0.75f;
    }

    public abstract boolean j(float f10, float f11);

    public boolean k() {
        return this.f13439f;
    }

    public void l(q qVar) {
        m(this.f13444k, qVar);
    }

    public void o(r rVar) {
        m(this.f13445l, rVar);
    }

    public T p(float f10) {
        this.f13440g = f10;
        return this;
    }

    public T q(float f10) {
        this.f13441h = f10;
        return this;
    }

    public T r(@v(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 > 0.0f) {
            this.f13443j = f10;
            v(f10 * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public void s(float f10) {
        this.f13438e.c(this.f13437d, f10);
        for (int i10 = 0; i10 < this.f13445l.size(); i10++) {
            if (this.f13445l.get(i10) != null) {
                this.f13445l.get(i10).a(this, this.f13435b, this.f13434a);
            }
        }
        n(this.f13445l);
    }

    public T t(float f10) {
        this.f13435b = f10;
        this.f13436c = true;
        return this;
    }

    public T u(float f10) {
        this.f13434a = f10;
        return this;
    }

    public abstract void v(float f10);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f13439f) {
            x();
        }
    }

    public final void x() {
        if (!this.f13439f) {
            this.f13439f = true;
            if (!this.f13436c) {
                this.f13435b = h();
            }
            float f10 = this.f13435b;
            if (f10 > this.f13440g || f10 < this.f13441h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            a.e().a(this, 0);
        }
    }

    public abstract boolean y(long j10);
}
