package lf;

import fh.g;
import oe.f;
import xe.l0;
import zd.h1;
import zd.r;
import zd.y2;

public class t {
    @g
    public static final <T extends Appendable> T a(@g T t10, @g CharSequence... charSequenceArr) {
        l0.p(t10, "<this>");
        l0.p(charSequenceArr, "value");
        for (CharSequence append : charSequenceArr) {
            t10.append(append);
        }
        return t10;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.l<? super T, ? extends java.lang.CharSequence>, we.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(@fh.g java.lang.Appendable r1, T r2, @fh.h we.l<? super T, ? extends java.lang.CharSequence> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            if (r3 == 0) goto L_0x0011
            java.lang.Object r2 = r3.A(r2)
        L_0x000b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        L_0x000d:
            r1.append(r2)
            goto L_0x002d
        L_0x0011:
            if (r2 != 0) goto L_0x0015
            r3 = 1
            goto L_0x0017
        L_0x0015:
            boolean r3 = r2 instanceof java.lang.CharSequence
        L_0x0017:
            if (r3 == 0) goto L_0x001a
            goto L_0x000b
        L_0x001a:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L_0x0028
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            goto L_0x002d
        L_0x0028:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x000d
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.t.b(java.lang.Appendable, java.lang.Object, we.l):void");
    }

    @h1(version = "1.4")
    @f
    public static final Appendable c(Appendable appendable) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(10);
        l0.o(append, "append('\\n')");
        return append;
    }

    @h1(version = "1.4")
    @f
    public static final Appendable d(Appendable appendable, char c10) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(c10);
        l0.o(append, "append(value)");
        Appendable append2 = append.append(10);
        l0.o(append2, "append('\\n')");
        return append2;
    }

    @h1(version = "1.4")
    @f
    public static final Appendable e(Appendable appendable, CharSequence charSequence) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        l0.o(append, "append(value)");
        Appendable append2 = append.append(10);
        l0.o(append2, "append('\\n')");
        return append2;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @g
    public static final <T extends Appendable> T f(@g T t10, @g CharSequence charSequence, int i10, int i11) {
        l0.p(t10, "<this>");
        l0.p(charSequence, "value");
        T append = t10.append(charSequence, i10, i11);
        l0.n(append, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return append;
    }
}
