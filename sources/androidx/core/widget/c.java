package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import d.m0;
import d.o0;
import d.t0;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2287a = "CheckedTextViewCompat";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f2288a;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f2289b;

        @o0
        public static Drawable a(@m0 CheckedTextView checkedTextView) {
            if (!f2289b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f2288a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f2289b = true;
            }
            Field field = f2288a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException unused2) {
                    f2288a = null;
                }
            }
            return null;
        }
    }

    @t0(16)
    public static class b {
        @o0
        public static Drawable a(@m0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    @t0(21)
    /* renamed from: androidx.core.widget.c$c  reason: collision with other inner class name */
    public static class C0033c {
        @o0
        public static ColorStateList a(@m0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @o0
        public static PorterDuff.Mode b(@m0 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void c(@m0 CheckedTextView checkedTextView, @o0 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void d(@m0 CheckedTextView checkedTextView, @o0 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @o0
    public static Drawable a(@m0 CheckedTextView checkedTextView) {
        return b.a(checkedTextView);
    }

    @o0
    public static ColorStateList b(@m0 CheckedTextView checkedTextView) {
        return C0033c.a(checkedTextView);
    }

    @o0
    public static PorterDuff.Mode c(@m0 CheckedTextView checkedTextView) {
        return C0033c.b(checkedTextView);
    }

    public static void d(@m0 CheckedTextView checkedTextView, @o0 ColorStateList colorStateList) {
        C0033c.c(checkedTextView, colorStateList);
    }

    public static void e(@m0 CheckedTextView checkedTextView, @o0 PorterDuff.Mode mode) {
        C0033c.d(checkedTextView, mode);
    }
}
