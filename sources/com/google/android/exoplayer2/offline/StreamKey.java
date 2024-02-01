package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import d.m0;
import d.o0;

public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();
    public final int O;
    public final int P;
    public final int Q;

    public static class a implements Parcelable.Creator<StreamKey> {
        /* renamed from: a */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* renamed from: b */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
    }

    public StreamKey(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
    }

    /* renamed from: a */
    public int compareTo(@m0 StreamKey streamKey) {
        int i10 = this.O - streamKey.O;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.P - streamKey.P;
        return i11 == 0 ? this.Q - streamKey.Q : i11;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.O == streamKey.O && this.P == streamKey.P && this.Q == streamKey.Q;
    }

    public int hashCode() {
        return (((this.O * 31) + this.P) * 31) + this.Q;
    }

    public String toString() {
        return this.O + "." + this.P + "." + this.Q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
    }
}
