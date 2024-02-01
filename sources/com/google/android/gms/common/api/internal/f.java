package com.google.android.gms.common.api.internal;

import android.os.Looper;
import d.m0;
import d.o0;
import g8.i1;
import j8.s;
import java.util.concurrent.Executor;

@e8.a
public final class f<L> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5662a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f5663b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public volatile a f5664c;

    @e8.a
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5665a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5666b;

        @e8.a
        public a(L l10, String str) {
            this.f5665a = l10;
            this.f5666b = str;
        }

        @e8.a
        @m0
        public String a() {
            String str = this.f5666b;
            int identityHashCode = System.identityHashCode(this.f5665a);
            return str + "@" + identityHashCode;
        }

        @e8.a
        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5665a == aVar.f5665a && this.f5666b.equals(aVar.f5666b);
        }

        @e8.a
        public int hashCode() {
            return (System.identityHashCode(this.f5665a) * 31) + this.f5666b.hashCode();
        }
    }

    @e8.a
    public interface b<L> {
        @e8.a
        void a(@m0 L l10);

        @e8.a
        void b();
    }

    @e8.a
    public f(@m0 Looper looper, @m0 L l10, @m0 String str) {
        this.f5662a = new x8.a(looper);
        this.f5663b = s.m(l10, "Listener must not be null");
        this.f5664c = new a(l10, s.h(str));
    }

    @e8.a
    public f(@m0 Executor executor, @m0 L l10, @m0 String str) {
        this.f5662a = (Executor) s.m(executor, "Executor must not be null");
        this.f5663b = s.m(l10, "Listener must not be null");
        this.f5664c = new a(l10, s.h(str));
    }

    @e8.a
    public void a() {
        this.f5663b = null;
        this.f5664c = null;
    }

    @e8.a
    @o0
    public a<L> b() {
        return this.f5664c;
    }

    @e8.a
    public boolean c() {
        return this.f5663b != null;
    }

    @e8.a
    public void d(@m0 b<? super L> bVar) {
        s.m(bVar, "Notifier must not be null");
        this.f5662a.execute(new i1(this, bVar));
    }

    public final void e(b bVar) {
        Object obj = this.f5663b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
