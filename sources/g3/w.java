package g3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import d.m0;
import d.o0;
import d.t0;
import java.lang.reflect.Field;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f7892a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Field f7893b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7894c;

    public static void a(@m0 ImageView imageView, @o0 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            c(imageView, matrix);
        }
    }

    public static void b() {
        if (!f7894c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f7893b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7894c = true;
        }
    }

    @t0(21)
    @SuppressLint({"NewApi"})
    public static void c(@m0 ImageView imageView, @o0 Matrix matrix) {
        if (f7892a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f7892a = false;
            }
        }
    }
}
