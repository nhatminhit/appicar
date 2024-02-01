package g7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b6.c;
import b7.y0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.DownloadRequest;
import d.o0;
import g7.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o6.j;
import t7.j0;
import w7.q0;
import w7.s;

public final class h implements j0.a<g> {
    public static final String A = "NONE";
    public static final String B = "AES-128";
    public static final String C = "SAMPLE-AES";
    public static final String D = "SAMPLE-AES-CENC";
    public static final String E = "SAMPLE-AES-CTR";
    public static final String F = "com.microsoft.playready";
    public static final String G = "identity";
    public static final String H = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    public static final String I = "com.widevine";
    public static final String J = "YES";
    public static final String K = "NO";
    public static final String L = "CLOSED-CAPTIONS=NONE";
    public static final Pattern M = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern N = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern O = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern T = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern U = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern V = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern W = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern X = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern Z = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f8132a0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: b  reason: collision with root package name */
    public static final String f8133b = "#EXTM3U";

    /* renamed from: b0  reason: collision with root package name */
    public static final Pattern f8134b0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: c  reason: collision with root package name */
    public static final String f8135c = "#EXT";

    /* renamed from: c0  reason: collision with root package name */
    public static final Pattern f8136c0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: d  reason: collision with root package name */
    public static final String f8137d = "#EXT-X-VERSION";

    /* renamed from: d0  reason: collision with root package name */
    public static final Pattern f8138d0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: e  reason: collision with root package name */
    public static final String f8139e = "#EXT-X-PLAYLIST-TYPE";

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f8140e0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: f  reason: collision with root package name */
    public static final String f8141f = "#EXT-X-DEFINE";

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f8142f0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f8143g = "#EXT-X-STREAM-INF";

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f8144g0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    public static final String f8145h = "#EXT-X-MEDIA";

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f8146h0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: i  reason: collision with root package name */
    public static final String f8147i = "#EXT-X-TARGETDURATION";

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f8148i0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    public static final String f8149j = "#EXT-X-DISCONTINUITY";

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f8150j0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: k  reason: collision with root package name */
    public static final String f8151k = "#EXT-X-DISCONTINUITY-SEQUENCE";

    /* renamed from: k0  reason: collision with root package name */
    public static final Pattern f8152k0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: l  reason: collision with root package name */
    public static final String f8153l = "#EXT-X-PROGRAM-DATE-TIME";

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f8154l0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: m  reason: collision with root package name */
    public static final String f8155m = "#EXT-X-MAP";

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f8156m0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: n  reason: collision with root package name */
    public static final String f8157n = "#EXT-X-INDEPENDENT-SEGMENTS";

    /* renamed from: n0  reason: collision with root package name */
    public static final Pattern f8158n0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: o  reason: collision with root package name */
    public static final String f8159o = "#EXTINF";

    /* renamed from: o0  reason: collision with root package name */
    public static final Pattern f8160o0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: p  reason: collision with root package name */
    public static final String f8161p = "#EXT-X-MEDIA-SEQUENCE";

    /* renamed from: p0  reason: collision with root package name */
    public static final Pattern f8162p0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: q  reason: collision with root package name */
    public static final String f8163q = "#EXT-X-START";

    /* renamed from: q0  reason: collision with root package name */
    public static final Pattern f8164q0 = c("AUTOSELECT");

    /* renamed from: r  reason: collision with root package name */
    public static final String f8165r = "#EXT-X-ENDLIST";

    /* renamed from: r0  reason: collision with root package name */
    public static final Pattern f8166r0 = c("DEFAULT");

    /* renamed from: s  reason: collision with root package name */
    public static final String f8167s = "#EXT-X-KEY";

    /* renamed from: s0  reason: collision with root package name */
    public static final Pattern f8168s0 = c("FORCED");

    /* renamed from: t  reason: collision with root package name */
    public static final String f8169t = "#EXT-X-SESSION-KEY";

    /* renamed from: t0  reason: collision with root package name */
    public static final Pattern f8170t0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: u  reason: collision with root package name */
    public static final String f8171u = "#EXT-X-BYTERANGE";

    /* renamed from: u0  reason: collision with root package name */
    public static final Pattern f8172u0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: v  reason: collision with root package name */
    public static final String f8173v = "#EXT-X-GAP";

    /* renamed from: v0  reason: collision with root package name */
    public static final Pattern f8174v0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: w  reason: collision with root package name */
    public static final String f8175w = "AUDIO";

    /* renamed from: x  reason: collision with root package name */
    public static final String f8176x = "VIDEO";

    /* renamed from: y  reason: collision with root package name */
    public static final String f8177y = "SUBTITLES";

