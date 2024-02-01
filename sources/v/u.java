package v;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public abstract class u {

    /* renamed from: k  reason: collision with root package name */
    public static final String f14135k = "SplineSet";

    /* renamed from: l  reason: collision with root package name */
    public static final int f14136l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f14137m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f14138n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static float f14139o = 6.2831855f;

    /* renamed from: a  reason: collision with root package name */
    public u.b f14140a;

    /* renamed from: b  reason: collision with root package name */
    public int f14141b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int[] f14142c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public float[][] f14143d = ((float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3}));

    /* renamed from: e  reason: collision with root package name */
    public int f14144e;

    /* renamed from: f  reason: collision with root package name */
    public String f14145f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f14146g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f14147h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f14148i;

    /* renamed from: j  reason: collision with root package name */
    public float f14149j = Float.NaN;

    public static class a extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setAlpha(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class b extends u {

        /* renamed from: p  reason: collision with root package name */
        public String f14150p;

        /* renamed from: q  reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.a> f14151q;

        /* renamed from: r  reason: collision with root package name */
        public SparseArray<float[]> f14152r = new SparseArray<>();

        /* renamed from: s  reason: collision with root package name */
        public float[] f14153s;

        /* renamed from: t  reason: collision with root package name */
        public float[] f14154t;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f14150p = str.split(",")[1];
            this.f14151q = sparseArray;
        }

        public void f(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean g(View view, float f10, long j10, g gVar) {
            View view2 = view;
            long j11 = j10;
            this.f14140a.e((double) f10, this.f14153s);
            float[] fArr = this.f14153s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j12 = j11 - this.f14148i;
            if (Float.isNaN(this.f14149j)) {
                float a10 = gVar.a(view2, this.f14150p, 0);
                this.f14149j = a10;
                if (Float.isNaN(a10)) {
                    this.f14149j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f14149j) + ((((double) j12) * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f14149j = f13;
            this.f14148i = j11;
            float a11 = a(f13);
            this.f14147h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f14154t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f14147h;
                float f14 = this.f14153s[i10];
                this.f14147h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * a11) + f12;
                i10++;
            }
            this.f14151q.valueAt(0).m(view2, this.f14154t);
            if (f11 != 0.0f) {
                this.f14147h = true;
            }
            return this.f14147h;
        }

        public void j(int i10) {
            int size = this.f14151q.size();
            int g10 = this.f14151q.valueAt(0).g();
            double[] dArr = new double[size];
            int i11 = g10 + 2;
            this.f14153s = new float[i11];
            this.f14154t = new float[g10];
            int[] iArr = new int[2];
            iArr[1] = i11;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.f14151q.keyAt(i12);
                float[] valueAt = this.f14152r.valueAt(i12);
                dArr[i12] = ((double) keyAt) * 0.01d;
                this.f14151q.valueAt(i12).f(this.f14153s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f14153s;
                    if (i13 >= fArr.length) {
                        break;
                    }
                    dArr2[i12][i13] = (double) fArr[i13];
                    i13++;
                }
                double[] dArr3 = dArr2[i12];
                dArr3[g10] = (double) valueAt[0];
                dArr3[g10 + 1] = (double) valueAt[1];
            }
            this.f14140a = u.b.a(i10, dArr, dArr2);
        }

        public void k(int i10, androidx.constraintlayout.widget.a aVar, float f10, int i11, float f11) {
            this.f14151q.append(i10, aVar);
            this.f14152r.append(i10, new float[]{f10, f11});
            this.f14141b = Math.max(this.f14141b, i11);
        }
    }

    public static class c extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setElevation(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class d extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            return this.f14147h;
        }

        public boolean k(View view, g gVar, float f10, long j10, double d10, double d11) {
            view.setRotation(b(f10, j10, view, gVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f14147h;
        }
    }

    public static class e extends u {

        /* renamed from: p  reason: collision with root package name */
        public boolean f14155p = false;

        public boolean g(View view, float f10, long j10, g gVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(b(f10, j10, view, gVar));
            } else if (this.f14155p) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f14155p = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(b(f10, j10, view, gVar))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f14147h;
        }
    }

    public static class f extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setRotation(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class g extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setRotationX(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class h extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setRotationY(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class i extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setScaleX(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class j extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setScaleY(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class k {
        public static void a(int[] iArr, float[][] fArr, int i10, int i11) {
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

        public static int b(int[] iArr, float[][] fArr, int i10, int i11) {
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

        public static void c(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float[] fArr2 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = fArr2;
        }
    }

    public static class l extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setTranslationX(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class m extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setTranslationY(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static class n extends u {
        public boolean g(View view, float f10, long j10, g gVar) {
            view.setTranslationZ(b(f10, j10, view, gVar));
            return this.f14147h;
        }
    }

    public static u d(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static u e(String str, long j10) {
        u uVar;
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
            case -40300674:
                if (str.equals(e.f13913i)) {
                    c10 = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(e.f13912h)) {
                    c10 = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(e.f13918n)) {
                    c10 = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(e.f13911g)) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                uVar = new g();
                break;
            case 1:
                uVar = new h();
                break;
            case 2:
                uVar = new l();
                break;
            case 3:
                uVar = new m();
                break;
            case 4:
                uVar = new n();
                break;
            case 5:
                uVar = new e();
                break;
            case 6:
                uVar = new i();
                break;
            case 7:
                uVar = new j();
                break;
            case 8:
                uVar = new f();
                break;
            case 9:
                uVar = new c();
                break;
            case 10:
                uVar = new d();
                break;
            case 11:
                uVar = new a();
                break;
            default:
                return null;
        }
        uVar.h(j10);
        return uVar;
    }

    public float a(float f10) {
        float abs;
        switch (this.f14141b) {
            case 1:
                return Math.signum(f10 * f14139o);
            case 2:
                abs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f10 * f14139o));
            case 6:
                float abs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f10 * f14139o));
        }
        return 1.0f - abs;
    }

    public float b(float f10, long j10, View view, g gVar) {
        long j11 = j10;
        View view2 = view;
        g gVar2 = gVar;
        this.f14140a.e((double) f10, this.f14146g);
        float[] fArr = this.f14146g;
        float f11 = fArr[1];
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            this.f14147h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f14149j)) {
            float a10 = gVar2.a(view2, this.f14145f, 0);
            this.f14149j = a10;
            if (Float.isNaN(a10)) {
                this.f14149j = 0.0f;
            }
        }
        float f12 = (float) ((((double) this.f14149j) + ((((double) (j11 - this.f14148i)) * 1.0E-9d) * ((double) f11))) % 1.0d);
        this.f14149j = f12;
        gVar2.b(view2, this.f14145f, 0, f12);
        this.f14148i = j11;
        float f13 = this.f14146g[0];
        float a11 = (a(this.f14149j) * f13) + this.f14146g[2];
        this.f14147h = (f13 == 0.0f && i10 == 0) ? false : true;
        return a11;
    }

    public u.b c() {
        return this.f14140a;
    }

    public void f(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f14142c;
        int i12 = this.f14144e;
        iArr[i12] = i10;
        float[] fArr = this.f14143d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f14141b = Math.max(this.f14141b, i11);
        this.f14144e++;
    }

    public abstract boolean g(View view, float f10, long j10, g gVar);

    public void h(long j10) {
        this.f14148i = j10;
    }

    public void i(String str) {
        this.f14145f = str;
    }

    public void j(int i10) {
        int i11 = this.f14144e;
        if (i11 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error no points added to ");
            sb2.append(this.f14145f);
            return;
        }
        k.a(this.f14142c, this.f14143d, 0, i11 - 1);
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f14142c;
            if (i12 >= iArr.length) {
                break;
            }
            if (iArr[i12] != iArr[i12 - 1]) {
                i13++;
            }
            i12++;
        }
        if (i13 == 0) {
            i13 = 1;
        }
        double[] dArr = new double[i13];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i13;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f14144e; i15++) {
            if (i15 > 0) {
                int[] iArr3 = this.f14142c;
                if (iArr3[i15] == iArr3[i15 - 1]) {
                }
            }
            dArr[i14] = ((double) this.f14142c[i15]) * 0.01d;
            double[] dArr3 = dArr2[i14];
            float[] fArr = this.f14143d[i15];
            dArr3[0] = (double) fArr[0];
            dArr3[1] = (double) fArr[1];
            dArr3[2] = (double) fArr[2];
            i14++;
        }
        this.f14140a = u.b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f14145f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f14144e; i10++) {
            str = str + "[" + this.f14142c[i10] + " , " + decimalFormat.format(this.f14143d[i10]) + "] ";
        }
        return str;
    }
}
