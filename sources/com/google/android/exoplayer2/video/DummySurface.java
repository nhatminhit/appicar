package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.material.internal.e;
import d.o0;
import w7.g;
import w7.p;
import w7.q0;

@TargetApi(17)
public final class DummySurface extends Surface {
    public static final String R = "DummySurface";
    public static final String S = "EGL_EXT_protected_content";
    public static final String T = "EGL_KHR_surfaceless_context";
    public static int U;
    public static boolean V;
    public final boolean O;
    public final b P;
    public boolean Q;

    public static class b extends HandlerThread implements Handler.Callback {
        public static final int T = 1;
        public static final int U = 2;
        public g O;
        public Handler P;
        @o0
        public Error Q;
        @o0
        public RuntimeException R;
        @o0
        public DummySurface S;

        public b() {
            super("dummySurface");
        }

        public DummySurface a(int i10) {
            boolean z10;
            start();
            this.P = new Handler(getLooper(), this);
            this.O = new g(this.P);
            synchronized (this) {
                z10 = false;
                this.P.obtainMessage(1, i10, 0).sendToTarget();
                while (this.S == null && this.R == null && this.Q == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.R;
            if (runtimeException == null) {
                Error error = this.Q;
                if (error == null) {
                    return (DummySurface) w7.a.g(this.S);
                }
                throw error;
            }
            throw runtimeException;
        }

        public final void b(int i10) {
            w7.a.g(this.O);
            this.O.h(i10);
            this.S = new DummySurface(this, this.O.g(), i10 != 0);
        }

        public void c() {
            w7.a.g(this.P);
            this.P.sendEmptyMessage(2);
        }

        public final void d() {
            w7.a.g(this.O);
            this.O.i();
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    p.e(DummySurface.R, "Failed to initialize dummy surface", e10);
                    this.R = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    try {
                        p.e(DummySurface.R, "Failed to initialize dummy surface", e11);
                        this.Q = e11;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notify();
                            throw th2;
                        }
                    }
                }
                return true;
            } else if (i10 != 2) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
                quit();
                return true;
            }
        }
    }

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.P = bVar;
        this.O = z10;
    }

    public static void a() {
        if (q0.f14786a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    public static int b(Context context) {
        String eglQueryString;
        int i10 = q0.f14786a;
        if (i10 < 26 && (e.f17193b.equals(q0.f14788c) || "XT1650".equals(q0.f14789d))) {
            return 0;
        }
        if ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(S)) {
            return eglQueryString.contains(T) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z10;
        synchronized (DummySurface.class) {
            z10 = true;
            if (!V) {
                U = q0.f14786a < 24 ? 0 : b(context);
                V = true;
            }
            if (U == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static DummySurface d(Context context, boolean z10) {
        a();
        int i10 = 0;
        w7.a.i(!z10 || c(context));
        b bVar = new b();
        if (z10) {
            i10 = U;
        }
        return bVar.a(i10);
    }

    public void release() {
        super.release();
        synchronized (this.P) {
            if (!this.Q) {
                this.P.c();
                this.Q = true;
            }
        }
    }
}
