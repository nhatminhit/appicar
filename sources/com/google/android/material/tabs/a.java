package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.v;
import com.google.android.material.tabs.TabLayout;
import d.m0;
import d.o0;
import d.q;

public class a {
    @q(unit = 0)

    /* renamed from: a  reason: collision with root package name */
    public static final int f17479a = 24;

    public static RectF a(TabLayout tabLayout, @o0 View view) {
        return view == null ? new RectF() : (tabLayout.C() || !(view instanceof TabLayout.TabView)) ? new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom()) : b((TabLayout.TabView) view, 24);
    }

    public static RectF b(@m0 TabLayout.TabView tabView, @q(unit = 0) int i10) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int e10 = (int) v.e(tabView.getContext(), i10);
        if (contentWidth < e10) {
            contentWidth = e10;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i11 = contentWidth / 2;
        return new RectF((float) (left - i11), (float) (top - (contentHeight / 2)), (float) (i11 + left), (float) (top + (left / 2)));
    }

    public void c(TabLayout tabLayout, View view, View view2, @d.v(from = 0.0d, to = 1.0d) float f10, @m0 Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(j9.a.c((int) a10.left, (int) a11.left, f10), drawable.getBounds().top, j9.a.c((int) a10.right, (int) a11.right, f10), drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, @m0 Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
    }
}
