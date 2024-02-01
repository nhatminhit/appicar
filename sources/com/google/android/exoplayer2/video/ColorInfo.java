package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();
    public final int O;
    public final int P;
    public final int Q;
    @o0
    public final byte[] R;
    public int S;

    public static class a implements Parcelable.Creator<ColorInfo> {
        /* renamed from: a */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* renamed from: b */
        public ColorInfo[] newArray(int i10) {
            return new ColorInfo[i10];
        }
    }

    public ColorInfo(int i10, int i11, int i12, @o0 byte[] bArr) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = q0.H0(parcel) ? parcel.createByteArray() : null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.O == colorInfo.O && this.P == colorInfo.P && this.Q == colorInfo.Q && Arrays.equals(this.R, colorInfo.R);
    }

    public int hashCode() {
        if (this.S == 0) {
            this.S = ((((((527 + this.O) * 31) + this.P) * 31) + this.Q) * 31) + Arrays.hashCode(this.R);
        }
        return this.S;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.O);
        sb2.append(", ");
        sb2.append(this.P);
        sb2.append(", ");
        sb2.append(this.Q);
        sb2.append(", ");
        sb2.append(this.R != null);
        sb2.append(")");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        q0.b1(parcel, this.R != null);
        byte[] bArr = this.R;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
