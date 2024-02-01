package e1;

import android.annotation.SuppressLint;
import android.util.Pair;
import fh.g;
import kotlin.Metadata;
import xe.l0;
import zd.u0;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0004\u001a1\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\b\u001a1\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\b\u001a,\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\n¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\b\u001a1\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\b¨\u0006\u000f"}, d2 = {"F", "S", "Le1/j;", "b", "(Le1/j;)Ljava/lang/Object;", "d", "Lzd/u0;", "h", "f", "Landroid/util/Pair;", "a", "(Landroid/util/Pair;)Ljava/lang/Object;", "c", "g", "e", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class k {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@g Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@g j<F, S> jVar) {
        l0.p(jVar, "<this>");
        return jVar.f6732a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@g Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@g j<F, S> jVar) {
        l0.p(jVar, "<this>");
        return jVar.f6733b;
    }

    @g
    public static final <F, S> Pair<F, S> e(@g u0<? extends F, ? extends S> u0Var) {
        l0.p(u0Var, "<this>");
        return new Pair<>(u0Var.e(), u0Var.f());
    }

    @g
    public static final <F, S> j<F, S> f(@g u0<? extends F, ? extends S> u0Var) {
        l0.p(u0Var, "<this>");
        return new j<>(u0Var.e(), u0Var.f());
    }

    @g
    public static final <F, S> u0<F, S> g(@g Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return new u0<>(pair.first, pair.second);
    }

    @g
    public static final <F, S> u0<F, S> h(@g j<F, S> jVar) {
        l0.p(jVar, "<this>");
        return new u0<>(jVar.f6732a, jVar.f6733b);
    }
}
