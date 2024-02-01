package qf;

import android.os.Looper;
import fh.g;
import java.util.List;
import kotlin.Metadata;
import pf.z2;
import wf.b0;
import wf.d0;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lqf/a;", "Lwf/d0;", "", "allFactories", "Lpf/z2;", "b", "", "a", "", "c", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public final class a implements d0 {
    @g
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @g
    public z2 b(@g List<? extends d0> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(g.d(mainLooper, true), (String) null, 2, (w) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return b0.f24063j;
    }
}
