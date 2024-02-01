package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import d.m0;
import d.o0;

public final class k {
    @o0
    public static View.OnTouchListener a(@m0 ListPopupWindow listPopupWindow, @m0 View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
