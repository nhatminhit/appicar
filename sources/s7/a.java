package s7;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class a implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ b O;

    public /* synthetic */ a(b bVar) {
        this.O = bVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.O.e(surfaceTexture);
    }
}
