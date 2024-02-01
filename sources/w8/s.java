package w8;

import d.m0;
import e8.a;
import java.util.HashMap;

@a
public class s {
    @a
    public static void a(@m0 StringBuilder sb2, @m0 HashMap<String, String> hashMap) {
        sb2.append(p7.a.f11638i);
        boolean z10 = true;
        for (String next : hashMap.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str = hashMap.get(next);
            sb2.append("\"");
            sb2.append(next);
            sb2.append("\":");
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append(p7.a.f11639j);
    }
}
