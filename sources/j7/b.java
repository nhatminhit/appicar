package j7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.l;
import w7.q0;
import w7.v;

public final class b {
    public static final byte[] A = {0, 119, -120, -1};
    public static final byte[] B = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, d5.a.f6090j, -52, -35, -18, -1};

    /* renamed from: h  reason: collision with root package name */
    public static final String f9623h = "DvbParser";

    /* renamed from: i  reason: collision with root package name */
    public static final int f9624i = 16;

    /* renamed from: j  reason: collision with root package name */
    public static final int f9625j = 17;

    /* renamed from: k  reason: collision with root package name */
    public static final int f9626k = 18;

    /* renamed from: l  reason: collision with root package name */
    public static final int f9627l = 19;

    /* renamed from: m  reason: collision with root package name */
    public static final int f9628m = 20;

    /* renamed from: n  reason: collision with root package name */
    public static final int f9629n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f9630o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f9631p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final int f9632q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f9633r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f9634s = 16;

    /* renamed from: t  reason: collision with root package name */
    public static final int f9635t = 17;

    /* renamed from: u  reason: collision with root package name */
    public static final int f9636u = 18;

    /* renamed from: v  reason: collision with root package name */
    public static final int f9637v = 32;

    /* renamed from: w  reason: collision with root package name */
    public static final int f9638w = 33;

    /* renamed from: x  reason: collision with root package name */
    public static final int f9639x = 34;

    /* renamed from: y  reason: collision with root package name */
    public static final int f9640y = 240;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f9641z = {0, 7, 8, 15};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f9642a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f9643b;

    /* renamed from: c  reason: collision with root package name */
    public final Canvas f9644c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    public final C0163b f9645d = new C0163b(719, p3.a.f11388h1, 0, 719, 0, p3.a.f11388h1);

    /* renamed from: e  reason: collision with root package name */
    public final a f9646e = new a(0, c(), d(), e());

    /* renamed from: f  reason: collision with root package name */
    public final h f9647f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f9648g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9649a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f9650b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f9651c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f9652d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f9649a = i10;
            this.f9650b = iArr;
            this.f9651c = iArr2;
            this.f9652d = iArr3;
        }
    }

    /* renamed from: j7.b$b  reason: collision with other inner class name */
    public static final class C0163b {

        /* renamed from: a  reason: collision with root package name */
        public final int f9653a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9654b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9655c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9656d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9657e;

        /* renamed from: f  reason: collision with root package name */
        public final int f9658f;

        public C0163b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f9653a = i10;
            this.f9654b = i11;
            this.f9655c = i12;
            this.f9656d = i13;
            this.f9657e = i14;
            this.f9658f = i15;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f9659a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9660b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f9661c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f9662d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f9659a = i10;
            this.f9660b = z10;
            this.f9661c = bArr;
            this.f9662d = bArr2;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f9663a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9664b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9665c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f9666d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f9663a = i10;
            this.f9664b = i11;
            this.f9665c = i12;
            this.f9666d = sparseArray;
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f9667a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9668b;

        public e(int i10, int i11) {
            this.f9667a = i10;
            this.f9668b = i11;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f9669a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9670b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9671c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9672d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9673e;

        /* renamed from: f  reason: collision with root package name */
        public final int f9674f;

        /* renamed from: g  reason: collision with root package name */
        public final int f9675g;

        /* renamed from: h  reason: collision with root package name */
        public final int f9676h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9677i;

        /* renamed from: j  reason: collision with root package name */
        public final int f9678j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray<g> f9679k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f9669a = i10;
            this.f9670b = z10;
            this.f9671c = i11;
            this.f9672d = i12;
            this.f9673e = i13;
            this.f9674f = i14;
            this.f9675g = i15;
            this.f9676h = i16;
            this.f9677i = i17;
            this.f9678j = i18;
            this.f9679k = sparseArray;
        }

        public void a(f fVar) {
            if (fVar != null) {
                SparseArray<g> sparseArray = fVar.f9679k;
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    this.f9679k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
                }
            }
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f9680a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9681b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9682c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9683d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9684e;

        /* renamed from: f  reason: collision with root package name */
        public final int f9685f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f9680a = i10;
            this.f9681b = i11;
            this.f9682c = i12;
            this.f9683d = i13;
            this.f9684e = i14;
            this.f9685f = i15;
        }
    }

    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f9686a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9687b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f9688c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f9689d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f9690e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f9691f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f9692g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0163b f9693h;

        /* renamed from: i  reason: collision with root package name */
        public d f9694i;

        public h(int i10, int i11) {
            this.f9686a = i10;
            this.f9687b = i11;
        }

        public void a() {
            this.f9688c.clear();
            this.f9689d.clear();
            this.f9690e.clear();
            this.f9691f.clear();
            this.f9692g.clear();
            this.f9693h = null;
            this.f9694i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f9642a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f9643b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f9647f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, v vVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) vVar.h(i11);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = f(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = f(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                int i15 = dg.a.Jd;
                int i16 = 85;
                if (i14 == 0) {
                    int i17 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i18 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = f(255, i17, i18, i16 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        int i22 = i19 + 127;
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i20, i21, i22 + i16);
                    } else if (i14 == 136) {
                        int i23 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i24 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = f(255, i23, i24, i19 + i16);
                    }
                } else {
                    int i25 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i26 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = f(127, i25, i26, i16 + i15);
                }
            }
        }
        return iArr;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(w7.v r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
            r12 = r5
            goto L_0x0058
        L_0x0014:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L_0x0020:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0058
        L_0x0028:
            boolean r4 = r13.g()
            if (r4 == 0) goto L_0x0032
            r11 = r2
            r12 = r5
        L_0x0030:
            r4 = r9
            goto L_0x0058
        L_0x0032:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0053
            if (r4 == r3) goto L_0x004b
            if (r4 == r6) goto L_0x0042
            r11 = r2
        L_0x003f:
            r4 = r9
            r12 = r4
            goto L_0x0058
        L_0x0042:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L_0x0020
        L_0x004b:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L_0x0020
        L_0x0053:
            r11 = r2
            r12 = r3
            goto L_0x0030
        L_0x0056:
            r11 = r5
            goto L_0x003f
        L_0x0058:
            if (r12 == 0) goto L_0x0076
            if (r8 == 0) goto L_0x0076
            if (r15 == 0) goto L_0x0060
            byte r4 = r15[r4]
        L_0x0060:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0076:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x007a
            return r10
        L_0x007a:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b.g(w7.v, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(w7.v r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r6
            goto L_0x0060
        L_0x0015:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r7)
            if (r3 == 0) goto L_0x0028
            int r5 = r3 + 2
        L_0x0024:
            r11 = r2
            r12 = r5
        L_0x0026:
            r4 = r9
            goto L_0x0060
        L_0x0028:
            r11 = r6
            goto L_0x004a
        L_0x002a:
            boolean r4 = r13.g()
            if (r4 != 0) goto L_0x003d
            int r4 = r13.h(r5)
            int r5 = r4 + 4
        L_0x0036:
            int r4 = r13.h(r3)
            r11 = r2
            r12 = r5
            goto L_0x0060
        L_0x003d:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L_0x005d
            if (r4 == r6) goto L_0x0024
            if (r4 == r5) goto L_0x0056
            if (r4 == r7) goto L_0x004d
            r11 = r2
        L_0x004a:
            r4 = r9
            r12 = r4
            goto L_0x0060
        L_0x004d:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            goto L_0x0036
        L_0x0056:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            goto L_0x0036
        L_0x005d:
            r11 = r2
            r12 = r6
            goto L_0x0026
        L_0x0060:
            if (r12 == 0) goto L_0x007c
            if (r8 == 0) goto L_0x007c
            if (r15 == 0) goto L_0x0068
            byte r4 = r15[r4]
        L_0x0068:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007c:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0080
            return r10
        L_0x0080:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b.h(w7.v, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(w7.v r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 8
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = r9
            goto L_0x0035
        L_0x0026:
            r11 = r5
            r4 = r9
            r12 = r4
            goto L_0x0035
        L_0x002a:
            int r4 = r13.h(r6)
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b.i(w7.v, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i13 = i10;
        byte[] bArr4 = bArr;
        v vVar = new v(bArr);
        int i14 = i11;
        int i15 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (vVar.b() != 0) {
            int h10 = vVar.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i13 != 3) {
                            if (i13 != 2) {
                                bArr2 = null;
                                i14 = g(vVar, iArr, bArr2, i14, i15, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr6 == null ? f9641z : bArr6;
                            }
                        } else {
                            bArr3 = bArr5 == null ? A : bArr5;
                        }
                        bArr2 = bArr3;
                        i14 = g(vVar, iArr, bArr2, i14, i15, paint, canvas);
                    case 17:
                        i14 = h(vVar, iArr, i13 == 3 ? B : null, i14, i15, paint, canvas);
                        break;
                    case 18:
                        i14 = i(vVar, iArr, (byte[]) null, i14, i15, paint, canvas);
                        continue;
                    default:
                        switch (h10) {
                            case 32:
                                bArr6 = a(4, 4, vVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, vVar);
                                break;
                            case 34:
                                bArr5 = a(16, 8, vVar);
                                break;
                            default:
                                continue;
                        }
                }
                vVar.c();
            } else {
                i15 += 2;
                i14 = i11;
            }
        }
    }

    public static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f9652d : i10 == 2 ? aVar.f9651c : aVar.f9650b;
        int i13 = i10;
        int i14 = i11;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        j(cVar.f9661c, iArr, i13, i14, i12, paint2, canvas2);
        j(cVar.f9662d, iArr, i13, i14, i12 + 1, paint2, canvas2);
    }

    public static a l(v vVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        v vVar2 = vVar;
        int i16 = 8;
        int h10 = vVar2.h(8);
        vVar2.p(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i18 > 0) {
            int h11 = vVar2.h(i16);
            int h12 = vVar2.h(i16);
            int i19 = i18 - 2;
            int[] iArr = (h12 & 128) != 0 ? c10 : (h12 & 64) != 0 ? d10 : e10;
            if ((h12 & 1) != 0) {
                i14 = vVar2.h(i16);
                i13 = vVar2.h(i16);
                i12 = vVar2.h(i16);
                i11 = vVar2.h(i16);
                i15 = i19 - 4;
            } else {
                i12 = vVar2.h(4) << 4;
                i15 = i19 - 2;
                int h13 = vVar2.h(4) << 4;
                i11 = vVar2.h(i17) << 6;
                i14 = vVar2.h(6) << i17;
                i13 = h13;
            }
            if (i14 == 0) {
                i11 = 255;
                i13 = 0;
                i12 = 0;
            }
            double d11 = (double) i14;
            double d12 = (double) (i13 + l.Q);
            double d13 = (double) (i12 + l.Q);
            iArr[h11] = f((byte) (255 - (i11 & 255)), q0.u((int) (d11 + (1.402d * d12)), 0, 255), q0.u((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), q0.u((int) (d11 + (d13 * 1.772d)), 0, 255));
            i18 = i15;
            h10 = h10;
            i16 = 8;
            i17 = 2;
        }
        return new a(h10, c10, d10, e10);
    }

    public static C0163b m(v vVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        vVar.p(4);
        boolean g10 = vVar.g();
        vVar.p(3);
        int h10 = vVar.h(16);
        int h11 = vVar.h(16);
        if (g10) {
            int h12 = vVar.h(16);
            int h13 = vVar.h(16);
            int h14 = vVar.h(16);
            i10 = vVar.h(16);
            i12 = h13;
            i11 = h14;
            i13 = h12;
        } else {
            i13 = 0;
            i11 = 0;
            i12 = h10;
            i10 = h11;
        }
        return new C0163b(h10, h11, i13, i12, i11, i10);
    }

    public static c n(v vVar) {
        byte[] bArr;
        int h10 = vVar.h(16);
        vVar.p(4);
        int h11 = vVar.h(2);
        boolean g10 = vVar.g();
        vVar.p(1);
        byte[] bArr2 = null;
        if (h11 == 1) {
            vVar.p(vVar.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = vVar.h(16);
            int h13 = vVar.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                vVar.j(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                vVar.j(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    public static d o(v vVar, int i10) {
        int h10 = vVar.h(8);
        int h11 = vVar.h(4);
        int h12 = vVar.h(2);
        vVar.p(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = vVar.h(8);
            vVar.p(8);
            i11 -= 6;
            sparseArray.put(h13, new e(vVar.h(16), vVar.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    public static f p(v vVar, int i10) {
        int i11;
        int i12;
        v vVar2 = vVar;
        int h10 = vVar2.h(8);
        vVar2.p(4);
        boolean g10 = vVar.g();
        vVar2.p(3);
        int i13 = 16;
        int h11 = vVar2.h(16);
        int h12 = vVar2.h(16);
        int h13 = vVar2.h(3);
        int h14 = vVar2.h(3);
        int i14 = 2;
        vVar2.p(2);
        int h15 = vVar2.h(8);
        int h16 = vVar2.h(8);
        int h17 = vVar2.h(4);
        int h18 = vVar2.h(2);
        vVar2.p(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int h19 = vVar2.h(i13);
            int h20 = vVar2.h(i14);
            int h21 = vVar2.h(i14);
            int h22 = vVar2.h(12);
            int i16 = h18;
            vVar2.p(4);
            int h23 = vVar2.h(12);
            i15 -= 6;
            if (h20 == 1 || h20 == 2) {
                i15 -= 2;
                i12 = vVar2.h(8);
                i11 = vVar2.h(8);
            } else {
                i12 = 0;
                i11 = 0;
            }
            sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
            h18 = i16;
            i14 = 2;
            i13 = 16;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void q(w7.v r6, j7.b.h r7) {
        /*
            r0 = 8
            int r0 = r6.h(r0)
            r1 = 16
            int r2 = r6.h(r1)
            int r1 = r6.h(r1)
            int r3 = r6.d()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.b()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            w7.p.l(r7, r0)
            int r7 = r6.b()
            r6.p(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0095;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00bf
        L_0x0031:
            int r0 = r7.f9686a
            if (r2 != r0) goto L_0x00bf
            j7.b$b r0 = m(r6)
            r7.f9693h = r0
            goto L_0x00bf
        L_0x003d:
            int r0 = r7.f9686a
            if (r2 != r0) goto L_0x004a
            j7.b$c r0 = n(r6)
            android.util.SparseArray<j7.b$c> r7 = r7.f9690e
        L_0x0047:
            int r1 = r0.f9659a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.f9687b
            if (r2 != r0) goto L_0x00bf
            j7.b$c r0 = n(r6)
            android.util.SparseArray<j7.b$c> r7 = r7.f9692g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.f9686a
            if (r2 != r0) goto L_0x0065
            j7.b$a r0 = l(r6, r1)
            android.util.SparseArray<j7.b$a> r7 = r7.f9689d
        L_0x005f:
            int r1 = r0.f9649a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00bf
        L_0x0065:
            int r0 = r7.f9687b
            if (r2 != r0) goto L_0x00bf
            j7.b$a r0 = l(r6, r1)
            android.util.SparseArray<j7.b$a> r7 = r7.f9691f
            goto L_0x005f
        L_0x0070:
            j7.b$d r0 = r7.f9694i
            int r4 = r7.f9686a
            if (r2 != r4) goto L_0x00bf
            if (r0 == 0) goto L_0x00bf
            j7.b$f r1 = p(r6, r1)
            int r0 = r0.f9665c
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<j7.b$f> r0 = r7.f9688c
            int r2 = r1.f9669a
            java.lang.Object r0 = r0.get(r2)
            j7.b$f r0 = (j7.b.f) r0
            r1.a(r0)
        L_0x008d:
            android.util.SparseArray<j7.b$f> r7 = r7.f9688c
            int r0 = r1.f9669a
            r7.put(r0, r1)
            goto L_0x00bf
        L_0x0095:
            int r0 = r7.f9686a
            if (r2 != r0) goto L_0x00bf
            j7.b$d r0 = r7.f9694i
            j7.b$d r1 = o(r6, r1)
            int r2 = r1.f9665c
            if (r2 == 0) goto L_0x00b5
            r7.f9694i = r1
            android.util.SparseArray<j7.b$f> r0 = r7.f9688c
            r0.clear()
            android.util.SparseArray<j7.b$a> r0 = r7.f9689d
            r0.clear()
            android.util.SparseArray<j7.b$c> r7 = r7.f9690e
            r7.clear()
            goto L_0x00bf
        L_0x00b5:
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.f9664b
            int r2 = r1.f9664b
            if (r0 == r2) goto L_0x00bf
            r7.f9694i = r1
        L_0x00bf:
            int r7 = r6.d()
            int r3 = r3 - r7
            r6.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.b.q(w7.v, j7.b$h):void");
    }

    public List<h7.b> b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        v vVar = new v(bArr, i10);
        while (vVar.b() >= 48 && vVar.h(8) == 15) {
            q(vVar, this.f9647f);
        }
        h hVar = this.f9647f;
        if (hVar.f9694i == null) {
            return Collections.emptyList();
        }
        C0163b bVar = hVar.f9693h;
        if (bVar == null) {
            bVar = this.f9645d;
        }
        Bitmap bitmap = this.f9648g;
        if (!(bitmap != null && bVar.f9653a + 1 == bitmap.getWidth() && bVar.f9654b + 1 == this.f9648g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f9653a + 1, bVar.f9654b + 1, Bitmap.Config.ARGB_8888);
            this.f9648g = createBitmap;
            this.f9644c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = this.f9647f.f9694i.f9666d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f9644c.save();
            e valueAt = sparseArray2.valueAt(i12);
            f fVar = this.f9647f.f9688c.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.f9667a + bVar.f9655c;
            int i14 = valueAt.f9668b + bVar.f9657e;
            this.f9644c.clipRect(i13, i14, Math.min(fVar.f9671c + i13, bVar.f9656d), Math.min(fVar.f9672d + i14, bVar.f9658f));
            a aVar = this.f9647f.f9689d.get(fVar.f9675g);
            if (aVar == null && (aVar = this.f9647f.f9691f.get(fVar.f9675g)) == null) {
                aVar = this.f9646e;
            }
            SparseArray<g> sparseArray3 = fVar.f9679k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g valueAt2 = sparseArray3.valueAt(i15);
                c cVar = this.f9647f.f9690e.get(keyAt);
                c cVar2 = cVar == null ? this.f9647f.f9692g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f9674f, valueAt2.f9682c + i13, i14 + valueAt2.f9683d, cVar2.f9660b ? null : this.f9642a, this.f9644c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f9670b) {
                int i16 = fVar.f9674f;
                this.f9643b.setColor(i16 == 3 ? aVar.f9652d[fVar.f9676h] : i16 == 2 ? aVar.f9651c[fVar.f9677i] : aVar.f9650b[fVar.f9678j]);
                this.f9644c.drawRect((float) i13, (float) i14, (float) (fVar.f9671c + i13), (float) (fVar.f9672d + i14), this.f9643b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f9648g, i13, i14, fVar.f9671c, fVar.f9672d);
            int i17 = bVar.f9653a;
            float f10 = ((float) i13) / ((float) i17);
            int i18 = bVar.f9654b;
            arrayList.add(new h7.b(createBitmap2, f10, 0, ((float) i14) / ((float) i18), 0, ((float) fVar.f9671c) / ((float) i17), ((float) fVar.f9672d) / ((float) i18)));
            this.f9644c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f9644c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f9647f.a();
    }
}
