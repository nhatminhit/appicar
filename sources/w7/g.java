package w7;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import d.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TargetApi(17)
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int V = 0;
    public static final int W = 1;
    public static final int X = 2;
    public static final int Y = 1;
    public static final int Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f14729a0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b0  reason: collision with root package name */
    public static final int f14730b0 = 12992;
    public final Handler O;
    public final int[] P;
    @o0
    public final d Q;
    @o0
    public EGLDisplay R;
    @o0
    public EGLContext S;
    @o0
    public EGLSurface T;
    @o0
    public SurfaceTexture U;

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void a();
    }

    public g(Handler handler) {
        this(handler, (d) null);
    }

    public g(Handler handler, @o0 d dVar) {
        this.O = handler;
        this.Q = dVar;
        this.P = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f14729a0, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        throw new b(q0.E("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f14730b0, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, f14730b0, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        m.b();
    }

    public static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public final void d() {
        d dVar = this.Q;
        if (dVar != null) {
            dVar.a();
        }
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) a.g(this.U);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.R = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.R, a10, i10);
        this.S = b10;
        this.T = c(this.R, a10, b10, i10);
        e(this.P);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.P[0]);
        this.U = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.O.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.U;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.P, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.R;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.R;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.T;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.R, this.T);
            }
            EGLContext eGLContext = this.S;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.R, eGLContext);
            }
            if (q0.f14786a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.R;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.R);
            }
            this.R = null;
            this.S = null;
            this.T = null;
            this.U = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.O.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.U;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
