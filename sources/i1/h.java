package i1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import d.m0;
import d.o0;
import d.t0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c f9011a;

    @t0(25)
    public static final class a implements c {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f9012a;

        public a(@m0 Uri uri, @m0 ClipDescription clipDescription, @o0 Uri uri2) {
            this.f9012a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(@m0 Object obj) {
            this.f9012a = (InputContentInfo) obj;
        }

        @m0
        public Uri a() {
            return this.f9012a.getContentUri();
        }

        public void b() {
            this.f9012a.requestPermission();
        }

        @o0
        public Uri c() {
            return this.f9012a.getLinkUri();
        }

        @m0
        public ClipDescription d() {
            return this.f9012a.getDescription();
        }

        @o0
        public Object e() {
            return this.f9012a;
        }

        public void f() {
            this.f9012a.releasePermission();
        }
    }

    public static final class b implements c {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final Uri f9013a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f9014b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final Uri f9015c;

        public b(@m0 Uri uri, @m0 ClipDescription clipDescription, @o0 Uri uri2) {
            this.f9013a = uri;
            this.f9014b = clipDescription;
            this.f9015c = uri2;
        }

        @m0
        public Uri a() {
            return this.f9013a;
        }

        public void b() {
        }

        @o0
        public Uri c() {
            return this.f9015c;
        }

        @m0
        public ClipDescription d() {
            return this.f9014b;
        }

        @o0
        public Object e() {
            return null;
        }

        public void f() {
        }
    }

    public interface c {
        @m0
        Uri a();

        void b();

        @o0
        Uri c();

        @m0
        ClipDescription d();

        @o0
        Object e();

        void f();
    }

    public h(@m0 Uri uri, @m0 ClipDescription clipDescription, @o0 Uri uri2) {
        this.f9011a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public h(@m0 c cVar) {
        this.f9011a = cVar;
    }

    @o0
    public static h g(@o0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new h(new a(obj));
        }
        return null;
    }

    @m0
    public Uri a() {
        return this.f9011a.a();
    }

    @m0
    public ClipDescription b() {
        return this.f9011a.d();
    }

    @o0
    public Uri c() {
        return this.f9011a.c();
    }

    public void d() {
        this.f9011a.f();
    }

    public void e() {
        this.f9011a.b();
    }

    @o0
    public Object f() {
        return this.f9011a.e();
    }
}
