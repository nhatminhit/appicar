package h7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b6.b;
import b6.c0;
import b6.i;
import com.google.android.exoplayer2.Format;
import d.o0;
import java.util.Collections;
import java.util.List;
import w7.q0;
import w7.s;

public final class l extends b implements Handler.Callback {

    /* renamed from: k0  reason: collision with root package name */
    public static final int f8898k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f8899l0 = 1;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f8900m0 = 2;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f8901n0 = 0;
    @o0
    public final Handler X;
    public final k Y;
    public final h Z;

    /* renamed from: a0  reason: collision with root package name */
    public final c0 f8902a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8903b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f8904c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8905d0;

    /* renamed from: e0  reason: collision with root package name */
    public Format f8906e0;

    /* renamed from: f0  reason: collision with root package name */
    public f f8907f0;

    /* renamed from: g0  reason: collision with root package name */
    public i f8908g0;

    /* renamed from: h0  reason: collision with root package name */
    public j f8909h0;

    /* renamed from: i0  reason: collision with root package name */
    public j f8910i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8911j0;

    @Deprecated
    public interface a extends k {
    }

    public l(k kVar, @o0 Looper looper) {
        this(kVar, looper, h.f8897a);
    }

    public l(k kVar, @o0 Looper looper, h hVar) {
        super(3);
        this.Y = (k) w7.a.g(kVar);
        this.X = looper == null ? null : q0.z(looper, this);
        this.Z = hVar;
        this.f8902a0 = new c0();
    }

    public void A() {
        this.f8906e0 = null;
        K();
        O();
    }

    public void C(long j10, boolean z10) {
        K();
        this.f8903b0 = false;
        this.f8904c0 = false;
        if (this.f8905d0 != 0) {
            P();
            return;
        }
        N();
        this.f8907f0.flush();
    }

    public void G(Format[] formatArr, long j10) throws i {
        Format format = formatArr[0];
        this.f8906e0 = format;
        if (this.f8907f0 != null) {
            this.f8905d0 = 1;
        } else {
            this.f8907f0 = this.Z.a(format);
        }
    }

    public final void K() {
        Q(Collections.emptyList());
    }

    public final long L() {
        int i10 = this.f8911j0;
        if (i10 == -1 || i10 >= this.f8909h0.e()) {
            return Long.MAX_VALUE;
        }
        return this.f8909h0.b(this.f8911j0);
    }

    public final void M(List<b> list) {
        this.Y.j(list);
    }

    public final void N() {
        this.f8908g0 = null;
        this.f8911j0 = -1;
        j jVar = this.f8909h0;
        if (jVar != null) {
            jVar.q();
            this.f8909h0 = null;
        }
        j jVar2 = this.f8910i0;
        if (jVar2 != null) {
            jVar2.q();
            this.f8910i0 = null;
        }
    }

    public final void O() {
        N();
        this.f8907f0.a();
        this.f8907f0 = null;
        this.f8905d0 = 0;
    }

    public final void P() {
        O();
        this.f8907f0 = this.Z.a(this.f8906e0);
    }

    public final void Q(List<b> list) {
        Handler handler = this.X;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            M(list);
        }
    }

    public boolean a() {
        return this.f8904c0;
    }

    public int b(Format format) {
        return this.Z.b(format) ? b.J((h6.l<?>) null, format.Z) ? 4 : 2 : s.m(format.W) ? 1 : 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            M((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    public void m(long j10, long j11) throws i {
        boolean z10;
        if (!this.f8904c0) {
            if (this.f8910i0 == null) {
                this.f8907f0.b(j10);
                try {
                    this.f8910i0 = (j) this.f8907f0.c();
                } catch (g e10) {
                    throw i.c(e10, x());
                }
            }
            if (getState() == 2) {
                if (this.f8909h0 != null) {
                    long L = L();
                    z10 = false;
                    while (L <= j10) {
                        this.f8911j0++;
                        L = L();
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                j jVar = this.f8910i0;
                if (jVar != null) {
                    if (jVar.n()) {
                        if (!z10 && L() == Long.MAX_VALUE) {
                            if (this.f8905d0 == 2) {
                                P();
                            } else {
                                N();
                                this.f8904c0 = true;
                            }
                        }
                    } else if (this.f8910i0.P <= j10) {
                        j jVar2 = this.f8909h0;
                        if (jVar2 != null) {
                            jVar2.q();
                        }
                        j jVar3 = this.f8910i0;
                        this.f8909h0 = jVar3;
                        this.f8910i0 = null;
                        this.f8911j0 = jVar3.a(j10);
                        z10 = true;
                    }
                }
                if (z10) {
                    Q(this.f8909h0.d(j10));
                }
                if (this.f8905d0 != 2) {
                    while (!this.f8903b0) {
                        try {
                            if (this.f8908g0 == null) {
                                i iVar = (i) this.f8907f0.d();
                                this.f8908g0 = iVar;
                                if (iVar == null) {
                                    return;
                                }
                            }
                            if (this.f8905d0 == 1) {
                                this.f8908g0.p(4);
                                this.f8907f0.e(this.f8908g0);
                                this.f8908g0 = null;
                                this.f8905d0 = 2;
                                return;
                            }
                            int H = H(this.f8902a0, this.f8908g0, false);
                            if (H == -4) {
                                if (this.f8908g0.n()) {
                                    this.f8903b0 = true;
                                } else {
                                    i iVar2 = this.f8908g0;
                                    iVar2.W = this.f8902a0.f4302c.f5068a0;
                                    iVar2.s();
                                }
                                this.f8907f0.e(this.f8908g0);
                                this.f8908g0 = null;
                            } else if (H == -3) {
                                return;
                            }
                        } catch (g e11) {
                            throw i.c(e11, x());
                        }
                    }
                }
            }
        }
    }
}
