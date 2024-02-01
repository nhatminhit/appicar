package f5;

import androidx.lifecycle.v;
import h5.g;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import w4.f;

public final class b {

    /* renamed from: n  reason: collision with root package name */
    public static final int f7368n = 33;

    /* renamed from: o  reason: collision with root package name */
    public static final int f7369o = 64;

    /* renamed from: p  reason: collision with root package name */
    public static final int f7370p = 65536;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7371q = 12000;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7372r = 100;

    /* renamed from: a  reason: collision with root package name */
    public final b f7373a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<C0125b> f7374b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7375c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7376d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7377e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f7378f;

    /* renamed from: g  reason: collision with root package name */
    public a[] f7379g;

    /* renamed from: h  reason: collision with root package name */
    public int f7380h;

    /* renamed from: i  reason: collision with root package name */
    public int f7381i;

    /* renamed from: j  reason: collision with root package name */
    public int f7382j;

    /* renamed from: k  reason: collision with root package name */
    public int f7383k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7384l;

    /* renamed from: m  reason: collision with root package name */
    public BitSet f7385m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f7386a;

        /* renamed from: b  reason: collision with root package name */
        public final a f7387b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7388c;

        public a(String str, a aVar) {
            this.f7386a = str;
            this.f7387b = aVar;
            this.f7388c = aVar != null ? 1 + aVar.f7388c : 1;
        }

