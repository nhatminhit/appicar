package s7;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class e implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ f O;

    public /* synthetic */ e(f fVar) {
        this.O = fVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.O.g(surfaceTexture);
    }
}
