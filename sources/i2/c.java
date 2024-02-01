package i2;

import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import fh.g;
import hf.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ve.a;
import we.l;
import xe.l0;
import xe.r1;

@r1({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
@g
public final class c {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final List<h<?>> f9019a = new ArrayList();

    public final <T extends v0> void a(@g d<T> dVar, @g l<? super a, ? extends T> lVar) {
        l0.p(dVar, "clazz");
        l0.p(lVar, "initializer");
        this.f9019a.add(new h(a.d(dVar), lVar));
    }

    @g
    public final x0.b b() {
        h[] hVarArr = (h[]) this.f9019a.toArray(new h[0]);
        return new b((h[]) Arrays.copyOf(hVarArr, hVarArr.length));
    }
}
