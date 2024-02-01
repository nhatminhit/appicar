package o8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import f8.m;
import j8.s;
import j8.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List f11339a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final a f11340b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final Executor f11341c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11342d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List f11343a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f11344b = true;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public a f11345c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public Executor f11346d;

        @CanIgnoreReturnValue
        @m0
        public a a(@m0 m mVar) {
            this.f11343a.add(mVar);
            return this;
        }

        @m0
        public d b() {
            return new d(this.f11343a, this.f11345c, this.f11346d, this.f11344b, (h) null);
        }

        @m0
        public a c(@m0 a aVar) {
            return d(aVar, (Executor) null);
        }

        @CanIgnoreReturnValue
        @m0
        public a d(@m0 a aVar, @o0 Executor executor) {
            this.f11345c = aVar;
            this.f11346d = executor;
            return this;
        }
    }

    public /* synthetic */ d(List list, a aVar, Executor executor, boolean z10, h hVar) {
        s.m(list, "APIs must not be null.");
        s.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            s.m(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f11339a = list;
        this.f11340b = aVar;
        this.f11341c = executor;
        this.f11342d = z10;
    }

    @m0
    public static a d() {
        return new a();
    }

    @m0
    public List<m> a() {
        return this.f11339a;
    }

    @o0
    public a b() {
        return this.f11340b;
    }

    @o0
    public Executor c() {
        return this.f11341c;
    }

    @w
    public final boolean e() {
        return this.f11342d;
    }
}
