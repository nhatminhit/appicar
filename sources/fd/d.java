package fd;

import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;

public class d {
    public static double a(File file) {
        return (double) Integer.parseInt(String.valueOf(file.length() / PlaybackStateCompat.f554k0));
    }

    public static double b() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (double) ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.f554k0);
    }
}
