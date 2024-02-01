package qe;

import ef.f;
import fh.g;
import fh.h;
import gf.m;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import lf.j;
import ve.e;
import xe.l0;

public class d extends pe.a {

    public static final class a {
        @g

        /* renamed from: a  reason: collision with root package name */
        public static final a f22371a = new a();
        @e
        @h

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f22372b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                qe.d$a r0 = new qe.d$a
                r0.<init>()
                f22371a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f22372b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.d.a.<clinit>():void");
        }
    }

    private final boolean e(int i10) {
        Integer num = a.f22372b;
        return num == null || num.intValue() >= i10;
    }

    @g
    public f b() {
        return e(34) ? new ff.a() : super.b();
    }

    @h
    public j c(@g MatchResult matchResult, @g String str) {
        l0.p(matchResult, "matchResult");
        l0.p(str, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher != null) {
            m mVar = new m(matcher.start(str), matcher.end(str) - 1);
            if (mVar.c().intValue() < 0) {
                return null;
            }
            String a10 = matcher.group(str);
            l0.o(a10, "matcher.group(name)");
            return new j(a10, mVar);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
