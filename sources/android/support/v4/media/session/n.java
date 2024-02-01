package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.m;
import d.t0;
import java.lang.reflect.InvocationTargetException;

@t0(24)
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final String f619a = "MediaSessionCompatApi24";

    public interface a extends m.a {
        void b(String str, Bundle bundle);

        void c();

        void m(Uri uri, Bundle bundle);

        void t(String str, Bundle bundle);
    }

    public static class b<T extends a> extends m.b<T> {
        public b(T t10) {
            super(t10);
        }

        public void onPrepare() {
            ((a) this.f618a).c();
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f618a).b(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f618a).t(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f618a).m(uri, bundle);
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static String b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
