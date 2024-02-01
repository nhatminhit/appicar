package f1;

import android.view.View;
import android.view.ViewGroup;
import d.r0;
import d.t0;
import fh.g;
import fh.h;
import ie.d;
import java.util.Iterator;
import kotlin.Metadata;
import le.f;
import le.k;
import p000if.m;
import p000if.o;
import p000if.q;
import we.l;
import we.p;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\b\u001a3\u0010\u0011\u001a\u00020\b*\u00020\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\rH\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\b*\u00020\u000026\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0012H\bø\u0001\u0000\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u00020\u0000H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\b*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0001H\b\u001a5\u0010\u001d\u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\b\u001a5\u0010 \u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u001e\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\b\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010%\u0002\u0007\n\u0005\b20\u0001¨\u0006)"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "d", "view", "", "a", "Lzd/u2;", "l", "k", "h", "i", "Lkotlin/Function1;", "Lzd/v0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "j", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "m", "left", "top", "right", "bottom", "n", "start", "end", "p", "g", "(Landroid/view/ViewGroup;)I", "Lif/m;", "e", "(Landroid/view/ViewGroup;)Lif/m;", "children", "f", "descendants", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class p2 {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"f1/p2$a", "Lif/m;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements m<View> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7227a;

        public a(ViewGroup viewGroup) {
            this.f7227a = viewGroup;
        }

        @g
        public Iterator<View> iterator() {
            return p2.j(this.f7227a);
        }
    }

    @f(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 1, 1}, l = {97, 99}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lif/o;", "Landroid/view/View;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends k implements p<o<? super View>, d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public int T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ ViewGroup W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, d<? super b> dVar) {
            super(2, dVar);
            this.W = viewGroup;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(this.W, dVar);
            bVar.V = obj;
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
            if (r4 < r5) goto L_0x004f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r10.U
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x003e
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                int r1 = r10.T
                int r4 = r10.S
                java.lang.Object r5 = r10.Q
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r10.V
                if.o r6 = (p000if.o) r6
                zd.e1.n(r11)
                r7 = r10
                goto L_0x0093
            L_0x0020:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0028:
                int r1 = r10.T
                int r4 = r10.S
                java.lang.Object r5 = r10.R
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r10.Q
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r10.V
                if.o r7 = (p000if.o) r7
                zd.e1.n(r11)
                r11 = r7
                r7 = r10
                goto L_0x0073
            L_0x003e:
                zd.e1.n(r11)
                java.lang.Object r11 = r10.V
                if.o r11 = (p000if.o) r11
                android.view.ViewGroup r1 = r10.W
                r4 = 0
                int r5 = r1.getChildCount()
                if (r5 <= 0) goto L_0x009e
                r6 = r10
            L_0x004f:
                int r7 = r4 + 1
                android.view.View r4 = r1.getChildAt(r4)
                java.lang.String r8 = "getChildAt(index)"
                xe.l0.o(r4, r8)
                r6.V = r11
                r6.Q = r1
                r6.R = r4
                r6.S = r7
                r6.T = r5
                r6.U = r3
                java.lang.Object r8 = r11.a(r4, r6)
                if (r8 != r0) goto L_0x006d
                return r0
            L_0x006d:
                r9 = r6
                r6 = r1
                r1 = r5
                r5 = r4
                r4 = r7
                r7 = r9
            L_0x0073:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L_0x0099
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                if.m r5 = f1.p2.f(r5)
                r7.V = r11
                r7.Q = r6
                r8 = 0
                r7.R = r8
                r7.S = r4
                r7.T = r1
                r7.U = r2
                java.lang.Object r5 = r11.b(r5, r7)
                if (r5 != r0) goto L_0x0091
                return r0
            L_0x0091:
                r5 = r6
                r6 = r11
            L_0x0093:
                r11 = r6
                r6 = r7
                r9 = r5
                r5 = r1
                r1 = r9
                goto L_0x009c
            L_0x0099:
                r5 = r1
                r1 = r6
                r6 = r7
            L_0x009c:
                if (r4 < r5) goto L_0x004f
            L_0x009e:
                zd.u2 r11 = zd.u2.f25116a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.p2.b.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: N */
        public final Object g0(@g o<? super View> oVar, @h d<? super u2> dVar) {
            return ((b) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"f1/p2$c", "", "Landroid/view/View;", "", "hasNext", "a", "Lzd/u2;", "remove", "", "O", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements Iterator<View>, ye.d {
        public int O;
        public final /* synthetic */ ViewGroup P;

        public c(ViewGroup viewGroup) {
            this.P = viewGroup;
        }

        @g
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.O < this.P.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.P;
            int i10 = this.O - 1;
            this.O = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final boolean a(@g ViewGroup viewGroup, @g View view) {
        l0.p(viewGroup, "<this>");
        l0.p(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@g ViewGroup viewGroup, @g l<? super View, u2> lVar) {
        l0.p(viewGroup, "<this>");
        l0.p(lVar, "action");
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                l0.o(childAt, "getChildAt(index)");
                lVar.A(childAt);
                if (i11 < childCount) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final void c(@g ViewGroup viewGroup, @g p<? super Integer, ? super View, u2> pVar) {
        l0.p(viewGroup, "<this>");
        l0.p(pVar, "action");
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Integer valueOf = Integer.valueOf(i10);
                View childAt = viewGroup.getChildAt(i10);
                l0.o(childAt, "getChildAt(index)");
                pVar.g0(valueOf, childAt);
                if (i11 < childCount) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    @g
    public static final View d(@g ViewGroup viewGroup, int i10) {
        l0.p(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }

    @g
    public static final m<View> e(@g ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        return new a(viewGroup);
    }

    @g
    public static final m<View> f(@g ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        return q.b(new b(viewGroup, (d<? super b>) null));
    }

    public static final int g(@g ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean h(@g ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean i(@g ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    @g
    public static final Iterator<View> j(@g ViewGroup viewGroup) {
        l0.p(viewGroup, "<this>");
        return new c(viewGroup);
    }

    public static final void k(@g ViewGroup viewGroup, @g View view) {
        l0.p(viewGroup, "<this>");
        l0.p(view, "view");
        viewGroup.removeView(view);
    }

    public static final void l(@g ViewGroup viewGroup, @g View view) {
        l0.p(viewGroup, "<this>");
        l0.p(view, "view");
        viewGroup.addView(view);
    }

    public static final void m(@g ViewGroup.MarginLayoutParams marginLayoutParams, @r0 int i10) {
        l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void n(@g ViewGroup.MarginLayoutParams marginLayoutParams, @r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    @t0(17)
    public static final void p(@g ViewGroup.MarginLayoutParams marginLayoutParams, @r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void q(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}
