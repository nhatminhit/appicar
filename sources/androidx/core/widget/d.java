package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import d.m0;
import d.o0;
import java.lang.reflect.Field;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2290a = "CompoundButtonCompat";

    /* renamed from: b  reason: collision with root package name */
    public static Field f2291b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2292c;

    @o0
    public static Drawable a(@m0 CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    @o0
    public static ColorStateList b(@m0 CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    @o0
    public static PorterDuff.Mode c(@m0 CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void d(@m0 CompoundButton compoundButton, @o0 ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void e(@m0 CompoundButton compoundButton, @o0 PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
