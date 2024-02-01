package ec;

import bc.a;
import bc.c;
import fh.h;
import g3.j0;
import xe.l0;
import zd.k0;

public final class g extends cc.a {
    public boolean O;
    public boolean P;
    @h
    public a.c Q;
    @h
    public String R;
    public float S;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                bc.a$d[] r0 = bc.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                bc.a$d r1 = bc.a.d.ENDED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                bc.a$d r1 = bc.a.d.PAUSED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                bc.a$d r1 = bc.a.d.PLAYING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f18593a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ec.g.a.<clinit>():void");
        }
    }

    public final void b() {
        this.O = true;
    }

    public void c(@fh.g c cVar, @fh.g String str) {
        l0.p(cVar, "youTubePlayer");
        l0.p(str, "videoId");
        this.R = str;
    }

    public void d(@fh.g c cVar, float f10) {
        l0.p(cVar, "youTubePlayer");
        this.S = f10;
    }

    public void e(@fh.g c cVar, @fh.g a.d dVar) {
        l0.p(cVar, "youTubePlayer");
        l0.p(dVar, "state");
        int i10 = a.f18593a[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.P = false;
        } else if (i10 == 3) {
            this.P = true;
        }
    }

    public final void f() {
        this.O = false;
    }

    public void g(@fh.g c cVar, @fh.g a.c cVar2) {
        l0.p(cVar, "youTubePlayer");
        l0.p(cVar2, "error");
        if (cVar2 == a.c.HTML_5_PLAYER) {
            this.Q = cVar2;
        }
    }

    public void k(@fh.g c cVar, @fh.g String str) {
        l0.p(cVar, j0.D0);
        l0.p(str, "quality");
        throw new k0("An operation is not implemented: " + "Not yet implemented");
    }

    public final void n(@fh.g c cVar) {
        l0.p(cVar, "youTubePlayer");
        String str = this.R;
        if (str != null) {
            boolean z10 = this.P;
            if (z10 && this.Q == a.c.HTML_5_PLAYER) {
                i.b(cVar, this.O, str, this.S);
            } else if (!z10 && this.Q == a.c.HTML_5_PLAYER) {
                cVar.t(str, this.S);
            }
            this.Q = null;
        }
    }
}
