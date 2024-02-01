package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import fh.g;
import h0.u0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import xe.l0;
import xe.w;
import y2.c;
import y2.e;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\n\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/p$a;", "event", "Lzd/u2;", "d", "", "className", "a", "Ly2/e;", "O", "Ly2/e;", "owner", "<init>", "(Ly2/e;)V", "P", "b", "savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class Recreator implements u {
    @g
    public static final a P = new a((w) null);
    @g
    public static final String Q = "classes_to_restore";
    @g
    public static final String R = "androidx.savedstate.Restarter";
    @g
    public final e O;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/savedstate/Recreator$a;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/savedstate/Recreator$b;", "Ly2/c$c;", "Landroid/os/Bundle;", "a", "", "className", "Lzd/u2;", "b", "", "Ljava/util/Set;", "classes", "Ly2/c;", "registry", "<init>", "(Ly2/c;)V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements c.C0245c {
        @g

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f3802a = new LinkedHashSet();

        public b(@g c cVar) {
            l0.p(cVar, "registry");
            cVar.j(Recreator.R, this);
        }

        @g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.Q, new ArrayList(this.f3802a));
            return bundle;
        }

        public final void b(@g String str) {
            l0.p(str, "className");
            this.f3802a.add(str);
        }
    }

    public Recreator(@g e eVar) {
        l0.p(eVar, "owner");
        this.O = eVar;
    }

    public final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.a.class);
            l0.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    l0.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((c.a) newInstance).a(this.O);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, b4.a.P);
        l0.p(aVar, u0.f8532r0);
        if (aVar == p.a.ON_CREATE) {
            yVar.getLifecycle().d(this);
            Bundle b10 = this.O.getSavedStateRegistry().b(R);
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList(Q);
                if (stringArrayList != null) {
                    for (String a10 : stringArrayList) {
                        a(a10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
