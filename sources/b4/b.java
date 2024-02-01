package b4;

import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4129a = "GlideRuntimeCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final String f4130b = "cpu[0-9]+";

    /* renamed from: c  reason: collision with root package name */
    public static final String f4131c = "/sys/devices/system/cpu/";

    public class a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Pattern f4132a;

        public a(Pattern pattern) {
            this.f4132a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f4132a.matcher(str).matches();
        }
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: finally extract failed */
    public static int b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(f4131c).listFiles(new a(Pattern.compile(f4130b)));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
