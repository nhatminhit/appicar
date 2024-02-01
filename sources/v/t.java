package v;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class t {

    /* renamed from: f  reason: collision with root package name */
    public static final String f14125f = "SplineSet";

    /* renamed from: a  reason: collision with root package name */
    public u.b f14126a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f14127b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f14128c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f14129d;

    /* renamed from: e  reason: collision with root package name */
    public String f14130e;

    public static class a extends t {
        public void g(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    public static class b extends t {

        /* renamed from: g  reason: collision with root package name */
        public String f14131g;

        /* renamed from: h  reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f14132h;

        /* renamed from: i  reason: collision with root package name */
        public float[] f14133i;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f14131g = str.split(",")[1];
            this.f14132h = sparseArray;
        }

        public void f(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void g(View view, float f10) {
            this.f14126a.e((double) f10, this.f14133i);
            this.f14132h.valueAt(0).m(view, this.f14133i);
        }

        public void i(int i10) {
            int size = this.f14132h.size();
            int g10 = this.f14132h.valueAt(0).g();
            double[] dArr = new double[size];
            this.f14133i = new float[g10];
            int[] iArr = new int[2];
            iArr[1] = g10;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = ((double) this.f14132h.keyAt(i11)) * 0.01d;
                this.f14132h.valueAt(i11).f(this.f14133i);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f14133i;
                    if (i12 >= fArr.length) {
                        break;
                    }
                    dArr2[i11][i12] = (double) fArr[i12];
                    i12++;
                }
            }
            this.f14126a = u.b.a(i10, dArr, dArr2);
        }

        public void j(int i10, androidx.constraintlayout.widget.a aVar) {
            this.f14132h.append(i10, aVar);
        }
    }

    public static class c extends t {
        public void g(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    public static class d extends t {
        public void g(View view, float f10) {
        }

        public void j(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public static class e extends t {
        public void g(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    public static class f extends t {
        public void g(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    public static class g extends t {

        /* renamed from: g  reason: collision with root package name */
        public boolean f14134g = false;

        public void g(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (!this.f14134g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f14134g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f10))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    public static class h extends t {
        public void g(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    public static class i extends t {
        public void g(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    public static class j extends t {
        public void g(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    public static class k extends t {
        public void g(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    public static class l extends t {
        public void g(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    public static class m {
        public static void a(int[] iArr, float[] fArr, int i10, int i11) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = i12 - 1;
                int i14 = iArr2[i13];
                i12 = i13 - 1;
                int i15 = iArr2[i12];
                if (i14 < i15) {
                    int b10 = b(iArr, fArr, i14, i15);
                    int i16 = i12 + 1;
                    iArr2[i12] = b10 - 1;
                    int i17 = i16 + 1;
                    iArr2[i16] = i14;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    i12 = i18 + 1;
                    iArr2[i18] = b10 + 1;
                }
            }
        }

        public static int b(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        public static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public static class n extends t {
        public void g(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    public static class o extends t {
        public void g(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    public static class p extends t {
        public void g(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static t d(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static t e(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals(e.f13914j)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(e.f13915k)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(e.f13924t)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(e.f13925u)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals(e.f13926v)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c10 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(e.f13919o)) {
                    c10 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(e.f13920p)) {
                    c10 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals(e.f13923s)) {
                    c10 = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals(e.f13916l)) {
                    c10 = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals(e.f13917m)) {
                    c10 = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(e.f13913i)) {
                    c10 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(e.f13912h)) {
                    c10 = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(e.f13918n)) {
                    c10 = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(e.f13911g)) {
                    c10 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(e.f13922r)) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new n();
            case 3:
                return new o();
            case 4:
                return new p();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new a();
            case 9:
                return new e();
            case 10:
                return new f();
            case 11:
                return new h();
            case 12:
                return new c();
            case 13:
                return new d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public float a(float f10) {
        return (float) this.f14126a.c((double) f10, 0);
    }

    public u.b b() {
        return this.f14126a;
    }

    public float c(float f10) {
        return (float) this.f14126a.f((double) f10, 0);
    }

    public void f(int i10, float f10) {
        int[] iArr = this.f14127b;
        if (iArr.length < this.f14129d + 1) {
            this.f14127b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f14128c;
            this.f14128c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f14127b;
        int i11 = this.f14129d;
        iArr2[i11] = i10;
        this.f14128c[i11] = f10;
        this.f14129d = i11 + 1;
    }

    public abstract void g(View view, float f10);

    public void h(String str) {
        this.f14130e = str;
    }

    public void i(int i10) {
        int i11 = this.f14129d;
        if (i11 != 0) {
            m.a(this.f14127b, this.f14128c, 0, i11 - 1);
            int i12 = 1;
            for (int i13 = 1; i13 < this.f14129d; i13++) {
                int[] iArr = this.f14127b;
                if (iArr[i13 - 1] != iArr[i13]) {
                    i12++;
                }
            }
            double[] dArr = new double[i12];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i12;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            int i14 = 0;
            for (int i15 = 0; i15 < this.f14129d; i15++) {
                if (i15 > 0) {
                    int[] iArr3 = this.f14127b;
                    if (iArr3[i15] == iArr3[i15 - 1]) {
                    }
                }
                dArr[i14] = ((double) this.f14127b[i15]) * 0.01d;
                dArr2[i14][0] = (double) this.f14128c[i15];
                i14++;
            }
            this.f14126a = u.b.a(i10, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f14130e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f14129d; i10++) {
            str = str + "[" + this.f14127b[i10] + " , " + decimalFormat.format((double) this.f14128c[i10]) + "] ";
        }
        return str;
    }
}
