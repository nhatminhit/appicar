package tf;

import be.e0;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import lf.b0;
import lf.u;
import pf.n2;
import pf.v2;
import we.l;
import we.p;
import wf.q0;
import xe.l0;
import xe.n0;
import xe.u1;
import xe.w;
import zd.a0;
import zd.d1;
import zd.e1;
import zd.r1;
import zd.u0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0001B\n\b\u0002¢\u0006\u0005\b\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010>J\u0016\u0010?\u001a\u0004\u0018\u00010=*\u00020=H\u0010¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0010¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bI\u0010JJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010B*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bc\u0010$J)\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010\\\u001a\u00020[2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010gJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR$\u0010v\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030t8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010uR\u0016\u0010w\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010?R\u0014\u0010z\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010yR#\u0010\u0001\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010R%\u0010\u0001\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b#\u0010{\u001a\u0005\b\u0001\u0010}\"\u0005\b\u0001\u0010R$\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0001R!\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0t8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010uR\"\u0010\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00020\u0011*\u00020\n8BX\u0004¢\u0006\u000f\u0012\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010XR\u001b\u0010\u0001\u001a\u00020\u0003*\u00020%8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00038@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010}¨\u0006\u0001"}, d2 = {"Ltf/h;", "", "Lkotlin/Function1;", "", "Lzd/u2;", "t", "()Lwe/l;", "M", "()V", "N", "Lpf/n2;", "", "Ltf/f;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "d", "(Lpf/n2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Ltf/h$a;", "Lie/g;", "create", "", "i", "(Lwe/p;)Ljava/util/List;", "P", "(Ljava/lang/Object;)Ljava/lang/String;", "y", "(Ltf/h$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "n", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lzd/u0;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lzd/u0;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lie/d;", "frame", "S", "(Lie/d;Ljava/lang/String;)V", "Lle/e;", "(Lle/e;Ljava/lang/String;)V", "I", "(Lle/e;)Lle/e;", "owner", "T", "(Ltf/h$a;Lie/d;Ljava/lang/String;)V", "B", "(Lie/d;)Ltf/h$a;", "C", "(Lle/e;)Ltf/h$a;", "Ltf/n;", "O", "(Ljava/util/List;)Ltf/n;", "completion", "e", "(Lie/d;Ltf/n;)Lie/d;", "E", "(Ltf/h$a;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", "job", "w", "(Lpf/n2;)Ljava/lang/String;", "h", "()[Ljava/lang/Object;", "Ltf/e;", "info", "m", "(Ltf/e;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Ltf/k;", "k", "f", "l", "(Ltf/e;Ljava/util/List;)Ljava/util/List;", "G", "(Lie/d;)V", "H", "F", "(Lie/d;)Lie/d;", "b", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Ltf/c;", "Ltf/c;", "capturedCoroutinesMap", "installations", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", "u", "K", "enableCreationStackTraces", "Lwe/l;", "dynamicAttach", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "getDebugString$annotations", "(Lpf/n2;)V", "debugString", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "z", "isInstalled", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class h {
    @fh.g

    /* renamed from: a  reason: collision with root package name */
    public static final h f23207a;
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public static final String f23208b = "Coroutine creation stacktrace";
    @fh.g

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f23209c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    @fh.h

    /* renamed from: d  reason: collision with root package name */
    public static Thread f23210d;
    @fh.g

    /* renamed from: e  reason: collision with root package name */
    public static final c<a<?>, Boolean> f23211e = new c<>(false, 1, (w) null);
    @fh.g

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ i f23212f = new i(0);

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23213g = AtomicLongFieldUpdater.newUpdater(i.class, "sequenceNumber");
    @fh.g

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantReadWriteLock f23214h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public static boolean f23215i = true;
    private static volatile int installations;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f23216j = true;
    @fh.h

    /* renamed from: k  reason: collision with root package name */
    public static final l<Boolean, u2> f23217k;
    @fh.g

    /* renamed from: l  reason: collision with root package name */
    public static final c<le.e, f> f23218l = new c<>(true);

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Ltf/h$a;", "T", "Lie/d;", "Lle/e;", "Ljava/lang/StackTraceElement;", "R", "Lzd/d1;", "result", "Lzd/u2;", "x", "(Ljava/lang/Object;)V", "", "toString", "O", "Lie/d;", "delegate", "Ltf/f;", "P", "Ltf/f;", "info", "Q", "Lle/e;", "frame", "Lie/g;", "e", "()Lie/g;", "context", "u", "()Lle/e;", "callerFrame", "<init>", "(Lie/d;Ltf/f;Lle/e;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> implements ie.d<T>, le.e {
        @fh.g
        @ve.e
        public final ie.d<T> O;
        @fh.g
        @ve.e
        public final f P;
        @fh.h
        public final le.e Q;

        public a(@fh.g ie.d<? super T> dVar, @fh.g f fVar, @fh.h le.e eVar) {
            this.O = dVar;
            this.P = fVar;
            this.Q = eVar;
        }

        @fh.h
        public StackTraceElement R() {
            le.e eVar = this.Q;
            if (eVar != null) {
                return eVar.R();
            }
            return null;
        }

        @fh.g
        public ie.g e() {
            return this.O.e();
        }

        @fh.g
        public String toString() {
            return this.O.toString();
        }

        @fh.h
        public le.e u() {
            le.e eVar = this.Q;
            if (eVar != null) {
                return eVar.u();
            }
            return null;
        }

        public void x(@fh.g Object obj) {
            h.f23207a.E(this);
            this.O.x(obj);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Ltf/h$a;", "owner", "c", "(Ltf/h$a;)Ljava/lang/Object;", "tf/h$c"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements l<a<?>, e> {
        public b() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final e A(@fh.g a<?> aVar) {
            ie.g c10;
            if (!h.f23207a.y(aVar) && (c10 = aVar.P.c()) != null) {
                return new e(aVar.P, c10);
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Ltf/h$a;", "owner", "c", "(Ltf/h$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements l<a<?>, R> {
        public final /* synthetic */ p<a<?>, ie.g, R> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p<? super a<?>, ? super ie.g, ? extends R> pVar) {
            super(1);
            this.P = pVar;
        }

        @fh.h
        /* renamed from: c */
        public final R A(@fh.g a<?> aVar) {
            ie.g c10;
            if (!h.f23207a.y(aVar) && (c10 = aVar.P.c()) != null) {
                return this.P.g0(aVar, c10);
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "fe/g$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return fe.g.l(Long.valueOf(((a) t10).P.f23199b), Long.valueOf(((a) t11).P.f23199b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltf/h$a;", "it", "", "c", "(Ltf/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    public static final class e extends n0 implements l<a<?>, Boolean> {
        public static final e P = new e();

        public e() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final Boolean A(@fh.g a<?> aVar) {
            return Boolean.valueOf(!h.f23207a.y(aVar));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "fe/g$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class f<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return fe.g.l(Long.valueOf(((a) t10).P.f23199b), Long.valueOf(((a) t11).P.f23199b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Ltf/h$a;", "owner", "c", "(Ltf/h$a;)Ljava/lang/Object;", "tf/h$c"}, k = 3, mv = {1, 6, 0})
    public static final class g extends n0 implements l<a<?>, k> {
        public g() {
            super(1);
        }

        @fh.h
        /* renamed from: c */
        public final k A(@fh.g a<?> aVar) {
            ie.g c10;
            if (!h.f23207a.y(aVar) && (c10 = aVar.P.c()) != null) {
                return new k(aVar.P, c10);
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzd/u2;", "c", "()V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: tf.h$h  reason: collision with other inner class name */
    public static final class C0427h extends n0 implements we.a<u2> {
        public static final C0427h P = new C0427h();

        public C0427h() {
            super(0);
        }

        public final void c() {
            h.f23218l.o();
        }

        public /* bridge */ /* synthetic */ Object n() {
            c();
            return u2.f25116a;
        }
    }

    static {
        h hVar = new h();
        f23207a = hVar;
        f23217k = hVar.t();
    }

    public static /* synthetic */ void s(n2 n2Var) {
    }

    public final boolean A(StackTraceElement stackTraceElement) {
        return b0.v2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, (Object) null);
    }

    public final a<?> B(ie.d<?> dVar) {
        le.e eVar = dVar instanceof le.e ? (le.e) dVar : null;
        if (eVar != null) {
            return C(eVar);
        }
        return null;
    }

    public final a<?> C(le.e eVar) {
        while (!(eVar instanceof a)) {
            eVar = eVar.u();
            if (eVar == null) {
                return null;
            }
        }
        return (a) eVar;
    }

    public final void D(PrintStream printStream, List<StackTraceElement> list) {
        for (StackTraceElement stackTraceElement : list) {
            printStream.print("\n\tat " + stackTraceElement);
        }
    }

    public final void E(a<?> aVar) {
        le.e I;
        f23211e.remove(aVar);
        le.e f10 = aVar.P.f();
        if (f10 != null && (I = I(f10)) != null) {
            f23218l.remove(I);
        }
    }

    @fh.g
    public final <T> ie.d<T> F(@fh.g ie.d<? super T> dVar) {
        if (!z() || B(dVar) != null) {
            return dVar;
        }
        return e(dVar, f23216j ? O(J(new Exception())) : null);
    }

    public final void G(@fh.g ie.d<?> dVar) {
        S(dVar, g.f23205b);
    }

    public final void H(@fh.g ie.d<?> dVar) {
        S(dVar, g.f23206c);
    }

    public final le.e I(le.e eVar) {
        do {
            eVar = eVar.u();
            if (eVar == null) {
                return null;
            }
        } while (eVar.R() == null);
        return eVar;
    }

    public final <T extends Throwable> List<StackTraceElement> J(T t10) {
        int i10;
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                if (l0.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i11 = length2;
                    break;
                } else if (i12 < 0) {
                    break;
                } else {
                    length2 = i12;
                }
            }
        }
        if (!f23215i) {
            int i13 = length - i10;
            ArrayList arrayList = new ArrayList(i13);
            int i14 = 0;
            while (i14 < i13) {
                arrayList.add(i14 == 0 ? q0.d(f23208b) : stackTrace[i14 + i10]);
                i14++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i10) + 1);
        arrayList2.add(q0.d(f23208b));
        while (true) {
            i10++;
            while (i10 < length) {
                if (A(stackTrace[i10])) {
                    arrayList2.add(stackTrace[i10]);
                    int i15 = i10 + 1;
                    while (i15 < length && A(stackTrace[i15])) {
                        i15++;
                    }
                    int i16 = i15 - 1;
                    int i17 = i16;
                    while (i17 > i10 && stackTrace[i17].getFileName() == null) {
                        i17--;
                    }
                    if (i17 > i10 && i17 < i16) {
                        arrayList2.add(stackTrace[i17]);
                    }
                    arrayList2.add(stackTrace[i16]);
                    i10 = i15;
                } else {
                    arrayList2.add(stackTrace[i10]);
                }
            }
            return arrayList2;
        }
    }

    public final void K(boolean z10) {
        f23216j = z10;
    }

    public final void L(boolean z10) {
        f23215i = z10;
    }

    public final void M() {
        f23210d = ge.b.c(false, true, (ClassLoader) null, "Coroutines Debugger Cleaner", 0, C0427h.P, 21, (Object) null);
    }

    public final void N() {
        Thread thread = f23210d;
        if (thread != null) {
            f23210d = null;
            thread.interrupt();
            thread.join();
        }
    }

    public final n O(List<StackTraceElement> list) {
        n nVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                nVar = new n(nVar, listIterator.previous());
            }
        }
        return nVar;
    }

    public final String P(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        return sb2.toString();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Q() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            tf.h r4 = f23207a     // Catch:{ all -> 0x0085 }
            boolean r5 = r4.z()     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x0079
            int r5 = installations     // Catch:{ all -> 0x0085 }
            int r5 = r5 + -1
            installations = r5     // Catch:{ all -> 0x0085 }
            int r5 = installations     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x0041
        L_0x0035:
            if (r3 >= r2) goto L_0x003d
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0035
        L_0x003d:
            r0.unlock()
            return
        L_0x0041:
            r4.N()     // Catch:{ all -> 0x0085 }
            tf.c<tf.h$a<?>, java.lang.Boolean> r4 = f23211e     // Catch:{ all -> 0x0085 }
            r4.clear()     // Catch:{ all -> 0x0085 }
            tf.c<le.e, tf.f> r4 = f23218l     // Catch:{ all -> 0x0085 }
            r4.clear()     // Catch:{ all -> 0x0085 }
            tf.a r4 = tf.a.f23176a     // Catch:{ all -> 0x0085 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0062
        L_0x0056:
            if (r3 >= r2) goto L_0x005e
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0056
        L_0x005e:
            r0.unlock()
            return
        L_0x0062:
            we.l<java.lang.Boolean, zd.u2> r4 = f23217k     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x006b
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0085 }
            r4.A(r5)     // Catch:{ all -> 0x0085 }
        L_0x006b:
            zd.u2 r4 = zd.u2.f25116a     // Catch:{ all -> 0x0085 }
        L_0x006d:
            if (r3 >= r2) goto L_0x0075
            r1.lock()
            int r3 = r3 + 1
            goto L_0x006d
        L_0x0075:
            r0.unlock()
            return
        L_0x0079:
            java.lang.String r4 = "Agent was not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0085 }
            r5.<init>(r4)     // Catch:{ all -> 0x0085 }
            throw r5     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r4 = move-exception
        L_0x0086:
            if (r3 >= r2) goto L_0x008e
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0086
        L_0x008e:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.Q():void");
    }

    public final void R(le.e eVar, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f23214h.readLock();
        readLock.lock();
        try {
            h hVar = f23207a;
            if (hVar.z()) {
                c<le.e, f> cVar = f23218l;
                f remove = cVar.remove(eVar);
                if (remove == null) {
                    a<?> C = hVar.C(eVar);
                    if (C != null) {
                        remove = C.P;
                        if (remove != null) {
                            le.e f10 = remove.f();
                            le.e I = f10 != null ? hVar.I(f10) : null;
                            if (I != null) {
                                cVar.remove(I);
                            }
                        }
                    }
                    readLock.unlock();
                    return;
                }
                remove.j(str, (ie.d) eVar);
                le.e I2 = hVar.I(eVar);
                if (I2 == null) {
                    readLock.unlock();
                    return;
                }
                cVar.put(I2, remove);
                u2 u2Var = u2.f25116a;
                readLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void S(ie.d<?> dVar, String str) {
        if (z()) {
            if (!l0.g(str, g.f23205b) || !a0.U.j(1, 3, 30)) {
                a<?> B = B(dVar);
                if (B != null) {
                    T(B, dVar, str);
                    return;
                }
                return;
            }
            le.e eVar = dVar instanceof le.e ? (le.e) dVar : null;
            if (eVar != null) {
                R(eVar, str);
            }
        }
    }

    public final void T(a<?> aVar, ie.d<?> dVar, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f23214h.readLock();
        readLock.lock();
        try {
            if (f23207a.z()) {
                aVar.P.j(str, dVar);
                u2 u2Var = u2.f25116a;
                readLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0083 A[LOOP:0: B:8:0x007d->B:10:0x0083, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(pf.n2 r7, java.util.Map<pf.n2, tf.f> r8, java.lang.StringBuilder r9, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r8.get(r7)
            tf.f r0 = (tf.f) r0
            r1 = 9
            r2 = 10
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof wf.n0
            if (r0 != 0) goto L_0x0075
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r3 = r6.r(r7)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x006b
        L_0x002f:
            java.util.List r3 = r0.h()
            java.lang.Object r3 = be.e0.B2(r3)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r0 = r0.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = r6.r(r7)
            r4.append(r5)
            java.lang.String r5 = ", continuation is "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " at line "
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x006b:
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
        L_0x0075:
            if.m r7 = r7.P()
            java.util.Iterator r7 = r7.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r7.next()
            pf.n2 r0 = (pf.n2) r0
            r6.d(r0, r8, r9, r10)
            goto L_0x007d
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.d(pf.n2, java.util.Map, java.lang.StringBuilder, java.lang.String):void");
    }

    public final <T> ie.d<T> e(ie.d<? super T> dVar, n nVar) {
        if (!z()) {
            return dVar;
        }
        a aVar = new a(dVar, new f(dVar.e(), nVar, f23213g.incrementAndGet(f23212f)), nVar);
        c<a<?>, Boolean> cVar = f23211e;
        cVar.put(aVar, Boolean.TRUE);
        if (!z()) {
            cVar.clear();
        }
        return aVar;
    }

    public final void f(@fh.g PrintStream printStream) {
        synchronized (printStream) {
            f23207a.j(printStream);
            u2 u2Var = u2.f25116a;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @fh.g
    public final java.util.List<tf.e> g() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            tf.h r4 = f23207a     // Catch:{ all -> 0x0061 }
            boolean r5 = r4.z()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0055
            java.util.Set r4 = r4.q()     // Catch:{ all -> 0x0061 }
            if.m r4 = be.e0.v1(r4)     // Catch:{ all -> 0x0061 }
            tf.h$d r5 = new tf.h$d     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            if.m r4 = p000if.u.K2(r4, r5)     // Catch:{ all -> 0x0061 }
            tf.h$b r5 = new tf.h$b     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            if.m r4 = p000if.u.p1(r4, r5)     // Catch:{ all -> 0x0061 }
            java.util.List r4 = p000if.u.c3(r4)     // Catch:{ all -> 0x0061 }
        L_0x0049:
            if (r3 >= r2) goto L_0x0051
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0049
        L_0x0051:
            r0.unlock()
            return r4
        L_0x0055:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r4 = move-exception
        L_0x0062:
            if (r3 >= r2) goto L_0x006a
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006a:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.g():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        r7 = r7.Q1();
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] h() {
        /*
            r14 = this;
            java.util.List r0 = r14.g()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x001b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00b9
            java.lang.Object r5 = r1.next()
            tf.e r5 = (tf.e) r5
            ie.g r6 = r5.a()
            pf.t0$a r7 = pf.t0.Q
            ie.g$b r7 = r6.g(r7)
            pf.t0 r7 = (pf.t0) r7
            r8 = 0
            if (r7 == 0) goto L_0x0041
            java.lang.String r7 = r7.Q1()
            if (r7 == 0) goto L_0x0041
            java.lang.String r7 = r14.P(r7)
            goto L_0x0042
        L_0x0041:
            r7 = r8
        L_0x0042:
            pf.o0$a r9 = pf.o0.P
            ie.g$b r9 = r6.g(r9)
            pf.o0 r9 = (pf.o0) r9
            if (r9 == 0) goto L_0x0051
            java.lang.String r9 = r14.P(r9)
            goto L_0x0052
        L_0x0051:
            r9 = r8
        L_0x0052:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n                {\n                    \"name\": "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = ",\n                    \"id\": "
            r10.append(r7)
            pf.s0$a r7 = pf.s0.Q
            ie.g$b r6 = r6.g(r7)
            pf.s0 r6 = (pf.s0) r6
            if (r6 == 0) goto L_0x0076
            long r6 = r6.Q1()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
        L_0x0076:
            r10.append(r8)
            java.lang.String r6 = ",\n                    \"dispatcher\": "
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = ",\n                    \"sequenceNumber\": "
            r10.append(r6)
            long r6 = r5.f()
            r10.append(r6)
            java.lang.String r6 = ",\n                    \"state\": \""
            r10.append(r6)
            java.lang.String r6 = r5.g()
            r10.append(r6)
            java.lang.String r6 = "\"\n                } \n                "
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            java.lang.String r6 = lf.u.p(r6)
            r4.add(r6)
            le.e r6 = r5.d()
            r3.add(r6)
            java.lang.Thread r5 = r5.e()
            r2.add(r5)
            goto L_0x001b
        L_0x00b9:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r5 = 91
            r13.append(r5)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 63
            r12 = 0
            java.lang.String r4 = be.e0.h3(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.append(r4)
            r4 = 93
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            r5 = 0
            r1[r5] = r4
            r4 = 1
            java.lang.Thread[] r6 = new java.lang.Thread[r5]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r2 == 0) goto L_0x0112
            r1[r4] = r2
            r2 = 2
            le.e[] r4 = new le.e[r5]
            java.lang.Object[] r3 = r3.toArray(r4)
            if (r3 == 0) goto L_0x010c
            r1[r2] = r3
            r2 = 3
            tf.e[] r3 = new tf.e[r5]
            java.lang.Object[] r0 = r0.toArray(r3)
            if (r0 == 0) goto L_0x0106
            r1[r2] = r0
            return r1
        L_0x0106:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x010c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0112:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.h():java.lang.Object[]");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final <R> java.util.List<R> i(we.p<? super tf.h.a<?>, ? super ie.g, ? extends R> r8) {
        /*
            r7 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 1
            tf.h r5 = f23207a     // Catch:{ all -> 0x0068 }
            boolean r6 = r5.z()     // Catch:{ all -> 0x0068 }
            if (r6 == 0) goto L_0x005c
            java.util.Set r5 = r5.q()     // Catch:{ all -> 0x0068 }
            if.m r5 = be.e0.v1(r5)     // Catch:{ all -> 0x0068 }
            tf.h$d r6 = new tf.h$d     // Catch:{ all -> 0x0068 }
            r6.<init>()     // Catch:{ all -> 0x0068 }
            if.m r5 = p000if.u.K2(r5, r6)     // Catch:{ all -> 0x0068 }
            tf.h$c r6 = new tf.h$c     // Catch:{ all -> 0x0068 }
            r6.<init>(r8)     // Catch:{ all -> 0x0068 }
            if.m r8 = p000if.u.p1(r5, r6)     // Catch:{ all -> 0x0068 }
            java.util.List r8 = p000if.u.c3(r8)     // Catch:{ all -> 0x0068 }
            xe.i0.d(r4)
        L_0x004d:
            if (r3 >= r2) goto L_0x0055
            r1.lock()
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0055:
            r0.unlock()
            xe.i0.c(r4)
            return r8
        L_0x005c:
            java.lang.String r8 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0068 }
            r5.<init>(r8)     // Catch:{ all -> 0x0068 }
            throw r5     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r8 = move-exception
            xe.i0.d(r4)
        L_0x006c:
            if (r3 >= r2) goto L_0x0074
            r1.lock()
            int r3 = r3 + 1
            goto L_0x006c
        L_0x0074:
            r0.unlock()
            xe.i0.c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.i(we.p):java.util.List");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void j(java.io.PrintStream r14) {
        /*
            r13 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            tf.h r4 = f23207a     // Catch:{ all -> 0x0114 }
            boolean r5 = r4.z()     // Catch:{ all -> 0x0114 }
            if (r5 == 0) goto L_0x0108
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r5.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r6 = "Coroutines dump "
            r5.append(r6)     // Catch:{ all -> 0x0114 }
            java.text.SimpleDateFormat r6 = f23209c     // Catch:{ all -> 0x0114 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0114 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r6 = r6.format(r7)     // Catch:{ all -> 0x0114 }
            r5.append(r6)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0114 }
            r14.print(r5)     // Catch:{ all -> 0x0114 }
            java.util.Set r4 = r4.q()     // Catch:{ all -> 0x0114 }
            if.m r4 = be.e0.v1(r4)     // Catch:{ all -> 0x0114 }
            tf.h$e r5 = tf.h.e.P     // Catch:{ all -> 0x0114 }
            if.m r4 = p000if.u.p0(r4, r5)     // Catch:{ all -> 0x0114 }
            tf.h$f r5 = new tf.h$f     // Catch:{ all -> 0x0114 }
            r5.<init>()     // Catch:{ all -> 0x0114 }
            if.m r4 = p000if.u.K2(r4, r5)     // Catch:{ all -> 0x0114 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0114 }
        L_0x0068:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0114 }
            if (r5 == 0) goto L_0x00fa
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0114 }
            tf.h$a r5 = (tf.h.a) r5     // Catch:{ all -> 0x0114 }
            tf.f r6 = r5.P     // Catch:{ all -> 0x0114 }
            java.util.List r7 = r6.h()     // Catch:{ all -> 0x0114 }
            tf.h r8 = f23207a     // Catch:{ all -> 0x0114 }
            java.lang.String r9 = r6.g()     // Catch:{ all -> 0x0114 }
            java.lang.Thread r10 = r6.f23202e     // Catch:{ all -> 0x0114 }
            java.util.List r9 = r8.n(r9, r10, r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r6.g()     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = "RUNNING"
            boolean r10 = xe.l0.g(r10, r11)     // Catch:{ all -> 0x0114 }
            if (r10 == 0) goto L_0x00aa
            if (r9 != r7) goto L_0x00aa
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r10.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = r6.g()     // Catch:{ all -> 0x0114 }
            r10.append(r11)     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = " (Last suspension stacktrace, not an actual stacktrace)"
            r10.append(r11)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0114 }
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r10 = r6.g()     // Catch:{ all -> 0x0114 }
        L_0x00ae:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r11.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r12 = "\n\nCoroutine "
            r11.append(r12)     // Catch:{ all -> 0x0114 }
            ie.d<T> r5 = r5.O     // Catch:{ all -> 0x0114 }
            r11.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = ", state: "
            r11.append(r5)     // Catch:{ all -> 0x0114 }
            r11.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x0114 }
            r14.print(r5)     // Catch:{ all -> 0x0114 }
            boolean r5 = r7.isEmpty()     // Catch:{ all -> 0x0114 }
            if (r5 == 0) goto L_0x00f5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r5.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = "\n\tat "
            r5.append(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = "Coroutine creation stacktrace"
            java.lang.StackTraceElement r7 = wf.q0.d(r7)     // Catch:{ all -> 0x0114 }
            r5.append(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0114 }
            r14.print(r5)     // Catch:{ all -> 0x0114 }
            java.util.List r5 = r6.e()     // Catch:{ all -> 0x0114 }
            r8.D(r14, r5)     // Catch:{ all -> 0x0114 }
            goto L_0x0068
        L_0x00f5:
            r8.D(r14, r9)     // Catch:{ all -> 0x0114 }
            goto L_0x0068
        L_0x00fa:
            zd.u2 r14 = zd.u2.f25116a     // Catch:{ all -> 0x0114 }
        L_0x00fc:
            if (r3 >= r2) goto L_0x0104
            r1.lock()
            int r3 = r3 + 1
            goto L_0x00fc
        L_0x0104:
            r0.unlock()
            return
        L_0x0108:
            java.lang.String r14 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0114 }
            r4.<init>(r14)     // Catch:{ all -> 0x0114 }
            throw r4     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r14 = move-exception
        L_0x0115:
            if (r3 >= r2) goto L_0x011d
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0115
        L_0x011d:
            r0.unlock()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.j(java.io.PrintStream):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @fh.g
    public final java.util.List<tf.k> k() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            tf.h r4 = f23207a     // Catch:{ all -> 0x0061 }
            boolean r5 = r4.z()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0055
            java.util.Set r4 = r4.q()     // Catch:{ all -> 0x0061 }
            if.m r4 = be.e0.v1(r4)     // Catch:{ all -> 0x0061 }
            tf.h$d r5 = new tf.h$d     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            if.m r4 = p000if.u.K2(r4, r5)     // Catch:{ all -> 0x0061 }
            tf.h$g r5 = new tf.h$g     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            if.m r4 = p000if.u.p1(r4, r5)     // Catch:{ all -> 0x0061 }
            java.util.List r4 = p000if.u.c3(r4)     // Catch:{ all -> 0x0061 }
        L_0x0049:
            if (r3 >= r2) goto L_0x0051
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0049
        L_0x0051:
            r0.unlock()
            return r4
        L_0x0055:
            java.lang.String r4 = "Debug probes are not installed"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
            throw r5     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r4 = move-exception
        L_0x0062:
            if (r3 >= r2) goto L_0x006a
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006a:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.k():java.util.List");
    }

    @fh.g
    public final List<StackTraceElement> l(@fh.g e eVar, @fh.g List<StackTraceElement> list) {
        return n(eVar.g(), eVar.e(), list);
    }

    @fh.g
    public final String m(@fh.g e eVar) {
        List<StackTraceElement> l10 = l(eVar, eVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement next : l10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"declaringClass\": \"");
            sb2.append(next.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(next.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = next.getFileName();
            sb2.append(fileName != null ? P(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(next.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(u.p(sb2.toString()));
        }
        return '[' + e0.h3(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63, (Object) null) + ']';
    }

    public final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object obj;
        if (!l0.g(str, g.f23205b) || thread == null) {
            return list;
        }
        try {
            d1.a aVar = d1.P;
            obj = d1.b(thread.getStackTrace());
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
        if (d1.i(obj)) {
            obj = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            if (l0.g(stackTraceElement.getClassName(), q0.f24117a) && l0.g(stackTraceElement.getMethodName(), "resumeWith") && l0.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i10++;
        }
        u0<Integer, Integer> o10 = o(i10, stackTraceElementArr, list);
        int intValue = o10.a().intValue();
        int intValue2 = o10.b().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i10) - intValue) - 1) - intValue2);
        int i11 = i10 - intValue2;
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(stackTraceElementArr[i12]);
        }
        int size = list.size();
        for (int i13 = intValue + 1; i13 < size; i13++) {
            arrayList.add(list.get(i13));
        }
        return arrayList;
    }

    public final u0<Integer, Integer> o(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            if (i13 >= 3) {
                i11 = -1;
                i12 = 0;
                break;
            }
            int p10 = f23207a.p((i10 - 1) - i13, stackTraceElementArr, list);
            if (p10 != -1) {
                i11 = Integer.valueOf(p10);
                i12 = Integer.valueOf(i13);
                break;
            }
            i13++;
        }
        return r1.a(i11, i12);
    }

    public final int p(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) be.p.qf(stackTraceElementArr, i10);
        if (stackTraceElement == null) {
            return -1;
        }
        int i11 = 0;
        for (StackTraceElement next : list) {
            if (l0.g(next.getFileName(), stackTraceElement.getFileName()) && l0.g(next.getClassName(), stackTraceElement.getClassName()) && l0.g(next.getMethodName(), stackTraceElement.getMethodName())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public final Set<a<?>> q() {
        return f23211e.keySet();
    }

    public final String r(n2 n2Var) {
        return n2Var instanceof v2 ? ((v2) n2Var).x1() : n2Var.toString();
    }

    public final l<Boolean, u2> t() {
        Object obj;
        try {
            d1.a aVar = d1.P;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (newInstance != null) {
                obj = d1.b((l) u1.q(newInstance, 1));
                if (d1.i(obj)) {
                    obj = null;
                }
                return (l) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
    }

    public final boolean u() {
        return f23216j;
    }

    public final boolean v() {
        return f23215i;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @fh.g
    public final java.lang.String w(@fh.g pf.n2 r10) {
        /*
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            tf.h r4 = f23207a     // Catch:{ all -> 0x00c1 }
            boolean r5 = r4.z()     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x00b5
            java.util.Set r4 = r4.q()     // Catch:{ all -> 0x00c1 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00c1 }
            r5.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0038:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x00c1 }
            r7 = r6
            tf.h$a r7 = (tf.h.a) r7     // Catch:{ all -> 0x00c1 }
            ie.d<T> r7 = r7.O     // Catch:{ all -> 0x00c1 }
            ie.g r7 = r7.e()     // Catch:{ all -> 0x00c1 }
            pf.n2$b r8 = pf.n2.D     // Catch:{ all -> 0x00c1 }
            ie.g$b r7 = r7.g(r8)     // Catch:{ all -> 0x00c1 }
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x0055:
            r7 = r3
        L_0x0056:
            if (r7 == 0) goto L_0x0038
            r5.add(r6)     // Catch:{ all -> 0x00c1 }
            goto L_0x0038
        L_0x005c:
            r4 = 10
            int r4 = be.x.Y(r5, r4)     // Catch:{ all -> 0x00c1 }
            int r4 = be.z0.j(r4)     // Catch:{ all -> 0x00c1 }
            r6 = 16
            int r4 = gf.v.u(r4, r6)     // Catch:{ all -> 0x00c1 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00c1 }
            r6.<init>(r4)     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0075:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00c1 }
            r7 = r5
            tf.h$a r7 = (tf.h.a) r7     // Catch:{ all -> 0x00c1 }
            ie.d<T> r7 = r7.O     // Catch:{ all -> 0x00c1 }
            ie.g r7 = r7.e()     // Catch:{ all -> 0x00c1 }
            pf.n2 r7 = pf.r2.B(r7)     // Catch:{ all -> 0x00c1 }
            tf.h$a r5 = (tf.h.a) r5     // Catch:{ all -> 0x00c1 }
            tf.f r5 = r5.P     // Catch:{ all -> 0x00c1 }
            r6.put(r7, r5)     // Catch:{ all -> 0x00c1 }
            goto L_0x0075
        L_0x0094:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r4.<init>()     // Catch:{ all -> 0x00c1 }
            tf.h r5 = f23207a     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = ""
            r5.d(r10, r6, r4, r7)     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x00c1 }
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            xe.l0.o(r10, r4)     // Catch:{ all -> 0x00c1 }
        L_0x00a9:
            if (r3 >= r2) goto L_0x00b1
            r1.lock()
            int r3 = r3 + 1
            goto L_0x00a9
        L_0x00b1:
            r0.unlock()
            return r10
        L_0x00b5:
            java.lang.String r10 = "Debug probes are not installed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00c1 }
            r4.<init>(r10)     // Catch:{ all -> 0x00c1 }
            throw r4     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r10 = move-exception
        L_0x00c2:
            if (r3 >= r2) goto L_0x00ca
            r1.lock()
            int r3 = r3 + 1
            goto L_0x00c2
        L_0x00ca:
            r0.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.w(pf.n2):java.lang.String");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void x() {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f23214h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            int r4 = installations     // Catch:{ all -> 0x0069 }
            r5 = 1
            int r4 = r4 + r5
            installations = r4     // Catch:{ all -> 0x0069 }
            int r4 = installations     // Catch:{ all -> 0x0069 }
            if (r4 <= r5) goto L_0x0039
        L_0x002d:
            if (r3 >= r2) goto L_0x0035
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0035:
            r0.unlock()
            return
        L_0x0039:
            tf.h r4 = f23207a     // Catch:{ all -> 0x0069 }
            r4.M()     // Catch:{ all -> 0x0069 }
            tf.a r4 = tf.a.f23176a     // Catch:{ all -> 0x0069 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0052
        L_0x0046:
            if (r3 >= r2) goto L_0x004e
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0046
        L_0x004e:
            r0.unlock()
            return
        L_0x0052:
            we.l<java.lang.Boolean, zd.u2> r4 = f23217k     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x005b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0069 }
            r4.A(r5)     // Catch:{ all -> 0x0069 }
        L_0x005b:
            zd.u2 r4 = zd.u2.f25116a     // Catch:{ all -> 0x0069 }
        L_0x005d:
            if (r3 >= r2) goto L_0x0065
            r1.lock()
            int r3 = r3 + 1
            goto L_0x005d
        L_0x0065:
            r0.unlock()
            return
        L_0x0069:
            r4 = move-exception
        L_0x006a:
            if (r3 >= r2) goto L_0x0072
            r1.lock()
            int r3 = r3 + 1
            goto L_0x006a
        L_0x0072:
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.h.x():void");
    }

    public final boolean y(a<?> aVar) {
        n2 n2Var;
        ie.g c10 = aVar.P.c();
        if (c10 == null || (n2Var = (n2) c10.g(n2.D)) == null || !n2Var.m()) {
            return false;
        }
        f23211e.remove(aVar);
        return true;
    }

    public final boolean z() {
        return installations > 0;
    }
}
