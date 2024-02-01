package kh;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public j f20304a;

    public static final class b extends c {
        public b(String str) {
            p(str);
        }

        public String toString() {
            return "<![CDATA[" + q() + "]]>";
        }
    }

    public static class c extends i {

        /* renamed from: b  reason: collision with root package name */
        public String f20305b;

        public c() {
            super();
            this.f20304a = j.Character;
        }

        public i m() {
            this.f20305b = null;
            return this;
        }

        public c p(String str) {
            this.f20305b = str;
            return this;
        }

        public String q() {
            return this.f20305b;
        }

        public String toString() {
            return q();
        }
    }

    public static final class d extends i {

        /* renamed from: b  reason: collision with root package name */
        public final StringBuilder f20306b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        public String f20307c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f20308d = false;

        public d() {
            super();
            this.f20304a = j.Comment;
        }

        public i m() {
            i.n(this.f20306b);
            this.f20307c = null;
            this.f20308d = false;
            return this;
        }

        public final d p(char c10) {
            r();
            this.f20306b.append(c10);
            return this;
        }

        public final d q(String str) {
            r();
            if (this.f20306b.length() == 0) {
                this.f20307c = str;
            } else {
                this.f20306b.append(str);
            }
            return this;
        }

        public final void r() {
            String str = this.f20307c;
            if (str != null) {
                this.f20306b.append(str);
                this.f20307c = null;
            }
        }

        public String s() {
            String str = this.f20307c;
            return str != null ? str : this.f20306b.toString();
        }

        public String toString() {
            return "<!--" + s() + "-->";
        }
    }

    public static final class e extends i {

        /* renamed from: b  reason: collision with root package name */
        public final StringBuilder f20309b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        public String f20310c = null;

        /* renamed from: d  reason: collision with root package name */
        public final StringBuilder f20311d = new StringBuilder();

        /* renamed from: e  reason: collision with root package name */
        public final StringBuilder f20312e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        public boolean f20313f = false;

        public e() {
            super();
            this.f20304a = j.Doctype;
        }

        public i m() {
            i.n(this.f20309b);
            this.f20310c = null;
            i.n(this.f20311d);
            i.n(this.f20312e);
            this.f20313f = false;
            return this;
        }

        public String p() {
            return this.f20309b.toString();
        }

        public String q() {
            return this.f20310c;
        }

        public String r() {
            return this.f20311d.toString();
        }

        public String s() {
            return this.f20312e.toString();
        }

        public boolean t() {
            return this.f20313f;
        }
    }

    public static final class f extends i {
        public f() {
            super();
            this.f20304a = j.EOF;
        }

        public i m() {
            return this;
        }
    }

    public static final class g extends C0348i {
        public g() {
            this.f20304a = j.EndTag;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("</");
            String str = this.f20314b;
            if (str == null) {
                str = "(unset)";
            }
            sb2.append(str);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final class h extends C0348i {
        public h() {
            this.f20304a = j.StartTag;
        }

        /* renamed from: F */
        public C0348i m() {
            super.m();
            this.f20322j = null;
            return this;
        }

        public h H(String str, jh.b bVar) {
            this.f20314b = str;
            this.f20322j = bVar;
            this.f20315c = ih.b.a(str);
            return this;
        }

        public String toString() {
            StringBuilder sb2;
            String B;
            jh.b bVar = this.f20322j;
            if (bVar == null || bVar.size() <= 0) {
                sb2 = new StringBuilder();
                sb2.append("<");
                B = B();
            } else {
                sb2 = new StringBuilder();
                sb2.append("<");
                sb2.append(B());
                sb2.append(" ");
                B = this.f20322j.toString();
            }
            sb2.append(B);
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: kh.i$i  reason: collision with other inner class name */
    public static abstract class C0348i extends i {

        /* renamed from: b  reason: collision with root package name */
        public String f20314b;

        /* renamed from: c  reason: collision with root package name */
        public String f20315c;

        /* renamed from: d  reason: collision with root package name */
        public String f20316d;

        /* renamed from: e  reason: collision with root package name */
        public StringBuilder f20317e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        public String f20318f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f20319g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f20320h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f20321i = false;

        /* renamed from: j  reason: collision with root package name */
        public jh.b f20322j;

        public C0348i() {
            super();
        }

        public final boolean A() {
            return this.f20321i;
        }

        public final String B() {
            String str = this.f20314b;
            hh.d.b(str == null || str.length() == 0);
            return this.f20314b;
        }

        public final C0348i C(String str) {
            this.f20314b = str;
            this.f20315c = ih.b.a(str);
            return this;
        }

        public final void D() {
            if (this.f20322j == null) {
                this.f20322j = new jh.b();
            }
            String str = this.f20316d;
            if (str != null) {
                String trim = str.trim();
                this.f20316d = trim;
                if (trim.length() > 0) {
                    this.f20322j.p(this.f20316d, this.f20320h ? this.f20317e.length() > 0 ? this.f20317e.toString() : this.f20318f : this.f20319g ? "" : null);
                }
            }
            this.f20316d = null;
            this.f20319g = false;
            this.f20320h = false;
            i.n(this.f20317e);
            this.f20318f = null;
        }

        public final String E() {
            return this.f20315c;
        }

        /* renamed from: F */
        public C0348i m() {
            this.f20314b = null;
            this.f20315c = null;
            this.f20316d = null;
            i.n(this.f20317e);
            this.f20318f = null;
            this.f20319g = false;
            this.f20320h = false;
            this.f20321i = false;
            this.f20322j = null;
            return this;
        }

        public final void G() {
            this.f20319g = true;
        }

        public final void p(char c10) {
            q(String.valueOf(c10));
        }

        public final void q(String str) {
            String str2 = this.f20316d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f20316d = str;
        }

        public final void r(char c10) {
            x();
            this.f20317e.append(c10);
        }

        public final void s(String str) {
            x();
            if (this.f20317e.length() == 0) {
                this.f20318f = str;
            } else {
                this.f20317e.append(str);
            }
        }

        public final void t(char[] cArr) {
            x();
            this.f20317e.append(cArr);
        }

        public final void u(int[] iArr) {
            x();
            for (int appendCodePoint : iArr) {
                this.f20317e.appendCodePoint(appendCodePoint);
            }
        }

        public final void v(char c10) {
            w(String.valueOf(c10));
        }

        public final void w(String str) {
            String str2 = this.f20314b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f20314b = str;
            this.f20315c = ih.b.a(str);
        }

        public final void x() {
            this.f20320h = true;
            String str = this.f20318f;
            if (str != null) {
                this.f20317e.append(str);
                this.f20318f = null;
            }
        }

        public final void y() {
            if (this.f20316d != null) {
                D();
            }
        }

        public final jh.b z() {
            if (this.f20322j == null) {
                this.f20322j = new jh.b();
            }
            return this.f20322j;
        }
    }

    public enum j {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public i() {
    }

    public static void n(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public final c a() {
        return (c) this;
    }

    public final d b() {
        return (d) this;
    }

    public final e c() {
        return (e) this;
    }

    public final g d() {
        return (g) this;
    }

    public final h e() {
        return (h) this;
    }

    public final boolean f() {
        return this instanceof b;
    }

    public final boolean g() {
        return this.f20304a == j.Character;
    }

    public final boolean h() {
        return this.f20304a == j.Comment;
    }

    public final boolean i() {
        return this.f20304a == j.Doctype;
    }

    public final boolean j() {
        return this.f20304a == j.EOF;
    }

    public final boolean k() {
        return this.f20304a == j.EndTag;
    }

    public final boolean l() {
        return this.f20304a == j.StartTag;
    }

    public abstract i m();

    public String o() {
        return getClass().getSimpleName();
    }
}
