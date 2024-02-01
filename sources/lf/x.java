package lf;

import fh.g;
import oe.f;
import xe.l0;
import zd.b1;
import zd.h1;
import zd.k;
import zd.m;
import zd.r;
import zd.y2;

public class x extends w {
    @h1(version = "1.4")
    @f
    public static final StringBuilder A(StringBuilder sb2, long j10) {
        l0.p(sb2, "<this>");
        sb2.append(j10);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder B(StringBuilder sb2, StringBuffer stringBuffer) {
        l0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder C(StringBuilder sb2, StringBuilder sb3) {
        l0.p(sb2, "<this>");
        sb2.append(sb3);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder D(StringBuilder sb2, short s10) {
        l0.p(sb2, "<this>");
        sb2.append(s10);
        l0.o(sb2, "append(value.toInt())");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder E(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
        l0.p(sb2, "<this>");
        l0.p(charSequence, "value");
        sb2.append(charSequence, i10, i11);
        l0.o(sb2, "this.append(value, startIndex, endIndex)");
        return sb2;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder F(StringBuilder sb2, char[] cArr, int i10, int i11) {
        l0.p(sb2, "<this>");
        l0.p(cArr, "value");
        sb2.append(cArr, i10, i11 - i10);
        l0.o(sb2, "this.append(value, start…x, endIndex - startIndex)");
        return sb2;
    }

    @g
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    public static final Appendable G(@g Appendable appendable) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(f0.f20802b);
        l0.o(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final Appendable H(Appendable appendable, char c10) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(c10);
        l0.o(append, "append(value)");
        return G(append);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final Appendable I(Appendable appendable, CharSequence charSequence) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        l0.o(append, "append(value)");
        return G(append);
    }

    @g
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    public static final StringBuilder J(@g StringBuilder sb2) {
        l0.p(sb2, "<this>");
        sb2.append(f0.f20802b);
        l0.o(sb2, "append(SystemProperties.LINE_SEPARATOR)");
        return sb2;
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder K(StringBuilder sb2, byte b10) {
        l0.p(sb2, "<this>");
        sb2.append(b10);
        l0.o(sb2, "append(value.toInt())");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder L(StringBuilder sb2, char c10) {
        l0.p(sb2, "<this>");
        sb2.append(c10);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder M(StringBuilder sb2, double d10) {
        l0.p(sb2, "<this>");
        sb2.append(d10);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder N(StringBuilder sb2, float f10) {
        l0.p(sb2, "<this>");
        sb2.append(f10);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder O(StringBuilder sb2, int i10) {
        l0.p(sb2, "<this>");
        sb2.append(i10);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder P(StringBuilder sb2, long j10) {
        l0.p(sb2, "<this>");
        sb2.append(j10);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder Q(StringBuilder sb2, CharSequence charSequence) {
        l0.p(sb2, "<this>");
        sb2.append(charSequence);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder R(StringBuilder sb2, Object obj) {
        l0.p(sb2, "<this>");
        sb2.append(obj);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder S(StringBuilder sb2, String str) {
        l0.p(sb2, "<this>");
        sb2.append(str);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder T(StringBuilder sb2, StringBuffer stringBuffer) {
        l0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder U(StringBuilder sb2, StringBuilder sb3) {
        l0.p(sb2, "<this>");
        sb2.append(sb3);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder V(StringBuilder sb2, short s10) {
        l0.p(sb2, "<this>");
        sb2.append(s10);
        l0.o(sb2, "append(value.toInt())");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder W(StringBuilder sb2, boolean z10) {
        l0.p(sb2, "<this>");
        sb2.append(z10);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @f
    @k(level = m.O, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder X(StringBuilder sb2, char[] cArr) {
        l0.p(sb2, "<this>");
        l0.p(cArr, "value");
        sb2.append(cArr);
        l0.o(sb2, "append(value)");
        return J(sb2);
    }

    @g
    @h1(version = "1.3")
    public static final StringBuilder Y(@g StringBuilder sb2) {
        l0.p(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder Z(StringBuilder sb2, int i10) {
        l0.p(sb2, "<this>");
        StringBuilder deleteCharAt = sb2.deleteCharAt(i10);
        l0.o(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder a0(StringBuilder sb2, int i10, int i11) {
        l0.p(sb2, "<this>");
        StringBuilder delete = sb2.delete(i10, i11);
        l0.o(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder b0(StringBuilder sb2, int i10, CharSequence charSequence, int i11, int i12) {
        l0.p(sb2, "<this>");
        l0.p(charSequence, "value");
        StringBuilder insert = sb2.insert(i10, charSequence, i11, i12);
        l0.o(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder c0(StringBuilder sb2, int i10, char[] cArr, int i11, int i12) {
        l0.p(sb2, "<this>");
        l0.p(cArr, "value");
        StringBuilder insert = sb2.insert(i10, cArr, i11, i12 - i11);
        l0.o(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @f
    public static final void d0(StringBuilder sb2, int i10, char c10) {
        l0.p(sb2, "<this>");
        sb2.setCharAt(i10, c10);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final StringBuilder e0(StringBuilder sb2, int i10, int i11, String str) {
        l0.p(sb2, "<this>");
        l0.p(str, "value");
        StringBuilder replace = sb2.replace(i10, i11, str);
        l0.o(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final void f0(StringBuilder sb2, char[] cArr, int i10, int i11, int i12) {
        l0.p(sb2, "<this>");
        l0.p(cArr, "destination");
        sb2.getChars(i11, i12, cArr, i10);
    }

    public static /* synthetic */ void g0(StringBuilder sb2, char[] cArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sb2.length();
        }
        l0.p(sb2, "<this>");
        l0.p(cArr, "destination");
        sb2.getChars(i11, i12, cArr, i10);
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder w(StringBuilder sb2, byte b10) {
        l0.p(sb2, "<this>");
        sb2.append(b10);
        l0.o(sb2, "append(value.toInt())");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder x(StringBuilder sb2, double d10) {
        l0.p(sb2, "<this>");
        sb2.append(d10);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder y(StringBuilder sb2, float f10) {
        l0.p(sb2, "<this>");
        sb2.append(f10);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }

    @h1(version = "1.4")
    @f
    public static final StringBuilder z(StringBuilder sb2, int i10) {
        l0.p(sb2, "<this>");
        sb2.append(i10);
        l0.o(sb2, "append(value)");
        sb2.append(10);
        l0.o(sb2, "append('\\n')");
        return sb2;
    }
}
