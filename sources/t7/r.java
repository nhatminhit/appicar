package t7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import d.o0;
import g7.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t7.d;
import w7.e0;
import w7.i;
import w7.q0;
import xa.k;

public final class r implements d, r0 {

    /* renamed from: p  reason: collision with root package name */
    public static final Map<String, int[]> f13159p = k();

    /* renamed from: q  reason: collision with root package name */
    public static final long[] f13160q = {5400000, 3400000, 1900000, 1100000, 400000};

    /* renamed from: r  reason: collision with root package name */
    public static final long[] f13161r = {170000, 139000, 122000, 107000, 90000};

    /* renamed from: s  reason: collision with root package name */
    public static final long[] f13162s = {2100000, 1300000, 960000, 770000, 450000};

    /* renamed from: t  reason: collision with root package name */
    public static final long[] f13163t = {6000000, 3400000, 2100000, 1400000, 570000};

    /* renamed from: u  reason: collision with root package name */
    public static final long f13164u = 1000000;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13165v = 2000;

    /* renamed from: w  reason: collision with root package name */
    public static final int f13166w = 2000;

    /* renamed from: x  reason: collision with root package name */
    public static final int f13167x = 524288;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Context f13168a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Long> f13169b;

    /* renamed from: c  reason: collision with root package name */
    public final i<d.a> f13170c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f13171d;

    /* renamed from: e  reason: collision with root package name */
    public final w7.c f13172e;

    /* renamed from: f  reason: collision with root package name */
    public int f13173f;

    /* renamed from: g  reason: collision with root package name */
    public long f13174g;

    /* renamed from: h  reason: collision with root package name */
    public long f13175h;

    /* renamed from: i  reason: collision with root package name */
    public int f13176i;

    /* renamed from: j  reason: collision with root package name */
    public long f13177j;

    /* renamed from: k  reason: collision with root package name */
    public long f13178k;

    /* renamed from: l  reason: collision with root package name */
    public long f13179l;

    /* renamed from: m  reason: collision with root package name */
    public long f13180m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13181n;

    /* renamed from: o  reason: collision with root package name */
    public int f13182o;

    public static final class b {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Context f13183a;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<Long> f13184b;

        /* renamed from: c  reason: collision with root package name */
        public int f13185c;

        /* renamed from: d  reason: collision with root package name */
        public w7.c f13186d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f13187e;

        public b(Context context) {
            this.f13183a = context == null ? null : context.getApplicationContext();
            this.f13184b = d(q0.N(context));
            this.f13185c = 2000;
            this.f13186d = w7.c.f14695a;
        }

        public static int[] c(String str) {
            int[] iArr = r.f13159p.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }

        public static SparseArray<Long> d(String str) {
            int[] c10 = c(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            long[] jArr = r.f13160q;
            sparseArray.append(2, Long.valueOf(jArr[c10[0]]));
            sparseArray.append(3, Long.valueOf(r.f13161r[c10[1]]));
            sparseArray.append(4, Long.valueOf(r.f13162s[c10[2]]));
            sparseArray.append(5, Long.valueOf(r.f13163t[c10[3]]));
            sparseArray.append(7, Long.valueOf(jArr[c10[0]]));
            return sparseArray;
        }

        public r a() {
            return new r(this.f13183a, this.f13184b, this.f13185c, this.f13186d, this.f13187e);
        }

        public b b(boolean z10) {
            this.f13187e = z10;
            return this;
        }

        public b e(w7.c cVar) {
            this.f13186d = cVar;
            return this;
        }

        public b f(int i10, long j10) {
            this.f13184b.put(i10, Long.valueOf(j10));
            return this;
        }

        public b g(long j10) {
            for (int i10 = 0; i10 < this.f13184b.size(); i10++) {
                this.f13184b.setValueAt(i10, Long.valueOf(j10));
            }
            return this;
        }

        public b h(String str) {
            this.f13184b = d(q0.Z0(str));
            return this;
        }

        public b i(int i10) {
            this.f13185c = i10;
            return this;
        }
    }

    public static class c extends BroadcastReceiver {

        /* renamed from: c  reason: collision with root package name */
        public static c f13188c;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f13189a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<WeakReference<r>> f13190b = new ArrayList<>();

