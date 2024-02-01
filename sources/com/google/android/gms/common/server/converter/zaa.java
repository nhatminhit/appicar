package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import l8.b;
import s8.a;

@SafeParcelable.a(creator = "ConverterWrapperCreator")
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getStringToIntConverter", id = 2)
    public final StringToIntConverter P;

    @SafeParcelable.b
    public zaa(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) StringToIntConverter stringToIntConverter) {
        this.O = i10;
        this.P = stringToIntConverter;
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.O = 1;
        this.P = stringToIntConverter;
    }

    public static zaa X0(FastJsonResponse.a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.a Z0() {
        StringToIntConverter stringToIntConverter = this.P;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, this.P, i10, false);
        b.b(parcel, a10);
    }
}
