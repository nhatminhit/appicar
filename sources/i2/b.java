package i2;

import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import fh.g;
import xe.l0;
import xe.r1;

@r1({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
public final class b implements x0.b {
    @g

    /* renamed from: b  reason: collision with root package name */
    public final h<?>[] f9018b;

    public b(@g h<?>... hVarArr) {
        l0.p(hVarArr, "initializers");
        this.f9018b = hVarArr;
    }

    public /* synthetic */ v0 a(Class cls) {
        return y0.a(this, cls);
    }

    @g
    public <T extends v0> T b(@g Class<T> cls, @g a aVar) {
        l0.p(cls, "modelClass");
        l0.p(aVar, "extras");
        T t10 = null;
        for (h<?> hVar : this.f9018b) {
            if (l0.g(hVar.a(), cls)) {
                T A = hVar.b().A(aVar);
                t10 = A instanceof v0 ? (v0) A : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
