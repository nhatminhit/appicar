package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import d.m0;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f17590a;

    /* renamed from: b  reason: collision with root package name */
    public Context f17591b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f17592c;

    public e(@m0 TextInputLayout textInputLayout) {
        this.f17590a = textInputLayout;
        this.f17591b = textInputLayout.getContext();
        this.f17592c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }

    public boolean d() {
        return false;
    }
}
