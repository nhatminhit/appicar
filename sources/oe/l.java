package oe;

import ef.b;
import ef.f;
import fh.g;
import fh.h;
import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import lf.j;
import ve.e;
import xe.l0;

public class l {

    public static final class a {
        @g

        /* renamed from: a  reason: collision with root package name */
        public static final a f21453a = new a();
        @e
        @h

        /* renamed from: b  reason: collision with root package name */
        public static final Method f21454b;
        @e
        @h

        /* renamed from: c  reason: collision with root package name */
        public static final Method f21455c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                oe.l$a r0 = new oe.l$a
                r0.<init>()
                f21453a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                xe.l0.o(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = xe.l0.g(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                xe.l0.o(r7, r8)
                java.lang.Object r7 = be.p.bu(r7)
                boolean r7 = xe.l0.g(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f21454b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = xe.l0.g(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f21455c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.l.a.<clinit>():void");
        }
    }

    public void a(@g Throwable th2, @g Throwable th3) {
        l0.p(th2, "cause");
        l0.p(th3, "exception");
        Method method = a.f21454b;
        if (method != null) {
            method.invoke(th2, new Object[]{th3});
        }
    }

    @g
    public f b() {
        return new b();
    }

    @h
    public j c(@g MatchResult matchResult, @g String str) {
        l0.p(matchResult, "matchResult");
        l0.p(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r3 = be.o.t((java.lang.Throwable[]) (r3 = r0.invoke(r3, new java.lang.Object[0])));
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.Throwable> d(@fh.g java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "exception"
            xe.l0.p(r3, r0)
            java.lang.reflect.Method r0 = oe.l.a.f21455c
            if (r0 == 0) goto L_0x001a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L_0x001a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = be.o.t(r3)
            if (r3 != 0) goto L_0x001e
        L_0x001a:
            java.util.List r3 = be.w.E()
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.l.d(java.lang.Throwable):java.util.List");
    }
}
