package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import d.m0;
import d.t0;

@t0(18)
public class q implements r {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f17260a;

    public q(@m0 ViewGroup viewGroup) {
        this.f17260a = viewGroup.getOverlay();
    }

    public void a(@m0 Drawable drawable) {
        this.f17260a.add(drawable);
    }

    public void b(@m0 Drawable drawable) {
        this.f17260a.remove(drawable);
    }

    public void c(@m0 View view) {
        this.f17260a.add(view);
    }

    public void d(@m0 View view) {
        this.f17260a.remove(view);
    }
}
