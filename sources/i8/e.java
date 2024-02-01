package i8;

import d.m0;
import i8.d;
import java.util.HashSet;
import java.util.Iterator;

public final class e implements d, d.a {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f9320a = new HashSet();

    public void a(int i10, int i11) {
        Iterator it = this.f9320a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(i10, i11);
        }
    }

    public void b(int i10, int i11, int i12) {
        Iterator it = this.f9320a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(i10, i11, i12);
        }
    }

    public void c(int i10, int i11) {
        Iterator it = this.f9320a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).c(i10, i11);
        }
    }

    public void d(int i10, int i11) {
        Iterator it = this.f9320a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).d(i10, i11);
        }
    }

    public void e(@m0 d dVar) {
        this.f9320a.add(dVar);
    }

    public void f(@m0 d dVar) {
        this.f9320a.remove(dVar);
    }

    public void g() {
        Iterator it = this.f9320a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).g();
        }
    }

    public void h() {
        this.f9320a.clear();
    }

    public boolean i() {
        return !this.f9320a.isEmpty();
    }
}
