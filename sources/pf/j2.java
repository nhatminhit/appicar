package pf;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import le.f;
import le.o;
import we.p;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lie/g;", "context", "Lkotlin/Function0;", "block", "b", "(Lie/g;Lwe/a;Lie/d;)Ljava/lang/Object;", "coroutineContext", "d", "(Lie/g;Lwe/a;)Ljava/lang/Object;", "", "a", "I", "WORKING", "FINISHED", "c", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22002a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f22003b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f22004c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f22005d = 3;

    @f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lpf/u0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super T>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ we.a<T> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(we.a<? extends T> aVar, d<? super a> dVar) {
            super(2, dVar);
            this.U = aVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, dVar);
            aVar.T = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                return j2.d(((u0) this.T).H(), this.U);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super T> dVar) {
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @h
    public static final <T> Object b(@g ie.g gVar, @g we.a<? extends T> aVar, @g d<? super T> dVar) {
        return j.h(gVar, new a(aVar, (d<? super a>) null), dVar);
    }

    public static /* synthetic */ Object c(ie.g gVar, we.a aVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = i.O;
        }
        return b(gVar, aVar, dVar);
    }

    public static final <T> T d(ie.g gVar, we.a<? extends T> aVar) {
        x3 x3Var;
        try {
            x3Var = new x3(r2.B(gVar));
            x3Var.f();
            T n10 = aVar.n();
            x3Var.c();
            return n10;
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        } catch (Throwable th2) {
            x3Var.c();
            throw th2;
        }
    }
}
