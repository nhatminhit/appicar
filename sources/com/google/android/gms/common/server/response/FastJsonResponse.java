package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import d.m0;
import d.o0;
import j8.q;
import j8.s;
import j8.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.b;
import w8.d0;
import w8.r;

@e8.a
@w
public abstract class FastJsonResponse {

    @SafeParcelable.a(creator = "FieldCreator")
    @w
    @e8.a
    @d0
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final k CREATOR = new k();
        @SafeParcelable.h(getter = "getVersionCode", id = 1)
        public final int O;
        @SafeParcelable.c(getter = "getTypeIn", id = 2)
        public final int P;
        @SafeParcelable.c(getter = "isTypeInArray", id = 3)
        public final boolean Q;
        @SafeParcelable.c(getter = "getTypeOut", id = 4)
        public final int R;
        @SafeParcelable.c(getter = "isTypeOutArray", id = 5)
        public final boolean S;
        @SafeParcelable.c(getter = "getOutputFieldName", id = 6)
        @m0
        public final String T;
        @SafeParcelable.c(getter = "getSafeParcelableFieldId", id = 7)
        public final int U;
        @o0
        public final Class V;
        @o0
        @SafeParcelable.c(getter = "getConcreteTypeName", id = 8)
        public final String W;
        public zan X;
        @o0
        @SafeParcelable.c(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        public a Y;

        @SafeParcelable.b
        public Field(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) int i12, @SafeParcelable.e(id = 5) boolean z11, @SafeParcelable.e(id = 6) String str, @SafeParcelable.e(id = 7) int i13, @SafeParcelable.e(id = 8) @o0 String str2, @SafeParcelable.e(id = 9) @o0 zaa zaa) {
            this.O = i10;
            this.P = i11;
            this.Q = z10;
            this.R = i12;
            this.S = z11;
            this.T = str;
            this.U = i13;
            if (str2 == null) {
                this.V = null;
                this.W = null;
            } else {
                this.V = SafeParcelResponse.class;
                this.W = str2;
            }
            if (zaa == null) {
                this.Y = null;
            } else {
                this.Y = zaa.Z0();
            }
        }

        public Field(int i10, boolean z10, int i11, boolean z11, @m0 String str, int i12, @o0 Class cls, @o0 a aVar) {
            this.O = 1;
            this.P = i10;
            this.Q = z10;
            this.R = i11;
            this.S = z11;
            this.T = str;
            this.U = i12;
            this.V = cls;
            this.W = cls == null ? null : cls.getCanonicalName();
            this.Y = aVar;
        }

