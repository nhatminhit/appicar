package j8;

import android.content.Context;
import android.util.SparseIntArray;
import d.m0;
import d8.e;
import d8.f;
import f8.a;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f9792a;

    /* renamed from: b  reason: collision with root package name */
    public f f9793b;

    public q0() {
        this(e.x());
    }

    public q0(@m0 f fVar) {
        this.f9792a = new SparseIntArray();
        s.l(fVar);
        this.f9793b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f9792a.get(i10, -1);
    }

    public final int b(@m0 Context context, @m0 a.f fVar) {
        s.l(context);
        s.l(fVar);
        int i10 = 0;
        if (!fVar.o()) {
            return 0;
        }
        int p10 = fVar.p();
        int a10 = a(context, p10);
        if (a10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f9792a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f9792a.keyAt(i11);
                if (keyAt > p10 && this.f9792a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            a10 = i10 == -1 ? this.f9793b.k(context, p10) : i10;
            this.f9792a.put(p10, a10);
        }
        return a10;
    }

    public final void c() {
        this.f9792a.clear();
    }
}
