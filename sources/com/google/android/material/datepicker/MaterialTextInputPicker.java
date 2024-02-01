package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.b1;
import d.m0;
import d.o0;
import d.x0;
import java.util.Iterator;

@x0({x0.a.LIBRARY_GROUP})
public final class MaterialTextInputPicker<S> extends j<S> {

    /* renamed from: c1  reason: collision with root package name */
    public static final String f17000c1 = "THEME_RES_ID_KEY";

    /* renamed from: d1  reason: collision with root package name */
    public static final String f17001d1 = "DATE_SELECTOR_KEY";

    /* renamed from: e1  reason: collision with root package name */
    public static final String f17002e1 = "CALENDAR_CONSTRAINTS_KEY";
    @b1
    public int Z0;
    @o0

    /* renamed from: a1  reason: collision with root package name */
    public DateSelector<S> f17003a1;
    @o0

    /* renamed from: b1  reason: collision with root package name */
    public CalendarConstraints f17004b1;

    public class a extends i<S> {
        public a() {
        }

        public void a() {
            Iterator<i<S>> it = MaterialTextInputPicker.this.Y0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public void b(S s10) {
            Iterator<i<S>> it = MaterialTextInputPicker.this.Y0.iterator();
            while (it.hasNext()) {
                it.next().b(s10);
            }
        }
    }

    @m0
    public static <T> MaterialTextInputPicker<T> N0(DateSelector<T> dateSelector, @b1 int i10, @m0 CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @m0
    public DateSelector<S> L0() {
        DateSelector<S> dateSelector = this.f17003a1;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.Z0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f17003a1 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f17004b1 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @m0
    public View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        return this.f17003a1.N(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.Z0)), viewGroup, bundle, this.f17004b1, new a());
    }

    public void onSaveInstanceState(@m0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f17003a1);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f17004b1);
    }
}
