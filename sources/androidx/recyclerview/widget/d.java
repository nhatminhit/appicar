package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.i;
import d.m0;
import d.o0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f3390h = new c();

    /* renamed from: a  reason: collision with root package name */
    public final t f3391a;

    /* renamed from: b  reason: collision with root package name */
    public final c<T> f3392b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f3393c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b<T>> f3394d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public List<T> f3395e;
    @m0

    /* renamed from: f  reason: collision with root package name */
    public List<T> f3396f;

    /* renamed from: g  reason: collision with root package name */
    public int f3397g;

    public class a implements Runnable {
        public final /* synthetic */ List O;
        public final /* synthetic */ List P;
        public final /* synthetic */ int Q;
        public final /* synthetic */ Runnable R;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        public class C0047a extends i.b {
            public C0047a() {
            }

            public boolean a(int i10, int i11) {
                Object obj = a.this.O.get(i10);
                Object obj2 = a.this.P.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f3392b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean b(int i10, int i11) {
                Object obj = a.this.O.get(i10);
                Object obj2 = a.this.P.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f3392b.b().b(obj, obj2);
            }

            @o0
            public Object c(int i10, int i11) {
                Object obj = a.this.O.get(i10);
                Object obj2 = a.this.P.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f3392b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            public int d() {
                return a.this.P.size();
            }

            public int e() {
                return a.this.O.size();
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ i.c O;

            public b(i.c cVar) {
                this.O = cVar;
            }

            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f3397g == aVar.Q) {
                    dVar.c(aVar.P, this.O, aVar.R);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.O = list;
            this.P = list2;
            this.Q = i10;
            this.R = runnable;
        }

        public void run() {
            d.this.f3393c.execute(new b(i.a(new C0047a())));
        }
    }

    public interface b<T> {
        void a(@m0 List<T> list, @m0 List<T> list2);
    }

    public static class c implements Executor {
        public final Handler O = new Handler(Looper.getMainLooper());

        public void execute(@m0 Runnable runnable) {
            this.O.post(runnable);
        }
    }

    public d(@m0 RecyclerView.g gVar, @m0 i.d<T> dVar) {
        this((t) new b(gVar), new c.a(dVar).a());
    }

    public d(@m0 t tVar, @m0 c<T> cVar) {
        this.f3394d = new CopyOnWriteArrayList();
        this.f3396f = Collections.emptyList();
        this.f3391a = tVar;
        this.f3392b = cVar;
        this.f3393c = cVar.c() != null ? cVar.c() : f3390h;
    }

    public void a(@m0 b<T> bVar) {
        this.f3394d.add(bVar);
    }

    @m0
    public List<T> b() {
        return this.f3396f;
    }

    public void c(@m0 List<T> list, @m0 i.c cVar, @o0 Runnable runnable) {
        List<T> list2 = this.f3396f;
        this.f3395e = list;
        this.f3396f = Collections.unmodifiableList(list);
        cVar.f(this.f3391a);
        d(list2, runnable);
    }

    public final void d(@m0 List<T> list, @o0 Runnable runnable) {
        for (b<T> a10 : this.f3394d) {
            a10.a(list, this.f3396f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(@m0 b<T> bVar) {
        this.f3394d.remove(bVar);
    }

    public void f(@o0 List<T> list) {
        g(list, (Runnable) null);
    }

    public void g(@o0 List<T> list, @o0 Runnable runnable) {
        int i10 = this.f3397g + 1;
        this.f3397g = i10;
        List<T> list2 = this.f3395e;
        if (list != list2) {
            List<T> list3 = this.f3396f;
            if (list == null) {
                int size = list2.size();
                this.f3395e = null;
                this.f3396f = Collections.emptyList();
                this.f3391a.c(0, size);
                d(list3, runnable);
            } else if (list2 == null) {
                this.f3395e = list;
                this.f3396f = Collections.unmodifiableList(list);
                this.f3391a.b(0, list.size());
                d(list3, runnable);
            } else {
                this.f3392b.a().execute(new a(list2, list, i10, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
