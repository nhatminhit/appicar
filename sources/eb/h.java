package eb;

import java.nio.charset.StandardCharsets;
import qa.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f18541a;

    /* renamed from: b  reason: collision with root package name */
    public l f18542b;

    /* renamed from: c  reason: collision with root package name */
    public f f18543c;

    /* renamed from: d  reason: collision with root package name */
    public f f18544d;

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f18545e;

    /* renamed from: f  reason: collision with root package name */
    public int f18546f;

    /* renamed from: g  reason: collision with root package name */
    public int f18547g;

    /* renamed from: h  reason: collision with root package name */
    public k f18548h;

    /* renamed from: i  reason: collision with root package name */
    public int f18549i;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 != '?' || str.charAt(i10) == '?') {
                sb2.append(c10);
                i10++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f18541a = sb2.toString();
        this.f18542b = l.FORCE_NONE;
        this.f18545e = new StringBuilder(str.length());
        this.f18547g = -1;
    }

    public int a() {
        return this.f18545e.length();
    }

    public StringBuilder b() {
        return this.f18545e;
    }

    public char c() {
        return this.f18541a.charAt(this.f18546f);
    }

    public char d() {
        return this.f18541a.charAt(this.f18546f);
    }

    public String e() {
        return this.f18541a;
    }

    public int f() {
        return this.f18547g;
    }

    public int g() {
        return i() - this.f18546f;
    }

    public k h() {
        return this.f18548h;
    }

    public final int i() {
        return this.f18541a.length() - this.f18549i;
    }

    public boolean j() {
        return this.f18546f < i();
    }

    public void k() {
        this.f18547g = -1;
    }

    public void l() {
        this.f18548h = null;
    }

    public void m(f fVar, f fVar2) {
        this.f18543c = fVar;
        this.f18544d = fVar2;
    }

    public void n(int i10) {
        this.f18549i = i10;
    }

    public void o(l lVar) {
        this.f18542b = lVar;
    }

    public void p(int i10) {
        this.f18547g = i10;
    }

    public void q() {
        r(a());
    }

    public void r(int i10) {
        k kVar = this.f18548h;
        if (kVar == null || i10 > kVar.b()) {
            this.f18548h = k.o(i10, this.f18542b, this.f18543c, this.f18544d, true);
        }
    }

    public void s(char c10) {
        this.f18545e.append(c10);
    }

    public void t(String str) {
        this.f18545e.append(str);
    }
}
