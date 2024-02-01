package pl.droidsonroids.gif;

import android.graphics.Bitmap;
import d.e0;
import d.m0;
import d.o0;
import java.io.IOException;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final GifInfoHandle f22106a;

    public d(@m0 m mVar) throws IOException {
        this(mVar, (i) null);
    }

    public d(@m0 m mVar, @o0 i iVar) throws IOException {
        GifInfoHandle c10 = mVar.c();
        this.f22106a = c10;
        if (iVar != null) {
            c10.K(iVar.f22131a, iVar.f22132b);
        }
    }

    public final void a(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is recycled");
        } else if (bitmap.getWidth() < this.f22106a.q() || bitmap.getHeight() < this.f22106a.i()) {
            throw new IllegalArgumentException("Bitmap ia too small, size must be greater than or equal to GIF size");
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Only Config.ARGB_8888 is supported. Current bitmap config: " + bitmap.getConfig());
        }
    }

    public long b() {
        return this.f22106a.b();
    }

    public String c() {
        return this.f22106a.c();
    }

    public int d() {
        return this.f22106a.g();
    }

    public int e(@e0(from = 0) int i10) {
        return this.f22106a.h(i10);
    }

    public int f() {
        return this.f22106a.i();
    }

    public int g() {
        return this.f22106a.j();
    }

    public int h() {
        return this.f22106a.n();
    }

    public long i() {
        return this.f22106a.p();
    }

    public int j() {
        return this.f22106a.q();
    }

    public boolean k() {
        return this.f22106a.n() > 1 && d() > 0;
    }

    public void l() {
        this.f22106a.A();
    }

    public void m(@e0(from = 0, to = 2147483647L) int i10, @m0 Bitmap bitmap) {
        a(bitmap);
        this.f22106a.G(i10, bitmap);
    }

    public void n(@e0(from = 0, to = 2147483647L) int i10, @m0 Bitmap bitmap) {
        a(bitmap);
        this.f22106a.I(i10, bitmap);
    }
}
