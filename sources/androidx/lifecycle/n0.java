package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import be.a1;
import be.m1;
import d.j0;
import d.x0;
import fh.g;
import fh.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import uf.e0;
import uf.k;
import uf.t0;
import uf.v0;
import ve.m;
import xe.l0;
import xe.r1;
import xe.w;
import y2.c;

@r1({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
public final class n0 {
    @g

    /* renamed from: f  reason: collision with root package name */
    public static final a f2812f = new a((w) null);
    @g

    /* renamed from: g  reason: collision with root package name */
    public static final String f2813g = "values";
    @g

    /* renamed from: h  reason: collision with root package name */
    public static final String f2814h = "keys";
    @g

    /* renamed from: i  reason: collision with root package name */
    public static final Class<? extends Object>[] f2815i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2816a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, c.C0245c> f2817b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, b<?>> f2818c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, e0<Object>> f2819d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public final c.C0245c f2820e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @x0({x0.a.P})
        @g
        @m
        public final n0 a(@h Bundle bundle, @h Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(n0.f2814h);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(n0.f2813g);
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = parcelableArrayList.get(i10);
                        l0.n(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                    }
                    return new n0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new n0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    l0.o(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new n0(hashMap);
            }
        }

        @x0({x0.a.P})
        public final boolean b(@h Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : n0.f2815i) {
                l0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b<T> extends g0<T> {
        @g

        /* renamed from: m  reason: collision with root package name */
        public String f2821m;
        @h

        /* renamed from: n  reason: collision with root package name */
        public n0 f2822n;

        public b(@h n0 n0Var, @g String str) {
            l0.p(str, "key");
            this.f2821m = str;
            this.f2822n = n0Var;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(@h n0 n0Var, @g String str, T t10) {
            super(t10);
            l0.p(str, "key");
            this.f2821m = str;
            this.f2822n = n0Var;
        }

        public void r(T t10) {
            n0 n0Var = this.f2822n;
            if (n0Var != null) {
                n0Var.f2816a.put(this.f2821m, t10);
                e0 e0Var = (e0) n0Var.f2819d.get(this.f2821m);
                if (e0Var != null) {
                    e0Var.setValue(t10);
                }
            }
            super.r(t10);
        }

        public final void s() {
            this.f2822n = null;
        }
    }

    public n0() {
        this.f2816a = new LinkedHashMap();
        this.f2817b = new LinkedHashMap();
        this.f2818c = new LinkedHashMap();
        this.f2819d = new LinkedHashMap();
        this.f2820e = new m0(this);
    }

    public n0(@g Map<String, ? extends Object> map) {
        l0.p(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2816a = linkedHashMap;
        this.f2817b = new LinkedHashMap();
        this.f2818c = new LinkedHashMap();
        this.f2819d = new LinkedHashMap();
        this.f2820e = new m0(this);
        linkedHashMap.putAll(map);
    }

    @x0({x0.a.P})
    @g
    @m
    public static final n0 g(@h Bundle bundle, @h Bundle bundle2) {
        return f2812f.a(bundle, bundle2);
    }

    public static final Bundle p(n0 n0Var) {
        l0.p(n0Var, "this$0");
        for (Map.Entry next : a1.F0(n0Var.f2817b).entrySet()) {
            n0Var.q((String) next.getKey(), ((c.C0245c) next.getValue()).a());
        }
        Set<String> keySet = n0Var.f2816a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next2 : keySet) {
            arrayList.add(next2);
            arrayList2.add(n0Var.f2816a.get(next2));
        }
        return x0.b.a(zd.r1.a(f2814h, arrayList), zd.r1.a(f2813g, arrayList2));
    }

    @j0
    public final void e(@g String str) {
        l0.p(str, "key");
        this.f2817b.remove(str);
    }

    @j0
    public final boolean f(@g String str) {
        l0.p(str, "key");
        return this.f2816a.containsKey(str);
    }

    @j0
    @h
    public final <T> T h(@g String str) {
        l0.p(str, "key");
        try {
            return this.f2816a.get(str);
        } catch (ClassCastException unused) {
            n(str);
            return null;
        }
    }

    @g
    @j0
    public final <T> g0<T> i(@g String str) {
        l0.p(str, "key");
        g0<T> k10 = k(str, false, (Object) null);
        l0.n(k10, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return k10;
    }

    @g
    @j0
    public final <T> g0<T> j(@g String str, T t10) {
        l0.p(str, "key");
        return k(str, true, t10);
    }

    public final <T> g0<T> k(String str, boolean z10, T t10) {
        b bVar;
        b<?> bVar2 = this.f2818c.get(str);
        g0<T> g0Var = bVar2 instanceof g0 ? bVar2 : null;
        if (g0Var != null) {
            return g0Var;
        }
        if (this.f2816a.containsKey(str)) {
            bVar = new b(this, str, this.f2816a.get(str));
        } else if (z10) {
            this.f2816a.put(str, t10);
            bVar = new b(this, str, t10);
        } else {
            bVar = new b(this, str);
        }
        this.f2818c.put(str, bVar);
        return bVar;
    }

    @g
    @j0
    public final <T> t0<T> l(@g String str, T t10) {
        l0.p(str, "key");
        Map<String, e0<Object>> map = this.f2819d;
        e0<Object> e0Var = map.get(str);
        if (e0Var == null) {
            if (!this.f2816a.containsKey(str)) {
                this.f2816a.put(str, t10);
            }
            e0Var = v0.a(this.f2816a.get(str));
            this.f2819d.put(str, e0Var);
            map.put(str, e0Var);
        }
        t0<T> m10 = k.m(e0Var);
        l0.n(m10, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m10;
    }

    @g
    @j0
    public final Set<String> m() {
        return m1.D(m1.D(this.f2816a.keySet(), this.f2817b.keySet()), this.f2818c.keySet());
    }

    @j0
    @h
    public final <T> T n(@g String str) {
        l0.p(str, "key");
        T remove = this.f2816a.remove(str);
        b remove2 = this.f2818c.remove(str);
        if (remove2 != null) {
            remove2.s();
        }
        this.f2819d.remove(str);
        return remove;
    }

    @x0({x0.a.P})
    @g
    public final c.C0245c o() {
        return this.f2820e;
    }

    @j0
    public final <T> void q(@g String str, @h T t10) {
        l0.p(str, "key");
        if (f2812f.b(t10)) {
            b<?> bVar = this.f2818c.get(str);
            g0 g0Var = bVar instanceof g0 ? bVar : null;
            if (g0Var != null) {
                g0Var.r(t10);
            } else {
                this.f2816a.put(str, t10);
            }
            e0 e0Var = this.f2819d.get(str);
            if (e0Var != null) {
                e0Var.setValue(t10);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        l0.m(t10);
        sb2.append(t10.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    @j0
    public final void r(@g String str, @g c.C0245c cVar) {
        l0.p(str, "key");
        l0.p(cVar, "provider");
        this.f2817b.put(str, cVar);
    }
}
