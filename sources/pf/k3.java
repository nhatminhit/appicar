package pf;

import fh.g;
import kotlin.Metadata;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\b*\n\u0010\u0006\"\u00020\u00032\u00020\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lzd/u2;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "a", "Runnable", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class k3 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzd/u2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {
        public final /* synthetic */ we.a<u2> O;

        public a(we.a<u2> aVar) {
            this.O = aVar;
        }

        public final void run() {
            this.O.n();
        }
    }

    @g
    public static final Runnable a(@g we.a<u2> aVar) {
        return new a(aVar);
    }
}
