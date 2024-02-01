package re;

import be.w;
import be.x;
import fh.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lf.c0;
import xe.l0;

public class n {
    @g
    public static final File a(@g File file) {
        l0.p(file, "<this>");
        return new File(c(file));
    }

    public static final int b(String str) {
        char c10;
        int r32;
        int r33 = c0.r3(str, File.separatorChar, 0, false, 4, (Object) null);
        if (r33 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c10 = File.separatorChar) || (r32 = c0.r3(str, c10, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int r34 = c0.r3(str, File.separatorChar, r32 + 1, false, 4, (Object) null);
            return r34 >= 0 ? r34 + 1 : str.length();
        } else if (r33 > 0 && str.charAt(r33 - 1) == ':') {
            return r33 + 1;
        } else {
            if (r33 != -1 || !c0.b3(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    @g
    public static final String c(@g File file) {
        l0.p(file, "<this>");
        String path = file.getPath();
        l0.o(path, "path");
        String path2 = file.getPath();
        l0.o(path2, "path");
        String substring = path.substring(0, b(path2));
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean d(@g File file) {
        l0.p(file, "<this>");
        String path = file.getPath();
        l0.o(path, "path");
        return b(path) > 0;
    }

    @g
    public static final File e(@g File file, int i10, int i11) {
        l0.p(file, "<this>");
        return f(file).j(i10, i11);
    }

    @g
    public static final i f(@g File file) {
        List list;
        l0.p(file, "<this>");
        String path = file.getPath();
        l0.o(path, "path");
        int b10 = b(path);
        String substring = path.substring(0, b10);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(b10);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = w.E();
        } else {
            List<String> T4 = c0.T4(substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(x.Y(T4, 10));
            for (String file2 : T4) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new i(new File(substring), list);
    }
}
