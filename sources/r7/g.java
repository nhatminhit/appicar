package r7;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.ui.c;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ c.b O;
    public final /* synthetic */ Bitmap P;

    public /* synthetic */ g(c.b bVar, Bitmap bitmap) {
        this.O = bVar;
        this.P = bitmap;
    }

    public final void run() {
        this.O.b(this.P);
    }
}
