package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.e;
import d.t0;

public class ImageFilterView extends AppCompatImageView {
    public c Q = new c();
    public boolean R = true;
    public float S = 0.0f;
    public float T = 0.0f;
    public float U = Float.NaN;
    public Path V;
    public ViewOutlineProvider W;

    /* renamed from: a0  reason: collision with root package name */
    public RectF f1743a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable[] f1744b0;

    /* renamed from: c0  reason: collision with root package name */
    public LayerDrawable f1745c0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.T) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.U);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float[] f1748a = new float[20];

        /* renamed from: b  reason: collision with root package name */
        public ColorMatrix f1749b = new ColorMatrix();

        /* renamed from: c  reason: collision with root package name */
        public ColorMatrix f1750c = new ColorMatrix();

        /* renamed from: d  reason: collision with root package name */
        public float f1751d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1752e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1753f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1754g = 1.0f;

        public final void a(float f10) {
            float[] fArr = this.f1748a;
            fArr[0] = f10;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f10;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public final void b(float f10) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            float[] fArr = this.f1748a;
            fArr[0] = f12 + f10;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView imageView) {
            boolean z10;
            this.f1749b.reset();
            float f10 = this.f1752e;
            boolean z11 = true;
            if (f10 != 1.0f) {
                b(f10);
                this.f1749b.set(this.f1748a);
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = this.f1753f;
            if (f11 != 1.0f) {
                this.f1750c.setScale(f11, f11, f11, 1.0f);
                this.f1749b.postConcat(this.f1750c);
                z10 = true;
            }
            float f12 = this.f1754g;
            if (f12 != 1.0f) {
                d(f12);
                this.f1750c.set(this.f1748a);
                this.f1749b.postConcat(this.f1750c);
                z10 = true;
            }
            float f13 = this.f1751d;
            if (f13 != 1.0f) {
                a(f13);
                this.f1750c.set(this.f1748a);
                this.f1749b.postConcat(this.f1750c);
            } else {
                z11 = z10;
            }
            if (z11) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f1749b));
            } else {
                imageView.clearColorFilter();
            }
        }

        public final void d(float f10) {
            float f11;
            float f12;
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f13 = (5000.0f / f10) / 100.0f;
            if (f13 > 66.0f) {
                double d10 = (double) (f13 - 60.0f);
                f12 = ((float) Math.pow(d10, -0.13320475816726685d)) * 329.69873f;
                f11 = ((float) Math.pow(d10, 0.07551484555006027d)) * 288.12216f;
            } else {
                f11 = (((float) Math.log((double) f13)) * 99.4708f) - 161.11957f;
                f12 = 255.0f;
            }
            float log = f13 < 66.0f ? f13 > 19.0f ? (((float) Math.log((double) (f13 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f12, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f11, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f1748a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        e(context, (AttributeSet) null);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e(context, attributeSet);
    }

    private void setOverlay(boolean z10) {
        this.R = z10;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(e.m.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ImageFilterView_crossfade) {
                    this.S = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == e.m.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == e.m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == e.m.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.R));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f1744b0 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f1744b0[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f1744b0);
                this.f1745c0 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.S * 255.0f));
                super.setImageDrawable(this.f1745c0);
            }
        }
    }

    public float getBrightness() {
        return this.Q.f1751d;
    }

    public float getContrast() {
        return this.Q.f1753f;
    }

    public float getCrossfade() {
        return this.S;
    }

    public float getRound() {
        return this.U;
    }

    public float getRoundPercent() {
        return this.T;
    }

    public float getSaturation() {
        return this.Q.f1752e;
    }

    public float getWarmth() {
        return this.Q.f1754g;
    }

    public void setBrightness(float f10) {
        c cVar = this.Q;
        cVar.f1751d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        c cVar = this.Q;
        cVar.f1753f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.S = f10;
        if (this.f1744b0 != null) {
            if (!this.R) {
                this.f1745c0.getDrawable(0).setAlpha((int) ((1.0f - this.S) * 255.0f));
            }
            this.f1745c0.getDrawable(1).setAlpha((int) (this.S * 255.0f));
            super.setImageDrawable(this.f1745c0);
        }
    }

    @t0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.U = f10;
            float f11 = this.T;
            this.T = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.U != f10;
        this.U = f10;
        if (f10 != 0.0f) {
            if (this.V == null) {
                this.V = new Path();
            }
            if (this.f1743a0 == null) {
                this.f1743a0 = new RectF();
            }
            if (this.W == null) {
                b bVar = new b();
                this.W = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1743a0.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.V.reset();
            Path path = this.V;
            RectF rectF = this.f1743a0;
            float f12 = this.U;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @t0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.T != f10;
        this.T = f10;
        if (f10 != 0.0f) {
            if (this.V == null) {
                this.V = new Path();
            }
            if (this.f1743a0 == null) {
                this.f1743a0 = new RectF();
            }
            if (this.W == null) {
                a aVar = new a();
                this.W = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.T) / 2.0f;
            this.f1743a0.set(0.0f, 0.0f, (float) width, (float) height);
            this.V.reset();
            this.V.addRoundRect(this.f1743a0, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        c cVar = this.Q;
        cVar.f1752e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        c cVar = this.Q;
        cVar.f1754g = f10;
        cVar.c(this);
    }
}
