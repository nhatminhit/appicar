package androidx.recyclerview.widget;

import androidx.collection.f;
import androidx.collection.i;
import androidx.recyclerview.widget.RecyclerView;
import d.g1;
import d.m0;
import d.o0;
import e1.m;

public class h0 {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3518c = false;
    @g1

    /* renamed from: a  reason: collision with root package name */
    public final i<RecyclerView.e0, a> f3519a = new i<>();
    @g1

    /* renamed from: b  reason: collision with root package name */
    public final f<RecyclerView.e0> f3520b = new f<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final int f3521d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f3522e = 2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f3523f = 4;

        /* renamed from: g  reason: collision with root package name */
        public static final int f3524g = 8;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3525h = 3;

        /* renamed from: i  reason: collision with root package name */
        public static final int f3526i = 12;

        /* renamed from: j  reason: collision with root package name */
        public static final int f3527j = 14;

        /* renamed from: k  reason: collision with root package name */
        public static m.a<a> f3528k = new m.b(20);

        /* renamed from: a  reason: collision with root package name */
        public int f3529a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.l.d f3530b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.l.d f3531c;

        public static void a() {
            do {
            } while (f3528k.b() != null);
        }

        public static a b() {
            a b10 = f3528k.b();
            return b10 == null ? new a() : b10;
        }

        public static void c(a aVar) {
            aVar.f3529a = 0;
            aVar.f3530b = null;
            aVar.f3531c = null;
            f3528k.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.e0 e0Var);

        void b(RecyclerView.e0 e0Var, @o0 RecyclerView.l.d dVar, RecyclerView.l.d dVar2);

        void c(RecyclerView.e0 e0Var, @m0 RecyclerView.l.d dVar, @o0 RecyclerView.l.d dVar2);

        void d(RecyclerView.e0 e0Var, @m0 RecyclerView.l.d dVar, @m0 RecyclerView.l.d dVar2);
    }

    public void a(RecyclerView.e0 e0Var, RecyclerView.l.d dVar) {
        a aVar = this.f3519a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3519a.put(e0Var, aVar);
        }
        aVar.f3529a |= 2;
        aVar.f3530b = dVar;
    }

    public void b(RecyclerView.e0 e0Var) {
        a aVar = this.f3519a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3519a.put(e0Var, aVar);
        }
        aVar.f3529a |= 1;
    }

    public void c(long j10, RecyclerView.e0 e0Var) {
        this.f3520b.u(j10, e0Var);
    }

    public void d(RecyclerView.e0 e0Var, RecyclerView.l.d dVar) {
        a aVar = this.f3519a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3519a.put(e0Var, aVar);
        }
        aVar.f3531c = dVar;
        aVar.f3529a |= 8;
    }

    public void e(RecyclerView.e0 e0Var, RecyclerView.l.d dVar) {
        a aVar = this.f3519a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3519a.put(e0Var, aVar);
        }
        aVar.f3530b = dVar;
        aVar.f3529a |= 4;
    }

    public void f() {
        this.f3519a.clear();
        this.f3520b.d();
    }

    public RecyclerView.e0 g(long j10) {
        return this.f3520b.n(j10);
    }

    public boolean h(RecyclerView.e0 e0Var) {
        a aVar = this.f3519a.get(e0Var);
        return (aVar == null || (aVar.f3529a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.e0 e0Var) {
        a aVar = this.f3519a.get(e0Var);
        return (aVar == null || (aVar.f3529a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.e0 e0Var) {
        p(e0Var);
    }

    public final RecyclerView.l.d l(RecyclerView.e0 e0Var, int i10) {
        a q10;
        RecyclerView.l.d dVar;
        int h10 = this.f3519a.h(e0Var);
        if (h10 >= 0 && (q10 = this.f3519a.q(h10)) != null) {
            int i11 = q10.f3529a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                q10.f3529a = i12;
                if (i10 == 4) {
                    dVar = q10.f3530b;
                } else if (i10 == 8) {
                    dVar = q10.f3531c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3519a.o(h10);
                    a.c(q10);
                }
                return dVar;
            }
        }
        return null;
    }

    @o0
    public RecyclerView.l.d m(RecyclerView.e0 e0Var) {
        return l(e0Var, 8);
    }

    @o0
    public RecyclerView.l.d n(RecyclerView.e0 e0Var) {
        return l(e0Var, 4);
    }

    public void o(b bVar) {
        RecyclerView.l.d dVar;
        RecyclerView.l.d dVar2;
        for (int size = this.f3519a.size() - 1; size >= 0; size--) {
            RecyclerView.e0 m10 = this.f3519a.m(size);
            a o10 = this.f3519a.o(size);
            int i10 = o10.f3529a;
            if ((i10 & 3) != 3) {
                if ((i10 & 1) != 0) {
                    dVar = o10.f3530b;
                    if (dVar != null) {
                        dVar2 = o10.f3531c;
                    }
                } else {
                    if ((i10 & 14) != 14) {
                        if ((i10 & 12) == 12) {
                            bVar.d(m10, o10.f3530b, o10.f3531c);
                        } else if ((i10 & 4) != 0) {
                            dVar = o10.f3530b;
                            dVar2 = null;
                        } else if ((i10 & 8) == 0) {
                        }
                        a.c(o10);
                    }
                    bVar.b(m10, o10.f3530b, o10.f3531c);
                    a.c(o10);
                }
                bVar.c(m10, dVar, dVar2);
                a.c(o10);
            }
            bVar.a(m10);
            a.c(o10);
        }
    }

    public void p(RecyclerView.e0 e0Var) {
        a aVar = this.f3519a.get(e0Var);
        if (aVar != null) {
            aVar.f3529a &= -2;
        }
    }

    public void q(RecyclerView.e0 e0Var) {
        int D = this.f3520b.D() - 1;
        while (true) {
            if (D < 0) {
                break;
            } else if (e0Var == this.f3520b.E(D)) {
                this.f3520b.z(D);
                break;
            } else {
                D--;
            }
        }
        a remove = this.f3519a.remove(e0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
