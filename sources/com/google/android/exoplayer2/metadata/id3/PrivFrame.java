package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();
    public static final String R = "PRIV";
    public final String P;
    public final byte[] Q;

    public static class a implements Parcelable.Creator<PrivFrame> {
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: b */
        public PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(Parcel parcel) {
        super(R);
        this.P = (String) q0.l(parcel.readString());
        this.Q = (byte[]) q0.l(parcel.createByteArray());
    }

    public PrivFrame(String str, byte[] bArr) {
        super(R);
        this.P = str;
        this.Q = bArr;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return q0.e(this.P, privFrame.P) && Arrays.equals(this.Q, privFrame.Q);
    }

    public int hashCode() {
        String str = this.P;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.Q);
    }

    public String toString() {
        return this.O + ": owner=" + this.P;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.P);
        parcel.writeByteArray(this.Q);
    }
}
