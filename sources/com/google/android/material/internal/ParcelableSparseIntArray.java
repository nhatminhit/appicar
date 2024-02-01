package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new a();

    public static class a implements Parcelable.Creator<ParcelableSparseIntArray> {
        @m0
        /* renamed from: a */
        public ParcelableSparseIntArray createFromParcel(@m0 Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i10 = 0; i10 < readInt; i10++) {
                parcelableSparseIntArray.put(iArr[i10], iArr2[i10]);
            }
            return parcelableSparseIntArray;
        }

        @m0
        /* renamed from: b */
        public ParcelableSparseIntArray[] newArray(int i10) {
            return new ParcelableSparseIntArray[i10];
        }
    }

    public ParcelableSparseIntArray() {
    }

    public ParcelableSparseIntArray(int i10) {
        super(i10);
    }

    public ParcelableSparseIntArray(@m0 SparseIntArray sparseIntArray) {
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            put(sparseIntArray.keyAt(i10), sparseIntArray.valueAt(i10));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i11 = 0; i11 < size(); i11++) {
            iArr[i11] = keyAt(i11);
            iArr2[i11] = valueAt(i11);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
