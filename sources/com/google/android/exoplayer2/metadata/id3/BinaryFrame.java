package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();
    public final byte[] P;

    public static class a implements Parcelable.Creator<BinaryFrame> {
        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: b */
        public BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    }

    public BinaryFrame(Parcel parcel) {
        super((String) q0.l(parcel.readString()));
        this.P = (byte[]) q0.l(parcel.createByteArray());
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.P = bArr;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.O.equals(binaryFrame.O) && Arrays.equals(this.P, binaryFrame.P);
    }

    public int hashCode() {
        return ((527 + this.O.hashCode()) * 31) + Arrays.hashCode(this.P);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeByteArray(this.P);
    }
}
