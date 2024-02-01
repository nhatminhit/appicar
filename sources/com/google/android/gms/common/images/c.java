package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;

public final class c implements Runnable {
    public final h O;
    public final /* synthetic */ ImageManager P;

    public c(ImageManager imageManager, h hVar) {
        this.P = imageManager;
        this.O = hVar;
    }

    public final void run() {
        j8.c.a("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.P.f5754e.get(this.O);
        if (imageReceiver != null) {
            this.P.f5754e.remove(this.O);
            imageReceiver.c(this.O);
        }
        h hVar = this.O;
        e eVar = hVar.f5762a;
        Uri uri = eVar.f5759a;
        if (uri != null) {
            Long l10 = (Long) this.P.f5756g.get(uri);
            if (l10 != null) {
                if (SystemClock.elapsedRealtime() - l10.longValue() < 3600000) {
                    hVar = this.O;
                } else {
                    this.P.f5756g.remove(eVar.f5759a);
                }
            }
            this.O.a((Drawable) null, false, true, false);
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) this.P.f5755f.get(eVar.f5759a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageManager.ImageReceiver(eVar.f5759a);
                this.P.f5755f.put(eVar.f5759a, imageReceiver2);
            }
            imageReceiver2.b(this.O);
            h hVar2 = this.O;
            if (!(hVar2 instanceof g)) {
                this.P.f5754e.put(hVar2, imageReceiver2);
            }
            synchronized (ImageManager.f5747h) {
                if (!ImageManager.f5748i.contains(eVar.f5759a)) {
                    ImageManager.f5748i.add(eVar.f5759a);
                    imageReceiver2.d();
                }
            }
            return;
        }
        ImageManager imageManager = this.P;
        hVar.b(imageManager.f5750a, imageManager.f5753d, true);
    }
}
