package hj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.k;
import d.m0;
import d.o0;
import java.util.concurrent.Callable;
import q4.e;
import qc.c;
import r4.f;
import y3.j;

public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final String f19676e = "GetHtmlYoutubeController";

    /* renamed from: f  reason: collision with root package name */
    public static a f19677f;

    /* renamed from: a  reason: collision with root package name */
    public Context f19678a;

    /* renamed from: b  reason: collision with root package name */
    public d f19679b;

    /* renamed from: c  reason: collision with root package name */
    public qc.c f19680c;

    /* renamed from: d  reason: collision with root package name */
    public String f19681d = "";

    /* renamed from: hj.a$a  reason: collision with other inner class name */
    public class C0321a implements Callable<Object> {
        public C0321a() {
        }

        public Object call() throws Exception {
            a.this.e();
            return null;
        }
    }

    public class b implements c.a<Object> {
        public b() {
        }

        public void a(Object obj) {
        }
    }

    public class c extends e<Bitmap> {
        public c() {
        }

        /* renamed from: c */
        public void s(@m0 Bitmap bitmap, @o0 f<? super Bitmap> fVar) {
            if (a.this.f19679b != null) {
                a.this.f19679b.a(bitmap);
            }
        }

        public void r(@o0 Drawable drawable) {
        }
    }

    public interface d {
        void a(Bitmap bitmap);
    }

    public a(Context context) {
        this.f19678a = context;
    }

    public static a f(Context context) {
        if (f19677f == null) {
            f19677f = new a(context);
        }
        return f19677f;
    }

    public void a(d dVar, String str) {
        if (this.f19680c != null) {
            this.f19680c = null;
        }
        this.f19679b = dVar;
        qc.c cVar = new qc.c();
        this.f19680c = cVar;
        this.f19681d = str;
        cVar.c(new C0321a(), new b());
    }

    public void d() {
        if (this.f19680c != null) {
            this.f19680c = null;
        }
    }

    public final void e() {
        ((k) com.bumptech.glide.b.D(this.f19678a).w().t(this.f19681d).y(j.f15396e)).m1(new c());
    }
}
