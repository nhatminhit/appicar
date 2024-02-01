package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import u.c;

public class k extends l {
    public static final String M = "KeyPosition";
    public static final String N = "KeyPosition";
    public static final int O = 2;
    public static final int P = 1;
    public static final int Q = 0;
    public static final int R = 2;
    public static final String S = "percentY";
    public static final String T = "percentX";
    public String A = null;
    public int B = e.f13910f;
    public int C = 0;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public int J = 0;
    public float K = Float.NaN;
    public float L = Float.NaN;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f14012a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f14013b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f14014c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f14015d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f14016e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f14017f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f14018g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f14019h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f14020i = 9;

        /* renamed from: j  reason: collision with root package name */
        public static final int f14021j = 10;

        /* renamed from: k  reason: collision with root package name */
        public static final int f14022k = 11;

        /* renamed from: l  reason: collision with root package name */
        public static final int f14023l = 12;

        /* renamed from: m  reason: collision with root package name */
        public static SparseIntArray f14024m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14024m = sparseIntArray;
            sparseIntArray.append(e.m.KeyPosition_motionTarget, 1);
            f14024m.append(e.m.KeyPosition_framePosition, 2);
            f14024m.append(e.m.KeyPosition_transitionEasing, 3);
            f14024m.append(e.m.KeyPosition_curveFit, 4);
            f14024m.append(e.m.KeyPosition_drawPath, 5);
            f14024m.append(e.m.KeyPosition_percentX, 6);
            f14024m.append(e.m.KeyPosition_percentY, 7);
            f14024m.append(e.m.KeyPosition_keyPositionType, 9);
            f14024m.append(e.m.KeyPosition_sizePercent, 8);
            f14024m.append(e.m.KeyPosition_percentWidth, 11);
            f14024m.append(e.m.KeyPosition_percentHeight, 12);
            f14024m.append(e.m.KeyPosition_pathMotionArc, 10);
        }

        public static void b(k kVar, TypedArray typedArray) {
            float f10;
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14024m.get(index)) {
                    case 1:
                        if (MotionLayout.S1) {
                            int resourceId = typedArray.getResourceId(index, kVar.f13930b);
                            kVar.f13930b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type != 3) {
                            kVar.f13930b = typedArray.getResourceId(index, kVar.f13930b);
                            continue;
                        }
                        kVar.f13931c = typedArray.getString(index);
                        break;
                    case 2:
                        kVar.f13929a = typedArray.getInt(index, kVar.f13929a);
                        continue;
                    case 3:
                        kVar.A = typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : c.f13300k[typedArray.getInteger(index, 0)];
                        continue;
                    case 4:
                        kVar.f14026y = typedArray.getInteger(index, kVar.f14026y);
                        continue;
                    case 5:
                        kVar.C = typedArray.getInt(index, kVar.C);
                        continue;
                    case 6:
                        kVar.F = typedArray.getFloat(index, kVar.F);
                        continue;
                    case 7:
                        kVar.G = typedArray.getFloat(index, kVar.G);
                        continue;
                    case 8:
                        f10 = typedArray.getFloat(index, kVar.E);
                        kVar.D = f10;
                        break;
                    case 9:
                        kVar.J = typedArray.getInt(index, kVar.J);
                        continue;
                    case 10:
                        kVar.B = typedArray.getInt(index, kVar.B);
                        continue;
                    case 11:
                        kVar.D = typedArray.getFloat(index, kVar.D);
                        continue;
                    case 12:
                        f10 = typedArray.getFloat(index, kVar.E);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f14024m.get(index));
                        continue;
                }
                kVar.E = f10;
            }
            int i11 = kVar.f13929a;
        }
    }

    public k() {
        this.f13932d = 2;
    }

    public void a(HashMap<String, t> hashMap) {
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, e.m.KeyPosition));
    }

    public void f(String str, Object obj) {
        float f10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c10 = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c10 = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c10 = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals(T)) {
                    c10 = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals(S)) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.A = obj.toString();
                return;
            case 1:
                this.D = h(obj);
                return;
            case 2:
                f10 = h(obj);
                break;
            case 3:
                this.C = i(obj);
                return;
            case 4:
                f10 = h(obj);
                this.D = f10;
                break;
            case 5:
                this.F = h(obj);
                return;
            case 6:
                this.G = h(obj);
                return;
            default:
                return;
        }
        this.E = f10;
    }

    public void j(int i10, int i11, float f10, float f11, float f12, float f13) {
        int i12 = this.J;
        if (i12 == 1) {
            p(f10, f11, f12, f13);
        } else if (i12 != 2) {
            o(f10, f11, f12, f13);
        } else {
            q(i10, i11);
        }
    }

    public float k() {
        return this.K;
    }

    public float l() {
        return this.L;
    }

    public boolean m(int i10, int i11, RectF rectF, RectF rectF2, float f10, float f11) {
        j(i10, i11, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f10 - this.K) < 20.0f && Math.abs(f11 - this.L) < 20.0f;
    }

    public void n(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.J;
        if (i10 == 1) {
            s(rectF, rectF2, f10, f11, strArr, fArr);
        } else if (i10 != 2) {
            r(rectF, rectF2, f10, f11, strArr, fArr);
        } else {
            t(view, rectF, rectF2, f10, f11, strArr, fArr);
        }
    }

    public final void o(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = 0.0f;
        float f17 = Float.isNaN(this.F) ? 0.0f : this.F;
        float f18 = Float.isNaN(this.I) ? 0.0f : this.I;
        float f19 = Float.isNaN(this.G) ? 0.0f : this.G;
        if (!Float.isNaN(this.H)) {
            f16 = this.H;
        }
        this.K = (float) ((int) (f10 + (f17 * f14) + (f16 * f15)));
        this.L = (float) ((int) (f11 + (f14 * f18) + (f15 * f19)));
    }

    public final void p(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = this.F;
        float f17 = this.G;
        this.K = f10 + (f14 * f16) + ((-f15) * f17);
        this.L = f11 + (f15 * f16) + (f14 * f17);
    }

    public final void q(int i10, int i11) {
        float f10 = this.F;
        float f11 = (float) 0;
        this.K = (((float) (i10 - 0)) * f10) + f11;
        this.L = (((float) (i11 - 0)) * f10) + f11;
    }

    public void r(RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str != null) {
            float f12 = (f10 - centerX) / centerX2;
            if (T.equals(str)) {
                fArr[0] = f12;
                fArr[1] = (f11 - centerY) / centerY2;
                return;
            }
            fArr[1] = f12;
            fArr[0] = (f11 - centerY) / centerY2;
            return;
        }
        strArr[0] = T;
        fArr[0] = (f10 - centerX) / centerX2;
        strArr[1] = S;
        fArr[1] = (f11 - centerY) / centerY2;
    }

    public void s(RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot((double) centerX2, (double) centerY2);
        if (((double) hypot) < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f12 = centerX2 / hypot;
        float f13 = centerY2 / hypot;
        float f14 = f11 - centerY;
        float f15 = f10 - centerX;
        float f16 = ((f12 * f14) - (f15 * f13)) / hypot;
        float f17 = ((f12 * f15) + (f13 * f14)) / hypot;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = T;
            strArr[1] = S;
            fArr[0] = f17;
            fArr[1] = f16;
        } else if (T.equals(str)) {
            fArr[0] = f17;
            fArr[1] = f16;
        }
    }

    public void t(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str != null) {
            float f12 = f10 / ((float) width);
            if (T.equals(str)) {
                fArr[0] = f12;
                fArr[1] = f11 / ((float) height);
                return;
            }
            fArr[1] = f12;
            fArr[0] = f11 / ((float) height);
            return;
        }
        strArr[0] = T;
        fArr[0] = f10 / ((float) width);
        strArr[1] = S;
        fArr[1] = f11 / ((float) height);
    }
}
