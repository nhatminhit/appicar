package n1;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.Switch;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@TargetApi(14)
@h({@g(attribute = "android:thumb", method = "setThumbDrawable", type = Switch.class), @g(attribute = "android:track", method = "setTrackDrawable", type = Switch.class)})
public class a0 {
    @d({"android:switchTextAppearance"})
    public static void a(Switch switchR, int i10) {
        switchR.setSwitchTextAppearance((Context) null, i10);
    }
}
