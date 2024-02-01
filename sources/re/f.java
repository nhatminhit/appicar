package re;

import java.io.File;
import xe.l0;

public final class f {
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "sb.toString()");
        return sb3;
    }
}
