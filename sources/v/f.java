package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import java.util.HashMap;
import java.util.HashSet;

public class f extends e {
    public static final String P = "KeyAttribute";
    public static final String Q = "KeyAttribute";
    public static final int R = 1;
    public boolean A = false;
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
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    public String f13934y;

    /* renamed from: z  reason: collision with root package name */
    public int f13935z = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f13936a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f13937b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f13938c = 4;

        /* renamed from: d  reason: collision with root package name */
        public static final int f13939d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final int f13940e = 6;

        /* renamed from: f  reason: collision with root package name */
        public static final int f13941f = 8;

        /* renamed from: g  reason: collision with root package name */
        public static final int f13942g = 7;

        /* renamed from: h  reason: collision with root package name */
        public static final int f13943h = 9;

        /* renamed from: i  reason: collision with root package name */
        public static final int f13944i = 10;

        /* renamed from: j  reason: collision with root package name */
        public static final int f13945j = 12;

        /* renamed from: k  reason: collision with root package name */
        public static final int f13946k = 13;

        /* renamed from: l  reason: collision with root package name */
        public static final int f13947l = 14;

        /* renamed from: m  reason: collision with root package name */
        public static final int f13948m = 15;

        /* renamed from: n  reason: collision with root package name */
        public static final int f13949n = 16;

        /* renamed from: o  reason: collision with root package name */
        public static final int f13950o = 17;

        /* renamed from: p  reason: collision with root package name */
        public static final int f13951p = 18;

        /* renamed from: q  reason: collision with root package name */
        public static final int f13952q = 19;

        /* renamed from: r  reason: collision with root package name */
        public static final int f13953r = 20;

