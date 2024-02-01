package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import va.l;
import yb.s;
import yb.t;
import yb.x;
import yb.z;
import zb.h;
import zb.j;
import zb.k;
import zb.n;
import zb.o;
import zb.p;
import zb.q;

public class CameraPreview extends ViewGroup {

    /* renamed from: r0  reason: collision with root package name */
    public static final String f17703r0 = CameraPreview.class.getSimpleName();

    /* renamed from: s0  reason: collision with root package name */
    public static final int f17704s0 = 250;
    public h O;
    public WindowManager P;
    public Handler Q;
    public boolean R = false;
    public SurfaceView S;
    public TextureView T;
    public boolean U = false;
    public t V;
    public int W = -1;

    /* renamed from: a0  reason: collision with root package name */
    public List<f> f17705a0 = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public o f17706b0;

    /* renamed from: c0  reason: collision with root package name */
    public k f17707c0 = new k();

    /* renamed from: d0  reason: collision with root package name */
    public x f17708d0;

    /* renamed from: e0  reason: collision with root package name */
    public x f17709e0;

    /* renamed from: f0  reason: collision with root package name */
    public Rect f17710f0;

    /* renamed from: g0  reason: collision with root package name */
    public x f17711g0;

    /* renamed from: h0  reason: collision with root package name */
    public Rect f17712h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public Rect f17713i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public x f17714j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public double f17715k0 = 0.1d;

    /* renamed from: l0  reason: collision with root package name */
    public zb.t f17716l0 = null;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f17717m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public final SurfaceHolder.Callback f17718n0 = new b();

    /* renamed from: o0  reason: collision with root package name */
    public final Handler.Callback f17719o0 = new c();

    /* renamed from: p0  reason: collision with root package name */
    public s f17720p0 = new d();

