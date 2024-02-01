package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import f8.a;
import f8.a.b;
import g8.m;
import g8.q1;
import g8.r1;
import g8.s1;
import h9.n;
import j8.s;

@e8.a
public class i<A extends a.b, L> {
    @e8.a
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final h<A, L> f5672a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final k f5673b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f5674c;

    @e8.a
    public static class a<A extends a.b, L> {

        /* renamed from: a  reason: collision with root package name */
        public m f5675a;

        /* renamed from: b  reason: collision with root package name */
        public m f5676b;

        /* renamed from: c  reason: collision with root package name */
        public Runnable f5677c = q1.O;

        /* renamed from: d  reason: collision with root package name */
        public f f5678d;

        /* renamed from: e  reason: collision with root package name */
        public Feature[] f5679e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5680f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f5681g;

        public a() {
        }

        public /* synthetic */ a(r1 r1Var) {
        }

        @e8.a
        @m0
        public i<A, L> a() {
            boolean z10 = true;
            s.b(this.f5675a != null, "Must set register function");
            s.b(this.f5676b != null, "Must set unregister function");
            if (this.f5678d == null) {
                z10 = false;
            }
            s.b(z10, "Must set holder");
            return new i<>(new y(this, this.f5678d, this.f5679e, this.f5680f, this.f5681g), new z(this, (f.a) s.m(this.f5678d.b(), "Key must not be null")), this.f5677c, (s1) null);
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> b(@m0 Runnable runnable) {
            this.f5677c = runnable;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> c(@m0 m<A, n<Void>> mVar) {
            this.f5675a = mVar;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> d(boolean z10) {
            this.f5680f = z10;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> e(@m0 Feature... featureArr) {
            this.f5679e = featureArr;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> f(int i10) {
            this.f5681g = i10;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> g(@m0 m<A, n<Boolean>> mVar) {
            this.f5676b = mVar;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, L> h(@m0 f<L> fVar) {
            this.f5678d = fVar;
            return this;
        }
    }

    public /* synthetic */ i(h hVar, k kVar, Runnable runnable, s1 s1Var) {
        this.f5672a = hVar;
        this.f5673b = kVar;
        this.f5674c = runnable;
    }

    @e8.a
    @m0
    public static <A extends a.b, L> a<A, L> a() {
        return new a<>((r1) null);
    }
}
