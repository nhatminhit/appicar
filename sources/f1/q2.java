package f1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.r0;
import d.t0;
import kotlin.Metadata;
import le.k;
import p000if.m;
import p000if.o;
import p000if.q;
import p000if.s;
import we.l;
import we.p;
import xe.h0;
import xe.l0;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\b\u001a(\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\bø\u0001\u0000\u001a(\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\bø\u0001\u0000\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a)\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\bø\u0001\u0000\u001a<\u0010'\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\"*\u0010/\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"*\u00102\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\"*\u00105\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.\"\u0016\u00108\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0016\u0010<\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00107\"\u0016\u0010>\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00107\"\u0016\u0010@\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00107\"\u0016\u0010B\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00107\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bH\u0010F\u0002\u0007\n\u0005\b20\u0001¨\u0006J"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lzd/v0;", "name", "view", "Lzd/u2;", "action", "d", "c", "Lf1/s0;", "e", "a", "b", "", "start", "top", "end", "bottom", "C", "left", "right", "A", "size", "w", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "s", "t", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "f", "Landroid/view/ViewGroup$LayoutParams;", "Lzd/u;", "block", "y", "T", "z", "(Landroid/view/View;Lwe/l;)V", "", "value", "r", "(Landroid/view/View;)Z", "x", "(Landroid/view/View;Z)V", "isVisible", "q", "v", "isInvisible", "p", "u", "isGone", "l", "(Landroid/view/View;)I", "marginLeft", "o", "marginTop", "m", "marginRight", "j", "marginBottom", "n", "marginStart", "k", "marginEnd", "Lif/m;", "Landroid/view/ViewParent;", "i", "(Landroid/view/View;)Lif/m;", "ancestors", "h", "allViews", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class q2 {

    @le.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {406, 408}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lif/o;", "Landroid/view/View;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends k implements p<o<? super View>, ie.d<? super u2>, Object> {
        public int Q;
        public /* synthetic */ Object R;
        public final /* synthetic */ View S;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, ie.d<? super a> dVar) {
            super(2, dVar);
            this.S = view;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            a aVar = new a(this.S, dVar);
            aVar.R = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: if.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r4.Q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                zd.e1.n(r5)
                goto L_0x004f
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                java.lang.Object r1 = r4.R
                if.o r1 = (p000if.o) r1
                zd.e1.n(r5)
                goto L_0x0037
            L_0x0022:
                zd.e1.n(r5)
                java.lang.Object r5 = r4.R
                r1 = r5
                if.o r1 = (p000if.o) r1
                android.view.View r5 = r4.S
                r4.R = r1
                r4.Q = r3
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L_0x0037
                return r0
            L_0x0037:
                android.view.View r5 = r4.S
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x004f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                if.m r5 = f1.p2.f(r5)
                r3 = 0
                r4.R = r3
                r4.Q = r2
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L_0x004f
                return r0
            L_0x004f:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.q2.a.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: N */
        public final Object g0(@fh.g o<? super View> oVar, @fh.h ie.d<? super u2> dVar) {
            return ((a) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @i0(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b extends h0 implements l<ViewParent, ViewParent> {
        public static final b X = new b();

        public b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        /* renamed from: z0 */
        public final ViewParent A(@fh.g ViewParent viewParent) {
            l0.p(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"f1/q2$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lzd/u2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View O;
        public final /* synthetic */ l<View, u2> P;

        public c(View view, l<? super View, u2> lVar) {
            this.O = view;
            this.P = lVar;
        }

        public void onViewAttachedToWindow(@fh.g View view) {
            l0.p(view, "view");
            this.O.removeOnAttachStateChangeListener(this);
            this.P.A(view);
        }

        public void onViewDetachedFromWindow(@fh.g View view) {
            l0.p(view, "view");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"f1/q2$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lzd/u2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View O;
        public final /* synthetic */ l<View, u2> P;

        public d(View view, l<? super View, u2> lVar) {
            this.O = view;
            this.P = lVar;
        }

        public void onViewAttachedToWindow(@fh.g View view) {
            l0.p(view, "view");
        }

        public void onViewDetachedFromWindow(@fh.g View view) {
            l0.p(view, "view");
            this.O.removeOnAttachStateChangeListener(this);
            this.P.A(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"f1/q2$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzd/u2;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements View.OnLayoutChangeListener {
        public final /* synthetic */ l O;

        public e(l lVar) {
            this.O = lVar;
        }

        public void onLayoutChange(@fh.g View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            l0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.O.A(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"f1/q2$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzd/u2;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class f implements View.OnLayoutChangeListener {
        public final /* synthetic */ l<View, u2> O;

        public f(l<? super View, u2> lVar) {
            this.O = lVar;
        }

        public void onLayoutChange(@fh.g View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            l0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.O.A(view);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g implements Runnable {
        public final /* synthetic */ l<View, u2> O;
        public final /* synthetic */ View P;

        public g(l<? super View, u2> lVar, View view) {
            this.O = lVar;
            this.P = view;
        }

        public final void run() {
            this.O.A(this.P);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h implements Runnable {
        public final /* synthetic */ we.a<u2> O;

        public h(we.a<u2> aVar) {
            this.O = aVar;
        }

        public final void run() {
            this.O.n();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i implements Runnable {
        public final /* synthetic */ we.a<u2> O;

        public i(we.a<u2> aVar) {
            this.O = aVar;
        }

        public final void run() {
            this.O.n();
        }
    }

    public static final void A(@fh.g View view, @r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        l0.p(view, "<this>");
        view.setPadding(i10, i11, i12, i13);
    }

    public static /* synthetic */ void B(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingLeft();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingRight();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        l0.p(view, "<this>");
        view.setPadding(i10, i11, i12, i13);
    }

    @t0(17)
    public static final void C(@fh.g View view, @r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        l0.p(view, "<this>");
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static /* synthetic */ void D(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingStart();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        l0.p(view, "<this>");
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static final void a(@fh.g View view, @fh.g l<? super View, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "action");
        if (w1.N0(view)) {
            lVar.A(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, lVar));
        }
    }

    public static final void b(@fh.g View view, @fh.g l<? super View, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "action");
        if (!w1.N0(view)) {
            lVar.A(view);
        } else {
            view.addOnAttachStateChangeListener(new d(view, lVar));
        }
    }

    public static final void c(@fh.g View view, @fh.g l<? super View, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "action");
        if (!w1.T0(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e(lVar));
        } else {
            lVar.A(view);
        }
    }

    public static final void d(@fh.g View view, @fh.g l<? super View, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "action");
        view.addOnLayoutChangeListener(new f(lVar));
    }

    @fh.g
    public static final s0 e(@fh.g View view, @fh.g l<? super View, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "action");
        s0 a10 = s0.a(view, new g(lVar, view));
        l0.o(a10, "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
        return a10;
    }

    @fh.g
    public static final Bitmap f(@fh.g View view, @fh.g Bitmap.Config config) {
        l0.p(view, "<this>");
        l0.p(config, "config");
        if (w1.T0(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            l0.o(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap g(View view, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return f(view, config);
    }

    @fh.g
    public static final m<View> h(@fh.g View view) {
        l0.p(view, "<this>");
        return q.b(new a(view, (ie.d<? super a>) null));
    }

    @fh.g
    public static final m<ViewParent> i(@fh.g View view) {
        l0.p(view, "<this>");
        return s.l(view.getParent(), b.X);
    }

    public static final int j(@fh.g View view) {
        l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.bottomMargin;
    }

    public static final int k(@fh.g View view) {
        l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return o.b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int l(@fh.g View view) {
        l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.leftMargin;
    }

    public static final int m(@fh.g View view) {
        l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.rightMargin;
    }

    public static final int n(@fh.g View view) {
        l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return o.c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int o(@fh.g View view) {
        l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    public static final boolean p(@fh.g View view) {
        l0.p(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean q(@fh.g View view) {
        l0.p(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean r(@fh.g View view) {
        l0.p(view, "<this>");
        return view.getVisibility() == 0;
    }

    @fh.g
    public static final Runnable s(@fh.g View view, long j10, @fh.g we.a<u2> aVar) {
        l0.p(view, "<this>");
        l0.p(aVar, "action");
        h hVar = new h(aVar);
        view.postDelayed(hVar, j10);
        return hVar;
    }

    @t0(16)
    @fh.g
    public static final Runnable t(@fh.g View view, long j10, @fh.g we.a<u2> aVar) {
        l0.p(view, "<this>");
        l0.p(aVar, "action");
        i iVar = new i(aVar);
        view.postOnAnimationDelayed(iVar, j10);
        return iVar;
    }

    public static final void u(@fh.g View view, boolean z10) {
        l0.p(view, "<this>");
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void v(@fh.g View view, boolean z10) {
        l0.p(view, "<this>");
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void w(@fh.g View view, @r0 int i10) {
        l0.p(view, "<this>");
        view.setPadding(i10, i10, i10, i10);
    }

    public static final void x(@fh.g View view, boolean z10) {
        l0.p(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }

    public static final void y(@fh.g View view, @fh.g l<? super ViewGroup.LayoutParams, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.A(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @ve.h(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void z(View view, l<? super T, u2> lVar) {
        l0.p(view, "<this>");
        l0.p(lVar, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        l0.y(1, w1.a.X4);
        lVar.A(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
