package qb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pb.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f22203a = new HashMap();

    public Integer a(int i10) {
        return this.f22203a.get(Integer.valueOf(i10));
    }

    public int[] b() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry next : this.f22203a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i10) {
                i10 = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i10) {
            }
            arrayList.add(next.getKey());
        }
        return a.c(arrayList);
    }

    public void c(int i10) {
        Integer num = this.f22203a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f22203a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
