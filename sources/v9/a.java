package v9;

import android.content.ContentResolver;
import android.provider.Settings;
import d.g1;
import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static float f23427a = 1.0f;

    @g1
    public static void b(float f10) {
        f23427a = f10;
    }

    public float a(@m0 ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
