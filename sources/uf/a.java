package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.d;
import le.f;
import pf.d2;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Luf/a;", "T", "Luf/i;", "Luf/c;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "e", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@d2
public abstract class a<T> implements i<T>, c<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: uf.a$a  reason: collision with other inner class name */
    public static final class C0428a extends d {
        public Object R;
        public /* synthetic */ Object S;
        public final /* synthetic */ a<T> T;
        public int U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0428a(a<T> aVar, ie.d<? super C0428a> dVar) {
            super(dVar);
            this.T = aVar;
        }

        @h
        public final Object K(@g Object obj) {
            this.S = obj;
            this.U |= Integer.MIN_VALUE;
            return this.T.a((j) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(@fh.g uf.j<? super T> r6, @fh.g ie.d<? super zd.u2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uf.a.C0428a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uf.a$a r0 = (uf.a.C0428a) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            uf.a$a r0 = new uf.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.R
            vf.v r6 = (vf.v) r6
            zd.e1.n(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            zd.e1.n(r7)
            vf.v r7 = new vf.v
            ie.g r2 = r0.e()
            r7.<init>(r6, r2)
            r0.R = r7     // Catch:{ all -> 0x0055 }
            r0.U = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.e(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.L()
            zd.u2 r6 = zd.u2.f25116a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.L()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.a.a(uf.j, ie.d):java.lang.Object");
    }

    @h
    public abstract Object e(@g j<? super T> jVar, @g ie.d<? super u2> dVar);
}
