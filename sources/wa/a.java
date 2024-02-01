package wa;

import android.hardware.Camera;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23998a = "wa.a";

    /* renamed from: b  reason: collision with root package name */
    public static final int f23999b = -1;

    public static int a(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        boolean z10 = i10 >= 0;
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        return i10 < numberOfCameras ? i10 : z10 ? -1 : 0;
    }

    public static Camera b(int i10) {
        int a10 = a(i10);
        if (a10 == -1) {
            return null;
        }
        return Camera.open(a10);
    }
}
