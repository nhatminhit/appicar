package lf;

import fh.g;
import ve.e;

public final class r {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final r f20840a = new r();
    @g
    @e

    /* renamed from: b  reason: collision with root package name */
    public static final o f20841b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f20841b = new o("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
