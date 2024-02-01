package rf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.d;
import le.f;
import zd.i0;
import zd.k;
import zd.m;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lrf/p;", "E", "", "", "b", "(Lie/d;)Ljava/lang/Object;", "a", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface p<E> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        @f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: rf.p$a$a  reason: collision with other inner class name */
        public static final class C0410a<E> extends d {
            public Object R;
            public /* synthetic */ Object S;
            public int T;

            public C0410a(ie.d<? super C0410a> dVar) {
                super(dVar);
            }

            @h
            public final Object K(@g Object obj) {
                this.S = obj;
                this.T |= Integer.MIN_VALUE;
                return a.a((p) null, this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @ve.h(name = "next")
        @zd.k(level = zd.m.Q, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.lang.Object a(rf.p r4, ie.d r5) {
            /*
                boolean r0 = r5 instanceof rf.p.a.C0410a
                if (r0 == 0) goto L_0x0013
                r0 = r5
                rf.p$a$a r0 = (rf.p.a.C0410a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                rf.p$a$a r0 = new rf.p$a$a
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.S
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r4 = r0.R
                rf.p r4 = (rf.p) r4
                zd.e1.n(r5)
                goto L_0x0043
            L_0x002d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0035:
                zd.e1.n(r5)
                r0.R = r4
                r0.T = r3
                java.lang.Object r5 = r4.b(r0)
                if (r5 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0050
                java.lang.Object r4 = r4.next()
                return r4
            L_0x0050:
                rf.x r4 = new rf.x
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.p.a.a(rf.p, ie.d):java.lang.Object");
        }
    }

    @ve.h(name = "next")
    @k(level = m.Q, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object a(ie.d dVar);

    @h
    Object b(@g ie.d<? super Boolean> dVar);

    E next();
}
