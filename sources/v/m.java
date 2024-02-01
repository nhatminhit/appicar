package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;

public class m extends e {
    public static final String P = "KeyTimeCycle";
    public static final String Q = "KeyTimeCycle";
    public static final int R = 3;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public int M = 0;
    public float N = Float.NaN;
    public float O = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public String f14027y;

    /* renamed from: z  reason: collision with root package name */
    public int f14028z = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f14029a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f14030b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f14031c = 4;

        /* renamed from: d  reason: collision with root package name */
        public static final int f14032d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final int f14033e = 6;

        /* renamed from: f  reason: collision with root package name */
        public static final int f14034f = 8;

        /* renamed from: g  reason: collision with root package name */
        public static final int f14035g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f14036h = 9;

        /* renamed from: i  reason: collision with root package name */
        public static final int f14037i = 10;

        /* renamed from: j  reason: collision with root package name */
        public static final int f14038j = 12;

        /* renamed from: k  reason: collision with root package name */
        public static final int f14039k = 13;

        /* renamed from: l  reason: collision with root package name */
        public static final int f14040l = 14;

        /* renamed from: m  reason: collision with root package name */
        public static final int f14041m = 15;

        /* renamed from: n  reason: collision with root package name */
        public static final int f14042n = 16;

        /* renamed from: o  reason: collision with root package name */
        public static final int f14043o = 17;

        /* renamed from: p  reason: collision with root package name */
        public static final int f14044p = 18;

        /* renamed from: q  reason: collision with root package name */
        public static final int f14045q = 19;

        /* renamed from: r  reason: collision with root package name */
        public static final int f14046r = 20;

        /* renamed from: s  reason: collision with root package name */
        public static final int f14047s = 21;

