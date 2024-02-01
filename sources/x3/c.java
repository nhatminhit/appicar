package x3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import d.g1;
import d.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import w3.d;
import w3.g;

public class c implements d<InputStream> {
    public static final String R = "MediaStoreThumbFetcher";
    public final Uri O;
    public final e P;
    public InputStream Q;

    public static class a implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f15063b = {"_data"};

        /* renamed from: c  reason: collision with root package name */
        public static final String f15064c = "kind = 1 AND image_id = ?";

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f15065a;

        public a(ContentResolver contentResolver) {
            this.f15065a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f15065a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f15063b, f15064c, new String[]{lastPathSegment}, (String) null);
        }
    }

    public static class b implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f15066b = {"_data"};

        /* renamed from: c  reason: collision with root package name */
        public static final String f15067c = "kind = 1 AND video_id = ?";

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f15068a;

        public b(ContentResolver contentResolver) {
            this.f15068a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f15068a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f15066b, f15067c, new String[]{lastPathSegment}, (String) null);
        }
    }

    @g1
    public c(Uri uri, e eVar) {
        this.O = uri;
        this.P = eVar;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.d(context).m().g(), dVar, com.bumptech.glide.b.d(context).f(), context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    @m0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.Q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    @m0
    public v3.a d() {
        return v3.a.LOCAL;
    }

    public void f(@m0 h hVar, @m0 d.a<? super InputStream> aVar) {
        try {
            InputStream h10 = h();
            this.Q = h10;
            aVar.e(h10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable(R, 3);
            aVar.c(e10);
        }
    }

    public final InputStream h() throws FileNotFoundException {
        InputStream d10 = this.P.d(this.O);
        int a10 = d10 != null ? this.P.a(this.O) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }
}
