package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import d.m0;
import d.t0;

@t0(18)
public class t implements u {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f17262a;

    public t(@m0 View view) {
        this.f17262a = view.getOverlay();
    }

    public void a(@m0 Drawable drawable) {
        this.f17262a.add(drawable);
    }

    public void b(@m0 Drawable drawable) {
        this.f17262a.remove(drawable);
    }
}
