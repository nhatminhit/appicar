package f5;

import androidx.lifecycle.v;
import h5.g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import w4.f;

public final class a {

    /* renamed from: p  reason: collision with root package name */
    public static final int f7339p = 64;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7340q = 65536;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7341r = 16;

    /* renamed from: s  reason: collision with root package name */
    public static final int f7342s = 6000;

    /* renamed from: t  reason: collision with root package name */
    public static final int f7343t = 33;

    /* renamed from: u  reason: collision with root package name */
    public static final int f7344u = 65599;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7345v = 31;

    /* renamed from: a  reason: collision with root package name */
    public final a f7346a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<C0124a> f7347b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7348c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7349d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7350e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f7351f;

    /* renamed from: g  reason: collision with root package name */
    public int f7352g;

    /* renamed from: h  reason: collision with root package name */
    public int f7353h;

    /* renamed from: i  reason: collision with root package name */
    public int f7354i;

    /* renamed from: j  reason: collision with root package name */
    public int f7355j;

    /* renamed from: k  reason: collision with root package name */
    public int f7356k;

    /* renamed from: l  reason: collision with root package name */
    public String[] f7357l;

    /* renamed from: m  reason: collision with root package name */
    public int f7358m;

    /* renamed from: n  reason: collision with root package name */
    public int f7359n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7360o;

    /* renamed from: f5.a$a  reason: collision with other inner class name */
    public static final class C0124a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7361a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7362b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7363c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f7364d;

        /* renamed from: e  reason: collision with root package name */
        public final String[] f7365e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7366f;

        /* renamed from: g  reason: collision with root package name */
        public final int f7367g;

