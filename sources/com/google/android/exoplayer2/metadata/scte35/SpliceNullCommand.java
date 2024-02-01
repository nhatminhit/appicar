package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new a();

    public static class a implements Parcelable.Creator<SpliceNullCommand> {
        /* renamed from: a */
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        /* renamed from: b */
        public SpliceNullCommand[] newArray(int i10) {
            return new SpliceNullCommand[i10];
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
    }
}
