package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import d.o0;
import java.util.Arrays;

public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();
    public final int O;
    public final Format[] P;
    public int Q;

    public static class a implements Parcelable.Creator<TrackGroup> {
        /* renamed from: a */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        /* renamed from: b */
        public TrackGroup[] newArray(int i10) {
            return new TrackGroup[i10];
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.O = readInt;
        this.P = new Format[readInt];
        for (int i10 = 0; i10 < this.O; i10++) {
            this.P[i10] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        w7.a.i(formatArr.length > 0);
        this.P = formatArr;
        this.O = formatArr.length;
    }

    public Format a(int i10) {
        return this.P[i10];
    }

    public int b(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.P;
            if (i10 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.O == trackGroup.O && Arrays.equals(this.P, trackGroup.P);
    }

    public int hashCode() {
        if (this.Q == 0) {
            this.Q = 527 + Arrays.hashCode(this.P);
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
