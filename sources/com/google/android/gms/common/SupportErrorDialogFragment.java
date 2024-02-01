package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import d.m0;
import d.o0;
import j8.s;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: v1  reason: collision with root package name */
    public Dialog f5626v1;

    /* renamed from: w1  reason: collision with root package name */
    public DialogInterface.OnCancelListener f5627w1;
    @o0

    /* renamed from: x1  reason: collision with root package name */
    public Dialog f5628x1;

    @m0
    public static SupportErrorDialogFragment Q0(@m0 Dialog dialog) {
        return R0(dialog, (DialogInterface.OnCancelListener) null);
    }

    @m0
    public static SupportErrorDialogFragment R0(@m0 Dialog dialog, @o0 DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f5626v1 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f5627w1 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(@m0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5627w1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @m0
    public Dialog onCreateDialog(@o0 Bundle bundle) {
        Dialog dialog = this.f5626v1;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f5628x1 == null) {
            this.f5628x1 = new AlertDialog.Builder((Context) s.l(getContext())).create();
        }
        return this.f5628x1;
    }

    public void show(@m0 FragmentManager fragmentManager, @o0 String str) {
        super.show(fragmentManager, str);
    }
}
