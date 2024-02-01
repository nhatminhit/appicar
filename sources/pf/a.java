package pf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import we.l;
import we.p;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00103\u001a\u00020&\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\f¢\u0006\u0004\b6\u00107J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010$\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!¢\u0006\u0002\b\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001d\u0010-\u001a\u00020&8\u0006¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00102\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lpf/a;", "T", "Lpf/v2;", "Lpf/n2;", "Lie/d;", "Lpf/u0;", "value", "Lzd/u2;", "H1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "G1", "", "p0", "", "state", "j1", "Lzd/d1;", "result", "x", "E1", "exception", "L0", "(Ljava/lang/Throwable;)V", "a1", "()Ljava/lang/String;", "R", "Lpf/w0;", "start", "receiver", "Lkotlin/Function2;", "Lzd/u;", "block", "I1", "(Lpf/w0;Ljava/lang/Object;Lwe/p;)V", "Lie/g;", "P", "Lie/g;", "e", "()Lie/g;", "getContext$annotations", "()V", "context", "H", "coroutineContext", "c", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lie/g;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
public abstract class a<T> extends v2 implements n2, d<T>, u0 {
    @g
    public final ie.g P;

    public a(@g ie.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            M0((n2) gVar.g(n2.D));
        }
        this.P = gVar.m1(this);
    }

    public static /* synthetic */ void F1() {
    }

    public void E1(@h Object obj) {
        f0(obj);
    }

    public void G1(@g Throwable th2, boolean z10) {
    }

    @g
    public ie.g H() {
        return this.P;
    }

    public void H1(T t10) {
    }

    public final <R> void I1(@g w0 w0Var, R r10, @g p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        w0Var.d(pVar, r10, this);
    }

    public final void L0(@g Throwable th2) {
        r0.b(this.P, th2);
    }

    @g
    public String a1() {
        String b10 = n0.b(this.P);
        if (b10 == null) {
            return super.a1();
        }
        return '\"' + b10 + "\":" + super.a1();
    }

    public boolean c() {
        return super.c();
    }

    @g
    public final ie.g e() {
        return this.P;
    }

    public final void j1(@h Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            G1(e0Var.f21998a, e0Var.a());
            return;
        }
        H1(obj);
    }

    @g
    public String p0() {
        return z0.a(this) + " was cancelled";
    }

    public final void x(@g Object obj) {
        Object W0 = W0(k0.d(obj, (l) null, 1, (Object) null));
        if (W0 != w2.f22036b) {
            E1(W0);
        }
    }
}
