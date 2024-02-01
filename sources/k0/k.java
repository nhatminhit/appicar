package k0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import d.c;
import d.c1;
import d.l;
import d.q;
import d.t0;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a1\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d*\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001eH\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u0002\u0007\n\u0005\b20\u0001¨\u0006\""}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "Lzd/u2;", "a", "", "b", "c", "Landroid/content/res/ColorStateList;", "d", "", "e", "f", "g", "Landroid/graphics/drawable/Drawable;", "h", "i", "Landroid/graphics/Typeface;", "j", "k", "l", "m", "", "n", "", "p", "", "o", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "q", "(Landroid/content/res/TypedArray;Lwe/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class k {
    public static final void a(TypedArray typedArray, @c1 int i10) {
        if (!typedArray.hasValue(i10)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getBoolean(i10, false);
    }

    @l
    public static final int c(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getColor(i10, 0);
    }

    @g
    public static final ColorStateList d(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        ColorStateList colorStateList = typedArray.getColorStateList(i10);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float e(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getDimension(i10, 0.0f);
    }

    @q
    public static final int f(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getDimensionPixelOffset(i10, 0);
    }

    @q
    public static final int g(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getDimensionPixelSize(i10, 0);
    }

    @g
    public static final Drawable h(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        Drawable drawable = typedArray.getDrawable(i10);
        l0.m(drawable);
        return drawable;
    }

    public static final float i(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getFloat(i10, 0.0f);
    }

    @t0(26)
    @g
    public static final Typeface j(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        Typeface a10 = typedArray.getFont(i10);
        l0.m(a10);
        return a10;
    }

    public static final int k(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getInt(i10, 0);
    }

    public static final int l(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getInteger(i10, 0);
    }

    @c
    public static final int m(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getResourceId(i10, 0);
    }

    @g
    public static final String n(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        String string = typedArray.getString(i10);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @g
    public static final CharSequence[] o(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        CharSequence[] textArray = typedArray.getTextArray(i10);
        l0.o(textArray, "getTextArray(index)");
        return textArray;
    }

    @g
    public static final CharSequence p(@g TypedArray typedArray, @c1 int i10) {
        l0.p(typedArray, "<this>");
        a(typedArray, i10);
        CharSequence text = typedArray.getText(i10);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R q(@g TypedArray typedArray, @g we.l<? super TypedArray, ? extends R> lVar) {
        l0.p(typedArray, "<this>");
        l0.p(lVar, "block");
        R A = lVar.A(typedArray);
        typedArray.recycle();
        return A;
    }
}
