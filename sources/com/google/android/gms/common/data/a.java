package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import j8.s;

@e8.a
public class a<T extends SafeParcelable> extends i8.a<T> {
    public static final String[] Q = {"data"};
    public final Parcelable.Creator P;

    @e8.a
    public a(@m0 DataHolder dataHolder, @m0 Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.P = creator;
    }

    @e8.a
    public static <T extends SafeParcelable> void c(@m0 DataHolder.a aVar, @m0 T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        aVar.c(contentValues);
        obtain.recycle();
    }

    @e8.a
    @m0
    public static DataHolder.a f() {
        return DataHolder.X0(Q);
    }

    @e8.a
    @m0
    /* renamed from: h */
    public T get(int i10) {
        DataHolder dataHolder = (DataHolder) s.l(this.O);
        byte[] g12 = dataHolder.g1("data", i10, dataHolder.A1(i10));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(g12, 0, g12.length);
        obtain.setDataPosition(0);
        T t10 = (SafeParcelable) this.P.createFromParcel(obtain);
        obtain.recycle();
        return t10;
    }
}
