package q4;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import d.o0;

public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public q(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    public void x(@o0 T t10) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.P).getLayoutParams();
        Drawable z10 = z(t10);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            z10 = new i(z10, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.P).setImageDrawable(z10);
    }

    public abstract Drawable z(T t10);
}
