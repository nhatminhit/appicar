package u2;

import androidx.lifecycle.LiveData;
import androidx.room.e;
import d.g1;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

public class d1 {
    @g1

    /* renamed from: a  reason: collision with root package name */
    public final Set<LiveData> f13493a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final n2 f13494b;

    public d1(n2 n2Var) {
        this.f13494b = n2Var;
    }

    public <T> LiveData<T> a(String[] strArr, boolean z10, Callable<T> callable) {
        return new e(this.f13494b, this, z10, callable, strArr);
    }

    public void b(LiveData liveData) {
        this.f13493a.add(liveData);
    }

    public void c(LiveData liveData) {
        this.f13493a.remove(liveData);
    }
}
