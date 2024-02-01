package y0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import d.e0;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import e1.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import k0.g;
import n0.e1;
import n0.x0;

public class f {
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final String f15266a = "font_results";
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f15267b = -1;
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f15268c = -2;

    public static final class a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final String f15269a = "file_id";

        /* renamed from: b  reason: collision with root package name */
        public static final String f15270b = "font_ttc_index";

        /* renamed from: c  reason: collision with root package name */
        public static final String f15271c = "font_variation_settings";

        /* renamed from: d  reason: collision with root package name */
        public static final String f15272d = "font_weight";

        /* renamed from: e  reason: collision with root package name */
        public static final String f15273e = "font_italic";

        /* renamed from: f  reason: collision with root package name */
        public static final String f15274f = "result_code";

        /* renamed from: g  reason: collision with root package name */
        public static final int f15275g = 0;

        /* renamed from: h  reason: collision with root package name */
        public static final int f15276h = 1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f15277i = 2;

        /* renamed from: j  reason: collision with root package name */
        public static final int f15278j = 3;
    }

    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f15279c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f15280d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f15281e = 2;

        /* renamed from: a  reason: collision with root package name */
        public final int f15282a;

        /* renamed from: b  reason: collision with root package name */
        public final c[] f15283b;

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i10, @o0 c[] cVarArr) {
            this.f15282a = i10;
            this.f15283b = cVarArr;
        }

        public static b a(int i10, @o0 c[] cVarArr) {
            return new b(i10, cVarArr);
        }

        public c[] b() {
            return this.f15283b;
        }

        public int c() {
            return this.f15282a;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f15284a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15285b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15286c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f15287d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15288e;

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@m0 Uri uri, @e0(from = 0) int i10, @e0(from = 1, to = 1000) int i11, boolean z10, int i12) {
            this.f15284a = (Uri) n.g(uri);
            this.f15285b = i10;
            this.f15286c = i11;
            this.f15287d = z10;
            this.f15288e = i12;
        }

        public static c a(@m0 Uri uri, @e0(from = 0) int i10, @e0(from = 1, to = 1000) int i11, boolean z10, int i12) {
            return new c(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f15288e;
        }

        @e0(from = 0)
        public int c() {
            return this.f15285b;
        }

        @m0
        public Uri d() {
            return this.f15284a;
        }

        @e0(from = 1, to = 1000)
        public int e() {
            return this.f15286c;
        }

        public boolean f() {
            return this.f15287d;
        }
    }

    public static class d {
        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final int f15289a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f15290b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f15291c = -1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f15292d = -2;

        /* renamed from: e  reason: collision with root package name */
        public static final int f15293e = -3;

        /* renamed from: f  reason: collision with root package name */
        public static final int f15294f = -4;

        /* renamed from: g  reason: collision with root package name */
        public static final int f15295g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f15296h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f15297i = 3;

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface) {
        }
    }

    @o0
    public static Typeface a(@m0 Context context, @o0 CancellationSignal cancellationSignal, @m0 c[] cVarArr) {
        return n0.x0.c(context, cancellationSignal, cVarArr, 0);
    }

    @m0
    public static b b(@m0 Context context, @o0 CancellationSignal cancellationSignal, @m0 d dVar) throws PackageManager.NameNotFoundException {
        return c.d(context, dVar, cancellationSignal);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, d dVar, @o0 g.c cVar, @o0 Handler handler, boolean z10, int i10, int i11) {
        return f(context, dVar, i11, z10, i10, g.c.c(handler), new x0.a(cVar));
    }

    @g1
    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    @Deprecated
    public static ProviderInfo d(@m0 PackageManager packageManager, @m0 d dVar, @o0 Resources resources) throws PackageManager.NameNotFoundException {
        return c.e(packageManager, dVar, resources);
    }

    @t0(19)
    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return e1.h(context, cVarArr, cancellationSignal);
    }

    @d.x0({x0.a.LIBRARY})
    @o0
    public static Typeface f(@m0 Context context, @m0 d dVar, int i10, boolean z10, @e0(from = 0) int i11, @m0 Handler handler, @m0 d dVar2) {
        a aVar = new a(dVar2, handler);
        return z10 ? e.e(context, dVar, aVar, i10, i11) : e.d(context, dVar, i10, (Executor) null, aVar);
    }

    public static void g(@m0 Context context, @m0 d dVar, @m0 d dVar2, @m0 Handler handler) {
        a aVar = new a(dVar2);
        e.d(context.getApplicationContext(), dVar, 0, g.b(handler), aVar);
    }

    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        e.f();
    }

    @d.x0({x0.a.TESTS})
    @g1
    public static void i() {
        e.f();
    }
}
