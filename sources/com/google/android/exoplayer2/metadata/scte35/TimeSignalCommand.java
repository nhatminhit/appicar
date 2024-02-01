package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import b6.c;
import w7.j0;
import w7.w;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();
    public final long O;
    public final long P;

    public static class a implements Parcelable.Creator<TimeSignalCommand> {
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    public TimeSignalCommand(long j10, long j11) {
        this.O = j10;
        this.P = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    public static TimeSignalCommand a(w wVar, long j10, j0 j0Var) {
        long b10 = b(wVar, j10);
        return new TimeSignalCommand(b10, j0Var.b(b10));
    }

    public static long b(w wVar, long j10) {
        long D = (long) wVar.D();
        return (128 & D) != 0 ? 8589934591L & ((((D & 1) << 32) | wVar.F()) + j10) : c.f4201b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.O);
        parcel.writeLong(this.P);
    }
}
