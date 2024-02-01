package s7;

import android.graphics.SurfaceTexture;
import com.google.android.exoplayer2.ui.spherical.SphericalSurfaceView;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ SphericalSurfaceView O;
    public final /* synthetic */ SurfaceTexture P;

    public /* synthetic */ i(SphericalSurfaceView sphericalSurfaceView, SurfaceTexture surfaceTexture) {
        this.O = sphericalSurfaceView;
        this.P = surfaceTexture;
    }

    public final void run() {
        this.O.e(this.P);
    }
}
