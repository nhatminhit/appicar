package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import z.a;
import z.f;
import z.j;

public class Barrier extends ConstraintHelper {

    /* renamed from: d0  reason: collision with root package name */
    public static final int f1765d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f1766e0 = 2;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f1767f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f1768g0 = 3;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f1769h0 = 5;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f1770i0 = 6;

    /* renamed from: a0  reason: collision with root package name */
    public int f1771a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1772b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f1773c0;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r6 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 == 6) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(z.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1772b0 = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L_0x0012
            int r6 = r3.f1771a0
            if (r6 != r2) goto L_0x000f
        L_0x000c:
            r3.f1772b0 = r5
            goto L_0x001c
        L_0x000f:
            if (r6 != r1) goto L_0x001c
            goto L_0x0016
        L_0x0012:
            int r6 = r3.f1771a0
            if (r6 != r2) goto L_0x0019
        L_0x0016:
            r3.f1772b0 = r0
            goto L_0x001c
        L_0x0019:
            if (r6 != r1) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            boolean r5 = r4 instanceof z.a
            if (r5 == 0) goto L_0x0027
            z.a r4 = (z.a) r4
            int r5 = r3.f1772b0
            r4.X1(r5)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.A(z.e, int, boolean):void");
    }

    public int getMargin() {
        return this.f1773c0.T1();
    }

    public int getType() {
        return this.f1771a0;
    }

    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.f1773c0 = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == e.m.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1773c0.W1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == e.m.ConstraintLayout_Layout_barrierMargin) {
                    this.f1773c0.Y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R = this.f1773c0;
        y();
    }

    public void p(d.a aVar, j jVar, ConstraintLayout.b bVar, SparseArray<z.e> sparseArray) {
        super.p(aVar, jVar, bVar, sparseArray);
        if (jVar instanceof a) {
            a aVar2 = (a) jVar;
            A(aVar2, aVar.f1999d.f2032b0, ((f) jVar.U()).s2());
            aVar2.W1(aVar.f1999d.f2048j0);
            aVar2.Y1(aVar.f1999d.f2034c0);
        }
    }

    public void r(z.e eVar, boolean z10) {
        A(eVar, this.f1771a0, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1773c0.W1(z10);
    }

    public void setDpMargin(int i10) {
        a aVar = this.f1773c0;
        aVar.Y1((int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1773c0.Y1(i10);
    }

    public void setType(int i10) {
        this.f1771a0 = i10;
    }

    public boolean z() {
        return this.f1773c0.R1();
    }
}
