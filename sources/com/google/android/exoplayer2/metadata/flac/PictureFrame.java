package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();
    public final int O;
    public final String P;
    public final String Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final byte[] V;

    public static class a implements Parcelable.Creator<PictureFrame> {
        /* renamed from: a */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        /* renamed from: b */
        public PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.O = i10;
        this.P = str;
        this.Q = str2;
        this.R = i11;
        this.S = i12;
        this.T = i13;
        this.U = i14;
        this.V = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = (String) q0.l(parcel.readString());
        this.Q = (String) q0.l(parcel.readString());
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = (byte[]) q0.l(parcel.createByteArray());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.O == pictureFrame.O && this.P.equals(pictureFrame.P) && this.Q.equals(pictureFrame.Q) && this.R == pictureFrame.R && this.S == pictureFrame.S && this.T == pictureFrame.T && this.U == pictureFrame.U && Arrays.equals(this.V, pictureFrame.V);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.O) * 31) + this.P.hashCode()) * 31) + this.Q.hashCode()) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + Arrays.hashCode(this.V);
    }

    public String toString() {
        return "Picture: mimeType=" + this.P + ", description=" + this.Q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeByteArray(this.V);
    }
}
