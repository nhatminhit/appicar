package xa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import qa.r;
import w0.d;

public final class v extends u {
    public static void q(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
            collection2.add((Object) null);
            return;
        }
        collection.add(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        if (substring.startsWith("via=")) {
            str2 = substring.substring(4);
        }
        collection2.add(str2);
    }

    /* renamed from: r */
    public w k(r rVar) {
        String str;
        String c10 = u.c(rVar);
        String str2 = null;
        if (!c10.startsWith("sms:") && !c10.startsWith("SMS:") && !c10.startsWith("mms:") && !c10.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m10 = u.m(c10);
        boolean z10 = false;
        if (m10 == null || m10.isEmpty()) {
            str = null;
        } else {
            str2 = m10.get(d.f14363h);
            str = m10.get("body");
            z10 = true;
        }
        int indexOf = c10.indexOf(63, 4);
        String substring = (indexOf < 0 || !z10) ? c10.substring(4) : c10.substring(4, indexOf);
        int i10 = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i11 = i10 + 1;
            int indexOf2 = substring.indexOf(44, i11);
            if (indexOf2 > i10) {
                q(arrayList, arrayList2, substring.substring(i11, indexOf2));
                i10 = indexOf2;
            } else {
                q(arrayList, arrayList2, substring.substring(i11));
                String[] strArr = u.f24476f;
                return new w((String[]) arrayList.toArray(strArr), (String[]) arrayList2.toArray(strArr), str2, str);
            }
        }
    }
}
