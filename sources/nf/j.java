package nf;

import fh.g;
import java.util.concurrent.TimeUnit;
import xe.l0;
import zd.h1;
import zd.j0;
import zd.y2;

public class j {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21250a;

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
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f21250a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nf.j.a.<clinit>():void");
        }
    }

    @h1(version = "1.3")
    public static final double a(double d10, @g h hVar, @g h hVar2) {
        l0.p(hVar, "sourceUnit");
        l0.p(hVar2, "targetUnit");
        long convert = hVar2.b().convert(1, hVar.b());
        return convert > 0 ? d10 * ((double) convert) : d10 / ((double) hVar.b().convert(1, hVar2.b()));
    }

    @h1(version = "1.5")
    public static final long b(long j10, @g h hVar, @g h hVar2) {
        l0.p(hVar, "sourceUnit");
        l0.p(hVar2, "targetUnit");
        return hVar2.b().convert(j10, hVar.b());
    }

    @h1(version = "1.5")
    public static final long c(long j10, @g h hVar, @g h hVar2) {
        l0.p(hVar, "sourceUnit");
        l0.p(hVar2, "targetUnit");
        return hVar2.b().convert(j10, hVar.b());
    }

    @g
    @h1(version = "1.8")
    @y2(markerClass = {l.class})
    public static final h d(@g TimeUnit timeUnit) {
        l0.p(timeUnit, "<this>");
        switch (a.f21250a[timeUnit.ordinal()]) {
            case 1:
                return h.NANOSECONDS;
            case 2:
                return h.MICROSECONDS;
            case 3:
                return h.MILLISECONDS;
            case 4:
                return h.SECONDS;
            case 5:
                return h.MINUTES;
            case 6:
                return h.HOURS;
            case 7:
                return h.DAYS;
            default:
                throw new j0();
        }
    }

    @g
    @h1(version = "1.8")
    @y2(markerClass = {l.class})
    public static final TimeUnit e(@g h hVar) {
        l0.p(hVar, "<this>");
        return hVar.b();
    }
}
