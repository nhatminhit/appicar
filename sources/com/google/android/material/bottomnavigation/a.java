package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public final class a extends e {
    public static final int Q = 5;

    public a(Context context) {
        super(context);
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            m0();
            MenuItem a10 = super.a(i10, i11, i12, charSequence);
            if (a10 instanceof h) {
                ((h) a10).w(true);
            }
            l0();
            return a10;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @m0
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
