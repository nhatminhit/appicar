package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import d.t0;

@t0(23)
public class d {

    public static class a {
        public static void a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
