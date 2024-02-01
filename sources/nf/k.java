package nf;

import d8.f;
import fh.g;
import xe.l0;
import zd.h1;

public class k extends j {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21251a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                nf.h[] r0 = nf.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                nf.h r1 = nf.h.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                nf.h r1 = nf.h.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                nf.h r1 = nf.h.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                nf.h r1 = nf.h.SECONDS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                nf.h r1 = nf.h.MINUTES     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                nf.h r1 = nf.h.HOURS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                nf.h r1 = nf.h.DAYS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f21251a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.k.a.<clinit>():void");
        }
    }

    @g
    @h1(version = "1.5")
    public static final h f(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return h.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        } else if (c10 == 'H') {
            return h.HOURS;
        } else {
            if (c10 == 'M') {
                return h.MINUTES;
            }
            if (c10 == 'S') {
                return h.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
        }
    }

    @g
    @h1(version = "1.5")
    public static final h g(@g String str) {
        l0.p(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return h.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return h.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return h.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return h.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return h.MINUTES;
                }
            } else if (str.equals("h")) {
                return h.HOURS;
            }
        } else if (str.equals(f.f6598d)) {
            return h.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    @g
    @h1(version = "1.3")
    public static final String h(@g h hVar) {
        l0.p(hVar, "<this>");
        switch (a.f21251a[hVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return f.f6598d;
            default:
                throw new IllegalStateException(("Unknown unit: " + hVar).toString());
        }
    }
}
