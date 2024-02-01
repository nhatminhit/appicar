package androidx.fragment.app;

import androidx.lifecycle.a1;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class l extends v0 {

    /* renamed from: k  reason: collision with root package name */
    public static final String f2636k = "FragmentManager";

    /* renamed from: l  reason: collision with root package name */
    public static final x0.b f2637l = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Fragment> f2638d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, l> f2639e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, a1> f2640f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2641g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2642h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2643i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2644j = false;

    public class a implements x0.b {
        @m0
        public <T extends v0> T a(@m0 Class<T> cls) {
            return new l(true);
        }

        public /* synthetic */ v0 b(Class cls, i2.a aVar) {
            return y0.b(this, cls, aVar);
        }
    }

    public l(boolean z10) {
        this.f2641g = z10;
    }

    @m0
    public static l k(a1 a1Var) {
        return (l) new x0(a1Var, f2637l).a(l.class);
    }

    public void e() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCleared called for ");
            sb2.append(this);
        }
        this.f2642h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2638d.equals(lVar.f2638d) && this.f2639e.equals(lVar.f2639e) && this.f2640f.equals(lVar.f2640f);
    }

    public void g(@m0 Fragment fragment) {
        if (this.f2644j) {
            FragmentManager.T0(2);
        } else if (!this.f2638d.containsKey(fragment.T)) {
            this.f2638d.put(fragment.T, fragment);
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Updating retained Fragments: Added ");
                sb2.append(fragment);
            }
        }
    }

    public void h(@m0 Fragment fragment) {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Clearing non-config state for ");
            sb2.append(fragment);
        }
        l lVar = this.f2639e.get(fragment.T);
        if (lVar != null) {
            lVar.e();
            this.f2639e.remove(fragment.T);
        }
        a1 a1Var = this.f2640f.get(fragment.T);
        if (a1Var != null) {
            a1Var.a();
            this.f2640f.remove(fragment.T);
        }
    }

    public int hashCode() {
        return (((this.f2638d.hashCode() * 31) + this.f2639e.hashCode()) * 31) + this.f2640f.hashCode();
    }

    @o0
    public Fragment i(String str) {
        return this.f2638d.get(str);
    }

    @m0
    public l j(@m0 Fragment fragment) {
        l lVar = this.f2639e.get(fragment.T);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f2641g);
        this.f2639e.put(fragment.T, lVar2);
        return lVar2;
    }

    @m0
    public Collection<Fragment> l() {
        return new ArrayList(this.f2638d.values());
    }

    @o0
    @Deprecated
    public k m() {
        if (this.f2638d.isEmpty() && this.f2639e.isEmpty() && this.f2640f.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f2639e.entrySet()) {
            k m10 = ((l) next.getValue()).m();
            if (m10 != null) {
                hashMap.put(next.getKey(), m10);
            }
        }
        this.f2643i = true;
        if (!this.f2638d.isEmpty() || !hashMap.isEmpty() || !this.f2640f.isEmpty()) {
            return new k(new ArrayList(this.f2638d.values()), hashMap, new HashMap(this.f2640f));
        }
        return null;
    }

    @m0
    public a1 n(@m0 Fragment fragment) {
        a1 a1Var = this.f2640f.get(fragment.T);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1();
        this.f2640f.put(fragment.T, a1Var2);
        return a1Var2;
    }

    public boolean o() {
        return this.f2642h;
    }

    public void p(@m0 Fragment fragment) {
        if (this.f2644j) {
            FragmentManager.T0(2);
            return;
        }
        if ((this.f2638d.remove(fragment.T) != null) && FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Updating retained Fragments: Removed ");
            sb2.append(fragment);
        }
    }

    @Deprecated
    public void q(@o0 k kVar) {
        this.f2638d.clear();
        this.f2639e.clear();
        this.f2640f.clear();
        if (kVar != null) {
            Collection<Fragment> b10 = kVar.b();
            if (b10 != null) {
                for (Fragment next : b10) {
                    if (next != null) {
                        this.f2638d.put(next.T, next);
                    }
                }
            }
            Map<String, k> a10 = kVar.a();
            if (a10 != null) {
                for (Map.Entry next2 : a10.entrySet()) {
                    l lVar = new l(this.f2641g);
                    lVar.q((k) next2.getValue());
                    this.f2639e.put(next2.getKey(), lVar);
                }
            }
            Map<String, a1> c10 = kVar.c();
            if (c10 != null) {
                this.f2640f.putAll(c10);
            }
        }
        this.f2643i = false;
    }

    public void r(boolean z10) {
        this.f2644j = z10;
    }

    public boolean s(@m0 Fragment fragment) {
        if (!this.f2638d.containsKey(fragment.T)) {
            return true;
        }
        return this.f2641g ? this.f2642h : !this.f2643i;
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2638d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2639e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2640f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
