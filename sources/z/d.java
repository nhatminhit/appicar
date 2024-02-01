package z;

import a0.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import w.c;
import w.i;

public class d {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f15616j = false;

    /* renamed from: k  reason: collision with root package name */
    public static final int f15617k = -1;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f15618a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f15619b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15620c;

    /* renamed from: d  reason: collision with root package name */
    public final e f15621d;

    /* renamed from: e  reason: collision with root package name */
    public final b f15622e;

    /* renamed from: f  reason: collision with root package name */
    public d f15623f;

    /* renamed from: g  reason: collision with root package name */
    public int f15624g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f15625h = -1;

    /* renamed from: i  reason: collision with root package name */
    public i f15626i;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15627a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                z.d$b[] r0 = z.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15627a = r0
                z.d$b r1 = z.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x001d }
                z.d$b r1 = z.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z.d$b r1 = z.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x0033 }
                z.d$b r1 = z.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x003e }
                z.d$b r1 = z.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x0049 }
                z.d$b r1 = z.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x0054 }
                z.d$b r1 = z.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x0060 }
                z.d$b r1 = z.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f15627a     // Catch:{ NoSuchFieldError -> 0x006c }
                z.d$b r1 = z.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f15621d = eVar;
        this.f15622e = bVar;
    }

    public void A(int i10) {
        this.f15619b = i10;
        this.f15620c = true;
    }

    public void B(int i10) {
        if (p()) {
            this.f15625h = i10;
        }
    }

    public void C(int i10) {
        if (p()) {
            this.f15624g = i10;
        }
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, -1, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            x();
            return true;
        } else if (!z10 && !v(dVar)) {
            return false;
        } else {
            this.f15623f = dVar;
            if (dVar.f15618a == null) {
                dVar.f15618a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f15623f.f15618a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i10 > 0) {
                this.f15624g = i10;
            } else {
                this.f15624g = 0;
            }
            this.f15625h = i11;
            return true;
        }
    }

    public void c(d dVar, HashMap<e, e> hashMap) {
        d dVar2;
        HashSet<d> hashSet;
        d dVar3 = this.f15623f;
        if (!(dVar3 == null || (hashSet = dVar3.f15618a) == null)) {
            hashSet.remove(this);
        }
        d dVar4 = dVar.f15623f;
        if (dVar4 != null) {
            dVar2 = hashMap.get(dVar.f15623f.f15621d).r(dVar4.l());
        } else {
            dVar2 = null;
        }
        this.f15623f = dVar2;
        d dVar5 = this.f15623f;
        if (dVar5 != null) {
            if (dVar5.f15618a == null) {
                dVar5.f15618a = new HashSet<>();
            }
            this.f15623f.f15618a.add(this);
        }
        this.f15624g = dVar.f15624g;
        this.f15625h = dVar.f15625h;
    }

    public void d(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f15618a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                a0.i.a(it.next().f15621d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f15618a;
    }

    public int f() {
        if (!this.f15620c) {
            return 0;
        }
        return this.f15619b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f15623f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g() {
        /*
            r3 = this;
            z.e r0 = r3.f15621d
            int r0 = r0.i0()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f15625h
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            z.d r0 = r3.f15623f
            if (r0 == 0) goto L_0x0020
            z.e r0 = r0.f15621d
            int r0 = r0.i0()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f15625h
            return r0
        L_0x0020:
            int r0 = r3.f15624g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.d.g():int");
    }

    public final d h() {
        switch (a.f15627a[this.f15622e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f15621d.L;
            case 3:
                return this.f15621d.J;
            case 4:
                return this.f15621d.M;
            case 5:
                return this.f15621d.K;
            default:
                throw new AssertionError(this.f15622e.name());
        }
    }

    public e i() {
        return this.f15621d;
    }

    public i j() {
        return this.f15626i;
    }

    public d k() {
        return this.f15623f;
    }

    public b l() {
        return this.f15622e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f15618a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<d> hashSet = this.f15618a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f15620c;
    }

    public boolean p() {
        return this.f15623f != null;
    }

    public boolean q(e eVar) {
        if (s(eVar, new HashSet())) {
            return false;
        }
        e U = i().U();
        return U == eVar || eVar.U() == U;
    }

    public boolean r(e eVar, d dVar) {
        return q(eVar);
    }

    public final boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> s10 = eVar.s();
        int size = s10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = s10.get(i10);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        switch (a.f15627a[this.f15622e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f15622e.name());
        }
    }

    public String toString() {
        return this.f15621d.y() + ":" + this.f15622e.toString();
    }

    public boolean u(d dVar) {
        b l10 = dVar.l();
        b bVar = this.f15622e;
        if (l10 == bVar) {
            return true;
        }
        switch (a.f15627a[bVar.ordinal()]) {
            case 1:
                return l10 != b.BASELINE;
            case 2:
            case 3:
            case 7:
                return l10 == b.LEFT || l10 == b.RIGHT || l10 == b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return l10 == b.TOP || l10 == b.BOTTOM || l10 == b.CENTER_Y || l10 == b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f15622e.name());
        }
    }

    public boolean v(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b l10 = dVar.l();
        b bVar = this.f15622e;
        if (l10 == bVar) {
            return bVar != b.BASELINE || (dVar.i().m0() && i().m0());
        }
        switch (a.f15627a[bVar.ordinal()]) {
            case 1:
                return (l10 == b.BASELINE || l10 == b.CENTER_X || l10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z11 = l10 == b.LEFT || l10 == b.RIGHT;
                if (!(dVar.i() instanceof h)) {
                    return z11;
                }
                if (z11 || l10 == b.CENTER_X) {
                    z10 = true;
                }
                return z10;
            case 4:
            case 5:
                boolean z12 = l10 == b.TOP || l10 == b.BOTTOM;
                if (!(dVar.i() instanceof h)) {
                    return z12;
                }
                if (z12 || l10 == b.CENTER_Y) {
                    z10 = true;
                }
                return z10;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f15622e.name());
        }
    }

    public boolean w() {
        switch (a.f15627a[this.f15622e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f15622e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f15623f;
        if (!(dVar == null || (hashSet = dVar.f15618a) == null)) {
            hashSet.remove(this);
            if (this.f15623f.f15618a.size() == 0) {
                this.f15623f.f15618a = null;
            }
        }
        this.f15618a = null;
        this.f15623f = null;
        this.f15624g = 0;
        this.f15625h = -1;
        this.f15620c = false;
        this.f15619b = 0;
    }

    public void y() {
        this.f15620c = false;
        this.f15619b = 0;
    }

    public void z(c cVar) {
        i iVar = this.f15626i;
        if (iVar == null) {
            this.f15626i = new i(i.b.UNRESTRICTED, (String) null);
        } else {
            iVar.g();
        }
    }
}
