package pf;

import fh.g;
import kotlin.Metadata;
import wf.r0;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001a\u0010\n\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0002\u0010\r\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u001a\u0010\u001a\u001a\u00020\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u0019\u0010\t*\u001e\b\u0002\u0010\u001d\u001a\u0004\b\u0000\u0010\u001b\"\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0012\u0004\u0012\u00028\u00000\u001c¨\u0006\u001e"}, d2 = {"", "timeMillis", "d", "timeNanos", "c", "Lwf/r0;", "a", "Lwf/r0;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "", "b", "I", "SCHEDULE_OK", "SCHEDULE_COMPLETED", "SCHEDULE_DISPOSED", "e", "J", "MS_TO_NS", "f", "MAX_MS", "g", "MAX_DELAY_NS", "h", "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", "T", "Lwf/b0;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class x1 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f22045a = new r0("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    public static final int f22046b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f22047c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f22048d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final long f22049e = 1000000;

    /* renamed from: f  reason: collision with root package name */
    public static final long f22050f = 9223372036854L;

    /* renamed from: g  reason: collision with root package name */
    public static final long f22051g = 4611686018427387903L;
    @g

    /* renamed from: h  reason: collision with root package name */
    public static final r0 f22052h = new r0("CLOSED_EMPTY");

    public static final long c(long j10) {
        return j10 / 1000000;
    }

    public static final long d(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= f22050f) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }
}
