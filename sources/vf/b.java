package vf;

import fh.g;
import fh.h;
import java.util.Arrays;
import kotlin.Metadata;
import uf.t0;
import vf.d;
import we.l;
import xe.l0;
import zd.d1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\bR>\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lvf/b;", "Lvf/d;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "i", "()Lvf/d;", "", "size", "", "j", "(I)[Lvf/d;", "g", "slot", "Lzd/u2;", "m", "(Lvf/d;)V", "Lkotlin/Function1;", "block", "l", "<set-?>", "O", "[Lvf/d;", "o", "()[Lvf/d;", "getSlots$annotations", "()V", "slots", "P", "I", "n", "()I", "nCollectors", "Q", "nextIndex", "Lvf/a0;", "R", "Lvf/a0;", "_subscriptionCount", "Luf/t0;", "F", "()Luf/t0;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class b<S extends d<?>> {
    @h
    public S[] O;
    public int P;
    public int Q;
    @h
    public a0 R;

    public static /* synthetic */ void p() {
    }

    @g
    public final t0<Integer> F() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.R;
            if (a0Var == null) {
                a0Var = new a0(this.P);
                this.R = a0Var;
            }
        }
        return a0Var;
    }

    @g
    public final S g() {
        S s10;
        a0 a0Var;
        synchronized (this) {
            S[] sArr = this.O;
            if (sArr == null) {
                sArr = j(2);
                this.O = sArr;
            } else if (this.P >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                l0.o(copyOf, "copyOf(this, newSize)");
                this.O = (d[]) copyOf;
                sArr = (d[]) copyOf;
            }
            int i10 = this.Q;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = i();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.Q = i10;
            this.P++;
            a0Var = this.R;
        }
        if (a0Var != null) {
            a0Var.h0(1);
        }
        return s10;
    }

    @g
    public abstract S i();

    @g
    public abstract S[] j(int i10);

    public final void l(@g l<? super S, u2> lVar) {
        d[] f10;
        if (this.P != 0 && (f10 = this.O) != null) {
            for (d dVar : f10) {
                if (dVar != null) {
                    lVar.A(dVar);
                }
            }
        }
    }

    public final void m(@g S s10) {
        a0 a0Var;
        int i10;
        ie.d[] b10;
        synchronized (this) {
            int i11 = this.P - 1;
            this.P = i11;
            a0Var = this.R;
            if (i11 == 0) {
                this.Q = 0;
            }
            b10 = s10.b(this);
        }
        for (ie.d dVar : b10) {
            if (dVar != null) {
                d1.a aVar = d1.P;
                dVar.x(d1.b(u2.f25116a));
            }
        }
        if (a0Var != null) {
            a0Var.h0(-1);
        }
    }

    public final int n() {
        return this.P;
    }

    @h
    public final S[] o() {
        return this.O;
    }
}
