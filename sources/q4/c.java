package q4;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class c extends j<Bitmap> {
    public c(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public c(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    /* renamed from: z */
    public void x(Bitmap bitmap) {
        ((ImageView) this.P).setImageBitmap(bitmap);
    }
}
