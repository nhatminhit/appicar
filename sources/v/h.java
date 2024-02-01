package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;

public class h extends e {
    public static final String Q = "KeyCycle";
    public static final String R = "KeyCycle";
    public static final int S = 4;
    public int A = -1;
    public float B = Float.NaN;
    public float C = 0.0f;
    public float D = Float.NaN;
    public int E = -1;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;
    public float P = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    public String f13956y = null;

    /* renamed from: z  reason: collision with root package name */
    public int f13957z = 0;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f13958a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f13959b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f13960c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f13961d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f13962e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f13963f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f13964g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f13965h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f13966i = 9;

        /* renamed from: j  reason: collision with root package name */
        public static final int f13967j = 10;

        /* renamed from: k  reason: collision with root package name */
        public static final int f13968k = 11;

        /* renamed from: l  reason: collision with root package name */
        public static final int f13969l = 12;

        /* renamed from: m  reason: collision with root package name */
        public static final int f13970m = 13;

        /* renamed from: n  reason: collision with root package name */
        public static final int f13971n = 14;

        /* renamed from: o  reason: collision with root package name */
        public static final int f13972o = 15;

        /* renamed from: p  reason: collision with root package name */
        public static final int f13973p = 16;

        /* renamed from: q  reason: collision with root package name */
        public static final int f13974q = 17;

        /* renamed from: r  reason: collision with root package name */
        public static final int f13975r = 18;

        /* renamed from: s  reason: collision with root package name */
        public static final int f13976s = 19;

        /* renamed from: t  reason: collision with root package name */
        public static final int f13977t = 20;

