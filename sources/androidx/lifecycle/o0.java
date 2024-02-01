package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.x0;
import d.j0;
import fh.g;
import i2.a;
import ve.e;
import ve.h;
import we.l;
import xe.l0;
import xe.l1;
import xe.n0;
import xe.r1;
import y2.c;

@r1({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
@h(name = "SavedStateHandleSupport")
public final class o0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f2823a = "androidx.lifecycle.internal.SavedStateHandlesVM";
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final String f2824b = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    @g
    @e

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<y2.e> f2825c = new b();
    @g
    @e

    /* renamed from: d  reason: collision with root package name */
    public static final a.b<b1> f2826d = new c();
    @g
    @e

    /* renamed from: e  reason: collision with root package name */
    public static final a.b<Bundle> f2827e = new a();

    public static final class a implements a.b<Bundle> {
    }

    public static final class b implements a.b<y2.e> {
    }

    public static final class c implements a.b<b1> {
    }

    public static final class d extends n0 implements l<i2.a, q0> {
        public static final d P = new d();

        public d() {
            super(1);
        }

        @g
        /* renamed from: c */
        public final q0 A(@g i2.a aVar) {
            l0.p(aVar, "$this$initializer");
            return new q0();
        }
    }

    @g
    @j0
    public static final n0 a(@g i2.a aVar) {
        l0.p(aVar, "<this>");
        y2.e eVar = (y2.e) aVar.a(f2825c);
        if (eVar != null) {
            b1 b1Var = (b1) aVar.a(f2826d);
            if (b1Var != null) {
                Bundle bundle = (Bundle) aVar.a(f2827e);
                String str = (String) aVar.a(x0.c.f2870d);
                if (str != null) {
                    return b(eVar, b1Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final n0 b(y2.e eVar, b1 b1Var, String str, Bundle bundle) {
        p0 d10 = d(eVar);
        q0 e10 = e(b1Var);
        n0 n0Var = e10.g().get(str);
        if (n0Var != null) {
            return n0Var;
        }
        n0 a10 = n0.f2812f.a(d10.b(str), bundle);
        e10.g().put(str, a10);
        return a10;
    }

    @j0
    public static final <T extends y2.e & b1> void c(@g T t10) {
        l0.p(t10, "<this>");
        p.b b10 = t10.getLifecycle().b();
        if (!(b10 == p.b.INITIALIZED || b10 == p.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t10.getSavedStateRegistry().c(f2824b) == null) {
            p0 p0Var = new p0(t10.getSavedStateRegistry(), (b1) t10);
            t10.getSavedStateRegistry().j(f2824b, p0Var);
            t10.getLifecycle().a(new SavedStateHandleAttacher(p0Var));
        }
    }

    @g
    public static final p0 d(@g y2.e eVar) {
        l0.p(eVar, "<this>");
        c.C0245c c10 = eVar.getSavedStateRegistry().c(f2824b);
        p0 p0Var = c10 instanceof p0 ? (p0) c10 : null;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @g
    public static final q0 e(@g b1 b1Var) {
        Class cls = q0.class;
        l0.p(b1Var, "<this>");
        i2.c cVar = new i2.c();
        cVar.a(l1.d(cls), d.P);
        return (q0) new x0(b1Var, cVar.b()).b(f2823a, cls);
    }
}
