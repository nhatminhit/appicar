package e4;

import android.content.Context;
import android.net.Uri;
import d.m0;
import d4.n;
import d4.o;
import d4.r;
import java.io.InputStream;
import s4.e;
import v3.i;
import x3.b;
import x3.c;

public class d implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6815a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6816a;

        public a(Context context) {
            this.f6816a = context;
        }

        @m0
        public n<Uri, InputStream> a(r rVar) {
            return new d(this.f6816a);
        }

        public void b() {
        }
    }

    public d(Context context) {
        this.f6815a = context.getApplicationContext();
    }

    /* renamed from: c */
    public n.a<InputStream> b(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        if (b.d(i10, i11)) {
            return new n.a<>(new e(uri), c.e(this.f6815a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return b.a(uri);
    }
}
