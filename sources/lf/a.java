package lf;

import fh.g;
import gf.m;
import xe.w;

public enum a {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");
    
    @g
    public static final C0358a Q = null;
    public final int O;
    @g
    public final String P;

    /* renamed from: lf.a$a  reason: collision with other inner class name */
    public static final class C0358a {
        public C0358a() {
        }

        public /* synthetic */ C0358a(w wVar) {
            this();
        }

        @g
        public final a a(int i10) {
            if (new m(0, 16).q(i10)) {
                return a.values()[i10];
            }
            if (new m(18, 30).q(i10)) {
                return a.values()[i10 - 1];
            }
            throw new IllegalArgumentException("Category #" + i10 + " is not defined.");
        }
    }

    /* access modifiers changed from: public */
    static {
        Q = new C0358a((w) null);
    }

    /* access modifiers changed from: public */
    a(int i10, String str) {
        this.O = i10;
        this.P = str;
    }

    public final boolean b(char c10) {
        return Character.getType(c10) == this.O;
    }

    @g
    public final String d() {
        return this.P;
    }

    public final int e() {
        return this.O;
    }
}
