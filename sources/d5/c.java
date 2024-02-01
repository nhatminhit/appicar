package d5;

import c5.b;
import c5.d;
import h5.e;
import h5.p;
import java.io.IOException;
import w4.b0;
import w4.i;
import w4.s;
import w4.u;
import y4.a;

public abstract class c extends a {

    /* renamed from: m0  reason: collision with root package name */
    public static final int[] f6104m0 = c5.a.f();

    /* renamed from: g0  reason: collision with root package name */
    public final d f6105g0;

    /* renamed from: h0  reason: collision with root package name */
    public int[] f6106h0 = f6104m0;

    /* renamed from: i0  reason: collision with root package name */
    public int f6107i0;

    /* renamed from: j0  reason: collision with root package name */
    public b f6108j0;

    /* renamed from: k0  reason: collision with root package name */
    public u f6109k0 = e.W;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6110l0;

    public c(d dVar, int i10, s sVar) {
        super(i10, sVar);
        this.f6105g0 = dVar;
        if (i.b.ESCAPE_NON_ASCII.d(i10)) {
            this.f6107i0 = 127;
        }
        this.f6110l0 = !i.b.QUOTE_FIELD_NAMES.d(i10);
    }

    public i L1(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f6107i0 = i10;
        return this;
    }

    public i O1(u uVar) {
        this.f6109k0 = uVar;
        return this;
    }

    public i Q(i.b bVar) {
        super.Q(bVar);
        if (bVar == i.b.QUOTE_FIELD_NAMES) {
            this.f6110l0 = true;
        }
        return this;
    }

    public i Y(i.b bVar) {
        super.Y(bVar);
        if (bVar == i.b.QUOTE_FIELD_NAMES) {
            this.f6110l0 = false;
        }
        return this;
    }

    public b a0() {
        return this.f6108j0;
    }

    public void j3(int i10, int i11) {
        super.j3(i10, i11);
        this.f6110l0 = !i.b.QUOTE_FIELD_NAMES.d(i10);
    }

    public void o3(String str) throws IOException {
        f(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this.S.q()}));
    }

    public i p1(b bVar) {
        this.f6108j0 = bVar;
        if (bVar == null) {
            this.f6106h0 = f6104m0;
        } else {
            this.f6106h0 = bVar.a();
        }
        return this;
    }

    public void p3(String str, int i10) throws IOException {
        if (i10 != 0) {
            if (i10 == 1) {
                this.O.e(this);
            } else if (i10 == 2) {
                this.O.i(this);
            } else if (i10 == 3) {
                this.O.g(this);
            } else if (i10 != 5) {
                h();
            } else {
                o3(str);
            }
        } else if (this.S.k()) {
            this.O.j(this);
        } else if (this.S.l()) {
            this.O.h(this);
        }
    }

    public b0 version() {
        return p.h(getClass());
    }

    public int z0() {
        return this.f6107i0;
    }
}
