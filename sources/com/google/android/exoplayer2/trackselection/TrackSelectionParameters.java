package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d.o0;
import w7.q0;

public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR = new a();
    public static final TrackSelectionParameters S = new TrackSelectionParameters();
    @o0
    public final String O;
    @o0
    public final String P;
    public final boolean Q;
    public final int R;

    public static class a implements Parcelable.Creator<TrackSelectionParameters> {
        /* renamed from: a */
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        /* renamed from: b */
        public TrackSelectionParameters[] newArray(int i10) {
            return new TrackSelectionParameters[i10];
        }
    }

    public static class b {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public String f5347a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public String f5348b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5349c;

        /* renamed from: d  reason: collision with root package name */
        public int f5350d;

        public b() {
            this(TrackSelectionParameters.S);
        }

        public b(TrackSelectionParameters trackSelectionParameters) {
            this.f5347a = trackSelectionParameters.O;
            this.f5348b = trackSelectionParameters.P;
            this.f5349c = trackSelectionParameters.Q;
            this.f5350d = trackSelectionParameters.R;
        }

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this.f5347a, this.f5348b, this.f5349c, this.f5350d);
        }

        public b b(int i10) {
            this.f5350d = i10;
            return this;
        }

        public b c(@o0 String str) {
            this.f5347a = str;
            return this;
        }

        public b d(@o0 String str) {
            this.f5348b = str;
            return this;
        }

        public b e(boolean z10) {
            this.f5349c = z10;
            return this;
        }
    }

    public TrackSelectionParameters() {
        this((String) null, (String) null, false, 0);
    }

    public TrackSelectionParameters(Parcel parcel) {
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = q0.H0(parcel);
        this.R = parcel.readInt();
    }

    public TrackSelectionParameters(@o0 String str, @o0 String str2, boolean z10, int i10) {
        this.O = q0.B0(str);
        this.P = q0.B0(str2);
        this.Q = z10;
        this.R = i10;
    }

    public b a() {
        return new b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return TextUtils.equals(this.O, trackSelectionParameters.O) && TextUtils.equals(this.P, trackSelectionParameters.P) && this.Q == trackSelectionParameters.Q && this.R == trackSelectionParameters.R;
    }

    public int hashCode() {
        String str = this.O;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.P;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((hashCode + i10) * 31) + (this.Q ? 1 : 0)) * 31) + this.R;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        q0.b1(parcel, this.Q);
        parcel.writeInt(this.R);
    }
}
