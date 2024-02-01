package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {
    public final String O;

    public Id3Frame(String str) {
        this.O = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.O;
    }
}
