package rh;

import ch.c;
import ch.d;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import og.b0;
import og.c0;
import og.e0;
import og.f0;
import og.j0;
import og.k0;
import og.y;

public final class s {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f22681l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final String f22682m = " \"<>^`{}|\\?#";

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f22683n = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f22684a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f22685b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f22686c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public c0.a f22687d;

    /* renamed from: e  reason: collision with root package name */
    public final j0.a f22688e = new j0.a();

    /* renamed from: f  reason: collision with root package name */
    public final b0.a f22689f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public e0 f22690g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f22691h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public f0.a f22692i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public y.a f22693j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public k0 f22694k;

    public static class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final k0 f22695a;

        /* renamed from: b  reason: collision with root package name */
        public final e0 f22696b;

        public a(k0 k0Var, e0 e0Var) {
            this.f22695a = k0Var;
            this.f22696b = e0Var;
        }

        public long a() throws IOException {
            return this.f22695a.a();
        }

        public e0 b() {
            return this.f22696b;
        }

        public void j(d dVar) throws IOException {
            this.f22695a.j(dVar);
        }
    }

    public s(String str, c0 c0Var, @Nullable String str2, @Nullable b0 b0Var, @Nullable e0 e0Var, boolean z10, boolean z11, boolean z12) {
        this.f22684a = str;
        this.f22685b = c0Var;
        this.f22686c = str2;
        this.f22690g = e0Var;
        this.f22691h = z10;
        this.f22689f = b0Var != null ? b0Var.j() : new b0.a();
        if (z11) {
            this.f22693j = new y.a();
        } else if (z12) {
            f0.a aVar = new f0.a();
            this.f22692i = aVar;
            aVar.g(f0.f21554j);
        }
    }

    public static String i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || f22682m.indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                c cVar = new c();
                cVar.O0(str, 0, i10);
                j(cVar, str, i10, length, z10);
                return cVar.o1();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static void j(c cVar, String str, int i10, int i11, boolean z10) {
        c cVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || f22682m.indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new c();
                    }
                    cVar2.J(codePointAt);
                    while (!cVar2.X()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        char[] cArr = f22681l;
                        cVar.writeByte(cArr[(readByte >> 4) & 15]);
                        cVar.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    cVar.J(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f22693j.b(str, str2);
        } else {
            this.f22693j.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (hh.c.f19573f.equalsIgnoreCase(str)) {
            try {
                this.f22690g = e0.c(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        } else {
            this.f22689f.b(str, str2);
        }
    }

    public void c(b0 b0Var) {
        this.f22689f.e(b0Var);
    }

    public void d(b0 b0Var, k0 k0Var) {
        this.f22692i.c(b0Var, k0Var);
    }

    public void e(f0.b bVar) {
        this.f22692i.d(bVar);
    }

    public void f(String str, String str2, boolean z10) {
        if (this.f22686c != null) {
            String i10 = i(str2, z10);
            String str3 = this.f22686c;
            String replace = str3.replace(p7.a.f11638i + str + p7.a.f11639j, i10);
            if (!f22683n.matcher(replace).matches()) {
                this.f22686c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    public void g(String str, @Nullable String str2, boolean z10) {
        String str3 = this.f22686c;
        if (str3 != null) {
            c0.a t10 = this.f22685b.t(str3);
            this.f22687d = t10;
            if (t10 != null) {
                this.f22686c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f22685b + ", Relative: " + this.f22686c);
            }
        }
        if (z10) {
            this.f22687d.c(str, str2);
        } else {
            this.f22687d.g(str, str2);
        }
    }

    public <T> void h(Class<T> cls, @Nullable T t10) {
        this.f22688e.o(cls, t10);
    }

    public j0.a k() {
        c0 c0Var;
        c0.a aVar = this.f22687d;
        if (aVar != null) {
            c0Var = aVar.h();
        } else {
            c0Var = this.f22685b.O(this.f22686c);
            if (c0Var == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f22685b + ", Relative: " + this.f22686c);
            }
        }
        a aVar2 = this.f22694k;
        if (aVar2 == null) {
            y.a aVar3 = this.f22693j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                f0.a aVar4 = this.f22692i;
                if (aVar4 != null) {
                    aVar2 = aVar4.f();
                } else if (this.f22691h) {
                    aVar2 = k0.f((e0) null, new byte[0]);
                }
            }
        }
        e0 e0Var = this.f22690g;
        if (e0Var != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, e0Var);
            } else {
                this.f22689f.b(hh.c.f19573f, e0Var.toString());
            }
        }
        return this.f22688e.s(c0Var).i(this.f22689f.i()).j(this.f22684a, aVar2);
    }

    public void l(k0 k0Var) {
        this.f22694k = k0Var;
    }

    public void m(Object obj) {
        this.f22686c = obj.toString();
    }
}
