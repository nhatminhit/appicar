package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d.b1;
import d.h0;
import d.m0;
import d.o0;
import f1.w1;
import g1.z;
import i9.a;

public class BottomSheetDialog extends AppCompatDialog {
    public BottomSheetBehavior<FrameLayout> Q;
    public FrameLayout R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    @m0
    public BottomSheetBehavior.f W;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.T && bottomSheetDialog.isShowing() && BottomSheetDialog.this.l()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    public class b extends f1.a {
        public b() {
        }

        public void g(View view, @m0 z zVar) {
            boolean z10;
            super.g(view, zVar);
            if (BottomSheetDialog.this.T) {
                zVar.a(1048576);
                z10 = true;
            } else {
                z10 = false;
            }
            zVar.b1(z10);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.T) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.j(view, i10, bundle);
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class d extends BottomSheetBehavior.f {
        public d() {
        }

        public void a(@m0 View view, float f10) {
        }

        public void b(@m0 View view, int i10) {
            if (i10 == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    public BottomSheetDialog(@m0 Context context) {
        this(context, 0);
    }

    public BottomSheetDialog(@m0 Context context, @b1 int i10) {
        super(context, c(context, i10));
        this.T = true;
        this.U = true;
        this.W = new d();
        e(1);
    }

    public BottomSheetDialog(@m0 Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.T = true;
        this.U = true;
        this.W = new d();
        e(1);
        this.T = z10;
    }

    public static int c(@m0 Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(a.c.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : a.n.Theme_Design_Light_BottomSheetDialog;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> g10 = g();
        if (!this.S || g10.g0() == 5) {
            super.cancel();
        } else {
            g10.B0(5);
        }
    }

    public final FrameLayout f() {
        if (this.R == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), a.k.design_bottom_sheet_dialog, (ViewGroup) null);
            this.R = frameLayout;
            BottomSheetBehavior<FrameLayout> Z = BottomSheetBehavior.Z((FrameLayout) frameLayout.findViewById(a.h.design_bottom_sheet));
            this.Q = Z;
            Z.O(this.W);
            this.Q.w0(this.T);
        }
        return this.R;
    }

    @m0
    public BottomSheetBehavior<FrameLayout> g() {
        if (this.Q == null) {
            f();
        }
        return this.Q;
    }

    public boolean h() {
        return this.S;
    }

    public void i() {
        this.Q.m0(this.W);
    }

    public void k(boolean z10) {
        this.S = z10;
    }

    public boolean l() {
        if (!this.V) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.U = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.V = true;
        }
        return this.U;
    }

    public final View m(int i10, @o0 View view, @o0 ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.R.findViewById(a.h.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.R.findViewById(a.h.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(a.h.touch_outside).setOnClickListener(new a());
        w1.z1(frameLayout, new b());
        frameLayout.setOnTouchListener(new c());
        return this.R;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.Q;
        if (bottomSheetBehavior != null && bottomSheetBehavior.g0() == 5) {
            this.Q.B0(4);
        }
    }

    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.T != z10) {
            this.T = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.Q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.w0(z10);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.T) {
            this.T = true;
        }
        this.U = z10;
        this.V = true;
    }

    public void setContentView(@h0 int i10) {
        super.setContentView(m(i10, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(m(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m(0, view, layoutParams));
    }
}
