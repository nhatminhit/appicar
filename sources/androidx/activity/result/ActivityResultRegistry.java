package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import d.j0;
import d.m0;
import d.o0;
import h0.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: i  reason: collision with root package name */
    public static final String f627i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: j  reason: collision with root package name */
    public static final String f628j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: k  reason: collision with root package name */
    public static final String f629k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: l  reason: collision with root package name */
    public static final String f630l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: m  reason: collision with root package name */
    public static final String f631m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: n  reason: collision with root package name */
    public static final String f632n = "ActivityResultRegistry";

    /* renamed from: o  reason: collision with root package name */
    public static final int f633o = 65536;

    /* renamed from: a  reason: collision with root package name */
    public Random f634a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f635b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f636c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, d> f637d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f638e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, c<?>> f639f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f640g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f641h = new Bundle();

    public class a extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f642a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f643b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a f644c;

        public a(String str, int i10, c.a aVar) {
            this.f642a = str;
            this.f643b = i10;
            this.f644c = aVar;
        }

        @m0
        public c.a<I, ?> a() {
            return this.f644c;
        }

        public void c(I i10, @o0 g gVar) {
            ActivityResultRegistry.this.f638e.add(this.f642a);
            ActivityResultRegistry.this.f(this.f643b, this.f644c, i10, gVar);
        }

        public void d() {
            ActivityResultRegistry.this.l(this.f642a);
        }
    }

    public class b extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f646a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f647b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a f648c;

        public b(String str, int i10, c.a aVar) {
            this.f646a = str;
            this.f647b = i10;
            this.f648c = aVar;
        }

        @m0
        public c.a<I, ?> a() {
            return this.f648c;
        }

        public void c(I i10, @o0 g gVar) {
            ActivityResultRegistry.this.f638e.add(this.f646a);
            ActivityResultRegistry.this.f(this.f647b, this.f648c, i10, gVar);
        }

        public void d() {
            ActivityResultRegistry.this.l(this.f646a);
        }
    }

    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        public final a<O> f650a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a<?, O> f651b;

        public c(a<O> aVar, c.a<?, O> aVar2) {
            this.f650a = aVar;
            this.f651b = aVar2;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final p f652a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<u> f653b = new ArrayList<>();

        public d(@m0 p pVar) {
            this.f652a = pVar;
        }

        public void a(@m0 u uVar) {
            this.f652a.a(uVar);
            this.f653b.add(uVar);
        }

        public void b() {
            Iterator<u> it = this.f653b.iterator();
            while (it.hasNext()) {
                this.f652a.d(it.next());
            }
            this.f653b.clear();
        }
    }

    public final void a(int i10, String str) {
        this.f635b.put(Integer.valueOf(i10), str);
        this.f636c.put(str, Integer.valueOf(i10));
    }

    @j0
    public final boolean b(int i10, int i11, @o0 Intent intent) {
        String str = this.f635b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f638e.remove(str);
        d(str, i11, intent, this.f639f.get(str));
        return true;
    }

    @j0
    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        a<O> aVar;
        String str = this.f635b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f638e.remove(str);
        c cVar = this.f639f.get(str);
        if (cVar == null || (aVar = cVar.f650a) == null) {
            this.f641h.remove(str);
            this.f640g.put(str, o10);
            return true;
        }
        aVar.a(o10);
        return true;
    }

    public final <O> void d(String str, int i10, @o0 Intent intent, @o0 c<O> cVar) {
        a<O> aVar;
        if (cVar == null || (aVar = cVar.f650a) == null) {
            this.f640g.remove(str);
            this.f641h.putParcelable(str, new ActivityResult(i10, intent));
            return;
        }
        aVar.a(cVar.f651b.c(i10, intent));
    }

    public final int e() {
        int nextInt = this.f634a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f635b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f634a.nextInt(2147418112);
        }
    }

    @j0
    public abstract <I, O> void f(int i10, @m0 c.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, @o0 g gVar);

    public final void g(@o0 Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f627i);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f628j);
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
                }
                this.f638e = bundle.getStringArrayList(f629k);
                this.f634a = (Random) bundle.getSerializable(f631m);
                this.f641h.putAll(bundle.getBundle(f630l));
            }
        }
    }

    public final void h(@m0 Bundle bundle) {
        bundle.putIntegerArrayList(f627i, new ArrayList(this.f635b.keySet()));
        bundle.putStringArrayList(f628j, new ArrayList(this.f635b.values()));
        bundle.putStringArrayList(f629k, new ArrayList(this.f638e));
        bundle.putBundle(f630l, (Bundle) this.f641h.clone());
        bundle.putSerializable(f631m, this.f634a);
    }

    @m0
    public final <I, O> c<I> i(@m0 final String str, @m0 y yVar, @m0 final c.a<I, O> aVar, @m0 final a<O> aVar2) {
        p lifecycle = yVar.getLifecycle();
        if (!lifecycle.b().b(p.b.STARTED)) {
            int k10 = k(str);
            d dVar = this.f637d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new u() {
                public void d(@m0 y yVar, @m0 p.a aVar) {
                    if (p.a.ON_START.equals(aVar)) {
                        ActivityResultRegistry.this.f639f.put(str, new c(aVar2, aVar));
                        if (ActivityResultRegistry.this.f640g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f640g.get(str);
                            ActivityResultRegistry.this.f640g.remove(str);
                            aVar2.a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f641h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f641h.remove(str);
                            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
                        }
                    } else if (p.a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f639f.remove(str);
                    } else if (p.a.ON_DESTROY.equals(aVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f637d.put(str, dVar);
            return new a(str, k10, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + yVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    @m0
    public final <I, O> c<I> j(@m0 String str, @m0 c.a<I, O> aVar, @m0 a<O> aVar2) {
        int k10 = k(str);
        this.f639f.put(str, new c(aVar2, aVar));
        if (this.f640g.containsKey(str)) {
            Object obj = this.f640g.get(str);
            this.f640g.remove(str);
            aVar2.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f641h.getParcelable(str);
        if (activityResult != null) {
            this.f641h.remove(str);
            aVar2.a(aVar.c(activityResult.b(), activityResult.a()));
        }
        return new b(str, k10, aVar);
    }

    public final int k(String str) {
        Integer num = this.f636c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e10 = e();
        a(e10, str);
        return e10;
    }

    @j0
    public final void l(@m0 String str) {
        Integer remove;
        if (!this.f638e.contains(str) && (remove = this.f636c.remove(str)) != null) {
            this.f635b.remove(remove);
        }
        this.f639f.remove(str);
        if (this.f640g.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f640g.get(str));
            this.f640g.remove(str);
        }
        if (this.f641h.containsKey(str)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Dropping pending result for request ");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(this.f641h.getParcelable(str));
            this.f641h.remove(str);
        }
        d dVar = this.f637d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f637d.remove(str);
        }
    }
}
