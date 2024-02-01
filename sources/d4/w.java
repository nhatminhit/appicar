package d4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import d.m0;
import d4.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s4.e;
import t7.t;
import w3.i;
import w3.o;

public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f6082b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", t.f13205o})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f6083a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f6084a;

        public a(ContentResolver contentResolver) {
            this.f6084a = contentResolver;
        }

        public n<Uri, AssetFileDescriptor> a(r rVar) {
            return new w(this);
        }

        public void b() {
        }

        public w3.d<AssetFileDescriptor> c(Uri uri) {
            return new w3.a(this.f6084a, uri);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f6085a;

        public b(ContentResolver contentResolver) {
            this.f6085a = contentResolver;
        }

        @m0
        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new w(this);
        }

        public void b() {
        }

        public w3.d<ParcelFileDescriptor> c(Uri uri) {
            return new i(this.f6085a, uri);
        }
    }

    public interface c<Data> {
        w3.d<Data> c(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f6086a;

        public d(ContentResolver contentResolver) {
            this.f6086a = contentResolver;
        }

        @m0
        public n<Uri, InputStream> a(r rVar) {
            return new w(this);
        }

        public void b() {
        }

        public w3.d<InputStream> c(Uri uri) {
            return new o(this.f6086a, uri);
        }
    }

    public w(c<Data> cVar) {
        this.f6083a = cVar;
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 Uri uri, int i10, int i11, @m0 v3.i iVar) {
        return new n.a<>(new e(uri), this.f6083a.c(uri));
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return f6082b.contains(uri.getScheme());
    }
}
