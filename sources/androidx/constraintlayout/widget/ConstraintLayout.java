package androidx.constraintlayout.widget;

import a0.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.e;
import d.m0;
import d.o0;
import f1.w1;
import java.util.ArrayList;
import java.util.HashMap;
import z.e;
import z.f;
import z.h;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: q0  reason: collision with root package name */
    public static final String f1774q0 = "ConstraintLayout-2.0.4";

    /* renamed from: r0  reason: collision with root package name */
    public static final String f1775r0 = "ConstraintLayout";

    /* renamed from: s0  reason: collision with root package name */
    public static final boolean f1776s0 = true;

    /* renamed from: t0  reason: collision with root package name */
    public static final boolean f1777t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public static final boolean f1778u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public static final boolean f1779v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f1780w0 = 0;
    public SparseArray<View> O = new SparseArray<>();
    public ArrayList<ConstraintHelper> P = new ArrayList<>(4);
    public f Q = new f();
    public int R = 0;
    public int S = 0;
    public int T = Integer.MAX_VALUE;
    public int U = Integer.MAX_VALUE;
    public boolean V = true;
    public int W = 257;

    /* renamed from: a0  reason: collision with root package name */
    public d f1781a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    public b f1782b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public int f1783c0 = -1;

    /* renamed from: d0  reason: collision with root package name */
    public HashMap<String, Integer> f1784d0 = new HashMap<>();

    /* renamed from: e0  reason: collision with root package name */
    public int f1785e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f1786f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public int f1787g0 = -1;

    /* renamed from: h0  reason: collision with root package name */
    public int f1788h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f1789i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1790j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public SparseArray<e> f1791k0 = new SparseArray<>();

    /* renamed from: l0  reason: collision with root package name */
    public b0.a f1792l0;

    /* renamed from: m0  reason: collision with root package name */
    public w.f f1793m0;

    /* renamed from: n0  reason: collision with root package name */
    public c f1794n0 = new c(this);

    /* renamed from: o0  reason: collision with root package name */
    public int f1795o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public int f1796p0 = 0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                z.e$b[] r0 = z.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1797a = r0
                z.e$b r1 = z.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1797a     // Catch:{ NoSuchFieldError -> 0x001d }
                z.e$b r1 = z.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1797a     // Catch:{ NoSuchFieldError -> 0x0028 }
                z.e$b r1 = z.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1797a     // Catch:{ NoSuchFieldError -> 0x0033 }
                z.e$b r1 = z.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int A0 = 7;
        public static final int B0 = 1;
        public static final int C0 = 0;
        public static final int D0 = 2;
        public static final int E0 = 0;
        public static final int F0 = 1;
        public static final int G0 = 2;

        /* renamed from: p0  reason: collision with root package name */
        public static final int f1798p0 = 0;

        /* renamed from: q0  reason: collision with root package name */
        public static final int f1799q0 = 0;

        /* renamed from: r0  reason: collision with root package name */
        public static final int f1800r0 = -1;

        /* renamed from: s0  reason: collision with root package name */
        public static final int f1801s0 = 0;

        /* renamed from: t0  reason: collision with root package name */
        public static final int f1802t0 = 1;

        /* renamed from: u0  reason: collision with root package name */
        public static final int f1803u0 = 1;

        /* renamed from: v0  reason: collision with root package name */
        public static final int f1804v0 = 2;

        /* renamed from: w0  reason: collision with root package name */
        public static final int f1805w0 = 3;

        /* renamed from: x0  reason: collision with root package name */
        public static final int f1806x0 = 4;

        /* renamed from: y0  reason: collision with root package name */
        public static final int f1807y0 = 5;

        /* renamed from: z0  reason: collision with root package name */
        public static final int f1808z0 = 6;
        public float A = 0.5f;
        public String B = null;
        public float C = 0.0f;
        public int D = 1;
        public float E = -1.0f;
        public float F = -1.0f;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public float O = 1.0f;
        public float P = 1.0f;
        public int Q = -1;
        public int R = -1;
        public int S = -1;
        public boolean T = false;
        public boolean U = false;
        public String V = null;
        public boolean W = true;
        public boolean X = true;
        public boolean Y = false;
        public boolean Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f1809a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1810a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1811b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1812b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f1813c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1814c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public int f1815d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public int f1816d0 = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f1817e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public int f1818e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1819f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public int f1820f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1821g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1822g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1823h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1824h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1825i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1826i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1827j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public float f1828j0 = 0.5f;

        /* renamed from: k  reason: collision with root package name */
        public int f1829k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f1830k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1831l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f1832l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1833m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f1834m0;

        /* renamed from: n  reason: collision with root package name */
        public int f1835n = 0;

        /* renamed from: n0  reason: collision with root package name */
        public e f1836n0 = new e();

        /* renamed from: o  reason: collision with root package name */
        public float f1837o = 0.0f;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1838o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1839p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1840q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1841r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1842s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1843t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1844u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1845v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1846w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f1847x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f1848y = -1;

        /* renamed from: z  reason: collision with root package name */
        public float f1849z = 0.5f;

        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* renamed from: a  reason: collision with root package name */
            public static final int f1850a = 0;

            /* renamed from: a0  reason: collision with root package name */
            public static final SparseIntArray f1851a0;

            /* renamed from: b  reason: collision with root package name */
            public static final int f1852b = 1;

            /* renamed from: c  reason: collision with root package name */
            public static final int f1853c = 2;

            /* renamed from: d  reason: collision with root package name */
            public static final int f1854d = 3;

            /* renamed from: e  reason: collision with root package name */
            public static final int f1855e = 4;

            /* renamed from: f  reason: collision with root package name */
            public static final int f1856f = 5;

            /* renamed from: g  reason: collision with root package name */
            public static final int f1857g = 6;

            /* renamed from: h  reason: collision with root package name */
            public static final int f1858h = 7;

            /* renamed from: i  reason: collision with root package name */
            public static final int f1859i = 8;

            /* renamed from: j  reason: collision with root package name */
            public static final int f1860j = 9;

            /* renamed from: k  reason: collision with root package name */
            public static final int f1861k = 10;

            /* renamed from: l  reason: collision with root package name */
            public static final int f1862l = 11;

            /* renamed from: m  reason: collision with root package name */
            public static final int f1863m = 12;

            /* renamed from: n  reason: collision with root package name */
            public static final int f1864n = 13;

            /* renamed from: o  reason: collision with root package name */
            public static final int f1865o = 14;

            /* renamed from: p  reason: collision with root package name */
            public static final int f1866p = 15;

            /* renamed from: q  reason: collision with root package name */
            public static final int f1867q = 16;

            /* renamed from: r  reason: collision with root package name */
            public static final int f1868r = 17;

            /* renamed from: s  reason: collision with root package name */
            public static final int f1869s = 18;

            /* renamed from: t  reason: collision with root package name */
            public static final int f1870t = 19;

            /* renamed from: u  reason: collision with root package name */
            public static final int f1871u = 20;

            /* renamed from: v  reason: collision with root package name */
            public static final int f1872v = 21;

            /* renamed from: w  reason: collision with root package name */
            public static final int f1873w = 22;

            /* renamed from: x  reason: collision with root package name */
            public static final int f1874x = 23;

            /* renamed from: y  reason: collision with root package name */
            public static final int f1875y = 24;

            /* renamed from: z  reason: collision with root package name */
            public static final int f1876z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1851a0 = sparseIntArray;
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(e.m.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i10;
            float parseFloat;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f1851a0.get(index);
                switch (i12) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1833m);
                        this.f1833m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1833m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1835n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1835n);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1837o) % 360.0f;
                        this.f1837o = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f1837o = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1809a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1809a);
                        break;
                    case 6:
                        this.f1811b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1811b);
                        break;
                    case 7:
                        this.f1813c = obtainStyledAttributes.getFloat(index, this.f1813c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1815d);
                        this.f1815d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1815d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1817e);
                        this.f1817e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1817e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1819f);
                        this.f1819f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1819f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1821g);
                        this.f1821g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1821g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1823h);
                        this.f1823h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1823h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1825i);
                        this.f1825i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1825i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1827j);
                        this.f1827j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1827j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1829k);
                        this.f1829k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1829k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1831l);
                        this.f1831l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1831l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1839p);
                        this.f1839p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1839p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1840q);
                        this.f1840q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1840q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1841r);
                        this.f1841r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1841r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1842s);
                        this.f1842s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1842s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1843t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1843t);
                        break;
                    case 22:
                        this.f1844u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1844u);
                        break;
                    case 23:
                        this.f1845v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1845v);
                        break;
                    case 24:
                        this.f1846w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1846w);
                        break;
                    case 25:
                        this.f1847x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1847x);
                        break;
                    case 26:
                        this.f1848y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1848y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.f1849z = obtainStyledAttributes.getFloat(index, this.f1849z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) != -2) {
                                break;
                            } else {
                                this.K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) != -2) {
                                break;
                            } else {
                                this.M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) != -2) {
                                break;
                            } else {
                                this.L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase(w1.a.N4)) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i10 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i10, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i10);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.C = parseFloat;
                                    break;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            e();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(b bVar) {
            super(bVar);
            this.f1809a = bVar.f1809a;
            this.f1811b = bVar.f1811b;
            this.f1813c = bVar.f1813c;
            this.f1815d = bVar.f1815d;
            this.f1817e = bVar.f1817e;
            this.f1819f = bVar.f1819f;
            this.f1821g = bVar.f1821g;
            this.f1823h = bVar.f1823h;
            this.f1825i = bVar.f1825i;
            this.f1827j = bVar.f1827j;
            this.f1829k = bVar.f1829k;
            this.f1831l = bVar.f1831l;
            this.f1833m = bVar.f1833m;
            this.f1835n = bVar.f1835n;
            this.f1837o = bVar.f1837o;
            this.f1839p = bVar.f1839p;
            this.f1840q = bVar.f1840q;
            this.f1841r = bVar.f1841r;
            this.f1842s = bVar.f1842s;
            this.f1843t = bVar.f1843t;
            this.f1844u = bVar.f1844u;
            this.f1845v = bVar.f1845v;
            this.f1846w = bVar.f1846w;
            this.f1847x = bVar.f1847x;
            this.f1848y = bVar.f1848y;
            this.f1849z = bVar.f1849z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.T = bVar.T;
            this.U = bVar.U;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.M = bVar.M;
            this.L = bVar.L;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1816d0 = bVar.f1816d0;
            this.f1818e0 = bVar.f1818e0;
            this.f1820f0 = bVar.f1820f0;
            this.f1822g0 = bVar.f1822g0;
            this.f1824h0 = bVar.f1824h0;
            this.f1826i0 = bVar.f1826i0;
            this.f1828j0 = bVar.f1828j0;
            this.V = bVar.V;
            this.f1836n0 = bVar.f1836n0;
        }

        public String a() {
            return this.V;
        }

        public z.e b() {
            return this.f1836n0;
        }

        public void c() {
            z.e eVar = this.f1836n0;
            if (eVar != null) {
                eVar.F0();
            }
        }

        public void d(String str) {
            this.f1836n0.O0(str);
        }

        public void e() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i10 = this.width;
            if (i10 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.W = false;
                if (i10 == 0 && this.I == 1) {
                    this.width = -2;
                    this.T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.X = false;
                if (i11 == 0 && this.J == 1) {
                    this.height = -2;
                    this.U = true;
                }
            }
            if (this.f1813c != -1.0f || this.f1809a != -1 || this.f1811b != -1) {
                this.Z = true;
                this.W = true;
                this.X = true;
                if (!(this.f1836n0 instanceof h)) {
                    this.f1836n0 = new h();
                }
                ((h) this.f1836n0).f2(this.S);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
            if (r1 > 0) goto L_0x00cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
            if (r1 > 0) goto L_0x00cc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00eb  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = r3
                goto L_0x0012
            L_0x0011:
                r10 = r2
            L_0x0012:
                r4 = -1
                r9.f1820f0 = r4
                r9.f1822g0 = r4
                r9.f1816d0 = r4
                r9.f1818e0 = r4
                int r5 = r9.f1843t
                r9.f1824h0 = r5
                int r5 = r9.f1845v
                r9.f1826i0 = r5
                float r5 = r9.f1849z
                r9.f1828j0 = r5
                int r6 = r9.f1809a
                r9.f1830k0 = r6
                int r7 = r9.f1811b
                r9.f1832l0 = r7
                float r8 = r9.f1813c
                r9.f1834m0 = r8
                if (r10 == 0) goto L_0x008c
                int r10 = r9.f1839p
                if (r10 == r4) goto L_0x003d
                r9.f1820f0 = r10
            L_0x003b:
                r2 = r3
                goto L_0x0044
            L_0x003d:
                int r10 = r9.f1840q
                if (r10 == r4) goto L_0x0044
                r9.f1822g0 = r10
                goto L_0x003b
            L_0x0044:
                int r10 = r9.f1841r
                if (r10 == r4) goto L_0x004b
                r9.f1818e0 = r10
                r2 = r3
            L_0x004b:
                int r10 = r9.f1842s
                if (r10 == r4) goto L_0x0052
                r9.f1816d0 = r10
                r2 = r3
            L_0x0052:
                int r10 = r9.f1847x
                if (r10 == r4) goto L_0x0058
                r9.f1826i0 = r10
            L_0x0058:
                int r10 = r9.f1848y
                if (r10 == r4) goto L_0x005e
                r9.f1824h0 = r10
            L_0x005e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0066
                float r2 = r10 - r5
                r9.f1828j0 = r2
            L_0x0066:
                boolean r2 = r9.Z
                if (r2 == 0) goto L_0x00b0
                int r2 = r9.S
                if (r2 != r3) goto L_0x00b0
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007c
                float r10 = r10 - r8
                r9.f1834m0 = r10
                r9.f1830k0 = r4
                r9.f1832l0 = r4
                goto L_0x00b0
            L_0x007c:
                if (r6 == r4) goto L_0x0085
                r9.f1832l0 = r6
                r9.f1830k0 = r4
            L_0x0082:
                r9.f1834m0 = r2
                goto L_0x00b0
            L_0x0085:
                if (r7 == r4) goto L_0x00b0
                r9.f1830k0 = r7
                r9.f1832l0 = r4
                goto L_0x0082
            L_0x008c:
                int r10 = r9.f1839p
                if (r10 == r4) goto L_0x0092
                r9.f1818e0 = r10
            L_0x0092:
                int r10 = r9.f1840q
                if (r10 == r4) goto L_0x0098
                r9.f1816d0 = r10
            L_0x0098:
                int r10 = r9.f1841r
                if (r10 == r4) goto L_0x009e
                r9.f1820f0 = r10
            L_0x009e:
                int r10 = r9.f1842s
                if (r10 == r4) goto L_0x00a4
                r9.f1822g0 = r10
            L_0x00a4:
                int r10 = r9.f1847x
                if (r10 == r4) goto L_0x00aa
                r9.f1824h0 = r10
            L_0x00aa:
                int r10 = r9.f1848y
                if (r10 == r4) goto L_0x00b0
                r9.f1826i0 = r10
            L_0x00b0:
                int r10 = r9.f1841r
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1842s
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1840q
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1839p
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f1819f
                if (r10 == r4) goto L_0x00cf
                r9.f1820f0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00dc
                if (r1 <= 0) goto L_0x00dc
            L_0x00cc:
                r9.rightMargin = r1
                goto L_0x00dc
            L_0x00cf:
                int r10 = r9.f1821g
                if (r10 == r4) goto L_0x00dc
                r9.f1822g0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00dc
                if (r1 <= 0) goto L_0x00dc
                goto L_0x00cc
            L_0x00dc:
                int r10 = r9.f1815d
                if (r10 == r4) goto L_0x00eb
                r9.f1816d0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00f8
                if (r0 <= 0) goto L_0x00f8
            L_0x00e8:
                r9.leftMargin = r0
                goto L_0x00f8
            L_0x00eb:
                int r10 = r9.f1817e
                if (r10 == r4) goto L_0x00f8
                r9.f1818e0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00f8
                if (r0 <= 0) goto L_0x00f8
                goto L_0x00e8
            L_0x00f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    public class c implements b.C0002b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1877a;

        /* renamed from: b  reason: collision with root package name */
        public int f1878b;

        /* renamed from: c  reason: collision with root package name */
        public int f1879c;

        /* renamed from: d  reason: collision with root package name */
        public int f1880d;

        /* renamed from: e  reason: collision with root package name */
        public int f1881e;

        /* renamed from: f  reason: collision with root package name */
        public int f1882f;

        /* renamed from: g  reason: collision with root package name */
        public int f1883g;

        public c(ConstraintLayout constraintLayout) {
            this.f1877a = constraintLayout;
        }

        public final void a() {
            int childCount = this.f1877a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f1877a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.f1877a);
                }
            }
            int size = this.f1877a.P.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((ConstraintHelper) this.f1877a.P.get(i11)).u(this.f1877a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x01cc  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(z.e r18, a0.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.i0()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r18.t0()
                if (r3 != 0) goto L_0x001f
                r2.f20e = r5
                r2.f21f = r5
                r2.f22g = r5
                return
            L_0x001f:
                z.e r3 = r18.U()
                if (r3 != 0) goto L_0x0026
                return
            L_0x0026:
                z.e$b r3 = r2.f16a
                z.e$b r4 = r2.f17b
                int r6 = r2.f18c
                int r7 = r2.f19d
                int r8 = r0.f1878b
                int r9 = r0.f1879c
                int r8 = r8 + r9
                int r9 = r0.f1880d
                java.lang.Object r10 = r18.w()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.a.f1797a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto L_0x00a8
                if (r12 == r15) goto L_0x00a0
                if (r12 == r14) goto L_0x0097
                if (r12 == r13) goto L_0x0051
                r6 = 0
                goto L_0x00ae
            L_0x0051:
                int r6 = r0.f1882f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f15672p
                if (r9 != r5) goto L_0x005e
                r9 = r5
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                int r12 = r2.f25j
                int r13 = a0.b.a.f14l
                if (r12 == r13) goto L_0x0069
                int r13 = a0.b.a.f15m
                if (r12 != r13) goto L_0x00ae
            L_0x0069:
                int r12 = r10.getMeasuredHeight()
                int r13 = r18.D()
                if (r12 != r13) goto L_0x0075
                r12 = r5
                goto L_0x0076
            L_0x0075:
                r12 = 0
            L_0x0076:
                int r13 = r2.f25j
                int r14 = a0.b.a.f15m
                if (r13 == r14) goto L_0x008f
                if (r9 == 0) goto L_0x008f
                if (r9 == 0) goto L_0x0082
                if (r12 != 0) goto L_0x008f
            L_0x0082:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L_0x008f
                boolean r9 = r18.x0()
                if (r9 == 0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                r9 = 0
                goto L_0x0090
            L_0x008f:
                r9 = r5
            L_0x0090:
                if (r9 == 0) goto L_0x00ae
                int r6 = r18.j0()
                goto L_0x00a8
            L_0x0097:
                int r6 = r0.f1882f
                int r12 = r18.I()
                int r9 = r9 + r12
                r12 = -1
                goto L_0x00a3
            L_0x00a0:
                int r6 = r0.f1882f
                r12 = -2
            L_0x00a3:
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00ae
            L_0x00a8:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            L_0x00ae:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x0117
                if (r9 == r15) goto L_0x010f
                r7 = 3
                if (r9 == r7) goto L_0x0106
                r7 = 4
                if (r9 == r7) goto L_0x00c0
                r7 = 0
                goto L_0x011d
            L_0x00c0:
                int r7 = r0.f1883g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f15674q
                if (r8 != r5) goto L_0x00cd
                r8 = r5
                goto L_0x00ce
            L_0x00cd:
                r8 = 0
            L_0x00ce:
                int r9 = r2.f25j
                int r11 = a0.b.a.f14l
                if (r9 == r11) goto L_0x00d8
                int r11 = a0.b.a.f15m
                if (r9 != r11) goto L_0x011d
            L_0x00d8:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.j0()
                if (r9 != r11) goto L_0x00e4
                r9 = r5
                goto L_0x00e5
            L_0x00e4:
                r9 = 0
            L_0x00e5:
                int r11 = r2.f25j
                int r12 = a0.b.a.f15m
                if (r11 == r12) goto L_0x00fe
                if (r8 == 0) goto L_0x00fe
                if (r8 == 0) goto L_0x00f1
                if (r9 != 0) goto L_0x00fe
            L_0x00f1:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x00fe
                boolean r8 = r18.y0()
                if (r8 == 0) goto L_0x00fc
                goto L_0x00fe
            L_0x00fc:
                r8 = 0
                goto L_0x00ff
            L_0x00fe:
                r8 = r5
            L_0x00ff:
                if (r8 == 0) goto L_0x011d
                int r7 = r18.D()
                goto L_0x0117
            L_0x0106:
                int r7 = r0.f1883g
                int r9 = r18.h0()
                int r8 = r8 + r9
                r9 = -1
                goto L_0x0112
            L_0x010f:
                int r7 = r0.f1883g
                r9 = -2
            L_0x0112:
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x011d
            L_0x0117:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x011d:
                z.e r8 = r18.U()
                z.f r8 = (z.f) r8
                if (r8 == 0) goto L_0x019f
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.W
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = z.k.b(r9, r11)
                if (r9 == 0) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.j0()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.j0()
                if (r9 >= r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.D()
                if (r9 != r11) goto L_0x019f
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.D()
                if (r9 >= r8) goto L_0x019f
                int r8 = r10.getBaseline()
                int r9 = r18.t()
                if (r8 != r9) goto L_0x019f
                boolean r8 = r18.w0()
                if (r8 != 0) goto L_0x019f
                int r8 = r18.J()
                int r9 = r18.j0()
                boolean r8 = r0.d(r8, r6, r9)
                if (r8 == 0) goto L_0x0189
                int r8 = r18.K()
                int r9 = r18.D()
                boolean r8 = r0.d(r8, r7, r9)
                if (r8 == 0) goto L_0x0189
                r8 = r5
                goto L_0x018a
            L_0x0189:
                r8 = 0
            L_0x018a:
                if (r8 == 0) goto L_0x019f
                int r3 = r18.j0()
                r2.f20e = r3
                int r3 = r18.D()
                r2.f21f = r3
                int r1 = r18.t()
                r2.f22g = r1
                return
            L_0x019f:
                z.e$b r8 = z.e.b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x01a5
                r9 = r5
                goto L_0x01a6
            L_0x01a5:
                r9 = 0
            L_0x01a6:
                if (r4 != r8) goto L_0x01aa
                r8 = r5
                goto L_0x01ab
            L_0x01aa:
                r8 = 0
            L_0x01ab:
                z.e$b r11 = z.e.b.MATCH_PARENT
                if (r4 == r11) goto L_0x01b6
                z.e$b r12 = z.e.b.FIXED
                if (r4 != r12) goto L_0x01b4
                goto L_0x01b6
            L_0x01b4:
                r4 = 0
                goto L_0x01b7
            L_0x01b6:
                r4 = r5
            L_0x01b7:
                if (r3 == r11) goto L_0x01c0
                z.e$b r11 = z.e.b.FIXED
                if (r3 != r11) goto L_0x01be
                goto L_0x01c0
            L_0x01be:
                r3 = 0
                goto L_0x01c1
            L_0x01c0:
                r3 = r5
            L_0x01c1:
                r11 = 0
                if (r9 == 0) goto L_0x01cc
                float r12 = r1.Y
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x01cc
                r12 = r5
                goto L_0x01cd
            L_0x01cc:
                r12 = 0
            L_0x01cd:
                if (r8 == 0) goto L_0x01d7
                float r13 = r1.Y
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L_0x01d7
                r11 = r5
                goto L_0x01d8
            L_0x01d7:
                r11 = 0
            L_0x01d8:
                if (r10 != 0) goto L_0x01db
                return
            L_0x01db:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$b r13 = (androidx.constraintlayout.widget.ConstraintLayout.b) r13
                int r14 = r2.f25j
                int r15 = a0.b.a.f14l
                if (r14 == r15) goto L_0x01fe
                int r15 = a0.b.a.f15m
                if (r14 == r15) goto L_0x01fe
                if (r9 == 0) goto L_0x01fe
                int r9 = r1.f15672p
                if (r9 != 0) goto L_0x01fe
                if (r8 == 0) goto L_0x01fe
                int r8 = r1.f15674q
                if (r8 == 0) goto L_0x01f8
                goto L_0x01fe
            L_0x01f8:
                r0 = -1
                r5 = 0
                r14 = 0
                r15 = 0
                goto L_0x0299
            L_0x01fe:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r8 == 0) goto L_0x0210
                boolean r8 = r1 instanceof z.m
                if (r8 == 0) goto L_0x0210
                r8 = r1
                z.m r8 = (z.m) r8
                r9 = r10
                androidx.constraintlayout.widget.VirtualLayout r9 = (androidx.constraintlayout.widget.VirtualLayout) r9
                r9.z(r8, r6, r7)
                goto L_0x0213
            L_0x0210:
                r10.measure(r6, r7)
            L_0x0213:
                r1.o1(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                int r15 = r1.f15678s
                if (r15 <= 0) goto L_0x022b
                int r15 = java.lang.Math.max(r15, r8)
                goto L_0x022c
            L_0x022b:
                r15 = r8
            L_0x022c:
                int r5 = r1.f15680t
                if (r5 <= 0) goto L_0x0234
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0234:
                int r5 = r1.f15684v
                if (r5 <= 0) goto L_0x023f
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0242
            L_0x023f:
                r16 = r6
                r5 = r9
            L_0x0242:
                int r6 = r1.f15686w
                if (r6 <= 0) goto L_0x024a
                int r5 = java.lang.Math.min(r6, r5)
            L_0x024a:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.W
                r0 = 1
                boolean r6 = z.k.b(r6, r0)
                if (r6 != 0) goto L_0x026e
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r12 == 0) goto L_0x0264
                if (r4 == 0) goto L_0x0264
                float r3 = r1.Y
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r15 = (int) r4
                goto L_0x026e
            L_0x0264:
                if (r11 == 0) goto L_0x026e
                if (r3 == 0) goto L_0x026e
                float r3 = r1.Y
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r5 = (int) r4
            L_0x026e:
                if (r8 != r15) goto L_0x0275
                if (r9 == r5) goto L_0x0273
                goto L_0x0275
            L_0x0273:
                r0 = -1
                goto L_0x0299
            L_0x0275:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r15) goto L_0x027e
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x0280
            L_0x027e:
                r6 = r16
            L_0x0280:
                if (r9 == r5) goto L_0x0286
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x0286:
                r10.measure(r6, r7)
                r1.o1(r6, r7)
                int r15 = r10.getMeasuredWidth()
                int r5 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                goto L_0x0273
            L_0x0299:
                if (r14 == r0) goto L_0x029d
                r0 = 1
                goto L_0x029e
            L_0x029d:
                r0 = 0
            L_0x029e:
                int r3 = r2.f18c
                if (r15 != r3) goto L_0x02a9
                int r3 = r2.f19d
                if (r5 == r3) goto L_0x02a7
                goto L_0x02a9
            L_0x02a7:
                r3 = 0
                goto L_0x02aa
            L_0x02a9:
                r3 = 1
            L_0x02aa:
                r2.f24i = r3
                boolean r3 = r13.Y
                if (r3 == 0) goto L_0x02b1
                r0 = 1
            L_0x02b1:
                if (r0 == 0) goto L_0x02bf
                r3 = -1
                if (r14 == r3) goto L_0x02bf
                int r1 = r18.t()
                if (r1 == r14) goto L_0x02bf
                r1 = 1
                r2.f24i = r1
            L_0x02bf:
                r2.f20e = r15
                r2.f21f = r5
                r2.f23h = r0
                r2.f22g = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(z.e, a0.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f1878b = i12;
            this.f1879c = i13;
            this.f1880d = i14;
            this.f1881e = i15;
            this.f1882f = i10;
            this.f1883g = i11;
        }

        public final boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(@m0 Context context) {
        super(context);
        q((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        q(attributeSet, i10, i11);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    private void q(AttributeSet attributeSet, int i10, int i11) {
        this.Q.M0(this);
        this.Q.y2(this.f1794n0);
        this.O.put(getId(), this);
        this.f1781a0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_Layout, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == e.m.ConstraintLayout_Layout_android_minWidth) {
                    this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                } else if (index == e.m.ConstraintLayout_Layout_android_minHeight) {
                    this.S = obtainStyledAttributes.getDimensionPixelOffset(index, this.S);
                } else if (index == e.m.ConstraintLayout_Layout_android_maxWidth) {
                    this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                } else if (index == e.m.ConstraintLayout_Layout_android_maxHeight) {
                    this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                } else if (index == e.m.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                } else if (index == e.m.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            z(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1782b0 = null;
                        }
                    }
                } else if (index == e.m.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f1781a0 = dVar;
                        dVar.n0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1781a0 = null;
                    }
                    this.f1783c0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.Q.z2(this.W);
    }

    public void A(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f1794n0;
        int i14 = cVar.f1881e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f1880d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0);
        int i15 = resolveSizeAndState & w1.f7299s;
        int i16 = resolveSizeAndState2 & w1.f7299s;
        int min = Math.min(this.T, i15);
        int min2 = Math.min(this.U, i16);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1785e0 = min;
        this.f1786f0 = min2;
    }

    public void B(f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1794n0.c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? w() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        E(fVar, mode, i14, mode2, i15);
        fVar.u2(i10, mode, i14, mode2, i15, this.f1785e0, this.f1786f0, max5, max);
    }

    public final void C() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            z.e p10 = p(getChildAt(i10));
            if (p10 != null) {
                p10.F0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    D(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    n(childAt.getId()).O0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1783c0 != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f1783c0 && (childAt2 instanceof Constraints)) {
                    this.f1781a0 = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.f1781a0;
        if (dVar != null) {
            dVar.n(this, true);
        }
        this.Q.T1();
        int size = this.P.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.P.get(i13).w(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).c(this);
            }
        }
        this.f1791k0.clear();
        this.f1791k0.put(0, this.Q);
        this.f1791k0.put(getId(), this.Q);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f1791k0.put(childAt4.getId(), p(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            z.e p11 = p(childAt5);
            if (p11 != null) {
                this.Q.b(p11);
                i(isInEditMode, childAt5, p11, (b) childAt5.getLayoutParams(), this.f1791k0);
            }
        }
    }

    public void D(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1784d0 == null) {
                this.f1784d0 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1784d0.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(z.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1794n0
            int r1 = r0.f1881e
            int r0 = r0.f1880d
            z.e$b r2 = z.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x0028
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = r6
            goto L_0x0032
        L_0x001a:
            int r9 = r7.T
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0032
        L_0x0023:
            z.e$b r9 = z.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0028:
            z.e$b r9 = z.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0032
        L_0x002c:
            int r10 = r7.R
            int r10 = java.lang.Math.max(r6, r10)
        L_0x0032:
            if (r11 == r5) goto L_0x0047
            if (r11 == 0) goto L_0x0042
            if (r11 == r4) goto L_0x003a
        L_0x0038:
            r12 = r6
            goto L_0x0051
        L_0x003a:
            int r11 = r7.U
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0051
        L_0x0042:
            z.e$b r2 = z.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0038
            goto L_0x004b
        L_0x0047:
            z.e$b r2 = z.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0051
        L_0x004b:
            int r11 = r7.S
            int r12 = java.lang.Math.max(r6, r11)
        L_0x0051:
            int r11 = r8.j0()
            if (r10 != r11) goto L_0x005d
            int r11 = r8.D()
            if (r12 == r11) goto L_0x0060
        L_0x005d:
            r8.q2()
        L_0x0060:
            r8.J1(r6)
            r8.K1(r6)
            int r11 = r7.T
            int r11 = r11 - r0
            r8.r1(r11)
            int r11 = r7.U
            int r11 = r11 - r1
            r8.q1(r11)
            r8.u1(r6)
            r8.t1(r6)
            r8.i1(r9)
            r8.H1(r10)
            r8.D1(r2)
            r8.d1(r12)
            int r9 = r7.R
            int r9 = r9 - r0
            r8.u1(r9)
            int r9 = r7.S
            int r9 = r9 - r1
            r8.t1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.E(z.f, int, int, int, int):void");
    }

    public void F(int i10, int i11, int i12) {
        b bVar = this.f1782b0;
        if (bVar != null) {
            bVar.e(i10, (float) i11, (float) i12);
        }
    }

    public final boolean G() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            C();
        }
        return z10;
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.P;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).v(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(s0.a.f12612c);
                        float f10 = (float) i12;
                        float f11 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i13;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        y();
        super.forceLayout();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.U;
    }

    public int getMaxWidth() {
        return this.T;
    }

    public int getMinHeight() {
        return this.S;
    }

    public int getMinWidth() {
        return this.R;
    }

    public int getOptimizationLevel() {
        return this.Q.l2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(boolean r19, android.view.View r20, z.e r21, androidx.constraintlayout.widget.ConstraintLayout.b r22, android.util.SparseArray<z.e> r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r22.e()
            r10 = 0
            r8.f1838o0 = r10
            int r2 = r20.getVisibility()
            r7.G1(r2)
            boolean r2 = r8.f1812b0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.m1(r11)
            r2 = 8
            r7.G1(r2)
        L_0x0024:
            r7.M0(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            z.f r2 = r0.Q
            boolean r2 = r2.s2()
            r1.r(r7, r2)
        L_0x0036:
            boolean r1 = r8.Z
            r12 = -1
            if (r1 == 0) goto L_0x005d
            r1 = r7
            z.h r1 = (z.h) r1
            int r2 = r8.f1830k0
            int r3 = r8.f1832l0
            float r4 = r8.f1834m0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            r1.c2(r4)
            goto L_0x026d
        L_0x004f:
            if (r2 == r12) goto L_0x0056
            r1.a2(r2)
            goto L_0x026d
        L_0x0056:
            if (r3 == r12) goto L_0x026d
            r1.b2(r3)
            goto L_0x026d
        L_0x005d:
            int r1 = r8.f1816d0
            int r2 = r8.f1818e0
            int r13 = r8.f1820f0
            int r14 = r8.f1822g0
            int r6 = r8.f1824h0
            int r15 = r8.f1826i0
            float r5 = r8.f1828j0
            int r3 = r8.f1833m
            if (r3 == r12) goto L_0x0080
            java.lang.Object r1 = r9.get(r3)
            z.e r1 = (z.e) r1
            if (r1 == 0) goto L_0x01a4
            float r2 = r8.f1837o
            int r3 = r8.f1835n
            r7.m(r1, r2, r3)
            goto L_0x01a4
        L_0x0080:
            if (r1 == r12) goto L_0x009c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x0099
            z.d$b r4 = z.d.b.LEFT
            int r2 = r8.leftMargin
            r1 = r21
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            goto L_0x00b1
        L_0x0099:
            r17 = r5
            goto L_0x00b4
        L_0x009c:
            r17 = r5
            if (r2 == r12) goto L_0x00b4
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x00b4
            z.d$b r2 = z.d.b.LEFT
            z.d$b r4 = z.d.b.RIGHT
            int r5 = r8.leftMargin
            r1 = r21
        L_0x00b1:
            r1.p0(r2, r3, r4, r5, r6)
        L_0x00b4:
            if (r13 == r12) goto L_0x00c8
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x00de
            z.d$b r2 = z.d.b.RIGHT
            z.d$b r4 = z.d.b.LEFT
            int r5 = r8.rightMargin
            r1 = r21
            goto L_0x00da
        L_0x00c8:
            if (r14 == r12) goto L_0x00de
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x00de
            z.d$b r4 = z.d.b.RIGHT
            int r5 = r8.rightMargin
            r1 = r21
            r2 = r4
        L_0x00da:
            r6 = r15
            r1.p0(r2, r3, r4, r5, r6)
        L_0x00de:
            int r1 = r8.f1823h
            if (r1 == r12) goto L_0x00f5
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x010f
            z.d$b r4 = z.d.b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f1844u
            r1 = r21
            r2 = r4
            goto L_0x010c
        L_0x00f5:
            int r1 = r8.f1825i
            if (r1 == r12) goto L_0x010f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x010f
            z.d$b r2 = z.d.b.TOP
            z.d$b r4 = z.d.b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f1844u
            r1 = r21
        L_0x010c:
            r1.p0(r2, r3, r4, r5, r6)
        L_0x010f:
            int r1 = r8.f1827j
            if (r1 == r12) goto L_0x0127
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x0140
            z.d$b r2 = z.d.b.BOTTOM
            z.d$b r4 = z.d.b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f1846w
            r1 = r21
            goto L_0x013d
        L_0x0127:
            int r1 = r8.f1829k
            if (r1 == r12) goto L_0x0140
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            z.e r3 = (z.e) r3
            if (r3 == 0) goto L_0x0140
            z.d$b r4 = z.d.b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f1846w
            r1 = r21
            r2 = r4
        L_0x013d:
            r1.p0(r2, r3, r4, r5, r6)
        L_0x0140:
            int r1 = r8.f1831l
            if (r1 == r12) goto L_0x0191
            android.util.SparseArray<android.view.View> r2 = r0.O
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f1831l
            java.lang.Object r2 = r9.get(r2)
            z.e r2 = (z.e) r2
            if (r2 == 0) goto L_0x0191
            if (r1 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r3 == 0) goto L_0x0191
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.b) r1
            r8.Y = r11
            r1.Y = r11
            z.d$b r3 = z.d.b.BASELINE
            z.d r4 = r7.r(r3)
            z.d r2 = r2.r(r3)
            r4.b(r2, r10, r12, r11)
            r7.c1(r11)
            z.e r1 = r1.f1836n0
            r1.c1(r11)
            z.d$b r1 = z.d.b.TOP
            z.d r1 = r7.r(r1)
            r1.x()
            z.d$b r1 = z.d.b.BOTTOM
            z.d r1 = r7.r(r1)
            r1.x()
        L_0x0191:
            r1 = 0
            r2 = r17
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x019b
            r7.f1(r2)
        L_0x019b:
            float r2 = r8.A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01a4
            r7.A1(r2)
        L_0x01a4:
            if (r19 == 0) goto L_0x01b3
            int r1 = r8.Q
            if (r1 != r12) goto L_0x01ae
            int r2 = r8.R
            if (r2 == r12) goto L_0x01b3
        L_0x01ae:
            int r2 = r8.R
            r7.w1(r1, r2)
        L_0x01b3:
            boolean r1 = r8.W
            r2 = -2
            if (r1 != 0) goto L_0x01e6
            int r1 = r8.width
            if (r1 != r12) goto L_0x01dd
            boolean r1 = r8.T
            if (r1 == 0) goto L_0x01c3
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            goto L_0x01c5
        L_0x01c3:
            z.e$b r1 = z.e.b.MATCH_PARENT
        L_0x01c5:
            r7.i1(r1)
            z.d$b r1 = z.d.b.LEFT
            z.d r1 = r7.r(r1)
            int r3 = r8.leftMargin
            r1.f15624g = r3
            z.d$b r1 = z.d.b.RIGHT
            z.d r1 = r7.r(r1)
            int r3 = r8.rightMargin
            r1.f15624g = r3
            goto L_0x01f9
        L_0x01dd:
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            r7.i1(r1)
            r7.H1(r10)
            goto L_0x01f9
        L_0x01e6:
            z.e$b r1 = z.e.b.FIXED
            r7.i1(r1)
            int r1 = r8.width
            r7.H1(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x01f9
            z.e$b r1 = z.e.b.WRAP_CONTENT
            r7.i1(r1)
        L_0x01f9:
            boolean r1 = r8.X
            if (r1 != 0) goto L_0x022b
            int r1 = r8.height
            if (r1 != r12) goto L_0x0222
            boolean r1 = r8.U
            if (r1 == 0) goto L_0x0208
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            goto L_0x020a
        L_0x0208:
            z.e$b r1 = z.e.b.MATCH_PARENT
        L_0x020a:
            r7.D1(r1)
            z.d$b r1 = z.d.b.TOP
            z.d r1 = r7.r(r1)
            int r2 = r8.topMargin
            r1.f15624g = r2
            z.d$b r1 = z.d.b.BOTTOM
            z.d r1 = r7.r(r1)
            int r2 = r8.bottomMargin
            r1.f15624g = r2
            goto L_0x023e
        L_0x0222:
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            r7.D1(r1)
            r7.d1(r10)
            goto L_0x023e
        L_0x022b:
            z.e$b r1 = z.e.b.FIXED
            r7.D1(r1)
            int r1 = r8.height
            r7.d1(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x023e
            z.e$b r1 = z.e.b.WRAP_CONTENT
            r7.D1(r1)
        L_0x023e:
            java.lang.String r1 = r8.B
            r7.S0(r1)
            float r1 = r8.E
            r7.k1(r1)
            float r1 = r8.F
            r7.F1(r1)
            int r1 = r8.G
            r7.g1(r1)
            int r1 = r8.H
            r7.B1(r1)
            int r1 = r8.I
            int r2 = r8.K
            int r3 = r8.M
            float r4 = r8.O
            r7.j1(r1, r2, r3, r4)
            int r1 = r8.J
            int r2 = r8.L
            int r3 = r8.N
            float r4 = r8.P
            r7.E1(r1, r2, r3, r4)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.i(boolean, android.view.View, z.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    public void j(w.f fVar) {
        this.f1793m0 = fVar;
        this.Q.i2(fVar);
    }

    /* renamed from: k */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* renamed from: l */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object m(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1784d0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1784d0.get(str);
    }

    public final z.e n(int i10) {
        if (i10 == 0) {
            return this.Q;
        }
        View view = this.O.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.Q;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1836n0;
    }

    public View o(int i10) {
        return this.O.get(i10);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            z.e eVar = bVar.f1836n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.f1810a0 || bVar.f1814c0 || isInEditMode) && !bVar.f1812b0) {
                int k02 = eVar.k0();
                int l02 = eVar.l0();
                int j02 = eVar.j0() + k02;
                int D = eVar.D() + l02;
                childAt.layout(k02, l02, j02, D);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(k02, l02, j02, D);
                }
            }
        }
        int size = this.P.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.P.get(i15).t(this);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        if (!this.V) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                } else if (getChildAt(i12).isLayoutRequested()) {
                    this.V = true;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (!this.V) {
            int i13 = this.f1795o0;
            if (!(i13 == i10 && this.f1796p0 == i11)) {
                if (i13 == i10 && View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f1796p0) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i11) >= this.Q.D()) {
                    this.f1795o0 = i10;
                    this.f1796p0 = i11;
                }
            }
            A(i10, i11, this.Q.j0(), this.Q.D(), this.Q.t2(), this.Q.r2());
        }
        this.f1795o0 = i10;
        this.f1796p0 = i11;
        this.Q.B2(w());
        if (this.V) {
            this.V = false;
            if (G()) {
                this.Q.D2();
            }
        }
        B(this.Q, this.W, i10, i11);
        A(i10, i11, this.Q.j0(), this.Q.D(), this.Q.t2(), this.Q.r2());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        z.e p10 = p(view);
        if ((view instanceof Guideline) && !(p10 instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f1836n0 = hVar;
            bVar.Z = true;
            hVar.f2(bVar.S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.y();
            ((b) view.getLayoutParams()).f1810a0 = true;
            if (!this.P.contains(constraintHelper)) {
                this.P.add(constraintHelper);
            }
        }
        this.O.put(view.getId(), view);
        this.V = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.O.remove(view.getId());
        this.Q.S1(p(view));
        this.P.remove(view);
        this.V = true;
    }

    public final z.e p(View view) {
        if (view == this) {
            return this.Q;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1836n0;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        y();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f1781a0 = dVar;
    }

    public void setId(int i10) {
        this.O.remove(getId());
        super.setId(i10);
        this.O.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.U) {
            this.U = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.T) {
            this.T = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.S) {
            this.S = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.R) {
            this.R = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(b0.a aVar) {
        this.f1792l0 = aVar;
        b bVar = this.f1782b0;
        if (bVar != null) {
            bVar.d(aVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.W = i10;
        this.Q.z2(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean w() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void x(int i10) {
        if (i10 != 0) {
            try {
                this.f1782b0 = new b(getContext(), this, i10);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.f1782b0 = null;
    }

    public final void y() {
        this.V = true;
        this.f1785e0 = -1;
        this.f1786f0 = -1;
        this.f1787g0 = -1;
        this.f1788h0 = -1;
        this.f1789i0 = 0;
        this.f1790j0 = 0;
    }

    public void z(int i10) {
        this.f1782b0 = new b(getContext(), this, i10);
    }
}
