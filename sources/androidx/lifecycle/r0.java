package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.x0;
import d.x0;
import fh.g;
import fh.h;
import i2.a;
import java.lang.reflect.Constructor;
import xe.l0;
import y2.c;
import y2.e;

public final class r0 extends x0.d implements x0.b {
    @h

    /* renamed from: b  reason: collision with root package name */
    public Application f2840b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final x0.b f2841c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2842d;
    @h

    /* renamed from: e  reason: collision with root package name */
    public p f2843e;
    @h

    /* renamed from: f  reason: collision with root package name */
    public c f2844f;

    public r0() {
        this.f2841c = new x0.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r0(@h Application application, @g e eVar) {
        this(application, eVar, (Bundle) null);
        l0.p(eVar, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public r0(@h Application application, @g e eVar, @h Bundle bundle) {
        l0.p(eVar, "owner");
        this.f2844f = eVar.getSavedStateRegistry();
        this.f2843e = eVar.getLifecycle();
        this.f2842d = bundle;
        this.f2840b = application;
        this.f2841c = application != null ? x0.a.f2860f.b(application) : new x0.a();
    }

    @g
    public <T extends v0> T a(@g Class<T> cls) {
        l0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @g
    public <T extends v0> T b(@g Class<T> cls, @g a aVar) {
        l0.p(cls, "modelClass");
        l0.p(aVar, "extras");
        String str = (String) aVar.a(x0.c.f2870d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(o0.f2825c) != null && aVar.a(o0.f2826d) != null) {
            Application application = (Application) aVar.a(x0.a.f2863i);
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor<T> c10 = s0.c(cls, (!isAssignableFrom || application == null) ? s0.f2846b : s0.f2845a);
            if (c10 == null) {
                return this.f2841c.b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return s0.d(cls, c10, o0.a(aVar));
            }
            return s0.d(cls, c10, application, o0.a(aVar));
        } else if (this.f2843e != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    @d.x0({x0.a.P})
    public void c(@g v0 v0Var) {
        l0.p(v0Var, "viewModel");
        if (this.f2843e != null) {
            c cVar = this.f2844f;
            l0.m(cVar);
            p pVar = this.f2843e;
            l0.m(pVar);
            LegacySavedStateHandleController.a(v0Var, cVar, pVar);
        }
    }

    @g
    public final <T extends v0> T d(@g String str, @g Class<T> cls) {
        T t10;
        Application application;
        l0.p(str, "key");
        l0.p(cls, "modelClass");
        p pVar = this.f2843e;
        if (pVar != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Constructor<T> c10 = s0.c(cls, (!isAssignableFrom || this.f2840b == null) ? s0.f2846b : s0.f2845a);
            if (c10 == null) {
                return this.f2840b != null ? this.f2841c.a(cls) : x0.c.f2868b.a().a(cls);
            }
            c cVar = this.f2844f;
            l0.m(cVar);
            SavedStateHandleController b10 = LegacySavedStateHandleController.b(cVar, pVar, str, this.f2842d);
            if (!isAssignableFrom || (application = this.f2840b) == null) {
                t10 = s0.d(cls, c10, b10.i());
            } else {
                l0.m(application);
                t10 = s0.d(cls, c10, application, b10.i());
            }
            t10.f("androidx.lifecycle.savedstate.vm.tag", b10);
            return t10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
