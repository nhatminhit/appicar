package f1;

import android.view.View;
import d.m0;

public interface n0 {
    int getNestedScrollAxes();

    boolean onNestedFling(@m0 View view, float f10, float f11, boolean z10);

    boolean onNestedPreFling(@m0 View view, float f10, float f11);

    void onNestedPreScroll(@m0 View view, int i10, int i11, @m0 int[] iArr);

    void onNestedScroll(@m0 View view, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(@m0 View view, @m0 View view2, int i10);

    boolean onStartNestedScroll(@m0 View view, @m0 View view2, int i10);

    void onStopNestedScroll(@m0 View view);
}
