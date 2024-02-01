package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.e;
import d.t0;

public class ImageFilterButton extends AppCompatImageButton {
    public ImageFilterView.c Q = new ImageFilterView.c();
    public float R = 0.0f;
    public float S = 0.0f;
    public float T = Float.NaN;
    public Path U;
    public ViewOutlineProvider V;
    public RectF W;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable[] f1738a0;

    /* renamed from: b0  reason: collision with root package name */
    public LayerDrawable f1739b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1740c0 = true;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.S) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.T);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        c(context, (AttributeSet) null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet);
    }

    private void setOverlay(boolean z10) {
        this.f1740c0 = z10;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(e.m.ImageFilterView_altSrc);
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ImageFilterView_crossfade) {
                    this.R = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f1740c0));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f1738a0 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f1738a0[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f1738a0);
                this.f1739b0 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.R * 255.0f));
                super.setImageDrawable(this.f1739b0);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.Q.f1753f;
    }

    public float getCrossfade() {
        return this.R;
    }

    public float getRound() {
        return this.T;
    }

    public float getRoundPercent() {
        return this.S;
    }

    public float getSaturation() {
        return this.Q.f1752e;
    }

    public float getWarmth() {
        return this.Q.f1754g;
    }

    public void setBrightness(float f10) {
        ImageFilterView.c cVar = this.Q;
        cVar.f1751d = f10;
        cVar.c(this);
    }

    public void setContrast(float f10) {
        ImageFilterView.c cVar = this.Q;
        cVar.f1753f = f10;
        cVar.c(this);
    }

    public void setCrossfade(float f10) {
        this.R = f10;
        if (this.f1738a0 != null) {
            if (!this.f1740c0) {
                this.f1739b0.getDrawable(0).setAlpha((int) ((1.0f - this.R) * 255.0f));
            }
            this.f1739b0.getDrawable(1).setAlpha((int) (this.R * 255.0f));
            super.setImageDrawable(this.f1739b0);
        }
    }

    @t0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.T = f10;
            float f11 = this.S;
            this.S = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.T != f10;
        this.T = f10;
        if (f10 != 0.0f) {
            if (this.U == null) {
                this.U = new Path();
            }
            if (this.W == null) {
                this.W = new RectF();
            }
            if (this.V == null) {
                b bVar = new b();
                this.V = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.W.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.U.reset();
            Path path = this.U;
            RectF rectF = this.W;
            float f12 = this.T;
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
        boolean z10 = this.S != f10;
        this.S = f10;
        if (f10 != 0.0f) {
            if (this.U == null) {
                this.U = new Path();
            }
            if (this.W == null) {
                this.W = new RectF();
            }
            if (this.V == null) {
                a aVar = new a();
                this.V = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.S) / 2.0f;
            this.W.set(0.0f, 0.0f, (float) width, (float) height);
            this.U.reset();
            this.U.addRoundRect(this.W, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f10) {
        ImageFilterView.c cVar = this.Q;
        cVar.f1752e = f10;
        cVar.c(this);
    }

    public void setWarmth(float f10) {
        ImageFilterView.c cVar = this.Q;
        cVar.f1754g = f10;
        cVar.c(this);
    }
}
