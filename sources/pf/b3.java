package pf;

import fh.g;
import fh.h;
import ie.a;
import ie.d;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p000if.s;
import pf.n2;
import we.l;
import zd.k;
import zd.m;
import zd.u2;
import zf.c;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b6\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020\u001d8\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010#R\u001a\u0010*\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\u001a\u00100\u001a\u00020,8VX\u0004¢\u0006\f\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0002018VX\u0004¢\u0006\f\u0012\u0004\b4\u0010%\u001a\u0004\b2\u00103\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lpf/b3;", "Lie/a;", "Lpf/n2;", "", "start", "Lzd/u2;", "L1", "(Lie/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k0", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lpf/p1;", "A", "onCancelling", "invokeImmediately", "e0", "h", "f", "Lpf/y;", "child", "Lpf/w;", "A1", "", "toString", "Q", "Ljava/lang/String;", "message", "c", "()Z", "isActive$annotations", "()V", "isActive", "m", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lzf/c;", "f1", "()Lzf/c;", "getOnJoin$annotations", "onJoin", "Lif/m;", "P", "()Lif/m;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b3 extends a implements n2 {
    @g
    public static final b3 P = new b3();
    @g
    public static final String Q = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public b3() {
        super(n2.D);
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void N1() {
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void O1() {
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void P1() {
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void Q1() {
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void R1() {
    }

    @g
    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public p1 A(@g l<? super Throwable, u2> lVar) {
        return c3.O;
    }

    @g
    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public w A1(@g y yVar) {
        return c3.O;
    }

    @h
    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public Object L1(@g d<? super u2> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @g
    public p000if.m<n2> P() {
        return s.g();
    }

    public boolean c() {
        return true;
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        h((CancellationException) null);
    }

    @g
    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public p1 e0(boolean z10, boolean z11, @g l<? super Throwable, u2> lVar) {
        return c3.O;
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean f(Throwable th2) {
        return false;
    }

    @g
    public c f1() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void h(@h CancellationException cancellationException) {
    }

    public boolean isCancelled() {
        return false;
    }

    @g
    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public CancellationException k0() {
        throw new IllegalStateException("This job is always active");
    }

    public boolean m() {
        return false;
    }

    @g
    @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public n2 q(@g n2 n2Var) {
        return n2.a.i(this, n2Var);
    }

    @k(level = m.O, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    @g
    public String toString() {
        return "NonCancellable";
    }
}
