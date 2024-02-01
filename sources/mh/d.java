package mh;

import java.util.Iterator;
import java.util.regex.Pattern;

public abstract class d {

    public static final class a extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class a0 extends o {
        public a0(int i10, int i11) {
            super(i10, i11);
        }

        public int b(jh.h hVar, jh.h hVar2) {
            return hVar2.U().H0().size() - hVar2.V0();
        }

        public String c() {
            return "nth-last-child";
        }
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21115a;

        public b(String str) {
            this.f21115a = str;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.G(this.f21115a);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.f21115a});
        }
    }

    public static class b0 extends o {
        public b0(int i10, int i11) {
            super(i10, i11);
        }

        public int b(jh.h hVar, jh.h hVar2) {
            c H0 = hVar2.U().H0();
            int i10 = 0;
            for (int V0 = hVar2.V0(); V0 < H0.size(); V0++) {
                if (((jh.h) H0.get(V0)).i2().equals(hVar2.i2())) {
                    i10++;
                }
            }
            return i10;
        }

        public String c() {
            return "nth-last-of-type";
        }
    }

    public static abstract class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21116a;

        /* renamed from: b  reason: collision with root package name */
        public String f21117b;

        public c(String str, String str2) {
            this(str, str2, true);
        }

        public c(String str, String str2, boolean z10) {
            hh.d.h(str);
            hh.d.h(str2);
            this.f21116a = ih.b.b(str);
            boolean z11 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z11 ? str2.substring(1, str2.length() - 1) : str2;
            this.f21117b = z10 ? ih.b.b(str2) : ih.b.c(str2, z11);
        }
    }

    public static class c0 extends o {
        public c0(int i10, int i11) {
            super(i10, i11);
        }

        public int b(jh.h hVar, jh.h hVar2) {
            Iterator it = hVar2.U().H0().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                jh.h hVar3 = (jh.h) it.next();
                if (hVar3.i2().equals(hVar2.i2())) {
                    i10++;
                    continue;
                }
                if (hVar3 == hVar2) {
                    break;
                }
            }
            return i10;
        }

        public String c() {
            return "nth-of-type";
        }
    }

    /* renamed from: mh.d$d  reason: collision with other inner class name */
    public static final class C0367d extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21118a;

        public C0367d(String str) {
            hh.d.h(str);
            this.f21118a = ih.b.a(str);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            for (jh.a g10 : hVar2.p().r()) {
                if (ih.b.a(g10.getKey()).startsWith(this.f21118a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", new Object[]{this.f21118a});
        }
    }

    public static final class d0 extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            jh.h P1 = hVar2.U();
            return P1 != null && !(P1 instanceof jh.f) && hVar2.h2().isEmpty();
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class e extends c {
        public e(String str, String str2) {
            super(str, str2);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.G(this.f21116a) && this.f21117b.equalsIgnoreCase(hVar2.m(this.f21116a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", new Object[]{this.f21116a, this.f21117b});
        }
    }

    public static final class e0 extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            jh.h P1 = hVar2.U();
            if (P1 == null || (P1 instanceof jh.f)) {
                return false;
            }
            Iterator it = P1.H0().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (((jh.h) it.next()).i2().equals(hVar2.i2())) {
                    i10++;
                }
            }
            return i10 == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class f extends c {
        public f(String str, String str2) {
            super(str, str2);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.G(this.f21116a) && ih.b.a(hVar2.m(this.f21116a)).contains(this.f21117b);
        }

        public String toString() {
            return String.format("[%s*=%s]", new Object[]{this.f21116a, this.f21117b});
        }
    }

    public static final class f0 extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            if (hVar instanceof jh.f) {
                hVar = hVar.F0(0);
            }
            return hVar2 == hVar;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class g extends c {
        public g(String str, String str2) {
            super(str, str2, false);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.G(this.f21116a) && ih.b.a(hVar2.m(this.f21116a)).endsWith(this.f21117b);
        }

        public String toString() {
            return String.format("[%s$=%s]", new Object[]{this.f21116a, this.f21117b});
        }
    }

    public static final class g0 extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            if (hVar2 instanceof jh.o) {
                return true;
            }
            for (jh.p next : hVar2.n2()) {
                jh.o oVar = new jh.o(kh.h.w(hVar2.j2()), hVar2.q(), hVar2.p());
                next.d0(oVar);
                oVar.v0(next);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static final class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21119a;

        /* renamed from: b  reason: collision with root package name */
        public Pattern f21120b;

        public h(String str, Pattern pattern) {
            this.f21119a = ih.b.b(str);
            this.f21120b = pattern;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.G(this.f21119a) && this.f21120b.matcher(hVar2.m(this.f21119a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", new Object[]{this.f21119a, this.f21120b.toString()});
        }
    }

    public static final class h0 extends d {

        /* renamed from: a  reason: collision with root package name */
        public Pattern f21121a;

        public h0(Pattern pattern) {
            this.f21121a = pattern;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return this.f21121a.matcher(hVar2.l2()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", new Object[]{this.f21121a});
        }
    }

    public static final class i extends c {
        public i(String str, String str2) {
            super(str, str2);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return !this.f21117b.equalsIgnoreCase(hVar2.m(this.f21116a));
        }

        public String toString() {
            return String.format("[%s!=%s]", new Object[]{this.f21116a, this.f21117b});
        }
    }

    public static final class i0 extends d {

        /* renamed from: a  reason: collision with root package name */
        public Pattern f21122a;

        public i0(Pattern pattern) {
            this.f21122a = pattern;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return this.f21122a.matcher(hVar2.N1()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", new Object[]{this.f21122a});
        }
    }

    public static final class j extends c {
        public j(String str, String str2) {
            super(str, str2, false);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.G(this.f21116a) && ih.b.a(hVar2.m(this.f21116a)).startsWith(this.f21117b);
        }

        public String toString() {
            return String.format("[%s^=%s]", new Object[]{this.f21116a, this.f21117b});
        }
    }

    public static final class j0 extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21123a;

        public j0(String str) {
            this.f21123a = str;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.M1().equals(this.f21123a);
        }

        public String toString() {
            return String.format(jc.e.f19914e, new Object[]{this.f21123a});
        }
    }

    public static final class k extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21124a;

        public k(String str) {
            this.f21124a = str;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.v1(this.f21124a);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.f21124a});
        }
    }

    public static final class k0 extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21125a;

        public k0(String str) {
            this.f21125a = str;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.M1().endsWith(this.f21125a);
        }

        public String toString() {
            return String.format(jc.e.f19914e, new Object[]{this.f21125a});
        }
    }

    public static final class l extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21126a;

        public l(String str) {
            this.f21126a = ih.b.a(str);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return ih.b.a(hVar2.R0()).contains(this.f21126a);
        }

        public String toString() {
            return String.format(":containsData(%s)", new Object[]{this.f21126a});
        }
    }

    public static final class m extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21127a;

        public m(String str) {
            this.f21127a = ih.b.a(str);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return ih.b.a(hVar2.N1()).contains(this.f21127a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", new Object[]{this.f21127a});
        }
    }

    public static final class n extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21128a;

        public n(String str) {
            this.f21128a = ih.b.a(str);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return ih.b.a(hVar2.l2()).contains(this.f21128a);
        }

        public String toString() {
            return String.format(":contains(%s)", new Object[]{this.f21128a});
        }
    }

    public static abstract class o extends d {

        /* renamed from: a  reason: collision with root package name */
        public final int f21129a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21130b;

        public o(int i10) {
            this(0, i10);
        }

        public o(int i10, int i11) {
            this.f21129a = i10;
            this.f21130b = i11;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            jh.h P1 = hVar2.U();
            if (P1 == null || (P1 instanceof jh.f)) {
                return false;
            }
            int b10 = b(hVar, hVar2);
            int i10 = this.f21129a;
            if (i10 == 0) {
                return b10 == this.f21130b;
            }
            int i11 = this.f21130b;
            return (b10 - i11) * i10 >= 0 && (b10 - i11) % i10 == 0;
        }

        public abstract int b(jh.h hVar, jh.h hVar2);

        public abstract String c();

        public String toString() {
            if (this.f21129a == 0) {
                return String.format(":%s(%d)", new Object[]{c(), Integer.valueOf(this.f21130b)});
            } else if (this.f21130b == 0) {
                return String.format(":%s(%dn)", new Object[]{c(), Integer.valueOf(this.f21129a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{c(), Integer.valueOf(this.f21129a), Integer.valueOf(this.f21130b)});
            }
        }
    }

    public static final class p extends d {

        /* renamed from: a  reason: collision with root package name */
        public String f21131a;

        public p(String str) {
            this.f21131a = str;
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return this.f21131a.equals(hVar2.z1());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.f21131a});
        }
    }

    public static final class q extends r {
        public q(int i10) {
            super(i10);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.V0() == this.f21132a;
        }

        public String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.f21132a)});
        }
    }

    public static abstract class r extends d {

        /* renamed from: a  reason: collision with root package name */
        public int f21132a;

        public r(int i10) {
            this.f21132a = i10;
        }
    }

    public static final class s extends r {
        public s(int i10) {
            super(i10);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar2.V0() > this.f21132a;
        }

        public String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.f21132a)});
        }
    }

    public static final class t extends r {
        public t(int i10) {
            super(i10);
        }

        public boolean a(jh.h hVar, jh.h hVar2) {
            return hVar != hVar2 && hVar2.V0() < this.f21132a;
        }

        public String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.f21132a)});
        }
    }

    public static final class u extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            for (jh.m next : hVar2.v()) {
                if (!(next instanceof jh.d) && !(next instanceof jh.q) && !(next instanceof jh.g)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class v extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            jh.h P1 = hVar2.U();
            return P1 != null && !(P1 instanceof jh.f) && hVar2.V0() == 0;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class w extends c0 {
        public w() {
            super(0, 1);
        }

        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class x extends d {
        public boolean a(jh.h hVar, jh.h hVar2) {
            jh.h P1 = hVar2.U();
            return P1 != null && !(P1 instanceof jh.f) && hVar2.V0() == P1.H0().size() - 1;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class y extends b0 {
        public y() {
            super(0, 1);
        }

        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class z extends o {
        public z(int i10, int i11) {
            super(i10, i11);
        }

        public int b(jh.h hVar, jh.h hVar2) {
            return hVar2.V0() + 1;
        }

        public String c() {
            return "nth-child";
        }
    }

    public abstract boolean a(jh.h hVar, jh.h hVar2);
}
