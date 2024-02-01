package x7;

import com.google.android.exoplayer2.Format;
import x7.q;

public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ q.a O;
    public final /* synthetic */ Format P;

    public /* synthetic */ l(q.a aVar, Format format) {
        this.O = aVar;
        this.P = format;
    }

    public final void run() {
        this.O.q(this.P);
    }
}
