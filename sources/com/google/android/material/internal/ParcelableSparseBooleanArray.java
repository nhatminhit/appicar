package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new a();

    public static class a implements Parcelable.Creator<ParcelableSparseBooleanArray> {
        @m0
        /* renamed from: a */
        public ParcelableSparseBooleanArray createFromParcel(@m0 Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i10 = 0; i10 < readInt; i10++) {
                parcelableSparseBooleanArray.put(iArr[i10], zArr[i10]);
            }
            return parcelableSparseBooleanArray;
        }

        @m0
        /* renamed from: b */
        public ParcelableSparseBooleanArray[] newArray(int i10) {
            return new ParcelableSparseBooleanArray[i10];
        }
    }

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int i10) {
        super(i10);
    }

    public ParcelableSparseBooleanArray(@m0 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            put(sparseBooleanArray.keyAt(i10), sparseBooleanArray.valueAt(i10));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i11 = 0; i11 < size(); i11++) {
            iArr[i11] = keyAt(i11);
            zArr[i11] = valueAt(i11);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
