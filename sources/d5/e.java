package d5;

import w4.c;
import w4.l;

public enum e implements c {
    ALLOW_JAVA_COMMENTS(false, l.a.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(false, l.a.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(false, l.a.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(false, l.a.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, l.a.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, l.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, l.a.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, l.a.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(false, l.a.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(false, l.a.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(false, l.a.ALLOW_TRAILING_COMMA);
    
    public final boolean O;
    public final int P;
    public final l.a Q;

    /* access modifiers changed from: public */
    e(boolean z10, l.a aVar) {
        this.O = z10;
        this.P = 1 << ordinal();
        this.Q = aVar;
    }

    public static int e() {
        int i10 = 0;
        for (e eVar : values()) {
            if (eVar.b()) {
                i10 |= eVar.a();
            }
        }
        return i10;
    }

    public int a() {
        return this.P;
    }

    public boolean b() {
        return this.O;
    }

    public boolean d(int i10) {
        return (i10 & this.P) != 0;
    }

    public l.a i() {
        return this.Q;
    }
}
