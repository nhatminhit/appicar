package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.m0;
import d.x0;
import f1.o2;
import f1.s0;
import f1.w1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@x0({x0.a.Q})
@SuppressLint({"UnknownNullness"})
public abstract class x {

    public class a implements Runnable {
        public final /* synthetic */ int O;
        public final /* synthetic */ ArrayList P;
        public final /* synthetic */ ArrayList Q;
        public final /* synthetic */ ArrayList R;
        public final /* synthetic */ ArrayList S;

        public a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.O = i10;
            this.P = arrayList;
            this.Q = arrayList2;
            this.R = arrayList3;
            this.S = arrayList4;
        }

        public void run() {
            for (int i10 = 0; i10 < this.O; i10++) {
                w1.r2((View) this.P.get(i10), (String) this.Q.get(i10));
                w1.r2((View) this.R.get(i10), (String) this.S.get(i10));
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ArrayList O;
        public final /* synthetic */ Map P;

        public b(ArrayList arrayList, Map map) {
            this.O = arrayList;
            this.P = map;
        }

        public void run() {
            int size = this.O.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.O.get(i10);
                String w02 = w1.w0(view);
                if (w02 != null) {
                    w1.r2(view, x.i(this.P, w02));
                }
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ ArrayList O;
        public final /* synthetic */ Map P;

        public c(ArrayList arrayList, Map map) {
            this.O = arrayList;
            this.P = map;
        }

        public void run() {
            int size = this.O.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.O.get(i10);
                w1.r2(view, (String) this.P.get(w1.w0(view)));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            if (w1.w0(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (!h(list, childAt, size) && w1.w0(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    public static String i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z10 = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z10) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean c10 = o2.c(viewGroup2);
                viewGroup = viewGroup2;
                if (!c10) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        f(arrayList, viewGroup2.getChildAt(i10));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    public void j(Map<String, View> map, @m0 View view) {
        if (view.getVisibility() == 0) {
            String w02 = w1.w0(view);
            if (w02 != null) {
                map.put(w02, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    public void k(View view, Rect rect) {
        if (w1.N0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(w1.w0(view));
            w1.r2(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        s0.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(@m0 Fragment fragment, @m0 Object obj, @m0 x0.c cVar, @m0 Runnable runnable) {
        runnable.run();
    }

    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        s0.a(view, new b(arrayList, map));
    }

    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String w02 = w1.w0(view2);
            arrayList4.add(w02);
            if (w02 != null) {
                w1.r2(view2, (String) null);
                String str = map.get(w02);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        w1.r2(arrayList2.get(i11), w02);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        s0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
