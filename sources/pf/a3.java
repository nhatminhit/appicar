package pf;

import fh.g;
import kotlin.Metadata;
import wf.w;
import wf.y;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lpf/a3;", "Lwf/w;", "Lpf/g2;", "", "state", "b1", "toString", "", "c", "()Z", "isActive", "K", "()Lpf/a3;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a3 extends w implements g2 {
    @g
    public a3 K() {
        return this;
    }

    @g
    public final String b1(@g String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        boolean z10 = true;
        for (y yVar = (y) I0(); !l0.g(yVar, this); yVar = yVar.J0()) {
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(u2Var);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public boolean c() {
        return true;
    }

    @g
    public String toString() {
        return super.toString();
    }
}
