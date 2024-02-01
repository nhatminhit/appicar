package d0;

import androidx.collection.i;
import d.m0;
import d.o0;
import d.x0;
import e1.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@x0({x0.a.O})
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final m.a<ArrayList<T>> f5988a = new m.b(10);

    /* renamed from: b  reason: collision with root package name */
    public final i<T, ArrayList<T>> f5989b = new i<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f5990c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f5991d = new HashSet<>();

    public void a(@m0 T t10, @m0 T t11) {
        if (!this.f5989b.containsKey(t10) || !this.f5989b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f5989b.get(t10);
        if (arrayList == null) {
            arrayList = f();
            this.f5989b.put(t10, arrayList);
        }
        arrayList.add(t11);
    }

    public void b(@m0 T t10) {
        if (!this.f5989b.containsKey(t10)) {
            this.f5989b.put(t10, null);
        }
    }

    public void c() {
        int size = this.f5989b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList q10 = this.f5989b.q(i10);
            if (q10 != null) {
                k(q10);
            }
        }
        this.f5989b.clear();
    }

    public boolean d(@m0 T t10) {
        return this.f5989b.containsKey(t10);
    }

    public final void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t10)) {
            if (!hashSet.contains(t10)) {
                hashSet.add(t10);
                ArrayList arrayList2 = this.f5989b.get(t10);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(t10);
                arrayList.add(t10);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    @m0
    public final ArrayList<T> f() {
        ArrayList<T> b10 = this.f5988a.b();
        return b10 == null ? new ArrayList<>() : b10;
    }

    @o0
    public List g(@m0 T t10) {
        return this.f5989b.get(t10);
    }

    @o0
    public List<T> h(@m0 T t10) {
        int size = this.f5989b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList q10 = this.f5989b.q(i10);
            if (q10 != null && q10.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f5989b.m(i10));
            }
        }
        return arrayList;
    }

    @m0
    public ArrayList<T> i() {
        this.f5990c.clear();
        this.f5991d.clear();
        int size = this.f5989b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f5989b.m(i10), this.f5990c, this.f5991d);
        }
        return this.f5990c;
    }

    public boolean j(@m0 T t10) {
        int size = this.f5989b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList q10 = this.f5989b.q(i10);
            if (q10 != null && q10.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    public final void k(@m0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f5988a.a(arrayList);
    }

    public int l() {
        return this.f5989b.size();
    }
}
