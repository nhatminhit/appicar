package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import w7.q0;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();
    @o0
    public final String O;
    @o0
    public final String P;

    public static class a implements Parcelable.Creator<IcyInfo> {
        /* renamed from: a */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        /* renamed from: b */
        public IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(Parcel parcel) {
        this.O = parcel.readString();
        this.P = parcel.readString();
    }

    public IcyInfo(@o0 String str, @o0 String str2) {
        this.O = str;
        this.P = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        IcyInfo icyInfo = (IcyInfo) obj;
        return q0.e(this.O, icyInfo.O) && q0.e(this.P, icyInfo.P);
    }

    public int hashCode() {
        String str = this.O;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.P;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ICY: title=\"" + this.O + "\", url=\"" + this.P + "\"";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
    }
}
