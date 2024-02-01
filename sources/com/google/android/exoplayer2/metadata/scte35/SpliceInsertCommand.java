package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import b6.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w7.j0;
import w7.w;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();
    public final long O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final long T;
    public final long U;
    public final List<b> V;
    public final boolean W;
    public final long X;
    public final int Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f5168a0;

    public static class a implements Parcelable.Creator<SpliceInsertCommand> {
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (a) null);
        }

        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5169a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5170b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5171c;

        public b(int i10, long j10, long j11) {
            this.f5169a = i10;
            this.f5170b = j10;
            this.f5171c = j11;
        }

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f5169a);
            parcel.writeLong(this.f5170b);
            parcel.writeLong(this.f5171c);
        }
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.O = j10;
        this.P = z10;
        this.Q = z11;
        this.R = z12;
        this.S = z13;
        this.T = j11;
        this.U = j12;
        this.V = Collections.unmodifiableList(list);
        this.W = z14;
        this.X = j13;
        this.Y = i10;
        this.Z = i11;
        this.f5168a0 = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.O = parcel.readLong();
        boolean z10 = false;
        this.P = parcel.readByte() == 1;
        this.Q = parcel.readByte() == 1;
        this.R = parcel.readByte() == 1;
        this.S = parcel.readByte() == 1;
        this.T = parcel.readLong();
        this.U = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.V = Collections.unmodifiableList(arrayList);
        this.W = parcel.readByte() == 1 ? true : z10;
        this.X = parcel.readLong();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.f5168a0 = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand a(w wVar, long j10, j0 j0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j11;
        boolean z11;
        List list;
        long j12;
        boolean z12;
        boolean z13;
        long j13;
        boolean z14;
        j0 j0Var2 = j0Var;
        long F = wVar.F();
        boolean z15 = (wVar.D() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z15) {
            int D = wVar.D();
            boolean z16 = (D & 128) != 0;
            boolean z17 = (D & 64) != 0;
            boolean z18 = (D & 32) != 0;
            boolean z19 = (D & 16) != 0;
            long b10 = (!z17 || z19) ? c.f4201b : TimeSignalCommand.b(wVar, j10);
            if (!z17) {
                int D2 = wVar.D();
                ArrayList arrayList = new ArrayList(D2);
                for (int i13 = 0; i13 < D2; i13++) {
                    int D3 = wVar.D();
                    long b11 = !z19 ? TimeSignalCommand.b(wVar, j10) : c.f4201b;
                    arrayList.add(new b(D3, b11, j0Var2.b(b11), (a) null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long D4 = (long) wVar.D();
                boolean z20 = (128 & D4) != 0;
                j13 = ((((D4 & 1) << 32) | wVar.F()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = c.f4201b;
            }
            i12 = wVar.J();
            z10 = z17;
            i11 = wVar.D();
            i10 = wVar.D();
            list = emptyList;
            long j14 = b10;
            z11 = z14;
            j11 = j13;
            z12 = z19;
            z13 = z16;
            j12 = j14;
        } else {
            list = emptyList;
            z13 = false;
            z12 = false;
            j12 = c.f4201b;
            z11 = false;
            j11 = c.f4201b;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z10 = false;
        }
        return new SpliceInsertCommand(F, z15, z13, z10, z12, j12, j0Var2.b(j12), list, z11, j11, i12, i11, i10);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.O);
        parcel.writeByte(this.P ? (byte) 1 : 0);
        parcel.writeByte(this.Q ? (byte) 1 : 0);
        parcel.writeByte(this.R ? (byte) 1 : 0);
        parcel.writeByte(this.S ? (byte) 1 : 0);
        parcel.writeLong(this.T);
        parcel.writeLong(this.U);
        int size = this.V.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.V.get(i11).b(parcel);
        }
        parcel.writeByte(this.W ? (byte) 1 : 0);
        parcel.writeLong(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f5168a0);
    }
}
