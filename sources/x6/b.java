package x6;

import b6.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import d.o0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w7.p;
import w7.q0;
import w7.v;
import w7.w;

public final class b implements u6.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15127b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f15128c = "Id3Decoder";

    /* renamed from: d  reason: collision with root package name */
    public static final int f15129d = q0.T("ID3");

    /* renamed from: e  reason: collision with root package name */
    public static final int f15130e = 10;

    /* renamed from: f  reason: collision with root package name */
    public static final int f15131f = 128;

    /* renamed from: g  reason: collision with root package name */
    public static final int f15132g = 64;

    /* renamed from: h  reason: collision with root package name */
    public static final int f15133h = 32;

    /* renamed from: i  reason: collision with root package name */
    public static final int f15134i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f15135j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f15136k = 64;

    /* renamed from: l  reason: collision with root package name */
    public static final int f15137l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final int f15138m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f15139n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f15140o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f15141p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f15142q = 3;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final a f15143a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* renamed from: x6.b$b  reason: collision with other inner class name */
    public static final class C0240b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15144a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15145b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15146c;

        public C0240b(int i10, boolean z10, int i11) {
            this.f15144a = i10;
            this.f15145b = z10;
            this.f15146c = i11;
        }
    }

    public b() {
        this((a) null);
    }

    public b(@o0 a aVar) {
        this.f15143a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098 A[SYNTHETIC, Splitter:B:46:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0094 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A(w7.w r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.l()     // Catch:{ all -> 0x00af }
            long r8 = r18.F()     // Catch:{ all -> 0x00af }
            int r10 = r18.J()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.G()     // Catch:{ all -> 0x00af }
            int r8 = r18.G()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = r6
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.Q(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            r1.Q(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = r4
            goto L_0x0074
        L_0x0073:
            r3 = r6
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = r6
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = r4
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = r6
            r4 = r3
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0098
            r1.Q(r2)
            return r6
        L_0x0098:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a5
            r1.Q(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.R(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.Q(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.Q(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.A(w7.w, int, int, boolean):boolean");
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? q0.f14791f : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static ApicFrame e(w wVar, int i10, int i11) throws UnsupportedEncodingException {
        int i12;
        String str;
        int D = wVar.D();
        String u10 = u(D);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        wVar.i(bArr, 0, i13);
        if (i11 == 2) {
            str = "image/" + q0.Y0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            i12 = x(bArr, 0);
            String Y0 = q0.Y0(new String(bArr, 0, i12, "ISO-8859-1"));
            if (Y0.indexOf(47) == -1) {
                str = "image/" + Y0;
            } else {
                str = Y0;
            }
        }
        int i14 = i12 + 2;
        int w10 = w(bArr, i14, D);
        return new ApicFrame(str, new String(bArr, i14, w10 - i14, u10), bArr[i12 + 1] & 255, c(bArr, w10 + t(D), i13));
    }

    public static BinaryFrame f(w wVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        wVar.i(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame g(w wVar, int i10, int i11, boolean z10, int i12, @o0 a aVar) throws UnsupportedEncodingException {
        w wVar2 = wVar;
        int c10 = wVar.c();
        int x10 = x(wVar2.f14880a, c10);
        String str = new String(wVar2.f14880a, c10, x10 - c10, "ISO-8859-1");
        wVar.Q(x10 + 1);
        int l10 = wVar.l();
        int l11 = wVar.l();
        long F = wVar.F();
        long j10 = F == 4294967295L ? -1 : F;
        long F2 = wVar.F();
        long j11 = F2 == 4294967295L ? -1 : F2;
        ArrayList arrayList = new ArrayList();
        int i13 = c10 + i10;
        while (wVar.c() < i13) {
            Id3Frame j12 = j(i11, wVar, z10, i12, aVar);
            if (j12 != null) {
                arrayList.add(j12);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, l10, l11, j10, j11, id3FrameArr);
    }

    public static ChapterTocFrame h(w wVar, int i10, int i11, boolean z10, int i12, @o0 a aVar) throws UnsupportedEncodingException {
        w wVar2 = wVar;
        int c10 = wVar.c();
        int x10 = x(wVar2.f14880a, c10);
        String str = new String(wVar2.f14880a, c10, x10 - c10, "ISO-8859-1");
        wVar.Q(x10 + 1);
        int D = wVar.D();
        boolean z11 = (D & 2) != 0;
        boolean z12 = (D & 1) != 0;
        int D2 = wVar.D();
        String[] strArr = new String[D2];
        for (int i13 = 0; i13 < D2; i13++) {
            int c11 = wVar.c();
            int x11 = x(wVar2.f14880a, c11);
            strArr[i13] = new String(wVar2.f14880a, c11, x11 - c11, "ISO-8859-1");
            wVar.Q(x11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = c10 + i10;
        while (wVar.c() < i14) {
            Id3Frame j10 = j(i11, wVar, z10, i12, aVar);
            if (j10 != null) {
                arrayList.add(j10);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    @o0
    public static CommentFrame i(w wVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int D = wVar.D();
        String u10 = u(D);
        byte[] bArr = new byte[3];
        wVar.i(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        wVar.i(bArr2, 0, i11);
        int w10 = w(bArr2, 0, D);
        String str2 = new String(bArr2, 0, w10, u10);
        int t10 = w10 + t(D);
        return new CommentFrame(str, str2, o(bArr2, t10, w(bArr2, t10, D), u10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame j(int r19, w7.w r20, boolean r21, int r22, @d.o0 x6.b.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.D()
            int r9 = r20.D()
            int r10 = r20.D()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.D()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.H()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.H()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.G()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.J()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.d()
            r7.Q(r0)
            return r16
        L_0x0067:
            int r1 = r20.c()
            int r5 = r1 + r15
            int r1 = r20.d()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            w7.p.l(r4, r0)
            int r0 = r20.d()
            r7.Q(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.Q(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = r1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = r1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = r1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = r1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = r1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = r1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = r1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = r1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.R(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.R(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = z(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = q(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = p(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = s(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = r(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = n(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = k(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = e(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = i(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            com.google.android.exoplayer2.metadata.id3.MlltFrame r1 = m(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r1 = f(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = v(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            w7.p.l(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.Q(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            w7.p.l(r12, r0)     // Catch:{ all -> 0x012e }
            r7.Q(r14)
            return r16
        L_0x0221:
            r7.Q(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            w7.p.l(r12, r0)
            r7.Q(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.b.j(int, w7.w, boolean, int, x6.b$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame k(w wVar, int i10) throws UnsupportedEncodingException {
        int D = wVar.D();
        String u10 = u(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.i(bArr, 0, i11);
        int x10 = x(bArr, 0);
        String str = new String(bArr, 0, x10, "ISO-8859-1");
        int i12 = x10 + 1;
        int w10 = w(bArr, i12, D);
        String o10 = o(bArr, i12, w10, u10);
        int t10 = w10 + t(D);
        int w11 = w(bArr, t10, D);
        return new GeobFrame(str, o10, o(bArr, t10, w11, u10), c(bArr, w11 + t(D), i11));
    }

    @o0
    public static C0240b l(w wVar) {
        StringBuilder sb2;
        String str;
        String str2;
        if (wVar.a() < 10) {
            str2 = "Data too short to be an ID3 tag";
        } else {
            int G = wVar.G();
            if (G != f15129d) {
                sb2 = new StringBuilder();
                str = "Unexpected first three bytes of ID3 tag header: ";
            } else {
                G = wVar.D();
                boolean z10 = true;
                wVar.R(1);
                int D = wVar.D();
                int C = wVar.C();
                if (G == 2) {
                    if ((D & 64) != 0) {
                        str2 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (G == 3) {
                    if ((D & 64) != 0) {
                        int l10 = wVar.l();
                        wVar.R(l10);
                        C -= l10 + 4;
                    }
                } else if (G == 4) {
                    if ((D & 64) != 0) {
                        int C2 = wVar.C();
                        wVar.R(C2 - 4);
                        C -= C2;
                    }
                    if ((D & 16) != 0) {
                        C -= 10;
                    }
                } else {
                    sb2 = new StringBuilder();
                    str = "Skipped ID3 tag with unsupported majorVersion=";
                }
                if (G >= 4 || (D & 128) == 0) {
                    z10 = false;
                }
                return new C0240b(G, z10, C);
            }
            sb2.append(str);
            sb2.append(G);
            str2 = sb2.toString();
        }
        p.l(f15128c, str2);
        return null;
    }

    public static MlltFrame m(w wVar, int i10) {
        int J = wVar.J();
        int G = wVar.G();
        int G2 = wVar.G();
        int D = wVar.D();
        int D2 = wVar.D();
        v vVar = new v();
        vVar.k(wVar);
        int i11 = ((i10 - 10) * 8) / (D + D2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = vVar.h(D);
            int h11 = vVar.h(D2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new MlltFrame(J, G, G2, iArr, iArr2);
    }

    public static PrivFrame n(w wVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        wVar.i(bArr, 0, i10);
        int x10 = x(bArr, 0);
        return new PrivFrame(new String(bArr, 0, x10, "ISO-8859-1"), c(bArr, x10 + 1, i10));
    }

    public static String o(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    @o0
    public static TextInformationFrame p(w wVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int D = wVar.D();
        String u10 = u(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.i(bArr, 0, i11);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, w(bArr, 0, D), u10));
    }

    @o0
    public static TextInformationFrame q(w wVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int D = wVar.D();
        String u10 = u(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.i(bArr, 0, i11);
        int w10 = w(bArr, 0, D);
        String str = new String(bArr, 0, w10, u10);
        int t10 = w10 + t(D);
        return new TextInformationFrame("TXXX", str, o(bArr, t10, w(bArr, t10, D), u10));
    }

    public static UrlLinkFrame r(w wVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        wVar.i(bArr, 0, i10);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, x(bArr, 0), "ISO-8859-1"));
    }

    @o0
    public static UrlLinkFrame s(w wVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int D = wVar.D();
        String u10 = u(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        wVar.i(bArr, 0, i11);
        int w10 = w(bArr, 0, D);
        String str = new String(bArr, 0, w10, u10);
        int t10 = w10 + t(D);
        return new UrlLinkFrame("WXXX", str, o(bArr, t10, x(bArr, t10), "ISO-8859-1"));
    }

    public static int t(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String u(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : c.f4245m;
    }

    public static String v(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    public static int w(byte[] bArr, int i10, int i11) {
        int x10 = x(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return x10;
        }
        while (x10 < bArr.length - 1) {
            if (x10 % 2 == 0 && bArr[x10 + 1] == 0) {
                return x10;
            }
            x10 = x(bArr, x10 + 1);
        }
        return bArr.length;
    }

    public static int x(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean y(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static int z(w wVar, int i10) {
        byte[] bArr = wVar.f14880a;
        int c10 = wVar.c();
        int i11 = c10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= c10 + i10) {
                return i10;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - (i11 - c10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    @o0
    public Metadata a(u6.c cVar) {
        ByteBuffer byteBuffer = cVar.Q;
        return d(byteBuffer.array(), byteBuffer.limit());
    }

    @o0
    public Metadata d(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        w wVar = new w(bArr, i10);
        C0240b l10 = l(wVar);
        if (l10 == null) {
            return null;
        }
        int c10 = wVar.c();
        int i11 = l10.f15144a == 2 ? 6 : 10;
        int b10 = l10.f15146c;
        if (l10.f15145b) {
            b10 = z(wVar, l10.f15146c);
        }
        wVar.P(c10 + b10);
        boolean z10 = false;
        if (!A(wVar, l10.f15144a, i11, false)) {
            if (l10.f15144a != 4 || !A(wVar, 4, i11, true)) {
                p.l(f15128c, "Failed to validate ID3 tag with majorVersion=" + l10.f15144a);
                return null;
            }
            z10 = true;
        }
        while (wVar.a() >= i11) {
            Id3Frame j10 = j(l10.f15144a, wVar, z10, i11, this.f15143a);
            if (j10 != null) {
                arrayList.add(j10);
            }
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }
}
