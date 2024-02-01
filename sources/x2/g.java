package x2;

import d.o0;
import d.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f15035a = new String[0];

    public static void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    @o0
    public static String b(@o0 List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(Integer.toString(list.get(i10).intValue()));
            if (i10 < size - 1) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public static StringBuilder c() {
        return new StringBuilder();
    }

    @o0
    public static List<Integer> d(@o0 String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException unused) {
            }
        }
        return arrayList;
    }
}
