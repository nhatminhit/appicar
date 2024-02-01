package zb;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pf.y0;
import va.b;
import yb.x;
import yb.y;

public final class i {

    /* renamed from: n  reason: collision with root package name */
    public static final String f25054n = "i";

    /* renamed from: a  reason: collision with root package name */
    public Camera f25055a;

    /* renamed from: b  reason: collision with root package name */
    public Camera.CameraInfo f25056b;

    /* renamed from: c  reason: collision with root package name */
    public a f25057c;

    /* renamed from: d  reason: collision with root package name */
    public b f25058d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25059e;

    /* renamed from: f  reason: collision with root package name */
    public String f25060f;

    /* renamed from: g  reason: collision with root package name */
    public k f25061g = new k();

    /* renamed from: h  reason: collision with root package name */
    public o f25062h;

    /* renamed from: i  reason: collision with root package name */
    public x f25063i;

    /* renamed from: j  reason: collision with root package name */
    public x f25064j;

    /* renamed from: k  reason: collision with root package name */
    public int f25065k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Context f25066l;

    /* renamed from: m  reason: collision with root package name */
    public final a f25067m;

    public final class a implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        public s f25068a;

        /* renamed from: b  reason: collision with root package name */
        public x f25069b;

        public a() {
        }

        public void a(s sVar) {
            this.f25068a = sVar;
        }

