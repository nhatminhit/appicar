package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import w7.q0;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();
    @o0
    public final String P;
    public final String Q;

    public static class a implements Parcelable.Creator<UrlLinkFrame> {
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) q0.l(parcel.readString()));
        this.P = parcel.readString();
        this.Q = (String) q0.l(parcel.readString());
    }

    public UrlLinkFrame(String str, @o0 String str2, String str3) {
        super(str);
        this.P = str2;
        this.Q = str3;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.O.equals(urlLinkFrame.O) && q0.e(this.P, urlLinkFrame.P) && q0.e(this.Q, urlLinkFrame.Q);
    }

    public int hashCode() {
        int hashCode = (527 + this.O.hashCode()) * 31;
        String str = this.P;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Q;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.O + ": url=" + this.Q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
    }
}
