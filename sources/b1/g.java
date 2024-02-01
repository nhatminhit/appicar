package b1;

import android.text.Html;
import android.text.Spanned;
import fh.h;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\b¨\u0006\u000b"}, d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "a", "option", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class g {
    @fh.g
    public static final Spanned a(@fh.g String str, int i10, @h Html.ImageGetter imageGetter, @h Html.TagHandler tagHandler) {
        l0.p(str, "<this>");
        Spanned b10 = f.b(str, i10, imageGetter, tagHandler);
        l0.o(b10, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b10;
    }

    public static /* synthetic */ Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            imageGetter = null;
        }
        if ((i11 & 4) != 0) {
            tagHandler = null;
        }
        l0.p(str, "<this>");
        Spanned b10 = f.b(str, i10, imageGetter, tagHandler);
        l0.o(b10, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b10;
    }

    @fh.g
    public static final String c(@fh.g Spanned spanned, int i10) {
        l0.p(spanned, "<this>");
        String c10 = f.c(spanned, i10);
        l0.o(c10, "toHtml(this, option)");
        return c10;
    }

    public static /* synthetic */ String d(Spanned spanned, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        l0.p(spanned, "<this>");
        String c10 = f.c(spanned, i10);
        l0.o(c10, "toHtml(this, option)");
        return c10;
    }
}
