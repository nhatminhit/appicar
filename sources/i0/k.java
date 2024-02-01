package i0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d.b1;
import d.f;
import fh.g;
import fh.h;
import kotlin.Metadata;
import w1.a;
import we.l;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\bø\u0001\u0000\u001a;\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, d2 = {"", "T", "Landroid/content/Context;", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lzd/u2;", "Lzd/u;", "block", "c", "resourceId", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class k {
    public static final /* synthetic */ <T> T a(Context context) {
        l0.p(context, "<this>");
        l0.y(4, a.X4);
        return d.o(context, Object.class);
    }

    public static final void b(@g Context context, @b1 int i10, @g int[] iArr, @g l<? super TypedArray, u2> lVar) {
        l0.p(context, "<this>");
        l0.p(iArr, "attrs");
        l0.p(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, iArr);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        lVar.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void c(@g Context context, @h AttributeSet attributeSet, @g int[] iArr, @f int i10, @b1 int i11, @g l<? super TypedArray, u2> lVar) {
        l0.p(context, "<this>");
        l0.p(iArr, "attrs");
        l0.p(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        lVar.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributeSet = null;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        l0.p(context, "<this>");
        l0.p(iArr, "attrs");
        l0.p(lVar, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        lVar.A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
