package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import d.e0;
import d.m0;
import d.n;
import d.o0;
import d.p;
import d.q;
import i9.a;

public class Slider extends BaseSlider<Slider, a, b> {

    public interface a extends a<Slider> {
    }

    public interface b extends b<Slider> {
    }

    public Slider(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public Slider(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.sliderStyle);
    }

    public Slider(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842788});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    public /* bridge */ /* synthetic */ boolean L() {
        return super.L();
    }

    public boolean Y() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
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

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
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

    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@n int i10) {
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

    public void setValue(float f10) {
        setValues(Float.valueOf(f10));
    }

    public /* bridge */ /* synthetic */ void setValueFrom(float f10) {
        super.setValueFrom(f10);
    }

    public /* bridge */ /* synthetic */ void setValueTo(float f10) {
        super.setValueTo(f10);
    }
}
