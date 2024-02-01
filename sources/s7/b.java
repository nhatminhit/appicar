package s7;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import d.o0;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.a;
import w7.m;

public final class b {

    /* renamed from: n  reason: collision with root package name */
    public static final float f12657n = 0.8f;

    /* renamed from: o  reason: collision with root package name */
    public static final float f12658o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public static final float f12659p = -0.4f;

    /* renamed from: q  reason: collision with root package name */
    public static final float f12660q = -0.3f;

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f12661r = {"uniform mat4 uMvpMatrix;", "attribute vec3 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * vec4(aPosition, 1);", "  vTexCoords = aTexCoords;", a.f11639j};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f12662s = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", a.f11639j};

    /* renamed from: t  reason: collision with root package name */
    public static final int f12663t = 3;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12664u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12665v = 5;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12666w = 20;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12667x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final float f12668y = 1.5707964f;

    /* renamed from: a  reason: collision with root package name */
    public final FloatBuffer f12669a = m.e(20);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f12670b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public int f12671c;

    /* renamed from: d  reason: collision with root package name */
    public int f12672d;

    /* renamed from: e  reason: collision with root package name */
    public float f12673e;

    /* renamed from: f  reason: collision with root package name */
    public int f12674f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f12675g;

    /* renamed from: h  reason: collision with root package name */
    public int f12676h;

    /* renamed from: i  reason: collision with root package name */
    public int f12677i;

    /* renamed from: j  reason: collision with root package name */
    public int f12678j;

    /* renamed from: k  reason: collision with root package name */
    public int f12679k;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceTexture f12680l;

    /* renamed from: m  reason: collision with root package name */
    public Surface f12681m;

    @o0
    public static PointF d(float f10, float f11, float f12, float f13, float f14, float f15, int i10, int i11) {
        if (f10 < 1.5707964f && f10 > -1.5707964f && f11 < 1.5707964f && f11 > -1.5707964f) {
            double tan = (Math.tan((double) f10) * 1.0d) - ((double) f12);
            double tan2 = (Math.tan((double) f11) * 1.0d) - ((double) f13);
            if (tan >= 0.0d) {
                double d10 = (double) f14;
                if (tan <= d10 && tan2 >= 0.0d) {
                    double d11 = (double) f15;
                    if (tan2 <= d11) {
                        double d12 = (double) i10;
                        double d13 = (double) i11;
                        return new PointF((float) (d12 - ((tan * d12) / d10)), (float) (d13 - ((tan2 * d13) / d11)));
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
        this.f12670b.set(true);
    }

    public void b(float[] fArr) {
        if (this.f12680l != null) {
            GLES20.glUseProgram(this.f12674f);
            m.b();
            GLES20.glEnableVertexAttribArray(this.f12676h);
            GLES20.glEnableVertexAttribArray(this.f12677i);
            m.b();
            GLES20.glUniformMatrix4fv(this.f12675g, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.f12679k);
            GLES20.glUniform1i(this.f12678j, 0);
            m.b();
            this.f12669a.position(0);
            GLES20.glVertexAttribPointer(this.f12676h, 3, 5126, false, 20, this.f12669a);
            m.b();
            this.f12669a.position(3);
            GLES20.glVertexAttribPointer(this.f12677i, 2, 5126, false, 20, this.f12669a);
            m.b();
            if (this.f12670b.compareAndSet(true, false)) {
                this.f12680l.updateTexImage();
            }
            GLES20.glDrawArrays(5, 0, 4);
            m.b();
            GLES20.glDisableVertexAttribArray(this.f12676h);
            GLES20.glDisableVertexAttribArray(this.f12677i);
        }
    }

    public void c() {
        if (this.f12674f == 0) {
            int d10 = m.d(f12661r, f12662s);
            this.f12674f = d10;
            this.f12675g = GLES20.glGetUniformLocation(d10, "uMvpMatrix");
            this.f12676h = GLES20.glGetAttribLocation(this.f12674f, "aPosition");
            this.f12677i = GLES20.glGetAttribLocation(this.f12674f, "aTexCoords");
            this.f12678j = GLES20.glGetUniformLocation(this.f12674f, "uTexture");
            this.f12679k = m.g();
            m.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12679k);
            this.f12680l = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(new a(this));
            this.f12680l.setDefaultBufferSize(this.f12671c, this.f12672d);
            this.f12681m = new Surface(this.f12680l);
        }
    }

    @o0
    public Canvas f() {
        Surface surface = this.f12681m;
        if (surface == null) {
            return null;
        }
        return surface.lockCanvas((Rect) null);
    }

    public void g(int i10, int i11) {
        this.f12671c = i10;
        this.f12672d = i11;
        this.f12673e = (((float) i11) * 0.8f) / ((float) i10);
        float[] fArr = new float[20];
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = 0;
            while (i14 < 2) {
                int i15 = i12 + 1;
                float f10 = (float) i14;
                fArr[i12] = (f10 * 0.8f) - 11.2f;
                int i16 = i15 + 1;
                fArr[i15] = (this.f12673e * ((float) i13)) - 14.4f;
                int i17 = i16 + 1;
                fArr[i16] = -1.0f;
                int i18 = i17 + 1;
                fArr[i17] = f10;
                fArr[i18] = (float) (1 - i13);
                i14++;
                i12 = i18 + 1;
            }
        }
        this.f12669a.position(0);
        this.f12669a.put(fArr);
    }

    public void h() {
        int i10 = this.f12674f;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
            GLES20.glDeleteTextures(1, new int[]{this.f12679k}, 0);
        }
        SurfaceTexture surfaceTexture = this.f12680l;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        Surface surface = this.f12681m;
        if (surface != null) {
            surface.release();
        }
    }

    @o0
    public PointF i(float f10, float f11) {
        return d(f10, f11, -0.4f, -0.3f, 0.8f, this.f12673e, this.f12671c, this.f12672d);
    }

    public void j(@o0 Canvas canvas) {
        Surface surface;
        if (canvas != null && (surface = this.f12681m) != null) {
            surface.unlockCanvasAndPost(canvas);
        }
    }
}
