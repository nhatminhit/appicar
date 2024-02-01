package lf;

import be.b0;
import be.v;
import fh.g;
import fh.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import le.k;
import p000if.m;
import p000if.q;
import p000if.s;
import we.l;
import we.p;
import xe.h0;
import xe.l0;
import xe.n0;
import xe.w;
import zd.a1;
import zd.h1;
import zd.r;
import zd.u2;
import zd.y2;

public final class o implements Serializable {
    @g
    public static final a Q = new a((w) null);
    @g
    public final Pattern O;
    @h
    public Set<? extends q> P;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        @g
        public final String c(@g String str) {
            l0.p(str, "literal");
            String quote = Pattern.quote(str);
            l0.o(quote, "quote(literal)");
            return quote;
        }

        @g
        public final String d(@g String str) {
            l0.p(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            l0.o(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        @g
        public final o e(@g String str) {
            l0.p(str, "literal");
            return new o(str, q.LITERAL);
        }
    }

    public static final class b implements Serializable {
        @g
        public static final a Q = new a((w) null);
        public static final long R = 0;
        @g
        public final String O;
        public final int P;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(w wVar) {
                this();
            }
        }

        public b(@g String str, int i10) {
            l0.p(str, "pattern");
            this.O = str;
            this.P = i10;
        }

        public final int a() {
            return this.P;
        }

        @g
        public final String b() {
            return this.O;
        }

        public final Object c() {
            Pattern compile = Pattern.compile(this.O, this.P);
            l0.o(compile, "compile(pattern, flags)");
            return new o(compile);
        }
    }

    public static final class c extends n0 implements we.a<m> {
        public final /* synthetic */ o P;
        public final /* synthetic */ CharSequence Q;
        public final /* synthetic */ int R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(o oVar, CharSequence charSequence, int i10) {
            super(0);
            this.P = oVar;
            this.Q = charSequence;
            this.R = i10;
        }

        @h
        /* renamed from: c */
        public final m n() {
            return this.P.c(this.Q, this.R);
        }
    }

    public /* synthetic */ class d extends h0 implements l<m, m> {
        public static final d X = new d();

        public d() {
            super(1, m.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @h
        /* renamed from: z0 */
        public final m A(@g m mVar) {
            l0.p(mVar, "p0");
            return mVar.next();
        }
    }

    public static final class e extends n0 implements l<q, Boolean> {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i10) {
            super(1);
            this.P = i10;
        }

        @g
        /* renamed from: c */
        public final Boolean A(q qVar) {
            i iVar = qVar;
            return Boolean.valueOf((this.P & iVar.a()) == iVar.getValue());
        }
    }

    @le.f(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {276, 284, 288}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    public static final class f extends k implements p<p000if.o<? super String>, ie.d<? super u2>, Object> {
        public Object Q;
        public int R;
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ o U;
        public final /* synthetic */ CharSequence V;
        public final /* synthetic */ int W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(o oVar, CharSequence charSequence, int i10, ie.d<? super f> dVar) {
            super(2, dVar);
            this.U = oVar;
            this.V = charSequence;
            this.W = i10;
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            f fVar = new f(this.U, this.V, this.W, dVar);
            fVar.T = obj;
            return fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x009e A[RETURN] */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r10.S
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0035
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x001f
                if (r1 != r3) goto L_0x0017
                zd.e1.n(r11)
                goto L_0x009f
            L_0x0017:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001f:
                int r1 = r10.R
                java.lang.Object r2 = r10.Q
                java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
                java.lang.Object r6 = r10.T
                if.o r6 = (p000if.o) r6
                zd.e1.n(r11)
                r7 = r10
                r11 = r1
                r1 = r2
                goto L_0x0073
            L_0x0030:
                zd.e1.n(r11)
                goto L_0x00b1
            L_0x0035:
                zd.e1.n(r11)
                java.lang.Object r11 = r10.T
                if.o r11 = (p000if.o) r11
                lf.o r1 = r10.U
                java.util.regex.Pattern r1 = r1.O
                java.lang.CharSequence r6 = r10.V
                java.util.regex.Matcher r1 = r1.matcher(r6)
                int r6 = r10.W
                if (r6 == r5) goto L_0x00a2
                boolean r6 = r1.find()
                if (r6 != 0) goto L_0x0053
                goto L_0x00a2
            L_0x0053:
                r7 = r10
                r6 = r11
                r11 = r2
            L_0x0056:
                java.lang.CharSequence r8 = r7.V
                int r9 = r1.start()
                java.lang.CharSequence r2 = r8.subSequence(r2, r9)
                java.lang.String r2 = r2.toString()
                r7.T = r6
                r7.Q = r1
                r7.R = r11
                r7.S = r4
                java.lang.Object r2 = r6.a(r2, r7)
                if (r2 != r0) goto L_0x0073
                return r0
            L_0x0073:
                int r2 = r1.end()
                int r11 = r11 + r5
                int r8 = r7.W
                int r8 = r8 - r5
                if (r11 == r8) goto L_0x0083
                boolean r8 = r1.find()
                if (r8 != 0) goto L_0x0056
            L_0x0083:
                java.lang.CharSequence r11 = r7.V
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r2, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.T = r1
                r7.Q = r1
                r7.S = r3
                java.lang.Object r11 = r6.a(r11, r7)
                if (r11 != r0) goto L_0x009f
                return r0
            L_0x009f:
                zd.u2 r11 = zd.u2.f25116a
                return r11
            L_0x00a2:
                java.lang.CharSequence r1 = r10.V
                java.lang.String r1 = r1.toString()
                r10.S = r5
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L_0x00b1
                return r0
            L_0x00b1:
                zd.u2 r11 = zd.u2.f25116a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.o.f.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: N */
        public final Object g0(@g p000if.o<? super String> oVar, @h ie.d<? super u2> dVar) {
            return ((f) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(@fh.g java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            xe.l0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            xe.l0.o(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.o.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(@fh.g java.lang.String r2, @fh.g java.util.Set<? extends lf.q> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "options"
            xe.l0.p(r3, r0)
            lf.o$a r0 = Q
            int r3 = lf.p.k(r3)
            int r3 = r0.b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            xe.l0.o(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.o.<init>(java.lang.String, java.util.Set):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(@fh.g java.lang.String r2, @fh.g lf.q r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "option"
            xe.l0.p(r3, r0)
            lf.o$a r0 = Q
            int r3 = r3.getValue()
            int r3 = r0.b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            xe.l0.o(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.o.<init>(java.lang.String, lf.q):void");
    }

    @a1
    public o(@g Pattern pattern) {
        l0.p(pattern, "nativePattern");
        this.O = pattern;
    }

    public static /* synthetic */ m d(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.c(charSequence, i10);
    }

    public static /* synthetic */ m f(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.e(charSequence, i10);
    }

    public static /* synthetic */ List q(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.p(charSequence, i10);
    }

    public static /* synthetic */ m s(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.r(charSequence, i10);
    }

    public final boolean b(@g CharSequence charSequence) {
        l0.p(charSequence, "input");
        return this.O.matcher(charSequence).find();
    }

    @h
    public final m c(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "input");
        Matcher matcher = this.O.matcher(charSequence);
        l0.o(matcher, "nativePattern.matcher(input)");
        return p.f(matcher, i10, charSequence);
    }

    @g
    public final m<m> e(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            return s.n(new c(this, charSequence, i10), d.X);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    @g
    public final Set<q> g() {
        Set<? extends q> set = this.P;
        if (set != null) {
            return set;
        }
        int flags = this.O.flags();
        EnumSet<E> allOf = EnumSet.allOf(q.class);
        l0.o(allOf, "fromInt$lambda$1");
        b0.N0(allOf, new e(flags));
        Set<? extends q> unmodifiableSet = Collections.unmodifiableSet(allOf);
        l0.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this.P = unmodifiableSet;
        return unmodifiableSet;
    }

    @g
    public final String h() {
        String pattern = this.O.pattern();
        l0.o(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @h1(version = "1.7")
    @y2(markerClass = {r.class})
    @h
    public final m i(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "input");
        Matcher region = this.O.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        l0.o(region, "this");
        return new n(region, charSequence);
    }

    @h
    public final m j(@g CharSequence charSequence) {
        l0.p(charSequence, "input");
        Matcher matcher = this.O.matcher(charSequence);
        l0.o(matcher, "nativePattern.matcher(input)");
        return p.h(matcher, charSequence);
    }

    public final boolean k(@g CharSequence charSequence) {
        l0.p(charSequence, "input");
        return this.O.matcher(charSequence).matches();
    }

    @h1(version = "1.7")
    @y2(markerClass = {r.class})
    public final boolean l(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "input");
        return this.O.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length()).lookingAt();
    }

    @g
    public final String m(@g CharSequence charSequence, @g String str) {
        l0.p(charSequence, "input");
        l0.p(str, "replacement");
        String replaceAll = this.O.matcher(charSequence).replaceAll(str);
        l0.o(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @g
    public final String n(@g CharSequence charSequence, @g l<? super m, ? extends CharSequence> lVar) {
        l0.p(charSequence, "input");
        l0.p(lVar, "transform");
        int i10 = 0;
        m d10 = d(this, charSequence, 0, 2, (Object) null);
        if (d10 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i10, d10.d().c().intValue());
            sb2.append((CharSequence) lVar.A(d10));
            i10 = d10.d().h().intValue() + 1;
            d10 = d10.next();
            if (i10 >= length) {
                break;
            }
        } while (d10 != null);
        if (i10 < length) {
            sb2.append(charSequence, i10, length);
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "sb.toString()");
        return sb3;
    }

    @g
    public final String o(@g CharSequence charSequence, @g String str) {
        l0.p(charSequence, "input");
        l0.p(str, "replacement");
        String replaceFirst = this.O.matcher(charSequence).replaceFirst(str);
        l0.o(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @g
    public final List<String> p(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "input");
        c0.N4(i10);
        Matcher matcher = this.O.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return v.k(charSequence.toString());
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = gf.v.B(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        int i13 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            if ((i13 >= 0 && arrayList.size() == i13) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
        return arrayList;
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @g
    public final m<String> r(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "input");
        c0.N4(i10);
        return q.b(new f(this, charSequence, i10, (ie.d<? super f>) null));
    }

    @g
    public final Pattern t() {
        return this.O;
    }

    @g
    public String toString() {
        String pattern = this.O.toString();
        l0.o(pattern, "nativePattern.toString()");
        return pattern;
    }

    public final Object u() {
        String pattern = this.O.pattern();
        l0.o(pattern, "nativePattern.pattern()");
        return new b(pattern, this.O.flags());
    }
}
