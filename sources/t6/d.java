package t6;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.material.timepicker.ChipTextInputComboView;
import d.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.p;
import w7.q0;
import w7.s;

@SuppressLint({"InlinedApi"})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13024a = "MediaCodecUtil";

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f13025b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<b, List<a>> f13026c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final SparseIntArray f13027d;

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f13028e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f13029f = "avc1";

    /* renamed from: g  reason: collision with root package name */
    public static final String f13030g = "avc2";

    /* renamed from: h  reason: collision with root package name */
    public static final Map<String, Integer> f13031h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f13032i = "hev1";

    /* renamed from: j  reason: collision with root package name */
    public static final String f13033j = "hvc1";

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, Integer> f13034k;

    /* renamed from: l  reason: collision with root package name */
    public static final Map<String, Integer> f13035l;

    /* renamed from: m  reason: collision with root package name */
    public static final String f13036m = "dvhe";

    /* renamed from: n  reason: collision with root package name */
    public static final String f13037n = "dvh1";

    /* renamed from: o  reason: collision with root package name */
    public static final SparseIntArray f13038o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f13039p = "mp4a";

    /* renamed from: q  reason: collision with root package name */
    public static int f13040q = -1;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13041a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13042b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13043c;

        public b(String str, boolean z10, boolean z11) {
            this.f13041a = str;
            this.f13042b = z10;
            this.f13043c = z11;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f13041a, bVar.f13041a) && this.f13042b == bVar.f13042b && this.f13043c == bVar.f13043c;
        }

        public int hashCode() {
            String str = this.f13041a;
            int i10 = 1231;
            int hashCode = ((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f13042b ? 1231 : 1237)) * 31;
            if (!this.f13043c) {
                i10 = 1237;
            }
            return hashCode + i10;
        }
    }

    public static class c extends Exception {
        public c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* renamed from: t6.d$d  reason: collision with other inner class name */
    public interface C0219d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class e implements C0219d {
        public e() {
        }

        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && s.f14813h.equals(str2);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        public int d() {
            return MediaCodecList.getCodecCount();
        }

        public boolean e() {
            return false;
        }
    }

    @TargetApi(21)
    public static final class f implements C0219d {

        /* renamed from: a  reason: collision with root package name */
        public final int f13044a;

        /* renamed from: b  reason: collision with root package name */
        public MediaCodecInfo[] f13045b;

        public f(boolean z10, boolean z11) {
            this.f13044a = (z10 || z11) ? 1 : 0;
        }

        public MediaCodecInfo a(int i10) {
            f();
            return this.f13045b[i10];
        }

        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        public int d() {
            f();
            return this.f13045b.length;
        }

        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.f13045b == null) {
                this.f13045b = new MediaCodecList(this.f13044a).getCodecInfos();
            }
        }
    }

    public static final class g implements Comparator<a> {
        public g() {
        }

        public static int b(a aVar) {
            return aVar.f12964a.startsWith("OMX.google") ? -1 : 0;
        }

        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return b(aVar) - b(aVar2);
        }
    }

    public static final class h implements Comparator<a> {
        public h() {
        }

        public static int b(a aVar) {
            String str = aVar.f12964a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (q0.f14786a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }

        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return b(aVar) - b(aVar2);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f13027d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(dg.a.f18289vg, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f13028e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f13031h = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
        HashMap hashMap2 = new HashMap();
        f13034k = hashMap2;
        hashMap2.put(ChipTextInputComboView.b.P, 1);
        hashMap2.put("01", 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", 128);
        hashMap2.put("08", 256);
        hashMap2.put("09", 512);
        HashMap hashMap3 = new HashMap();
        f13035l = hashMap3;
        hashMap3.put("01", 1);
        hashMap3.put("02", 2);
        hashMap3.put("03", 4);
        hashMap3.put("04", 8);
        hashMap3.put("05", 16);
        hashMap3.put("06", 32);
        hashMap3.put("07", 64);
        hashMap3.put("08", 128);
        hashMap3.put("09", 256);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f13038o = sparseIntArray3;
        sparseIntArray3.put(1, 1);
        sparseIntArray3.put(2, 2);
        sparseIntArray3.put(3, 3);
        sparseIntArray3.put(4, 4);
        sparseIntArray3.put(5, 5);
        sparseIntArray3.put(6, 6);
        sparseIntArray3.put(17, 17);
        sparseIntArray3.put(20, 20);
        sparseIntArray3.put(23, 23);
        sparseIntArray3.put(29, 29);
        sparseIntArray3.put(39, 39);
        sparseIntArray3.put(42, 42);
    }

    public static void a(String str, List<a> list) {
        Comparator gVar;
        if (s.f14841z.equals(str)) {
            gVar = new h();
        } else if (q0.f14786a < 21 && list.size() > 1) {
            String str2 = list.get(0).f12964a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                gVar = new g();
            } else {
                return;
            }
        } else {
            return;
        }
        Collections.sort(list, gVar);
    }

    public static int b(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static boolean c(String str) {
        if (q0.f14786a <= 22) {
            String str2 = q0.f14789d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    @o0
    public static Pair<Integer, Integer> d(String str, String[] strArr) {
        int i10;
        if (strArr.length != 3) {
            p.l(f13024a, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (s.f14836u.equals(s.e(Integer.parseInt(strArr[1], 16))) && (i10 = f13038o.get(Integer.parseInt(strArr[2]), -1)) != -1) {
                return new Pair<>(Integer.valueOf(i10), 0);
            }
        } catch (NumberFormatException unused) {
            p.l(f13024a, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static Pair<Integer, Integer> e(String str, String[] strArr) {
        StringBuilder sb2;
        int i10;
        int i11;
        String str2;
        if (strArr.length < 2) {
            sb2 = new StringBuilder();
        } else {
            try {
                if (strArr[1].length() == 6) {
                    i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i10 = Integer.parseInt(strArr[1].substring(4), 16);
                } else if (strArr.length >= 3) {
                    int parseInt = Integer.parseInt(strArr[1]);
                    i10 = Integer.parseInt(strArr[2]);
                    i11 = parseInt;
                } else {
                    p.l(f13024a, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = f13027d.get(i11, -1);
                if (i12 == -1) {
                    str2 = "Unknown AVC profile: " + i11;
                    p.l(f13024a, str2);
                    return null;
                }
                int i13 = f13028e.get(i10, -1);
                if (i13 != -1) {
                    return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
                }
                sb2 = new StringBuilder();
                sb2.append("Unknown AVC level: ");
                sb2.append(i10);
                str2 = sb2.toString();
                p.l(f13024a, str2);
                return null;
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        }
        sb2.append("Ignoring malformed AVC codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        p.l(f13024a, str2);
        return null;
    }

    @o0
    public static String f(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!n(mediaCodecInfo, str, z10, str2)) {
            return null;
        }
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(s.f14833r)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
        } else if (str2.equals(s.P) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals(s.O) || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r3.equals(f13029f) == false) goto L_0x0018;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> g(@d.o0 java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L_0x005c;
                case 3006244: goto L_0x0051;
                case 3095771: goto L_0x0046;
                case 3095823: goto L_0x003b;
                case 3199032: goto L_0x0030;
                case 3214780: goto L_0x0025;
                case 3356560: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r2 = r4
            goto L_0x0065
        L_0x001a:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            r2 = 6
            goto L_0x0065
        L_0x0025:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x002e
            goto L_0x0018
        L_0x002e:
            r2 = 5
            goto L_0x0065
        L_0x0030:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0039
            goto L_0x0018
        L_0x0039:
            r2 = 4
            goto L_0x0065
        L_0x003b:
            java.lang.String r2 = "dvhe"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0044
            goto L_0x0018
        L_0x0044:
            r2 = 3
            goto L_0x0065
        L_0x0046:
            java.lang.String r2 = "dvh1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004f
            goto L_0x0018
        L_0x004f:
            r2 = 2
            goto L_0x0065
        L_0x0051:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x005a
            goto L_0x0018
        L_0x005a:
            r2 = 1
            goto L_0x0065
        L_0x005c:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0065
            goto L_0x0018
        L_0x0065:
            switch(r2) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0078;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x006e;
                case 5: goto L_0x006e;
                case 6: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            return r0
        L_0x0069:
            android.util.Pair r6 = d(r6, r1)
            return r6
        L_0x006e:
            android.util.Pair r6 = l(r6, r1)
            return r6
        L_0x0073:
            android.util.Pair r6 = k(r6, r1)
            return r6
        L_0x0078:
            android.util.Pair r6 = e(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.d.g(java.lang.String):android.util.Pair");
    }

    @o0
    public static a h(String str, boolean z10, boolean z11) throws c {
        List<a> i10 = i(str, z10, z11);
        if (i10.isEmpty()) {
            return null;
        }
        return i10.get(0);
    }

    public static synchronized List<a> i(String str, boolean z10, boolean z11) throws c {
        synchronized (d.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<a>> hashMap = f13026c;
            List<a> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = q0.f14786a;
            ArrayList<a> j10 = j(bVar, i10 >= 21 ? new f(z10, z11) : new e());
            if (z10 && j10.isEmpty() && 21 <= i10 && i10 <= 23) {
                j10 = j(bVar, new e());
                if (!j10.isEmpty()) {
                    p.l(f13024a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + j10.get(0).f12964a);
                }
            }
            a(str, j10);
            List<a> unmodifiableList = Collections.unmodifiableList(j10);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[SYNTHETIC, Splitter:B:42:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<t6.a> j(t6.d.b r18, t6.d.C0219d r19) throws t6.d.c {
        /*
            r1 = r18
            r2 = r19
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f7 }
            r5.<init>()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r12 = r1.f13041a     // Catch:{ Exception -> 0x00f7 }
            int r13 = r19.d()     // Catch:{ Exception -> 0x00f7 }
            boolean r14 = r19.e()     // Catch:{ Exception -> 0x00f7 }
            r0 = 0
            r15 = r0
        L_0x0019:
            if (r15 >= r13) goto L_0x00f6
            android.media.MediaCodecInfo r0 = r2.a(r15)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r10 = f(r0, r11, r14, r12)     // Catch:{ Exception -> 0x00f7 }
            if (r10 != 0) goto L_0x002b
            goto L_0x00cc
        L_0x002b:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00a1 }
            boolean r0 = r2.b(r4, r10, r9)     // Catch:{ Exception -> 0x00a1 }
            boolean r6 = r2.c(r4, r10, r9)     // Catch:{ Exception -> 0x00a1 }
            boolean r7 = r1.f13043c     // Catch:{ Exception -> 0x00a1 }
            if (r7 != 0) goto L_0x003d
            if (r6 != 0) goto L_0x00cc
        L_0x003d:
            if (r7 == 0) goto L_0x0043
            if (r0 != 0) goto L_0x0043
            goto L_0x00cc
        L_0x0043:
            boolean r0 = r2.b(r3, r10, r9)     // Catch:{ Exception -> 0x00a1 }
            boolean r6 = r2.c(r3, r10, r9)     // Catch:{ Exception -> 0x00a1 }
            boolean r7 = r1.f13042b     // Catch:{ Exception -> 0x00a1 }
            if (r7 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x00cc
        L_0x0051:
            if (r7 == 0) goto L_0x0057
            if (r0 != 0) goto L_0x0057
            goto L_0x00cc
        L_0x0057:
            boolean r16 = c(r11)     // Catch:{ Exception -> 0x00a1 }
            if (r14 == 0) goto L_0x0061
            boolean r6 = r1.f13042b     // Catch:{ Exception -> 0x00a1 }
            if (r6 == r0) goto L_0x0067
        L_0x0061:
            if (r14 != 0) goto L_0x007b
            boolean r6 = r1.f13042b     // Catch:{ Exception -> 0x00a1 }
            if (r6 != 0) goto L_0x007b
        L_0x0067:
            r0 = 0
            r6 = r11
            r7 = r12
            r8 = r10
            r17 = r10
            r10 = r16
            r1 = r11
            r11 = r0
            t6.a r0 = t6.a.v(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0079 }
            r5.add(r0)     // Catch:{ Exception -> 0x0079 }
            goto L_0x00cc
        L_0x0079:
            r0 = move-exception
            goto L_0x00a5
        L_0x007b:
            r17 = r10
            r1 = r11
            if (r14 != 0) goto L_0x00cc
            if (r0 == 0) goto L_0x00cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0079 }
            r0.<init>()     // Catch:{ Exception -> 0x0079 }
            r0.append(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r6 = ".secure"
            r0.append(r6)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x0079 }
            r11 = 1
            r7 = r12
            r8 = r17
            r10 = r16
            t6.a r0 = t6.a.v(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0079 }
            r5.add(r0)     // Catch:{ Exception -> 0x0079 }
            return r5
        L_0x00a1:
            r0 = move-exception
            r17 = r10
            r1 = r11
        L_0x00a5:
            int r6 = w7.q0.f14786a     // Catch:{ Exception -> 0x00f7 }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x00d2
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x00f7 }
            if (r6 != 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f7 }
            r0.<init>()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x00f7 }
            r0.append(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f7 }
            w7.p.d(r8, r0)     // Catch:{ Exception -> 0x00f7 }
        L_0x00cc:
            int r15 = r15 + 1
            r1 = r18
            goto L_0x0019
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f7 }
            r2.<init>()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x00f7 }
            r2.append(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x00f7 }
            r1 = r17
            r2.append(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00f7 }
            w7.p.d(r8, r1)     // Catch:{ Exception -> 0x00f7 }
            throw r0     // Catch:{ Exception -> 0x00f7 }
        L_0x00f6:
            return r5
        L_0x00f7:
            r0 = move-exception
            t6.d$c r1 = new t6.d$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.d.j(t6.d$b, t6.d$d):java.util.ArrayList");
    }

    public static Pair<Integer, Integer> k(String str, String[] strArr) {
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        if (strArr.length < 3) {
            sb3 = new StringBuilder();
        } else {
            Matcher matcher = f13025b.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb3 = new StringBuilder();
            } else {
                str = matcher.group(1);
                Integer num = f13034k.get(str);
                if (num == null) {
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer num2 = f13035l.get(str);
                    if (num2 != null) {
                        return new Pair<>(num, num2);
                    }
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb3.append(str2);
                sb3.append(str);
                p.l(f13024a, sb3.toString());
                return null;
            }
        }
        sb3.append("Ignoring malformed Dolby Vision codec string: ");
        sb3.append(str);
        p.l(f13024a, sb3.toString());
        return null;
    }

    public static Pair<Integer, Integer> l(String str, String[] strArr) {
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        if (strArr.length < 4) {
            sb2 = new StringBuilder();
        } else {
            int i10 = 1;
            Matcher matcher = f13025b.matcher(strArr[1]);
            if (!matcher.matches()) {
                sb2 = new StringBuilder();
            } else {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if ("2".equals(str)) {
                        i10 = 2;
                    } else {
                        sb3 = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb2.append(str2);
                        sb2.append(str);
                        p.l(f13024a, sb2.toString());
                        return null;
                    }
                }
                str = strArr[3];
                Integer num = f13031h.get(str);
                if (num != null) {
                    return new Pair<>(Integer.valueOf(i10), num);
                }
                sb3 = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb2.append(str2);
                sb2.append(str);
                p.l(f13024a, sb2.toString());
                return null;
            }
        }
        sb2.append("Ignoring malformed HEVC codec string: ");
        sb2.append(str);
        p.l(f13024a, sb2.toString());
        return null;
    }

    @o0
    public static a m() throws c {
        a h10 = h(s.f14841z, false, false);
        if (h10 == null) {
            return null;
        }
        return a.w(h10.f12964a);
    }

    public static boolean n(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = q0.f14786a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = q0.f14787b;
            if ("a70".equals(str3) || ("Xiaomi".equals(q0.f14788c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = q0.f14787b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = q0.f14787b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && com.google.android.material.internal.e.f17193b.equals(q0.f14788c))) {
            String str6 = q0.f14787b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && com.google.android.material.internal.e.f17193b.equals(q0.f14788c)) {
            String str7 = q0.f14787b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 > 19 || !q0.f14787b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !s.E.equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static int o() throws c {
        if (f13040q == -1) {
            int i10 = 0;
            a h10 = h(s.f14813h, false, false);
            if (h10 != null) {
                MediaCodecInfo.CodecProfileLevel[] f10 = h10.f();
                int length = f10.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(b(f10[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, q0.f14786a >= 21 ? 345600 : 172800);
            }
            f13040q = i10;
        }
        return f13040q;
    }

    public static void p(String str, boolean z10, boolean z11) {
        try {
            i(str, z10, z11);
        } catch (c e10) {
            p.e(f13024a, "Codec warming failed", e10);
        }
    }
}
