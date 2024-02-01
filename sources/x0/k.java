package x0;

import android.os.Handler;
import fh.g;
import fh.h;
import kotlin.Metadata;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\bø\u0001\u0000\u001a4\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\f"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lzd/u2;", "action", "Ljava/lang/Runnable;", "c", "uptimeMillis", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class k {

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ we.a<u2> O;

        public a(we.a<u2> aVar) {
            this.O = aVar;
        }

        public final void run() {
            this.O.n();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ we.a<u2> O;

        public b(we.a<u2> aVar) {
            this.O = aVar;
        }

        public final void run() {
            this.O.n();
        }
    }

    @g
    public static final Runnable a(@g Handler handler, long j10, @h Object obj, @g we.a<u2> aVar) {
        l0.p(handler, "<this>");
        l0.p(aVar, "action");
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j10);
        return aVar2;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j10, Object obj, we.a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        l0.p(handler, "<this>");
        l0.p(aVar, "action");
        a aVar2 = new a(aVar);
        handler.postAtTime(aVar2, obj, j10);
        return aVar2;
    }

    @g
    public static final Runnable c(@g Handler handler, long j10, @h Object obj, @g we.a<u2> aVar) {
        l0.p(handler, "<this>");
        l0.p(aVar, "action");
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
        } else {
            i.d(handler, bVar, obj, j10);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j10, Object obj, we.a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        l0.p(handler, "<this>");
        l0.p(aVar, "action");
        b bVar = new b(aVar);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
        } else {
            i.d(handler, bVar, obj, j10);
        }
        return bVar;
    }
}
