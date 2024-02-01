package com.google.android.material.internal;

import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import d.b0;
import d.m0;
import d.o0;
import d.x0;

@x0({x0.a.LIBRARY})
public class o {
    @o0
    public static ActionMenuItemView a(@m0 Toolbar toolbar, @b0 int i10) {
        ActionMenuView b10 = b(toolbar);
        if (b10 == null) {
            return null;
        }
        for (int i11 = 0; i11 < b10.getChildCount(); i11++) {
            View childAt = b10.getChildAt(i11);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i10) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @o0
    public static ActionMenuView b(@m0 Toolbar toolbar) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @o0
    public static ImageButton c(@m0 Toolbar toolbar) {
        if (toolbar.getChildCount() <= 0) {
            return null;
        }
        View childAt = toolbar.getChildAt(0);
        if (childAt instanceof ImageButton) {
            return (ImageButton) childAt;
        }
        return null;
    }

    @o0
    public static View d(@m0 Toolbar toolbar) {
        ActionMenuView b10 = b(toolbar);
        if (b10 == null || b10.getChildCount() <= 1) {
            return null;
        }
        return b10.getChildAt(0);
    }
}
