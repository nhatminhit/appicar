package i7;

import d.m0;
import h7.f;
import h7.g;
import h7.i;
import h7.j;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public abstract class e implements f {

    /* renamed from: g  reason: collision with root package name */
    public static final int f9305g = 10;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9306h = 2;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<b> f9307a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<j> f9308b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue<b> f9309c;

    /* renamed from: d  reason: collision with root package name */
    public b f9310d;

    /* renamed from: e  reason: collision with root package name */
    public long f9311e;

    /* renamed from: f  reason: collision with root package name */
    public long f9312f;

    public static final class b extends i implements Comparable<b> {
        public long X;

        public b() {
        }

        /* renamed from: x */
        public int compareTo(@m0 b bVar) {
            if (n() != bVar.n()) {
                return n() ? 1 : -1;
            }
            long j10 = this.R - bVar.R;
            if (j10 == 0) {
                j10 = this.X - bVar.X;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    public final class c extends j {
        public c() {
        }

        public final void q() {
            e.this.m(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f9307a.add(new b());
        }
        this.f9308b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f9308b.add(new c());
        }
        this.f9309c = new PriorityQueue<>();
    }

    public void a() {
    }

    public void b(long j10) {
        this.f9311e = j10;
    }

    public abstract h7.e f();

    public void flush() {
        this.f9312f = 0;
        this.f9311e = 0;
        while (!this.f9309c.isEmpty()) {
            l(this.f9309c.poll());
        }
        b bVar = this.f9310d;
        if (bVar != null) {
            l(bVar);
            this.f9310d = null;
        }
    }

    public abstract void g(i iVar);

    public abstract String getName();

    /* renamed from: h */
    public i d() throws g {
        w7.a.i(this.f9310d == null);
        if (this.f9307a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f9307a.pollFirst();
        this.f9310d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public j c() throws g {
        j pollFirst;
        if (this.f9308b.isEmpty()) {
            return null;
        }
        while (!this.f9309c.isEmpty() && this.f9309c.peek().R <= this.f9311e) {
            b poll = this.f9309c.poll();
            if (poll.n()) {
                pollFirst = this.f9308b.pollFirst();
                pollFirst.i(4);
            } else {
                g(poll);
                if (j()) {
                    h7.e f10 = f();
                    if (!poll.m()) {
                        pollFirst = this.f9308b.pollFirst();
                        pollFirst.r(poll.R, f10, Long.MAX_VALUE);
                    }
                }
                l(poll);
            }
            l(poll);
            return pollFirst;
        }
        return null;
    }

    public abstract boolean j();

    /* renamed from: k */
    public void e(i iVar) throws g {
        w7.a.a(iVar == this.f9310d);
        if (iVar.m()) {
            l(this.f9310d);
        } else {
            b bVar = this.f9310d;
            long j10 = this.f9312f;
            this.f9312f = 1 + j10;
            long unused = bVar.X = j10;
            this.f9309c.add(this.f9310d);
        }
        this.f9310d = null;
    }

    public final void l(b bVar) {
        bVar.j();
        this.f9307a.add(bVar);
    }

    public void m(j jVar) {
        jVar.j();
        this.f9308b.add(jVar);
    }
}
