package wf;

import fh.g;
import kotlin.Metadata;
import pf.u0;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lwf/j;", "Lpf/u0;", "", "toString", "Lie/g;", "O", "Lie/g;", "H", "()Lie/g;", "coroutineContext", "context", "<init>", "(Lie/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class j implements u0 {
    @g
    public final ie.g O;

    public j(@g ie.g gVar) {
        this.O = gVar;
    }

    @g
    public ie.g H() {
        return this.O;
    }

    @g
    public String toString() {
        return "CoroutineScope(coroutineContext=" + H() + ')';
    }
}
