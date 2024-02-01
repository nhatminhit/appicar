package e4;

import android.content.Context;
import android.net.Uri;
import d.m0;
import d.o0;
import d4.n;
import d4.o;
import d4.r;
import g4.k0;
import java.io.InputStream;
import v3.i;
import x3.b;
import x3.c;

public class e implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6817a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6818a;

        public a(Context context) {
            this.f6818a = context;
        }

        @m0
        public n<Uri, InputStream> a(r rVar) {
            return new e(this.f6818a);
        }

        public void b() {
        }
    }

    public e(Context context) {
        this.f6817a = context.getApplicationContext();
    }

    @o0
    /* renamed from: c */
    public n.a<InputStream> b(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        if (!b.d(i10, i11) || !e(iVar)) {
            return null;
        }
        return new n.a<>(new s4.e(uri), c.g(this.f6817a, uri));
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return b.c(uri);
    }

    public final boolean e(i iVar) {
        Long l10 = (Long) iVar.c(k0.f7941g);
        return l10 != null && l10.longValue() == -1;
    }
}
