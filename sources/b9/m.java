package b9;

import android.os.Build;
import d.k;

public final class m {
    @k(api = 33, codename = "Tiramisu")
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
