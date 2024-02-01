package x0;

import android.os.Environment;
import d.m0;
import java.io.File;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15003a = "EnvironmentCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final String f15004b = "unknown";

    @m0
    public static String a(@m0 File file) {
        return Environment.getExternalStorageState(file);
    }
}
