package vd;

import java.util.HashMap;
import java.util.Map;
import w7.l;

public class a {
    public static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        for (String split : str.split("&")) {
            String[] split2 = split.split(l.f14755k);
            hashMap.put(td.a.a(split2[0]), split2.length > 1 ? td.a.a(split2[1]) : "");
        }
        return hashMap;
    }

    public static String b(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(td.a.b((String) next.getKey()));
            sb2.append(l.f14755k);
            sb2.append(td.a.b((String) next.getValue()));
        }
        return sb2.toString();
    }
}
