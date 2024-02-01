package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d.m0;
import d.o0;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: v1  reason: collision with root package name */
    public boolean f16800v1;

    public class b extends BottomSheetBehavior.f {
        public b() {
        }

        public void a(@m0 View view, float f10) {
        }

        public void b(@m0 View view, int i10) {
            if (i10 == 5) {
                BottomSheetDialogFragment.this.R0();
            }
        }
    }

    public final void R0() {
        if (this.f16800v1) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final void S0(@m0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f16800v1 = z10;
        if (bottomSheetBehavior.g0() == 5) {
            R0();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).i();
        }
        bottomSheetBehavior.O(new b());
        bottomSheetBehavior.B0(5);
    }

    public final boolean T0(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> g10 = bottomSheetDialog.g();
        if (!g10.l0() || !bottomSheetDialog.h()) {
            return false;
        }
        S0(g10, z10);
        return true;
    }

    public void dismiss() {
        if (!T0(false)) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        if (!T0(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    @m0
    public Dialog onCreateDialog(@o0 Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }
}
