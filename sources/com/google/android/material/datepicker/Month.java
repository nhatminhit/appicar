package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import d.m0;
import d.o0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    @m0
    public final Calendar O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final long T;
    @o0
    public String U;

    public static class a implements Parcelable.Creator<Month> {
        @m0
        /* renamed from: a */
        public Month createFromParcel(@m0 Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @m0
        /* renamed from: b */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(@m0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f10 = m.f(calendar);
        this.O = f10;
        this.P = f10.get(2);
        this.Q = f10.get(1);
        this.R = f10.getMaximum(7);
        this.S = f10.getActualMaximum(5);
        this.T = f10.getTimeInMillis();
    }

    @m0
    public static Month b(int i10, int i11) {
        Calendar v10 = m.v();
        v10.set(1, i10);
        v10.set(2, i11);
        return new Month(v10);
    }

    @m0
    public static Month d(long j10) {
        Calendar v10 = m.v();
        v10.setTimeInMillis(j10);
        return new Month(v10);
    }

    @m0
    public static Month e() {
        return new Month(m.t());
    }

    /* renamed from: a */
    public int compareTo(@m0 Month month) {
        return this.O.compareTo(month.O);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.P == month.P && this.Q == month.Q;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.P), Integer.valueOf(this.Q)});
    }

    public int j() {
        int firstDayOfWeek = this.O.get(7) - this.O.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.R : firstDayOfWeek;
    }

    public long l(int i10) {
        Calendar f10 = m.f(this.O);
        f10.set(5, i10);
        return f10.getTimeInMillis();
    }

    public int n(long j10) {
        Calendar f10 = m.f(this.O);
        f10.setTimeInMillis(j10);
        return f10.get(5);
    }

    @m0
    public String o(Context context) {
        if (this.U == null) {
            this.U = d.i(context, this.O.getTimeInMillis());
        }
        return this.U;
    }

    public long p() {
        return this.O.getTimeInMillis();
    }

    @m0
    public Month q(int i10) {
        Calendar f10 = m.f(this.O);
        f10.add(2, i10);
        return new Month(f10);
    }

    public int r(@m0 Month month) {
        if (this.O instanceof GregorianCalendar) {
            return ((month.Q - this.Q) * 12) + (month.P - this.P);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeInt(this.Q);
        parcel.writeInt(this.P);
    }
}
