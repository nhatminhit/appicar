package c7;

import android.net.Uri;
import b6.c;
import d.j;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f4889f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4890g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4891h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4892i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f4893j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final a f4894k = new a(new long[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f4895a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f4896b;

    /* renamed from: c  reason: collision with root package name */
    public final C0078a[] f4897c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4898d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4899e;

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    public static final class C0078a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4900a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri[] f4901b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f4902c;

        /* renamed from: d  reason: collision with root package name */
        public final long[] f4903d;

        public C0078a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public C0078a(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
            w7.a.a(iArr.length == uriArr.length);
            this.f4900a = i10;
            this.f4902c = iArr;
            this.f4901b = uriArr;
            this.f4903d = jArr;
        }

        @j
        public static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, c.f4201b);
            return copyOf;
        }

        @j
        public static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f4902c;
                if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    return i12;
                }
                i12++;
            }
            return i12;
        }

        public boolean e() {
            return this.f4900a == -1 || c() < this.f4900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0078a.class != obj.getClass()) {
                return false;
            }
            C0078a aVar = (C0078a) obj;
            return this.f4900a == aVar.f4900a && Arrays.equals(this.f4901b, aVar.f4901b) && Arrays.equals(this.f4902c, aVar.f4902c) && Arrays.equals(this.f4903d, aVar.f4903d);
        }

        @j
        public C0078a f(int i10) {
            w7.a.a(this.f4900a == -1 && this.f4902c.length <= i10);
            return new C0078a(i10, b(this.f4902c, i10), (Uri[]) Arrays.copyOf(this.f4901b, i10), a(this.f4903d, i10));
        }

        @j
        public C0078a g(long[] jArr) {
            w7.a.a(this.f4900a == -1 || jArr.length <= this.f4901b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f4901b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0078a(this.f4900a, this.f4902c, this.f4901b, jArr);
        }

        @j
        public C0078a h(int i10, int i11) {
            int i12 = this.f4900a;
            boolean z10 = false;
            w7.a.a(i12 == -1 || i11 < i12);
            int[] b10 = b(this.f4902c, i11 + 1);
            int i13 = b10[i11];
            if (i13 == 0 || i13 == 1 || i13 == i10) {
                z10 = true;
            }
            w7.a.a(z10);
            long[] jArr = this.f4903d;
            if (jArr.length != b10.length) {
                jArr = a(jArr, b10.length);
            }
            Uri[] uriArr = this.f4901b;
            if (uriArr.length != b10.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, b10.length);
            }
            b10[i11] = i10;
            return new C0078a(this.f4900a, b10, uriArr, jArr);
        }

        public int hashCode() {
            return (((((this.f4900a * 31) + Arrays.hashCode(this.f4901b)) * 31) + Arrays.hashCode(this.f4902c)) * 31) + Arrays.hashCode(this.f4903d);
        }

        @j
        public C0078a i(Uri uri, int i10) {
            int i11 = this.f4900a;
            boolean z10 = false;
            w7.a.a(i11 == -1 || i10 < i11);
            int[] b10 = b(this.f4902c, i10 + 1);
            if (b10[i10] == 0) {
                z10 = true;
            }
            w7.a.a(z10);
            long[] jArr = this.f4903d;
            if (jArr.length != b10.length) {
                jArr = a(jArr, b10.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f4901b, b10.length);
            uriArr[i10] = uri;
            b10[i10] = 1;
            return new C0078a(this.f4900a, b10, uriArr, jArr);
        }

        @j
        public C0078a j() {
            if (this.f4900a == -1) {
                return new C0078a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f4902c;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = copyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    copyOf[i10] = 2;
                }
            }
            return new C0078a(length, copyOf, this.f4901b, this.f4903d);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.f4895a = length;
        this.f4896b = Arrays.copyOf(jArr, length);
        this.f4897c = new C0078a[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f4897c[i10] = new C0078a();
        }
        this.f4898d = 0;
        this.f4899e = c.f4201b;
    }

    public a(long[] jArr, C0078a[] aVarArr, long j10, long j11) {
        this.f4895a = aVarArr.length;
        this.f4896b = jArr;
        this.f4897c = aVarArr;
        this.f4898d = j10;
        this.f4899e = j11;
    }

    public int a(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != c.f4201b && j10 >= j11) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4896b;
            if (i10 >= jArr.length) {
                break;
            }
            long j12 = jArr[i10];
            if (j12 == Long.MIN_VALUE || (j10 < j12 && this.f4897c[i10].e())) {
                break;
            }
            i10++;
        }
        if (i10 < this.f4896b.length) {
            return i10;
        }
        return -1;
    }

    public int b(long j10) {
        int length = this.f4896b.length - 1;
        while (length >= 0 && c(j10, length)) {
            length--;
        }
        if (length < 0 || !this.f4897c[length].e()) {
            return -1;
        }
        return length;
    }

    public final boolean c(long j10, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j11 = this.f4896b[i10];
        if (j11 != Long.MIN_VALUE) {
            return j10 < j11;
        }
        long j12 = this.f4899e;
        return j12 == c.f4201b || j10 < j12;
    }

    @j
    public a d(int i10, int i11) {
        w7.a.a(i11 > 0);
        C0078a[] aVarArr = this.f4897c;
        if (aVarArr[i10].f4900a == i11) {
            return this;
        }
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i10] = this.f4897c[i10].f(i11);
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }

    @j
    public a e(long[][] jArr) {
        C0078a[] aVarArr = this.f4897c;
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        for (int i10 = 0; i10 < this.f4895a; i10++) {
            aVarArr2[i10] = aVarArr2[i10].g(jArr[i10]);
        }
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4895a == aVar.f4895a && this.f4898d == aVar.f4898d && this.f4899e == aVar.f4899e && Arrays.equals(this.f4896b, aVar.f4896b) && Arrays.equals(this.f4897c, aVar.f4897c);
    }

    @j
    public a f(int i10, int i11) {
        C0078a[] aVarArr = this.f4897c;
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i10] = aVarArr2[i10].h(4, i11);
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }

    @j
    public a g(long j10) {
        if (this.f4898d == j10) {
            return this;
        }
        return new a(this.f4896b, this.f4897c, j10, this.f4899e);
    }

    @j
    public a h(int i10, int i11, Uri uri) {
        C0078a[] aVarArr = this.f4897c;
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i10] = aVarArr2[i10].i(uri, i11);
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }

    public int hashCode() {
        return (((((((this.f4895a * 31) + ((int) this.f4898d)) * 31) + ((int) this.f4899e)) * 31) + Arrays.hashCode(this.f4896b)) * 31) + Arrays.hashCode(this.f4897c);
    }

    @j
    public a i(long j10) {
        return this.f4899e == j10 ? this : new a(this.f4896b, this.f4897c, this.f4898d, j10);
    }

    @j
    public a j(int i10, int i11) {
        C0078a[] aVarArr = this.f4897c;
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i10] = aVarArr2[i10].h(3, i11);
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }

    @j
    public a k(int i10, int i11) {
        C0078a[] aVarArr = this.f4897c;
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i10] = aVarArr2[i10].h(2, i11);
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }

    @j
    public a l(int i10) {
        C0078a[] aVarArr = this.f4897c;
        C0078a[] aVarArr2 = (C0078a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i10] = aVarArr2[i10].j();
        return new a(this.f4896b, aVarArr2, this.f4898d, this.f4899e);
    }
}
