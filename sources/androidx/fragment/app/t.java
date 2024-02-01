package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import d.b0;
import d.m0;
import d.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final String f2677d = "FragmentManager";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Fragment> f2678a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, q> f2679b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public l f2680c;

    public void a(@m0 Fragment fragment) {
        if (!this.f2678a.contains(fragment)) {
            synchronized (this.f2678a) {
                this.f2678a.add(fragment);
            }
            fragment.Z = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.f2679b.values().removeAll(Collections.singleton((Object) null));
    }

    public boolean c(@m0 String str) {
        return this.f2679b.get(str) != null;
    }

    public void d(int i10) {
        for (q next : this.f2679b.values()) {
            if (next != null) {
                next.u(i10);
            }
        }
    }

    public void e(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2679b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q next : this.f2679b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k10 = next.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2678a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2678a.get(i10).toString());
            }
        }
    }

    @o0
    public Fragment f(@m0 String str) {
        q qVar = this.f2679b.get(str);
        if (qVar != null) {
            return qVar.k();
        }
        return null;
    }

    @o0
    public Fragment g(@b0 int i10) {
        for (int size = this.f2678a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2678a.get(size);
            if (fragment != null && fragment.f2450k0 == i10) {
                return fragment;
            }
        }
        for (q next : this.f2679b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                if (k10.f2450k0 == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    @o0
    public Fragment h(@o0 String str) {
        if (str != null) {
            for (int size = this.f2678a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2678a.get(size);
                if (fragment != null && str.equals(fragment.f2452m0)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (q next : this.f2679b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                if (str.equals(k10.f2452m0)) {
                    return k10;
                }
            }
        }
        return null;
    }

    @o0
    public Fragment i(@m0 String str) {
        Fragment x10;
        for (q next : this.f2679b.values()) {
            if (next != null && (x10 = next.k().x(str)) != null) {
                return x10;
            }
        }
        return null;
    }

    public int j(@m0 Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f2460u0;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2678a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f2678a.get(i10);
            if (fragment2.f2460u0 == viewGroup && (view2 = fragment2.f2461v0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2678a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2678a.get(indexOf);
            if (fragment3.f2460u0 == viewGroup && (view = fragment3.f2461v0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public int k() {
        return this.f2679b.size();
    }

    @m0
    public List<q> l() {
        ArrayList arrayList = new ArrayList();
        for (q next : this.f2679b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @m0
    public List<Fragment> m() {
        ArrayList arrayList = new ArrayList();
        Iterator<q> it = this.f2679b.values().iterator();
        while (it.hasNext()) {
            q next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    @o0
    public q n(@m0 String str) {
        return this.f2679b.get(str);
    }

    @m0
    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.f2678a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2678a) {
            arrayList = new ArrayList(this.f2678a);
        }
        return arrayList;
    }

    public l p() {
        return this.f2680c;
    }

    public void q(@m0 q qVar) {
        Fragment k10 = qVar.k();
        if (!c(k10.T)) {
            this.f2679b.put(k10.T, qVar);
            if (k10.f2456q0) {
                if (k10.f2455p0) {
                    this.f2680c.g(k10);
                } else {
                    this.f2680c.p(k10);
                }
                k10.f2456q0 = false;
            }
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Added fragment to active set ");
                sb2.append(k10);
            }
        }
    }

    public void r(@m0 q qVar) {
        Fragment k10 = qVar.k();
        if (k10.f2455p0) {
            this.f2680c.p(k10);
        }
        if (this.f2679b.put(k10.T, (Object) null) != null && FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Removed fragment from active set ");
            sb2.append(k10);
        }
    }

    public void s() {
        Iterator<Fragment> it = this.f2678a.iterator();
        while (it.hasNext()) {
            q qVar = this.f2679b.get(it.next().T);
            if (qVar != null) {
                qVar.m();
            }
        }
        for (q next : this.f2679b.values()) {
            if (next != null) {
                next.m();
                Fragment k10 = next.k();
                if (k10.f2440a0 && !k10.S()) {
                    r(next);
                }
            }
        }
    }

    public void t(@m0 Fragment fragment) {
        synchronized (this.f2678a) {
            this.f2678a.remove(fragment);
        }
        fragment.Z = false;
    }

    public void u() {
        this.f2679b.clear();
    }

    public void v(@o0 List<String> list) {
        this.f2678a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f10 = f(next);
                if (f10 != null) {
                    if (FragmentManager.T0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("restoreSaveState: added (");
                        sb2.append(next);
                        sb2.append("): ");
                        sb2.append(f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    @m0
    public ArrayList<FragmentState> w() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f2679b.size());
        for (q next : this.f2679b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                FragmentState s10 = next.s();
                arrayList.add(s10);
                if (FragmentManager.T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Saved state of ");
                    sb2.append(k10);
                    sb2.append(": ");
                    sb2.append(s10.f2556a0);
                }
            }
        }
        return arrayList;
    }

    @o0
    public ArrayList<String> x() {
        synchronized (this.f2678a) {
            if (this.f2678a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2678a.size());
            Iterator<Fragment> it = this.f2678a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.T);
                if (FragmentManager.T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("saveAllState: adding fragment (");
                    sb2.append(next.T);
                    sb2.append("): ");
                    sb2.append(next);
                }
            }
            return arrayList;
        }
    }

    public void y(@m0 l lVar) {
        this.f2680c = lVar;
    }
}
