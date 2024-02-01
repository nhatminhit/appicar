package h0;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import d.m0;

public class o {
    @m0
    public static View a(@m0 Dialog dialog, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(i10);
        }
        View findViewById = dialog.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
