package n1;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @g(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
public class p {
    @d({"android:src"})
    public static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }

    @d({"android:src"})
    public static void b(ImageView imageView, Uri uri) {
        imageView.setImageURI(uri);
    }

    @d({"android:src"})
    public static void c(ImageView imageView, String str) {
        imageView.setImageURI(str == null ? null : Uri.parse(str));
    }
}
