package w7;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import b6.b0;
import b6.c;
import b6.j0;
import b6.r0;
import b6.s0;
import b6.u0;
import b6.v0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import d6.m;
import d6.t;
import f1.d;
import g6.e;
import h6.l;
import h6.n;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import x7.i;
import x7.q;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14786a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f14787b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f14788c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f14789d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f14790e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f14791f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String f14792g = "Util";

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f14793h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f14794i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f14795j = Pattern.compile("%([A-Fa-f0-9]{2})");
    @o0

    /* renamed from: k  reason: collision with root package name */
    public static HashMap<String, String> f14796k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f14797l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f14798m = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    public static class a implements q {
        public /* synthetic */ void G(Format format) {
            i.f(this, format);
        }

        public /* synthetic */ void I(e eVar) {
            i.e(this, eVar);
        }

        public /* synthetic */ void c(int i10, int i11, int i12, float f10) {
            i.g(this, i10, i11, i12, f10);
        }

        public /* synthetic */ void g(String str, long j10, long j11) {
            i.c(this, str, j10, j11);
        }

        public /* synthetic */ void p(Surface surface) {
            i.b(this, surface);
        }

        public /* synthetic */ void y(e eVar) {
            i.d(this, eVar);
        }

        public /* synthetic */ void z(int i10, long j10) {
            i.a(this, i10, j10);
        }
    }

    public static class b implements t {
        public /* synthetic */ void B(e eVar) {
            m.b(this, eVar);
        }

        public /* synthetic */ void D(e eVar) {
            m.c(this, eVar);
        }

        public /* synthetic */ void H(Format format) {
            m.d(this, format);
        }

        public /* synthetic */ void J(int i10, long j10, long j11) {
            m.f(this, i10, j10, j11);
        }

        public /* synthetic */ void a(int i10) {
            m.e(this, i10);
        }

        public /* synthetic */ void s(String str, long j10, long j11) {
            m.a(this, str, j10, j11);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f14786a = i10;
        String str = Build.DEVICE;
        f14787b = str;
        String str2 = Build.MANUFACTURER;
        f14788c = str2;
        String str3 = Build.MODEL;
        f14789d = str3;
        f14790e = str + ", " + str3 + ", " + str2 + ", " + i10;
    }

    public static HashMap<String, String> A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f14797l.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f14797l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static ExecutorService A0(String str) {
        return Executors.newSingleThreadExecutor(new n0(str));
    }

    public static File B(Context context, String str) throws IOException {
        File C = C(context, str);
        C.delete();
        C.mkdir();
        return C;
    }

    public static String B0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (f14786a >= 21) {
            replace = C0(replace);
        }
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String Y0 = Y0(str);
        String str2 = S0(Y0, "-")[0];
        if (str2.length() != 3) {
            return Y0;
        }
        if (f14796k == null) {
            f14796k = A();
        }
        String str3 = f14796k.get(str2);
        if (str3 == null) {
            return Y0;
        }
        return str3 + Y0.substring(3);
    }

    public static File C(Context context, String str) throws IOException {
        return File.createTempFile(str, (String) null, context.getCacheDir());
    }

    @TargetApi(21)
    public static String C0(String str) {
        return Locale.forLanguageTag(str).toLanguageTag();
    }

    public static String D(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (O0(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char charAt = str.charAt(i10);
            if (O0(charAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(charAt));
                i11--;
            } else {
                sb2.append(charAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append(str, i10, length);
        }
        return sb2.toString();
    }

    public static <T> T[] D0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    public static String E(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static <T> T[] E0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return Arrays.copyOf(tArr, i10);
    }

    public static String F(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static long F0(String str) throws j0 {
        Matcher matcher = f14793h.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i10 != 0 ? timeInMillis - ((long) (i10 * 60000)) : timeInMillis;
        }
        throw new j0("Invalid date/time format: " + str);
    }

    public static String G(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charset.forName("UTF-8"));
    }

    public static long G0(String str) {
        Matcher matcher = f14794i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d10 = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d10 = Double.parseDouble(group6);
        }
        long j10 = (long) ((parseDouble5 + d10) * 1000.0d);
        return isEmpty ? -j10 : j10;
    }

    public static int H(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) ? 4 : 2;
        }
        return 1;
    }

    public static boolean H0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int I(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return dg.a.Ye;
            case 5:
                return dg.a.f18331xf;
            case 6:
                return dg.a.f18058kh;
            case 7:
                return 1276;
            case 8:
                int i11 = f14786a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static void I0(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File I0 : listFiles) {
                I0(I0);
            }
        }
        file.delete();
    }

    public static int J(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                return i10 != 8 ? 1 : 3;
            }
        }
        return i11;
    }

    public static <T> void J0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        } else if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static byte[] K(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static long K0(long j10, v0 v0Var, long j11, long j12) {
        if (v0.f4472c.equals(v0Var)) {
            return j10;
        }
        long V0 = V0(j10, v0Var.f4477a, Long.MIN_VALUE);
        long d10 = d(j10, v0Var.f4478b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = V0 <= j11 && j11 <= d10;
        if (V0 > j12 || j12 > d10) {
            z10 = false;
        }
        return (!z11 || !z10) ? z11 ? j11 : z10 ? j12 : V0 : Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
    }

    @o0
    public static String L(String str, int i10) {
        String[] T0 = T0(str);
        if (T0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : T0) {
            if (i10 == s.i(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static long L0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (((double) j10) * (((double) j11) / ((double) j12)));
    }

    public static String M(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static long[] M0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i11 < size) {
                jArr[i11] = list.get(i11).longValue() / j12;
                i11++;
            }
        } else if (i10 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i11 < size) {
                jArr[i11] = (long) (((double) list.get(i11).longValue()) * d10);
                i11++;
            }
        } else {
            long j13 = j10 / j11;
            while (i11 < size) {
                jArr[i11] = list.get(i11).longValue() * j13;
                i11++;
            }
        }
        return jArr;
    }

    public static String N(@o0 Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Z0(networkCountryIso);
            }
        }
        return Z0(Locale.getDefault().getCountry());
    }

    public static void N0(long[] jArr, long j10, long j11) {
        int i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j12;
                i11++;
            }
        } else if (i10 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i11 < jArr.length) {
                jArr[i11] = (long) (((double) jArr[i11]) * d10);
                i11++;
            }
        } else {
            long j13 = j10 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] * j13;
                i11++;
            }
        }
    }

    public static int O(int i10) {
        switch (i10) {
            case 0:
                return 16777216;
            case 1:
                return c.f4255o1;
            case 2:
                return c.f4251n1;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean O0(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    public static void P(Display display, Point point) {
        display.getSize(point);
    }

    public static void P0(Throwable th2) {
        Q0(th2);
    }

    @TargetApi(17)
    public static void Q(Display display, Point point) {
        display.getRealSize(point);
    }

    public static <T extends Throwable> void Q0(Throwable th2) throws Throwable {
        throw th2;
    }

    @TargetApi(23)
    public static void R(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static String[] R0(String str, String str2) {
        return str.split(str2, -1);
    }

    @o0
    public static UUID S(String str) {
        String Y0 = Y0(str);
        Y0.hashCode();
        char c10 = 65535;
        switch (Y0.hashCode()) {
            case -1860423953:
                if (Y0.equals("playready")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1400551171:
                if (Y0.equals("widevine")) {
                    c10 = 1;
                    break;
                }
                break;
            case 790309106:
                if (Y0.equals("clearkey")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return c.B1;
            case 1:
                return c.A1;
            case 2:
                return c.f4299z1;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static String[] S0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int T(String str) {
        int length = str.length();
        a.a(length <= 4);
        char c10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            c10 = (c10 << 8) | str.charAt(i10);
        }
        return c10;
    }

    public static String[] T0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : R0(str.trim(), "(\\s*,\\s*)");
    }

    public static Looper U() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    @o0
    public static ComponentName U0(Context context, Intent intent) {
        return f14786a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long V(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) * ((double) f10));
    }

    public static long V0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static int W(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            default:
                return 6;
        }
    }

    public static int[] W0(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return iArr;
    }

    public static int X(Context context) {
        ConnectivityManager connectivityManager;
        int i10 = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return W(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public static byte[] X0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int Y(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static String Y0(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static int Z(int i10, int i11) {
        if (i10 == Integer.MIN_VALUE) {
            return i11 * 3;
        }
        if (i10 != 1073741824) {
            if (i10 == 2) {
                return i11 * 2;
            }
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i11 * 4;
    }

    public static String Z0(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    public static Point a0(Context context) {
        return b0(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    @o0
    public static String a1(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '%') {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        int i13 = length - (i11 * 2);
        StringBuilder sb2 = new StringBuilder(i13);
        Matcher matcher = f14795j.matcher(str);
        while (i11 > 0 && matcher.find()) {
            sb2.append(str, i10, matcher.start());
            sb2.append((char) Integer.parseInt(matcher.group(1), 16));
            i10 = matcher.end();
            i11--;
        }
        if (i10 < length) {
            sb2.append(str, i10, length);
        }
        if (sb2.length() != i13) {
            return null;
        }
        return sb2.toString();
    }

    public static Point b0(Context context, Display display) {
        int i10 = f14786a;
        if (i10 <= 28 && display.getDisplayId() == 0 && v0(context)) {
            if ("Sony".equals(f14788c) && f14789d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, d.f7056b);
            }
            String k02 = k0(i10 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(k02)) {
                try {
                    String[] R0 = R0(k02.trim(), "x");
                    if (R0.length == 2) {
                        int parseInt = Integer.parseInt(R0[0]);
                        int parseInt2 = Integer.parseInt(R0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                p.d(f14792g, "Invalid display size: " + k02);
            }
        }
        Point point = new Point();
        int i11 = f14786a;
        if (i11 >= 23) {
            R(display, point);
        } else if (i11 >= 17) {
            Q(display, point);
        } else {
            P(display, point);
        }
        return point;
    }

    public static void b1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static long c0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) / ((double) f10));
    }

    public static long d(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static s0[] d0(u0 u0Var, @o0 l<n> lVar) {
        r0[] a10 = u0Var.a(new Handler(), new a(), new b(), new o0(), new p0(), lVar);
        s0[] s0VarArr = new s0[a10.length];
        for (int i10 = 0; i10 < a10.length; i10++) {
            s0VarArr[i10] = a10[i10].i();
        }
        return s0VarArr;
    }

    public static boolean e(@o0 Object obj, @o0 Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int e0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int f(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r3.size()
        L_0x000c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x001d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x000c
        L_0x001d:
            if (r5 == 0) goto L_0x0022
            int r4 = r0 + -1
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            int r3 = r3.size()
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q0.f(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static String f0(StringBuilder sb2, Formatter formatter, long j10) {
        Formatter formatter2;
        if (j10 == c.f4201b) {
            j10 = 0;
        }
        long j11 = (j10 + 500) / 1000;
        long j12 = j11 % 60;
        long j13 = (j11 / 60) % 60;
        long j14 = j11 / 3600;
        sb2.setLength(0);
        if (j14 > 0) {
            formatter2 = formatter.format("%d:%02d:%02d", new Object[]{Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)});
        } else {
            formatter2 = formatter.format("%02d:%02d", new Object[]{Long.valueOf(j13), Long.valueOf(j12)});
        }
        return formatter2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x0008
            int r3 = ~r0
            goto L_0x0018
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0012
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0012
            goto L_0x0008
        L_0x0012:
            if (r4 == 0) goto L_0x0017
            int r3 = r0 + -1
            goto L_0x0018
        L_0x0017:
            r3 = r0
        L_0x0018:
            if (r5 == 0) goto L_0x0021
            int r2 = r2.length
            int r2 = r2 + -1
            int r3 = java.lang.Math.min(r2, r3)
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q0.g(int[], int, boolean, boolean):int");
    }

    public static String[] g0() {
        String[] i02 = i0();
        for (int i10 = 0; i10 < i02.length; i10++) {
            i02[i10] = B0(i02[i10]);
        }
        return i02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L_0x0014
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r6 == 0) goto L_0x0019
            int r4 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r4 = r0
        L_0x001a:
            if (r7 == 0) goto L_0x0023
            int r3 = r3.length
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q0.h(long[], long, boolean, boolean):int");
    }

    @TargetApi(21)
    public static String[] h0(Configuration configuration) {
        return new String[]{configuration.locale.toLanguageTag()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int i(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q0.i(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static String[] i0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = f14786a;
        if (i10 >= 24) {
            return j0(configuration);
        }
        if (i10 >= 21) {
            return h0(configuration);
        }
        return new String[]{configuration.locale.toString()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int j(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q0.j(int[], int, boolean, boolean):int");
    }

    @TargetApi(24)
    public static String[] j0(Configuration configuration) {
        return R0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int k(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r6 == 0) goto L_0x001a
            int r3 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r3 = r0
        L_0x001b:
            if (r7 == 0) goto L_0x0022
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.q0.k(long[], long, boolean, boolean):int");
    }

    @o0
    public static String k0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            p.e(f14792g, "Failed to read system property " + str, e10);
            return null;
        }
    }

    @EnsuresNonNull({"#1"})
    public static <T> T l(@o0 T t10) {
        return t10;
    }

    public static String l0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + b0.f4190c;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] m(T[] tArr) {
        return tArr;
    }

    public static byte[] m0(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static int n(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int n0(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return p0(path);
    }

    public static long o(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static int o0(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            return n0(uri);
        }
        return p0("." + str);
    }

    @TargetApi(24)
    public static boolean p(Uri... uriArr) {
        if (f14786a < 24) {
            return true;
        }
        for (Uri uri : uriArr) {
            if (gc.t.f19110d.equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) a.g(uri.getHost()))) {
                return false;
            }
        }
        return true;
    }

    public static int p0(String str) {
        String Y0 = Y0(str);
        if (Y0.endsWith(".mpd")) {
            return 0;
        }
        if (Y0.endsWith(".m3u8")) {
            return 2;
        }
        return Y0.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    public static void q(@o0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean q0(w wVar, w wVar2, @o0 Inflater inflater) {
        if (wVar.a() <= 0) {
            return false;
        }
        byte[] bArr = wVar2.f14880a;
        if (bArr.length < wVar.a()) {
            bArr = new byte[(wVar.a() * 2)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(wVar.f14880a, wVar.c(), wVar.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(bArr, i10, bArr.length - i10);
                if (inflater.finished()) {
                    wVar2.O(bArr, i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i10 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static void r(@o0 t7.l lVar) {
        if (lVar != null) {
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean r0(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == 1073741824;
    }

    public static int s(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public static boolean s0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == Integer.MIN_VALUE || i10 == 1073741824 || i10 == 4;
    }

    public static float t(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static boolean t0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static int u(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static boolean u0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static long v(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean v0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean w(Object[] objArr, Object obj) {
        for (Object e10 : objArr) {
            if (e(e10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void w0(List list) {
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f14798m[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static /* synthetic */ void x0(Metadata metadata) {
    }

    public static Handler y(Handler.Callback callback) {
        return z(U(), callback);
    }

    public static /* synthetic */ Thread y0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @TargetApi(23)
    public static boolean z0(Activity activity, Uri... uriArr) {
        if (f14786a < 23) {
            return false;
        }
        int length = uriArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (!u0(uriArr[i10])) {
                i10++;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
                return true;
            }
        }
        return false;
    }
}
