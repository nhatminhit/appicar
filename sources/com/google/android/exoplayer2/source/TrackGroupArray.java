package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();
    public static final TrackGroupArray R = new TrackGroupArray(new TrackGroup[0]);
    public final int O;
    public final TrackGroup[] P;
    public int Q;

    public static class a implements Parcelable.Creator<TrackGroupArray> {
        /* renamed from: a */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        /* renamed from: b */
        public TrackGroupArray[] newArray(int i10) {
            return new TrackGroupArray[i10];
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.O = readInt;
        this.P = new TrackGroup[readInt];
        for (int i10 = 0; i10 < this.O; i10++) {
            this.P[i10] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.P = trackGroupArr;
        this.O = trackGroupArr.length;
    }

    public TrackGroup a(int i10) {
        return this.P[i10];
    }

    public int b(TrackGroup trackGroup) {
        for (int i10 = 0; i10 < this.O; i10++) {
            if (this.P[i10] == trackGroup) {
                return i10;
            }
        }
        return -1;
    }

    public boolean c() {
        return this.O == 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.O == trackGroupArray.O && Arrays.equals(this.P, trackGroupArray.P);
    }

    public int hashCode() {
        if (this.Q == 0) {
            this.Q = Arrays.hashCode(this.P);
        }
        return this.Q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        for (int i11 = 0; i11 < this.O; i11++) {
            parcel.writeParcelable(this.P[i11], 0);
        }
    }
}
