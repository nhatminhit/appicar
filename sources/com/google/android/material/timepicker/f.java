package com.google.android.material.timepicker;

import android.view.accessibility.AccessibilityManager;
import bc.p;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import i0.d;
import i9.a;
import w1.a;

public class f implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, h {
    public static final String[] T = {"12", "1", "2", a.T4, "4", p.f16204w, "6", "7", "8", "9", "10", "11"};
    public static final String[] U = {ChipTextInputComboView.b.P, "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    public static final String[] V = {ChipTextInputComboView.b.P, p.f16204w, "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public static final int W = 30;
    public static final int X = 6;
    public TimePickerView O;
    public TimeModel P;
    public float Q;
    public float R;
    public boolean S = false;

    public f(TimePickerView timePickerView, TimeModel timeModel) {
        this.O = timePickerView;
        this.P = timeModel;
        b();
    }

    public void a() {
        this.O.setVisibility(0);
    }

    public void b() {
        if (this.P.Q == 0) {
            this.O.V();
        }
        this.O.K(this);
        this.O.S(this);
        this.O.R(this);
        this.O.P(this);
        m();
        invalidate();
    }

    public void c(float f10, boolean z10) {
        this.S = true;
        TimeModel timeModel = this.P;
        int i10 = timeModel.S;
        int i11 = timeModel.R;
        if (timeModel.T == 10) {
            this.O.M(this.R, false);
            if (!((AccessibilityManager) d.o(this.O.getContext(), AccessibilityManager.class)).isTouchExplorationEnabled()) {
                k(12, true);
            }
        } else {
            int round = Math.round(f10);
            if (!z10) {
                this.P.j(((round + 15) / 30) * 5);
                this.Q = (float) (this.P.S * 6);
            }
            this.O.M(this.Q, z10);
        }
        this.S = false;
        l();
        j(i11, i10);
    }

    public void d(float f10, boolean z10) {
        if (!this.S) {
            TimeModel timeModel = this.P;
            int i10 = timeModel.R;
            int i11 = timeModel.S;
            int round = Math.round(f10);
            TimeModel timeModel2 = this.P;
            if (timeModel2.T == 12) {
                timeModel2.j((round + 3) / 6);
                this.Q = (float) Math.floor((double) (this.P.S * 6));
            } else {
                this.P.g((round + (h() / 2)) / h());
                this.R = (float) (this.P.c() * h());
            }
            if (!z10) {
                l();
                j(i10, i11);
            }
        }
    }

    public void e(int i10) {
        this.P.l(i10);
    }

    public void f(int i10) {
        k(i10, true);
    }

    public void g() {
        this.O.setVisibility(8);
    }

    public final int h() {
        return this.P.Q == 1 ? 15 : 30;
    }

    public final String[] i() {
        return this.P.Q == 1 ? U : T;
    }

    public void invalidate() {
        this.R = (float) (this.P.c() * h());
        TimeModel timeModel = this.P;
        this.Q = (float) (timeModel.S * 6);
        k(timeModel.T, false);
        l();
    }

    public final void j(int i10, int i11) {
        TimeModel timeModel = this.P;
        if (timeModel.S != i11 || timeModel.R != i10) {
            this.O.performHapticFeedback(4);
        }
    }

    public void k(int i10, boolean z10) {
        boolean z11 = i10 == 12;
        this.O.L(z11);
        this.P.T = i10;
        this.O.c(z11 ? V : i(), z11 ? a.m.material_minute_suffix : a.m.material_hour_suffix);
        this.O.M(z11 ? this.Q : this.R, z10);
        this.O.a(i10);
        this.O.O(new b(this.O.getContext(), a.m.material_hour_selection));
        this.O.N(new b(this.O.getContext(), a.m.material_minute_selection));
    }

    public final void l() {
        TimePickerView timePickerView = this.O;
        TimeModel timeModel = this.P;
        timePickerView.b(timeModel.U, timeModel.c(), this.P.S);
    }

    public final void m() {
        n(T, TimeModel.W);
        n(U, TimeModel.W);
        n(V, TimeModel.V);
    }

    public final void n(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = TimeModel.b(this.O.getResources(), strArr[i10], str);
        }
    }
}
