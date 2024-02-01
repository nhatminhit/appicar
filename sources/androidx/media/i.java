package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.f;
import d.t0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@t0(26)
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2999a = "MBSCompatApi26";

    /* renamed from: b  reason: collision with root package name */
    public static Field f3000b;

    public static class a extends f.a {
        public a(Context context, c cVar) {
            super(context, cVar);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((c) this.O).g(str, new b(result), bundle);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public MediaBrowserService.Result f3001a;

        public b(MediaBrowserService.Result result) {
            this.f3001a = result;
        }

        public void a() {
            this.f3001a.detach();
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

        public void c(List<Parcel> list, int i10) {
            try {
                i.f3000b.setInt(this.f3001a, i10);
            } catch (IllegalAccessException unused) {
            }
            this.f3001a.sendResult(b(list));
        }
    }

    public interface c extends f.b {
        void g(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f3000b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public static Object a(Context context, c cVar) {
        return new a(context, cVar);
    }

    public static Bundle b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static void c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
