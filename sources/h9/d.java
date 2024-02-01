package h9;

import d.m0;
import d.o0;

public final class d extends IllegalStateException {
    public d(String str, @o0 Throwable th2) {
        super(str, th2);
    }

    @m0
    public static IllegalStateException a(@m0 m<?> mVar) {
        if (!mVar.u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception q10 = mVar.q();
        return new d("Complete with: ".concat(q10 != null ? "failure" : mVar.v() ? "result ".concat(String.valueOf(mVar.r())) : mVar.t() ? "cancellation" : "unknown issue"), q10);
    }
}
