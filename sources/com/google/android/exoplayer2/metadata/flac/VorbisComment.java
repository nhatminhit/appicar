package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import w7.l;
import w7.q0;

public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();
    public final String O;
    public final String P;

    public static class a implements Parcelable.Creator<VorbisComment> {
        /* renamed from: a */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* renamed from: b */
        public VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(Parcel parcel) {
        this.O = (String) q0.l(parcel.readString());
        this.P = (String) q0.l(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
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
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.O.equals(vorbisComment.O) && this.P.equals(vorbisComment.P);
    }

    public int hashCode() {
        return ((527 + this.O.hashCode()) * 31) + this.P.hashCode();
    }

    public String toString() {
        return "VC: " + this.O + l.f14755k + this.P;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
    }
}
