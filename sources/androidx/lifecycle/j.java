package androidx.lifecycle;

import d.d;
import d.j0;
import fh.g;
import java.util.ArrayDeque;
import java.util.Queue;
import pf.m1;
import pf.z2;
import xe.l0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2807a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2808b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2809c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Runnable> f2810d = new ArrayDeque();

    public static final void d(j jVar, Runnable runnable) {
        l0.p(jVar, "this$0");
        l0.p(runnable, "$runnable");
        jVar.f(runnable);
    }

    @j0
    public final boolean b() {
        return this.f2808b || !this.f2807a;
    }

    @d
    public final void c(@g ie.g gVar, @g Runnable runnable) {
        l0.p(gVar, "context");
        l0.p(runnable, "runnable");
        z2 S1 = m1.e().S1();
        if (S1.P1(gVar) || b()) {
            S1.N1(gVar, new i(this, runnable));
        } else {
            f(runnable);
        }
    }

    @j0
    public final void e() {
        if (!this.f2809c) {
            boolean z10 = false;
            z10 = true;
            try {
                while (true) {
                    if (!(this.f2810d.isEmpty() ^ z10)) {
                        break;
                    } else if (!b()) {
                        break;
                    } else {
                        Runnable poll = this.f2810d.poll();
                        if (poll != null) {
                            poll.run();
                        }
                    }
                }
                this.f2809c = z10;
            } finally {
                this.f2809c = z10;
            }
        }
    }

    @j0
    public final void f(Runnable runnable) {
        if (this.f2810d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    @j0
    public final void g() {
        this.f2808b = true;
        e();
    }

    @j0
    public final void h() {
        this.f2807a = true;
    }

    @j0
    public final void i() {
        if (this.f2807a) {
            if (!this.f2808b) {
                this.f2807a = false;
                e();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