        /* renamed from: u  reason: collision with root package name */
        public static SparseIntArray f13978u;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13978u = sparseIntArray;
            sparseIntArray.append(e.m.KeyCycle_motionTarget, 1);
            f13978u.append(e.m.KeyCycle_framePosition, 2);
            f13978u.append(e.m.KeyCycle_transitionEasing, 3);
            f13978u.append(e.m.KeyCycle_curveFit, 4);
            f13978u.append(e.m.KeyCycle_waveShape, 5);
            f13978u.append(e.m.KeyCycle_wavePeriod, 6);
            f13978u.append(e.m.KeyCycle_waveOffset, 7);
            f13978u.append(e.m.KeyCycle_waveVariesBy, 8);
            f13978u.append(e.m.KeyCycle_android_alpha, 9);
            f13978u.append(e.m.KeyCycle_android_elevation, 10);
            f13978u.append(e.m.KeyCycle_android_rotation, 11);
            f13978u.append(e.m.KeyCycle_android_rotationX, 12);
            f13978u.append(e.m.KeyCycle_android_rotationY, 13);
            f13978u.append(e.m.KeyCycle_transitionPathRotate, 14);
            f13978u.append(e.m.KeyCycle_android_scaleX, 15);
            f13978u.append(e.m.KeyCycle_android_scaleY, 16);
            f13978u.append(e.m.KeyCycle_android_translationX, 17);
            f13978u.append(e.m.KeyCycle_android_translationY, 18);
            f13978u.append(e.m.KeyCycle_android_translationZ, 19);
            f13978u.append(e.m.KeyCycle_motionProgress, 20);
        }

        public static void b(h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f13978u.get(index)) {
                    case 1:
                        if (!MotionLayout.S1) {
                            if (typedArray.peekValue(index).type != 3) {
                                hVar.f13930b = typedArray.getResourceId(index, hVar.f13930b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, hVar.f13930b);
                            hVar.f13930b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        hVar.f13931c = typedArray.getString(index);
                        break;
                    case 2:
                        hVar.f13929a = typedArray.getInt(index, hVar.f13929a);
                        break;
                    case 3:
                        String unused = hVar.f13956y = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = hVar.f13957z = typedArray.getInteger(index, hVar.f13957z);
                        break;
                    case 5:
                        int unused3 = hVar.A = typedArray.getInt(index, hVar.A);
                        break;
                    case 6:
                        float unused4 = hVar.B = typedArray.getFloat(index, hVar.B);
                        break;
                    case 7:
                        float unused5 = hVar.C = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, hVar.C) : typedArray.getFloat(index, hVar.C);
                        break;
                    case 8:
                        int unused6 = hVar.E = typedArray.getInt(index, hVar.E);
                        break;
                    case 9:
                        float unused7 = hVar.F = typedArray.getFloat(index, hVar.F);
                        break;
                    case 10:
                        float unused8 = hVar.G = typedArray.getDimension(index, hVar.G);
                        break;
                    case 11:
                        float unused9 = hVar.H = typedArray.getFloat(index, hVar.H);
                        break;
                    case 12:
                        float unused10 = hVar.J = typedArray.getFloat(index, hVar.J);
                        break;
                    case 13:
                        float unused11 = hVar.K = typedArray.getFloat(index, hVar.K);
                        break;
                    case 14:
                        float unused12 = hVar.I = typedArray.getFloat(index, hVar.I);
                        break;
                    case 15:
                        float unused13 = hVar.L = typedArray.getFloat(index, hVar.L);
                        break;
                    case 16:
                        float unused14 = hVar.M = typedArray.getFloat(index, hVar.M);
                        break;
                    case 17:
                        float unused15 = hVar.N = typedArray.getDimension(index, hVar.N);
                        break;
                    case 18:
                        float unused16 = hVar.O = typedArray.getDimension(index, hVar.O);
                        break;
                    case 19:
                        float unused17 = hVar.P = typedArray.getDimension(index, hVar.P);
                        break;
                    case 20:
                        float unused18 = hVar.D = typedArray.getFloat(index, hVar.D);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f13978u.get(index));
                        break;
                }
            }
        }
    }

    public h() {
        this.f13932d = 4;
        this.f13933e = new HashMap<>();
    }

    public void S(HashMap<String, i> hashMap) {
        HashMap<String, i> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith(e.f13928x)) {
                androidx.constraintlayout.widget.a aVar = this.f13933e.get(next.substring(7));
                if (aVar != null && aVar.d() == a.b.FLOAT_TYPE) {
                    hashMap2.get(next).f(this.f13929a, this.A, this.E, this.B, this.C, aVar.e(), aVar);
                }
            } else {
                float T = T(next);
                if (!Float.isNaN(T)) {
                    hashMap2.get(next).e(this.f13929a, this.A, this.E, this.B, this.C, T);
                }
            }
        }
    }

    public float T(String str) {
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
            case 156108012:
                if (str.equals(e.f13922r)) {
                    c10 = 12;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.J;
            case 1:
                return this.K;
            case 2:
                return this.N;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.D;
            case 6:
                return this.L;
            case 7:
                return this.M;
            case 8:
                return this.H;
            case 9:
                return this.G;
            case 10:
                return this.I;
            case 11:
                return this.F;
            case 12:
                return this.C;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("WARNING! KeyCycle UNKNOWN  ");
                sb2.append(str);
                return Float.NaN;
        }
    }

    public void a(HashMap<String, t> hashMap) {
        int i10;
        float f10;
        c.m("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            t tVar = hashMap.get(next);
            next.hashCode();
            char c10 = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals(e.f13914j)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals(e.f13915k)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals(e.f13924t)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals(e.f13925u)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals(e.f13926v)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals(e.f13919o)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals(e.f13920p)) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals(e.f13913i)) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals(e.f13912h)) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals(e.f13918n)) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals(e.f13911g)) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (next.equals(e.f13922r)) {
                        c10 = 12;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = this.f13929a;
                    f10 = this.J;
                    break;
                case 1:
                    i10 = this.f13929a;
                    f10 = this.K;
                    break;
                case 2:
                    i10 = this.f13929a;
                    f10 = this.N;
                    break;
                case 3:
                    i10 = this.f13929a;
                    f10 = this.O;
                    break;
                case 4:
                    i10 = this.f13929a;
                    f10 = this.P;
                    break;
                case 5:
                    i10 = this.f13929a;
                    f10 = this.D;
                    break;
                case 6:
                    i10 = this.f13929a;
                    f10 = this.L;
                    break;
                case 7:
                    i10 = this.f13929a;
                    f10 = this.M;
                    break;
                case 8:
                    i10 = this.f13929a;
                    f10 = this.H;
                    break;
                case 9:
                    i10 = this.f13929a;
                    f10 = this.G;
                    break;
                case 10:
                    i10 = this.f13929a;
                    f10 = this.I;
                    break;
                case 11:
                    i10 = this.f13929a;
                    f10 = this.F;
                    break;
                case 12:
                    i10 = this.f13929a;
                    f10 = this.C;
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING KeyCycle UNKNOWN  ");
                    sb2.append(next);
                    continue;
            }
            tVar.f(i10, f10);
        }
    }

    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add(e.f13911g);
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add(e.f13912h);
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(e.f13913i);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add(e.f13914j);
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add(e.f13915k);
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(e.f13919o);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(e.f13920p);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(e.f13918n);
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add(e.f13924t);
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add(e.f13925u);
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add(e.f13926v);
        }
        if (this.f13933e.size() > 0) {
            for (String str : this.f13933e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, e.m.KeyCycle));
    }

    public void f(String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals(e.f13914j)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(e.f13915k)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(e.f13924t)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(e.f13925u)) {
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
            case 156108012:
                if (str.equals(e.f13922r)) {
                    c10 = 12;
                    break;
                }
                break;
            case 184161818:
                if (str.equals(e.f13921q)) {
                    c10 = 13;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f13956y = obj.toString();
                return;
            case 1:
                this.J = h(obj);
                return;
            case 2:
                this.K = h(obj);
                return;
            case 3:
                this.N = h(obj);
                return;
            case 4:
                this.O = h(obj);
                return;
            case 5:
                this.D = h(obj);
                return;
            case 6:
                this.L = h(obj);
                return;
            case 7:
                this.M = h(obj);
                return;
            case 8:
                this.H = h(obj);
                return;
            case 9:
                this.G = h(obj);
                return;
            case 10:
                this.I = h(obj);
                return;
            case 11:
                this.F = h(obj);
                return;
            case 12:
                this.C = h(obj);
                return;
            case 13:
                this.B = h(obj);
                return;
            case 14:
                this.f13957z = i(obj);
                return;
            case 15:
                this.P = h(obj);
                return;
            default:
                return;
        }
    }
}
