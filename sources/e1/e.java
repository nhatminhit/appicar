package e1;

import android.util.Half;
import d.t0;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0007H\b¨\u0006\t"}, d2 = {"", "Landroid/util/Half;", "d", "", "b", "", "a", "", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class e {
    @t0(26)
    @g
    public static final Half a(double d10) {
        Half valueOf = Half.valueOf((float) d10);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @t0(26)
    @g
    public static final Half b(float f10) {
        Half valueOf = Half.valueOf(f10);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @t0(26)
    @g
    public static final Half c(@g String str) {
        l0.p(str, "<this>");
        Half valueOf = Half.valueOf(str);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @t0(26)
    @g
    public static final Half d(short s10) {
        Half valueOf = Half.valueOf(s10);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
