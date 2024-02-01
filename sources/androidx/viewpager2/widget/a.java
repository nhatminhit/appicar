package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import d.m0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f3996b;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayoutManager f3997a;

    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    public class C0056a implements Comparator<int[]> {
        public C0056a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f3996b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public a(@m0 LinearLayoutManager linearLayoutManager) {
        this.f3997a = linearLayoutManager;
    }

    public static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a() {
        int i10;
        int i11;
        int i12;
        int i13;
        int Q = this.f3997a.Q();
        if (Q == 0) {
            return true;
        }
        boolean z10 = this.f3997a.Q2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = Q;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i14 = 0;
        while (i14 < Q) {
            View P = this.f3997a.P(i14);
            if (P != null) {
                ViewGroup.LayoutParams layoutParams = P.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f3996b;
                int[] iArr3 = iArr2[i14];
                if (z10) {
                    i11 = P.getLeft();
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    i11 = P.getTop();
                    i10 = marginLayoutParams.topMargin;
                }
                iArr3[0] = i11 - i10;
                int[] iArr4 = iArr2[i14];
                if (z10) {
                    i13 = P.getRight();
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i13 = P.getBottom();
                    i12 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i13 + i12;
                i14++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C0056a());
        for (int i15 = 1; i15 < Q; i15++) {
            if (iArr2[i15 - 1][1] != iArr2[i15][0]) {
                return false;
            }
        }
        int[] iArr5 = iArr2[0];
        int i16 = iArr5[1];
        int i17 = iArr5[0];
        return i17 <= 0 && iArr2[Q - 1][1] >= i16 - i17;
    }

    public final boolean b() {
        int Q = this.f3997a.Q();
        for (int i10 = 0; i10 < Q; i10++) {
            if (c(this.f3997a.P(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return (!a() || this.f3997a.Q() <= 1) && b();
    }
}
