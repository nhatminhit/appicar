package wf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import pf.e1;
import pf.o0;
import pf.p1;
import pf.q;
import pf.z2;
import xe.w;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0002R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lwf/g0;", "Lpf/z2;", "Lpf/e1;", "Lie/g;", "context", "", "P1", "", "parallelism", "Lpf/o0;", "Q1", "", "time", "", "F1", "(JLie/d;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lpf/p1;", "W0", "U1", "Lpf/q;", "Lzd/u2;", "continuation", "W1", "", "toString", "V1", "", "Q", "Ljava/lang/Throwable;", "cause", "R", "Ljava/lang/String;", "errorHint", "S1", "()Lpf/z2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g0 extends z2 implements e1 {
    @h
    public final Throwable Q;
    @h
    public final String R;

    public g0(@h Throwable th2, @h String str) {
        this.Q = th2;
        this.R = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Throwable th2, String str, int i10, w wVar) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }

    @h
    public Object F1(long j10, @g d<?> dVar) {
        V1();
        throw new y();
    }

    public boolean P1(@g ie.g gVar) {
        V1();
        throw new y();
    }

    @g
    public o0 Q1(int i10) {
        V1();
        throw new y();
    }

    @g
    public z2 S1() {
        return this;
    }

    @g
    /* renamed from: U1 */
    public Void N1(@g ie.g gVar, @g Runnable runnable) {
        V1();
        throw new y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void V1() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.Q
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.R
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.Q
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            wf.f0.e()
            zd.y r0 = new zd.y
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.g0.V1():java.lang.Void");
    }

    @g
    public p1 W0(long j10, @g Runnable runnable, @g ie.g gVar) {
        V1();
        throw new y();
    }

    @g
    /* renamed from: W1 */
    public Void p1(long j10, @g q<? super u2> qVar) {
        V1();
        throw new y();
    }

    @g
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.Q != null) {
            str = ", cause=" + this.Q;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
