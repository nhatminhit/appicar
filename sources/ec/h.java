package ec;

import bc.a;
import bc.c;
import cc.a;
import fh.g;
import g3.j0;
import xe.l0;
import zd.k0;

public final class h extends a {
    @g
    public a.d O = a.d.UNKNOWN;
    public float P;
    public float Q;
    @fh.h
    public String R;

    public void a(@g c cVar, float f10) {
        l0.p(cVar, "youTubePlayer");
        this.Q = f10;
    }

    public final float b() {
        return this.P;
    }

    public void c(@g c cVar, @g String str) {
        l0.p(cVar, "youTubePlayer");
        l0.p(str, "videoId");
        this.R = str;
    }

    public void d(@g c cVar, float f10) {
        l0.p(cVar, "youTubePlayer");
        this.P = f10;
    }

    public void e(@g c cVar, @g a.d dVar) {
        l0.p(cVar, "youTubePlayer");
        l0.p(dVar, "state");
        this.O = dVar;
    }

    @g
    public final a.d f() {
        return this.O;
    }

    public void k(@g c cVar, @g String str) {
        l0.p(cVar, j0.D0);
        l0.p(str, "quality");
        throw new k0("An operation is not implemented: " + "Not yet implemented");
    }

    public final float n() {
        return this.Q;
    }

    @fh.h
    public final String o() {
        return this.R;
    }
}
