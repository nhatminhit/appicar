package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import d.m0;
import d.o0;
import d.t0;
import d.v;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.l;
import pl.droidsonroids.gif.m;
import pl.droidsonroids.gif.r;

public class GifTextureView extends TextureView {
    public static final ImageView.ScaleType[] U = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public ImageView.ScaleType O = ImageView.ScaleType.FIT_CENTER;
    public final Matrix P = new Matrix();
    public m Q;
    public c R;
    public float S = 1.0f;
    public l.b T;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22101a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22101a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22101a     // Catch:{ NoSuchFieldError -> 0x0060 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.GifTextureView.a.<clinit>():void");
        }
    }

    public interface b {
        void a(Canvas canvas);
    }

    public static class c extends Thread implements TextureView.SurfaceTextureListener {
        public final c O = new c();
        public GifInfoHandle P = new GifInfoHandle();
        public IOException Q;
        public long[] R;
        public final WeakReference<GifTextureView> S;

        public class a implements Runnable {
            public final /* synthetic */ GifTextureView O;

            public a(GifTextureView gifTextureView) {
                this.O = gifTextureView;
            }

            public void run() {
                this.O.i(c.this.P);
            }
        }

        public c(GifTextureView gifTextureView) {
            super("GifRenderThread");
            this.S = new WeakReference<>(gifTextureView);
        }

        public void c(@m0 GifTextureView gifTextureView, @o0 b bVar) {
            this.O.b();
            gifTextureView.setSuperSurfaceTextureListener(bVar != null ? new q(bVar) : null);
            this.P.z();
            interrupt();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            GifTextureView gifTextureView = this.S.get();
            if (gifTextureView != null) {
                gifTextureView.i(this.P);
            }
            this.O.c();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.O.b();
            this.P.z();
            interrupt();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void run() {
            try {
                GifTextureView gifTextureView = this.S.get();
                if (gifTextureView != null) {
                    GifInfoHandle c10 = gifTextureView.Q.c();
                    this.P = c10;
                    c10.K(1, gifTextureView.isOpaque());
                    if (gifTextureView.T.f22140b >= 0) {
                        this.P.J(gifTextureView.T.f22140b);
                    }
                    GifTextureView gifTextureView2 = this.S.get();
                    if (gifTextureView2 == null) {
                        this.P.A();
                        return;
                    }
                    gifTextureView2.setSuperSurfaceTextureListener(this);
                    boolean isAvailable = gifTextureView2.isAvailable();
                    this.O.d(isAvailable);
                    if (isAvailable) {
                        gifTextureView2.post(new a(gifTextureView2));
                    }
                    this.P.L(gifTextureView2.S);
                    while (!isInterrupted()) {
                        try {
                            this.O.a();
                            GifTextureView gifTextureView3 = this.S.get();
                            if (gifTextureView3 == null) {
                                break;
                            }
                            SurfaceTexture surfaceTexture = gifTextureView3.getSurfaceTexture();
                            if (surfaceTexture != null) {
                                Surface surface = new Surface(surfaceTexture);
                                try {
                                    this.P.a(surface, this.R);
                                } finally {
                                    surface.release();
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    this.P.A();
                    this.P = new GifInfoHandle();
                }
            } catch (IOException e10) {
                this.Q = e10;
            }
        }
    }

    public GifTextureView(Context context) {
        super(context);
        g((AttributeSet) null, 0, 0);
    }

    public GifTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(attributeSet, 0, 0);
    }

    public GifTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g(attributeSet, i10, 0);
    }

    @t0(21)
    public GifTextureView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        g(attributeSet, i10, i11);
    }

    public static m f(TypedArray typedArray) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(r.b.GifTextureView_gifSource, typedValue)) {
            return null;
        }
        if (typedValue.resourceId != 0) {
            String resourceTypeName = typedArray.getResources().getResourceTypeName(typedValue.resourceId);
            if (l.f22136b.contains(resourceTypeName)) {
                return new m.i(typedArray.getResources(), typedValue.resourceId);
            }
            if (!"string".equals(resourceTypeName)) {
                throw new IllegalArgumentException("Expected string, drawable, mipmap or raw resource type. '" + resourceTypeName + "' is not supported");
            }
        }
        return new m.c(typedArray.getResources().getAssets(), typedValue.string.toString());
    }

    /* access modifiers changed from: private */
    public void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    public final void g(AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = U;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.O = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b.GifTextureView, i10, i11);
            this.Q = f(obtainStyledAttributes);
            super.setOpaque(obtainStyledAttributes.getBoolean(r.b.GifTextureView_isOpaque, false));
            obtainStyledAttributes.recycle();
            this.T = new l.b(this, attributeSet, i10, i11);
        } else {
            super.setOpaque(false);
            this.T = new l.b();
        }
        if (!isInEditMode()) {
            c cVar = new c(this);
            this.R = cVar;
            if (this.Q != null) {
                cVar.start();
            }
        }
    }

    @o0
    public IOException getIOException() {
        return this.R.Q != null ? this.R.Q : GifIOException.a(this.R.P.l());
    }

    public ImageView.ScaleType getScaleType() {
        return this.O;
    }

    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.P);
        return matrix;
    }

    public synchronized void h(@o0 m mVar, @o0 b bVar) {
        this.R.c(this, bVar);
        try {
            this.R.join();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        this.Q = mVar;
        c cVar = new c(this);
        this.R = cVar;
        if (mVar != null) {
            cVar.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        r0.setScale(r3 * r8, r8 * r4, r1 / 2.0f, r2 / 2.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        super.setTransform(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0051, code lost:
        r0.setRectToRect(r5, r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r0.preScale(r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(pl.droidsonroids.gif.GifInfoHandle r11) {
        /*
            r10 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r10.getWidth()
            float r1 = (float) r1
            int r2 = r10.getHeight()
            float r2 = (float) r2
            int r3 = r11.q()
            float r3 = (float) r3
            float r3 = r3 / r1
            int r4 = r11.i()
            float r4 = (float) r4
            float r4 = r4 / r2
            android.graphics.RectF r5 = new android.graphics.RectF
            int r6 = r11.q()
            float r6 = (float) r6
            int r7 = r11.i()
            float r7 = (float) r7
            r8 = 0
            r5.<init>(r8, r8, r6, r7)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r8, r8, r1, r2)
            int[] r7 = pl.droidsonroids.gif.GifTextureView.a.f22101a
            android.widget.ImageView$ScaleType r8 = r10.O
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L_0x0080;
                case 2: goto L_0x0073;
                case 3: goto L_0x0058;
                case 4: goto L_0x004f;
                case 5: goto L_0x004c;
                case 6: goto L_0x0049;
                case 7: goto L_0x0048;
                case 8: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0085
        L_0x0042:
            android.graphics.Matrix r11 = r10.P
            r0.set(r11)
            goto L_0x0054
        L_0x0048:
            return
        L_0x0049:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.START
            goto L_0x0051
        L_0x004c:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.END
            goto L_0x0051
        L_0x004f:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.CENTER
        L_0x0051:
            r0.setRectToRect(r5, r6, r11)
        L_0x0054:
            r0.preScale(r3, r4)
            goto L_0x0085
        L_0x0058:
            int r5 = r11.q()
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x006b
            int r11 = r11.i()
            float r11 = (float) r11
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x006b
            goto L_0x0078
        L_0x006b:
            float r11 = r8 / r3
            float r8 = r8 / r4
            float r8 = java.lang.Math.min(r11, r8)
            goto L_0x0078
        L_0x0073:
            float r11 = java.lang.Math.min(r3, r4)
            float r8 = r8 / r11
        L_0x0078:
            float r3 = r3 * r8
            float r8 = r8 * r4
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r8, r1, r2)
            goto L_0x0085
        L_0x0080:
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r4, r1, r2)
        L_0x0085:
            super.setTransform(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.GifTextureView.i(pl.droidsonroids.gif.GifInfoHandle):void");
    }

    public void onDetachedFromWindow() {
        this.R.c(this, (b) null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        this.R.R = gifViewSavedState.O[0];
    }

    public Parcelable onSaveInstanceState() {
        c cVar = this.R;
        cVar.R = cVar.P.o();
        return new GifViewSavedState(super.onSaveInstanceState(), this.T.f22139a ? this.R.R : null);
    }

    public void setFreezesAnimation(boolean z10) {
        this.T.f22139a = z10;
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public synchronized void setInputSource(@o0 m mVar) {
        h(mVar, (b) null);
    }

    public void setOpaque(boolean z10) {
        if (z10 != isOpaque()) {
            super.setOpaque(z10);
            setInputSource(this.Q);
        }
    }

    public void setScaleType(@m0 ImageView.ScaleType scaleType) {
        this.O = scaleType;
        i(this.R.P);
    }

    public void setSpeed(@v(from = 0.0d, fromInclusive = false) float f10) {
        this.S = f10;
        this.R.P.L(f10);
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    public void setTransform(Matrix matrix) {
        this.P.set(matrix);
        i(this.R.P);
    }
}
