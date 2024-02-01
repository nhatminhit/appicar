package d4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import d.m0;
import d.o0;
import d4.n;
import java.io.File;
import java.io.InputStream;
import v3.i;

public class u<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f6079a;

    public static final class a implements o<String, AssetFileDescriptor> {
        public n<String, AssetFileDescriptor> a(@m0 r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public void b() {
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        @m0
        public n<String, ParcelFileDescriptor> a(@m0 r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        public void b() {
        }
    }

    public static class c implements o<String, InputStream> {
        @m0
        public n<String, InputStream> a(@m0 r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }

        public void b() {
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f6079a = nVar;
    }

    @o0
    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return f(str);
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 String str, int i10, int i11, @m0 i iVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f6079a.a(e10)) {
            return null;
        }
        return this.f6079a.b(e10, i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(@m0 String str) {
        return true;
    }
}
