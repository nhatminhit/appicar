package d6;

import d.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class y implements l {

    /* renamed from: b  reason: collision with root package name */
    public int f6496b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f6497c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f6498d = -1;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f6499e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f6500f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6501g;

    public y() {
        ByteBuffer byteBuffer = l.f6434a;
        this.f6499e = byteBuffer;
        this.f6500f = byteBuffer;
    }

    @i
    public boolean a() {
        return this.f6501g && this.f6500f == l.f6434a;
    }

    @i
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f6500f;
        this.f6500f = l.f6434a;
        return byteBuffer;
    }

    public boolean c() {
        return this.f6496b != -1;
    }

    public int e() {
        return this.f6497c;
    }

    public int f() {
        return this.f6496b;
    }

    public final void flush() {
        this.f6500f = l.f6434a;
        this.f6501g = false;
        k();
    }

    public int g() {
        return this.f6498d;
    }

    public final void h() {
        this.f6501g = true;
        l();
    }

    public final boolean j() {
        return this.f6500f.hasRemaining();
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public final ByteBuffer n(int i10) {
        if (this.f6499e.capacity() < i10) {
            this.f6499e = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f6499e.clear();
        }
        ByteBuffer byteBuffer = this.f6499e;
        this.f6500f = byteBuffer;
        return byteBuffer;
    }

    public final boolean o(int i10, int i11, int i12) {
        if (i10 == this.f6496b && i11 == this.f6497c && i12 == this.f6498d) {
            return false;
        }
        this.f6496b = i10;
        this.f6497c = i11;
        this.f6498d = i12;
        return true;
    }

    public final void reset() {
        flush();
        this.f6499e = l.f6434a;
        this.f6496b = -1;
        this.f6497c = -1;
        this.f6498d = -1;
        m();
    }
}
