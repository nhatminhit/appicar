package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.x0;
import d.x0;
import fh.g;
import fh.h;
import xe.l0;
import xe.w;
import y2.c;
import y2.e;

public abstract class a extends x0.d implements x0.b {
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final C0037a f2761e = new C0037a((w) null);
    @g

    /* renamed from: f  reason: collision with root package name */
    public static final String f2762f = "androidx.lifecycle.savedstate.vm.tag";
    @h

    /* renamed from: b  reason: collision with root package name */
    public c f2763b;
    @h

    /* renamed from: c  reason: collision with root package name */
    public p f2764c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2765d;

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static final class C0037a {
        public C0037a() {
        }

        public /* synthetic */ C0037a(w wVar) {
            this();
        }
    }

    public a() {
    }

    public a(@g e eVar, @h Bundle bundle) {
        l0.p(eVar, "owner");
        this.f2763b = eVar.getSavedStateRegistry();
        this.f2764c = eVar.getLifecycle();
        this.f2765d = bundle;
    }

    @g
    public <T extends v0> T a(@g Class<T> cls) {
        l0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f2764c != null) {
            return d(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @g
    public <T extends v0> T b(@g Class<T> cls, @g i2.a aVar) {
        l0.p(cls, "modelClass");
        l0.p(aVar, "extras");
        String str = (String) aVar.a(x0.c.f2870d);
        if (str != null) {
            return this.f2763b != null ? d(str, cls) : e(str, cls, o0.a(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @d.x0({x0.a.P})
    public void c(@g v0 v0Var) {
        l0.p(v0Var, "viewModel");
        c cVar = this.f2763b;
        if (cVar != null) {
            l0.m(cVar);
            p pVar = this.f2764c;
            l0.m(pVar);
            LegacySavedStateHandleController.a(v0Var, cVar, pVar);
        }
    }

    public final <T extends v0> T d(String str, Class<T> cls) {
        c cVar = this.f2763b;
        l0.m(cVar);
        p pVar = this.f2764c;
        l0.m(pVar);
        SavedStateHandleController b10 = LegacySavedStateHandleController.b(cVar, pVar, str, this.f2765d);
        T e10 = e(str, cls, b10.i());
        e10.f("androidx.lifecycle.savedstate.vm.tag", b10);
        return e10;
    }

    @g
    public abstract <T extends v0> T e(@g String str, @g Class<T> cls, @g n0 n0Var);
}
