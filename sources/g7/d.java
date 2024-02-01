package g7;

import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;
import t7.j0;
import z6.x;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final i f8087a;

    /* renamed from: b  reason: collision with root package name */
    public final List<StreamKey> f8088b;

    public d(i iVar, List<StreamKey> list) {
        this.f8087a = iVar;
        this.f8088b = list;
    }

    public j0.a<g> a(e eVar) {
        return new x(this.f8087a.a(eVar), this.f8088b);
    }

    public j0.a<g> b() {
        return new x(this.f8087a.b(), this.f8088b);
    }
}
