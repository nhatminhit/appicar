package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import d.e0;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();
    public static final String V = "%02d";
    public static final String W = "%d";
    public final c O;
    public final c P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;

    public static class a implements Parcelable.Creator<TimeModel> {
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.Q = i13;
        this.U = f(i10);
        this.O = new c(59);
        this.P = new c(i13 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, V);
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public static int f(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    public int c() {
        if (this.Q == 1) {
            return this.R % 24;
        }
        int i10 = this.R;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.U == 1 ? i10 - 12 : i10;
    }

    public c d() {
        return this.P;
    }

    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.O;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.R == timeModel.R && this.S == timeModel.S && this.Q == timeModel.Q && this.T == timeModel.T;
    }

    public void g(int i10) {
        if (this.Q == 1) {
            this.R = i10;
            return;
        }
        int i11 = 12;
        int i12 = i10 % 12;
        if (this.U != 1) {
            i11 = 0;
        }
        this.R = i12 + i11;
    }

    public void h(int i10) {
        this.U = f(i10);
        this.R = i10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.Q), Integer.valueOf(this.R), Integer.valueOf(this.S), Integer.valueOf(this.T)});
    }

    public void j(@e0(from = 0, to = 60) int i10) {
        this.S = i10 % 60;
    }

    public void l(int i10) {
        int i11;
        if (i10 != this.U) {
            this.U = i10;
            int i12 = this.R;
            if (i12 < 12 && i10 == 1) {
                i11 = i12 + 12;
            } else if (i12 >= 12 && i10 == 0) {
                i11 = i12 - 12;
            } else {
                return;
            }
            this.R = i11;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.Q);
    }
}
