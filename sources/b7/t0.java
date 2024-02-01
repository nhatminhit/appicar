package b7;

import java.util.Arrays;
import java.util.Random;

public interface t0 {

    public static class a implements t0 {

        /* renamed from: a  reason: collision with root package name */
        public final Random f4700a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f4701b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f4702c;

        public a(int i10) {
            this(i10, new Random());
        }

        public a(int i10, long j10) {
            this(i10, new Random(j10));
        }

        public a(int i10, Random random) {
            this(h(i10, random), random);
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        public a(int[] iArr, Random random) {
            this.f4701b = iArr;
            this.f4700a = random;
            this.f4702c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f4702c[iArr[i10]] = i10;
            }
        }

        public static int[] h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        public t0 a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[(this.f4701b.length - i12)];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f4701b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f4700a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        public int b() {
            int[] iArr = this.f4701b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public int c(int i10) {
            int i11 = this.f4702c[i10] - 1;
            if (i11 >= 0) {
                return this.f4701b[i11];
            }
            return -1;
        }

        public int d(int i10) {
            int i11 = this.f4702c[i10] + 1;
            int[] iArr = this.f4701b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        public t0 e(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f4700a.nextInt(this.f4701b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f4700a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f4701b.length + i11)];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f4701b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f4700a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        public int f() {
            int[] iArr = this.f4701b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public t0 g() {
            return new a(0, new Random(this.f4700a.nextLong()));
        }

        public int getLength() {
            return this.f4701b.length;
        }
    }

    public static final class b implements t0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f4703a;

        public b(int i10) {
            this.f4703a = i10;
        }

        public t0 a(int i10, int i11) {
            return new b((this.f4703a - i11) + i10);
        }

        public int b() {
            return this.f4703a > 0 ? 0 : -1;
        }

        public int c(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }

        public int d(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f4703a) {
                return i11;
            }
            return -1;
        }

        public t0 e(int i10, int i11) {
            return new b(this.f4703a + i11);
        }

        public int f() {
            int i10 = this.f4703a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        public t0 g() {
            return new b(0);
        }

        public int getLength() {
            return this.f4703a;
        }
    }

    t0 a(int i10, int i11);

    int b();

    int c(int i10);

    int d(int i10);

    t0 e(int i10, int i11);

    int f();

    t0 g();

    int getLength();
}
