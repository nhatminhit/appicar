package n0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import d.m0;
import d.o0;

public class d {
    @o0
    public static ColorFilter a(int i10, @m0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode a10 = f.a(eVar);
            if (a10 != null) {
                return new BlendModeColorFilter(i10, a10);
            }
            return null;
        }
        PorterDuff.Mode b10 = f.b(eVar);
        if (b10 != null) {
            return new PorterDuffColorFilter(i10, b10);
        }
        return null;
    }
}
