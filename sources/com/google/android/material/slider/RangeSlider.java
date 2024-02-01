package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.material.internal.n;
import d.e0;
import d.m0;
import d.o0;
import d.p;
import d.q;
import i9.a;
import java.util.ArrayList;
import java.util.List;

public class RangeSlider extends BaseSlider<RangeSlider, b, c> {

    /* renamed from: f1  reason: collision with root package name */
    public float f17345f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f17346g1;

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new a();
        public float O;
        public int P;

        public static class a implements Parcelable.Creator<RangeSliderState> {
            /* renamed from: a */
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            /* renamed from: b */
            public RangeSliderState[] newArray(int i10) {
                return new RangeSliderState[i10];
            }
        }

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.O = parcel.readFloat();
            this.P = parcel.readInt();
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.O);
            parcel.writeInt(this.P);
        }
    }

    public interface b extends a<RangeSlider> {
    }

    public interface c extends b<RangeSlider> {
    }

    public RangeSlider(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public RangeSlider(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.sliderStyle);
    }

    public RangeSlider(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray j10 = n.j(context, attributeSet, a.o.RangeSlider, i10, BaseSlider.f17307a1, new int[0]);
        int i11 = a.o.RangeSlider_values;
        if (j10.hasValue(i11)) {
            setValues(v0(j10.getResources().obtainTypedArray(j10.getResourceId(i11, 0))));
        }
        this.f17345f1 = j10.getDimension(a.o.RangeSlider_minSeparation, 0.0f);
        j10.recycle();
    }

    public static List<Float> v0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < typedArray.length(); i10++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i10, -1.0f)));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    public /* bridge */ /* synthetic */ boolean L() {
        return super.L();
    }

    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@m0 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@m0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @m0
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @q
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    public float getMinSeparation() {
        return this.f17345f1;
    }

    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @q
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @q
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @q
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @m0
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @q
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @m0
    public List<Float> getValues() {
        return super.getValues();
    }

    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    public /* bridge */ /* synthetic */ boolean onKeyDown(int i10, @m0 KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    public /* bridge */ /* synthetic */ boolean onKeyUp(int i10, @m0 KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    public void onRestoreInstanceState(@o0 Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f17345f1 = rangeSliderState.O;
        int c10 = rangeSliderState.P;
        this.f17346g1 = c10;
        setSeparationUnit(c10);
    }

    @m0
    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        float unused = rangeSliderState.O = this.f17345f1;
        int unused2 = rangeSliderState.P = this.f17346g1;
        return rangeSliderState;
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(@m0 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i10) {
        super.setFocusedThumbIndex(i10);
    }

    public /* bridge */ /* synthetic */ void setHaloRadius(@q @e0(from = 0) int i10) {
        super.setHaloRadius(i10);
    }

    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@p int i10) {
        super.setHaloRadiusResource(i10);
    }

    public /* bridge */ /* synthetic */ void setHaloTintList(@m0 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setLabelBehavior(int i10) {
        super.setLabelBehavior(i10);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(@o0 d dVar) {
        super.setLabelFormatter(dVar);
    }

    public void setMinSeparation(@q float f10) {
        this.f17345f1 = f10;
        this.f17346g1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f10) {
        this.f17345f1 = f10;
        this.f17346g1 = 1;
        setSeparationUnit(1);
    }

    public /* bridge */ /* synthetic */ void setStepSize(float f10) {
        super.setStepSize(f10);
    }

    public /* bridge */ /* synthetic */ void setThumbElevation(float f10) {
        super.setThumbElevation(f10);
    }

    public /* bridge */ /* synthetic */ void setThumbElevationResource(@p int i10) {
        super.setThumbElevationResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbRadius(@q @e0(from = 0) int i10) {
        super.setThumbRadius(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@p int i10) {
        super.setThumbRadiusResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@o0 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@d.n int i10) {
        super.setThumbStrokeColorResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f10) {
        super.setThumbStrokeWidth(f10);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@p int i10) {
        super.setThumbStrokeWidthResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbTintList(@m0 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickActiveTintList(@m0 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@m0 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickTintList(@m0 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickVisible(boolean z10) {
        super.setTickVisible(z10);
    }

    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@m0 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackHeight(@q @e0(from = 0) int i10) {
        super.setTrackHeight(i10);
    }

    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@m0 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackTintList(@m0 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setValueFrom(float f10) {
        super.setValueFrom(f10);
    }

    public /* bridge */ /* synthetic */ void setValueTo(float f10) {
        super.setValueTo(f10);
    }

    public void setValues(@m0 List<Float> list) {
        super.setValues(list);
    }

    public void setValues(@m0 Float... fArr) {
        super.setValues(fArr);
    }
}
