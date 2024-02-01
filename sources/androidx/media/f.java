package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.media.e;
import d.t0;

@t0(23)
public class f {

    public static class a extends e.b {
        public a(Context context, b bVar) {
            super(context, bVar);
        }

        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.O).a(str, new e.c(result));
        }
    }

    public interface b extends e.d {
        void a(String str, e.c<Parcel> cVar);
    }

    public static Object a(Context context, b bVar) {
        return new a(context, bVar);
    }
}
