package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import d.m0;
import d.o0;
import d.x0;

public class AppCompatDialogFragment extends DialogFragment {
    @m0
    public Dialog onCreateDialog(@o0 Bundle bundle) {
        return new AppCompatDialog(getContext(), getTheme());
    }

    @x0({x0.a.Q})
    public void setupDialog(@m0 Dialog dialog, int i10) {
        if (dialog instanceof AppCompatDialog) {
            AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            appCompatDialog.e(1);
            return;
        }
        super.setupDialog(dialog, i10);
    }
}
