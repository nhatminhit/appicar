package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();
    public static final String U = "MLLT";
    public final int P;
    public final int Q;
    public final int R;
    public final int[] S;
    public final int[] T;

    public static class a implements Parcelable.Creator<MlltFrame> {
        /* renamed from: a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        /* renamed from: b */
        public MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super(U);
        this.P = i10;
        this.Q = i11;
        this.R = i12;
        this.S = iArr;
        this.T = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super(U);
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = (int[]) q0.l(parcel.createIntArray());
        this.T = (int[]) q0.l(parcel.createIntArray());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.P == mlltFrame.P && this.Q == mlltFrame.Q && this.R == mlltFrame.R && Arrays.equals(this.S, mlltFrame.S) && Arrays.equals(this.T, mlltFrame.T);
    }

    public int hashCode() {
        return ((((((((527 + this.P) * 31) + this.Q) * 31) + this.R) * 31) + Arrays.hashCode(this.S)) * 31) + Arrays.hashCode(this.T);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeIntArray(this.S);
        parcel.writeIntArray(this.T);
    }
}
