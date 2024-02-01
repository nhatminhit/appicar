package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import java.util.Arrays;
import java.util.HashMap;
import z.f;
import z.i;
import z.j;

public abstract class ConstraintHelper extends View {
    public int[] O = new int[32];
    public int P;
    public Context Q;
    public i R;
    public boolean S = false;
    public String T;
    public String U;
    public View[] V = null;
    public HashMap<Integer, String> W = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.Q = context;
        o((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = context;
        o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Q = context;
        o(attributeSet);
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.Q != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int m10 = m(trim);
            if (m10 != 0) {
                this.W.put(Integer.valueOf(m10), trim);
                f(m10);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find id of \"");
            sb2.append(trim);
            sb2.append("\"");
        }
    }

    public final void f(int i10) {
        if (i10 != getId()) {
            int i11 = this.P + 1;
            int[] iArr = this.O;
            if (i11 > iArr.length) {
                this.O = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.O;
            int i12 = this.P;
            iArr2[i12] = i10;
            this.P = i12 + 1;
        }
    }

    public final void g(String str) {
        if (str != null && str.length() != 0 && this.Q != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = constraintLayout.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).V)) {
                        if (childAt.getId() == -1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("to use ConstraintTag view ");
                            sb2.append(childAt.getClass().getSimpleName());
                            sb2.append(" must have an ID");
                        } else {
                            f(childAt.getId());
                        }
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.O, this.P);
    }

    public void h(View view) {
        if (view != this && view.getId() != -1 && view.getParent() != null) {
            this.T = null;
            f(view.getId());
            requestLayout();
        }
    }

    public void i() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            j((ConstraintLayout) parent);
        }
    }

    public void j(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.P; i10++) {
            View o10 = constraintLayout.o(this.O[i10]);
            if (o10 != null) {
                o10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    o10.setTranslationZ(o10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int[] k(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        for (String trim : split) {
            int m10 = m(trim.trim());
            if (m10 != 0) {
                iArr[i10] = m10;
                i10++;
            }
        }
        return i10 != split.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public final int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.Q.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m10 = constraintLayout.m(0, str);
            if (m10 instanceof Integer) {
                i10 = ((Integer) m10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = l(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = e.g.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.Q.getResources().getIdentifier(str, "id", this.Q.getPackageName()) : i10;
    }

    public View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.V;
        if (viewArr == null || viewArr.length != this.P) {
            this.V = new View[this.P];
        }
        for (int i10 = 0; i10 < this.P; i10++) {
            this.V[i10] = constraintLayout.o(this.O[i10]);
        }
        return this.V;
    }

    public void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.T = string;
                    setIds(string);
                } else if (index == e.m.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.U = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.T;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.U;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i10, int i11) {
        if (this.S) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(d.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray<z.e> sparseArray) {
        d.b bVar2 = aVar.f1999d;
        int[] iArr = bVar2.f2038e0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f2040f0;
            if (str != null && str.length() > 0) {
                d.b bVar3 = aVar.f1999d;
                bVar3.f2038e0 = k(this, bVar3.f2040f0);
            }
        }
        jVar.a();
        if (aVar.f1999d.f2038e0 != null) {
            int i10 = 0;
            while (true) {
                int[] iArr2 = aVar.f1999d.f2038e0;
                if (i10 < iArr2.length) {
                    z.e eVar = sparseArray.get(iArr2[i10]);
                    if (eVar != null) {
                        jVar.b(eVar);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void q(View view) {
        int i10;
        int id2 = view.getId();
        if (id2 != -1) {
            this.T = null;
            int i11 = 0;
            while (true) {
                if (i11 >= this.P) {
                    break;
                } else if (this.O[i11] == id2) {
                    while (true) {
                        i10 = this.P;
                        if (i11 >= i10 - 1) {
                            break;
                        }
                        int[] iArr = this.O;
                        int i12 = i11 + 1;
                        iArr[i11] = iArr[i12];
                        i11 = i12;
                    }
                    this.O[i10 - 1] = 0;
                    this.P = i10 - 1;
                } else {
                    i11++;
                }
            }
            requestLayout();
        }
    }

    public void r(z.e eVar, boolean z10) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) {
        this.T = str;
        if (str != null) {
            int i10 = 0;
            this.P = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    e(str.substring(i10));
                    return;
                } else {
                    e(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.U = str;
        if (str != null) {
            int i10 = 0;
            this.P = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    g(str.substring(i10));
                    return;
                } else {
                    g(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.T = null;
        this.P = 0;
        for (int f10 : iArr) {
            f(f10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.T == null) {
            f(i10);
        }
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(ConstraintLayout constraintLayout) {
    }

    public void v(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.W.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.T
            r5.setIds(r0)
        L_0x000b:
            z.i r0 = r5.R
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.a()
            r0 = 0
        L_0x0014:
            int r1 = r5.P
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.O
            r1 = r1[r0]
            android.view.View r2 = r6.o(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.W
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.l(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.O
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.W
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.o(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            z.i r1 = r5.R
            z.e r2 = r6.p(r2)
            r1.b(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            z.i r0 = r5.R
            z.f r6 = r6.Q
            r0.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.w(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void x(f fVar, i iVar, SparseArray<z.e> sparseArray) {
        iVar.a();
        for (int i10 = 0; i10 < this.P; i10++) {
            iVar.b(sparseArray.get(this.O[i10]));
        }
    }

    public void y() {
        if (this.R != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f1836n0 = (z.e) this.R;
            }
        }
    }
}
