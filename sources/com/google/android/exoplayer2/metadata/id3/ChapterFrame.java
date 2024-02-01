package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();
    public static final String V = "CHAP";
    public final String P;
    public final int Q;
    public final int R;
    public final long S;
    public final long T;
    public final Id3Frame[] U;

    public static class a implements Parcelable.Creator<ChapterFrame> {
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: b */
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(Parcel parcel) {
        super(V);
        this.P = (String) q0.l(parcel.readString());
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readLong();
        this.T = parcel.readLong();
        int readInt = parcel.readInt();
        this.U = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.U[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(V);
        this.P = str;
        this.Q = i10;
        this.R = i11;
        this.S = j10;
        this.T = j11;
        this.U = id3FrameArr;
    }

    public Id3Frame a(int i10) {
        return this.U[i10];
    }

    public int b() {
        return this.U.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.Q == chapterFrame.Q && this.R == chapterFrame.R && this.S == chapterFrame.S && this.T == chapterFrame.T && q0.e(this.P, chapterFrame.P) && Arrays.equals(this.U, chapterFrame.U);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.Q) * 31) + this.R) * 31) + ((int) this.S)) * 31) + ((int) this.T)) * 31;
        String str = this.P;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeLong(this.S);
        parcel.writeLong(this.T);
        parcel.writeInt(this.U.length);
        for (Id3Frame writeParcelable : this.U) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