        public C0124a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.f7361a = i10;
            this.f7362b = i11;
            this.f7363c = i12;
            this.f7364d = iArr;
            this.f7365e = strArr;
            this.f7366f = i13;
            this.f7367g = i14;
        }

        public C0124a(a aVar) {
            this.f7361a = aVar.f7352g;
            this.f7362b = aVar.f7356k;
            this.f7363c = aVar.f7355j;
            this.f7364d = aVar.f7351f;
            this.f7365e = aVar.f7357l;
            this.f7366f = aVar.f7358m;
            this.f7367g = aVar.f7359n;
        }

        public static C0124a a(int i10) {
            int i11 = i10 << 3;
            return new C0124a(i10, 0, a.c(i10), new int[i11], new String[(i10 << 1)], i11 - i10, i11);
        }
    }

    public a(int i10, boolean z10, int i11, boolean z11) {
        this.f7346a = null;
        this.f7348c = i11;
        this.f7349d = z10;
        this.f7350e = z11;
        int i12 = 16;
        if (i10 >= 16) {
            if (((i10 - 1) & i10) != 0) {
                while (i12 < i10) {
                    i12 += i12;
                }
            }
            this.f7347b = new AtomicReference<>(C0124a.a(i10));
        }
        i10 = i12;
        this.f7347b = new AtomicReference<>(C0124a.a(i10));
    }

    public a(a aVar, boolean z10, int i10, boolean z11, C0124a aVar2) {
        this.f7346a = aVar;
        this.f7348c = i10;
        this.f7349d = z10;
        this.f7350e = z11;
        this.f7347b = null;
        this.f7356k = aVar2.f7362b;
        int i11 = aVar2.f7361a;
        this.f7352g = i11;
        int i12 = i11 << 2;
        this.f7353h = i12;
        this.f7354i = i12 + (i12 >> 1);
        this.f7355j = aVar2.f7363c;
        this.f7351f = aVar2.f7364d;
        this.f7357l = aVar2.f7365e;
        this.f7358m = aVar2.f7366f;
        this.f7359n = aVar2.f7367g;
        this.f7360o = true;
    }

    public static a F() {
        long currentTimeMillis = System.currentTimeMillis();
        return G((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    public static a G(int i10) {
        return new a(64, true, i10, true);
    }

    public static int c(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    public int A() {
        return this.f7352g;
    }

    public int B(int i10) {
        int i11 = i10 ^ this.f7348c;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public int C(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = ((i12 ^ (i12 >>> 9)) + (i11 * 33)) ^ this.f7348c;
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public int D(int i10, int i11, int i12) {
        int i13 = i10 ^ this.f7348c;
        int i14 = (((i13 + (i13 >>> 9)) * 31) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    public int E(int[] iArr, int i10) {
        if (i10 >= 4) {
            int i11 = iArr[0] ^ this.f7348c;
            int i12 = i11 + (i11 >>> 9) + iArr[1];
            int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
            int i14 = i13 + (i13 >>> 4);
            for (int i15 = 3; i15 < i10; i15++) {
                int i16 = iArr[i15];
                i14 += i16 ^ (i16 >> 21);
            }
            int i17 = i14 * 65599;
            int i18 = i17 + (i17 >>> 19);
            return (i18 << 5) ^ i18;
        }
        throw new IllegalArgumentException();
    }

    public String H(int i10) {
        int b10 = b(B(i10));
        int[] iArr = this.f7351f;
        int i11 = iArr[b10 + 3];
        if (i11 == 1) {
            if (iArr[b10] == i10) {
                return this.f7357l[b10 >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this.f7353h + ((b10 >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this.f7357l[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        return f(b10, i10);
    }

    public String I(int i10, int i11) {
        int b10 = b(C(i10, i11));
        int[] iArr = this.f7351f;
        int i12 = iArr[b10 + 3];
        if (i12 == 2) {
            if (i10 == iArr[b10] && i11 == iArr[b10 + 1]) {
                return this.f7357l[b10 >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f7353h + ((b10 >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this.f7357l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return g(b10, i10, i11);
    }

    public String J(int i10, int i11, int i12) {
        int b10 = b(D(i10, i11, i12));
        int[] iArr = this.f7351f;
        int i13 = iArr[b10 + 3];
        if (i13 == 3) {
            if (i10 == iArr[b10] && iArr[b10 + 1] == i11 && iArr[b10 + 2] == i12) {
                return this.f7357l[b10 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f7353h + ((b10 >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this.f7357l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        return h(b10, i10, i11, i12);
    }

    public String K(int[] iArr, int i10) {
        if (i10 < 4) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : J(iArr[0], iArr[1], iArr[2]) : I(iArr[0], iArr[1]) : H(iArr[0]);
        }
        int E = E(iArr, i10);
        int b10 = b(E);
        int[] iArr2 = this.f7351f;
        int i11 = iArr2[b10 + 3];
        if (E == iArr2[b10] && i11 == i10 && m(iArr, i10, iArr2[b10 + 1])) {
            return this.f7357l[b10 >> 2];
        }
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f7353h + ((b10 >> 3) << 2);
        return (E == iArr2[i12] && iArr2[i12 + 3] == i10 && m(iArr, i10, iArr2[i12 + 1])) ? this.f7357l[i12 >> 2] : i(b10, E, iArr, i10);
    }

    public int L() {
        return this.f7348c;
    }

    public a M(int i10) {
        return new a(this, f.a.INTERN_FIELD_NAMES.d(i10), this.f7348c, f.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.d(i10), this.f7347b.get());
    }

    public boolean N() {
        return !this.f7360o;
    }

    public final void O(C0124a aVar) {
        int i10 = aVar.f7362b;
        C0124a aVar2 = this.f7347b.get();
        if (i10 != aVar2.f7362b) {
            if (i10 > 6000) {
                aVar = C0124a.a(64);
            }
            v.a(this.f7347b, aVar2, aVar);
        }
    }

    public final void P(boolean z10) {
        this.f7356k = 0;
        this.f7358m = l();
        this.f7359n = this.f7352g << 3;
        if (z10) {
            Arrays.fill(this.f7351f, 0);
            Arrays.fill(this.f7357l, (Object) null);
        }
    }

    public int Q() {
        int i10 = this.f7353h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f7351f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public final void R() {
        this.f7360o = false;
        int[] iArr = this.f7351f;
        String[] strArr = this.f7357l;
        int i10 = this.f7352g;
        int i11 = this.f7356k;
        int i12 = i10 + i10;
        int i13 = this.f7358m;
        if (i12 > 65536) {
            P(true);
            return;
        }
        this.f7351f = new int[(iArr.length + (i10 << 3))];
        this.f7352g = i12;
        int i14 = i12 << 2;
        this.f7353h = i14;
        this.f7354i = i14 + (i14 >> 1);
        this.f7355j = c(i12);
        this.f7357l = new String[(strArr.length << 1)];
        P(false);
        int[] iArr2 = new int[16];
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += 4) {
            int i17 = iArr[i16 + 3];
            if (i17 != 0) {
                i15++;
                String str = strArr[i16 >> 2];
                if (i17 == 1) {
                    iArr2[0] = iArr[i16];
                    z(str, iArr2, 1);
                } else if (i17 == 2) {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    z(str, iArr2, 2);
                } else if (i17 != 3) {
                    if (i17 > iArr2.length) {
                        iArr2 = new int[i17];
                    }
                    System.arraycopy(iArr, iArr[i16 + 1], iArr2, 0, i17);
                    z(str, iArr2, i17);
                } else {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    iArr2[2] = iArr[i16 + 2];
                    z(str, iArr2, 3);
                }
            }
        }
        if (i15 != i11) {
            throw new IllegalStateException("Failed rehash(): old count=" + i11 + ", copyCount=" + i15);
        }
    }

    public void S() {
        if (this.f7346a != null && N()) {
            this.f7346a.O(new C0124a(this));
            this.f7360o = true;
        }
    }

    public int T() {
        int i10 = this.f7354i;
        int i11 = 0;
        for (int i12 = this.f7353h + 3; i12 < i10; i12 += 4) {
            if (this.f7351f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int U() {
        AtomicReference<C0124a> atomicReference = this.f7347b;
        return atomicReference != null ? atomicReference.get().f7362b : this.f7356k;
    }

    public int V() {
        return (this.f7358m - l()) >> 2;
    }

    public int W() {
        int i10 = this.f7354i + 3;
        int i11 = this.f7352g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f7351f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public int X() {
        int i10 = this.f7352g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f7351f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public final int a(int[] iArr, int i10) {
        int i11 = this.f7359n;
        int i12 = i11 + i10;
        int[] iArr2 = this.f7351f;
        if (i12 > iArr2.length) {
            this.f7351f = Arrays.copyOf(this.f7351f, this.f7351f.length + Math.max(i12 - iArr2.length, Math.min(4096, this.f7352g)));
        }
        System.arraycopy(iArr, 0, this.f7351f, i11, i10);
        this.f7359n += i10;
        return i11;
    }

    public final int b(int i10) {
        return (i10 & (this.f7352g - 1)) << 2;
    }

    public final boolean d() {
        if (this.f7356k <= (this.f7352g >> 1)) {
            return false;
        }
        int l10 = (this.f7358m - l()) >> 2;
        int i10 = this.f7356k;
        return l10 > ((i10 + 1) >> 7) || ((double) i10) > ((double) this.f7352g) * 0.8d;
    }

    public final int e(int i10) {
        int b10 = b(i10);
        int[] iArr = this.f7351f;
        if (iArr[b10 + 3] == 0) {
            return b10;
        }
        if (d()) {
            return k(i10);
        }
        int i11 = this.f7353h + ((b10 >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f7354i;
        int i13 = this.f7355j;
        int i14 = i12 + ((b10 >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.f7358m;
        int i17 = i16 + 4;
        this.f7358m = i17;
        if (i17 < (this.f7352g << 3)) {
            return i16;
        }
        if (this.f7350e) {
            j();
        }
        return k(i10);
    }

    public final String f(int i10, int i11) {
        int i12 = this.f7354i;
        int i13 = this.f7355j;
        int i14 = i12 + ((i10 >> (i13 + 2)) << i13);
        int[] iArr = this.f7351f;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr[i14 + 3];
            if (i11 == iArr[i14] && 1 == i16) {
                return this.f7357l[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int l10 = l(); l10 < this.f7358m; l10 += 4) {
            if (i11 == iArr[l10] && 1 == iArr[l10 + 3]) {
                return this.f7357l[l10 >> 2];
            }
        }
        return null;
    }

    public final String g(int i10, int i11, int i12) {
        int i13 = this.f7354i;
        int i14 = this.f7355j;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr = this.f7351f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i11 == iArr[i15] && i12 == iArr[i15 + 1] && 2 == i17) {
                return this.f7357l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int l10 = l(); l10 < this.f7358m; l10 += 4) {
            if (i11 == iArr[l10] && i12 == iArr[l10 + 1] && 2 == iArr[l10 + 3]) {
                return this.f7357l[l10 >> 2];
            }
        }
        return null;
    }

    public final String h(int i10, int i11, int i12, int i13) {
        int i14 = this.f7354i;
        int i15 = this.f7355j;
        int i16 = i14 + ((i10 >> (i15 + 2)) << i15);
        int[] iArr = this.f7351f;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i11 == iArr[i16] && i12 == iArr[i16 + 1] && i13 == iArr[i16 + 2] && 3 == i18) {
                return this.f7357l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int l10 = l(); l10 < this.f7358m; l10 += 4) {
            if (i11 == iArr[l10] && i12 == iArr[l10 + 1] && i13 == iArr[l10 + 2] && 3 == iArr[l10 + 3]) {
                return this.f7357l[l10 >> 2];
            }
        }
        return null;
    }

    public final String i(int i10, int i11, int[] iArr, int i12) {
        int i13 = this.f7354i;
        int i14 = this.f7355j;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr2 = this.f7351f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr2[i15 + 3];
            if (i11 == iArr2[i15] && i12 == i17 && m(iArr, i12, iArr2[i15 + 1])) {
                return this.f7357l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int l10 = l(); l10 < this.f7358m; l10 += 4) {
            if (i11 == iArr2[l10] && i12 == iArr2[l10 + 3] && m(iArr, i12, iArr2[l10 + 1])) {
                return this.f7357l[l10 >> 2];
            }
        }
        return null;
    }

    public void j() {
        if (this.f7352g > 1024) {
            throw new IllegalStateException("Spill-over slots in symbol table with " + this.f7356k + " entries, hash area of " + this.f7352g + " slots is now full (all " + (this.f7352g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
        }
    }

    public final int k(int i10) {
        R();
        int b10 = b(i10);
        int[] iArr = this.f7351f;
        if (iArr[b10 + 3] == 0) {
            return b10;
        }
        int i11 = this.f7353h + ((b10 >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f7354i;
        int i13 = this.f7355j;
        int i14 = i12 + ((b10 >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.f7358m;
        this.f7358m = i16 + 4;
        return i16;
    }

    public final int l() {
        int i10 = this.f7352g;
        return (i10 << 3) - i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r6[r7] == r0[r8]) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r7 = r3 + 1;
        r4 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r6[r3] == r0[r8]) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r3 = r7 + 1;
        r4 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r6[r7] == r0[r8]) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = r3 + 1;
        r4 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r6[r3] == r0[r8]) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r8 = r7 + 1;
        r3 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r6[r7] == r0[r4]) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r7 = r8 + 1;
        r4 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6[r8] == r0[r3]) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r6[r7] == r0[r4]) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r3 = r7 + 1;
        r4 = r8 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int[] r6, int r7, int r8) {
        /*
            r5 = this;
            int[] r0 = r5.f7351f
            r1 = 0
            r2 = 1
            switch(r7) {
                case 4: goto L_0x0042;
                case 5: goto L_0x0034;
                case 6: goto L_0x0026;
                case 7: goto L_0x0018;
                case 8: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r6 = r5.n(r6, r7, r8)
            return r6
        L_0x000c:
            r7 = r6[r1]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L_0x0015
            return r1
        L_0x0015:
            r7 = r2
            r8 = r3
            goto L_0x0019
        L_0x0018:
            r7 = r1
        L_0x0019:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L_0x0024
            return r1
        L_0x0024:
            r8 = r4
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L_0x0032
            return r1
        L_0x0032:
            r8 = r4
            goto L_0x0035
        L_0x0034:
            r7 = r1
        L_0x0035:
            int r3 = r7 + 1
            r7 = r6[r7]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L_0x0040
            return r1
        L_0x0040:
            r8 = r4
            goto L_0x0043
        L_0x0042:
            r3 = r1
        L_0x0043:
            int r7 = r3 + 1
            r3 = r6[r3]
            int r4 = r8 + 1
            r8 = r0[r8]
            if (r3 == r8) goto L_0x004e
            return r1
        L_0x004e:
            int r8 = r7 + 1
            r7 = r6[r7]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r7 == r4) goto L_0x0059
            return r1
        L_0x0059:
            int r7 = r8 + 1
            r8 = r6[r8]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r8 == r3) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r6[r7]
            r7 = r0[r4]
            if (r6 == r7) goto L_0x006b
            return r1
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.m(int[], int, int):boolean");
    }

    public final boolean n(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            if (iArr[i12] != this.f7351f[i11]) {
                return false;
            }
            if (i13 >= i10) {
                return true;
            }
            i12 = i13;
            i11 = i14;
        }
    }

    public final void o() {
        if (this.f7360o) {
            int[] iArr = this.f7351f;
            this.f7351f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f7357l;
            this.f7357l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f7360o = false;
        }
    }

    public String toString() {
        int Q = Q();
        int T = T();
        int W = W();
        int V = V();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{a.class.getName(), Integer.valueOf(this.f7356k), Integer.valueOf(this.f7352g), Integer.valueOf(Q), Integer.valueOf(T), Integer.valueOf(W), Integer.valueOf(V), Integer.valueOf(Q + T + W + V), Integer.valueOf(X())});
    }

    public String w(String str, int i10) {
        o();
        if (this.f7349d) {
            str = g.R.b(str);
        }
        int e10 = e(B(i10));
        int[] iArr = this.f7351f;
        iArr[e10] = i10;
        iArr[e10 + 3] = 1;
        this.f7357l[e10 >> 2] = str;
        this.f7356k++;
        return str;
    }

    public String x(String str, int i10, int i11) {
        o();
        if (this.f7349d) {
            str = g.R.b(str);
        }
        int e10 = e(i11 == 0 ? B(i10) : C(i10, i11));
        int[] iArr = this.f7351f;
        iArr[e10] = i10;
        iArr[e10 + 1] = i11;
        iArr[e10 + 3] = 2;
        this.f7357l[e10 >> 2] = str;
        this.f7356k++;
        return str;
    }

    public String y(String str, int i10, int i11, int i12) {
        o();
        if (this.f7349d) {
            str = g.R.b(str);
        }
        int e10 = e(D(i10, i11, i12));
        int[] iArr = this.f7351f;
        iArr[e10] = i10;
        iArr[e10 + 1] = i11;
        iArr[e10 + 2] = i12;
        iArr[e10 + 3] = 3;
        this.f7357l[e10 >> 2] = str;
        this.f7356k++;
        return str;
    }

    public String z(String str, int[] iArr, int i10) {
        int i11;
        o();
        if (this.f7349d) {
            str = g.R.b(str);
        }
        if (i10 == 1) {
            i11 = e(B(iArr[0]));
            int[] iArr2 = this.f7351f;
            iArr2[i11] = iArr[0];
            iArr2[i11 + 3] = 1;
        } else if (i10 == 2) {
            i11 = e(C(iArr[0], iArr[1]));
            int[] iArr3 = this.f7351f;
            iArr3[i11] = iArr[0];
            iArr3[i11 + 1] = iArr[1];
            iArr3[i11 + 3] = 2;
        } else if (i10 != 3) {
            int E = E(iArr, i10);
            i11 = e(E);
            this.f7351f[i11] = E;
            int a10 = a(iArr, i10);
            int[] iArr4 = this.f7351f;
            iArr4[i11 + 1] = a10;
            iArr4[i11 + 3] = i10;
        } else {
            int e10 = e(D(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f7351f;
            iArr5[e10] = iArr[0];
            iArr5[e10 + 1] = iArr[1];
            iArr5[e10 + 2] = iArr[2];
            iArr5[e10 + 3] = 3;
            i11 = e10;
        }
        this.f7357l[i11 >> 2] = str;
        this.f7356k++;
        return str;
    }
}
