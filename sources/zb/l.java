package zb;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceHolder f25080a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f25081b;

    public l(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f25081b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public l(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f25080a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public SurfaceHolder a() {
        return this.f25080a;
    }

    public SurfaceTexture b() {
        return this.f25081b;
    }

    public void c(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f25080a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f25081b);
        }
    }
}
