package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import d.m0;
import d.o0;

public final class n {
    @o0
    public static View.OnTouchListener a(@m0 Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
