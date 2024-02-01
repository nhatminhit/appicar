package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import w7.q0;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();
    public static final String S = "----";
    public final String P;
    public final String Q;
    public final String R;

    public static class a implements Parcelable.Creator<InternalFrame> {
        /* renamed from: a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        /* renamed from: b */
        public InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(Parcel parcel) {
        super(S);
        this.P = (String) q0.l(parcel.readString());
        this.Q = (String) q0.l(parcel.readString());
        this.R = (String) q0.l(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(S);
        this.P = str;
        this.Q = str2;
        this.R = str3;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return q0.e(this.Q, internalFrame.Q) && q0.e(this.P, internalFrame.P) && q0.e(this.R, internalFrame.R);
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
        return hashCode2 + i10;
    }

    public String toString() {
        return this.O + ": domain=" + this.P + ", description=" + this.Q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.R);
    }
}
