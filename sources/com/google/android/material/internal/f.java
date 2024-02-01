package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class f extends e {
    public f(Context context) {
        super(context);
    }

    @m0
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVar = (h) a(i10, i11, i12, charSequence);
        h hVar2 = new h(x(), this, hVar);
        hVar.A(hVar2);
        return hVar2;
    }
}
