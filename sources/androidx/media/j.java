package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.util.Log;
import androidx.media.m;
import androidx.media.n;
import d.m0;
import d.o0;
import d.t0;
import d.x0;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3002b = "MediaSessionManager";

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3003c = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: d  reason: collision with root package name */
    public static final Object f3004d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static volatile j f3005e;

    /* renamed from: a  reason: collision with root package name */
    public a f3006a;

    public interface a {
        boolean a(c cVar);

        Context e();
    }

    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final String f3007b = "android.media.session.MediaController";

        /* renamed from: a  reason: collision with root package name */
        public c f3008a;

        @t0(28)
        @x0({x0.a.P})
        public b(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            this.f3008a = new m.a(mediaSessionManager$RemoteUserInfo);
        }

        public b(@m0 String str, int i10, int i11) {
            this.f3008a = Build.VERSION.SDK_INT >= 28 ? new m.a(str, i10, i11) : new n.a(str, i10, i11);
        }

        @m0
        public String a() {
            return this.f3008a.n();
        }

        public int b() {
            return this.f3008a.c();
        }

        public int c() {
            return this.f3008a.b();
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f3008a.equals(((b) obj).f3008a);
        }

        public int hashCode() {
            return this.f3008a.hashCode();
        }
    }

    public interface c {
        int b();

        int c();

        String n();
    }

    public j(Context context) {
        this.f3006a = Build.VERSION.SDK_INT >= 28 ? new m(context) : new k(context);
    }

    @m0
    public static j b(@m0 Context context) {
        j jVar = f3005e;
        if (jVar == null) {
            synchronized (f3004d) {
                jVar = f3005e;
                if (jVar == null) {
                    f3005e = new j(context.getApplicationContext());
                    jVar = f3005e;
                }
            }
        }
        return jVar;
    }

    public Context a() {
        return this.f3006a.e();
    }

    public boolean c(@m0 b bVar) {
        if (bVar != null) {
            return this.f3006a.a(bVar.f3008a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
