package uf;

import fh.g;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Luf/o0;", "", "Luf/t0;", "", "subscriptionCount", "Luf/i;", "Luf/m0;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface o0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final a f23358a = a.f23359a;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Luf/o0$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Luf/o0;", "a", "b", "Luf/o0;", "c", "()Luf/o0;", "Eagerly", "d", "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f23359a = new a();
        @g

        /* renamed from: b  reason: collision with root package name */
        public static final o0 f23360b = new q0();
        @g

        /* renamed from: c  reason: collision with root package name */
        public static final o0 f23361c = new r0();

        public static /* synthetic */ o0 b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        @g
        public final o0 a(long j10, long j11) {
            return new s0(j10, j11);
        }

        @g
        public final o0 c() {
            return f23360b;
        }

        @g
        public final o0 d() {
            return f23361c;
        }
    }

    @g
    i<m0> a(@g t0<Integer> t0Var);
}
