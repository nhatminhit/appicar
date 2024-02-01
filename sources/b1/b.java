package b1;

import android.text.TextUtils;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\b¨\u0006\u0005"}, d2 = {"", "", "a", "", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class b {
    public static final boolean a(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
