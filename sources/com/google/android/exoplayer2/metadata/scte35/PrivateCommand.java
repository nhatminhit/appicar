package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import w7.w;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();
    public final long O;
    public final long P;
    public final byte[] Q;

    public static class a implements Parcelable.Creator<PrivateCommand> {
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, (a) null);
        }

        /* renamed from: b */
        public PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.O = j11;
        this.P = j10;
        this.Q = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.O = parcel.readLong();
        this.P = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.Q = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static PrivateCommand a(w wVar, int i10, long j10) {
        long F = wVar.F();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        wVar.i(bArr, 0, i11);
        return new PrivateCommand(F, bArr, j10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.O);
        parcel.writeLong(this.P);
        parcel.writeInt(this.Q.length);
        parcel.writeByteArray(this.Q);
    }
}
