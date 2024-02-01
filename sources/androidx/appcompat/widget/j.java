package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import o0.q;

public class j {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1341c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1342a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1343b;

    public j(ProgressBar progressBar) {
        this.f1342a = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    public Bitmap b() {
        return this.f1343b;
    }

    public void c(AttributeSet attributeSet, int i10) {
        w0 G = w0.G(this.f1342a.getContext(), attributeSet, f1341c, i10, 0);
        Drawable i11 = G.i(0);
        if (i11 != null) {
            this.f1342a.setIndeterminateDrawable(e(i11));
        }
        Drawable i12 = G.i(1);
        if (i12 != null) {
            this.f1342a.setProgressDrawable(d(i12, false));
        }
        G.I();
    }

    public final Drawable d(Drawable drawable, boolean z10) {
        if (drawable instanceof q) {
            q qVar = (q) drawable;
            Drawable b10 = qVar.b();
            if (b10 != null) {
                qVar.a(d(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                drawableArr[i10] = d(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1343b == null) {
                this.f1343b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i10 = 0; i10 < numberOfFrames; i10++) {
            Drawable d10 = d(animationDrawable.getFrame(i10), true);
            d10.setLevel(10000);
            animationDrawable2.addFrame(d10, animationDrawable.getDuration(i10));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
