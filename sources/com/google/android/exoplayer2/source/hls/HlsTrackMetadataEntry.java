package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();
    @o0
    public final String O;
    @o0
    public final String P;
    public final List<VariantInfo> Q;

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();
        public final long O;
        @o0
        public final String P;
        @o0
        public final String Q;
        @o0
        public final String R;
        @o0
        public final String S;

        public static class a implements Parcelable.Creator<VariantInfo> {
            /* renamed from: a */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            /* renamed from: b */
            public VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(long j10, @o0 String str, @o0 String str2, @o0 String str3, @o0 String str4) {
            this.O = j10;
            this.P = str;
            this.Q = str2;
            this.R = str3;
            this.S = str4;
        }

        public VariantInfo(Parcel parcel) {
            this.O = parcel.readLong();
            this.P = parcel.readString();
            this.Q = parcel.readString();
            this.R = parcel.readString();
            this.S = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.O == variantInfo.O && TextUtils.equals(this.P, variantInfo.P) && TextUtils.equals(this.Q, variantInfo.Q) && TextUtils.equals(this.R, variantInfo.R) && TextUtils.equals(this.S, variantInfo.S);
        }

        public int hashCode() {
            long j10 = this.O;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            String str = this.P;
            int i11 = 0;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.Q;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.R;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.S;
            if (str4 != null) {
                i11 = str4.hashCode();
            }
            return hashCode3 + i11;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.O);
            parcel.writeString(this.P);
            parcel.writeString(this.Q);
            parcel.writeString(this.R);
            parcel.writeString(this.S);
        }
    }

    public static class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        /* renamed from: a */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        /* renamed from: b */
        public HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.O = parcel.readString();
        this.P = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.Q = Collections.unmodifiableList(arrayList);
    }

    public HlsTrackMetadataEntry(@o0 String str, @o0 String str2, List<VariantInfo> list) {
        this.O = str;
        this.P = str2;
        this.Q = Collections.unmodifiableList(new ArrayList(list));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.O, hlsTrackMetadataEntry.O) && TextUtils.equals(this.P, hlsTrackMetadataEntry.P) && this.Q.equals(hlsTrackMetadataEntry.Q);
    }

    public int hashCode() {
        String str = this.O;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.P;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + this.Q.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        int size = this.Q.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.Q.get(i11), 0);
        }
    }
}
