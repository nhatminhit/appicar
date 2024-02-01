package b1;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import d.l;
import fh.g;
import kotlin.Metadata;
import n7.b;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001aD\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a3\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a3\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u001a)\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Lzd/u2;", "Lzd/u;", "builderAction", "Landroid/text/SpannedString;", "c", "", "", "spans", "f", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lwe/l;)Landroid/text/SpannableStringBuilder;", "span", "e", "b", "g", "l", "", "color", "d", "a", "i", "", "proportion", "h", "k", "j", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class m {
    @g
    public static final SpannableStringBuilder a(@g SpannableStringBuilder spannableStringBuilder, @l int i10, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder b(@g SpannableStringBuilder spannableStringBuilder, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannedString c(@g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(lVar, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.A(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @g
    public static final SpannableStringBuilder d(@g SpannableStringBuilder spannableStringBuilder, @l int i10, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder e(@g SpannableStringBuilder spannableStringBuilder, @g Object obj, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(obj, b.f10950r);
        l0.p(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder f(@g SpannableStringBuilder spannableStringBuilder, @g Object[] objArr, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(objArr, "spans");
        l0.p(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        int length2 = objArr.length;
        int i10 = 0;
        while (i10 < length2) {
            Object obj = objArr[i10];
            i10++;
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder g(@g SpannableStringBuilder spannableStringBuilder, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder h(@g SpannableStringBuilder spannableStringBuilder, float f10, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f10);
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder i(@g SpannableStringBuilder spannableStringBuilder, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder j(@g SpannableStringBuilder spannableStringBuilder, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder k(@g SpannableStringBuilder spannableStringBuilder, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @g
    public static final SpannableStringBuilder l(@g SpannableStringBuilder spannableStringBuilder, @g we.l<? super SpannableStringBuilder, u2> lVar) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(lVar, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.A(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
