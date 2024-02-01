package ec;

import androidx.lifecycle.p;
import bc.c;
import fh.g;
import ve.h;
import xe.l0;

@h(name = "YouTubePlayerUtils")
public final class i {
    public static final void a(@g c cVar, @g p pVar, @g String str, float f10) {
        l0.p(cVar, "<this>");
        l0.p(pVar, "lifecycle");
        l0.p(str, "videoId");
        b(cVar, pVar.b() == p.b.RESUMED, str, f10);
    }

    public static final /* synthetic */ void b(c cVar, boolean z10, String str, float f10) {
        l0.p(cVar, "<this>");
        l0.p(str, "videoId");
        if (z10) {
            cVar.A(str, f10);
        } else {
            cVar.t(str, f10);
        }
    }
}
