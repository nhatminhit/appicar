package e7;

import android.util.SparseArray;
import w7.j0;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<j0> f6972a = new SparseArray<>();

    public j0 a(int i10) {
        j0 j0Var = this.f6972a.get(i10);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(Long.MAX_VALUE);
        this.f6972a.put(i10, j0Var2);
        return j0Var2;
    }

    public void b() {
        this.f6972a.clear();
    }
}
