package og;

import dg.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class l {
    public static final l A = d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final l A0 = d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final l B = d("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final l B0 = d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final l C = d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final l C0 = d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final l D = d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final l D0 = d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final l E = d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final l E0 = d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final l F = d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final l F0 = d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final l G = d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final l G0 = d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final l H = d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final l H0 = d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final l I = d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final l I0 = d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final l J = d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final l J0 = d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final l K = d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final l K0 = d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final l L = d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final l L0 = d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final l M = d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final l M0 = d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final l N = d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final l N0 = d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final l O = d("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final l O0 = d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final l P = d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final l P0 = d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final l Q = d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final l Q0 = d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final l R = d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final l R0 = d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final l S = d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final l S0 = d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final l T = d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final l T0 = d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final l U = d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final l U0 = d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final l V = d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final l V0 = d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final l W = d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final l W0 = d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final l X = d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final l X0 = d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final l Y = d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final l Y0 = d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final l Z = d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final l Z0 = d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a0  reason: collision with root package name */
    public static final l f21642a0 = d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: a1  reason: collision with root package name */
    public static final l f21643a1 = d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<String> f21644b = new k();

    /* renamed from: b0  reason: collision with root package name */
    public static final l f21645b0 = d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: b1  reason: collision with root package name */
    public static final l f21646b1 = d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, l> f21647c = new LinkedHashMap();

    /* renamed from: c0  reason: collision with root package name */
    public static final l f21648c0 = d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: c1  reason: collision with root package name */
    public static final l f21649c1 = d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d  reason: collision with root package name */
    public static final l f21650d = d("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: d0  reason: collision with root package name */
    public static final l f21651d0 = d("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: d1  reason: collision with root package name */
    public static final l f21652d1 = d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e  reason: collision with root package name */
    public static final l f21653e = d("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: e0  reason: collision with root package name */
    public static final l f21654e0 = d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: e1  reason: collision with root package name */
    public static final l f21655e1 = d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f  reason: collision with root package name */
    public static final l f21656f = d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: f0  reason: collision with root package name */
    public static final l f21657f0 = d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: f1  reason: collision with root package name */
    public static final l f21658f1 = d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g  reason: collision with root package name */
    public static final l f21659g = d("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: g0  reason: collision with root package name */
    public static final l f21660g0 = d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: g1  reason: collision with root package name */
    public static final l f21661g1 = d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h  reason: collision with root package name */
    public static final l f21662h = d("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: h0  reason: collision with root package name */
    public static final l f21663h0 = d("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: h1  reason: collision with root package name */
    public static final l f21664h1 = d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i  reason: collision with root package name */
    public static final l f21665i = d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: i0  reason: collision with root package name */
    public static final l f21666i0 = d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: i1  reason: collision with root package name */
    public static final l f21667i1 = d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j  reason: collision with root package name */
    public static final l f21668j = d("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: j0  reason: collision with root package name */
    public static final l f21669j0 = d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: j1  reason: collision with root package name */
    public static final l f21670j1 = d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k  reason: collision with root package name */
    public static final l f21671k = d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: k0  reason: collision with root package name */
    public static final l f21672k0 = d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: k1  reason: collision with root package name */
    public static final l f21673k1 = d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l  reason: collision with root package name */
    public static final l f21674l = d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: l0  reason: collision with root package name */
    public static final l f21675l0 = d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: l1  reason: collision with root package name */
    public static final l f21676l1 = d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m  reason: collision with root package name */
    public static final l f21677m = d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: m0  reason: collision with root package name */
    public static final l f21678m0 = d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", a.f18075ld);

    /* renamed from: m1  reason: collision with root package name */
    public static final l f21679m1 = d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n  reason: collision with root package name */
    public static final l f21680n = d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: n0  reason: collision with root package name */
    public static final l f21681n0 = d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: n1  reason: collision with root package name */
    public static final l f21682n1 = d("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o  reason: collision with root package name */
    public static final l f21683o = d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: o0  reason: collision with root package name */
    public static final l f21684o0 = d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", a.f18329xd);

    /* renamed from: o1  reason: collision with root package name */
    public static final l f21685o1 = d("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p  reason: collision with root package name */
    public static final l f21686p = d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: p0  reason: collision with root package name */
    public static final l f21687p0 = d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: p1  reason: collision with root package name */
    public static final l f21688p1 = d("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q  reason: collision with root package name */
    public static final l f21689q = d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: q0  reason: collision with root package name */
    public static final l f21690q0 = d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: q1  reason: collision with root package name */
    public static final l f21691q1 = d("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r  reason: collision with root package name */
    public static final l f21692r = d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: r0  reason: collision with root package name */
    public static final l f21693r0 = d("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: r1  reason: collision with root package name */
    public static final l f21694r1 = d("TLS_AES_128_CCM_8_SHA256", 4869);

    /* renamed from: s  reason: collision with root package name */
    public static final l f21695s = d("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: s0  reason: collision with root package name */
    public static final l f21696s0 = d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t  reason: collision with root package name */
    public static final l f21697t = d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: t0  reason: collision with root package name */
    public static final l f21698t0 = d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u  reason: collision with root package name */
    public static final l f21699u = d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: u0  reason: collision with root package name */
    public static final l f21700u0 = d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v  reason: collision with root package name */
    public static final l f21701v = d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: v0  reason: collision with root package name */
    public static final l f21702v0 = d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w  reason: collision with root package name */
    public static final l f21703w = d("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: w0  reason: collision with root package name */
    public static final l f21704w0 = d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x  reason: collision with root package name */
    public static final l f21705x = d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: x0  reason: collision with root package name */
    public static final l f21706x0 = d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y  reason: collision with root package name */
    public static final l f21707y = d("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: y0  reason: collision with root package name */
    public static final l f21708y0 = d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z  reason: collision with root package name */
    public static final l f21709z = d("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: z0  reason: collision with root package name */
    public static final l f21710z0 = d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: a  reason: collision with root package name */
    public final String f21711a;

    public l(String str) {
        str.getClass();
        this.f21711a = str;
    }

    public static synchronized l b(String str) {
        l lVar;
        synchronized (l.class) {
            Map<String, l> map = f21647c;
            lVar = map.get(str);
            if (lVar == null) {
                lVar = map.get(g(str));
                if (lVar == null) {
                    lVar = new l(str);
                }
                map.put(str, lVar);
            }
        }
        return lVar;
    }

    public static List<l> c(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(b(b10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static l d(String str, int i10) {
        l lVar = new l(str);
        f21647c.put(str, lVar);
        return lVar;
    }

    public static /* synthetic */ int f(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i10 = 4; i10 < min; i10++) {
            char charAt = str.charAt(i10);
            char charAt2 = str2.charAt(i10);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    public static String g(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    public String e() {
        return this.f21711a;
    }

    public String toString() {
        return this.f21711a;
    }
}
