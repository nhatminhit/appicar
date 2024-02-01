package d6;

import com.google.android.exoplayer2.Format;
import d6.t;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ t.a O;
    public final /* synthetic */ Format P;

    public /* synthetic */ p(t.a aVar, Format format) {
        this.O = aVar;
        this.P = format;
    }

    public final void run() {
        this.O.r(this.P);
    }
}
