package ob;

import qa.m;
import ya.a;

public final class e extends i {

    /* renamed from: f  reason: collision with root package name */
    public static final int f21325f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final int f21326g = 20;

    /* renamed from: h  reason: collision with root package name */
    public static final int f21327h = 16;

    /* renamed from: d  reason: collision with root package name */
    public final String f21328d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21329e;

    public e(a aVar, String str, String str2) {
        super(aVar);
        this.f21328d = str2;
        this.f21329e = str;
    }

    public String d() throws m {
        if (c().s() == 84) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            j(sb2, 48, 20);
            k(sb2, 68);
            return sb2.toString();
        }
        throw m.a();
    }

    public void h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f21329e);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    public int i(int i10) {
        return i10 % 100000;
    }

    public final void k(StringBuilder sb2, int i10) {
        int f10 = b().f(i10, 16);
        if (f10 != 38400) {
            sb2.append('(');
            sb2.append(this.f21328d);
            sb2.append(')');
            int i11 = f10 % 32;
            int i12 = f10 / 32;
            int i13 = (i12 % 12) + 1;
            int i14 = i12 / 12;
            if (i14 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i14);
            if (i13 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i13);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
        }
    }
}
