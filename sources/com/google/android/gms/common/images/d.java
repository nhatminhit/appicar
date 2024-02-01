package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import d.o0;
import j8.c;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class d implements Runnable {
    public final Uri O;
    @o0
    public final Bitmap P;
    public final CountDownLatch Q;
    public final /* synthetic */ ImageManager R;

    public d(ImageManager imageManager, @o0 Uri uri, Bitmap bitmap, boolean z10, CountDownLatch countDownLatch) {
        this.R = imageManager;
        this.O = uri;
        this.P = bitmap;
        this.Q = countDownLatch;
    }

    public final void run() {
        c.a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.P;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.R.f5755f.remove(this.O);
        if (imageReceiver != null) {
            ArrayList a10 = imageReceiver.P;
            int size = a10.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = (h) a10.get(i10);
                Bitmap bitmap2 = this.P;
                if (bitmap2 == null || bitmap == null) {
                    this.R.f5756g.put(this.O, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.R;
                    hVar.b(imageManager.f5750a, imageManager.f5753d, false);
                } else {
                    hVar.c(this.R.f5750a, bitmap2, false);
                }
                if (!(hVar instanceof g)) {
                    this.R.f5754e.remove(hVar);
                }
            }
        }
        this.Q.countDown();
        synchronized (ImageManager.f5747h) {
            ImageManager.f5748i.remove(this.O);
        }
    }
}
