package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.i;
import androidx.customview.view.AbsSavedState;
import d.m0;
import d.o0;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();
    @m0
    public final i<String, Bundle> Q;

    public static class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @o0
        /* renamed from: a */
        public ExtendableSavedState createFromParcel(@m0 Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (a) null);
        }

        @m0
        /* renamed from: b */
        public ExtendableSavedState createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (a) null);
        }

        @m0
        /* renamed from: c */
        public ExtendableSavedState[] newArray(int i10) {
            return new ExtendableSavedState[i10];
        }
    }

    public ExtendableSavedState(@m0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.Q = new i<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.Q.put(strArr[i10], bundleArr[i10]);
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.Q = new i<>();
    }

    @m0
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.Q + p7.a.f11639j;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.Q.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.Q.m(i11);
            bundleArr[i11] = this.Q.q(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