    /* renamed from: q0  reason: collision with root package name */
    public final f f17721q0 = new e();

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            x unused = CameraPreview.this.f17711g0 = new x(i10, i11);
            CameraPreview.this.E();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                String unused = CameraPreview.f17703r0;
                return;
            }
            x unused2 = CameraPreview.this.f17711g0 = new x(i11, i12);
            CameraPreview.this.E();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            x unused = CameraPreview.this.f17711g0 = null;
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == l.g.zxing_prewiew_size_ready) {
                CameraPreview.this.y((x) message.obj);
                return true;
            } else if (i10 == l.g.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!CameraPreview.this.s()) {
                    return false;
                }
                CameraPreview.this.w();
                CameraPreview.this.f17721q0.b(exc);
                return false;
            } else if (i10 != l.g.zxing_camera_closed) {
                return false;
            } else {
                CameraPreview.this.f17721q0.d();
                return false;
            }
        }
    }

    public class d implements s {
        public d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            CameraPreview.this.B();
        }

        public void a(int i10) {
            CameraPreview.this.Q.postDelayed(new yb.e(this), 250);
        }
    }

    public class e implements f {
        public e() {
        }

        public void a() {
            for (f a10 : CameraPreview.this.f17705a0) {
                a10.a();
            }
        }

        public void b(Exception exc) {
            for (f b10 : CameraPreview.this.f17705a0) {
                b10.b(exc);
            }
        }

        public void c() {
            for (f c10 : CameraPreview.this.f17705a0) {
                c10.c();
            }
        }

        public void d() {
            for (f d10 : CameraPreview.this.f17705a0) {
                d10.d();
            }
        }

        public void e() {
            for (f e10 : CameraPreview.this.f17705a0) {
                e10.e();
            }
        }
    }

    public interface f {
        void a();

        void b(Exception exc);

        void c();

        void d();

        void e();
    }

    public CameraPreview(Context context) {
        super(context);
        q(context, (AttributeSet) null, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q(context, attributeSet, 0, 0);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q(context, attributeSet, i10, 0);
    }

    private int getDisplayRotation() {
        return this.P.getDefaultDisplay().getRotation();
    }

    public void A() {
        z.a();
        p();
        if (this.f17711g0 != null) {
            E();
        } else {
            SurfaceView surfaceView = this.S;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f17718n0);
            } else {
                TextureView textureView = this.T;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        F().onSurfaceTextureAvailable(this.T.getSurfaceTexture(), this.T.getWidth(), this.T.getHeight());
                    } else {
                        this.T.setSurfaceTextureListener(F());
                    }
                }
            }
        }
        requestLayout();
        this.V.e(getContext(), this.f17720p0);
    }

    public final void B() {
        if (s() && getDisplayRotation() != this.W) {
            w();
            A();
        }
    }

    public final void C() {
        View view;
        if (this.R) {
            TextureView textureView = new TextureView(getContext());
            this.T = textureView;
            textureView.setSurfaceTextureListener(F());
            view = this.T;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.S = surfaceView;
            surfaceView.getHolder().addCallback(this.f17718n0);
            view = this.S;
        }
        addView(view);
    }

    public final void D(zb.l lVar) {
        if (!this.U && this.O != null) {
            this.O.I(lVar);
            this.O.L();
            this.U = true;
            z();
            this.f17721q0.e();
        }
    }

    public final void E() {
        Rect rect;
        zb.l lVar;
        x xVar = this.f17711g0;
        if (xVar != null && this.f17709e0 != null && (rect = this.f17710f0) != null) {
            if (this.S == null || !xVar.equals(new x(rect.width(), this.f17710f0.height()))) {
                TextureView textureView = this.T;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f17709e0 != null) {
                        this.T.setTransform(l(new x(this.T.getWidth(), this.T.getHeight()), this.f17709e0));
                    }
                    lVar = new zb.l(this.T.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                lVar = new zb.l(this.S.getHolder());
            }
            D(lVar);
        }
    }

    @TargetApi(14)
    public final TextureView.SurfaceTextureListener F() {
        return new a();
    }

    public h getCameraInstance() {
        return this.O;
    }

    public k getCameraSettings() {
        return this.f17707c0;
    }

    public Rect getFramingRect() {
        return this.f17712h0;
    }

    public x getFramingRectSize() {
        return this.f17714j0;
    }

    public double getMarginFraction() {
        return this.f17715k0;
    }

    public Rect getPreviewFramingRect() {
        return this.f17713i0;
    }

    public zb.t getPreviewScalingStrategy() {
        zb.t tVar = this.f17716l0;
        return tVar != null ? tVar : this.T != null ? new n() : new p();
    }

    public x getPreviewSize() {
        return this.f17709e0;
    }

    public void i(f fVar) {
        this.f17705a0.add(fVar);
    }

    public final void j() {
        x xVar;
        o oVar;
        x xVar2 = this.f17708d0;
        if (xVar2 == null || (xVar = this.f17709e0) == null || (oVar = this.f17706b0) == null) {
            this.f17713i0 = null;
            this.f17712h0 = null;
            this.f17710f0 = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = xVar.O;
        int i11 = xVar.P;
        int i12 = xVar2.O;
        int i13 = xVar2.P;
        Rect f10 = oVar.f(xVar);
        if (f10.width() > 0 && f10.height() > 0) {
            this.f17710f0 = f10;
            this.f17712h0 = k(new Rect(0, 0, i12, i13), this.f17710f0);
            Rect rect = new Rect(this.f17712h0);
            Rect rect2 = this.f17710f0;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = new Rect((rect.left * i10) / this.f17710f0.width(), (rect.top * i11) / this.f17710f0.height(), (rect.right * i10) / this.f17710f0.width(), (rect.bottom * i11) / this.f17710f0.height());
            this.f17713i0 = rect3;
            if (rect3.width() <= 0 || this.f17713i0.height() <= 0) {
                this.f17713i0 = null;
                this.f17712h0 = null;
                return;
            }
            this.f17721q0.a();
        }
    }

    public Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f17714j0 != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f17714j0.O) / 2), Math.max(0, (rect3.height() - this.f17714j0.P) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.f17715k0, ((double) rect3.height()) * this.f17715k0);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    public Matrix l(x xVar, x xVar2) {
        float f10;
        float f11 = ((float) xVar.O) / ((float) xVar.P);
        float f12 = ((float) xVar2.O) / ((float) xVar2.P);
        float f13 = 1.0f;
        if (f11 < f12) {
            float f14 = f12 / f11;
            f10 = 1.0f;
            f13 = f14;
        } else {
            f10 = f11 / f12;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f13, f10);
        int i10 = xVar.O;
        int i11 = xVar.P;
        matrix.postTranslate((((float) i10) - (((float) i10) * f13)) / 2.0f, (((float) i11) - (((float) i11) * f10)) / 2.0f);
        return matrix;
    }

    public void m(j jVar) {
        h hVar = this.O;
        if (hVar != null) {
            hVar.m(jVar);
        }
    }

    public final void n(x xVar) {
        this.f17708d0 = xVar;
        h hVar = this.O;
        if (hVar != null && hVar.t() == null) {
            o oVar = new o(getDisplayRotation(), xVar);
            this.f17706b0 = oVar;
            oVar.g(getPreviewScalingStrategy());
            this.O.G(this.f17706b0);
            this.O.o();
            boolean z10 = this.f17717m0;
            if (z10) {
                this.O.K(z10);
            }
        }
    }

    public h o() {
        h hVar = new h(getContext());
        hVar.F(this.f17707c0);
        return hVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C();
    }

    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n(new x(i12 - i10, i13 - i11));
        View view = this.S;
        if (view != null) {
            Rect rect = this.f17710f0;
            if (rect != null) {
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        } else {
            view = this.T;
            if (view == null) {
                return;
            }
        }
        view.layout(0, 0, getWidth(), getHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f17717m0);
        return bundle;
    }

    public final void p() {
        if (this.O == null) {
            h o10 = o();
            this.O = o10;
            o10.H(this.Q);
            this.O.D();
            this.W = getDisplayRotation();
        }
    }

    public final void q(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        r(attributeSet);
        this.P = (WindowManager) context.getSystemService("window");
        this.Q = new Handler(this.f17719o0);
        this.V = new t();
    }

    public void r(AttributeSet attributeSet) {
        zb.t qVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.m.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(l.m.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(l.m.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f17714j0 = new x(dimension, dimension2);
        }
        this.R = obtainStyledAttributes.getBoolean(l.m.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(l.m.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            qVar = new n();
        } else if (integer == 2) {
            qVar = new p();
        } else {
            if (integer == 3) {
                qVar = new q();
            }
            obtainStyledAttributes.recycle();
        }
        this.f17716l0 = qVar;
        obtainStyledAttributes.recycle();
    }

    public boolean s() {
        return this.O != null;
    }

    public void setCameraSettings(k kVar) {
        this.f17707c0 = kVar;
    }

    public void setFramingRectSize(x xVar) {
        this.f17714j0 = xVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 < 0.5d) {
            this.f17715k0 = d10;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(zb.t tVar) {
        this.f17716l0 = tVar;
    }

    public void setTorch(boolean z10) {
        this.f17717m0 = z10;
        h hVar = this.O;
        if (hVar != null) {
            hVar.K(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.R = z10;
    }

    public boolean t() {
        h hVar = this.O;
        return hVar == null || hVar.w();
    }

    public boolean u() {
        return this.U;
    }

    public boolean v() {
        return this.R;
    }

    public void w() {
        TextureView textureView;
        SurfaceView surfaceView;
        z.a();
        this.W = -1;
        h hVar = this.O;
        if (hVar != null) {
            hVar.n();
            this.O = null;
            this.U = false;
        } else {
            this.Q.sendEmptyMessage(l.g.zxing_camera_closed);
        }
        if (this.f17711g0 == null && (surfaceView = this.S) != null) {
            surfaceView.getHolder().removeCallback(this.f17718n0);
        }
        if (this.f17711g0 == null && (textureView = this.T) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f17708d0 = null;
        this.f17709e0 = null;
        this.f17713i0 = null;
        this.V.f();
        this.f17721q0.c();
    }

    public void x() {
        h cameraInstance = getCameraInstance();
        w();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.w() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void y(x xVar) {
        this.f17709e0 = xVar;
        if (this.f17708d0 != null) {
            j();
            requestLayout();
            E();
        }
    }

    public void z() {
    }
}
