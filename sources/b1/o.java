package b1;

import android.text.Spanned;
import android.text.SpannedString;
import fh.g;
import kotlin.Metadata;
import w1.a;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a<\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Landroid/text/Spanned;", "c", "", "T", "", "start", "end", "", "a", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class o {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i10, int i11) {
        l0.p(spanned, "<this>");
        l0.y(4, a.X4);
        T[] spans = spanned.getSpans(i10, i11, Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = spanned.length();
        }
        l0.p(spanned, "<this>");
        l0.y(4, a.X4);
        Object[] spans = spanned.getSpans(i10, i11, Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @g
    public static final Spanned c(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
