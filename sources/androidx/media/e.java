package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import d.t0;
import java.util.ArrayList;
import java.util.List;

@t0(21)
public class e {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f2996a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f2997b;

        public a(String str, Bundle bundle) {
            this.f2996a = str;
            this.f2997b = bundle;
        }
    }

    public static class b extends MediaBrowserService {
        public final d O;

        public b(Context context, d dVar) {
            attachBaseContext(context);
            this.O = dVar;
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            a h10 = this.O.h(str, i10, bundle == null ? null : new Bundle(bundle));
            if (h10 == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(h10.f2996a, h10.f2997b);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.O.d(str, new c(result));
        }
    }

    public static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public MediaBrowserService.Result f2998a;

        public c(MediaBrowserService.Result result) {
            this.f2998a = result;
        }

        public void a() {
            this.f2998a.detach();
        }

        public List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        public void c(T t10) {
            if (t10 instanceof List) {
                this.f2998a.sendResult(b((List) t10));
            } else if (t10 instanceof Parcel) {
                Parcel parcel = (Parcel) t10;
                parcel.setDataPosition(0);
                this.f2998a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f2998a.sendResult((Object) null);
            }
        }
    }

    public interface d {
        void d(String str, c<List<Parcel>> cVar);

        a h(String str, int i10, Bundle bundle);
    }

    public static Object a(Context context, d dVar) {
        return new b(context, dVar);
    }

    public static void b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    public static IBinder c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static void e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}
