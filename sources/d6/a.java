package d6;

import b7.u0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import d5.k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.List;
import p6.h;
import w7.s;
import w7.v;
import w7.w;
import y7.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6178a = 16;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6179b = 10;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6180c = 256;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6181d = 1536;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f6182e = {1, 2, 3, 6};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f6183f = {h.f11572t, u0.U, e.f15575h};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f6184g = {24000, 22050, k6.b.A};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f6185h = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f6186i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, dg.a.RI, 512, p3.a.f11391i1, 640};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f6187j = {69, 87, 104, 121, 139, 174, dg.a.f17889cf, dg.a.f18247tg, dg.a.Dj, dg.a.Xp, dg.a.zy, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* renamed from: g  reason: collision with root package name */
        public static final int f6188g = -1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f6189h = 0;

        /* renamed from: i  reason: collision with root package name */
        public static final int f6190i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f6191j = 2;
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final String f6192a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6193b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6194c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6195d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6196e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6197f;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: d6.a$b$a  reason: collision with other inner class name */
        public @interface C0105a {
        }

        public b(@o0 String str, int i10, int i11, int i12, int i13, int i14) {
            this.f6192a = str;
            this.f6193b = i10;
            this.f6195d = i11;
            this.f6194c = i12;
            this.f6196e = i13;
            this.f6197f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((byteBuffer.getInt(i10 + 4) & -16777217) == -1167101192) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int b() {
        return f6181d;
    }

    public static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f6183f;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f6187j;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f6186i[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static Format d(w wVar, String str, String str2, DrmInitData drmInitData) {
        int i10 = f6183f[(wVar.D() & 192) >> 6];
        int D = wVar.D();
        int i11 = f6185h[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i11++;
        }
        return Format.r(str, s.C, (String) null, -1, -1, i11, i10, (List<byte[]>) null, drmInitData, 0, str2);
    }

    public static b e(v vVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        v vVar2 = vVar;
        int e10 = vVar.e();
        vVar2.p(40);
        boolean z10 = vVar2.h(5) == 16;
        vVar2.n(e10);
        int i18 = -1;
        if (z10) {
            vVar2.p(16);
            int h10 = vVar2.h(2);
            if (h10 == 0) {
                i18 = 0;
            } else if (h10 == 1) {
                i18 = 1;
            } else if (h10 == 2) {
                i18 = 2;
            }
            vVar2.p(3);
            int h11 = (vVar2.h(11) + 1) * 2;
            int h12 = vVar2.h(2);
            if (h12 == 3) {
                i15 = 6;
                i12 = f6184g[vVar2.h(2)];
                i16 = 3;
            } else {
                i16 = vVar2.h(2);
                i15 = f6182e[i16];
                i12 = f6183f[h12];
            }
            i11 = i15 * 256;
            int h13 = vVar2.h(3);
            boolean g10 = vVar.g();
            i10 = f6185h[h13] + (g10 ? 1 : 0);
            vVar2.p(10);
            if (vVar.g()) {
                vVar2.p(8);
            }
            if (h13 == 0) {
                vVar2.p(5);
                if (vVar.g()) {
                    vVar2.p(8);
                }
            }
            if (i18 == 1 && vVar.g()) {
                vVar2.p(16);
            }
            if (vVar.g()) {
                if (h13 > 2) {
                    vVar2.p(2);
                }
                if ((h13 & 1) != 0 && h13 > 2) {
                    vVar2.p(6);
                }
                if ((h13 & 4) != 0) {
                    vVar2.p(6);
                }
                if (g10 && vVar.g()) {
                    vVar2.p(5);
                }
                if (i18 == 0) {
                    if (vVar.g()) {
                        vVar2.p(6);
                    }
                    if (h13 == 0 && vVar.g()) {
                        vVar2.p(6);
                    }
                    if (vVar.g()) {
                        vVar2.p(6);
                    }
                    int h14 = vVar2.h(2);
                    if (h14 == 1) {
                        vVar2.p(5);
                    } else if (h14 == 2) {
                        vVar2.p(12);
                    } else if (h14 == 3) {
                        int h15 = vVar2.h(5);
                        if (vVar.g()) {
                            vVar2.p(5);
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                vVar2.p(4);
                            }
                            if (vVar.g()) {
                                if (vVar.g()) {
                                    vVar2.p(4);
                                }
                                if (vVar.g()) {
                                    vVar2.p(4);
                                }
                            }
                        }
                        if (vVar.g()) {
                            vVar2.p(5);
                            if (vVar.g()) {
                                vVar2.p(7);
                                if (vVar.g()) {
                                    vVar2.p(8);
                                }
                            }
                        }
                        vVar2.p((h15 + 2) * 8);
                        vVar.c();
                    }
                    if (h13 < 2) {
                        if (vVar.g()) {
                            vVar2.p(14);
                        }
                        if (h13 == 0 && vVar.g()) {
                            vVar2.p(14);
                        }
                    }
                    if (vVar.g()) {
                        if (i16 == 0) {
                            vVar2.p(5);
                        } else {
                            for (int i19 = 0; i19 < i15; i19++) {
                                if (vVar.g()) {
                                    vVar2.p(5);
                                }
                            }
                        }
                    }
                }
            }
            if (vVar.g()) {
                vVar2.p(5);
                if (h13 == 2) {
                    vVar2.p(4);
                }
                if (h13 >= 6) {
                    vVar2.p(2);
                }
                if (vVar.g()) {
                    vVar2.p(8);
                }
                if (h13 == 0 && vVar.g()) {
                    vVar2.p(8);
                }
                i17 = 3;
                if (h12 < 3) {
                    vVar.o();
                }
            } else {
                i17 = 3;
            }
            if (i18 == 0 && i16 != i17) {
                vVar.o();
            }
            if (i18 == 2 && (i16 == i17 || vVar.g())) {
                vVar2.p(6);
            }
            str = (vVar.g() && vVar2.h(6) == 1 && vVar2.h(8) == 1) ? s.E : s.D;
            i14 = i18;
            i13 = h11;
        } else {
            vVar2.p(32);
            int h16 = vVar2.h(2);
            String str2 = h16 == 3 ? null : s.C;
            int c10 = c(h16, vVar2.h(6));
            vVar2.p(8);
            int h17 = vVar2.h(3);
            if (!((h17 & 1) == 0 || h17 == 1)) {
                vVar2.p(2);
            }
            if ((h17 & 4) != 0) {
                vVar2.p(2);
            }
            if (h17 == 2) {
                vVar2.p(2);
            }
            int[] iArr = f6183f;
            i12 = h16 < iArr.length ? iArr[h16] : -1;
            i11 = f6181d;
            i10 = f6185h[h17] + (vVar.g() ? 1 : 0);
            i14 = -1;
            str = str2;
            i13 = c10;
        }
        return new b(str, i14, i10, i12, i13, i11);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 255) >> 3) == 16) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & w1.a.K6) >> 6, b10 & 63);
    }

    public static Format g(w wVar, String str, String str2, DrmInitData drmInitData) {
        w wVar2 = wVar;
        wVar.R(2);
        int i10 = f6183f[(wVar.D() & 192) >> 6];
        int D = wVar.D();
        int i11 = f6185h[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i11++;
        }
        if (((wVar.D() & 30) >> 1) > 0 && (2 & wVar.D()) != 0) {
            i11 += 2;
        }
        return Format.r(str, (wVar.a() <= 0 || (wVar.D() & 1) == 0) ? s.D : s.E, (String) null, -1, -1, i11, i10, (List<byte[]>) null, drmInitData, 0, str2);
    }

    public static int h(ByteBuffer byteBuffer) {
        int i10 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & w1.a.K6) >> 6) != 3) {
            i10 = f6182e[(byteBuffer.get(byteBuffer.position() + 4) & k.f6148y0) >> 4];
        }
        return i10 * 256;
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        boolean z10 = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    z10 = true;
                }
                return 40 << ((bArr[z10 ? (char) 9 : 8] >> 4) & 7);
            }
        }
        return 0;
    }
}
