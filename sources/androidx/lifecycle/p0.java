package androidx.lifecycle;

import android.os.Bundle;
import fh.g;
import fh.h;
import java.util.Map;
import xe.l0;
import xe.n0;
import xe.r1;
import y2.c;
import zd.d0;
import zd.f0;

@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
public final class p0 implements c.C0245c {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final c f2831a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2832b;
    @h

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2833c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final d0 f2834d;

    public static final class a extends n0 implements we.a<q0> {
        public final /* synthetic */ b1 P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b1 b1Var) {
            super(0);
            this.P = b1Var;
        }

        @g
        /* renamed from: c */
        public final q0 n() {
            return o0.e(this.P);
        }
    }

    public p0(@g c cVar, @g b1 b1Var) {
        l0.p(cVar, "savedStateRegistry");
        l0.p(b1Var, "viewModelStoreOwner");
        this.f2831a = cVar;
        this.f2834d = f0.b(new a(b1Var));
    }

    @g
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2833c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : c().g().entrySet()) {
            String str = (String) next.getKey();
            Bundle a10 = ((n0) next.getValue()).o().a();
            if (!l0.g(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2832b = false;
        return bundle;
    }

    @h
    public final Bundle b(@g String str) {
        l0.p(str, "key");
        d();
        Bundle bundle = this.f2833c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f2833c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2833c;
        boolean z10 = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.f2833c = null;
        }
        return bundle2;
    }

    public final q0 c() {
        return (q0) this.f2834d.getValue();
    }

    public final void d() {
        if (!this.f2832b) {
            this.f2833c = this.f2831a.b(o0.f2824b);
            this.f2832b = true;
            c();
        }
    }
}
