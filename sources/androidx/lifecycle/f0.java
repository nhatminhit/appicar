package androidx.lifecycle;

import d.x0;
import fh.g;
import java.util.HashMap;
import java.util.Map;
import xe.l0;

@x0({x0.a.Q})
public class f0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f2806a = new HashMap();

    @x0({x0.a.Q})
    public boolean a(@g String str, int i10) {
        l0.p(str, "name");
        Integer num = this.f2806a.get(str);
        boolean z10 = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i10) != 0) {
            z10 = true;
        }
        this.f2806a.put(str, Integer.valueOf(i10 | intValue));
        return !z10;
    }
}
