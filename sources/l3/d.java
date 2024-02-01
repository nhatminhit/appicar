package l3;

import android.view.View;
import android.view.ViewGroup;
import d.b0;
import d.o0;

public class d {
    @o0
    public static <T extends View> T a(View view, @b0 int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            T findViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
