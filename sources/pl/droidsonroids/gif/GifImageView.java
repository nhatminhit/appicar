package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import d.t0;
import pl.droidsonroids.gif.l;

public class GifImageView extends ImageView {
    public boolean O;

    public GifImageView(Context context) {
        super(context);
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(l.c(this, attributeSet, 0, 0));
    }

    public GifImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(l.c(this, attributeSet, i10, 0));
    }

    @t0(21)
    public GifImageView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(l.c(this, attributeSet, i10, i11));
    }

    public final void a(l.a aVar) {
        this.O = aVar.f22139a;
        int i10 = aVar.f22137c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = aVar.f22138d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        gifViewSavedState.a(getDrawable(), 0);
        gifViewSavedState.a(getBackground(), 1);
    }

    public Parcelable onSaveInstanceState() {
        Drawable drawable = null;
        Drawable drawable2 = this.O ? getDrawable() : null;
        if (this.O) {
            drawable = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawable2, drawable);
    }

    public void setBackgroundResource(int i10) {
        if (!l.e(this, false, i10)) {
            super.setBackgroundResource(i10);
        }
    }

    public void setFreezesAnimation(boolean z10) {
        this.O = z10;
    }

    public void setImageResource(int i10) {
        if (!l.e(this, true, i10)) {
            super.setImageResource(i10);
        }
    }

    public void setImageURI(Uri uri) {
        if (!l.d(this, uri)) {
            super.setImageURI(uri);
        }
    }
}
