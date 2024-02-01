package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import d.m0;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();
    public final long O;

    public static class a implements Parcelable.Creator<DateValidatorPointForward> {
        @m0
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(@m0 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (a) null);
        }

        @m0
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    }

    public DateValidatorPointForward(long j10) {
        this.O = j10;
    }

    public /* synthetic */ DateValidatorPointForward(long j10, a aVar) {
        this(j10);
    }

    @m0
    public static DateValidatorPointForward a(long j10) {
        return new DateValidatorPointForward(j10);
    }

    @m0
    public static DateValidatorPointForward b() {
        return a(m.t().getTimeInMillis());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        return this.O == ((DateValidatorPointForward) obj).O;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.O)});
    }

    public boolean k0(long j10) {
        return j10 >= this.O;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeLong(this.O);
    }
}
