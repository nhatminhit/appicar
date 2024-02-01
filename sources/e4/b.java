package e4;

import d.m0;
import d.o0;
import d4.g;
import d4.m;
import d4.n;
import d4.o;
import d4.r;
import java.io.InputStream;
import v3.h;
import v3.i;
import w3.j;

public class b implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final h<Integer> f6810b = h.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final m<g, g> f6811a;

    public static class a implements o<g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<g, g> f6812a = new m<>(500);

        @m0
        public n<g, InputStream> a(r rVar) {
            return new b(this.f6812a);
        }

        public void b() {
        }
    }

    public b() {
        this((m<g, g>) null);
    }

    public b(@o0 m<g, g> mVar) {
        this.f6811a = mVar;
    }

    /* renamed from: c */
    public n.a<InputStream> b(@m0 g gVar, int i10, int i11, @m0 i iVar) {
        m<g, g> mVar = this.f6811a;
        if (mVar != null) {
            g b10 = mVar.b(gVar, 0, 0);
            if (b10 == null) {
                this.f6811a.c(gVar, 0, 0, gVar);
            } else {
                gVar = b10;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) iVar.c(f6810b)).intValue()));
    }

    /* renamed from: d */
    public boolean a(@m0 g gVar) {
        return true;
    }
}
