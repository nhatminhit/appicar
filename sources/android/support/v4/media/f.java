package android.support.v4.media;

import android.media.browse.MediaBrowser;
import d.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@t0(21)
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static Constructor f389a;

    static {
        try {
            f389a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }

    public static Object a(List<MediaBrowser.MediaItem> list) {
        try {
            return f389a.newInstance(new Object[]{list});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
