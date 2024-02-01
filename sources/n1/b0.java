package n1;

import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:thumb", method = "setThumbDrawable", type = SwitchCompat.class), @g(attribute = "android:track", method = "setTrackDrawable", type = SwitchCompat.class)})
public class b0 {
    @d({"android:switchTextAppearance"})
    public static void a(SwitchCompat switchCompat, int i10) {
        switchCompat.k((Context) null, i10);
    }
}