        public void b(x xVar) {
            this.f25069b = xVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            x xVar = this.f25069b;
            s sVar = this.f25068a;
            if (xVar == null || sVar == null) {
                String unused = i.f25054n;
                if (sVar != null) {
                    e10 = new Exception("No resolution available");
                } else {
                    return;
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    y yVar = new y(bArr2, xVar.O, xVar.P, camera.getParameters().getPreviewFormat(), i.this.h());
                    if (i.this.f25056b.facing == 1) {
                        yVar.n(true);
                    }
                    sVar.b(yVar);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    String unused2 = i.f25054n;
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
            sVar.a(e10);
        }
    }

    public i(Context context) {
        this.f25066l = context;
        this.f25067m = new a();
    }

    public static List<x> n(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new x(previewSize.width, previewSize.height);
                arrayList.add(new x(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new x(next.width, next.height));
        }
        return arrayList;
    }

    public void A(boolean z10) {
        if (this.f25055a != null) {
            try {
                if (z10 != q()) {
                    a aVar = this.f25057c;
                    if (aVar != null) {
                        aVar.j();
                    }
                    Camera.Parameters parameters = this.f25055a.getParameters();
                    c.n(parameters, z10);
                    if (this.f25061g.g()) {
                        c.g(parameters, z10);
                    }
                    this.f25055a.setParameters(parameters);
                    a aVar2 = this.f25057c;
                    if (aVar2 != null) {
                        aVar2.i();
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public void B() {
        Camera camera = this.f25055a;
        if (camera != null && !this.f25059e) {
            camera.startPreview();
            this.f25059e = true;
            this.f25057c = new a(this.f25055a, this.f25061g);
            b bVar = new b(this.f25066l, this, this.f25061g);
            this.f25058d = bVar;
            bVar.d();
        }
    }

    public void C() {
        a aVar = this.f25057c;
        if (aVar != null) {
            aVar.j();
            this.f25057c = null;
        }
        b bVar = this.f25058d;
        if (bVar != null) {
            bVar.e();
            this.f25058d = null;
        }
        Camera camera = this.f25055a;
        if (camera != null && this.f25059e) {
            camera.stopPreview();
            this.f25067m.a((s) null);
            this.f25059e = false;
        }
    }

    public final int c() {
        int d10 = this.f25062h.d();
        int i10 = 0;
        if (d10 != 0) {
            if (d10 == 1) {
                i10 = 90;
            } else if (d10 == 2) {
                i10 = 180;
            } else if (d10 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f25056b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % dg.a.rr) : (i12 - i10) + dg.a.rr) % dg.a.rr;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera Display Orientation: ");
        sb2.append(i13);
        return i13;
    }

    public void d(j jVar) {
        Camera camera = this.f25055a;
        if (camera != null) {
            try {
                camera.setParameters(jVar.a(camera.getParameters()));
            } catch (RuntimeException unused) {
            }
        }
    }

    public void e() {
        Camera camera = this.f25055a;
        if (camera != null) {
            camera.release();
            this.f25055a = null;
        }
    }

    public void f() {
        if (this.f25055a != null) {
            x();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    public Camera g() {
        return this.f25055a;
    }

    public int h() {
        return this.f25065k;
    }

    public k i() {
        return this.f25061g;
    }

    public final Camera.Parameters j() {
        Camera.Parameters parameters = this.f25055a.getParameters();
        String str = this.f25060f;
        if (str == null) {
            this.f25060f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    public o k() {
        return this.f25062h;
    }

    public x l() {
        return this.f25064j;
    }

    public x m() {
        if (this.f25064j == null) {
            return null;
        }
        return o() ? this.f25064j.d() : this.f25064j;
    }

    public boolean o() {
        int i10 = this.f25065k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean p() {
        return this.f25055a != null;
    }

    public boolean q() {
        String flashMode;
        Camera.Parameters parameters = this.f25055a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return y0.f22056d.equals(flashMode) || "torch".equals(flashMode);
    }

    public void r() {
        Camera b10 = wa.a.b(this.f25061g.b());
        this.f25055a = b10;
        if (b10 != null) {
            int a10 = wa.a.a(this.f25061g.b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f25056b = cameraInfo;
            Camera.getCameraInfo(a10, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public void s(s sVar) {
        Camera camera = this.f25055a;
        if (camera != null && this.f25059e) {
            this.f25067m.a(sVar);
            camera.setOneShotPreviewCallback(this.f25067m);
        }
    }

    public final void t(int i10) {
        this.f25055a.setDisplayOrientation(i10);
    }

    public void u(k kVar) {
        this.f25061g = kVar;
    }

    public final void v(boolean z10) {
        Camera.Parameters j10 = j();
        if (j10 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Initial camera parameters: ");
            sb2.append(j10.flatten());
            c.j(j10, this.f25061g.a(), z10);
            if (!z10) {
                c.n(j10, false);
                if (this.f25061g.i()) {
                    c.l(j10);
                }
                if (this.f25061g.e()) {
                    c.f(j10);
                }
                if (this.f25061g.h()) {
                    c.o(j10);
                    c.k(j10);
                    c.m(j10);
                }
            }
            List<x> n10 = n(j10);
            if (n10.size() == 0) {
                this.f25063i = null;
            } else {
                x a10 = this.f25062h.a(n10, o());
                this.f25063i = a10;
                j10.setPreviewSize(a10.O, a10.P);
            }
            if (Build.DEVICE.equals("glass-1")) {
                c.h(j10);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Final camera parameters: ");
            sb3.append(j10.flatten());
            this.f25055a.setParameters(j10);
        }
    }

    public void w(o oVar) {
        this.f25062h = oVar;
    }

    public final void x() {
        try {
            int c10 = c();
            this.f25065k = c10;
            t(c10);
        } catch (Exception unused) {
        }
        try {
            v(false);
        } catch (Exception unused2) {
            try {
                v(true);
            } catch (Exception unused3) {
            }
        }
        Camera.Size previewSize = this.f25055a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f25064j = this.f25063i;
        } else {
            this.f25064j = new x(previewSize.width, previewSize.height);
        }
        this.f25067m.b(this.f25064j);
    }

    public void y(SurfaceHolder surfaceHolder) throws IOException {
        z(new l(surfaceHolder));
    }

    public void z(l lVar) throws IOException {
        lVar.c(this.f25055a);
    }
}
