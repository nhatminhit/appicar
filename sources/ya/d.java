package ya;

import b6.c;
import dg.a;
import java.util.HashMap;
import java.util.Map;
import qa.h;

public enum d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, a.Jd}, (int) new String[]{c.f4237k}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{l.f24692c, "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: r0  reason: collision with root package name */
    public static final Map<Integer, d> f24653r0 = null;

    /* renamed from: s0  reason: collision with root package name */
    public static final Map<String, d> f24654s0 = null;
    public final int[] O;
    public final String[] P;

    /* access modifiers changed from: public */
    static {
        f24653r0 = new HashMap();
        f24654s0 = new HashMap();
        for (d dVar : values()) {
            for (int valueOf : dVar.O) {
                f24653r0.put(Integer.valueOf(valueOf), dVar);
            }
            f24654s0.put(dVar.name(), dVar);
            for (String put : dVar.P) {
                f24654s0.put(put, dVar);
            }
        }
    }

    /* access modifiers changed from: public */
    d(int i10) {
        this(r3, r4, new int[]{i10}, new String[0]);
    }

    /* access modifiers changed from: public */
    d(int i10, String... strArr) {
        this.O = new int[]{i10};
        this.P = strArr;
    }

    /* access modifiers changed from: public */
    d(int[] iArr, String... strArr) {
        this.O = iArr;
        this.P = strArr;
    }

    public static d a(String str) {
        return f24654s0.get(str);
    }

    public static d b(int i10) throws h {
        if (i10 >= 0 && i10 < 900) {
            return f24653r0.get(Integer.valueOf(i10));
        }
        throw h.a();
    }

    public int d() {
        return this.O[0];
    }
}
