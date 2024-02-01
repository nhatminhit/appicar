package b1;

import android.text.TextUtils;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\b¨\u0006\u0002"}, d2 = {"", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class p {
    @g
    public static final String a(@g String str) {
        l0.p(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        l0.o(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
