package pf;

import fh.g;
import fh.h;
import ie.g;
import kotlin.Metadata;
import lf.c0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import xe.l0;
import xe.w;
import zd.i2;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lpf/s0;", "Lpf/s3;", "", "Lie/a;", "toString", "Lie/g;", "context", "S1", "oldState", "Lzd/u2;", "R1", "", "N1", "id", "O1", "", "hashCode", "", "other", "", "equals", "P", "J", "Q1", "()J", "<init>", "(J)V", "Q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
public final class s0 extends ie.a implements s3<String> {
    @g
    public static final a Q = new a((w) null);
    public final long P;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpf/s0$a;", "Lie/g$c;", "Lpf/s0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements g.c<s0> {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public s0(long j10) {
        super(Q);
        this.P = j10;
    }

    public static /* synthetic */ s0 P1(s0 s0Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = s0Var.P;
        }
        return s0Var.O1(j10);
    }

    public final long N1() {
        return this.P;
    }

    @fh.g
    public final s0 O1(long j10) {
        return new s0(j10);
    }

    public final long Q1() {
        return this.P;
    }

    /* renamed from: R1 */
    public void Z0(@fh.g ie.g gVar, @fh.g String str) {
        Thread.currentThread().setName(str);
    }

    @fh.g
    /* renamed from: S1 */
    public String z0(@fh.g ie.g gVar) {
        String str;
        t0 t0Var = (t0) gVar.g(t0.Q);
        if (t0Var == null || (str = t0Var.Q1()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int G3 = c0.G3(name, n0.f22018a, 0, false, 6, (Object) null);
        if (G3 < 0) {
            G3 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + G3 + 10);
        String substring = name.substring(0, G3);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(n0.f22018a);
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.P);
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && this.P == ((s0) obj).P;
    }

    public int hashCode() {
        return i2.a(this.P);
    }

    @fh.g
    public String toString() {
        return "CoroutineId(" + this.P + ')';
    }
}
