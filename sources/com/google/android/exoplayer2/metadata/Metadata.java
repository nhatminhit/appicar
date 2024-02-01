package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.util.Arrays;
import java.util.List;
import w7.q0;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();
    public final Entry[] O;

    public interface Entry extends Parcelable {
    }

    public static class a implements Parcelable.Creator<Metadata> {
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* renamed from: b */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(Parcel parcel) {
        this.O = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.O;
            if (i10 < entryArr.length) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            Entry[] entryArr = new Entry[list.size()];
            this.O = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.O = new Entry[0];
    }

    public Metadata(Entry... entryArr) {
        this.O = entryArr == null ? new Entry[0] : entryArr;
    }

    public Metadata a(Entry... entryArr) {
        Entry[] entryArr2 = this.O;
        Entry[] entryArr3 = (Entry[]) Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, entryArr3, this.O.length, entryArr.length);
        return new Metadata((Entry[]) q0.m(entryArr3));
    }

    public Metadata b(@o0 Metadata metadata) {
        return metadata == null ? this : a(metadata.O);
    }

    public Entry c(int i10) {
        return this.O[i10];
    }

    public int d() {
        return this.O.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.O, ((Metadata) obj).O);
    }

    public int hashCode() {
        return Arrays.hashCode(this.O);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O.length);
        for (Entry writeParcelable : this.O) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
