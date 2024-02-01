package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import d.m0;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();
    public final long O;

    public static class a implements Parcelable.Creator<DateValidatorPointBackward> {
        @m0
        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(@m0 Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (a) null);
        }

        @m0
        /* renamed from: b */
        public DateValidatorPointBackward[] newArray(int i10) {
            return new DateValidatorPointBackward[i10];
        }
    }

    public DateValidatorPointBackward(long j10) {
        this.O = j10;
    }

    public /* synthetic */ DateValidatorPointBackward(long j10, a aVar) {
        this(j10);
    }

    @m0
    public static DateValidatorPointBackward a(long j10) {
        return new DateValidatorPointBackward(j10);
    }

    @m0
    public static DateValidatorPointBackward b() {
        return a(m.t().getTimeInMillis());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointBackward)) {
            return false;
        }
        return this.O == ((DateValidatorPointBackward) obj).O;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.O)});
    }

    public boolean k0(long j10) {
        return j10 <= this.O;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeLong(this.O);
    }
}