        /* renamed from: t  reason: collision with root package name */
        public static SparseIntArray f14048t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14048t = sparseIntArray;
            sparseIntArray.append(e.m.KeyTimeCycle_android_alpha, 1);
            f14048t.append(e.m.KeyTimeCycle_android_elevation, 2);
            f14048t.append(e.m.KeyTimeCycle_android_rotation, 4);
            f14048t.append(e.m.KeyTimeCycle_android_rotationX, 5);
            f14048t.append(e.m.KeyTimeCycle_android_rotationY, 6);
            f14048t.append(e.m.KeyTimeCycle_android_scaleX, 7);
            f14048t.append(e.m.KeyTimeCycle_transitionPathRotate, 8);
            f14048t.append(e.m.KeyTimeCycle_transitionEasing, 9);
            f14048t.append(e.m.KeyTimeCycle_motionTarget, 10);
            f14048t.append(e.m.KeyTimeCycle_framePosition, 12);
            f14048t.append(e.m.KeyTimeCycle_curveFit, 13);
            f14048t.append(e.m.KeyTimeCycle_android_scaleY, 14);
            f14048t.append(e.m.KeyTimeCycle_android_translationX, 15);
            f14048t.append(e.m.KeyTimeCycle_android_translationY, 16);
            f14048t.append(e.m.KeyTimeCycle_android_translationZ, 17);
            f14048t.append(e.m.KeyTimeCycle_motionProgress, 18);
            f14048t.append(e.m.KeyTimeCycle_wavePeriod, 20);
            f14048t.append(e.m.KeyTimeCycle_waveOffset, 21);
            f14048t.append(e.m.KeyTimeCycle_waveShape, 19);
        }

        public static void a(m mVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14048t.get(index)) {
                    case 1:
                        float unused = mVar.A = typedArray.getFloat(index, mVar.A);
                        break;
                    case 2:
                        float unused2 = mVar.B = typedArray.getDimension(index, mVar.B);
                        break;
                    case 4:
                        float unused3 = mVar.C = typedArray.getFloat(index, mVar.C);
                        break;
                    case 5:
                        float unused4 = mVar.D = typedArray.getFloat(index, mVar.D);
                        break;
                    case 6:
                        float unused5 = mVar.E = typedArray.getFloat(index, mVar.E);
                        break;
                    case 7:
                        float unused6 = mVar.G = typedArray.getFloat(index, mVar.G);
                        break;
                    case 8:
                        float unused7 = mVar.F = typedArray.getFloat(index, mVar.F);
                        break;
                    case 9:
                        String unused8 = mVar.f14027y = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.S1) {
                            if (typedArray.peekValue(index).type != 3) {
                                mVar.f13930b = typedArray.getResourceId(index, mVar.f13930b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, mVar.f13930b);
                            mVar.f13930b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        mVar.f13931c = typedArray.getString(index);
                        break;
                    case 12:
                        mVar.f13929a = typedArray.getInt(index, mVar.f13929a);
                        break;
                    case 13:
                        int unused9 = mVar.f14028z = typedArray.getInteger(index, mVar.f14028z);
                        break;
                    case 14:
                        float unused10 = mVar.H = typedArray.getFloat(index, mVar.H);
                        break;
                    case 15:
                        float unused11 = mVar.I = typedArray.getDimension(index, mVar.I);
                        break;
                    case 16:
                        float unused12 = mVar.J = typedArray.getDimension(index, mVar.J);
                        break;
                    case 17:
                        float unused13 = mVar.K = typedArray.getDimension(index, mVar.K);
                        break;
                    case 18:
                        float unused14 = mVar.L = typedArray.getFloat(index, mVar.L);
                        break;
                    case 19:
                        int unused15 = mVar.M = typedArray.getInt(index, mVar.M);
                        break;
                    case 20:
                        float unused16 = mVar.N = typedArray.getFloat(index, mVar.N);
                        break;
                    case 21:
                        float unused17 = mVar.O = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, mVar.O) : typedArray.getFloat(index, mVar.O);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f14048t.get(index));
                        break;
                }
            }
        }
    }

    public m() {
        this.f13932d = 3;
        this.f13933e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r1.equals(v.e.f13920p) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        r3.f(r4, r5, r10.N, r10.M, r10.O);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(java.util.HashMap<java.lang.String, v.u> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0195
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            v.u r3 = (v.u) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.f13933e
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            v.u$b r4 = (v.u.b) r4
            int r5 = r10.f13929a
            float r7 = r10.N
            int r8 = r10.M
            float r9 = r10.O
            r4.k(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00cb;
                case -1249320805: goto L_0x00c0;
                case -1225497657: goto L_0x00b5;
                case -1225497656: goto L_0x00aa;
                case -1225497655: goto L_0x009f;
                case -1001078227: goto L_0x0094;
                case -908189618: goto L_0x0089;
                case -908189617: goto L_0x0080;
                case -40300674: goto L_0x0074;
                case -4379043: goto L_0x0067;
                case 37232917: goto L_0x005a;
                case 92909918: goto L_0x004d;
                default: goto L_0x004a;
            }
        L_0x004a:
            r4 = r2
            goto L_0x00d6
        L_0x004d:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0056
            goto L_0x004a
        L_0x0056:
            r4 = 11
            goto L_0x00d6
        L_0x005a:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0063
            goto L_0x004a
        L_0x0063:
            r4 = 10
            goto L_0x00d6
        L_0x0067:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0070
            goto L_0x004a
        L_0x0070:
            r4 = 9
            goto L_0x00d6
        L_0x0074:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x007d
            goto L_0x004a
        L_0x007d:
            r4 = 8
            goto L_0x00d6
        L_0x0080:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d6
            goto L_0x004a
        L_0x0089:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0092
            goto L_0x004a
        L_0x0092:
            r4 = 6
            goto L_0x00d6
        L_0x0094:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009d
            goto L_0x004a
        L_0x009d:
            r4 = 5
            goto L_0x00d6
        L_0x009f:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a8
            goto L_0x004a
        L_0x00a8:
            r4 = 4
            goto L_0x00d6
        L_0x00aa:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b3
            goto L_0x004a
        L_0x00b3:
            r4 = 3
            goto L_0x00d6
        L_0x00b5:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00be
            goto L_0x004a
        L_0x00be:
            r4 = 2
            goto L_0x00d6
        L_0x00c0:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c9
            goto L_0x004a
        L_0x00c9:
            r4 = 1
            goto L_0x00d6
        L_0x00cb:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d5
            goto L_0x004a
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            switch(r4) {
                case 0: goto L_0x0187;
                case 1: goto L_0x0179;
                case 2: goto L_0x016c;
                case 3: goto L_0x015f;
                case 4: goto L_0x0152;
                case 5: goto L_0x0145;
                case 6: goto L_0x0138;
                case 7: goto L_0x012b;
                case 8: goto L_0x011e;
                case 9: goto L_0x0111;
                case 10: goto L_0x0104;
                case 11: goto L_0x00ed;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            goto L_0x0008
        L_0x00ed:
            float r1 = r10.A
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.A
        L_0x00f9:
            float r6 = r10.N
            int r7 = r10.M
            float r8 = r10.O
            r3.f(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0104:
            float r1 = r10.F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.F
            goto L_0x00f9
        L_0x0111:
            float r1 = r10.B
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.B
            goto L_0x00f9
        L_0x011e:
            float r1 = r10.C
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.C
            goto L_0x00f9
        L_0x012b:
            float r1 = r10.H
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.H
            goto L_0x00f9
        L_0x0138:
            float r1 = r10.G
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.G
            goto L_0x00f9
        L_0x0145:
            float r1 = r10.L
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.L
            goto L_0x00f9
        L_0x0152:
            float r1 = r10.K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.K
            goto L_0x00f9
        L_0x015f:
            float r1 = r10.J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.J
            goto L_0x00f9
        L_0x016c:
            float r1 = r10.I
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.I
            goto L_0x00f9
        L_0x0179:
            float r1 = r10.E
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.E
            goto L_0x00f9
        L_0x0187:
            float r1 = r10.D
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f13929a
            float r5 = r10.D
            goto L_0x00f9
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.m.Q(java.util.HashMap):void");
    }

    public void a(HashMap<String, t> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add(e.f13911g);
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add(e.f13912h);
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add(e.f13913i);
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add(e.f13914j);
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add(e.f13915k);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(e.f13924t);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add(e.f13925u);
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add(e.f13926v);
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add(e.f13918n);
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add(e.f13919o);
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(e.f13920p);
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("progress");
        }
        if (this.f13933e.size() > 0) {
            for (String str : this.f13933e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.m.KeyTimeCycle));
    }

    public void e(HashMap<String, Integer> hashMap) {
        if (this.f14028z != -1) {
            if (!Float.isNaN(this.A)) {
                hashMap.put(e.f13911g, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.B)) {
                hashMap.put(e.f13912h, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.C)) {
                hashMap.put(e.f13913i, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.D)) {
                hashMap.put(e.f13914j, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.E)) {
                hashMap.put(e.f13915k, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.I)) {
                hashMap.put(e.f13924t, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.J)) {
                hashMap.put(e.f13925u, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.K)) {
                hashMap.put(e.f13926v, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.F)) {
                hashMap.put(e.f13918n, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.G)) {
                hashMap.put(e.f13919o, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.G)) {
                hashMap.put(e.f13920p, Integer.valueOf(this.f14028z));
            }
            if (!Float.isNaN(this.L)) {
                hashMap.put("progress", Integer.valueOf(this.f14028z));
            }
            if (this.f13933e.size() > 0) {
                for (String str : this.f13933e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f14028z));
                }
            }
        }
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
            case 579057826:
                if (str.equals("curveFit")) {
                    c10 = 12;
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f14027y = obj.toString();
                return;
            case 1:
                this.D = h(obj);
                return;
            case 2:
                this.E = h(obj);
                return;
            case 3:
                this.I = h(obj);
                return;
            case 4:
                this.J = h(obj);
                return;
            case 5:
                this.L = h(obj);
                return;
            case 6:
                this.G = h(obj);
                return;
            case 7:
                this.H = h(obj);
                return;
            case 8:
                this.C = h(obj);
                return;
            case 9:
                this.B = h(obj);
                return;
            case 10:
                this.F = h(obj);
                return;
            case 11:
                this.A = h(obj);
                return;
            case 12:
                this.f14028z = i(obj);
                return;
            case 13:
                this.K = h(obj);
                return;
            default:
                return;
        }
    }
}
