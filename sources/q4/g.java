package q4;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import d.o0;

public class g extends j<Drawable> {
    public g(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public g(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* renamed from: z */
    public void x(@o0 Drawable drawable) {
        ((ImageView) this.P).setImageDrawable(drawable);
    }
}
