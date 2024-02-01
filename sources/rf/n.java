package rf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import rf.i0;
import rf.m0;
import wf.t0;
import zd.b1;
import zd.i0;
import zd.k;
import zd.m;
import zf.d;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lrf/n;", "E", "Lrf/m0;", "Lrf/i0;", "F", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface n<E> extends m0<E>, i0<E> {
    @g
    public static final b F = b.f22531a;
    public static final int G = Integer.MAX_VALUE;
    public static final int H = 0;
    public static final int I = -1;
    public static final int J = -2;
    public static final int K = -3;
    @g
    public static final String L = "kotlinx.coroutines.channels.defaultBuffer";

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @g
        public static <E> d<E> b(@g n<E> nVar) {
            return i0.a.d(nVar);
        }

        @k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@g n<E> nVar, E e10) {
            return m0.a.c(nVar, e10);
        }

        @h
        @k(level = m.P, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E d(@g n<E> nVar) {
            return i0.a.h(nVar);
        }

        @h
        @oe.h
        @k(level = m.P, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object e(@g n<E> nVar, @g ie.d<? super E> dVar) {
            return i0.a.i(nVar, dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lrf/n$b;", "", "", "b", "I", "UNLIMITED", "c", "RENDEZVOUS", "d", "CONFLATED", "e", "BUFFERED", "f", "OPTIONAL_CHANNEL", "", "g", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", "h", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f22531a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f22532b = Integer.MAX_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public static final int f22533c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f22534d = -1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f22535e = -2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f22536f = -3;
        @g

        /* renamed from: g  reason: collision with root package name */
        public static final String f22537g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: h  reason: collision with root package name */
        public static final int f22538h = t0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return f22538h;
        }
    }
}