        @e8.a
        @m0
        public static Field<String, String> A1(@m0 String str, int i10) {
            return new Field(7, false, 7, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static Field<HashMap<String, String>, HashMap<String, String>> F1(@m0 String str, int i10) {
            return new Field(10, false, 10, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static Field<ArrayList<String>, ArrayList<String>> L1(@m0 String str, int i10) {
            return new Field(7, true, 7, true, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static Field O1(@m0 String str, int i10, @m0 a<?, ?> aVar, boolean z10) {
            aVar.c();
            aVar.f();
            return new Field(7, z10, 0, false, str, i10, (Class) null, aVar);
        }

        @e8.a
        @m0
        @d0
        public static Field<byte[], byte[]> X0(@m0 String str, int i10) {
            return new Field(8, false, 8, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static Field<Boolean, Boolean> Z0(@m0 String str, int i10) {
            return new Field(6, false, 6, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static <T extends FastJsonResponse> Field<T, T> f1(@m0 String str, int i10, @m0 Class<T> cls) {
            return new Field(11, false, 11, false, str, i10, cls, (a) null);
        }

        @e8.a
        @m0
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> g1(@m0 String str, int i10, @m0 Class<T> cls) {
            return new Field(11, true, 11, true, str, i10, cls, (a) null);
        }

        @e8.a
        @m0
        public static Field<Double, Double> h1(@m0 String str, int i10) {
            return new Field(4, false, 4, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static Field<Float, Float> m1(@m0 String str, int i10) {
            return new Field(3, false, 3, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        @d0
        public static Field<Integer, Integer> p1(@m0 String str, int i10) {
            return new Field(0, false, 0, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        @m0
        public static Field<Long, Long> r1(@m0 String str, int i10) {
            return new Field(2, false, 2, false, str, i10, (Class) null, (a) null);
        }

        @e8.a
        public int N1() {
            return this.U;
        }

        @o0
        public final zaa P1() {
            a aVar = this.Y;
            if (aVar == null) {
                return null;
            }
            return zaa.X0(aVar);
        }

        @m0
        public final Field Q1() {
            return new Field(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.W, P1());
        }

        @m0
        public final FastJsonResponse S1() throws InstantiationException, IllegalAccessException {
            s.l(this.V);
            Class<SafeParcelResponse> cls = this.V;
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            s.l(this.W);
            s.m(this.X, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.X, this.W);
        }

        @m0
        public final Object T1(@o0 Object obj) {
            s.l(this.Y);
            return s.l(this.Y.w(obj));
        }

        @m0
        public final Object U1(@m0 Object obj) {
            s.l(this.Y);
            return this.Y.o(obj);
        }

        @o0
        public final String V1() {
            String str = this.W;
            if (str == null) {
                return null;
            }
            return str;
        }

        @m0
        public final Map W1() {
            s.l(this.W);
            s.l(this.X);
            return (Map) s.l(this.X.Z0(this.W));
        }

        public final void X1(zan zan) {
            this.X = zan;
        }

        public final boolean Y1() {
            return this.Y != null;
        }

        @m0
        public final String toString() {
            q.a a10 = q.d(this).a("versionCode", Integer.valueOf(this.O)).a("typeIn", Integer.valueOf(this.P)).a("typeInArray", Boolean.valueOf(this.Q)).a("typeOut", Integer.valueOf(this.R)).a("typeOutArray", Boolean.valueOf(this.S)).a("outputFieldName", this.T).a("safeParcelFieldId", Integer.valueOf(this.U)).a("concreteTypeName", V1());
            Class cls = this.V;
            if (cls != null) {
                a10.a("concreteType.class", cls.getCanonicalName());
            }
            a aVar = this.Y;
            if (aVar != null) {
                a10.a("converterName", aVar.getClass().getCanonicalName());
            }
            return a10.toString();
        }

        public final void writeToParcel(@m0 Parcel parcel, int i10) {
            int a10 = b.a(parcel);
            b.F(parcel, 1, this.O);
            b.F(parcel, 2, this.P);
            b.g(parcel, 3, this.Q);
            b.F(parcel, 4, this.R);
            b.g(parcel, 5, this.S);
            b.Y(parcel, 6, this.T, false);
            b.F(parcel, 7, N1());
            b.Y(parcel, 8, V1(), false);
            b.S(parcel, 9, P1(), i10, false);
            b.b(parcel, a10);
        }
    }

    @w
    public interface a<I, O> {
        int c();

        int f();

        @m0
        Object o(@m0 Object obj);

        @o0
        Object w(@m0 Object obj);
    }

    @m0
    public static final Object u(@m0 Field field, @o0 Object obj) {
        return field.Y != null ? field.U1(obj) : obj;
    }

    public static final void w(StringBuilder sb2, Field field, Object obj) {
        String fastJsonResponse;
        int i10 = field.P;
        if (i10 == 11) {
            Class cls = field.V;
            s.l(cls);
            fastJsonResponse = ((FastJsonResponse) cls.cast(obj)).toString();
        } else if (i10 == 7) {
            fastJsonResponse = "\"";
            sb2.append(fastJsonResponse);
            sb2.append(r.b((String) obj));
        } else {
            sb2.append(obj);
            return;
        }
        sb2.append(fastJsonResponse);
    }

    public static final void x(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Output field (");
            sb2.append(str);
            sb2.append(") has a null value, but expected a primitive");
        }
    }

    public final void A(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            B(field, field.T, arrayList);
        }
    }

    public void B(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void C(@m0 Field field, @o0 BigInteger bigInteger) {
        if (field.Y != null) {
            v(field, bigInteger);
        } else {
            D(field, field.T, bigInteger);
        }
    }

    public void D(@m0 Field field, @m0 String str, @o0 BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void E(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            F(field, field.T, arrayList);
        }
    }

    public void F(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void G(@m0 Field field, boolean z10) {
        if (field.Y != null) {
            v(field, Boolean.valueOf(z10));
        } else {
            h(field, field.T, z10);
        }
    }

    public final void H(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            I(field, field.T, arrayList);
        }
    }

    public void I(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void J(@m0 Field field, @o0 byte[] bArr) {
        if (field.Y != null) {
            v(field, bArr);
        } else {
            j(field, field.T, bArr);
        }
    }

    public final void K(@m0 Field field, double d10) {
        if (field.Y != null) {
            v(field, Double.valueOf(d10));
        } else {
            L(field, field.T, d10);
        }
    }

    public void L(@m0 Field field, @m0 String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void M(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            O(field, field.T, arrayList);
        }
    }

    public void O(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void Q(@m0 Field field, float f10) {
        if (field.Y != null) {
            v(field, Float.valueOf(f10));
        } else {
            R(field, field.T, f10);
        }
    }

    public void R(@m0 Field field, @m0 String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void S(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            T(field, field.T, arrayList);
        }
    }

    public void T(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void U(@m0 Field field, int i10) {
        if (field.Y != null) {
            v(field, Integer.valueOf(i10));
        } else {
            l(field, field.T, i10);
        }
    }

    public final void V(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            W(field, field.T, arrayList);
        }
    }

    public void W(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void X(@m0 Field field, long j10) {
        if (field.Y != null) {
            v(field, Long.valueOf(j10));
        } else {
            n(field, field.T, j10);
        }
    }

    public final void Y(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            Z(field, field.T, arrayList);
        }
    }

    public void Z(@m0 Field field, @m0 String str, @o0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @e8.a
    public <T extends FastJsonResponse> void a(@m0 Field field, @m0 String str, @o0 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @e8.a
    public <T extends FastJsonResponse> void b(@m0 Field field, @m0 String str, @m0 T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @e8.a
    @m0
    public abstract Map<String, Field<?, ?>> c();

    @e8.a
    @o0
    public Object d(@m0 Field field) {
        String str = field.T;
        if (field.V == null) {
            return e(str);
        }
        s.t(e(str) == null, "Concrete field shouldn't be value object: %s", field.T);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            return getClass().getMethod("get" + upperCase + substring, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @e8.a
    @o0
    public abstract Object e(@m0 String str);

    @e8.a
    public boolean f(@m0 Field field) {
        if (field.R != 11) {
            return g(field.T);
        }
        if (field.S) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @e8.a
    public abstract boolean g(@m0 String str);

    @e8.a
    public void h(@m0 Field<?, ?> field, @m0 String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @e8.a
    public void j(@m0 Field<?, ?> field, @m0 String str, @o0 byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @e8.a
    public void l(@m0 Field<?, ?> field, @m0 String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @e8.a
    public void n(@m0 Field<?, ?> field, @m0 String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @e8.a
    public void o(@m0 Field<?, ?> field, @m0 String str, @o0 String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @e8.a
    public void p(@m0 Field<?, ?> field, @m0 String str, @o0 Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @e8.a
    public void q(@m0 Field<?, ?> field, @m0 String str, @o0 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public final void r(@m0 Field field, @o0 String str) {
        if (field.Y != null) {
            v(field, str);
        } else {
            o(field, field.T, str);
        }
    }

    public final void s(@m0 Field field, @o0 Map map) {
        if (field.Y != null) {
            v(field, map);
        } else {
            p(field, field.T, map);
        }
    }

    public final void t(@m0 Field field, @o0 ArrayList arrayList) {
        if (field.Y != null) {
            v(field, arrayList);
        } else {
            q(field, field.T, arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r1.append(r3);
        r1.append("\"");
     */
    @e8.a
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r0 = r9.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.f(r4)
            if (r5 == 0) goto L_0x0013
            java.lang.Object r5 = r9.d(r4)
            java.lang.Object r5 = u(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L_0x0041
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L_0x0044
        L_0x0041:
            r1.append(r7)
        L_0x0044:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L_0x0059
            java.lang.String r3 = "null"
        L_0x0055:
            r1.append(r3)
            goto L_0x0013
        L_0x0059:
            int r3 = r4.R
            switch(r3) {
                case 8: goto L_0x007f;
                case 9: goto L_0x0075;
                case 10: goto L_0x006f;
                default: goto L_0x005e;
            }
        L_0x005e:
            boolean r3 = r4.Q
            if (r3 == 0) goto L_0x00a5
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
            goto L_0x008f
        L_0x006f:
            java.util.HashMap r5 = (java.util.HashMap) r5
            w8.s.a(r1, r5)
            goto L_0x0013
        L_0x0075:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = w8.c.e(r5)
            goto L_0x0088
        L_0x007f:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = w8.c.d(r5)
        L_0x0088:
            r1.append(r3)
            r1.append(r6)
            goto L_0x0013
        L_0x008f:
            if (r6 >= r3) goto L_0x00a2
            if (r6 <= 0) goto L_0x0096
            r1.append(r7)
        L_0x0096:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto L_0x009f
            w(r1, r4, r8)
        L_0x009f:
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00a2:
            java.lang.String r3 = "]"
            goto L_0x0055
        L_0x00a5:
            w(r1, r4, r5)
            goto L_0x0013
        L_0x00aa:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r0 = "{}"
        L_0x00b5:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.toString():java.lang.String");
    }

    public final void v(Field field, @o0 Object obj) {
        String str = field.T;
        Object T1 = field.T1(obj);
        int i10 = field.R;
        switch (i10) {
            case 0:
                if (T1 != null) {
                    l(field, str, ((Integer) T1).intValue());
                    return;
                } else {
                    x(str);
                    return;
                }
            case 1:
                D(field, str, (BigInteger) T1);
                return;
            case 2:
                if (T1 != null) {
                    n(field, str, ((Long) T1).longValue());
                    return;
                } else {
                    x(str);
                    return;
                }
            case 4:
                if (T1 != null) {
                    L(field, str, ((Double) T1).doubleValue());
                    return;
                } else {
                    x(str);
                    return;
                }
            case 5:
                z(field, str, (BigDecimal) T1);
                return;
            case 6:
                if (T1 != null) {
                    h(field, str, ((Boolean) T1).booleanValue());
                    return;
                } else {
                    x(str);
                    return;
                }
            case 7:
                o(field, str, (String) T1);
                return;
            case 8:
            case 9:
                if (T1 != null) {
                    j(field, str, (byte[]) T1);
                    return;
                } else {
                    x(str);
                    return;
                }
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
        }
    }

    public final void y(@m0 Field field, @o0 BigDecimal bigDecimal) {
        if (field.Y != null) {
            v(field, bigDecimal);
        } else {
            z(field, field.T, bigDecimal);
        }
    }

    public void z(@m0 Field field, @m0 String str, @o0 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }
}
