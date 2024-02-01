package b1;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import fh.g;
import gf.m;
import kotlin.Metadata;
import n7.b;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\n¨\u0006\u000e"}, d2 = {"", "Landroid/text/Spannable;", "d", "Lzd/u2;", "a", "", "start", "end", "", "span", "b", "Lgf/m;", "range", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class n {
    @SuppressLint({"SyntheticAccessor"})
    public static final void a(@g Spannable spannable) {
        l0.p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    public static final void b(@g Spannable spannable, int i10, int i11, @g Object obj) {
        l0.p(spannable, "<this>");
        l0.p(obj, b.f10950r);
        spannable.setSpan(obj, i10, i11, 17);
    }

    public static final void c(@g Spannable spannable, @g m mVar, @g Object obj) {
        l0.p(spannable, "<this>");
        l0.p(mVar, "range");
        l0.p(obj, b.f10950r);
        spannable.setSpan(obj, mVar.c().intValue(), mVar.h().intValue(), 17);
    }

    @g
    public static final Spannable d(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
