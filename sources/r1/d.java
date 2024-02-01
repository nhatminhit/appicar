package r1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import d.o0;
import d.t0;

@t0(19)
public class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public Context f12060c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f12061d;

    public d(@o0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f12060c = context;
        this.f12061d = uri;
    }

    public boolean a() {
        return b.a(this.f12060c, this.f12061d);
    }

    public boolean b() {
        return b.b(this.f12060c, this.f12061d);
    }

    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f12060c.getContentResolver(), this.f12061d);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean f() {
        return b.d(this.f12060c, this.f12061d);
    }

    @o0
    public String k() {
        return b.f(this.f12060c, this.f12061d);
    }

    @o0
    public String m() {
        return b.h(this.f12060c, this.f12061d);
    }

    public Uri n() {
        return this.f12061d;
    }

    public boolean o() {
        return b.i(this.f12060c, this.f12061d);
    }

    public boolean q() {
        return b.j(this.f12060c, this.f12061d);
    }

    public boolean r() {
        return b.k(this.f12060c, this.f12061d);
    }

    public long s() {
        return b.l(this.f12060c, this.f12061d);
    }

    public long t() {
        return b.m(this.f12060c, this.f12061d);
    }

    public a[] u() {
        throw new UnsupportedOperationException();
    }

    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
