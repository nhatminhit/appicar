package b1;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p7.f;
import t3.c;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final q f4035d;

    /* renamed from: e  reason: collision with root package name */
    public static final char f4036e = '‪';

    /* renamed from: f  reason: collision with root package name */
    public static final char f4037f = '‫';

    /* renamed from: g  reason: collision with root package name */
    public static final char f4038g = '‬';

    /* renamed from: h  reason: collision with root package name */
    public static final char f4039h = '‎';

    /* renamed from: i  reason: collision with root package name */
    public static final char f4040i = '‏';

    /* renamed from: j  reason: collision with root package name */
    public static final String f4041j = Character.toString(f4039h);

    /* renamed from: k  reason: collision with root package name */
    public static final String f4042k = Character.toString(f4040i);

    /* renamed from: l  reason: collision with root package name */
    public static final String f4043l = "";

    /* renamed from: m  reason: collision with root package name */
    public static final int f4044m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f4045n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final a f4046o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f4047p;

    /* renamed from: q  reason: collision with root package name */
    public static final int f4048q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f4049r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f4050s = 1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4051a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4052b;

    /* renamed from: c  reason: collision with root package name */
    public final q f4053c;

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    public static final class C0057a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4054a;

        /* renamed from: b  reason: collision with root package name */
        public int f4055b;

        /* renamed from: c  reason: collision with root package name */
        public q f4056c;

        public C0057a() {
            c(a.j(Locale.getDefault()));
        }

        public C0057a(Locale locale) {
            c(a.j(locale));
        }

        public C0057a(boolean z10) {
            c(z10);
        }

        public static a b(boolean z10) {
            return z10 ? a.f4047p : a.f4046o;
        }

        public a a() {
            return (this.f4055b == 2 && this.f4056c == a.f4035d) ? b(this.f4054a) : new a(this.f4054a, this.f4055b, this.f4056c);
        }

        public final void c(boolean z10) {
            this.f4054a = z10;
            this.f4056c = a.f4035d;
            this.f4055b = 2;
        }

        public C0057a d(q qVar) {
            this.f4056c = qVar;
            return this;
        }

        public C0057a e(boolean z10) {
            this.f4055b = z10 ? this.f4055b | 2 : this.f4055b & -3;
            return this;
        }
    }

    public static class b {

        /* renamed from: f  reason: collision with root package name */
        public static final int f4057f = 1792;

        /* renamed from: g  reason: collision with root package name */
        public static final byte[] f4058g = new byte[f4057f];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f4059a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4060b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4061c;

        /* renamed from: d  reason: collision with root package name */
        public int f4062d;

        /* renamed from: e  reason: collision with root package name */
        public char f4063e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f4058g[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f4059a = charSequence;
            this.f4060b = z10;
            this.f4061c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f4058g[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char charAt = this.f4059a.charAt(this.f4062d - 1);
            this.f4063e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f4059a, this.f4062d);
                this.f4062d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f4062d--;
            byte c10 = c(this.f4063e);
            if (!this.f4060b) {
                return c10;
            }
            char c11 = this.f4063e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        public byte b() {
            char charAt = this.f4059a.charAt(this.f4062d);
            this.f4063e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f4059a, this.f4062d);
                this.f4062d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f4062d++;
            byte c10 = c(this.f4063e);
            if (!this.f4060b) {
                return c10;
            }
            char c11 = this.f4063e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        public int d() {
            this.f4062d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f4062d < this.f4061c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f4062d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f4062d = this.f4061c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f4062d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i10--;
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i10 = this.f4062d;
            do {
                int i11 = this.f4062d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4059a;
                int i12 = i11 - 1;
                this.f4062d = i12;
                charAt = charSequence.charAt(i12);
                this.f4063e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f4062d = i10;
            this.f4063e = f.f11697h;
            return c.T;
        }

        public final byte g() {
            char charAt;
            do {
                int i10 = this.f4062d;
                if (i10 >= this.f4061c) {
                    return 12;
                }
                CharSequence charSequence = this.f4059a;
                this.f4062d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f4063e = charAt;
            } while (charAt != ';');
            return 12;
        }

        public final byte h() {
            char charAt;
            int i10 = this.f4062d;
            while (true) {
                int i11 = this.f4062d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4059a;
                int i12 = i11 - 1;
                this.f4062d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f4063e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f4062d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f4059a;
                        int i14 = i13 - 1;
                        this.f4062d = i14;
                        charAt = charSequence2.charAt(i14);
                        this.f4063e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f4062d = i10;
            this.f4063e = '>';
            return c.T;
        }

        public final byte i() {
            char charAt;
            int i10 = this.f4062d;
            while (true) {
                int i11 = this.f4062d;
                if (i11 < this.f4061c) {
                    CharSequence charSequence = this.f4059a;
                    this.f4062d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f4063e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f4062d;
                            if (i12 >= this.f4061c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f4059a;
                            this.f4062d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f4063e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f4062d = i10;
                    this.f4063e = '<';
                    return c.T;
                }
            }
        }
    }

    static {
        q qVar = r.f4091c;
        f4035d = qVar;
        f4046o = new a(false, 2, qVar);
        f4047p = new a(true, 2, qVar);
    }

    public a(boolean z10, int i10, q qVar) {
        this.f4051a = z10;
        this.f4052b = i10;
        this.f4053c = qVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0057a().a();
    }

    public static a d(Locale locale) {
        return new C0057a(locale).a();
    }

    public static a e(boolean z10) {
        return new C0057a(z10).a();
    }

    public static boolean j(Locale locale) {
        return s.b(locale) == 1;
    }

    public boolean f() {
        return (this.f4052b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f4053c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f4051a;
    }

    public final String k(CharSequence charSequence, q qVar) {
        boolean isRtl = qVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f4051a || (!isRtl && b(charSequence) != 1)) ? this.f4051a ? (!isRtl || b(charSequence) == -1) ? f4042k : "" : "" : f4041j;
    }

    public final String l(CharSequence charSequence, q qVar) {
        boolean isRtl = qVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f4051a || (!isRtl && a(charSequence) != 1)) ? this.f4051a ? (!isRtl || a(charSequence) == -1) ? f4042k : "" : "" : f4041j;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f4053c, true);
    }

    public CharSequence n(CharSequence charSequence, q qVar) {
        return o(charSequence, qVar, true);
    }

    public CharSequence o(CharSequence charSequence, q qVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = qVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z10) {
            spannableStringBuilder.append(l(charSequence, isRtl ? r.f4090b : r.f4089a));
        }
        if (isRtl != this.f4051a) {
            spannableStringBuilder.append(isRtl ? f4037f : f4036e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f4038g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append(k(charSequence, isRtl ? r.f4090b : r.f4089a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z10) {
        return o(charSequence, this.f4053c, z10);
    }

    public String q(String str) {
        return s(str, this.f4053c, true);
    }

    public String r(String str, q qVar) {
        return s(str, qVar, true);
    }

    public String s(String str, q qVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return o(str, qVar, z10).toString();
    }

    public String t(String str, boolean z10) {
        return s(str, this.f4053c, z10);
    }
}
