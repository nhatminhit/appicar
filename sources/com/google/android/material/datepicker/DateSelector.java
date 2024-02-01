package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.a1;
import d.b1;
import d.m0;
import d.o0;
import d.x0;
import e1.j;
import java.util.Collection;

@x0({x0.a.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @m0
    Collection<Long> H0();

    @m0
    View N(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle, @m0 CalendarConstraints calendarConstraints, @m0 i<S> iVar);

    @a1
    int P();

    @o0
    S T0();

    void W0(long j10);

    @b1
    int c0(Context context);

    @m0
    String i(Context context);

    @m0
    Collection<j<Long, Long>> k();

    void m(@m0 S s10);

    boolean m0();
}
