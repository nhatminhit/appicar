package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();
    public final String O;
    public final byte[] P;
    public final int Q;
    public final int R;

    public static class a implements Parcelable.Creator<MdtaMetadataEntry> {
        /* renamed from: a */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, (a) null);
        }

        /* renamed from: b */
        public MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.O = (String) q0.l(parcel.readString());
        byte[] bArr = new byte[parcel.readInt()];
        this.P = bArr;
        parcel.readByteArray(bArr);
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.O = str;
        this.P = bArr;
        this.Q = i10;
        this.R = i11;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.O.equals(mdtaMetadataEntry.O) && Arrays.equals(this.P, mdtaMetadataEntry.P) && this.Q == mdtaMetadataEntry.Q && this.R == mdtaMetadataEntry.R;
    }

    public int hashCode() {
        return ((((((527 + this.O.hashCode()) * 31) + Arrays.hashCode(this.P)) * 31) + this.Q) * 31) + this.R;
    }

    public String toString() {
        return "mdta: key=" + this.O;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeInt(this.P.length);
        parcel.writeByteArray(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
    }
}