        /* renamed from: s  reason: collision with root package name */
        public static SparseIntArray f13954s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f13954s = sparseIntArray;
            sparseIntArray.append(e.m.KeyAttribute_android_alpha, 1);
            f13954s.append(e.m.KeyAttribute_android_elevation, 2);
            f13954s.append(e.m.KeyAttribute_android_rotation, 4);
            f13954s.append(e.m.KeyAttribute_android_rotationX, 5);
            f13954s.append(e.m.KeyAttribute_android_rotationY, 6);
            f13954s.append(e.m.KeyAttribute_android_transformPivotX, 19);
            f13954s.append(e.m.KeyAttribute_android_transformPivotY, 20);
            f13954s.append(e.m.KeyAttribute_android_scaleX, 7);
            f13954s.append(e.m.KeyAttribute_transitionPathRotate, 8);
            f13954s.append(e.m.KeyAttribute_transitionEasing, 9);
            f13954s.append(e.m.KeyAttribute_motionTarget, 10);
            f13954s.append(e.m.KeyAttribute_framePosition, 12);
            f13954s.append(e.m.KeyAttribute_curveFit, 13);
            f13954s.append(e.m.KeyAttribute_android_scaleY, 14);
            f13954s.append(e.m.KeyAttribute_android_translationX, 15);
            f13954s.append(e.m.KeyAttribute_android_translationY, 16);
            f13954s.append(e.m.KeyAttribute_android_translationZ, 17);
            f13954s.append(e.m.KeyAttribute_motionProgress, 18);
        }

        public static void a(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f13954s.get(index)) {
                    case 1:
                        float unused = fVar.B = typedArray.getFloat(index, fVar.B);
                        break;
                    case 2:
                        float unused2 = fVar.C = typedArray.getDimension(index, fVar.C);
                        break;
                    case 4:
                        float unused3 = fVar.D = typedArray.getFloat(index, fVar.D);
                        break;
                    case 5:
                        float unused4 = fVar.E = typedArray.getFloat(index, fVar.E);
                        break;
                    case 6:
                        float unused5 = fVar.F = typedArray.getFloat(index, fVar.F);
                        break;
                    case 7:
                        float unused6 = fVar.J = typedArray.getFloat(index, fVar.J);
                        break;
                    case 8:
                        float unused7 = fVar.I = typedArray.getFloat(index, fVar.I);
                        break;
                    case 9:
                        String unused8 = fVar.f13934y = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.S1) {
                            if (typedArray.peekValue(index).type != 3) {
                                fVar.f13930b = typedArray.getResourceId(index, fVar.f13930b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fVar.f13930b);
                            fVar.f13930b = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        fVar.f13931c = typedArray.getString(index);
                        break;
                    case 12:
                        fVar.f13929a = typedArray.getInt(index, fVar.f13929a);
                        break;
                    case 13:
                        int unused9 = fVar.f13935z = typedArray.getInteger(index, fVar.f13935z);
                        break;
                    case 14:
                        float unused10 = fVar.K = typedArray.getFloat(index, fVar.K);
                        break;
                    case 15:
                        float unused11 = fVar.L = typedArray.getDimension(index, fVar.L);
                        break;
                    case 16:
                        float unused12 = fVar.M = typedArray.getDimension(index, fVar.M);
                        break;
                    case 17:
                        float unused13 = fVar.N = typedArray.getDimension(index, fVar.N);
                        break;
                    case 18:
                        float unused14 = fVar.O = typedArray.getFloat(index, fVar.O);
                        break;
                    case 19:
                        float unused15 = fVar.G = typedArray.getDimension(index, fVar.G);
                        break;
                    case 20:
                        float unused16 = fVar.H = typedArray.getDimension(index, fVar.H);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(f13954s.get(index));
                        break;
                }
            }
        }
    }

    public f() {
        this.f13932d = 1;
        this.f13933e = new HashMap<>();
    }

    public int O() {
        return this.f13935z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r1.equals(v.e.f13920p) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        r2.f(r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, v.t> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01bf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            v.t r2 = (v.t) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x0039
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.f13933e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.a) r1
            if (r1 == 0) goto L_0x0008
            v.t$b r2 = (v.t.b) r2
            int r3 = r6.f13929a
            r2.j(r3, r1)
            goto L_0x0008
        L_0x0039:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00df;
                case -1249320805: goto L_0x00d3;
                case -1225497657: goto L_0x00c7;
                case -1225497656: goto L_0x00bb;
                case -1225497655: goto L_0x00b0;
                case -1001078227: goto L_0x00a5;
                case -908189618: goto L_0x009a;
                case -908189617: goto L_0x0091;
                case -760884510: goto L_0x0085;
                case -760884509: goto L_0x0078;
                case -40300674: goto L_0x006b;
                case -4379043: goto L_0x005e;
                case 37232917: goto L_0x0051;
                case 92909918: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            r4 = r3
            goto L_0x00ea
        L_0x0044:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004d
            goto L_0x0041
        L_0x004d:
            r4 = 13
            goto L_0x00ea
        L_0x0051:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005a
            goto L_0x0041
        L_0x005a:
            r4 = 12
            goto L_0x00ea
        L_0x005e:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0067
            goto L_0x0041
        L_0x0067:
            r4 = 11
            goto L_0x00ea
        L_0x006b:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0074
            goto L_0x0041
        L_0x0074:
            r4 = 10
            goto L_0x00ea
        L_0x0078:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0081
            goto L_0x0041
        L_0x0081:
            r4 = 9
            goto L_0x00ea
        L_0x0085:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x008e
            goto L_0x0041
        L_0x008e:
            r4 = 8
            goto L_0x00ea
        L_0x0091:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00ea
            goto L_0x0041
        L_0x009a:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a3
            goto L_0x0041
        L_0x00a3:
            r4 = 6
            goto L_0x00ea
        L_0x00a5:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ae
            goto L_0x0041
        L_0x00ae:
            r4 = 5
            goto L_0x00ea
        L_0x00b0:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x0041
        L_0x00b9:
            r4 = 4
            goto L_0x00ea
        L_0x00bb:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c5
            goto L_0x0041
        L_0x00c5:
            r4 = 3
            goto L_0x00ea
        L_0x00c7:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d1
            goto L_0x0041
        L_0x00d1:
            r4 = 2
            goto L_0x00ea
        L_0x00d3:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00dd
            goto L_0x0041
        L_0x00dd:
            r4 = 1
            goto L_0x00ea
        L_0x00df:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00e9
            goto L_0x0041
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            switch(r4) {
                case 0: goto L_0x01b1;
                case 1: goto L_0x01a3;
                case 2: goto L_0x0195;
                case 3: goto L_0x0187;
                case 4: goto L_0x017a;
                case 5: goto L_0x016d;
                case 6: goto L_0x0160;
                case 7: goto L_0x0153;
                case 8: goto L_0x0146;
                case 9: goto L_0x0139;
                case 10: goto L_0x012c;
                case 11: goto L_0x011f;
                case 12: goto L_0x0112;
                case 13: goto L_0x0101;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            goto L_0x0008
        L_0x0101:
            float r1 = r6.B
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.B
        L_0x010d:
            r2.f(r1, r3)
            goto L_0x0008
        L_0x0112:
            float r1 = r6.I
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.I
            goto L_0x010d
        L_0x011f:
            float r1 = r6.C
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.C
            goto L_0x010d
        L_0x012c:
            float r1 = r6.D
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.D
            goto L_0x010d
        L_0x0139:
            float r1 = r6.F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.H
            goto L_0x010d
        L_0x0146:
            float r1 = r6.E
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.G
            goto L_0x010d
        L_0x0153:
            float r1 = r6.K
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.K
            goto L_0x010d
        L_0x0160:
            float r1 = r6.J
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.J
            goto L_0x010d
        L_0x016d:
            float r1 = r6.O
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.O
            goto L_0x010d
        L_0x017a:
            float r1 = r6.N
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.N
            goto L_0x010d
        L_0x0187:
            float r1 = r6.M
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.M
            goto L_0x010d
        L_0x0195:
            float r1 = r6.L
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.L
            goto L_0x010d
        L_0x01a3:
            float r1 = r6.F
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.F
            goto L_0x010d
        L_0x01b1:
            float r1 = r6.E
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f13929a
            float r3 = r6.E
            goto L_0x010d
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.a(java.util.HashMap):void");
    }

    public void b(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add(e.f13911g);
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add(e.f13912h);
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add(e.f13913i);
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add(e.f13914j);
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add(e.f13915k);
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add(e.f13916l);
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add(e.f13917m);
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add(e.f13924t);
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add(e.f13925u);
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add(e.f13926v);
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add(e.f13918n);
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add(e.f13919o);
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add(e.f13920p);
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f13933e.size() > 0) {
            for (String str : this.f13933e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.m.KeyAttribute));
    }

    public void e(HashMap<String, Integer> hashMap) {
        if (this.f13935z != -1) {
            if (!Float.isNaN(this.B)) {
                hashMap.put(e.f13911g, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.C)) {
                hashMap.put(e.f13912h, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.D)) {
                hashMap.put(e.f13913i, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.E)) {
                hashMap.put(e.f13914j, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.F)) {
                hashMap.put(e.f13915k, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.G)) {
                hashMap.put(e.f13916l, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.H)) {
                hashMap.put(e.f13917m, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.L)) {
                hashMap.put(e.f13924t, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.M)) {
                hashMap.put(e.f13925u, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.N)) {
                hashMap.put(e.f13926v, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.I)) {
                hashMap.put(e.f13918n, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.J)) {
                hashMap.put(e.f13919o, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.K)) {
                hashMap.put(e.f13920p, Integer.valueOf(this.f13935z));
            }
            if (!Float.isNaN(this.O)) {
                hashMap.put("progress", Integer.valueOf(this.f13935z));
            }
            if (this.f13933e.size() > 0) {
                for (String str : this.f13933e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f13935z));
                }
            }
        }
    }

    public void f(String str, Object obj) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals(e.f13914j)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(e.f13915k)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(e.f13924t)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(e.f13925u)) {
                    c10 = 5;
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c10 = 6;
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c10 = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(e.f13919o)) {
                    c10 = 8;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(e.f13920p)) {
                    c10 = 9;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(e.f13913i)) {
                    c10 = 10;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(e.f13912h)) {
                    c10 = 11;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(e.f13918n)) {
                    c10 = 12;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(e.f13911g)) {
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
            case 1941332754:
                if (str.equals("visibility")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.O = h(obj);
                return;
            case 1:
                this.f13934y = obj.toString();
                return;
            case 2:
                this.E = h(obj);
                return;
            case 3:
                this.F = h(obj);
                return;
            case 4:
                this.L = h(obj);
                return;
            case 5:
                this.M = h(obj);
                return;
            case 6:
                this.G = h(obj);
                return;
            case 7:
                this.H = h(obj);
                return;
            case 8:
                this.J = h(obj);
                return;
            case 9:
                this.K = h(obj);
                return;
            case 10:
                this.D = h(obj);
                return;
            case 11:
                this.C = h(obj);
                return;
            case 12:
                this.I = h(obj);
                return;
            case 13:
                this.B = h(obj);
                return;
            case 14:
                this.f13935z = i(obj);
                return;
            case 15:
                this.N = h(obj);
                return;
            case 16:
                this.A = g(obj);
                return;
            default:
                return;
        }
    }
}
