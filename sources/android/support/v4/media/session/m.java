package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.k;
import d.t0;

@t0(23)
public class m {

    public interface a extends k.a {
        void u(Uri uri, Bundle bundle);
    }

    public static class b<T extends a> extends k.b<T> {
        public b(T t10) {
            super(t10);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f618a).u(uri, bundle);
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }
}
