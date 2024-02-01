package p8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import f8.b;
import h9.l;
import h9.p;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11744a;

    public /* synthetic */ m(AtomicReference atomicReference) {
        this.f11744a = atomicReference;
    }

    public final h9.m a(Object obj) {
        AtomicReference atomicReference = this.f11744a;
        Void voidR = (Void) obj;
        int i10 = a0.f11735p;
        return atomicReference.get() != null ? p.g((ModuleInstallResponse) atomicReference.get()) : p.f(new b(Status.W));
    }
}
