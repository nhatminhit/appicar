package d7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import d.o0;
import java.util.List;
import java.util.Map;
import t7.h0;
import t7.l;
import t7.o;
import t7.p0;
import w7.a;

public abstract class d implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final o f6515a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6516b;

    /* renamed from: c  reason: collision with root package name */
    public final Format f6517c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6518d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final Object f6519e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6520f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6521g;

    /* renamed from: h  reason: collision with root package name */
    public final p0 f6522h;

    public d(l lVar, o oVar, int i10, Format format, int i11, @o0 Object obj, long j10, long j11) {
        this.f6522h = new p0(lVar);
        this.f6515a = (o) a.g(oVar);
        this.f6516b = i10;
        this.f6517c = format;
        this.f6518d = i11;
        this.f6519e = obj;
        this.f6520f = j10;
        this.f6521g = j11;
    }

    public final long a() {
        return this.f6522h.h();
    }

    public final long d() {
        return this.f6521g - this.f6520f;
    }

    public final Map<String, List<String>> e() {
        return this.f6522h.j();
    }

    public final Uri f() {
        return this.f6522h.i();
    }
}
