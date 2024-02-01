package zd;

import oe.f;

public class q0 extends p0 {
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final int T0(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final int U0(short s10) {
        return Integer.numberOfLeadingZeros(s10 & p2.R) - 16;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final int V0(byte b10) {
        return Integer.bitCount(b10 & 255);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final int W0(short s10) {
        return Integer.bitCount(s10 & p2.R);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final int X0(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final int Y0(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    public static final byte Z0(byte b10, int i10) {
        byte b11 = i10 & 7;
        return (byte) (((b10 & 255) >>> (8 - b11)) | (b10 << b11));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    public static final short a1(short s10, int i10) {
        short s11 = i10 & 15;
        return (short) (((s10 & p2.R) >>> (16 - s11)) | (s10 << s11));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    public static final byte b1(byte b10, int i10) {
        byte b11 = i10 & 7;
        return (byte) (((b10 & 255) >>> b11) | (b10 << (8 - b11)));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    public static final short c1(short s10, int i10) {
        short s11 = i10 & 15;
        return (short) (((s10 & p2.R) >>> s11) | (s10 << (16 - s11)));
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final byte d1(byte b10) {
        return (byte) Integer.highestOneBit(b10 & 255);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final short e1(short s10) {
        return (short) Integer.highestOneBit(s10 & p2.R);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final byte f1(byte b10) {
        return (byte) Integer.lowestOneBit(b10);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final short g1(short s10) {
        return (short) Integer.lowestOneBit(s10);
    }
}
