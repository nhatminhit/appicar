package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();
    public static final String T = "GEOB";
    public final String P;
    public final String Q;
    public final String R;
    public final byte[] S;

    public static class a implements Parcelable.Creator<GeobFrame> {
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: b */
        public GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(Parcel parcel) {
        super(T);
        this.P = (String) q0.l(parcel.readString());
        this.Q = (String) q0.l(parcel.readString());
        this.R = (String) q0.l(parcel.readString());
        this.S = (byte[]) q0.l(parcel.createByteArray());
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(T);
        this.P = str;
        this.Q = str2;
        this.R = str3;
        this.S = bArr;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return q0.e(this.P, geobFrame.P) && q0.e(this.Q, geobFrame.Q) && q0.e(this.R, geobFrame.R) && Arrays.equals(this.S, geobFrame.S);
    }

    public int hashCode() {
        String str = this.P;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Q;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.R;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Arrays.hashCode(this.S);
    }

    public String toString() {
        return this.O + ": mimeType=" + this.P + ", filename=" + this.Q + ", description=" + this.R;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeByteArray(this.S);
    }
}
