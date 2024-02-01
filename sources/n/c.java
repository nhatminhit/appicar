package n;

import d.m0;
import d.o0;
import d.x0;
import java.util.concurrent.Executor;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f10660c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public static final Executor f10661d = new a();
    @m0

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f10662e = new b();
    @m0

    /* renamed from: a  reason: collision with root package name */
    public f f10663a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final f f10664b;

    public c() {
        d dVar = new d();
        this.f10664b = dVar;
        this.f10663a = dVar;
    }

    @m0
    public static Executor g() {
        return f10662e;
    }

    @m0
    public static c h() {
        if (f10660c != null) {
            return f10660c;
        }
        synchronized (c.class) {
            if (f10660c == null) {
                f10660c = new c();
            }
        }
        return f10660c;
    }

    @m0
    public static Executor i() {
        return f10661d;
    }

    public void a(@m0 Runnable runnable) {
        this.f10663a.a(runnable);
    }

    public boolean c() {
        return this.f10663a.c();
    }

    public void d(@m0 Runnable runnable) {
        this.f10663a.d(runnable);
    }

    public void l(@o0 f fVar) {
        if (fVar == null) {
            fVar = this.f10664b;
        }
        this.f10663a = fVar;
    }
}
