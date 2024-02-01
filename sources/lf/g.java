package lf;

import java.nio.charset.Charset;
import oe.f;
import ve.h;
import xe.l0;

@h(name = "CharsetsKt")
public final class g {
    @f
    public static final Charset a(String str) {
        l0.p(str, "charsetName");
        Charset forName = Charset.forName(str);
        l0.o(forName, "forName(charsetName)");
        return forName;
    }
}
