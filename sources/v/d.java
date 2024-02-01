package v;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import java.io.PrintStream;
import java.util.HashMap;

public class d implements s {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f13900g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final String f13901h = "DesignTool";

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<Pair<Integer, Integer>, String> f13902i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, String> f13903j;

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f13904a;

    /* renamed from: b  reason: collision with root package name */
    public a f13905b;

    /* renamed from: c  reason: collision with root package name */
    public String f13906c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f13907d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f13908e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f13909f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f13902i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f13903j = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public d(MotionLayout motionLayout) {
        this.f13904a = motionLayout;
    }

    public static void j(int i10, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i11, int i12) {
        String str = f13902i.get(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            int i13 = 0;
            String str3 = f13903j.get(str);
            if (str3 != null) {
                i13 = k(i10, hashMap.get(str3));
            }
            int parseInt = Integer.parseInt(str2);
            androidx.constraintlayout.widget.d dVar2 = dVar;
            dVar2.E(view.getId(), i11, parseInt, i12, i13);
        }
    }

    public static int k(int i10, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) (((float) (Integer.valueOf(str.substring(0, indexOf)).intValue() * i10)) / 160.0f);
    }

    public static void l(int i10, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            dVar.F0(view.getId(), k(i10, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            dVar.G0(view.getId(), k(i10, str2));
        }
    }

    public static void m(androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i10) {
        String str = hashMap.get(i10 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str == null) {
            return;
        }
        if (i10 == 0) {
            dVar.O0(view.getId(), Float.parseFloat(str));
        } else if (i10 == 1) {
            dVar.i1(view.getId(), Float.parseFloat(str));
        }
    }

    public static void n(int i10, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i11) {
        String str = hashMap.get(i11 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int i12 = -2;
            if (!str.equalsIgnoreCase("wrap_content")) {
                i12 = k(i10, str);
            }
            int id2 = view.getId();
            if (i11 == 0) {
                dVar.P(id2, i12);
            } else {
                dVar.I(id2, i12);
            }
        }
    }

    public String A() {
        if (!(this.f13906c == null || this.f13907d == null)) {
            float y10 = y();
            if (y10 <= 0.01f) {
                return this.f13906c;
            }
            if (y10 >= 0.99f) {
                return this.f13907d;
            }
        }
        return this.f13906c;
    }

    public boolean B() {
        return (this.f13906c == null || this.f13907d == null) ? false : true;
    }

    public void C(Object obj, String str, Object obj2) {
        if (obj instanceof e) {
            ((e) obj).f(str, obj2);
            this.f13904a.F0();
            this.f13904a.O0 = true;
        }
    }

    public void D(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f13906c != str) {
            this.f13906c = str;
            this.f13907d = null;
            MotionLayout motionLayout = this.f13904a;
            if (motionLayout.f1607x0 == null) {
                motionLayout.f1607x0 = this.f13905b;
            }
            int A0 = motionLayout.A0(str);
            this.f13908e = A0;
            if (A0 != 0) {
                if (A0 == this.f13904a.getStartState()) {
                    this.f13904a.setProgress(0.0f);
                } else {
                    if (A0 != this.f13904a.getEndState()) {
                        this.f13904a.N0(A0);
                    }
                    this.f13904a.setProgress(1.0f);
                }
            }
            this.f13904a.requestLayout();
        }
    }

    public void E(String str, String str2) {
        MotionLayout motionLayout = this.f13904a;
        if (motionLayout.f1607x0 == null) {
            motionLayout.f1607x0 = this.f13905b;
        }
        int A0 = motionLayout.A0(str);
        int A02 = this.f13904a.A0(str2);
        this.f13904a.I0(A0, A02);
        this.f13908e = A0;
        this.f13909f = A02;
        this.f13906c = str;
        this.f13907d = str2;
    }

    public void F(Object obj, int i10) {
        p pVar = this.f13904a.G0.get(obj);
        if (pVar != null) {
            pVar.C(i10);
            this.f13904a.invalidate();
        }
    }

    public long a() {
        return this.f13904a.getTransitionTimeMs();
    }

    public int b(int i10, String str, Object obj, float[] fArr, int i11, float[] fArr2, int i12) {
        p pVar;
        View view = (View) obj;
        if (i10 != 0) {
            MotionLayout motionLayout = this.f13904a;
            if (motionLayout.f1607x0 == null || view == null || (pVar = motionLayout.G0.get(view)) == null) {
                return -1;
            }
        } else {
            pVar = null;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            int p10 = this.f13904a.f1607x0.p() / 16;
            pVar.f(fArr2, p10);
            return p10;
        } else if (i10 == 2) {
            int p11 = this.f13904a.f1607x0.p() / 16;
            pVar.e(fArr2, (int[]) null);
            return p11;
        } else if (i10 != 3) {
            return -1;
        } else {
            int p12 = this.f13904a.f1607x0.p() / 16;
            return pVar.j(str, fArr2, i12);
        }
    }

    public boolean c(Object obj, int i10, int i11, float f10, float f11) {
        MotionLayout motionLayout = this.f13904a;
        if (motionLayout.f1607x0 == null) {
            return false;
        }
        p pVar = motionLayout.G0.get(obj);
        MotionLayout motionLayout2 = this.f13904a;
        int i12 = (int) (motionLayout2.J0 * 100.0f);
        if (pVar == null) {
            return false;
        }
        View view = (View) obj;
        if (!motionLayout2.f1607x0.I(view, i12)) {
            return false;
        }
        float q10 = pVar.q(2, f10, f11);
        float q11 = pVar.q(5, f10, f11);
        this.f13904a.f1607x0.Y(view, i12, "motion:percentX", Float.valueOf(q10));
        this.f13904a.f1607x0.Y(view, i12, "motion:percentY", Float.valueOf(q11));
        this.f13904a.F0();
        this.f13904a.l0(true);
        this.f13904a.invalidate();
        return true;
    }

    public void d(float f10) {
        MotionLayout motionLayout = this.f13904a;
        if (motionLayout.f1607x0 == null) {
            motionLayout.f1607x0 = this.f13905b;
        }
        motionLayout.setProgress(f10);
        this.f13904a.l0(true);
        this.f13904a.requestLayout();
        this.f13904a.invalidate();
    }

    public Boolean e(Object obj, Object obj2, float f10, float f11, String[] strArr, float[] fArr) {
        if (!(obj instanceof l)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f13904a.G0.get(view).A(view, (l) obj, f10, f11, strArr, fArr);
        this.f13904a.F0();
        this.f13904a.O0 = true;
        return Boolean.TRUE;
    }

    public void f(Object obj, int i10, String str, Object obj2) {
        a aVar = this.f13904a.f1607x0;
        if (aVar != null) {
            aVar.Y((View) obj, i10, str, obj2);
            MotionLayout motionLayout = this.f13904a;
            motionLayout.M0 = ((float) i10) / 100.0f;
            motionLayout.K0 = 0.0f;
            motionLayout.F0();
            this.f13904a.l0(true);
        }
    }

    public void g(int i10, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int A0 = this.f13904a.A0(str);
        androidx.constraintlayout.widget.d k10 = this.f13904a.f1607x0.k(A0);
        if (k10 != null) {
            k10.x(view.getId());
            n(i10, k10, view, hashMap, 0);
            n(i10, k10, view, hashMap, 1);
            int i11 = i10;
            androidx.constraintlayout.widget.d dVar = k10;
            View view2 = view;
            HashMap hashMap2 = hashMap;
            j(i11, dVar, view2, hashMap2, 6, 6);
            j(i11, dVar, view2, hashMap2, 6, 7);
            j(i11, dVar, view2, hashMap2, 7, 7);
            j(i11, dVar, view2, hashMap2, 7, 6);
            j(i11, dVar, view2, hashMap2, 1, 1);
            j(i11, dVar, view2, hashMap2, 1, 2);
            j(i11, dVar, view2, hashMap2, 2, 2);
            j(i11, dVar, view2, hashMap2, 2, 1);
            j(i11, dVar, view2, hashMap2, 3, 3);
            j(i11, dVar, view2, hashMap2, 3, 4);
            j(i11, dVar, view2, hashMap2, 4, 3);
            j(i11, dVar, view2, hashMap2, 4, 4);
            j(i11, dVar, view2, hashMap2, 5, 5);
            m(k10, view, hashMap, 0);
            m(k10, view, hashMap, 1);
            l(i10, k10, view, hashMap);
            this.f13904a.Q0(A0, k10);
            this.f13904a.requestLayout();
        }
    }

    public float h(Object obj, int i10, float f10, float f11) {
        return this.f13904a.G0.get((View) obj).q(i10, f10, f11);
    }

    public Object i(Object obj, float f10, float f11) {
        p pVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f13904a;
        if (motionLayout.f1607x0 == null) {
            return -1;
        }
        if (view == null || (pVar = motionLayout.G0.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return pVar.r(viewGroup.getWidth(), viewGroup.getHeight(), f10, f11);
    }

    public void o(boolean z10) {
        this.f13904a.j0(z10);
    }

    public void p(String str) {
        MotionLayout motionLayout = this.f13904a;
        if (motionLayout.f1607x0 == null) {
            motionLayout.f1607x0 = this.f13905b;
        }
        int A0 = motionLayout.A0(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + A0 + ")");
        try {
            this.f13904a.f1607x0.k(A0).Z(this.f13904a.f1607x0, new int[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public int q(Object obj, float[] fArr) {
        a aVar = this.f13904a.f1607x0;
        if (aVar == null) {
            return -1;
        }
        int p10 = aVar.p() / 16;
        p pVar = this.f13904a.G0.get(obj);
        if (pVar == null) {
            return 0;
        }
        pVar.e(fArr, (int[]) null);
        return p10;
    }

    public int r(Object obj, float[] fArr, int i10) {
        MotionLayout motionLayout = this.f13904a;
        if (motionLayout.f1607x0 == null) {
            return -1;
        }
        p pVar = motionLayout.G0.get(obj);
        if (pVar == null) {
            return 0;
        }
        pVar.f(fArr, i10);
        return i10;
    }

    public void s(Object obj, float[] fArr) {
        a aVar = this.f13904a.f1607x0;
        if (aVar != null) {
            int p10 = aVar.p() / 16;
            p pVar = this.f13904a.G0.get(obj);
            if (pVar != null) {
                pVar.h(fArr, p10);
            }
        }
    }

    public String t() {
        int endState = this.f13904a.getEndState();
        if (this.f13909f == endState) {
            return this.f13907d;
        }
        String t02 = this.f13904a.t0(endState);
        if (t02 != null) {
            this.f13907d = t02;
            this.f13909f = endState;
        }
        return t02;
    }

    public int u(Object obj, int i10, int[] iArr) {
        p pVar = this.f13904a.G0.get((View) obj);
        if (pVar == null) {
            return 0;
        }
        return pVar.p(i10, iArr);
    }

    public int v(Object obj, int[] iArr, float[] fArr) {
        p pVar = this.f13904a.G0.get((View) obj);
        if (pVar == null) {
            return 0;
        }
        return pVar.w(iArr, fArr);
    }

    public Object w(int i10, int i11, int i12) {
        MotionLayout motionLayout = this.f13904a;
        a aVar = motionLayout.f1607x0;
        if (aVar == null) {
            return null;
        }
        return aVar.u(motionLayout.getContext(), i10, i11, i12);
    }

    public Object x(Object obj, int i10, int i11) {
        if (this.f13904a.f1607x0 == null) {
            return null;
        }
        int id2 = ((View) obj).getId();
        MotionLayout motionLayout = this.f13904a;
        return motionLayout.f1607x0.u(motionLayout.getContext(), i10, id2, i11);
    }

    public float y() {
        return this.f13904a.getProgress();
    }

    public String z() {
        int startState = this.f13904a.getStartState();
        if (this.f13908e == startState) {
            return this.f13906c;
        }
        String t02 = this.f13904a.t0(startState);
        if (t02 != null) {
            this.f13906c = t02;
            this.f13908e = startState;
        }
        return this.f13904a.t0(startState);
    }
}
