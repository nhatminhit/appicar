package ph;

import android.os.Build;
import ph.e;

public final class g implements e.b {
    public String a(String str) {
        return (!str.startsWith(f.f22087g) || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    public void b(String str) {
        System.loadLibrary(str);
    }

    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        if (!h.a(str)) {
            return new String[]{Build.CPU_ABI, str};
        }
        return new String[]{Build.CPU_ABI};
    }

    public void e(String str) {
        System.load(str);
    }
}
