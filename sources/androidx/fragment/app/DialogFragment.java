package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.h0;
import androidx.lifecycle.y;
import d.b1;
import d.j0;
import d.m0;
import d.o0;
import d.x0;
import y2.f;

public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;

    /* renamed from: o1  reason: collision with root package name */
    public static final String f2418o1 = "android:savedDialogState";

    /* renamed from: p1  reason: collision with root package name */
    public static final String f2419p1 = "android:style";

    /* renamed from: q1  reason: collision with root package name */
    public static final String f2420q1 = "android:theme";

    /* renamed from: r1  reason: collision with root package name */
    public static final String f2421r1 = "android:cancelable";

    /* renamed from: s1  reason: collision with root package name */
    public static final String f2422s1 = "android:showsDialog";

    /* renamed from: t1  reason: collision with root package name */
    public static final String f2423t1 = "android:backStackId";

    /* renamed from: u1  reason: collision with root package name */
    public static final String f2424u1 = "android:dialogShowing";
    public Handler Y0;
    public Runnable Z0 = new a();

    /* renamed from: a1  reason: collision with root package name */
    public DialogInterface.OnCancelListener f2425a1 = new b();

    /* renamed from: b1  reason: collision with root package name */
    public DialogInterface.OnDismissListener f2426b1 = new c();

    /* renamed from: c1  reason: collision with root package name */
    public int f2427c1 = 0;

    /* renamed from: d1  reason: collision with root package name */
    public int f2428d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f2429e1 = true;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f2430f1 = true;

    /* renamed from: g1  reason: collision with root package name */
    public int f2431g1 = -1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f2432h1;

    /* renamed from: i1  reason: collision with root package name */
    public h0<y> f2433i1 = new d();
    @o0

    /* renamed from: j1  reason: collision with root package name */
    public Dialog f2434j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f2435k1;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f2436l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f2437m1;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f2438n1 = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogFragment.this.f2426b1.onDismiss(DialogFragment.this.f2434j1);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@o0 DialogInterface dialogInterface) {
            if (DialogFragment.this.f2434j1 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.f2434j1);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@o0 DialogInterface dialogInterface) {
            if (DialogFragment.this.f2434j1 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.f2434j1);
            }
        }
    }

    public class d implements h0<y> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void f(y yVar) {
            if (yVar != null && DialogFragment.this.f2430f1) {
                View requireView = DialogFragment.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (DialogFragment.this.f2434j1 != null) {
                    if (FragmentManager.T0(3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("DialogFragment ");
                        sb2.append(this);
                        sb2.append(" setting the content view on ");
                        sb2.append(DialogFragment.this.f2434j1);
                    }
                    DialogFragment.this.f2434j1.setContentView(requireView);
                }
            }
        }
    }

    public class e extends d {
        public final /* synthetic */ d O;

        public e(d dVar) {
            this.O = dVar;
        }

        @o0
        public View c(int i10) {
            return this.O.d() ? this.O.c(i10) : DialogFragment.this.N0(i10);
        }

        public boolean d() {
            return this.O.d() || DialogFragment.this.O0();
        }
    }

    public DialogFragment() {
    }

    public DialogFragment(@d.h0 int i10) {
        super(i10);
    }

    public final void M0(boolean z10, boolean z11) {
        if (!this.f2436l1) {
            this.f2436l1 = true;
            this.f2437m1 = false;
            Dialog dialog = this.f2434j1;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f2434j1.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.Y0.getLooper()) {
                        onDismiss(this.f2434j1);
                    } else {
                        this.Y0.post(this.Z0);
                    }
                }
            }
            this.f2435k1 = true;
            if (this.f2431g1 >= 0) {
                getParentFragmentManager().m1(this.f2431g1, 1);
                this.f2431g1 = -1;
                return;
            }
            u r10 = getParentFragmentManager().r();
            r10.x(this);
            if (z10) {
                r10.n();
            } else {
                r10.m();
            }
        }
    }

    @o0
    public View N0(int i10) {
        Dialog dialog = this.f2434j1;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    public boolean O0() {
        return this.f2438n1;
    }

    /* JADX INFO: finally extract failed */
    public final void P0(@o0 Bundle bundle) {
        if (this.f2430f1 && !this.f2438n1) {
            try {
                this.f2432h1 = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.f2434j1 = onCreateDialog;
                if (this.f2430f1) {
                    setupDialog(onCreateDialog, this.f2427c1);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f2434j1.setOwnerActivity((Activity) context);
                    }
                    this.f2434j1.setCancelable(this.f2429e1);
                    this.f2434j1.setOnCancelListener(this.f2425a1);
                    this.f2434j1.setOnDismissListener(this.f2426b1);
                    this.f2438n1 = true;
                } else {
                    this.f2434j1 = null;
                }
                this.f2432h1 = false;
            } catch (Throwable th2) {
                this.f2432h1 = false;
                throw th2;
            }
        }
    }

    public void c0(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        Bundle bundle2;
        super.c0(layoutInflater, viewGroup, bundle);
        if (this.f2461v0 == null && this.f2434j1 != null && bundle != null && (bundle2 = bundle.getBundle(f2418o1)) != null) {
            this.f2434j1.onRestoreInstanceState(bundle2);
        }
    }

    public void dismiss() {
        M0(false, false);
    }

    public void dismissAllowingStateLoss() {
        M0(true, false);
    }

    @o0
    public Dialog getDialog() {
        return this.f2434j1;
    }

    public boolean getShowsDialog() {
        return this.f2430f1;
    }

    @b1
    public int getTheme() {
        return this.f2428d1;
    }

    public boolean isCancelable() {
        return this.f2429e1;
    }

    @j0
    public void onAttach(@m0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().l(this.f2433i1);
        if (!this.f2437m1) {
            this.f2436l1 = false;
        }
    }

    public void onCancel(@m0 DialogInterface dialogInterface) {
    }

    @j0
    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.Y0 = new Handler();
        this.f2430f1 = this.f2451l0 == 0;
        if (bundle != null) {
            this.f2427c1 = bundle.getInt(f2419p1, 0);
            this.f2428d1 = bundle.getInt(f2420q1, 0);
            this.f2429e1 = bundle.getBoolean(f2421r1, true);
            this.f2430f1 = bundle.getBoolean(f2422s1, this.f2430f1);
            this.f2431g1 = bundle.getInt(f2423t1, -1);
        }
    }

    @j0
    @m0
    public Dialog onCreateDialog(@o0 Bundle bundle) {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateDialog called for DialogFragment ");
            sb2.append(this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    @j0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f2434j1;
        if (dialog != null) {
            this.f2435k1 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f2434j1.dismiss();
            if (!this.f2436l1) {
                onDismiss(this.f2434j1);
            }
            this.f2434j1 = null;
            this.f2438n1 = false;
        }
    }

    @j0
    public void onDetach() {
        super.onDetach();
        if (!this.f2437m1 && !this.f2436l1) {
            this.f2436l1 = true;
        }
        getViewLifecycleOwnerLiveData().p(this.f2433i1);
    }

    public void onDismiss(@m0 DialogInterface dialogInterface) {
        if (!this.f2435k1) {
            if (FragmentManager.T0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onDismiss called for DialogFragment ");
                sb2.append(this);
            }
            M0(true, true);
        }
    }

    @m0
    public LayoutInflater onGetLayoutInflater(@o0 Bundle bundle) {
        String str;
        StringBuilder sb2;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f2430f1 || this.f2432h1) {
            if (FragmentManager.T0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f2430f1) {
                    sb2 = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb2 = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb2.append(str);
                sb2.append(str2);
            }
            return onGetLayoutInflater;
        }
        P0(bundle);
        if (FragmentManager.T0(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("get layout inflater for DialogFragment ");
            sb3.append(this);
            sb3.append(" from dialog context");
        }
        Dialog dialog = this.f2434j1;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    @j0
    public void onSaveInstanceState(@m0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f2434j1;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(f2424u1, false);
            bundle.putBundle(f2418o1, onSaveInstanceState);
        }
        int i10 = this.f2427c1;
        if (i10 != 0) {
            bundle.putInt(f2419p1, i10);
        }
        int i11 = this.f2428d1;
        if (i11 != 0) {
            bundle.putInt(f2420q1, i11);
        }
        boolean z10 = this.f2429e1;
        if (!z10) {
            bundle.putBoolean(f2421r1, z10);
        }
        boolean z11 = this.f2430f1;
        if (!z11) {
            bundle.putBoolean(f2422s1, z11);
        }
        int i12 = this.f2431g1;
        if (i12 != -1) {
            bundle.putInt(f2423t1, i12);
        }
    }

    @j0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f2434j1;
        if (dialog != null) {
            this.f2435k1 = false;
            dialog.show();
            View decorView = this.f2434j1.getWindow().getDecorView();
            c1.b(decorView, this);
            e1.b(decorView, this);
            f.b(decorView, this);
        }
    }

    @j0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f2434j1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @j0
    public void onViewStateRestored(@o0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f2434j1 != null && bundle != null && (bundle2 = bundle.getBundle(f2418o1)) != null) {
            this.f2434j1.onRestoreInstanceState(bundle2);
        }
    }

    @m0
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z10) {
        this.f2429e1 = z10;
        Dialog dialog = this.f2434j1;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void setShowsDialog(boolean z10) {
        this.f2430f1 = z10;
    }

    public void setStyle(int i10, @b1 int i11) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting style and theme for DialogFragment ");
            sb2.append(this);
            sb2.append(" to ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
        }
        this.f2427c1 = i10;
        if (i10 == 2 || i10 == 3) {
            this.f2428d1 = 16973913;
        }
        if (i11 != 0) {
            this.f2428d1 = i11;
        }
    }

    @x0({x0.a.Q})
    public void setupDialog(@m0 Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(@m0 u uVar, @o0 String str) {
        this.f2436l1 = false;
        this.f2437m1 = true;
        uVar.g(this, str);
        this.f2435k1 = false;
        int m10 = uVar.m();
        this.f2431g1 = m10;
        return m10;
    }

    public void show(@m0 FragmentManager fragmentManager, @o0 String str) {
        this.f2436l1 = false;
        this.f2437m1 = true;
        u r10 = fragmentManager.r();
        r10.g(this, str);
        r10.m();
    }

    public void showNow(@m0 FragmentManager fragmentManager, @o0 String str) {
        this.f2436l1 = false;
        this.f2437m1 = true;
        u r10 = fragmentManager.r();
        r10.g(this, str);
        r10.o();
    }

    @m0
    public d v() {
        return new e(super.v());
    }
}
