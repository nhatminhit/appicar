package w8;

import android.content.Context;
import android.content.SharedPreferences;
import d.m0;
import e8.a;

@a
public class a0 {
    @a
    @Deprecated
    public static void a(@m0 Context context, @m0 SharedPreferences.Editor editor, @m0 String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
