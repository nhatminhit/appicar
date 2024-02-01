package n0;

import android.graphics.Color;
import android.graphics.ColorSpace;
import d.l;
import d.t0;
import fh.g;
import kotlin.Metadata;
import p7.f;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002\u001a\r\u0010\u0006\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\t\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\n\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\u000b\u001a\u00020\b*\u00020\bH\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\bH\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\bH\b\u001a\r\u0010\u000f\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0011\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\rH\n\u001a\r\u0010\u0013\u001a\u00020\u0000*\u00020\rH\b\u001a\r\u0010\u0014\u001a\u00020\b*\u00020\rH\b\u001a\u0015\u0010\u0017\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\f\u001a\u0015\u0010\u0019\u001a\u00020\r*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0018H\f\u001a\u0015\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\f\u001a\u0015\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0018H\f\u001a\u0015\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\f\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0018H\f\u001a\r\u0010\u001f\u001a\u00020\b*\u00020\u001eH\b\"\u0016\u0010\"\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0016\u0010$\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0016\u0010&\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b%\u0010!\"\u0016\u0010(\u001a\u00020\b*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010!\"\u0016\u0010+\u001a\u00020\u0001*\u00020\b8Ç\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0016\u0010\"\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0016\u0010$\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b.\u0010-\"\u0016\u0010&\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b/\u0010-\"\u0016\u0010(\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b0\u0010-\"\u0016\u0010+\u001a\u00020\u0001*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b1\u0010-\"\u0016\u00105\u001a\u000202*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0016\u00107\u001a\u000202*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b6\u00104\"\u0016\u0010\u0016\u001a\u00020\u0018*\u00020\r8Ç\u0002¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Landroid/graphics/Color;", "", "b", "e", "h", "k", "c", "F", "", "f", "i", "l", "G", "", "K", "a", "d", "g", "j", "H", "I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "m", "Landroid/graphics/ColorSpace;", "n", "o", "p", "q", "r", "", "J", "t", "(I)I", "alpha", "C", "red", "y", "green", "v", "blue", "z", "(I)F", "luminance", "s", "(J)F", "B", "x", "u", "A", "", "D", "(J)Z", "isSrgb", "E", "isWideGamut", "w", "(J)Landroid/graphics/ColorSpace;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class y {
    @t0(26)
    public static final float A(long j10) {
        return Color.luminance(j10);
    }

    @t0(26)
    public static final float B(long j10) {
        return Color.red(j10);
    }

    public static final int C(@l int i10) {
        return (i10 >> 16) & 255;
    }

    @t0(26)
    public static final boolean D(long j10) {
        return Color.isSrgb(j10);
    }

    @t0(26)
    public static final boolean E(long j10) {
        return Color.isWideGamut(j10);
    }

    @t0(26)
    @g
    public static final Color F(@g Color color, @g Color color2) {
        l0.p(color, "<this>");
        l0.p(color2, f.f11706q);
        Color u10 = f0.u(color2, color);
        l0.o(u10, "compositeColors(c, this)");
        return u10;
    }

    @t0(26)
    @g
    public static final Color G(@l int i10) {
        Color a10 = Color.valueOf(i10);
        l0.o(a10, "valueOf(this)");
        return a10;
    }

    @t0(26)
    @g
    public static final Color H(long j10) {
        Color a10 = Color.valueOf(j10);
        l0.o(a10, "valueOf(this)");
        return a10;
    }

    @t0(26)
    @l
    public static final int I(long j10) {
        return Color.toArgb(j10);
    }

    @l
    public static final int J(@g String str) {
        l0.p(str, "<this>");
        return Color.parseColor(str);
    }

    @t0(26)
    public static final long K(@l int i10) {
        return Color.pack(i10);
    }

    @t0(26)
    public static final float a(long j10) {
        return Color.red(j10);
    }

    @t0(26)
    public static final float b(@g Color color) {
        l0.p(color, "<this>");
        return color.getComponent(0);
    }

    public static final int c(@l int i10) {
        return (i10 >> 24) & 255;
    }

    @t0(26)
    public static final float d(long j10) {
        return Color.green(j10);
    }

    @t0(26)
    public static final float e(@g Color color) {
        l0.p(color, "<this>");
        return color.getComponent(1);
    }

    public static final int f(@l int i10) {
        return (i10 >> 16) & 255;
    }

    @t0(26)
    public static final float g(long j10) {
        return Color.blue(j10);
    }

    @t0(26)
    public static final float h(@g Color color) {
        l0.p(color, "<this>");
        return color.getComponent(2);
    }

    public static final int i(@l int i10) {
        return (i10 >> 8) & 255;
    }

    @t0(26)
    public static final float j(long j10) {
        return Color.alpha(j10);
    }

    @t0(26)
    public static final float k(@g Color color) {
        l0.p(color, "<this>");
        return color.getComponent(3);
    }

    public static final int l(@l int i10) {
        return i10 & 255;
    }

    @t0(26)
    public static final long m(@l int i10, @g ColorSpace.Named named) {
        l0.p(named, "colorSpace");
        return Color.convert(i10, ColorSpace.get(named));
    }

    @t0(26)
    public static final long n(@l int i10, @g ColorSpace colorSpace) {
        l0.p(colorSpace, "colorSpace");
        return Color.convert(i10, colorSpace);
    }

    @t0(26)
    public static final long o(long j10, @g ColorSpace.Named named) {
        l0.p(named, "colorSpace");
        return Color.convert(j10, ColorSpace.get(named));
    }

    @t0(26)
    public static final long p(long j10, @g ColorSpace colorSpace) {
        l0.p(colorSpace, "colorSpace");
        return Color.convert(j10, colorSpace);
    }

    @t0(26)
    @g
    public static final Color q(@g Color color, @g ColorSpace.Named named) {
        l0.p(color, "<this>");
        l0.p(named, "colorSpace");
        Color a10 = color.convert(ColorSpace.get(named));
        l0.o(a10, "convert(ColorSpace.get(colorSpace))");
        return a10;
    }

    @t0(26)
    @g
    public static final Color r(@g Color color, @g ColorSpace colorSpace) {
        l0.p(color, "<this>");
        l0.p(colorSpace, "colorSpace");
        Color a10 = color.convert(colorSpace);
        l0.o(a10, "convert(colorSpace)");
        return a10;
    }

    @t0(26)
    public static final float s(long j10) {
        return Color.alpha(j10);
    }

    public static final int t(@l int i10) {
        return (i10 >> 24) & 255;
    }

    @t0(26)
    public static final float u(long j10) {
        return Color.blue(j10);
    }

    public static final int v(@l int i10) {
        return i10 & 255;
    }

    @t0(26)
    @g
    public static final ColorSpace w(long j10) {
        ColorSpace a10 = Color.colorSpace(j10);
        l0.o(a10, "colorSpace(this)");
        return a10;
    }

    @t0(26)
    public static final float x(long j10) {
        return Color.green(j10);
    }

    public static final int y(@l int i10) {
        return (i10 >> 8) & 255;
    }

    @t0(26)
    public static final float z(@l int i10) {
        return Color.luminance(i10);
    }
}