    /* renamed from: z  reason: collision with root package name */
    public static final String f8178z = "CLOSED-CAPTIONS";

    /* renamed from: a  reason: collision with root package name */
    public final e f8179a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final BufferedReader f8180a;

        /* renamed from: b  reason: collision with root package name */
        public final Queue<String> f8181b;

        /* renamed from: c  reason: collision with root package name */
        public String f8182c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f8181b = queue;
            this.f8180a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.f8182c != null) {
                return true;
            }
            if (!this.f8181b.isEmpty()) {
                this.f8182c = this.f8181b.poll();
                return true;
            }
            do {
                String readLine = this.f8180a.readLine();
                this.f8182c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f8182c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                return null;
            }
            String str = this.f8182c;
            this.f8182c = null;
            return str;
        }
    }

    public h() {
        this(e.f8089n);
    }

    public h(e eVar) {
        this.f8179a = eVar;
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int v10 = v(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (v10 != f8133b.charAt(i10)) {
                return false;
            }
            v10 = bufferedReader.read();
        }
        return q0.t0(v(bufferedReader, false, v10));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(" + K + "|" + J + ")");
    }

    public static e.b d(ArrayList<e.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f8110d)) {
                return bVar;
            }
        }
        return null;
    }

    public static e.b e(ArrayList<e.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f8109c)) {
                return bVar;
            }
        }
        return null;
    }

    public static int g(String str, Map<String, String> map) {
        String q10 = q(str, S, map);
        if (q10 != null) {
            return Integer.parseInt(q0.S0(q10, "/")[0]);
        }
        return -1;
    }

    public static double h(String str, Pattern pattern) throws b6.j0 {
        return Double.parseDouble(t(str, pattern, Collections.emptyMap()));
    }

    @o0
    public static DrmInitData.SchemeData i(String str, String str2, Map<String, String> map) throws b6.j0 {
        String p10 = p(str, f8146h0, "1", map);
        if (H.equals(str2)) {
            String t10 = t(str, f8148i0, map);
            return new DrmInitData.SchemeData(c.A1, s.f14807e, Base64.decode(t10.substring(t10.indexOf(44)), 0));
        } else if (I.equals(str2)) {
            return new DrmInitData.SchemeData(c.A1, DownloadRequest.W, q0.m0(str));
        } else {
            if (!F.equals(str2) || !"1".equals(p10)) {
                return null;
            }
            String t11 = t(str, f8148i0, map);
            byte[] decode = Base64.decode(t11.substring(t11.indexOf(44)), 0);
            UUID uuid = c.B1;
            return new DrmInitData.SchemeData(uuid, s.f14807e, j.a(uuid, decode));
        }
    }

    public static String j(String str) {
        return (D.equals(str) || E.equals(str)) ? "cenc" : c.f4287w1;
    }

    public static int k(String str, Pattern pattern) throws b6.j0 {
        return Integer.parseInt(t(str, pattern, Collections.emptyMap()));
    }

    public static long l(String str, Pattern pattern) throws b6.j0 {
        return Long.parseLong(t(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g7.e m(g7.h.a r38, java.lang.String r39) throws java.io.IOException {
        /*
            r1 = r39
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r13 = 0
            r14 = 0
        L_0x0036:
            boolean r15 = r38.a()
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            r17 = -1
            if (r15 == 0) goto L_0x01bf
            java.lang.String r15 = r38.b()
            java.lang.String r10 = "#EXT"
            boolean r10 = r15.startsWith(r10)
            if (r10 == 0) goto L_0x004f
            r8.add(r15)
        L_0x004f:
            java.lang.String r10 = "#EXT-X-DEFINE"
            boolean r10 = r15.startsWith(r10)
            if (r10 == 0) goto L_0x0070
            java.util.regex.Pattern r10 = f8156m0
            java.lang.String r10 = t(r15, r10, r11)
            java.util.regex.Pattern r9 = f8170t0
            java.lang.String r9 = t(r15, r9, r11)
            r11.put(r10, r9)
        L_0x0066:
            r19 = r7
            r21 = r8
            r20 = r12
            r18 = r13
            goto L_0x01b5
        L_0x0070:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x007a
            r13 = 1
            goto L_0x0036
        L_0x007a:
            java.lang.String r9 = "#EXT-X-MEDIA"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x0086
            r3.add(r15)
            goto L_0x0066
        L_0x0086:
            java.lang.String r9 = "#EXT-X-SESSION-KEY"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x00c0
            java.util.regex.Pattern r9 = f8144g0
            java.lang.String r10 = "identity"
            java.lang.String r9 = p(r15, r9, r10, r11)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r9 = i(r15, r9, r11)
            if (r9 == 0) goto L_0x00ba
            java.util.regex.Pattern r10 = f8142f0
            java.lang.String r10 = t(r15, r10, r11)
            java.lang.String r10 = j(r10)
            com.google.android.exoplayer2.drm.DrmInitData r15 = new com.google.android.exoplayer2.drm.DrmInitData
            r19 = r7
            r18 = r13
            r13 = 1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r7 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r13]
            r13 = 0
            r7[r13] = r9
            r15.<init>((java.lang.String) r10, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r7)
            r12.add(r15)
            goto L_0x01b1
        L_0x00ba:
            r19 = r7
            r18 = r13
            goto L_0x01b1
        L_0x00c0:
            r19 = r7
            r18 = r13
            java.lang.String r7 = "#EXT-X-STREAM-INF"
            boolean r7 = r15.startsWith(r7)
            if (r7 == 0) goto L_0x01b1
            java.lang.String r7 = "CLOSED-CAPTIONS=NONE"
            boolean r7 = r15.contains(r7)
            r14 = r14 | r7
            java.util.regex.Pattern r7 = R
            int r7 = k(r15, r7)
            java.util.regex.Pattern r9 = M
            java.lang.String r9 = q(r15, r9, r11)
            if (r9 == 0) goto L_0x00e5
            int r7 = java.lang.Integer.parseInt(r9)
        L_0x00e5:
            java.util.regex.Pattern r9 = T
            java.lang.String r24 = q(r15, r9, r11)
            java.util.regex.Pattern r9 = U
            java.lang.String r9 = q(r15, r9, r11)
            if (r9 == 0) goto L_0x0116
            java.lang.String r10 = "x"
            java.lang.String[] r9 = r9.split(r10)
            r10 = 0
            r13 = r9[r10]
            int r10 = java.lang.Integer.parseInt(r13)
            r13 = 1
            r9 = r9[r13]
            int r9 = java.lang.Integer.parseInt(r9)
            if (r10 <= 0) goto L_0x010f
            if (r9 > 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r17 = r10
            goto L_0x0111
        L_0x010f:
            r9 = r17
        L_0x0111:
            r27 = r9
            r26 = r17
            goto L_0x011a
        L_0x0116:
            r26 = r17
            r27 = r26
        L_0x011a:
            java.util.regex.Pattern r9 = V
            java.lang.String r9 = q(r15, r9, r11)
            if (r9 == 0) goto L_0x0126
            float r16 = java.lang.Float.parseFloat(r9)
        L_0x0126:
            r28 = r16
            java.util.regex.Pattern r9 = N
            java.lang.String r9 = q(r15, r9, r11)
            java.util.regex.Pattern r10 = O
            java.lang.String r10 = q(r15, r10, r11)
            java.util.regex.Pattern r13 = P
            java.lang.String r13 = q(r15, r13, r11)
            r36 = r14
            java.util.regex.Pattern r14 = Q
            java.lang.String r14 = q(r15, r14, r11)
            java.lang.String r15 = r38.b()
            java.lang.String r15 = u(r15, r11)
            android.net.Uri r15 = w7.l0.e(r1, r15)
            int r16 = r2.size()
            java.lang.String r20 = java.lang.Integer.toString(r16)
            r21 = 0
            r23 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            java.lang.String r22 = "application/x-mpegURL"
            r25 = r7
            com.google.android.exoplayer2.Format r31 = com.google.android.exoplayer2.Format.F(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r20 = r12
            g7.e$b r12 = new g7.e$b
            r29 = r12
            r30 = r15
            r32 = r9
            r33 = r10
            r34 = r13
            r35 = r14
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r2.add(r12)
            java.lang.Object r12 = r0.get(r15)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0.put(r15, r12)
        L_0x018e:
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo r15 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo
            r21 = r8
            long r7 = (long) r7
            r29 = r15
            r30 = r7
            r32 = r9
            r33 = r10
            r34 = r13
            r35 = r14
            r29.<init>(r30, r32, r33, r34, r35)
            r12.add(r15)
            r13 = r18
            r7 = r19
            r12 = r20
            r8 = r21
            r14 = r36
            goto L_0x0036
        L_0x01b1:
            r21 = r8
            r20 = r12
        L_0x01b5:
            r13 = r18
            r7 = r19
            r12 = r20
            r8 = r21
            goto L_0x0036
        L_0x01bf:
            r19 = r7
            r21 = r8
            r20 = r12
            r18 = r13
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r13 = 0
        L_0x01d2:
            int r9 = r2.size()
            r10 = 0
            if (r13 >= r9) goto L_0x0228
            java.lang.Object r9 = r2.get(r13)
            g7.e$b r9 = (g7.e.b) r9
            android.net.Uri r12 = r9.f8107a
            boolean r12 = r8.add(r12)
            if (r12 == 0) goto L_0x021d
            com.google.android.exoplayer2.Format r12 = r9.f8108b
            com.google.android.exoplayer2.metadata.Metadata r12 = r12.U
            if (r12 != 0) goto L_0x01ef
            r12 = 1
            goto L_0x01f0
        L_0x01ef:
            r12 = 0
        L_0x01f0:
            w7.a.i(r12)
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r12 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            android.net.Uri r15 = r9.f8107a
            java.lang.Object r15 = r0.get(r15)
            java.util.List r15 = (java.util.List) r15
            r12.<init>(r10, r10, r15)
            com.google.android.exoplayer2.Format r10 = r9.f8108b
            com.google.android.exoplayer2.metadata.Metadata r15 = new com.google.android.exoplayer2.metadata.Metadata
            r22 = r0
            r38 = r8
            r0 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r8 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            r0 = 0
            r8[r0] = r12
            r15.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r8)
            com.google.android.exoplayer2.Format r0 = r10.h(r15)
            g7.e$b r0 = r9.a(r0)
            r7.add(r0)
            goto L_0x0221
        L_0x021d:
            r22 = r0
            r38 = r8
        L_0x0221:
            int r13 = r13 + 1
            r8 = r38
            r0 = r22
            goto L_0x01d2
        L_0x0228:
            r0 = r10
            r8 = r0
            r13 = 0
        L_0x022b:
            int r9 = r3.size()
            if (r13 >= r9) goto L_0x03e1
            java.lang.Object r9 = r3.get(r13)
            java.lang.String r9 = (java.lang.String) r9
            java.util.regex.Pattern r12 = f8158n0
            java.lang.String r12 = t(r9, r12, r11)
            java.util.regex.Pattern r15 = f8156m0
            java.lang.String r15 = t(r9, r15, r11)
            java.util.regex.Pattern r10 = f8148i0
            java.lang.String r10 = q(r9, r10, r11)
            if (r10 != 0) goto L_0x024d
            r10 = 0
            goto L_0x0251
        L_0x024d:
            android.net.Uri r10 = w7.l0.e(r1, r10)
        L_0x0251:
            java.util.regex.Pattern r1 = f8154l0
            java.lang.String r1 = q(r9, r1, r11)
            int r32 = s(r9)
            int r33 = r(r9, r11)
            r34 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r35 = r8
            java.lang.String r8 = ":"
            r3.append(r8)
            r3.append(r15)
            java.lang.String r22 = r3.toString()
            com.google.android.exoplayer2.metadata.Metadata r3 = new com.google.android.exoplayer2.metadata.Metadata
            r36 = r7
            r8 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r8]
            com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry r8 = new com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry
            r37 = r14
            java.util.List r14 = java.util.Collections.emptyList()
            r8.<init>(r12, r15, r14)
            r14 = 0
            r7[r14] = r8
            r3.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r7)
            java.util.regex.Pattern r7 = f8152k0
            java.lang.String r7 = t(r9, r7, r11)
            r7.hashCode()
            int r8 = r7.hashCode()
            r14 = 2
            switch(r8) {
                case -959297733: goto L_0x02c4;
                case -333210994: goto L_0x02b9;
                case 62628790: goto L_0x02ae;
                case 81665115: goto L_0x02a3;
                default: goto L_0x02a0;
            }
        L_0x02a0:
            r7 = r17
            goto L_0x02ce
        L_0x02a3:
            java.lang.String r8 = "VIDEO"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x02ac
            goto L_0x02a0
        L_0x02ac:
            r7 = 3
            goto L_0x02ce
        L_0x02ae:
            java.lang.String r8 = "AUDIO"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x02b7
            goto L_0x02a0
        L_0x02b7:
            r7 = r14
            goto L_0x02ce
        L_0x02b9:
            java.lang.String r8 = "CLOSED-CAPTIONS"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x02c2
            goto L_0x02a0
        L_0x02c2:
            r7 = 1
            goto L_0x02ce
        L_0x02c4:
            java.lang.String r8 = "SUBTITLES"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x02cd
            goto L_0x02a0
        L_0x02cd:
            r7 = 0
        L_0x02ce:
            switch(r7) {
                case 0: goto L_0x03b1;
                case 1: goto L_0x036b;
                case 2: goto L_0x0320;
                case 3: goto L_0x02d4;
                default: goto L_0x02d1;
            }
        L_0x02d1:
            r8 = 1
            goto L_0x03d2
        L_0x02d4:
            g7.e$b r1 = e(r2, r12)
            if (r1 == 0) goto L_0x02f1
            com.google.android.exoplayer2.Format r1 = r1.f8108b
            java.lang.String r7 = r1.T
            java.lang.String r7 = w7.q0.L(r7, r14)
            int r8 = r1.f5069b0
            int r9 = r1.f5070c0
            float r1 = r1.f5071d0
            r30 = r1
            r26 = r7
            r28 = r8
            r29 = r9
            goto L_0x02f9
        L_0x02f1:
            r30 = r16
            r28 = r17
            r29 = r28
            r26 = 0
        L_0x02f9:
            if (r26 == 0) goto L_0x0302
            java.lang.String r1 = w7.s.d(r26)
            r25 = r1
            goto L_0x0304
        L_0x0302:
            r25 = 0
        L_0x0304:
            r27 = -1
            r31 = 0
            java.lang.String r24 = "application/x-mpegURL"
            r23 = r15
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.F(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            com.google.android.exoplayer2.Format r1 = r1.h(r3)
            if (r10 != 0) goto L_0x0317
            goto L_0x02d1
        L_0x0317:
            g7.e$a r3 = new g7.e$a
            r3.<init>(r10, r1, r12, r15)
            r4.add(r3)
            goto L_0x02d1
        L_0x0320:
            g7.e$b r7 = d(r2, r12)
            if (r7 == 0) goto L_0x0332
            com.google.android.exoplayer2.Format r7 = r7.f8108b
            java.lang.String r7 = r7.T
            r8 = 1
            java.lang.String r7 = w7.q0.L(r7, r8)
            r26 = r7
            goto L_0x0335
        L_0x0332:
            r8 = 1
            r26 = 0
        L_0x0335:
            if (r26 == 0) goto L_0x033e
            java.lang.String r7 = w7.s.d(r26)
            r25 = r7
            goto L_0x0340
        L_0x033e:
            r25 = 0
        L_0x0340:
            int r28 = g(r9, r11)
            r27 = -1
            r29 = -1
            r30 = 0
            java.lang.String r24 = "application/x-mpegURL"
            r23 = r15
            r31 = r32
            r32 = r33
            r33 = r1
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.o(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r10 != 0) goto L_0x035e
            r35 = r1
            goto L_0x03d2
        L_0x035e:
            g7.e$a r7 = new g7.e$a
            com.google.android.exoplayer2.Format r1 = r1.h(r3)
            r7.<init>(r10, r1, r12, r15)
            r5.add(r7)
            goto L_0x03d2
        L_0x036b:
            r8 = 1
            java.util.regex.Pattern r3 = f8162p0
            java.lang.String r3 = t(r9, r3, r11)
            java.lang.String r7 = "CC"
            boolean r7 = r3.startsWith(r7)
            if (r7 == 0) goto L_0x0385
            java.lang.String r3 = r3.substring(r14)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r7 = "application/cea-608"
            goto L_0x0390
        L_0x0385:
            r7 = 7
            java.lang.String r3 = r3.substring(r7)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r7 = "application/cea-708"
        L_0x0390:
            r31 = r3
            r25 = r7
            if (r0 != 0) goto L_0x039b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x039b:
            r24 = 0
            r26 = 0
            r27 = -1
            r23 = r15
            r28 = r32
            r29 = r33
            r30 = r1
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.y(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.add(r1)
            goto L_0x03d2
        L_0x03b1:
            r8 = 1
            r26 = 0
            r27 = -1
            java.lang.String r24 = "application/x-mpegURL"
            java.lang.String r25 = "text/vtt"
            r23 = r15
            r28 = r32
            r29 = r33
            r30 = r1
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.x(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.google.android.exoplayer2.Format r1 = r1.h(r3)
            g7.e$a r3 = new g7.e$a
            r3.<init>(r10, r1, r12, r15)
            r6.add(r3)
        L_0x03d2:
            int r13 = r13 + 1
            r1 = r39
            r3 = r34
            r8 = r35
            r7 = r36
            r14 = r37
            r10 = 0
            goto L_0x022b
        L_0x03e1:
            r36 = r7
            r35 = r8
            r37 = r14
            if (r37 == 0) goto L_0x03ed
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x03ed:
            r9 = r0
            g7.e r13 = new g7.e
            r0 = r13
            r1 = r39
            r2 = r21
            r3 = r36
            r7 = r19
            r8 = r35
            r10 = r18
            r12 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h.m(g7.h$a, java.lang.String):g7.e");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v30, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0141, code lost:
        if (r8 != null) goto L_0x0150;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g7.f n(g7.e r64, g7.h.a r65, java.lang.String r66) throws java.io.IOException {
        /*
            r0 = r64
            boolean r1 = r0.f8131c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r7 = ""
            r13 = 0
            r14 = 1
            r26 = r1
            r16 = r4
            r24 = r16
            r37 = r7
            r1 = r13
            r4 = r1
            r20 = r4
            r27 = r20
            r45 = r27
            r49 = r45
            r23 = r14
            r5 = 0
            r12 = 0
            r18 = 0
            r21 = 0
            r28 = 0
            r29 = 0
            r38 = 0
            r40 = 0
            r46 = 0
            r47 = -1
            r50 = 0
            r52 = 0
        L_0x004b:
            r53 = 0
        L_0x004d:
            boolean r31 = r65.a()
            if (r31 == 0) goto L_0x0322
            java.lang.String r8 = r65.b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0062
            r6.add(r8)
        L_0x0062:
            java.lang.String r9 = "#EXT-X-PLAYLIST-TYPE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0084
            java.util.regex.Pattern r9 = Y
            java.lang.String r8 = t(r8, r9, r2)
            java.lang.String r9 = "VOD"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x007a
            r4 = r14
            goto L_0x004d
        L_0x007a:
            java.lang.String r9 = "EVENT"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x004d
            r4 = 2
            goto L_0x004d
        L_0x0084:
            java.lang.String r9 = "#EXT-X-START"
            boolean r9 = r8.startsWith(r9)
            r31 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r9 == 0) goto L_0x009d
            java.util.regex.Pattern r9 = f8136c0
            double r8 = h(r8, r9)
            double r8 = r8 * r31
            long r8 = (long) r8
            r16 = r8
            goto L_0x004d
        L_0x009d:
            java.lang.String r9 = "#EXT-X-MAP"
            boolean r9 = r8.startsWith(r9)
            java.lang.String r10 = "@"
            if (r9 == 0) goto L_0x00f2
            java.util.regex.Pattern r9 = f8148i0
            java.lang.String r9 = t(r8, r9, r2)
            java.util.regex.Pattern r11 = f8140e0
            java.lang.String r8 = q(r8, r11, r2)
            if (r8 == 0) goto L_0x00cd
            java.lang.String[] r8 = r8.split(r10)
            r10 = r8[r13]
            long r10 = java.lang.Long.parseLong(r10)
            int r13 = r8.length
            if (r13 <= r14) goto L_0x00c8
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
        L_0x00c8:
            r33 = r10
            r31 = r29
            goto L_0x00d1
        L_0x00cd:
            r31 = r29
            r33 = r47
        L_0x00d1:
            if (r5 == 0) goto L_0x00de
            if (r46 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            b6.j0 r0 = new b6.j0
            java.lang.String r1 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00de:
            g7.f$b r52 = new g7.f$b
            r29 = r52
            r30 = r9
            r35 = r5
            r36 = r46
            r29.<init>(r30, r31, r33, r35, r36)
            r13 = 0
            r29 = 0
            r47 = -1
            goto L_0x004d
        L_0x00f2:
            java.lang.String r9 = "#EXT-X-TARGETDURATION"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0109
            java.util.regex.Pattern r9 = W
            int r8 = k(r8, r9)
            long r8 = (long) r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r24 = r8 * r10
        L_0x0106:
            r13 = 0
            goto L_0x004d
        L_0x0109:
            java.lang.String r9 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x011a
            java.util.regex.Pattern r9 = Z
            long r38 = l(r8, r9)
            r21 = r38
            goto L_0x0106
        L_0x011a:
            java.lang.String r9 = "#EXT-X-VERSION"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0129
            java.util.regex.Pattern r9 = X
            int r23 = k(r8, r9)
            goto L_0x0106
        L_0x0129:
            java.lang.String r9 = "#EXT-X-DEFINE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x015c
            java.util.regex.Pattern r9 = f8172u0
            java.lang.String r9 = q(r8, r9, r2)
            if (r9 == 0) goto L_0x0144
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.f8101l
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0153
            goto L_0x0150
        L_0x0144:
            java.util.regex.Pattern r9 = f8156m0
            java.lang.String r9 = t(r8, r9, r2)
            java.util.regex.Pattern r10 = f8170t0
            java.lang.String r8 = t(r8, r10, r2)
        L_0x0150:
            r2.put(r9, r8)
        L_0x0153:
            r57 = r3
            r61 = r7
            r11 = 0
            r55 = -1
            goto L_0x0318
        L_0x015c:
            java.lang.String r9 = "#EXTINF"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0176
            java.util.regex.Pattern r9 = f8132a0
            double r9 = h(r8, r9)
            double r9 = r9 * r31
            long r9 = (long) r9
            java.util.regex.Pattern r11 = f8134b0
            java.lang.String r37 = p(r8, r11, r7, r2)
            r53 = r9
            goto L_0x0106
        L_0x0176:
            java.lang.String r9 = "#EXT-X-KEY"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x01d8
            java.util.regex.Pattern r5 = f8142f0
            java.lang.String r5 = t(r8, r5, r2)
            java.util.regex.Pattern r9 = f8144g0
            java.lang.String r10 = "identity"
            java.lang.String r9 = p(r8, r9, r10, r2)
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x019e
            r3.clear()
            r5 = 0
            r40 = 0
            r46 = 0
            goto L_0x0106
        L_0x019e:
            java.util.regex.Pattern r11 = f8150j0
            java.lang.String r11 = q(r8, r11, r2)
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x01c1
            java.lang.String r9 = "AES-128"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x01bc
            java.util.regex.Pattern r5 = f8148i0
            java.lang.String r5 = t(r8, r5, r2)
            r46 = r11
            goto L_0x0106
        L_0x01bc:
            r46 = r11
            r5 = 0
            goto L_0x0106
        L_0x01c1:
            if (r12 != 0) goto L_0x01c8
            java.lang.String r5 = j(r5)
            r12 = r5
        L_0x01c8:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r5 = i(r8, r9, r2)
            if (r5 == 0) goto L_0x01bc
            r3.put(r9, r5)
            r46 = r11
            r5 = 0
            r40 = 0
            goto L_0x0106
        L_0x01d8:
            java.lang.String r9 = "#EXT-X-BYTERANGE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x01fc
            java.util.regex.Pattern r9 = f8138d0
            java.lang.String r8 = t(r8, r9, r2)
            java.lang.String[] r8 = r8.split(r10)
            r9 = 0
            r10 = r8[r9]
            long r47 = java.lang.Long.parseLong(r10)
            int r9 = r8.length
            if (r9 <= r14) goto L_0x0106
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
            goto L_0x0106
        L_0x01fc:
            java.lang.String r9 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r9 = r8.startsWith(r9)
            r10 = 58
            if (r9 == 0) goto L_0x0216
            int r1 = r8.indexOf(r10)
            int r1 = r1 + r14
            java.lang.String r1 = r8.substring(r1)
            int r20 = java.lang.Integer.parseInt(r1)
            r1 = r14
            goto L_0x0106
        L_0x0216:
            java.lang.String r9 = "#EXT-X-DISCONTINUITY"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0222
            int r49 = r49 + 1
            goto L_0x0106
        L_0x0222:
            java.lang.String r9 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0245
            r31 = 0
            int r9 = (r18 > r31 ? 1 : (r18 == r31 ? 0 : -1))
            if (r9 != 0) goto L_0x0153
            int r9 = r8.indexOf(r10)
            int r9 = r9 + r14
            java.lang.String r8 = r8.substring(r9)
            long r8 = w7.q0.F0(r8)
            long r8 = b6.c.b(r8)
            long r18 = r8 - r50
            goto L_0x0106
        L_0x0245:
            java.lang.String r9 = "#EXT-X-GAP"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0251
            r45 = r14
            goto L_0x0106
        L_0x0251:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x025d
            r26 = r14
            goto L_0x0106
        L_0x025d:
            java.lang.String r9 = "#EXT-X-ENDLIST"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0269
            r27 = r14
            goto L_0x0106
        L_0x0269:
            java.lang.String r9 = "#"
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L_0x0153
            if (r5 != 0) goto L_0x0275
            r9 = 0
            goto L_0x027e
        L_0x0275:
            if (r46 == 0) goto L_0x027a
            r9 = r46
            goto L_0x027e
        L_0x027a:
            java.lang.String r9 = java.lang.Long.toHexString(r38)
        L_0x027e:
            r10 = 1
            long r10 = r38 + r10
            r55 = -1
            int r13 = (r47 > r55 ? 1 : (r47 == r55 ? 0 : -1))
            if (r13 != 0) goto L_0x028b
            r58 = 0
            goto L_0x028d
        L_0x028b:
            r58 = r29
        L_0x028d:
            if (r40 != 0) goto L_0x02d1
            boolean r29 = r3.isEmpty()
            if (r29 != 0) goto L_0x02d1
            java.util.Collection r14 = r3.values()
            r57 = r3
            r0 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            java.lang.Object[] r3 = r14.toArray(r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            r14.<init>((java.lang.String) r12, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3)
            if (r28 != 0) goto L_0x02cb
            int r0 = r3.length
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r0]
            r61 = r7
            r62 = r10
            r7 = 0
        L_0x02b3:
            int r10 = r3.length
            if (r7 >= r10) goto L_0x02c2
            r10 = r3[r7]
            r11 = 0
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r10 = r10.c(r11)
            r0[r7] = r10
            int r7 = r7 + 1
            goto L_0x02b3
        L_0x02c2:
            r11 = 0
            com.google.android.exoplayer2.drm.DrmInitData r3 = new com.google.android.exoplayer2.drm.DrmInitData
            r3.<init>((java.lang.String) r12, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r0)
            r28 = r3
            goto L_0x02da
        L_0x02cb:
            r61 = r7
            r62 = r10
            r11 = 0
            goto L_0x02da
        L_0x02d1:
            r57 = r3
            r61 = r7
            r62 = r10
            r11 = 0
            r14 = r40
        L_0x02da:
            g7.f$b r0 = new g7.f$b
            r29 = r0
            java.lang.String r30 = u(r8, r2)
            r31 = r52
            r32 = r37
            r33 = r53
            r35 = r49
            r36 = r50
            r38 = r14
            r39 = r5
            r40 = r9
            r41 = r58
            r43 = r47
            r29.<init>(r30, r31, r32, r33, r35, r36, r38, r39, r40, r41, r43, r45)
            r15.add(r0)
            long r50 = r50 + r53
            if (r13 == 0) goto L_0x0302
            long r58 = r58 + r47
        L_0x0302:
            r29 = r58
            r0 = r64
            r40 = r14
            r47 = r55
            r3 = r57
            r7 = r61
            r37 = r7
            r38 = r62
            r13 = 0
            r14 = 1
            r45 = 0
            goto L_0x004b
        L_0x0318:
            r0 = r64
            r3 = r57
            r7 = r61
            r13 = 0
            r14 = 1
            goto L_0x004d
        L_0x0322:
            g7.f r0 = new g7.f
            r2 = 0
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x032d
            r60 = 1
            goto L_0x032f
        L_0x032d:
            r60 = 0
        L_0x032f:
            r3 = r0
            r5 = r66
            r7 = r16
            r9 = r18
            r11 = r1
            r12 = r20
            r13 = r21
            r1 = r15
            r15 = r23
            r16 = r24
            r18 = r26
            r19 = r27
            r20 = r60
            r21 = r28
            r22 = r1
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h.n(g7.e, g7.h$a, java.lang.String):g7.f");
    }

    public static boolean o(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals(J) : z10;
    }

    public static String p(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : u(str2, map);
    }

    @o0
    public static String q(String str, Pattern pattern, Map<String, String> map) {
        return p(str, pattern, (String) null, map);
    }

    public static int r(String str, Map<String, String> map) {
        String q10 = q(str, f8160o0, map);
        int i10 = 0;
        if (TextUtils.isEmpty(q10)) {
            return 0;
        }
        String[] R0 = q0.R0(q10, ",");
        if (q0.w(R0, "public.accessibility.describes-video")) {
            i10 = 512;
        }
        if (q0.w(R0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (q0.w(R0, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return q0.w(R0, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    public static int s(String str) {
        boolean o10 = o(str, f8166r0, false);
        if (o(str, f8168s0, false)) {
            o10 |= true;
        }
        return o(str, f8164q0, false) ? o10 | true ? 1 : 0 : o10 ? 1 : 0;
    }

    public static String t(String str, Pattern pattern, Map<String, String> map) throws b6.j0 {
        String q10 = q(str, pattern, map);
        if (q10 != null) {
            return q10;
        }
        throw new b6.j0("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String u(String str, Map<String, String> map) {
        Matcher matcher = f8174v0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int v(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !q0.t0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    /* renamed from: f */
    public g a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith(f8143g)) {
                                if (trim.startsWith(f8147i) || trim.startsWith(f8161p) || trim.startsWith(f8159o) || trim.startsWith(f8167s) || trim.startsWith(f8171u) || trim.equals(f8149j) || trim.equals(f8151k)) {
                                    break;
                                } else if (trim.equals(f8165r)) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                e m10 = m(new a(arrayDeque, bufferedReader), uri.toString());
                                q0.q(bufferedReader);
                                return m10;
                            }
                        }
                    } else {
                        q0.q(bufferedReader);
                        throw new b6.j0("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return n(this.f8179a, new a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new y0("Input does not start with the #EXTM3U header.", uri);
        } finally {
            q0.q(bufferedReader);
        }
    }
}
