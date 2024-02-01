package d4;

import android.net.Uri;
import d.m0;
import d4.n;
import gc.t;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v3.i;

public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f6087b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{t.f19110d, t.f19111e})));

    /* renamed from: a  reason: collision with root package name */
    public final n<g, Data> f6088a;

    public static class a implements o<Uri, InputStream> {
        @m0
        public n<Uri, InputStream> a(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }

        public void b() {
        }
    }

    public x(n<g, Data> nVar) {
        this.f6088a = nVar;
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        return this.f6088a.b(new g(uri.toString()), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return f6087b.contains(uri.getScheme());
    }
}
