package n5;

import com.fasterxml.jackson.databind.node.u;
import i5.g;
import i5.k;
import i5.m;
import java.io.IOException;
import u5.f;
import w4.l;
import w4.p;

public class q extends d<m> {
    public static final q U = new q();

    public static final class a extends d<com.fasterxml.jackson.databind.node.a> {
        public static final long U = 1;
        public static final a V = new a();

        public a() {
            super(com.fasterxml.jackson.databind.node.a.class, Boolean.TRUE);
        }

        public static a Q0() {
            return V;
        }

        /* renamed from: O0 */
        public com.fasterxml.jackson.databind.node.a f(l lVar, g gVar) throws IOException {
            return lVar.u2() ? J0(lVar, gVar, gVar.Y()) : (com.fasterxml.jackson.databind.node.a) gVar.i0(com.fasterxml.jackson.databind.node.a.class, lVar);
        }

        /* renamed from: P0 */
        public com.fasterxml.jackson.databind.node.a g(l lVar, g gVar, com.fasterxml.jackson.databind.node.a aVar) throws IOException {
            return (com.fasterxml.jackson.databind.node.a) (lVar.u2() ? M0(lVar, gVar, aVar) : gVar.i0(com.fasterxml.jackson.databind.node.a.class, lVar));
        }
    }

    public static final class b extends d<u> {
        public static final long U = 1;
        public static final b V = new b();

        public b() {
            super(u.class, Boolean.TRUE);
        }

        public static b Q0() {
            return V;
        }

        /* renamed from: O0 */
        public u f(l lVar, g gVar) throws IOException {
            return lVar.v2() ? K0(lVar, gVar, gVar.Y()) : lVar.q2(p.FIELD_NAME) ? L0(lVar, gVar, gVar.Y()) : lVar.q2(p.END_OBJECT) ? gVar.Y().A() : (u) gVar.i0(u.class, lVar);
        }

        /* renamed from: P0 */
        public u g(l lVar, g gVar, u uVar) throws IOException {
            return (u) ((lVar.v2() || lVar.q2(p.FIELD_NAME)) ? N0(lVar, gVar, uVar) : gVar.i0(u.class, lVar));
        }
    }

    public q() {
        super(m.class, (Boolean) null);
    }

    public static k<? extends m> P0(Class<?> cls) {
        return cls == u.class ? b.Q0() : cls == com.fasterxml.jackson.databind.node.a.class ? a.Q0() : U;
    }

    /* renamed from: O0 */
    public m f(l lVar, g gVar) throws IOException {
        int Q = lVar.Q();
        return Q != 1 ? Q != 3 ? I0(lVar, gVar, gVar.Y()) : J0(lVar, gVar, gVar.Y()) : K0(lVar, gVar, gVar.Y());
    }

    /* renamed from: Q0 */
    public m d(g gVar) {
        return gVar.Y().b();
    }

    public /* bridge */ /* synthetic */ Object h(l lVar, g gVar, f fVar) throws IOException {
        return super.h(lVar, gVar, fVar);
    }

    public /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ Boolean u(i5.f fVar) {
        return super.u(fVar);
    }
}
