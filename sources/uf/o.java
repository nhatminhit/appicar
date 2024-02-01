package uf;

import fh.g;
import fh.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import le.d;
import le.f;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Luf/i;", "", "destination", "", "b", "(Luf/i;Ljava/util/List;Lie/d;)Ljava/lang/Object;", "", "", "d", "(Luf/i;Ljava/util/Set;Lie/d;)Ljava/lang/Object;", "", "C", "a", "(Luf/i;Ljava/util/Collection;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class o {

    @f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a<T, C extends Collection<? super T>> extends d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return k.V1((i) null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "C", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class b<T> implements j {
        public final /* synthetic */ C O;

        public b(C c10) {
            this.O = c10;
        }

        @h
        public final Object d(T t10, @g ie.d<? super u2> dVar) {
            this.O.add(t10);
            return u2.f25116a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@fh.g uf.i<? extends T> r4, @fh.g C r5, @fh.g ie.d<? super C> r6) {
        /*
            boolean r0 = r6 instanceof uf.o.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf.o$a r0 = (uf.o.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            uf.o$a r0 = new uf.o$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.R
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            zd.e1.n(r6)
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            zd.e1.n(r6)
            uf.o$b r6 = new uf.o$b
            r6.<init>(r5)
            r0.R = r5
            r0.T = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.o.a(uf.i, java.util.Collection, ie.d):java.lang.Object");
    }

    @h
    public static final <T> Object b(@g i<? extends T> iVar, @g List<T> list, @g ie.d<? super List<? extends T>> dVar) {
        return k.V1(iVar, list, dVar);
    }

    public static /* synthetic */ Object c(i iVar, List list, ie.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return k.W1(iVar, list, dVar);
    }

    @h
    public static final <T> Object d(@g i<? extends T> iVar, @g Set<T> set, @g ie.d<? super Set<? extends T>> dVar) {
        return k.V1(iVar, set, dVar);
    }

    public static /* synthetic */ Object e(i iVar, Set set, ie.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return k.Y1(iVar, set, dVar);
    }
}