        public String a(char[] cArr, int i10, int i11) {
            if (this.f7386a.length() != i11) {
                return null;
            }
            int i12 = 0;
            while (this.f7386a.charAt(i12) == cArr[i10 + i12]) {
                i12++;
                if (i12 >= i11) {
                    return this.f7386a;
                }
            }
            return null;
        }
    }

    /* renamed from: f5.b$b  reason: collision with other inner class name */
    public static final class C0125b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7389a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7390b;

        /* renamed from: c  reason: collision with root package name */
        public final String[] f7391c;

        /* renamed from: d  reason: collision with root package name */
        public final a[] f7392d;

        public C0125b(int i10, int i11, String[] strArr, a[] aVarArr) {
            this.f7389a = i10;
            this.f7390b = i11;
            this.f7391c = strArr;
            this.f7392d = aVarArr;
        }

        public C0125b(b bVar) {
            this.f7389a = bVar.f7380h;
            this.f7390b = bVar.f7383k;
            this.f7391c = bVar.f7378f;
            this.f7392d = bVar.f7379g;
        }

        public static C0125b a(int i10) {
            return new C0125b(0, 0, new String[i10], new a[(i10 >> 1)]);
        }
    }

    public b(int i10) {
        this.f7373a = null;
        this.f7375c = i10;
        this.f7377e = true;
        this.f7376d = -1;
        this.f7384l = false;
        this.f7383k = 0;
        this.f7374b = new AtomicReference<>(C0125b.a(64));
    }

    public b(b bVar, int i10, int i11, C0125b bVar2) {
        this.f7373a = bVar;
        this.f7375c = i11;
        this.f7374b = null;
        this.f7376d = i10;
        this.f7377e = f.a.CANONICALIZE_FIELD_NAMES.d(i10);
        String[] strArr = bVar2.f7391c;
        this.f7378f = strArr;
        this.f7379g = bVar2.f7392d;
        this.f7380h = bVar2.f7389a;
        this.f7383k = bVar2.f7390b;
        int length = strArr.length;
        this.f7381i = e(length);
        this.f7382j = length - 1;
        this.f7384l = true;
    }

    public static int e(int i10) {
        return i10 - (i10 >> 2);
    }

    public static b o() {
        long currentTimeMillis = System.currentTimeMillis();
        return p((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    public static b p(int i10) {
        return new b(i10);
    }

    public void A() {
        int i10 = 0;
        for (String str : this.f7378f) {
            if (str != null) {
                i10++;
            }
        }
        int i11 = r0 >> 1;
        for (int i12 = 0; i12 < i11; i12++) {
            for (a aVar = this.f7379g[i12]; aVar != null; aVar = aVar.f7387b) {
                i10++;
            }
        }
        if (i10 != this.f7380h) {
            throw new IllegalStateException(String.format("Internal error: expected internal size %d vs calculated count %d", new Object[]{Integer.valueOf(this.f7380h), Integer.valueOf(i10)}));
        }
    }

    public final String a(char[] cArr, int i10, int i11, int i12, int i13) {
        if (this.f7384l) {
            n();
            this.f7384l = false;
        } else if (this.f7380h >= this.f7381i) {
            w();
            i13 = d(l(cArr, i10, i11));
        }
        String str = new String(cArr, i10, i11);
        if (f.a.INTERN_FIELD_NAMES.d(this.f7376d)) {
            str = g.R.b(str);
        }
        this.f7380h++;
        String[] strArr = this.f7378f;
        if (strArr[i13] == null) {
            strArr[i13] = str;
        } else {
            int i14 = i13 >> 1;
            a aVar = new a(str, this.f7379g[i14]);
            int i15 = aVar.f7388c;
            if (i15 > 100) {
                c(i14, aVar, i13);
            } else {
                this.f7379g[i14] = aVar;
                this.f7383k = Math.max(i15, this.f7383k);
            }
        }
        return str;
    }

    public final String b(char[] cArr, int i10, int i11, a aVar) {
        while (aVar != null) {
            String a10 = aVar.a(cArr, i10, i11);
            if (a10 != null) {
                return a10;
            }
            aVar = aVar.f7387b;
        }
        return null;
    }

    public final void c(int i10, a aVar, int i11) {
        BitSet bitSet;
        BitSet bitSet2 = this.f7385m;
        if (bitSet2 == null) {
            bitSet = new BitSet();
            this.f7385m = bitSet;
        } else if (bitSet2.get(i10)) {
            if (f.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.d(this.f7376d)) {
                y(100);
            }
            this.f7377e = false;
            this.f7378f[i11] = aVar.f7386a;
            this.f7379g[i10] = null;
            this.f7380h -= aVar.f7388c;
            this.f7383k = -1;
        } else {
            bitSet = this.f7385m;
        }
        bitSet.set(i10);
        this.f7378f[i11] = aVar.f7386a;
        this.f7379g[i10] = null;
        this.f7380h -= aVar.f7388c;
        this.f7383k = -1;
    }

    public int d(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return (i12 + (i12 >>> 3)) & this.f7382j;
    }

    public int j() {
        return this.f7378f.length;
    }

    public int k(String str) {
        int length = str.length();
        int i10 = this.f7375c;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 * 33) + str.charAt(i11);
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int l(char[] cArr, int i10, int i11) {
        int i12 = this.f7375c;
        int i13 = i11 + i10;
        while (i10 < i13) {
            i12 = (i12 * 33) + cArr[i10];
            i10++;
        }
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public int m() {
        int i10 = 0;
        for (a aVar : this.f7379g) {
            if (aVar != null) {
                i10 += aVar.f7388c;
            }
        }
        return i10;
    }

    public final void n() {
        String[] strArr = this.f7378f;
        this.f7378f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.f7379g;
        this.f7379g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public String q(char[] cArr, int i10, int i11, int i12) {
        if (i11 < 1) {
            return "";
        }
        if (!this.f7377e) {
            return new String(cArr, i10, i11);
        }
        int d10 = d(i12);
        String str = this.f7378f[d10];
        if (str != null) {
            if (str.length() == i11) {
                int i13 = 0;
                while (str.charAt(i13) == cArr[i10 + i13]) {
                    i13++;
                    if (i13 == i11) {
                        return str;
                    }
                }
            }
            a aVar = this.f7379g[d10 >> 1];
            if (aVar != null) {
                String a10 = aVar.a(cArr, i10, i11);
                if (a10 != null) {
                    return a10;
                }
                String b10 = b(cArr, i10, i11, aVar.f7387b);
                if (b10 != null) {
                    return b10;
                }
            }
        }
        return a(cArr, i10, i11, i12, d10);
    }

    public int r() {
        return this.f7375c;
    }

    public b s(int i10) {
        return new b(this, i10, this.f7375c, this.f7374b.get());
    }

    public int t() {
        return this.f7383k;
    }

    public boolean u() {
        return !this.f7384l;
    }

    public final void v(C0125b bVar) {
        int i10 = bVar.f7389a;
        C0125b bVar2 = this.f7374b.get();
        if (i10 != bVar2.f7389a) {
            if (i10 > 12000) {
                bVar = C0125b.a(64);
            }
            v.a(this.f7374b, bVar2, bVar);
        }
    }

    public final void w() {
        int i10 = r1 + r1;
        if (i10 > 65536) {
            this.f7380h = 0;
            this.f7377e = false;
            this.f7378f = new String[64];
            this.f7379g = new a[32];
            this.f7382j = 63;
            this.f7384l = false;
            return;
        }
        a[] aVarArr = this.f7379g;
        this.f7378f = new String[i10];
        this.f7379g = new a[(i10 >> 1)];
        this.f7382j = i10 - 1;
        this.f7381i = e(i10);
        int i11 = 0;
        int i12 = 0;
        for (String str : this.f7378f) {
            if (str != null) {
                i11++;
                int d10 = d(k(str));
                String[] strArr = this.f7378f;
                if (strArr[d10] == null) {
                    strArr[d10] = str;
                } else {
                    int i13 = d10 >> 1;
                    a aVar = new a(str, this.f7379g[i13]);
                    this.f7379g[i13] = aVar;
                    i12 = Math.max(i12, aVar.f7388c);
                }
            }
        }
        int i14 = r1 >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            for (a aVar2 = aVarArr[i15]; aVar2 != null; aVar2 = aVar2.f7387b) {
                i11++;
                String str2 = aVar2.f7386a;
                int d11 = d(k(str2));
                String[] strArr2 = this.f7378f;
                if (strArr2[d11] == null) {
                    strArr2[d11] = str2;
                } else {
                    int i16 = d11 >> 1;
                    a aVar3 = new a(str2, this.f7379g[i16]);
                    this.f7379g[i16] = aVar3;
                    i12 = Math.max(i12, aVar3.f7388c);
                }
            }
        }
        this.f7383k = i12;
        this.f7385m = null;
        if (i11 != this.f7380h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this.f7380h), Integer.valueOf(i11)}));
        }
    }

    public void x() {
        b bVar;
        if (u() && (bVar = this.f7373a) != null && this.f7377e) {
            bVar.v(new C0125b(this));
            this.f7384l = true;
        }
    }

    public void y(int i10) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f7380h + ") now exceeds maximum, " + i10 + " -- suspect a DoS attack based on hash collisions");
    }

    public int z() {
        AtomicReference<C0125b> atomicReference = this.f7374b;
        return atomicReference != null ? atomicReference.get().f7389a : this.f7380h;
    }
}
