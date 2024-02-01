package xa;

import qa.r;

public final class y extends u {
    /* renamed from: q */
    public h k(r rVar) {
        String str;
        String str2;
        String c10 = u.c(rVar);
        if (!c10.startsWith("smtp:") && !c10.startsWith("SMTP:")) {
            return null;
        }
        String substring = c10.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                String substring3 = substring2.substring(indexOf2 + 1);
                str2 = substring2.substring(0, indexOf2);
                str = substring3;
            } else {
                str = null;
                str2 = substring2;
            }
        } else {
            str2 = null;
            str = null;
        }
        return new h(new String[]{substring}, (String[]) null, (String[]) null, str2, str);
    }
}
