package y0;

import android.util.Base64;
import d.e;
import d.m0;
import d.o0;
import d.x0;
import e1.n;
import java.util.List;
import p7.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f15244a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15245b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15246c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f15247d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15248e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15249f;

    public d(@m0 String str, @m0 String str2, @m0 String str3, @e int i10) {
        this.f15244a = (String) n.g(str);
        this.f15245b = (String) n.g(str2);
        this.f15246c = (String) n.g(str3);
        this.f15247d = null;
        n.a(i10 != 0);
        this.f15248e = i10;
        this.f15249f = a(str, str2, str3);
    }

    public d(@m0 String str, @m0 String str2, @m0 String str3, @m0 List<List<byte[]>> list) {
        this.f15244a = (String) n.g(str);
        this.f15245b = (String) n.g(str2);
        this.f15246c = (String) n.g(str3);
        this.f15247d = (List) n.g(list);
        this.f15248e = 0;
        this.f15249f = a(str, str2, str3);
    }

    public final String a(@m0 String str, @m0 String str2, @m0 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @o0
    public List<List<byte[]>> b() {
        return this.f15247d;
    }

    @e
    public int c() {
        return this.f15248e;
    }

    @x0({x0.a.LIBRARY})
    @m0
    public String d() {
        return this.f15249f;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f15249f;
    }

    @m0
    public String f() {
        return this.f15244a;
    }

    @m0
    public String g() {
        return this.f15245b;
    }

    @m0
    public String h() {
        return this.f15246c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f15244a + ", mProviderPackage: " + this.f15245b + ", mQuery: " + this.f15246c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f15247d.size(); i10++) {
            sb2.append(" [");
            List list = this.f15247d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append(a.f11639j);
        sb2.append("mCertificatesArray: " + this.f15248e);
        return sb2.toString();
    }
}
