package q4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class d extends q<Bitmap> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public d(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* renamed from: A */
    public Drawable z(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.P).getResources(), bitmap);
    }
}
