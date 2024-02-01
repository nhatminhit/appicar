package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.o;
import d.b0;
import d.m0;
import d.o0;
import i9.a;

@l9.a
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16660a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final String f16661b = "BadgeUtils";

    /* renamed from: com.google.android.material.badge.a$a  reason: collision with other inner class name */
    public static class C0274a implements Runnable {
        public final /* synthetic */ Toolbar O;
        public final /* synthetic */ int P;
        public final /* synthetic */ BadgeDrawable Q;
        public final /* synthetic */ FrameLayout R;

        public C0274a(Toolbar toolbar, int i10, BadgeDrawable badgeDrawable, FrameLayout frameLayout) {
            this.O = toolbar;
            this.P = i10;
            this.Q = badgeDrawable;
            this.R = frameLayout;
        }

        public void run() {
            ActionMenuItemView a10 = o.a(this.O, this.P);
            if (a10 != null) {
                BadgeDrawable badgeDrawable = this.Q;
                badgeDrawable.D(badgeDrawable.o() + this.O.getResources().getDimensionPixelOffset(a.f.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
                BadgeDrawable badgeDrawable2 = this.Q;
                badgeDrawable2.I(badgeDrawable2.s() + this.O.getResources().getDimensionPixelOffset(a.f.mtrl_badge_toolbar_action_menu_item_vertical_offset));
                a.b(this.Q, a10, this.R);
            }
        }
    }

    public static void a(@m0 BadgeDrawable badgeDrawable, @m0 View view) {
        b(badgeDrawable, view, (FrameLayout) null);
    }

    public static void b(@m0 BadgeDrawable badgeDrawable, @m0 View view, @o0 FrameLayout frameLayout) {
        i(badgeDrawable, view, frameLayout);
        if (badgeDrawable.n() != null) {
            badgeDrawable.n().setForeground(badgeDrawable);
        } else if (!f16660a) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void c(@m0 BadgeDrawable badgeDrawable, @m0 Toolbar toolbar, @b0 int i10) {
        d(badgeDrawable, toolbar, i10, (FrameLayout) null);
    }

    public static void d(@m0 BadgeDrawable badgeDrawable, @m0 Toolbar toolbar, @b0 int i10, @o0 FrameLayout frameLayout) {
        toolbar.post(new C0274a(toolbar, i10, badgeDrawable, frameLayout));
    }

    @m0
    public static SparseArray<BadgeDrawable> e(Context context, @m0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        int i10 = 0;
        while (i10 < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i10);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i10);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.g(context, savedState));
                i10++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @m0
    public static ParcelableSparseArray f(@m0 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i10 = 0;
        while (i10 < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i10);
            BadgeDrawable valueAt = sparseArray.valueAt(i10);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.r());
                i10++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    public static void g(@o0 BadgeDrawable badgeDrawable, @m0 View view) {
        if (badgeDrawable != null) {
            if (f16660a || badgeDrawable.n() != null) {
                badgeDrawable.n().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(badgeDrawable);
            }
        }
    }

    public static void h(@o0 BadgeDrawable badgeDrawable, @m0 Toolbar toolbar, @b0 int i10) {
        if (badgeDrawable != null) {
            ActionMenuItemView a10 = o.a(toolbar, i10);
            if (a10 != null) {
                g(badgeDrawable, a10);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to remove badge from a null menuItemView: ");
            sb2.append(i10);
        }
    }

    public static void i(@m0 BadgeDrawable badgeDrawable, @m0 View view, @o0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.O(view, frameLayout);
    }

    public static void j(@m0 Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
