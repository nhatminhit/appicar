package pf;

import fh.g;
import fh.h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ve.e;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lpf/o2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lpf/m0;", "", "fillInStackTrace", "b", "", "toString", "", "other", "", "equals", "", "hashCode", "Lpf/n2;", "O", "Lpf/n2;", "job", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lpf/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o2 extends CancellationException implements m0<o2> {
    @g
    @e
    public final transient n2 O;

    public o2(@g String str, @h Throwable th2, @g n2 n2Var) {
        super(str);
        this.O = n2Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @h
    /* renamed from: b */
    public o2 a() {
        return null;
    }

    public boolean equals(@h Object obj) {
        if (obj != this) {
            if (obj instanceof o2) {
                o2 o2Var = (o2) obj;
                if (!l0.g(o2Var.getMessage(), getMessage()) || !l0.g(o2Var.O, this.O) || !l0.g(o2Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @g
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        l0.m(message);
        int hashCode = ((message.hashCode() * 31) + this.O.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @g
    public String toString() {
        return super.toString() + "; job=" + this.O;
    }
}
