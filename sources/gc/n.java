package gc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import gc.v;

public class n extends a<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    public e f19100m;

    public n(v vVar, ImageView imageView, z zVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj, e eVar, boolean z10) {
        super(vVar, imageView, zVar, i10, i11, i12, drawable, str, obj, z10);
        this.f19100m = eVar;
    }

    public void a() {
        super.a();
        if (this.f19100m != null) {
            this.f19100m = null;
        }
    }

    public void b(Bitmap bitmap, v.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f18947c.get();
            if (imageView != null) {
                v vVar = this.f18945a;
                Bitmap bitmap2 = bitmap;
                v.e eVar2 = eVar;
                w.c(imageView, vVar.f19122e, bitmap2, eVar2, this.f18948d, vVar.f19130m);
                e eVar3 = this.f19100m;
                if (eVar3 != null) {
                    eVar3.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public void c() {
        ImageView imageView = (ImageView) this.f18947c.get();
        if (imageView != null) {
            int i10 = this.f18951g;
            if (i10 != 0) {
                imageView.setImageResource(i10);
            } else {
                Drawable drawable = this.f18952h;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            e eVar = this.f19100m;
            if (eVar != null) {
                eVar.a();
            }
        }
    }
}
