package n5;

import i5.g;
import i5.h;
import java.io.IOException;
import w4.l;
import w4.p;

public class y extends e0<StackTraceElement> {
    public static final long U = 1;

    public y() {
        super((Class<?>) StackTraceElement.class);
    }

    @Deprecated
    public StackTraceElement E0(g gVar, String str, String str2, String str3, int i10, String str4, String str5) {
        return F0(gVar, str, str2, str3, i10, str4, str5, (String) null);
    }

    public StackTraceElement F0(g gVar, String str, String str2, String str3, int i10, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i10);
    }

    /* renamed from: G0 */
    public StackTraceElement f(l lVar, g gVar) throws IOException {
        p P = lVar.P();
        if (P == p.START_OBJECT) {
            int i10 = -1;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = "";
            String str5 = str4;
            String str6 = str5;
            while (true) {
                p E2 = lVar.E2();
                if (E2 == p.END_OBJECT) {
                    return F0(gVar, str4, str5, str6, i10, str, str2, str3);
                }
                String X0 = lVar.X0();
                if ("className".equals(X0)) {
                    str4 = lVar.Y1();
                } else if ("classLoaderName".equals(X0)) {
                    str3 = lVar.Y1();
                } else if ("fileName".equals(X0)) {
                    str6 = lVar.Y1();
                } else if ("lineNumber".equals(X0)) {
                    i10 = E2.j() ? lVar.N1() : c0(lVar, gVar);
                } else if ("methodName".equals(X0)) {
                    str5 = lVar.Y1();
                } else if (!"nativeMethod".equals(X0)) {
                    if ("moduleName".equals(X0)) {
                        str = lVar.Y1();
                    } else if ("moduleVersion".equals(X0)) {
                        str2 = lVar.Y1();
                    } else if (!"declaringClass".equals(X0) && !"format".equals(X0)) {
                        A0(lVar, gVar, this.O, X0);
                    }
                }
                lVar.Z2();
            }
        } else if (P != p.START_ARRAY || !gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (StackTraceElement) gVar.i0(this.O, lVar);
        } else {
            lVar.D2();
            StackTraceElement G0 = f(lVar, gVar);
            if (lVar.D2() != p.END_ARRAY) {
                z0(lVar, gVar);
            }
            return G0;
        }
    }
}
