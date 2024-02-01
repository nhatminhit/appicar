package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import d.m0;
import d.o0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new a();

    public static class a implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
        @o0
        /* renamed from: a */
        public ParcelableSparseArray createFromParcel(@m0 Parcel parcel) {
            return new ParcelableSparseArray(parcel, (ClassLoader) null);
        }

        @m0
        /* renamed from: b */
        public ParcelableSparseArray createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @m0
        /* renamed from: c */
        public ParcelableSparseArray[] newArray(int i10) {
            return new ParcelableSparseArray[i10];
        }
    }

    public ParcelableSparseArray() {
    }

    public ParcelableSparseArray(@m0 Parcel parcel, @o0 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(iArr[i10], readParcelableArray[i10]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = keyAt(i11);
            parcelableArr[i11] = (Parcelable) valueAt(i11);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
