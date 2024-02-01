package p8;

import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import g8.m;
import h9.n;
import java.util.concurrent.atomic.AtomicReference;
import o8.a;

public final /* synthetic */ class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f11737a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11738b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f11739c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ApiFeatureRequest f11740d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c f11741e;

    public /* synthetic */ k(a0 a0Var, AtomicReference atomicReference, a aVar, ApiFeatureRequest apiFeatureRequest, c cVar) {
        this.f11737a = a0Var;
        this.f11738b = atomicReference;
        this.f11739c = aVar;
        this.f11740d = apiFeatureRequest;
        this.f11741e = cVar;
    }

    public final void accept(Object obj, Object obj2) {
        a0 a0Var = this.f11737a;
        AtomicReference atomicReference = this.f11738b;
        a aVar = this.f11739c;
        ApiFeatureRequest apiFeatureRequest = this.f11740d;
        c cVar = this.f11741e;
        ((h) ((b0) obj).M()).a2(new w(a0Var, atomicReference, (n) obj2, aVar), apiFeatureRequest, cVar);
    }
}
