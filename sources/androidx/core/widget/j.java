package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import d.m0;
import d.o0;

public class j {
    @o0
    public static ColorStateList a(@m0 ImageView imageView) {
        return imageView.getImageTintList();
    }

    @o0
    public static PorterDuff.Mode b(@m0 ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(@m0 ImageView imageView, @o0 ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(@m0 ImageView imageView, @o0 PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
