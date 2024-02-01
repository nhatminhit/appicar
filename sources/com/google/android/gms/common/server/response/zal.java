package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import d.o0;
import j8.w;
import java.util.ArrayList;
import java.util.Map;
import t8.b;

@SafeParcelable.a(creator = "FieldMappingDictionaryEntryCreator")
@w
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new b();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(id = 2)
    public final String P;
    @o0
    @SafeParcelable.c(id = 3)
    public final ArrayList Q;

    @SafeParcelable.b
    public zal(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) ArrayList arrayList) {
        this.O = i10;
        this.P = str;
        this.Q = arrayList;
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.O = 1;
        this.P = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.Q = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, this.O);
        l8.b.Y(parcel, 2, this.P, false);
        l8.b.d0(parcel, 3, this.Q, false);
        l8.b.b(parcel, a10);
    }
}
