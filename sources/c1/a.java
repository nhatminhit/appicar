package c1;

import d.g1;
import d.x0;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@x0({x0.a.Q})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4767a = 4;

    /* renamed from: b  reason: collision with root package name */
    public static final int f4768b = 14;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4769c = 5;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4770d = 25;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4771e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static final C0073a[] f4772f = {new C0073a(99, 99, -1, -1), new C0073a(35, 36, -1, -1), new C0073a(71, 72, -1, -1), new C0073a(96, 96, -1, -1), new C0073a(85, 86, -1, -1), new C0073a(90, 96, -1, -1), new C0073a(80, 81, -1, -1), new C0073a(6, 6, -1, -1), new C0073a(20, 20, -1, -1), new C0073a(19, 19, -1, -1), new C0073a(32, 34, -1, -1), new C0073a(96, 96, -1, -1), new C0073a(30, 31, -1, -1), new C0073a(96, 96, -1, -1), new C0073a(96, 96, -1, -1), new C0073a(50, 52, -1, -1), new C0073a(83, 83, -1, -1), new C0073a(60, 62, -1, -1), new C0073a(46, 47, -1, -1), new C0073a(66, 67, 73, -1), new C0073a(40, 42, -1, -1), new C0073a(70, 71, -1, -1), new C0073a(1, 2, -1, -1), new C0073a(20, 21, -1, -1), new C0073a(3, 4, -1, -1), new C0073a(96, 96, -1, -1), new C0073a(48, 49, -1, -1), new C0073a(55, 56, -1, -1), new C0073a(63, 65, -1, -1), new C0073a(96, 96, -1, -1), new C0073a(38, 39, -1, -1), new C0073a(55, 56, -1, -1), new C0073a(27, 28, -1, -1), new C0073a(58, 58, -1, -1), new C0073a(68, 69, -1, -1), new C0073a(3, 4, -1, -1), new C0073a(7, 8, -1, -1), new C0073a(87, 88, 86, -1), new C0073a(88, 89, 96, -1), new C0073a(10, 14, 0, 6), new C0073a(43, 45, -1, -1), new C0073a(73, 74, -1, -1), new C0073a(97, 97, -1, -1), new C0073a(15, 19, -1, -1), new C0073a(6, 6, 0, 9), new C0073a(96, 96, -1, -1), new C0073a(2, 2, -1, -1), new C0073a(29, 29, -1, -1), new C0073a(57, 57, -1, -1), new C0073a(37, 38, -1, -1), new C0073a(75, 79, 87, 88), new C0073a(84, 84, -1, -1), new C0073a(22, 24, 20, -1), new C0073a(6, 9, -1, -1), new C0073a(5, 5, -1, -1), new C0073a(98, 99, -1, -1), new C0073a(53, 54, -1, -1), new C0073a(24, 26, -1, -1), new C0073a(82, 83, -1, -1)};

    /* renamed from: g  reason: collision with root package name */
    public static final String f4773g = "\n\u000b\f\r  ";

    /* renamed from: h  reason: collision with root package name */
    public static final String f4774h = "\t                　";

    /* renamed from: i  reason: collision with root package name */
    public static final String f4775i = "\t                　\n\u000b\f\r  ";

    /* renamed from: j  reason: collision with root package name */
    public static final String f4776j = ",*•\t                　\n\u000b\f\r  ";

    /* renamed from: k  reason: collision with root package name */
    public static final String f4777k = "(?=[,*•\t                　\n\u000b\f\r  ]|$)";

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f4778l = Pattern.compile("[^,*•\t                　\n\u000b\f\r  ]+(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: m  reason: collision with root package name */
    public static final String f4779m = ",\"'\t                　\n\u000b\f\r  ";

    /* renamed from: n  reason: collision with root package name */
    public static final String f4780n = "(?=[,\"'\t                　\n\u000b\f\r  ]|$)";

    /* renamed from: o  reason: collision with root package name */
    public static final String f4781o = ":,\"'\t                　\n\u000b\f\r  ";

    /* renamed from: p  reason: collision with root package name */
    public static final String f4782p = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f4783q = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f4784r = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f4785s = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f4786t = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f4787u = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: c1.a$a  reason: collision with other inner class name */
    public static class C0073a {

        /* renamed from: a  reason: collision with root package name */
        public int f4788a;

        /* renamed from: b  reason: collision with root package name */
        public int f4789b;

        /* renamed from: c  reason: collision with root package name */
        public int f4790c;

        /* renamed from: d  reason: collision with root package name */
        public int f4791d;

        public C0073a(int i10, int i11, int i12, int i13) {
            this.f4788a = i10;
            this.f4789b = i11;
            this.f4790c = i12;
            this.f4791d = i13;
        }

        public boolean a(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            return (this.f4788a <= parseInt && parseInt <= this.f4789b) || parseInt == this.f4790c || parseInt == this.f4791d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return -r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            int r14 = r14.end()
            java.util.regex.Pattern r0 = f4778l
            java.util.regex.Matcher r0 = r0.matcher(r13)
            r1 = -1
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            r9 = r1
            r10 = r9
            r8 = r2
            r5 = r3
            r6 = r5
            r7 = r6
        L_0x0015:
            int r11 = r13.length()
            if (r14 >= r11) goto L_0x00d5
            boolean r11 = r0.find(r14)
            if (r11 != 0) goto L_0x0027
            int r13 = r13.length()
        L_0x0025:
            int r13 = -r13
            return r13
        L_0x0027:
            int r11 = r0.end()
            int r12 = r0.start()
            int r11 = r11 - r12
            r12 = 25
            if (r11 <= r12) goto L_0x0039
            int r13 = r0.end()
            goto L_0x0025
        L_0x0039:
            int r11 = r0.start()
            if (r14 >= r11) goto L_0x0051
            int r11 = r14 + 1
            char r14 = r13.charAt(r14)
            java.lang.String r12 = "\n\u000b\f\r  "
            int r14 = r12.indexOf(r14)
            if (r14 == r1) goto L_0x004f
            int r5 = r5 + 1
        L_0x004f:
            r14 = r11
            goto L_0x0039
        L_0x0051:
            r11 = 5
            if (r5 <= r11) goto L_0x0056
            goto L_0x00d5
        L_0x0056:
            int r6 = r6 + r3
            r12 = 14
            if (r6 <= r12) goto L_0x005d
            goto L_0x00d5
        L_0x005d:
            java.util.regex.MatchResult r12 = h(r13, r14)
            if (r12 == 0) goto L_0x006d
            if (r7 == 0) goto L_0x0069
            if (r5 <= r3) goto L_0x0069
            int r13 = -r14
            return r13
        L_0x0069:
            if (r9 != r1) goto L_0x00cb
            r9 = r14
            goto L_0x00cb
        L_0x006d:
            java.lang.String r7 = r0.group(r2)
            boolean r7 = d(r7)
            if (r7 == 0) goto L_0x007a
            r7 = r2
            r8 = r3
            goto L_0x00cb
        L_0x007a:
            if (r6 != r11) goto L_0x0083
            if (r8 != 0) goto L_0x0083
            int r14 = r0.end()
            goto L_0x00d5
        L_0x0083:
            if (r8 == 0) goto L_0x00ca
            r7 = 4
            if (r6 <= r7) goto L_0x00ca
            java.util.regex.MatchResult r14 = i(r13, r14)
            if (r14 == 0) goto L_0x00ca
            java.lang.String r7 = "et"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = r14.group(r2)
            java.lang.String r7 = "al"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x00a7
            int r14 = r14.end()
            goto L_0x00d5
        L_0x00a7:
            java.util.regex.Pattern r4 = f4778l
            java.util.regex.Matcher r4 = r4.matcher(r13)
            int r7 = r14.end()
            boolean r7 = r4.find(r7)
            if (r7 == 0) goto L_0x00c6
            java.lang.String r7 = r4.group(r2)
            boolean r14 = g(r7, r14)
            if (r14 == 0) goto L_0x00ca
            int r13 = r4.end()
            return r13
        L_0x00c6:
            int r10 = r14.end()
        L_0x00ca:
            r7 = r2
        L_0x00cb:
            java.lang.String r4 = r0.group(r2)
            int r14 = r0.end()
            goto L_0x0015
        L_0x00d5:
            if (r10 <= 0) goto L_0x00d8
            return r10
        L_0x00d8:
            if (r9 <= 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r9 = r14
        L_0x00dc:
            int r13 = -r9
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.a.a(java.lang.String, java.util.regex.MatchResult):int");
    }

    public static boolean b(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (Character.isDigit(str.charAt(i11))) {
                i10++;
            }
        }
        if (i10 > 5) {
            return false;
        }
        Matcher matcher = f4786t.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i12 = parseInt % 10;
        String str2 = "th";
        if (i12 == 1) {
            if (parseInt % 100 != 11) {
                str2 = "st";
            }
            return lowerCase.equals(str2);
        } else if (i12 == 2) {
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        } else if (i12 != 3) {
            return lowerCase.equals(str2);
        } else {
            if (parseInt % 100 != 13) {
                str2 = "rd";
            }
            return lowerCase.equals(str2);
        }
    }

    public static String c(String str) {
        Matcher matcher = f4783q.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            if (b(matcher.group(0))) {
                int start = matcher.start();
                int a10 = a(str, matcher);
                if (a10 > 0) {
                    return str.substring(start, a10);
                }
                i10 = -a10;
            } else {
                i10 = matcher.end();
            }
        }
        return null;
    }

    @g1
    public static boolean d(String str) {
        return f4785s.matcher(str).matches();
    }

    @g1
    public static boolean e(String str) {
        return f4787u.matcher(str).matches();
    }

    @g1
    public static boolean f(String str, String str2) {
        return g(str, i(str2, 0));
    }

    public static boolean g(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i10 = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i10;
                break;
            }
            groupCount = i10;
        }
        return f4787u.matcher(str).matches() && f4772f[groupCount].a(str);
    }

    @g1
    public static MatchResult h(String str, int i10) {
        if (i10 > 0 && f4781o.indexOf(str.charAt(i10 - 1)) == -1) {
            return null;
        }
        Matcher region = f4783q.matcher(str).region(i10, str.length());
        if (region.lookingAt()) {
            MatchResult matchResult = region.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    @g1
    public static MatchResult i(String str, int i10) {
        if (i10 > 0 && f4776j.indexOf(str.charAt(i10 - 1)) == -1) {
            return null;
        }
        Matcher region = f4784r.matcher(str).region(i10, str.length());
        if (region.lookingAt()) {
            return region.toMatchResult();
        }
        return null;
    }
}
