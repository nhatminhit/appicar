package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import androidx.lifecycle.p;
import d.m0;
import d.o0;
import java.io.PrintWriter;
import java.util.ArrayList;
import y3.q;

public final class a extends u implements FragmentManager.k, FragmentManager.p {
    public static final String O = "FragmentManager";
    public final FragmentManager L;
    public boolean M;
    public int N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@m0 FragmentManager fragmentManager) {
        super(fragmentManager.E0(), fragmentManager.H0() != null ? fragmentManager.H0().f().getClassLoader() : null);
        this.N = -1;
        this.L = fragmentManager;
    }

    public static boolean Z(u.a aVar) {
        Fragment fragment = aVar.f2708b;
        return fragment != null && fragment.Z && fragment.f2461v0 != null && !fragment.f2454o0 && !fragment.f2453n0 && fragment.T();
    }

    @m0
    public u K(@m0 Fragment fragment, @m0 p.b bVar) {
        if (fragment.f2446g0 != this.L) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.L);
        } else if (bVar == p.b.INITIALIZED && fragment.O > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != p.b.DESTROYED) {
            return super.K(fragment, bVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    @m0
    public u L(@o0 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.f2446g0) == null || fragmentManager == this.L) {
            return super.L(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @m0
    public u P(@m0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.f2446g0;
        if (fragmentManager == null || fragmentManager == this.L) {
            return super.P(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void Q(int i10) {
        if (this.f2696i) {
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Bump nesting in ");
                sb2.append(this);
                sb2.append(" by ");
                sb2.append(i10);
            }
            int size = this.f2690c.size();
            for (int i11 = 0; i11 < size; i11++) {
                u.a aVar = this.f2690c.get(i11);
                Fragment fragment = aVar.f2708b;
                if (fragment != null) {
                    fragment.f2445f0 += i10;
                    if (FragmentManager.T0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Bump nesting of ");
                        sb3.append(aVar.f2708b);
                        sb3.append(" to ");
                        sb3.append(aVar.f2708b.f2445f0);
                    }
                }
            }
        }
    }

    public int R(boolean z10) {
        if (!this.M) {
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Commit: ");
                sb2.append(this);
                PrintWriter printWriter = new PrintWriter(new z("FragmentManager"));
                S(q.a.R, printWriter);
                printWriter.close();
            }
            this.M = true;
            this.N = this.f2696i ? this.L.o() : -1;
            this.L.f0(this, z10);
            return this.N;
        }
        throw new IllegalStateException("commit already called");
    }

    public void S(String str, PrintWriter printWriter) {
        T(str, printWriter, true);
    }

    public void T(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2698k);
            printWriter.print(" mIndex=");
            printWriter.print(this.N);
            printWriter.print(" mCommitted=");
            printWriter.println(this.M);
            if (this.f2695h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2695h));
            }
            if (!(this.f2691d == 0 && this.f2692e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2691d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2692e));
            }
            if (!(this.f2693f == 0 && this.f2694g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2693f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2694g));
            }
            if (!(this.f2699l == 0 && this.f2700m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2699l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2700m);
            }
            if (!(this.f2701n == 0 && this.f2702o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2701n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2702o);
            }
        }
        if (!this.f2690c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2690c.size();
            for (int i10 = 0; i10 < size; i10++) {
                u.a aVar = this.f2690c.get(i10);
                switch (aVar.f2707a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2707a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2708b);
                if (z10) {
                    if (!(aVar.f2709c == 0 && aVar.f2710d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2709c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2710d));
                    }
                    if (aVar.f2711e != 0 || aVar.f2712f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2711e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2712f));
                    }
                }
            }
        }
    }

    public void U() {
        int size = this.f2690c.size();
        for (int i10 = 0; i10 < size; i10++) {
            u.a aVar = this.f2690c.get(i10);
            Fragment fragment = aVar.f2708b;
            if (fragment != null) {
                fragment.G0(false);
                fragment.E0(this.f2695h);
                fragment.I0(this.f2703p, this.f2704q);
            }
            switch (aVar.f2707a) {
                case 1:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.K1(fragment, false);
                    this.L.k(fragment);
                    break;
                case 3:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.x1(fragment);
                    break;
                case 4:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.Q0(fragment);
                    break;
                case 5:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.K1(fragment, false);
                    this.L.Q1(fragment);
                    break;
                case 6:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.C(fragment);
                    break;
                case 7:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.K1(fragment, false);
                    this.L.q(fragment);
                    break;
                case 8:
                    this.L.N1(fragment);
                    break;
                case 9:
                    this.L.N1((Fragment) null);
                    break;
                case 10:
                    this.L.M1(fragment, aVar.f2714h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2707a);
            }
            if (!this.f2705r && aVar.f2707a != 1 && fragment != null && !FragmentManager.Q) {
                this.L.d1(fragment);
            }
        }
        if (!this.f2705r && !FragmentManager.Q) {
            FragmentManager fragmentManager = this.L;
            fragmentManager.e1(fragmentManager.f2525q, true);
        }
    }

    public void V(boolean z10) {
        for (int size = this.f2690c.size() - 1; size >= 0; size--) {
            u.a aVar = this.f2690c.get(size);
            Fragment fragment = aVar.f2708b;
            if (fragment != null) {
                fragment.G0(true);
                fragment.E0(FragmentManager.G1(this.f2695h));
                fragment.I0(this.f2704q, this.f2703p);
            }
            switch (aVar.f2707a) {
                case 1:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.K1(fragment, true);
                    this.L.x1(fragment);
                    break;
                case 3:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.k(fragment);
                    break;
                case 4:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.Q1(fragment);
                    break;
                case 5:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.K1(fragment, true);
                    this.L.Q0(fragment);
                    break;
                case 6:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.q(fragment);
                    break;
                case 7:
                    fragment.A0(aVar.f2709c, aVar.f2710d, aVar.f2711e, aVar.f2712f);
                    this.L.K1(fragment, true);
                    this.L.C(fragment);
                    break;
                case 8:
                    this.L.N1((Fragment) null);
                    break;
                case 9:
                    this.L.N1(fragment);
                    break;
                case 10:
                    this.L.M1(fragment, aVar.f2713g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2707a);
            }
            if (!this.f2705r && aVar.f2707a != 3 && fragment != null && !FragmentManager.Q) {
                this.L.d1(fragment);
            }
        }
        if (!this.f2705r && z10 && !FragmentManager.Q) {
            FragmentManager fragmentManager = this.L;
            fragmentManager.e1(fragmentManager.f2525q, true);
        }
    }

    public Fragment W(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f2690c.size()) {
            u.a aVar = this.f2690c.get(i10);
            int i11 = aVar.f2707a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f2708b;
                    int i12 = fragment3.f2451l0;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2451l0 == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2690c.add(i10, new u.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                u.a aVar2 = new u.a(3, fragment4);
                                aVar2.f2709c = aVar.f2709c;
                                aVar2.f2711e = aVar.f2711e;
                                aVar2.f2710d = aVar.f2710d;
                                aVar2.f2712f = aVar.f2712f;
                                this.f2690c.add(i10, aVar2);
                                arrayList2.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f2690c.remove(i10);
                        i10--;
                    } else {
                        aVar.f2707a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f2708b);
                    Fragment fragment5 = aVar.f2708b;
                    if (fragment5 == fragment2) {
                        this.f2690c.add(i10, new u.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f2690c.add(i10, new u.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f2708b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f2708b);
            i10++;
        }
        return fragment2;
    }

    public boolean X(int i10) {
        int size = this.f2690c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f2690c.get(i11).f2708b;
            int i12 = fragment != null ? fragment.f2451l0 : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean Y(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f2690c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f2690c.get(i13).f2708b;
            int i14 = fragment != null ? fragment.f2451l0 : 0;
            if (!(i14 == 0 || i14 == i12)) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f2690c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f2690c.get(i16).f2708b;
                        if ((fragment2 != null ? fragment2.f2451l0 : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    public boolean a(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Run: ");
            sb2.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2696i) {
            return true;
        }
        this.L.i(this);
        return true;
    }

    public boolean a0() {
        for (int i10 = 0; i10 < this.f2690c.size(); i10++) {
            if (Z(this.f2690c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void b0() {
        if (this.f2706s != null) {
            for (int i10 = 0; i10 < this.f2706s.size(); i10++) {
                this.f2706s.get(i10).run();
            }
            this.f2706s = null;
        }
    }

    public void c0(Fragment.l lVar) {
        for (int i10 = 0; i10 < this.f2690c.size(); i10++) {
            u.a aVar = this.f2690c.get(i10);
            if (Z(aVar)) {
                aVar.f2708b.F0(lVar);
            }
        }
    }

    public Fragment d0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2690c.size() - 1; size >= 0; size--) {
            u.a aVar = this.f2690c.get(size);
            int i10 = aVar.f2707a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2708b;
                            break;
                        case 10:
                            aVar.f2714h = aVar.f2713g;
                            break;
                    }
                }
                arrayList.add(aVar.f2708b);
            }
            arrayList.remove(aVar.f2708b);
        }
        return fragment;
    }

    @o0
    public CharSequence getBreadCrumbShortTitle() {
        return this.f2701n != 0 ? this.L.H0().f().getText(this.f2701n) : this.f2702o;
    }

    public int getBreadCrumbShortTitleRes() {
        return this.f2701n;
    }

    @o0
    public CharSequence getBreadCrumbTitle() {
        return this.f2699l != 0 ? this.L.H0().f().getText(this.f2699l) : this.f2700m;
    }

    public int getBreadCrumbTitleRes() {
        return this.f2699l;
    }

    public int getId() {
        return this.N;
    }

    @o0
    public String getName() {
        return this.f2698k;
    }

    public int m() {
        return R(false);
    }

    public int n() {
        return R(true);
    }

    public void o() {
        s();
        this.L.i0(this, false);
    }

    public void p() {
        s();
        this.L.i0(this, true);
    }

    @m0
    public u r(@m0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.f2446g0;
        if (fragmentManager == null || fragmentManager == this.L) {
            return super.r(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void t(int i10, Fragment fragment, @o0 String str, int i11) {
        super.t(i10, fragment, str, i11);
        fragment.f2446g0 = this.L;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.N >= 0) {
            sb2.append(" #");
            sb2.append(this.N);
        }
        if (this.f2698k != null) {
            sb2.append(" ");
            sb2.append(this.f2698k);
        }
        sb2.append(p7.a.f11639j);
        return sb2.toString();
    }

    @m0
    public u u(@m0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.f2446g0;
        if (fragmentManager == null || fragmentManager == this.L) {
            return super.u(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public boolean w() {
        return this.f2690c.isEmpty();
    }

    @m0
    public u x(@m0 Fragment fragment) {
        FragmentManager fragmentManager = fragment.f2446g0;
        if (fragmentManager == null || fragmentManager == this.L) {
            return super.x(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}
