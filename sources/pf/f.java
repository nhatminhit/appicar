package pf;

import be.w;
import fh.g;
import fh.h;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import le.d;
import zd.i0;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "", "Lpf/c1;", "deferreds", "", "b", "([Lpf/c1;Lie/d;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lie/d;)Ljava/lang/Object;", "Lpf/n2;", "jobs", "Lzd/u2;", "d", "([Lpf/n2;Lie/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f {

    @le.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {0}, l = {54}, m = "joinAll", n = {"$this$forEach$iv"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends d {
        public Object R;
        public int S;
        public int T;
        public /* synthetic */ Object U;
        public int V;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return f.d((n2[]) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {66}, m = "joinAll", n = {}, s = {})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b extends d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public b(ie.d<? super b> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return f.c((Collection<? extends n2>) null, this);
        }
    }

    @h
    public static final <T> Object a(@g Collection<? extends c1<? extends T>> collection, @g ie.d<? super List<? extends T>> dVar) {
        if (collection.isEmpty()) {
            return w.E();
        }
        Object[] array = collection.toArray(new c1[0]);
        if (array != null) {
            return new e((c1[]) array).b(dVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @h
    public static final <T> Object b(@g c1<? extends T>[] c1VarArr, @g ie.d<? super List<? extends T>> dVar) {
        return c1VarArr.length == 0 ? w.E() : new e(c1VarArr).b(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(@fh.g java.util.Collection<? extends pf.n2> r4, @fh.g ie.d<? super zd.u2> r5) {
        /*
            boolean r0 = r5 instanceof pf.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            pf.f$b r0 = (pf.f.b) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            pf.f$b r0 = new pf.f$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            java.util.Iterator r4 = (java.util.Iterator) r4
            zd.e1.n(r5)
            goto L_0x003c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x003c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r4.next()
            pf.n2 r5 = (pf.n2) r5
            r0.R = r4
            r0.T = r3
            java.lang.Object r5 = r5.L1(r0)
            if (r5 != r1) goto L_0x003c
            return r1
        L_0x0053:
            zd.u2 r4 = zd.u2.f25116a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.f.c(java.util.Collection, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(@fh.g pf.n2[] r6, @fh.g ie.d<? super zd.u2> r7) {
        /*
            boolean r0 = r7 instanceof pf.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pf.f$a r0 = (pf.f.a) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            pf.f$a r0 = new pf.f$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            int r6 = r0.T
            int r2 = r0.S
            java.lang.Object r4 = r0.R
            pf.n2[] r4 = (pf.n2[]) r4
            zd.e1.n(r7)
            r7 = r4
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            zd.e1.n(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L_0x0043:
            if (r2 >= r6) goto L_0x0058
            r4 = r7[r2]
            r0.R = r7
            r0.S = r2
            r0.T = r6
            r0.V = r3
            java.lang.Object r4 = r4.L1(r0)
            if (r4 != r1) goto L_0x0056
            return r1
        L_0x0056:
            int r2 = r2 + r3
            goto L_0x0043
        L_0x0058:
            zd.u2 r6 = zd.u2.f25116a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.f.d(pf.n2[], ie.d):java.lang.Object");
    }
}
