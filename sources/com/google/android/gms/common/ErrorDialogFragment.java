package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import d.m0;
import d.o0;
import j8.s;

public class ErrorDialogFragment extends DialogFragment {
    public Dialog O;
    public DialogInterface.OnCancelListener P;
    @o0
    public Dialog Q;

    @m0
    public static ErrorDialogFragment a(@m0 Dialog dialog) {
        return b(dialog, (DialogInterface.OnCancelListener) null);
    }

    @m0
    public static ErrorDialogFragment b(@m0 Dialog dialog, @o0 DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        errorDialogFragment.O = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.P = onCancelListener;
        }
        return errorDialogFragment;
    }

    public void onCancel(@m0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.P;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @m0
    public Dialog onCreateDialog(@o0 Bundle bundle) {
        Dialog dialog = this.O;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.Q == null) {
            this.Q = new AlertDialog.Builder((Context) s.l(getActivity())).create();
        }
        return this.Q;
    }

    public void show(@m0 FragmentManager fragmentManager, @o0 String str) {
        super.show(fragmentManager, str);
    }
}
