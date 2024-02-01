package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class z {
    public static int a(RecyclerView.b0 b0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.Q() == 0 || b0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1;
        }
        return Math.min(wVar.o(), wVar.d(view2) - wVar.g(view));
    }

    public static int b(RecyclerView.b0 b0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z10, boolean z11) {
        if (oVar.Q() == 0 || b0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (b0Var.d() - Math.max(oVar.s0(view), oVar.s0(view2))) - 1) : Math.max(0, Math.min(oVar.s0(view), oVar.s0(view2)));
        if (!z10) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(wVar.d(view2) - wVar.g(view))) / ((float) (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1)))) + ((float) (wVar.n() - wVar.g(view))));
    }

    public static int c(RecyclerView.b0 b0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z10) {
        if (oVar.Q() == 0 || b0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b0Var.d();
        }
        return (int) ((((float) (wVar.d(view2) - wVar.g(view))) / ((float) (Math.abs(oVar.s0(view) - oVar.s0(view2)) + 1))) * ((float) b0Var.d()));
    }
}
