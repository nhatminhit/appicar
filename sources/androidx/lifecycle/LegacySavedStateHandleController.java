package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ve.m;
import xe.l0;
import y2.c;
import y2.e;

public final class LegacySavedStateHandleController {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f2744a = new LegacySavedStateHandleController();
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final String f2745b = "androidx.lifecycle.savedstate.vm.tag";

    public static final class a implements c.a {
        public void a(@g e eVar) {
            l0.p(eVar, "owner");
            if (eVar instanceof b1) {
                a1 viewModelStore = ((b1) eVar).getViewModelStore();
                c savedStateRegistry = eVar.getSavedStateRegistry();
                for (String b10 : viewModelStore.c()) {
                    v0 b11 = viewModelStore.b(b10);
                    l0.m(b11);
                    LegacySavedStateHandleController.a(b11, savedStateRegistry, eVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.k(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    @m
    public static final void a(@g v0 v0Var, @g c cVar, @g p pVar) {
        l0.p(v0Var, "viewModel");
        l0.p(cVar, "registry");
        l0.p(pVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) v0Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.j()) {
            savedStateHandleController.a(cVar, pVar);
            f2744a.c(cVar, pVar);
        }
    }

    @g
    @m
    public static final SavedStateHandleController b(@g c cVar, @g p pVar, @h String str, @h Bundle bundle) {
        l0.p(cVar, "registry");
        l0.p(pVar, "lifecycle");
        l0.m(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, n0.f2812f.a(cVar.b(str), bundle));
        savedStateHandleController.a(cVar, pVar);
        f2744a.c(cVar, pVar);
        return savedStateHandleController;
    }

    public final void c(c cVar, p pVar) {
        p.b b10 = pVar.b();
        if (b10 == p.b.INITIALIZED || b10.b(p.b.STARTED)) {
            cVar.k(a.class);
        } else {
            pVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(pVar, cVar));
        }
    }
}
