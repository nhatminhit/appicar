package og;

import ch.f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class r {
    public static String a(String str, String str2) {
        return b(str, str2, StandardCharsets.ISO_8859_1);
    }

    public static String b(String str, String str2, Charset charset) {
        String b10 = f.n(str + ":" + str2, charset).b();
        return "Basic " + b10;
    }
}
