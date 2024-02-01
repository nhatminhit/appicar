package androidx.recyclerview.widget;

import androidx.recyclerview.widget.i;
import d.m0;
import d.o0;
import d.x0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class c<T> {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Executor f3367a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3368b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final i.d<T> f3369c;

    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        public static final Object f3370d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public static Executor f3371e;
        @o0

        /* renamed from: a  reason: collision with root package name */
        public Executor f3372a;

        /* renamed from: b  reason: collision with root package name */
        public Executor f3373b;

        /* renamed from: c  reason: collision with root package name */
        public final i.d<T> f3374c;

        public a(@m0 i.d<T> dVar) {
            this.f3374c = dVar;
        }

        @m0
        public c<T> a() {
            if (this.f3373b == null) {
                synchronized (f3370d) {
                    if (f3371e == null) {
                        f3371e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f3373b = f3371e;
            }
            return new c<>(this.f3372a, this.f3373b, this.f3374c);
        }

        @m0
        public a<T> b(Executor executor) {
            this.f3373b = executor;
            return this;
        }

        @x0({x0.a.O})
        @m0
        public a<T> c(Executor executor) {
            this.f3372a = executor;
            return this;
        }
    }

    public c(@o0 Executor executor, @m0 Executor executor2, @m0 i.d<T> dVar) {
        this.f3367a = executor;
        this.f3368b = executor2;
        this.f3369c = dVar;
    }

    @m0
    public Executor a() {
        return this.f3368b;
    }

    @m0
    public i.d<T> b() {
        return this.f3369c;
    }

    @x0({x0.a.O})
    @o0
    public Executor c() {
        return this.f3367a;
    }
}