        public static synchronized c b(Context context) {
            c cVar;
            synchronized (c.class) {
                if (f13188c == null) {
                    f13188c = new c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f13188c, intentFilter);
                }
                cVar = f13188c;
            }
            return cVar;
        }

        public synchronized void d(r rVar) {
            e();
            this.f13190b.add(new WeakReference(rVar));
            this.f13189a.post(new s(this, rVar));
        }

        public final void e() {
            for (int size = this.f13190b.size() - 1; size >= 0; size--) {
                if (((r) this.f13190b.get(size).get()) == null) {
                    this.f13190b.remove(size);
                }
            }
        }

        /* renamed from: f */
        public final void c(r rVar) {
            rVar.o();
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                e();
                for (int i10 = 0; i10 < this.f13190b.size(); i10++) {
                    r rVar = (r) this.f13190b.get(i10).get();
                    if (rVar != null) {
                        c(rVar);
                    }
                }
            }
        }
    }

    @Deprecated
    public r() {
        this((Context) null, new SparseArray(), 2000, w7.c.f14695a, false);
    }

    public r(@o0 Context context, SparseArray<Long> sparseArray, int i10, w7.c cVar, boolean z10) {
        this.f13168a = context == null ? null : context.getApplicationContext();
        this.f13169b = sparseArray;
        this.f13170c = new i<>();
        this.f13171d = new e0(i10);
        this.f13172e = cVar;
        int X = context == null ? 0 : q0.X(context);
        this.f13176i = X;
        this.f13179l = l(X);
        if (context != null && z10) {
            c.b(context).d(this);
        }
    }

    public static Map<String, int[]> k() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 0, 0, 1});
        hashMap.put("AE", new int[]{1, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{3, 2, 1, 1});
        hashMap.put("AI", new int[]{1, 0, 1, 3});
        hashMap.put("AL", new int[]{1, 2, 1, 1});
        hashMap.put("AM", new int[]{2, 2, 3, 2});
        hashMap.put("AO", new int[]{3, 4, 2, 0});
        hashMap.put("AQ", new int[]{4, 2, 2, 2});
        hashMap.put("AR", new int[]{2, 3, 2, 2});
        hashMap.put("AS", new int[]{3, 3, 4, 1});
        hashMap.put("AT", new int[]{0, 2, 0, 0});
        hashMap.put("AU", new int[]{0, 1, 1, 1});
        hashMap.put("AW", new int[]{1, 1, 0, 2});
        hashMap.put("AX", new int[]{0, 2, 1, 0});
        hashMap.put("AZ", new int[]{3, 3, 2, 2});
        hashMap.put("BA", new int[]{1, 1, 1, 2});
        hashMap.put("BB", new int[]{0, 1, 0, 0});
        hashMap.put("BD", new int[]{2, 2, 3, 2});
        hashMap.put("BE", new int[]{0, 0, 0, 1});
        hashMap.put("BF", new int[]{4, 4, 3, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 3, 4, 4});
        hashMap.put("BJ", new int[]{4, 3, 4, 4});
        hashMap.put("BL", new int[]{1, 0, 2, 3});
        hashMap.put("BM", new int[]{1, 0, 0, 0});
        hashMap.put("BN", new int[]{4, 2, 3, 3});
        hashMap.put("BO", new int[]{2, 2, 3, 2});
        hashMap.put("BQ", new int[]{1, 0, 3, 4});
        hashMap.put("BR", new int[]{2, 3, 3, 2});
        hashMap.put("BS", new int[]{2, 0, 1, 4});
        hashMap.put("BT", new int[]{3, 0, 2, 1});
        hashMap.put("BW", new int[]{4, 4, 1, 2});
        hashMap.put("BY", new int[]{0, 1, 1, 2});
        hashMap.put("BZ", new int[]{2, 2, 3, 1});
        hashMap.put("CA", new int[]{0, 3, 3, 3});
        hashMap.put("CD", new int[]{4, 4, 3, 2});
        hashMap.put("CF", new int[]{4, 3, 3, 4});
        hashMap.put("CG", new int[]{4, 4, 4, 4});
        hashMap.put("CH", new int[]{0, 0, 1, 1});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 4, 1, 0});
        hashMap.put("CL", new int[]{2, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 2, 1});
        hashMap.put("CN", new int[]{2, 2, 2, 3});
        hashMap.put("CO", new int[]{2, 3, 2, 2});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 3, 1});
        hashMap.put("CV", new int[]{2, 3, 2, 4});
        hashMap.put("CW", new int[]{1, 0, 0, 0});
        hashMap.put("CX", new int[]{2, 2, 2, 2});
        hashMap.put("CY", new int[]{1, 1, 1, 1});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 2, 2, 2});
        hashMap.put("DJ", new int[]{3, 3, 4, 0});
        hashMap.put("DK", new int[]{0, 0, 0, 0});
        hashMap.put("DM", new int[]{1, 0, 0, 3});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 4, 4, 2});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 2});
        hashMap.put("EH", new int[]{2, 0, 3, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 2});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 1, 3, 3});
        hashMap.put("FK", new int[]{4, 2, 2, 3});
        hashMap.put("FM", new int[]{4, 2, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 0});
        hashMap.put("FR", new int[]{1, 0, 3, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 1});
        hashMap.put("GB", new int[]{0, 1, 3, 3});
        hashMap.put("GD", new int[]{2, 0, 4, 4});
        hashMap.put("GE", new int[]{1, 1, 0, 3});
        hashMap.put("GF", new int[]{1, 2, 4, 4});
        hashMap.put("GG", new int[]{0, 0, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 3, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 2, 3, 4});
        hashMap.put("GM", new int[]{4, 3, 3, 2});
        hashMap.put("GN", new int[]{4, 4, 4, 0});
        hashMap.put("GP", new int[]{2, 2, 1, 3});
        hashMap.put("GQ", new int[]{4, 3, 3, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 3, 3, 4});
        hashMap.put("GU", new int[]{1, 2, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 0});
        hashMap.put("GY", new int[]{3, 4, 1, 0});
        hashMap.put("HK", new int[]{0, 1, 4, 4});
        hashMap.put("HN", new int[]{3, 3, 2, 2});
        hashMap.put("HR", new int[]{1, 0, 0, 2});
        hashMap.put("HT", new int[]{3, 4, 4, 3});
        hashMap.put("HU", new int[]{0, 0, 1, 0});
        hashMap.put("ID", new int[]{3, 2, 3, 4});
        hashMap.put("IE", new int[]{0, 0, 3, 2});
        hashMap.put("IL", new int[]{0, 1, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 4});
        hashMap.put("IO", new int[]{4, 4, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 4});
        hashMap.put("IR", new int[]{1, 0, 1, 0});
        hashMap.put("IS", new int[]{0, 0, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 1});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 2, 2, 1});
        hashMap.put("JO", new int[]{1, 1, 1, 2});
        hashMap.put("JP", new int[]{0, 2, 2, 2});
        hashMap.put("KE", new int[]{3, 3, 3, 3});
        hashMap.put(k.f24444q, new int[]{1, 1, 2, 3});
        hashMap.put("KH", new int[]{2, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 4, 3, 3});
        hashMap.put("KN", new int[]{1, 0, 1, 4});
        hashMap.put("KP", new int[]{1, 2, 0, 2});
        hashMap.put("KR", new int[]{0, 3, 0, 2});
        hashMap.put("KW", new int[]{2, 2, 1, 2});
        hashMap.put("KY", new int[]{1, 1, 0, 2});
        hashMap.put("KZ", new int[]{1, 2, 2, 2});
        hashMap.put("LA", new int[]{2, 1, 1, 0});
        hashMap.put(k.f24445r, new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{2, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 2, 2});
        hashMap.put("LK", new int[]{1, 1, 2, 2});
        hashMap.put("LR", new int[]{3, 4, 4, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 1, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 3, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 2});
        hashMap.put("MC", new int[]{1, 0, 1, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 2, 3});
        hashMap.put("MF", new int[]{1, 4, 2, 1});
        hashMap.put("MG", new int[]{3, 4, 1, 3});
        hashMap.put("MH", new int[]{4, 0, 2, 3});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 4, 3});
        hashMap.put("MM", new int[]{2, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 3, 2, 4});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 4, 4});
        hashMap.put("MQ", new int[]{1, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 4, 4, 4});
        hashMap.put("MS", new int[]{1, 4, 0, 3});
        hashMap.put("MT", new int[]{0, 1, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 3, 4});
        hashMap.put("MV", new int[]{3, 2, 1, 1});
        hashMap.put("MW", new int[]{4, 2, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 2});
        hashMap.put("MY", new int[]{2, 2, 2, 3});
        hashMap.put("MZ", new int[]{3, 4, 2, 2});
        hashMap.put("NA", new int[]{3, 2, 2, 1});
        hashMap.put("NC", new int[]{2, 1, 3, 2});
        hashMap.put("NE", new int[]{4, 4, 4, 3});
        hashMap.put("NF", new int[]{1, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 3, 2});
        hashMap.put("NI", new int[]{3, 3, 3, 4});
        hashMap.put("NL", new int[]{0, 2, 4, 3});
        hashMap.put(h.K, new int[]{0, 1, 0, 0});
        hashMap.put("NP", new int[]{3, 3, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 4, 0});
        hashMap.put("NU", new int[]{2, 2, 2, 1});
        hashMap.put("NZ", new int[]{0, 0, 0, 1});
        hashMap.put("OM", new int[]{2, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 3, 4});
        hashMap.put("PE", new int[]{2, 3, 4, 4});
        hashMap.put("PF", new int[]{3, 1, 0, 1});
        hashMap.put("PG", new int[]{4, 3, 1, 1});
        hashMap.put("PH", new int[]{3, 0, 4, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 1, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 0, 0});
        hashMap.put("PR", new int[]{2, 1, 3, 3});
        hashMap.put("PS", new int[]{3, 3, 1, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 1});
        hashMap.put("PW", new int[]{2, 2, 1, 1});
        hashMap.put("PY", new int[]{3, 1, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 0, 1});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{3, 4, 2, 4});
        hashMap.put("SA", new int[]{2, 2, 1, 2});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 2});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{1, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 4, 2, 3});
        hashMap.put("SI", new int[]{0, 1, 0, 1});
        hashMap.put("SJ", new int[]{0, 0, 2, 0});
        hashMap.put("SK", new int[]{0, 1, 0, 1});
        hashMap.put("SL", new int[]{4, 3, 2, 4});
        hashMap.put("SM", new int[]{0, 0, 1, 3});
        hashMap.put("SN", new int[]{4, 4, 4, 3});
        hashMap.put("SO", new int[]{4, 4, 4, 4});
        hashMap.put("SR", new int[]{3, 2, 2, 4});
        hashMap.put("SS", new int[]{4, 2, 4, 2});
        hashMap.put("ST", new int[]{3, 4, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 3, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 4, 1, 0});
        hashMap.put("SZ", new int[]{3, 4, 2, 3});
        hashMap.put("TC", new int[]{1, 1, 3, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 3, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 2, 3});
        hashMap.put("TN", new int[]{2, 1, 1, 1});
        hashMap.put("TO", new int[]{3, 3, 3, 1});
        hashMap.put("TR", new int[]{1, 2, 0, 1});
        hashMap.put("TT", new int[]{2, 3, 1, 2});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 1});
        hashMap.put("TZ", new int[]{3, 3, 4, 3});
        hashMap.put("UA", new int[]{0, 2, 1, 2});
        hashMap.put("UG", new int[]{4, 3, 2, 3});
        hashMap.put("US", new int[]{0, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 2, 2, 2});
        hashMap.put("UZ", new int[]{3, 2, 2, 2});
        hashMap.put("VA", new int[]{1, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 1, 0, 0});
        hashMap.put("VE", new int[]{4, 4, 4, 3});
        hashMap.put("VG", new int[]{2, 1, 1, 2});
        hashMap.put("VI", new int[]{1, 0, 2, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 1});
        hashMap.put("WS", new int[]{3, 2, 3, 1});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 2});
        hashMap.put("YT", new int[]{2, 0, 2, 3});
        hashMap.put("ZA", new int[]{2, 3, 2, 2});
        hashMap.put("ZM", new int[]{3, 3, 2, 1});
        hashMap.put("ZW", new int[]{3, 3, 3, 1});
        return Collections.unmodifiableMap(hashMap);
    }

    public synchronized void a(l lVar, o oVar, boolean z10) {
        if (z10) {
            w7.a.i(this.f13173f > 0);
            long a10 = this.f13172e.a();
            int i10 = (int) (a10 - this.f13174g);
            long j10 = (long) i10;
            this.f13177j += j10;
            long j11 = this.f13178k;
            long j12 = this.f13175h;
            this.f13178k = j11 + j12;
            if (i10 > 0) {
                this.f13171d.c((int) Math.sqrt((double) j12), (float) ((8000 * j12) / j10));
                if (this.f13177j >= 2000 || this.f13178k >= PlaybackStateCompat.f563t0) {
                    this.f13179l = (long) this.f13171d.f(0.5f);
                }
                n(i10, this.f13175h, this.f13179l);
                this.f13174g = a10;
                this.f13175h = 0;
            }
            this.f13173f--;
        }
    }

    public void b(Handler handler, d.a aVar) {
        this.f13170c.a(handler, aVar);
    }

    public synchronized void c(l lVar, o oVar, boolean z10, int i10) {
        if (z10) {
            this.f13175h += (long) i10;
        }
    }

    public synchronized void d(l lVar, o oVar, boolean z10) {
        if (z10) {
            if (this.f13173f == 0) {
                this.f13174g = this.f13172e.a();
            }
            this.f13173f++;
        }
    }

    @o0
    public r0 e() {
        return this;
    }

    public void f(d.a aVar) {
        this.f13170c.c(aVar);
    }

    public synchronized long g() {
        return this.f13179l;
    }

    public void h(l lVar, o oVar, boolean z10) {
    }

    public final long l(int i10) {
        Long l10 = this.f13169b.get(i10);
        if (l10 == null) {
            l10 = this.f13169b.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void n(int i10, long j10, long j11) {
        if (i10 != 0 || j10 != 0 || j11 != this.f13180m) {
            this.f13180m = j11;
            this.f13170c.b(new q(i10, j10, j11));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void o() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f13181n     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            int r0 = r10.f13182o     // Catch:{ all -> 0x0056 }
            goto L_0x0013
        L_0x0009:
            android.content.Context r0 = r10.f13168a     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x000f
            r0 = r1
            goto L_0x0013
        L_0x000f:
            int r0 = w7.q0.X(r0)     // Catch:{ all -> 0x0056 }
        L_0x0013:
            int r2 = r10.f13176i     // Catch:{ all -> 0x0056 }
            if (r2 != r0) goto L_0x0019
            monitor-exit(r10)
            return
        L_0x0019:
            r10.f13176i = r0     // Catch:{ all -> 0x0056 }
            r2 = 1
            if (r0 == r2) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            r2 = 8
            if (r0 != r2) goto L_0x0025
            goto L_0x0054
        L_0x0025:
            long r2 = r10.l(r0)     // Catch:{ all -> 0x0056 }
            r10.f13179l = r2     // Catch:{ all -> 0x0056 }
            w7.c r0 = r10.f13172e     // Catch:{ all -> 0x0056 }
            long r2 = r0.a()     // Catch:{ all -> 0x0056 }
            int r0 = r10.f13173f     // Catch:{ all -> 0x0056 }
            if (r0 <= 0) goto L_0x003a
            long r0 = r10.f13174g     // Catch:{ all -> 0x0056 }
            long r0 = r2 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x0056 }
        L_0x003a:
            r5 = r1
            long r6 = r10.f13175h     // Catch:{ all -> 0x0056 }
            long r8 = r10.f13179l     // Catch:{ all -> 0x0056 }
            r4 = r10
            r4.n(r5, r6, r8)     // Catch:{ all -> 0x0056 }
            r10.f13174g = r2     // Catch:{ all -> 0x0056 }
            r0 = 0
            r10.f13175h = r0     // Catch:{ all -> 0x0056 }
            r10.f13178k = r0     // Catch:{ all -> 0x0056 }
            r10.f13177j = r0     // Catch:{ all -> 0x0056 }
            w7.e0 r0 = r10.f13171d     // Catch:{ all -> 0x0056 }
            r0.i()     // Catch:{ all -> 0x0056 }
            monitor-exit(r10)
            return
        L_0x0054:
            monitor-exit(r10)
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.r.o():void");
    }

    public synchronized void p(int i10) {
        this.f13182o = i10;
        this.f13181n = true;
        o();
    }
}
