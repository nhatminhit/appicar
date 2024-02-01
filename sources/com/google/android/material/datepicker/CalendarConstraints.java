package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.m0;
import d.o0;
import e1.i;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    @m0
    public final Month O;
    @m0
    public final Month P;
    @m0
    public final DateValidator Q;
    @o0
    public Month R;
    public final int S;
    public final int T;

    public interface DateValidator extends Parcelable {
        boolean k0(long j10);
    }

    public static class a implements Parcelable.Creator<CalendarConstraints> {
        @m0
        /* renamed from: a */
        public CalendarConstraints createFromParcel(@m0 Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (a) null);
        }

        @m0
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f16952e = m.a(Month.b(1900, 0).T);

        /* renamed from: f  reason: collision with root package name */
        public static final long f16953f = m.a(Month.b(2100, 11).T);

        /* renamed from: g  reason: collision with root package name */
        public static final String f16954g = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: a  reason: collision with root package name */
        public long f16955a = f16952e;

        /* renamed from: b  reason: collision with root package name */
        public long f16956b = f16953f;

        /* renamed from: c  reason: collision with root package name */
        public Long f16957c;

        /* renamed from: d  reason: collision with root package name */
        public DateValidator f16958d = DateValidatorPointForward.a(Long.MIN_VALUE);

        public b() {
        }

        public b(@m0 CalendarConstraints calendarConstraints) {
            this.f16955a = calendarConstraints.O.T;
            this.f16956b = calendarConstraints.P.T;
            this.f16957c = Long.valueOf(calendarConstraints.R.T);
            this.f16958d = calendarConstraints.Q;
        }

        @m0
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f16954g, this.f16958d);
            Month d10 = Month.d(this.f16955a);
            Month d11 = Month.d(this.f16956b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f16954g);
            Long l10 = this.f16957c;
            return new CalendarConstraints(d10, d11, dateValidator, l10 == null ? null : Month.d(l10.longValue()), (a) null);
        }

        @m0
        public b b(long j10) {
            this.f16956b = j10;
            return this;
        }

        @m0
        public b c(long j10) {
            this.f16957c = Long.valueOf(j10);
            return this;
        }

        @m0
        public b d(long j10) {
            this.f16955a = j10;
            return this;
        }

        @m0
        public b e(@m0 DateValidator dateValidator) {
            this.f16958d = dateValidator;
            return this;
        }
    }

    public CalendarConstraints(@m0 Month month, @m0 Month month2, @m0 DateValidator dateValidator, @o0 Month month3) {
        this.O = month;
        this.P = month2;
        this.R = month3;
        this.Q = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.compareTo(month2) <= 0) {
            this.T = month.r(month2) + 1;
            this.S = (month2.Q - month.Q) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    public int describeContents() {
        return 0;
    }

    public Month e(Month month) {
        return month.compareTo(this.O) < 0 ? this.O : month.compareTo(this.P) > 0 ? this.P : month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.O.equals(calendarConstraints.O) && this.P.equals(calendarConstraints.P) && i.a(this.R, calendarConstraints.R) && this.Q.equals(calendarConstraints.Q);
    }

    public DateValidator f() {
        return this.Q;
    }

    @m0
    public Month g() {
        return this.P;
    }

    public int h() {
        return this.T;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.O, this.P, this.R, this.Q});
    }

    @o0
    public Month j() {
        return this.R;
    }

    @m0
    public Month l() {
        return this.O;
    }

    public int n() {
        return this.S;
    }

    public boolean o(long j10) {
        if (this.O.l(1) <= j10) {
            Month month = this.P;
            if (j10 <= month.l(month.S)) {
                return true;
            }
        }
        return false;
    }

    public void p(@o0 Month month) {
        this.R = month;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.O, 0);
        parcel.writeParcelable(this.P, 0);
        parcel.writeParcelable(this.R, 0);
        parcel.writeParcelable(this.Q, 0);
    }
}
