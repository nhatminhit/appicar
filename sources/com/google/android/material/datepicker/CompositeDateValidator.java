package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import d.m0;
import e1.n;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();
    public static final int Q = 1;
    public static final int R = 2;
    public static final d S = new a();
    public static final d T = new b();
    @m0
    public final d O;
    @m0
    public final List<CalendarConstraints.DateValidator> P;

    public static class a implements d {
        public boolean a(@m0 List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.k0(j10)) {
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return 1;
        }
    }

    public static class b implements d {
        public boolean a(@m0 List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.k0(j10)) {
                    return false;
                }
            }
            return true;
        }

        public int getId() {
            return 2;
        }
    }

    public static class c implements Parcelable.Creator<CompositeDateValidator> {
        @m0
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(@m0 Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            return new CompositeDateValidator((List) n.g(readArrayList), (readInt != 2 && readInt == 1) ? CompositeDateValidator.S : CompositeDateValidator.T, (a) null);
        }

        @m0
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i10) {
            return new CompositeDateValidator[i10];
        }
    }

    public interface d {
        boolean a(@m0 List<CalendarConstraints.DateValidator> list, long j10);

        int getId();
    }

    public CompositeDateValidator(@m0 List<CalendarConstraints.DateValidator> list, d dVar) {
        this.P = list;
        this.O = dVar;
    }

    public /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @m0
    public static CalendarConstraints.DateValidator c(@m0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, T);
    }

    @m0
    public static CalendarConstraints.DateValidator d(@m0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, S);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.P.equals(compositeDateValidator.P) && this.O.getId() == compositeDateValidator.O.getId();
    }

    public int hashCode() {
        return this.P.hashCode();
    }

    public boolean k0(long j10) {
        return this.O.a(this.P, j10);
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeList(this.P);
        parcel.writeInt(this.O.getId());
    }
}
