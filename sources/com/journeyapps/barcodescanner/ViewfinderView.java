package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.CameraPreview;
import java.util.ArrayList;
import java.util.List;
import qa.t;
import va.l;
import yb.x;

public class ViewfinderView extends View {

    /* renamed from: e0  reason: collision with root package name */
    public static final String f17726e0 = ViewfinderView.class.getSimpleName();

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f17727f0 = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: g0  reason: collision with root package name */
    public static final long f17728g0 = 80;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f17729h0 = 160;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f17730i0 = 20;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f17731j0 = 6;
    public final Paint O = new Paint(1);
    public Bitmap P;
    public int Q;
    public final int R;
    public final int S;
    public final int T;
    public boolean U;
    public int V;
    public List<t> W;

    /* renamed from: a0  reason: collision with root package name */
    public List<t> f17732a0;

    /* renamed from: b0  reason: collision with root package name */
    public CameraPreview f17733b0;

    /* renamed from: c0  reason: collision with root package name */
    public Rect f17734c0;

    /* renamed from: d0  reason: collision with root package name */
    public x f17735d0;

    public class a implements CameraPreview.f {
        public a() {
        }

        public void a() {
            ViewfinderView.this.d();
            ViewfinderView.this.invalidate();
        }

        public void b(Exception exc) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.m.zxing_finder);
        this.Q = obtainStyledAttributes.getColor(l.m.zxing_finder_zxing_viewfinder_mask, resources.getColor(l.d.zxing_viewfinder_mask));
        this.R = obtainStyledAttributes.getColor(l.m.zxing_finder_zxing_result_view, resources.getColor(l.d.zxing_result_view));
        this.S = obtainStyledAttributes.getColor(l.m.zxing_finder_zxing_viewfinder_laser, resources.getColor(l.d.zxing_viewfinder_laser));
        this.T = obtainStyledAttributes.getColor(l.m.zxing_finder_zxing_possible_result_points, resources.getColor(l.d.zxing_possible_result_points));
        this.U = obtainStyledAttributes.getBoolean(l.m.zxing_finder_zxing_viewfinder_laser_visibility, true);
        obtainStyledAttributes.recycle();
        this.V = 0;
        this.W = new ArrayList(20);
        this.f17732a0 = new ArrayList(20);
    }

    public void a(t tVar) {
        if (this.W.size() < 20) {
            this.W.add(tVar);
        }
    }

    public void b(Bitmap bitmap) {
        this.P = bitmap;
        invalidate();
    }

    public void c() {
        Bitmap bitmap = this.P;
        this.P = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    public void d() {
        CameraPreview cameraPreview = this.f17733b0;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            x previewSize = this.f17733b0.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f17734c0 = framingRect;
                this.f17735d0 = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        x xVar;
        d();
        Rect rect = this.f17734c0;
        if (rect != null && (xVar = this.f17735d0) != null) {
            int width = getWidth();
            int height = getHeight();
            this.O.setColor(this.P != null ? this.R : this.Q);
            float f10 = (float) width;
            canvas.drawRect(0.0f, 0.0f, f10, (float) rect.top, this.O);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.O);
            float f11 = f10;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f11, (float) (rect.bottom + 1), this.O);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f11, (float) height, this.O);
            if (this.P != null) {
                this.O.setAlpha(160);
                canvas.drawBitmap(this.P, (Rect) null, rect, this.O);
                return;
            }
            if (this.U) {
                this.O.setColor(this.S);
                Paint paint = this.O;
                int[] iArr = f17727f0;
                paint.setAlpha(iArr[this.V]);
                this.V = (this.V + 1) % iArr.length;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.O);
            }
            float width2 = ((float) getWidth()) / ((float) xVar.O);
            float height3 = ((float) getHeight()) / ((float) xVar.P);
            if (!this.f17732a0.isEmpty()) {
                this.O.setAlpha(80);
                this.O.setColor(this.T);
                for (t next : this.f17732a0) {
                    canvas.drawCircle((float) ((int) (next.c() * width2)), (float) ((int) (next.d() * height3)), 3.0f, this.O);
                }
                this.f17732a0.clear();
            }
            if (!this.W.isEmpty()) {
                this.O.setAlpha(160);
                this.O.setColor(this.T);
                for (t next2 : this.W) {
                    canvas.drawCircle((float) ((int) (next2.c() * width2)), (float) ((int) (next2.d() * height3)), 6.0f, this.O);
                }
                List<t> list = this.W;
                List<t> list2 = this.f17732a0;
                this.W = list2;
                this.f17732a0 = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f17733b0 = cameraPreview;
        cameraPreview.i(new a());
    }

    public void setLaserVisibility(boolean z10) {
        this.U = z10;
    }

    public void setMaskColor(int i10) {
        this.Q = i10;
    }
}
