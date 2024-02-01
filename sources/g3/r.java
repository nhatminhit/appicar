package g3;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import d.m0;
import g3.d0;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
public class r extends FrameLayout {
    @m0
    public ViewGroup O;
    public boolean P = true;

    public r(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.O = viewGroup;
        viewGroup.setTag(d0.e.ghost_view_holder, this);
        z0.b(this.O).c(this);
    }

    public static r b(@m0 ViewGroup viewGroup) {
        return (r) viewGroup.getTag(d0.e.ghost_view_holder);
    }

    public static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(z0.a(viewGroup, i10));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    public static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i10 = 1; i10 < min; i10++) {
            View view = arrayList.get(i10);
            View view2 = arrayList2.get(i10);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    public void a(t tVar) {
        ArrayList arrayList = new ArrayList();
        d(tVar.Q, arrayList);
        int c10 = c(arrayList);
        if (c10 < 0 || c10 >= getChildCount()) {
            addView(tVar);
        } else {
            addView(tVar, c10);
        }
    }

    public final int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i10 = 0;
        while (i10 <= childCount) {
            int i11 = (i10 + childCount) / 2;
            d(((t) getChildAt(i11)).Q, arrayList2);
            if (f(arrayList, arrayList2)) {
                i10 = i11 + 1;
            } else {
                childCount = i11 - 1;
            }
            arrayList2.clear();
        }
        return i10;
    }

    public void g() {
        if (this.P) {
            z0.b(this.O).d(this);
            z0.b(this.O).c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.P) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.O.setTag(d0.e.ghost_view_holder, (Object) null);
            z0.b(this.O).d(this);
            this.P = false;
        }
    }
}
