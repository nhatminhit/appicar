package zd;

import oe.f;
import oe.g;

public final class d {
    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final char a(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            return (char) i10;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i10);
    }

    public static final int b(char c10) {
        return c10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @g
    @f
    public static /* synthetic */ void c(char c10) {
    }
}
