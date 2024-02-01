package y2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.y;
import androidx.savedstate.Recreator;
import d.j0;
import fh.g;
import fh.h;
import h0.u0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import xe.l0;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R$\u0010&\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d8G@BX\u000e¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\"\u0010-\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b#\u0010%\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Ly2/c;", "", "", "key", "Landroid/os/Bundle;", "b", "Ly2/c$c;", "provider", "Lzd/u2;", "j", "c", "m", "Ljava/lang/Class;", "Ly2/c$a;", "clazz", "k", "Landroidx/lifecycle/p;", "lifecycle", "g", "(Landroidx/lifecycle/p;)V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "Lo/b;", "a", "Lo/b;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "e", "()Z", "isRestored", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "f", "l", "(Z)V", "isAllowingSavingState", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
public final class c {
    @g

    /* renamed from: g  reason: collision with root package name */
    public static final b f15310g = new b((w) null);
    @g
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final String f15311h = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    @g

    /* renamed from: a  reason: collision with root package name */
    public final o.b<String, C0245c> f15312a = new o.b<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f15313b;
    @h

    /* renamed from: c  reason: collision with root package name */
    public Bundle f15314c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15315d;
    @h

    /* renamed from: e  reason: collision with root package name */
    public Recreator.b f15316e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15317f = true;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Ly2/c$a;", "", "Ly2/e;", "owner", "Lzd/u2;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    public interface a {
        void a(@g e eVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ly2/c$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Ly2/c$c;", "", "Landroid/os/Bundle;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: y2.c$c  reason: collision with other inner class name */
    public interface C0245c {
        @g
        Bundle a();
    }

    public static final void f(c cVar, y yVar, p.a aVar) {
        boolean z10;
        l0.p(cVar, "this$0");
        l0.p(yVar, "<anonymous parameter 0>");
        l0.p(aVar, u0.f8532r0);
        if (aVar == p.a.ON_START) {
            z10 = true;
        } else if (aVar == p.a.ON_STOP) {
            z10 = false;
        } else {
            return;
        }
        cVar.f15317f = z10;
    }

    @j0
    @h
    public final Bundle b(@g String str) {
        l0.p(str, "key");
        if (this.f15315d) {
            Bundle bundle = this.f15314c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f15314c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f15314c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f15314c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @h
    public final C0245c c(@g String str) {
        l0.p(str, "key");
        Iterator<Map.Entry<String, C0245c>> it = this.f15312a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            l0.o(next, "components");
            C0245c cVar = (C0245c) next.getValue();
            if (l0.g((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f15317f;
    }

    @j0
    public final boolean e() {
        return this.f15315d;
    }

    @j0
    public final void g(@g p pVar) {
        l0.p(pVar, "lifecycle");
        if (!this.f15313b) {
            pVar.a(new b(this));
            this.f15313b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @j0
    public final void h(@h Bundle bundle) {
        if (!this.f15313b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f15315d) {
            this.f15314c = bundle != null ? bundle.getBundle(f15311h) : null;
            this.f15315d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    @j0
    public final void i(@g Bundle bundle) {
        l0.p(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f15314c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.b<K, V>.d e10 = this.f15312a.e();
        l0.o(e10, "this.components.iteratorWithAdditions()");
        while (e10.hasNext()) {
            Map.Entry entry = (Map.Entry) e10.next();
            bundle2.putBundle((String) entry.getKey(), ((C0245c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f15311h, bundle2);
        }
    }

    @j0
    public final void j(@g String str, @g C0245c cVar) {
        l0.p(str, "key");
        l0.p(cVar, "provider");
        if (!(this.f15312a.i(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @j0
    public final void k(@g Class<? extends a> cls) {
        l0.p(cls, "clazz");
        if (this.f15317f) {
            Recreator.b bVar = this.f15316e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f15316e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f15316e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    l0.o(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    public final void l(boolean z10) {
        this.f15317f = z10;
    }

    @j0
    public final void m(@g String str) {
        l0.p(str, "key");
        this.f15312a.j(str);
    }
}
