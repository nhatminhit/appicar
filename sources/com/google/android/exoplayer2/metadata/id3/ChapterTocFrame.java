package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();
    public static final String U = "CTOC";
    public final String P;
    public final boolean Q;
    public final boolean R;
    public final String[] S;
    public final Id3Frame[] T;

    public static class a implements Parcelable.Creator<ChapterTocFrame> {
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super(U);
        this.P = (String) q0.l(parcel.readString());
        boolean z10 = true;
        this.Q = parcel.readByte() != 0;
        this.R = parcel.readByte() == 0 ? false : z10;
        this.S = (String[]) q0.l(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.T = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.T[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super(U);
        this.P = str;
        this.Q = z10;
        this.R = z11;
        this.S = strArr;
        this.T = id3FrameArr;
    }

    public Id3Frame a(int i10) {
        return this.T[i10];
    }

    public int b() {
        return this.T.length;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.Q == chapterTocFrame.Q && this.R == chapterTocFrame.R && q0.e(this.P, chapterTocFrame.P) && Arrays.equals(this.S, chapterTocFrame.S) && Arrays.equals(this.T, chapterTocFrame.T);
    }

    public int hashCode() {
        int i10 = (((true + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31;
        String str = this.P;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.P);
        parcel.writeByte(this.Q ? (byte) 1 : 0);
        parcel.writeByte(this.R ? (byte) 1 : 0);
        parcel.writeStringArray(this.S);
        parcel.writeInt(this.T.length);
        for (Id3Frame writeParcelable : this.T) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
