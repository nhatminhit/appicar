package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import d.o0;
import j8.s;
import j8.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.b;
import t8.a;
import y3.q;

@SafeParcelable.a(creator = "FieldMappingDictionaryCreator")
@w
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new a();
    @SafeParcelable.h(id = 1)
    public final int O;
    public final HashMap P;
    @SafeParcelable.c(getter = "getRootClassName", id = 3)
    public final String Q;

    @SafeParcelable.b
    public zan(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList, @SafeParcelable.e(id = 3) String str) {
        this.O = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zal = (zal) arrayList.get(i11);
            String str2 = zal.P;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) s.l(zal.Q)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zam = (zam) zal.Q.get(i12);
                hashMap2.put(zam.P, zam.Q);
            }
            hashMap.put(str2, hashMap2);
        }
        this.P = hashMap;
        this.Q = (String) s.l(str);
        g1();
    }

    public zan(Class cls) {
        this.O = 1;
        this.P = new HashMap();
        this.Q = (String) s.l(cls.getCanonicalName());
    }

    public final String X0() {
        return this.Q;
    }

    @o0
    public final Map Z0(String str) {
        return (Map) this.P.get(str);
    }

    public final void f1() {
        for (String str : this.P.keySet()) {
            Map map = (Map) this.P.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((FastJsonResponse.Field) map.get(str2)).Q1());
            }
            this.P.put(str, hashMap);
        }
    }

    public final void g1() {
        for (String str : this.P.keySet()) {
            Map map = (Map) this.P.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).X1(this);
            }
        }
    }

    public final void h1(Class cls, Map map) {
        this.P.put((String) s.l(cls.getCanonicalName()), map);
    }

    public final boolean m1(Class cls) {
        return this.P.containsKey(s.l(cls.getCanonicalName()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.P.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.P.get(str);
            for (String str2 : map.keySet()) {
                sb2.append(q.a.R);
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        ArrayList arrayList = new ArrayList();
        for (String str : this.P.keySet()) {
            arrayList.add(new zal(str, (Map) this.P.get(str)));
        }
        b.d0(parcel, 2, arrayList, false);
        b.Y(parcel, 3, this.Q, false);
        b.b(parcel, a10);
    }
}
