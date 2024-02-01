package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import b6.n0;
import com.google.android.exoplayer2.ui.spherical.a;
import com.google.android.exoplayer2.ui.spherical.b;
import d.d;
import d.f1;
import d.g;
import d.g1;
import d.o0;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import s7.f;
import s7.h;
import s7.i;
import w7.q0;

public final class SphericalSurfaceView extends GLSurfaceView {

    /* renamed from: b0  reason: collision with root package name */
    public static final int f5576b0 = 90;

    /* renamed from: c0  reason: collision with root package name */
    public static final float f5577c0 = 0.1f;

    /* renamed from: d0  reason: collision with root package name */
    public static final float f5578d0 = 100.0f;

    /* renamed from: e0  reason: collision with root package name */
    public static final float f5579e0 = 25.0f;

    /* renamed from: f0  reason: collision with root package name */
    public static final float f5580f0 = 3.1415927f;
    public final SensorManager O;
    @o0
    public final Sensor P;
    public final a Q;
    public final a R;
    public final Handler S;
    public final b T;
    public final f U;
    @o0
    public SurfaceTexture V;
    @o0
    public Surface W;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public n0.i f5581a0;

    @g1
    public class a implements GLSurfaceView.Renderer, b.a, a.C0092a {
        public final f O;
        public final float[] P = new float[16];
        public final float[] Q = new float[16];
        public final float[] R;
        public final float[] S;
        public final float[] T;
        public float U;
        public float V;
        public final float[] W;
        public final float[] X;

        public a(f fVar) {
            float[] fArr = new float[16];
            this.R = fArr;
            float[] fArr2 = new float[16];
            this.S = fArr2;
            float[] fArr3 = new float[16];
            this.T = fArr3;
            this.W = new float[16];
            this.X = new float[16];
            this.O = fVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.V = 3.1415927f;
        }

        @g
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.R;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.V = -f10;
            d();
        }

        @f1
        public synchronized void b(PointF pointF) {
            this.U = pointF.y;
            d();
            Matrix.setRotateM(this.T, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        @d
        public final void d() {
            Matrix.setRotateM(this.S, 0, -this.U, (float) Math.cos((double) this.V), (float) Math.sin((double) this.V), 0.0f);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.X, 0, this.R, 0, this.T, 0);
                Matrix.multiplyMM(this.W, 0, this.S, 0, this.X, 0);
            }
            Matrix.multiplyMM(this.Q, 0, this.P, 0, this.W, 0);
            this.O.e(this.Q, false);
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = ((float) i10) / ((float) i11);
            Matrix.perspectiveM(this.P, 0, c(f10), f10, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalSurfaceView.this.f(this.O.f());
        }
    }

    public SphericalSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SphericalSurfaceView(Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) w7.a.g(context.getSystemService("sensor"));
        this.O = sensorManager;
        Sensor defaultSensor = q0.f14786a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.P = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        f fVar = new f();
        this.U = fVar;
        a aVar = new a(fVar);
        this.R = aVar;
        b bVar = new b(context, aVar, 25.0f);
        this.T = bVar;
        this.Q = new a(((WindowManager) w7.a.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), bVar, aVar);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        Surface surface = this.W;
        if (surface != null) {
            n0.i iVar = this.f5581a0;
            if (iVar != null) {
                iVar.r(surface);
            }
            g(this.V, this.W);
            this.V = null;
            this.W = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.V;
        Surface surface = this.W;
        this.V = surfaceTexture;
        Surface surface2 = new Surface(surfaceTexture);
        this.W = surface2;
        n0.i iVar = this.f5581a0;
        if (iVar != null) {
            iVar.l(surface2);
        }
        g(surfaceTexture2, surface);
    }

    public static void g(@o0 SurfaceTexture surfaceTexture, @o0 Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public final void f(SurfaceTexture surfaceTexture) {
        this.S.post(new i(this, surfaceTexture));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S.post(new h(this));
    }

    public void onPause() {
        if (this.P != null) {
            this.O.unregisterListener(this.Q);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        Sensor sensor = this.P;
        if (sensor != null) {
            this.O.registerListener(this.Q, sensor, 0);
        }
    }

    public void setDefaultStereoMode(int i10) {
        this.U.h(i10);
    }

    public void setSingleTapListener(@o0 s7.g gVar) {
        this.T.b(gVar);
    }

    public void setVideoComponent(@o0 n0.i iVar) {
        n0.i iVar2 = this.f5581a0;
        if (iVar != iVar2) {
            if (iVar2 != null) {
                Surface surface = this.W;
                if (surface != null) {
                    iVar2.r(surface);
                }
                this.f5581a0.h0(this.U);
                this.f5581a0.y0(this.U);
            }
            this.f5581a0 = iVar;
            if (iVar != null) {
                iVar.N(this.U);
                this.f5581a0.j(this.U);
                this.f5581a0.l(this.W);
            }
        }
    }
}
