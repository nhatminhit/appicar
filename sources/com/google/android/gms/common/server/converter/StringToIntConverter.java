package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import e8.a;
import java.util.ArrayList;
import java.util.HashMap;
import s8.b;

@a
@SafeParcelable.a(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {
    @m0
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();
    @SafeParcelable.h(id = 1)
    public final int O;
    public final HashMap P;
    public final SparseArray Q;

    @a
    public StringToIntConverter() {
        this.O = 1;
        this.P = new HashMap();
        this.Q = new SparseArray();
    }

    @SafeParcelable.b
    public StringToIntConverter(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList) {
        this.O = i10;
        this.P = new HashMap();
        this.Q = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zac = (zac) arrayList.get(i11);
            X0(zac.P, zac.Q);
        }
    }

    @a
    @CanIgnoreReturnValue
    @m0
    public StringToIntConverter X0(@m0 String str, int i10) {
        this.P.put(str, Integer.valueOf(i10));
        this.Q.put(i10, str);
        return this;
    }

    public final int c() {
        return 7;
    }

    public final int f() {
        return 0;
    }

    @m0
    public final /* bridge */ /* synthetic */ Object o(@m0 Object obj) {
        String str = (String) this.Q.get(((Integer) obj).intValue());
        return (str != null || !this.P.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    @o0
    public final /* bridge */ /* synthetic */ Object w(@m0 Object obj) {
        Integer num = (Integer) this.P.get((String) obj);
        return num == null ? (Integer) this.P.get("gms_unknown") : num;
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, this.O);
        ArrayList arrayList = new ArrayList();
        for (String str : this.P.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.P.get(str)).intValue()));
        }
        l8.b.d0(parcel, 2, arrayList, false);
        l8.b.b(parcel, a10);
    }
}
