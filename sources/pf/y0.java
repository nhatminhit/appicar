package pf;

import fh.g;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import oe.f;
import we.a;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0017\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\b\"\u0014\u0010\b\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\f\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007\"\u0014\u0010\u0010\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007\"\u001a\u0010\u0013\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\r\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lzd/u2;", "f", "Lkotlin/Function0;", "", "value", "a", "", "Ljava/lang/String;", "DEBUG_PROPERTY_NAME", "b", "STACKTRACE_RECOVERY_PROPERTY_NAME", "c", "DEBUG_PROPERTY_VALUE_AUTO", "d", "DEBUG_PROPERTY_VALUE_ON", "e", "DEBUG_PROPERTY_VALUE_OFF", "Z", "()Z", "ASSERTIONS_ENABLED", "g", "DEBUG", "h", "RECOVER_STACK_TRACES", "Ljava/util/concurrent/atomic/AtomicLong;", "i", "Ljava/util/concurrent/atomic/AtomicLong;", "()Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class y0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f22053a = "kotlinx.coroutines.debug";
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final String f22054b = "kotlinx.coroutines.stacktrace.recovery";
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final String f22055c = "auto";
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final String f22056d = "on";
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final String f22057e = "off";

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f22058f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f22059g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f22060h;
    @g

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLong f22061i = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r0.equals(f22056d) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.equals("") != false) goto L_0x0041;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = wf.t0.d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0063
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0039
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0030
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0043
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0063
        L_0x0030:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0041
        L_0x0039:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r0 = r1
            goto L_0x0064
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0063:
            r0 = r2
        L_0x0064:
            f22059g = r0
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = wf.t0.e(r0, r1)
            if (r0 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r1 = r2
        L_0x0072:
            f22060h = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f22061i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.y0.<clinit>():void");
    }

    @f
    public static final void a(a<Boolean> aVar) {
    }

    public static final boolean b() {
        return f22058f;
    }

    @g
    public static final AtomicLong c() {
        return f22061i;
    }

    public static final boolean d() {
        return f22059g;
    }

    public static final boolean e() {
        return f22060h;
    }

    public static final void f() {
        f22061i.set(0);
    }
}
