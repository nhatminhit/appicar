package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w7.w;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();
    public final List<c> O;

    public static class a implements Parcelable.Creator<SpliceScheduleCommand> {
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (a) null);
        }

        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5172a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5173b;

        public b(int i10, long j10) {
            this.f5172a = i10;
            this.f5173b = j10;
        }

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f5172a);
            parcel.writeLong(this.f5173b);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f5174a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5175b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5176c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f5177d;

        /* renamed from: e  reason: collision with root package name */
        public final long f5178e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f5179f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f5180g;

        /* renamed from: h  reason: collision with root package name */
        public final long f5181h;

        /* renamed from: i  reason: collision with root package name */
        public final int f5182i;

        /* renamed from: j  reason: collision with root package name */
        public final int f5183j;

        /* renamed from: k  reason: collision with root package name */
        public final int f5184k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f5174a = j10;
            this.f5175b = z10;
            this.f5176c = z11;
            this.f5177d = z12;
            this.f5179f = Collections.unmodifiableList(list);
            this.f5178e = j11;
            this.f5180g = z13;
            this.f5181h = j12;
            this.f5182i = i10;
            this.f5183j = i11;
            this.f5184k = i12;
        }

        public c(Parcel parcel) {
            this.f5174a = parcel.readLong();
            boolean z10 = false;
            this.f5175b = parcel.readByte() == 1;
            this.f5176c = parcel.readByte() == 1;
            this.f5177d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f5179f = Collections.unmodifiableList(arrayList);
            this.f5178e = parcel.readLong();
            this.f5180g = parcel.readByte() == 1 ? true : z10;
            this.f5181h = parcel.readLong();
            this.f5182i = parcel.readInt();
            this.f5183j = parcel.readInt();
            this.f5184k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(w wVar) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            long j10;
            boolean z11;
            long j11;
            ArrayList arrayList;
            boolean z12;
            long j12;
            boolean z13;
            long F = wVar.F();
            boolean z14 = (wVar.D() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z14) {
                int D = wVar.D();
                boolean z15 = (D & 128) != 0;
                boolean z16 = (D & 64) != 0;
                boolean z17 = (D & 32) != 0;
                long F2 = z16 ? wVar.F() : b6.c.f4201b;
                if (!z16) {
                    int D2 = wVar.D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i13 = 0; i13 < D2; i13++) {
                        arrayList3.add(new b(wVar.D(), wVar.F(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long D3 = (long) wVar.D();
                    boolean z18 = (128 & D3) != 0;
                    j12 = ((((D3 & 1) << 32) | wVar.F()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = b6.c.f4201b;
                }
                int J = wVar.J();
                int D4 = wVar.D();
                z10 = z16;
                i10 = wVar.D();
                j10 = j12;
                arrayList = arrayList2;
                long j13 = F2;
                i12 = J;
                i11 = D4;
                j11 = j13;
                boolean z19 = z15;
                z11 = z13;
                z12 = z19;
            } else {
                arrayList = arrayList2;
                z12 = false;
                j11 = b6.c.f4201b;
                z11 = false;
                j10 = b6.c.f4201b;
                i12 = 0;
                i11 = 0;
                i10 = 0;
                z10 = false;
            }
            return new c(F, z14, z12, z10, arrayList, j11, z11, j10, i12, i11, i10);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f5174a);
            parcel.writeByte(this.f5175b ? (byte) 1 : 0);
            parcel.writeByte(this.f5176c ? (byte) 1 : 0);
            parcel.writeByte(this.f5177d ? (byte) 1 : 0);
            int size = this.f5179f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f5179f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f5178e);
            parcel.writeByte(this.f5180g ? (byte) 1 : 0);
            parcel.writeLong(this.f5181h);
            parcel.writeInt(this.f5182i);
            parcel.writeInt(this.f5183j);
            parcel.writeInt(this.f5184k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.O = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<c> list) {
        this.O = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand a(w wVar) {
        int D = wVar.D();
        ArrayList arrayList = new ArrayList(D);
        for (int i10 = 0; i10 < D; i10++) {
            arrayList.add(c.e(wVar));
        }
        return new SpliceScheduleCommand((List<c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.O.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.O.get(i11).f(parcel);
        }
    }
}
