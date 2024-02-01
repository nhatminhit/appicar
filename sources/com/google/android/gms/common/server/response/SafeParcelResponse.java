package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.b;
import t8.c;
import w8.d0;
import w8.r;

@a
@SafeParcelable.a(creator = "SafeParcelResponseCreator")
@d0
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @a
    @m0
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new c();
    @SafeParcelable.h(getter = "getVersionCode", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getParcel", id = 2)
    public final Parcel P;
    public final int Q;
    @SafeParcelable.c(getter = "getFieldMappingDictionary", id = 3)
    public final zan R;
    @o0
    public final String S;
    public int T;
    public int U;

    @SafeParcelable.b
    public SafeParcelResponse(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) Parcel parcel, @SafeParcelable.e(id = 3) zan zan) {
        this.O = i10;
        this.P = (Parcel) s.l(parcel);
        this.Q = 2;
        this.R = zan;
        this.S = zan == null ? null : zan.X0();
        this.T = 2;
    }

    public SafeParcelResponse(SafeParcelable safeParcelable, zan zan, String str) {
        this.O = 1;
        Parcel obtain = Parcel.obtain();
        this.P = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.Q = 1;
        this.R = (zan) s.l(zan);
        this.S = (String) s.l(str);
        this.T = 2;
    }

    public SafeParcelResponse(zan zan, String str) {
        this.O = 1;
        this.P = Parcel.obtain();
        this.Q = 0;
        this.R = (zan) s.l(zan);
        this.S = (String) s.l(str);
        this.T = 0;
    }

    @a
    @m0
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse b0(@m0 T t10) {
        zan zan = new zan(t10.getClass());
        e0(zan, t10);
        zan.f1();
        zan.g1();
        return new SafeParcelResponse((SafeParcelable) t10, zan, (String) s.l(t10.getClass().getCanonicalName()));
    }

    public static void e0(zan zan, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (!zan.m1(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> c10 = fastJsonResponse.c();
            zan.h1(cls, c10);
            for (String str : c10.keySet()) {
                FastJsonResponse.Field field = c10.get(str);
                Class cls2 = field.V;
                if (cls2 != null) {
                    try {
                        e0(zan, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) s.l(field.V)).getCanonicalName())), e10);
                    } catch (IllegalAccessException e11) {
                        throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) s.l(field.V)).getCanonicalName())), e11);
                    }
                }
            }
        }
    }

    public static final void h0(StringBuilder sb2, int i10, @o0 Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(r.b(s.l(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(w8.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(w8.c.e((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                w8.s.a(sb2, (HashMap) s.l(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    public static final void i0(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        if (field.Q) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append("[");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                h0(sb2, field.P, arrayList.get(i10));
            }
            sb2.append("]");
            return;
        }
        h0(sb2, field.P, obj);
    }

    public final void B(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        b.d(this.P, field.N1(), bigDecimalArr, true);
    }

    public final void D(@m0 FastJsonResponse.Field field, @m0 String str, @o0 BigInteger bigInteger) {
        f0(field);
        b.e(this.P, field.N1(), bigInteger, true);
    }

    public final void F(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        b.f(this.P, field.N1(), bigIntegerArr, true);
    }

    public final void I(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        b.h(this.P, field.N1(), zArr, true);
    }

    public final void L(@m0 FastJsonResponse.Field field, @m0 String str, double d10) {
        f0(field);
        b.r(this.P, field.N1(), d10);
    }

    public final void O(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        b.s(this.P, field.N1(), dArr, true);
    }

    public final void R(@m0 FastJsonResponse.Field field, @m0 String str, float f10) {
        f0(field);
        b.w(this.P, field.N1(), f10);
    }

    public final void T(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        b.x(this.P, field.N1(), fArr, true);
    }

    public final void W(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        b.G(this.P, field.N1(), iArr, true);
    }

    public final void Z(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        b.L(this.P, field.N1(), jArr, true);
    }

    public final <T extends FastJsonResponse> void a(@m0 FastJsonResponse.Field field, @m0 String str, @o0 ArrayList<T> arrayList) {
        f0(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) s.l(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) arrayList.get(i10))).d0());
        }
        b.Q(this.P, field.N1(), arrayList2, true);
    }

    public final <T extends FastJsonResponse> void b(@m0 FastJsonResponse.Field field, @m0 String str, @m0 T t10) {
        f0(field);
        b.O(this.P, field.N1(), ((SafeParcelResponse) t10).d0(), true);
    }

    @o0
    public final Map<String, FastJsonResponse.Field<?, ?>> c() {
        zan zan = this.R;
        if (zan == null) {
            return null;
        }
        return zan.Z0((String) s.l(this.S));
    }

    @m0
    public final Parcel d0() {
        int i10 = this.T;
        if (i10 != 0) {
            if (i10 == 1) {
                b.b(this.P, this.U);
            }
            return this.P;
        }
        int a10 = b.a(this.P);
        this.U = a10;
        b.b(this.P, a10);
        this.T = 2;
        return this.P;
    }

    @m0
    public final Object e(@m0 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final void f0(FastJsonResponse.Field field) {
        if (field.U != -1) {
            Parcel parcel = this.P;
            if (parcel != null) {
                int i10 = this.T;
                if (i10 == 0) {
                    this.U = b.a(parcel);
                    this.T = 1;
                } else if (i10 != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    public final boolean g(@m0 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0107, code lost:
        r3 = com.google.android.gms.common.server.response.FastJsonResponse.u(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010b, code lost:
        i0(r11, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0214, code lost:
        r11.append(r3);
        r11.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0249, code lost:
        r11.append(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(java.lang.StringBuilder r11, java.util.Map r12, android.os.Parcel r13) {
        /*
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x000d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.N1()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0027:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = l8.a.i0(r13)
            r1 = 0
            r2 = 1
            r3 = r1
        L_0x0033:
            int r4 = r13.dataPosition()
            if (r4 >= r12) goto L_0x0257
            int r4 = l8.a.X(r13)
            int r5 = l8.a.O(r4)
            java.lang.Object r5 = r0.get(r5)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 == 0) goto L_0x0033
            java.lang.String r6 = ","
            if (r3 == 0) goto L_0x0050
            r11.append(r6)
        L_0x0050:
            java.lang.Object r3 = r5.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r5.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            java.lang.String r7 = "\""
            r11.append(r7)
            r11.append(r3)
            java.lang.String r3 = "\":"
            r11.append(r3)
            boolean r3 = r5.Y1()
            if (r3 == 0) goto L_0x0111
            int r3 = r5.R
            switch(r3) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00df;
                case 5: goto L_0x00da;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00c3;
                case 10: goto L_0x0093;
                case 11: goto L_0x008b;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unknown field out type = "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x008b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L_0x0093:
            android.os.Bundle r3 = l8.a.g(r13, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r6 = r3.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00be
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.getString(r7)
            java.lang.Object r8 = j8.s.l(r8)
            java.lang.String r8 = (java.lang.String) r8
            r4.put(r7, r8)
            goto L_0x00a4
        L_0x00be:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.u(r5, r4)
            goto L_0x010b
        L_0x00c3:
            byte[] r3 = l8.a.h(r13, r4)
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.u(r5, r3)
            goto L_0x010b
        L_0x00cc:
            java.lang.String r3 = l8.a.G(r13, r4)
            goto L_0x0107
        L_0x00d1:
            boolean r3 = l8.a.P(r13, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0107
        L_0x00da:
            java.math.BigDecimal r3 = l8.a.a(r13, r4)
            goto L_0x0107
        L_0x00df:
            double r3 = l8.a.T(r13, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x0107
        L_0x00e8:
            float r3 = l8.a.V(r13, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0107
        L_0x00f1:
            long r3 = l8.a.c0(r13, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0107
        L_0x00fa:
            java.math.BigInteger r3 = l8.a.c(r13, r4)
            goto L_0x0107
        L_0x00ff:
            int r3 = l8.a.Z(r13, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0107:
            java.lang.Object r3 = com.google.android.gms.common.server.response.FastJsonResponse.u(r5, r3)
        L_0x010b:
            i0(r11, r5, r3)
        L_0x010e:
            r3 = r2
            goto L_0x0033
        L_0x0111:
            boolean r3 = r5.S
            if (r3 == 0) goto L_0x0193
            java.lang.String r3 = "["
            r11.append(r3)
            int r3 = r5.R
            switch(r3) {
                case 0: goto L_0x0185;
                case 1: goto L_0x017d;
                case 2: goto L_0x0175;
                case 3: goto L_0x016d;
                case 4: goto L_0x0165;
                case 5: goto L_0x015d;
                case 6: goto L_0x0155;
                case 7: goto L_0x014d;
                case 8: goto L_0x0145;
                case 9: goto L_0x0145;
                case 10: goto L_0x0145;
                case 11: goto L_0x0127;
                default: goto L_0x011f;
            }
        L_0x011f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L_0x0127:
            android.os.Parcel[] r3 = l8.a.z(r13, r4)
            int r4 = r3.length
            r7 = r1
        L_0x012d:
            if (r7 >= r4) goto L_0x018c
            if (r7 <= 0) goto L_0x0134
            r11.append(r6)
        L_0x0134:
            r8 = r3[r7]
            r8.setDataPosition(r1)
            java.util.Map r8 = r5.W1()
            r9 = r3[r7]
            r10.g0(r11, r8, r9)
            int r7 = r7 + 1
            goto L_0x012d
        L_0x0145:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L_0x014d:
            java.lang.String[] r3 = l8.a.H(r13, r4)
            w8.b.p(r11, r3)
            goto L_0x018c
        L_0x0155:
            boolean[] r3 = l8.a.e(r13, r4)
            w8.b.o(r11, r3)
            goto L_0x018c
        L_0x015d:
            java.math.BigDecimal[] r3 = l8.a.b(r13, r4)
            w8.b.n(r11, r3)
            goto L_0x018c
        L_0x0165:
            double[] r3 = l8.a.l(r13, r4)
            w8.b.j(r11, r3)
            goto L_0x018c
        L_0x016d:
            float[] r3 = l8.a.o(r13, r4)
            w8.b.k(r11, r3)
            goto L_0x018c
        L_0x0175:
            long[] r3 = l8.a.w(r13, r4)
            w8.b.m(r11, r3)
            goto L_0x018c
        L_0x017d:
            java.math.BigInteger[] r3 = l8.a.d(r13, r4)
            w8.b.n(r11, r3)
            goto L_0x018c
        L_0x0185:
            int[] r3 = l8.a.u(r13, r4)
            w8.b.l(r11, r3)
        L_0x018c:
            java.lang.String r3 = "]"
        L_0x018e:
            r11.append(r3)
            goto L_0x010e
        L_0x0193:
            int r3 = r5.R
            switch(r3) {
                case 0: goto L_0x024e;
                case 1: goto L_0x0245;
                case 2: goto L_0x023c;
                case 3: goto L_0x0233;
                case 4: goto L_0x022a;
                case 5: goto L_0x0225;
                case 6: goto L_0x021c;
                case 7: goto L_0x0209;
                case 8: goto L_0x01fd;
                case 9: goto L_0x01f1;
                case 10: goto L_0x01b0;
                case 11: goto L_0x01a0;
                default: goto L_0x0198;
            }
        L_0x0198:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L_0x01a0:
            android.os.Parcel r3 = l8.a.y(r13, r4)
            r3.setDataPosition(r1)
            java.util.Map r4 = r5.W1()
            r10.g0(r11, r4, r3)
            goto L_0x010e
        L_0x01b0:
            android.os.Bundle r3 = l8.a.g(r13, r4)
            java.util.Set r4 = r3.keySet()
            java.lang.String r5 = "{"
            r11.append(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = r2
        L_0x01c2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01ee
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r5 != 0) goto L_0x01d3
            r11.append(r6)
        L_0x01d3:
            r11.append(r7)
            r11.append(r8)
            java.lang.String r5 = "\":\""
            r11.append(r5)
            java.lang.String r5 = r3.getString(r8)
            java.lang.String r5 = w8.r.b(r5)
            r11.append(r5)
            r11.append(r7)
            r5 = r1
            goto L_0x01c2
        L_0x01ee:
            java.lang.String r3 = "}"
            goto L_0x018e
        L_0x01f1:
            byte[] r3 = l8.a.h(r13, r4)
            r11.append(r7)
            java.lang.String r3 = w8.c.e(r3)
            goto L_0x0214
        L_0x01fd:
            byte[] r3 = l8.a.h(r13, r4)
            r11.append(r7)
            java.lang.String r3 = w8.c.d(r3)
            goto L_0x0214
        L_0x0209:
            java.lang.String r3 = l8.a.G(r13, r4)
            r11.append(r7)
            java.lang.String r3 = w8.r.b(r3)
        L_0x0214:
            r11.append(r3)
            r11.append(r7)
            goto L_0x010e
        L_0x021c:
            boolean r3 = l8.a.P(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0225:
            java.math.BigDecimal r3 = l8.a.a(r13, r4)
            goto L_0x0249
        L_0x022a:
            double r3 = l8.a.T(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0233:
            float r3 = l8.a.V(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x023c:
            long r3 = l8.a.c0(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0245:
            java.math.BigInteger r3 = l8.a.c(r13, r4)
        L_0x0249:
            r11.append(r3)
            goto L_0x010e
        L_0x024e:
            int r3 = l8.a.Z(r13, r4)
            r11.append(r3)
            goto L_0x010e
        L_0x0257:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L_0x0263
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L_0x0263:
            l8.a$a r11 = new l8.a$a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Overread allowed size end="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12, r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.g0(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    public final void h(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, boolean z10) {
        f0(field);
        b.g(this.P, field.N1(), z10);
    }

    public final void j(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, @o0 byte[] bArr) {
        f0(field);
        b.m(this.P, field.N1(), bArr, true);
    }

    public final void l(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, int i10) {
        f0(field);
        b.F(this.P, field.N1(), i10);
    }

    public final void n(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, long j10) {
        f0(field);
        b.K(this.P, field.N1(), j10);
    }

    public final void o(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, @o0 String str2) {
        f0(field);
        b.Y(this.P, field.N1(), str2, true);
    }

    public final void p(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, @o0 Map<String, String> map) {
        f0(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) s.l(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        b.k(this.P, field.N1(), bundle, true);
    }

    public final void q(@m0 FastJsonResponse.Field<?, ?> field, @m0 String str, @o0 ArrayList<String> arrayList) {
        f0(field);
        int size = ((ArrayList) s.l(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        b.Z(this.P, field.N1(), strArr, true);
    }

    @m0
    public final String toString() {
        s.m(this.R, "Cannot convert to JSON on client side.");
        Parcel d02 = d0();
        d02.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        g0(sb2, (Map) s.l(this.R.Z0((String) s.l(this.S))), d02);
        return sb2.toString();
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.O(parcel, 2, d0(), false);
        b.S(parcel, 3, this.Q != 0 ? this.R : null, i10, false);
        b.b(parcel, a10);
    }

    public final void z(@m0 FastJsonResponse.Field field, @m0 String str, @o0 BigDecimal bigDecimal) {
        f0(field);
        b.c(this.P, field.N1(), bigDecimal, true);
    }
}
