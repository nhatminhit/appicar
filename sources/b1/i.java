package b1;

import android.text.TextUtils;
import d.t0;
import fh.g;
import java.util.Locale;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "", "a", "(Ljava/util/Locale;)I", "layoutDirection", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class i {
    @t0(17)
    public static final int a(@g Locale locale) {
        l0.p(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
