package v;

import android.annotation.TargetApi;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public abstract class i {

    /* renamed from: h  reason: collision with root package name */
    public static final String f13979h = "KeyCycleOscillator";

    /* renamed from: a  reason: collision with root package name */
    public u.b f13980a;

    /* renamed from: b  reason: collision with root package name */
    public d f13981b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.constraintlayout.widget.a f13982c;

    /* renamed from: d  reason: collision with root package name */
    public String f13983d;

    /* renamed from: e  reason: collision with root package name */
    public int f13984e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f13985f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<r> f13986g = new ArrayList<>();

    public class a implements Comparator<r> {
        public a() {
        }

        /* renamed from: a */
        public int compare(r rVar, r rVar2) {
            return Integer.compare(rVar.f14004a, rVar2.f14004a);
        }
    }

    public static class b extends i {
        public void g(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    public static class c extends i {

        /* renamed from: i  reason: collision with root package name */
        public float[] f13987i = new float[1];

        public void g(View view, float f10) {
            this.f13987i[0] = a(f10);
            this.f13982c.m(view, this.f13987i);
        }
    }

    public static class d {

        /* renamed from: n  reason: collision with root package name */
        public static final int f13988n = -1;

        /* renamed from: o  reason: collision with root package name */
        public static final String f13989o = "CycleOscillator";

        /* renamed from: a  reason: collision with root package name */
        public final int f13990a;

        /* renamed from: b  reason: collision with root package name */
        public u.g f13991b = new u.g();

        /* renamed from: c  reason: collision with root package name */
        public float[] f13992c;

        /* renamed from: d  reason: collision with root package name */
        public double[] f13993d;

        /* renamed from: e  reason: collision with root package name */
        public float[] f13994e;

        /* renamed from: f  reason: collision with root package name */
        public float[] f13995f;

        /* renamed from: g  reason: collision with root package name */
        public float[] f13996g;

        /* renamed from: h  reason: collision with root package name */
        public int f13997h;

        /* renamed from: i  reason: collision with root package name */
        public u.b f13998i;

        /* renamed from: j  reason: collision with root package name */
        public double[] f13999j;

        /* renamed from: k  reason: collision with root package name */
        public double[] f14000k;

        /* renamed from: l  reason: collision with root package name */
        public float f14001l;

        /* renamed from: m  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f14002m = new HashMap<>();

        public d(int i10, int i11, int i12) {
            this.f13997h = i10;
            this.f13990a = i11;
            this.f13991b.g(i10);
            this.f13992c = new float[i12];
            this.f13993d = new double[i12];
            this.f13994e = new float[i12];
            this.f13995f = new float[i12];
            this.f13996g = new float[i12];
        }

        public final androidx.constraintlayout.widget.a a(String str, a.b bVar) {
            if (this.f14002m.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = this.f14002m.get(str);
                if (aVar.d() == bVar) {
                    return aVar;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.d().name());
            }
            androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a(str, bVar);
            this.f14002m.put(str, aVar2);
            return aVar2;
        }

        public double b(float f10) {
            u.b bVar = this.f13998i;
            if (bVar != null) {
                double d10 = (double) f10;
                bVar.g(d10, this.f14000k);
                this.f13998i.d(d10, this.f13999j);
            } else {
                double[] dArr = this.f14000k;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d11 = (double) f10;
            double e10 = this.f13991b.e(d11);
            double d12 = this.f13991b.d(d11);
            double[] dArr2 = this.f14000k;
            return dArr2[0] + (e10 * dArr2[1]) + (d12 * this.f13999j[1]);
        }

        public double c(float f10) {
            u.b bVar = this.f13998i;
            if (bVar != null) {
                bVar.d((double) f10, this.f13999j);
            } else {
                double[] dArr = this.f13999j;
                dArr[0] = (double) this.f13995f[0];
                dArr[1] = (double) this.f13992c[0];
            }
            return this.f13999j[0] + (this.f13991b.e((double) f10) * this.f13999j[1]);
        }

        public void d(int i10, int i11, float f10, float f11, float f12) {
            this.f13993d[i10] = ((double) i11) / 100.0d;
            this.f13994e[i10] = f10;
            this.f13995f[i10] = f11;
            this.f13992c[i10] = f12;
        }

        public void e(float f10) {
            this.f14001l = f10;
            int length = this.f13993d.length;
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr);
            float[] fArr = this.f13992c;
            this.f13999j = new double[(fArr.length + 1)];
            this.f14000k = new double[(fArr.length + 1)];
            if (this.f13993d[0] > 0.0d) {
                this.f13991b.a(0.0d, this.f13994e[0]);
            }
            double[] dArr2 = this.f13993d;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f13991b.a(1.0d, this.f13994e[length2]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                dArr[i10][0] = (double) this.f13995f[i10];
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.f13992c;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    dArr[i11][1] = (double) fArr2[i11];
                    i11++;
                }
                this.f13991b.a(this.f13993d[i10], this.f13994e[i10]);
            }
            this.f13991b.f();
            double[] dArr3 = this.f13993d;
            this.f13998i = dArr3.length > 1 ? u.b.a(0, dArr3, dArr) : null;
        }
    }

    public static class e extends i {
        public void g(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    public static class f {
        public static int a(int[] iArr, float[] fArr, int i10, int i11) {
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

        public static void b(int[] iArr, float[] fArr, int i10, int i11) {
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
                    int a10 = a(iArr, fArr, i14, i15);
                    int i16 = i12 + 1;
                    iArr2[i12] = a10 - 1;
                    int i17 = i16 + 1;
                    iArr2[i16] = i14;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    i12 = i18 + 1;
                    iArr2[i18] = a10 + 1;
                }
            }
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

    public static class g {
        public static int a(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, fArr2, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, fArr2, i13, i11);
            return i13;
        }

        public static void b(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
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
                    int a10 = a(iArr, fArr, fArr2, i14, i15);
                    int i16 = i12 + 1;
                    iArr2[i12] = a10 - 1;
                    int i17 = i16 + 1;
                    iArr2[i16] = i14;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    i12 = i18 + 1;
                    iArr2[i18] = a10 + 1;
                }
            }
        }

        public static void c(int[] iArr, float[] fArr, float[] fArr2, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
            float f11 = fArr2[i10];
            fArr2[i10] = fArr2[i11];
            fArr2[i11] = f11;
        }
    }

    public static class h extends i {
        public void g(View view, float f10) {
        }

        public void k(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* renamed from: v.i$i  reason: collision with other inner class name */
    public static class C0233i extends i {

        /* renamed from: i  reason: collision with root package name */
        public boolean f14003i = false;

        public void g(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (!this.f14003i) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f14003i = true;
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

    public static class j extends i {
        public void g(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    public static class k extends i {
        public void g(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    public static class l extends i {
        public void g(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    public static class m extends i {
        public void g(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    public static class n extends i {
        public void g(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    public static class o extends i {
        public void g(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    public static class p extends i {
        public void g(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    public static class q extends i {
        public void g(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public int f14004a;

        /* renamed from: b  reason: collision with root package name */
        public float f14005b;

        /* renamed from: c  reason: collision with root package name */
        public float f14006c;

        /* renamed from: d  reason: collision with root package name */
        public float f14007d;

        public r(int i10, float f10, float f11, float f12) {
            this.f14004a = i10;
            this.f14005b = f12;
            this.f14006c = f11;
            this.f14007d = f10;
        }
    }

    public static i d(String str) {
        if (str.startsWith(e.f13928x)) {
            return new c();
        }
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
            case -40300674:
                if (str.equals(e.f13913i)) {
                    c10 = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(e.f13912h)) {
                    c10 = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(e.f13918n)) {
                    c10 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(e.f13911g)) {
                    c10 = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(e.f13922r)) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new k();
            case 1:
                return new l();
            case 2:
                return new o();
            case 3:
                return new p();
            case 4:
                return new q();
            case 5:
                return new C0233i();
            case 6:
                return new m();
            case 7:
                return new n();
            case 8:
                return new b();
            case 9:
                return new j();
            case 10:
                return new e();
            case 11:
                return new h();
            case 12:
                return new b();
            case 13:
                return new b();
            default:
                return null;
        }
    }

    public float a(float f10) {
        return (float) this.f13981b.c(f10);
    }

    public u.b b() {
        return this.f13980a;
    }

    public float c(float f10) {
        return (float) this.f13981b.b(f10);
    }

    public void e(int i10, int i11, int i12, float f10, float f11, float f12) {
        this.f13986g.add(new r(i10, f10, f11, f12));
        if (i12 != -1) {
            this.f13985f = i12;
        }
        this.f13984e = i11;
    }

    public void f(int i10, int i11, int i12, float f10, float f11, float f12, androidx.constraintlayout.widget.a aVar) {
        this.f13986g.add(new r(i10, f10, f11, f12));
        if (i12 != -1) {
            this.f13985f = i12;
        }
        this.f13984e = i11;
        this.f13982c = aVar;
    }

    public abstract void g(View view, float f10);

    public void h(String str) {
        this.f13983d = str;
    }

    @TargetApi(19)
    public void i(float f10) {
        int size = this.f13986g.size();
        if (size != 0) {
            Collections.sort(this.f13986g, new a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f13981b = new d(this.f13984e, this.f13985f, size);
            Iterator<r> it = this.f13986g.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                r next = it.next();
                float f11 = next.f14007d;
                dArr[i10] = ((double) f11) * 0.01d;
                double[] dArr3 = dArr2[i10];
                float f12 = next.f14005b;
                dArr3[0] = (double) f12;
                float f13 = next.f14006c;
                dArr3[1] = (double) f13;
                this.f13981b.d(i10, next.f14004a, f11, f13, f12);
                i10++;
            }
            this.f13981b.e(f10);
            this.f13980a = u.b.a(0, dArr, dArr2);
        }
    }

    public boolean j() {
        return this.f13985f == 1;
    }

    public String toString() {
        String str = this.f13983d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<r> it = this.f13986g.iterator();
        while (it.hasNext()) {
            r next = it.next();
            str = str + "[" + next.f14004a + " , " + decimalFormat.format((double) next.f14005b) + "] ";
        }
        return str;
    }
}
