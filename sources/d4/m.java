package d4;

import d.g1;
import d.m0;
import d.o0;
import java.util.Queue;
import t4.h;

public class m<A, B> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f6045b = 250;

    /* renamed from: a  reason: collision with root package name */
    public final h<b<A>, B> f6046a;

    public class a extends h<b<A>, B> {
        public a(long j10) {
            super(j10);
        }

        /* renamed from: r */
        public void n(@m0 b<A> bVar, @o0 B b10) {
            bVar.c();
        }
    }

    @g1
    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<b<?>> f6048d = t4.m.f(0);

        /* renamed from: a  reason: collision with root package name */
        public int f6049a;

        /* renamed from: b  reason: collision with root package name */
        public int f6050b;

        /* renamed from: c  reason: collision with root package name */
        public A f6051c;

        public static <A> b<A> a(A a10, int i10, int i11) {
            b<A> poll;
            Queue<b<?>> queue = f6048d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.b(a10, i10, i11);
            return poll;
        }

        public final void b(A a10, int i10, int i11) {
            this.f6051c = a10;
            this.f6050b = i10;
            this.f6049a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f6048d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6050b == bVar.f6050b && this.f6049a == bVar.f6049a && this.f6051c.equals(bVar.f6051c);
        }

        public int hashCode() {
            return (((this.f6049a * 31) + this.f6050b) * 31) + this.f6051c.hashCode();
        }
    }

    public m() {
        this(250);
    }

    public m(long j10) {
        this.f6046a = new a(j10);
    }

    public void a() {
        this.f6046a.b();
    }

    @o0
    public B b(A a10, int i10, int i11) {
        b a11 = b.a(a10, i10, i11);
        B k10 = this.f6046a.k(a11);
        a11.c();
        return k10;
    }

    public void c(A a10, int i10, int i11, B b10) {
        this.f6046a.o(b.a(a10, i10, i11), b10);
    }
}
