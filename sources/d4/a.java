package d4;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import d.m0;
import d4.n;
import java.io.InputStream;
import s4.e;
import v3.i;
import w3.d;
import w3.h;
import w3.n;

public class a<Data> implements n<Uri, Data> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6004c = "android_asset";

    /* renamed from: d  reason: collision with root package name */
    public static final String f6005d = "file:///android_asset/";

    /* renamed from: e  reason: collision with root package name */
    public static final int f6006e = 22;

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f6007a;

    /* renamed from: b  reason: collision with root package name */
    public final C0100a<Data> f6008b;

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    public interface C0100a<Data> {
        d<Data> c(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, C0100a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f6009a;

        public b(AssetManager assetManager) {
            this.f6009a = assetManager;
        }

        @m0
        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new a(this.f6009a, this);
        }

        public void b() {
        }

        public d<ParcelFileDescriptor> c(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }
    }

    public static class c implements o<Uri, InputStream>, C0100a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f6010a;

        public c(AssetManager assetManager) {
            this.f6010a = assetManager;
        }

        @m0
        public n<Uri, InputStream> a(r rVar) {
            return new a(this.f6010a, this);
        }

        public void b() {
        }

        public d<InputStream> c(AssetManager assetManager, String str) {
            return new n(assetManager, str);
        }
    }

    public a(AssetManager assetManager, C0100a<Data> aVar) {
        this.f6007a = assetManager;
        this.f6008b = aVar;
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new e(uri), this.f6008b.c(this.f6007a, uri.toString().substring(f6006e)));
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
