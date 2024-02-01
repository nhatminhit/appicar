package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();
    public static final String T = "APIC";
    public final String P;
    @o0
    public final String Q;
    public final int R;
    public final byte[] S;

    public static class a implements Parcelable.Creator<ApicFrame> {
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: b */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(Parcel parcel) {
        super(T);
        this.P = (String) q0.l(parcel.readString());
        this.Q = (String) q0.l(parcel.readString());
        this.R = parcel.readInt();
        this.S = (byte[]) q0.l(parcel.createByteArray());
    }

    public ApicFrame(String str, @o0 String str2, int i10, byte[] bArr) {
        super(T);
        this.P = str;
        this.Q = str2;
        this.R = i10;
        this.S = bArr;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.R == apicFrame.R && q0.e(this.P, apicFrame.P) && q0.e(this.Q, apicFrame.Q) && Arrays.equals(this.S, apicFrame.S);
    }

    public int hashCode() {
        int i10 = (527 + this.R) * 31;
        String str = this.P;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Q;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.hashCode(this.S);
    }

    public String toString() {
        return this.O + ": mimeType=" + this.P + ", description=" + this.Q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeByteArray(this.S);
    }
}
