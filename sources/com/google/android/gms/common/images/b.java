package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import d.o0;
import j8.c;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public final class b implements Runnable {
    public final Uri O;
    @o0
    public final ParcelFileDescriptor P;
    public final /* synthetic */ ImageManager Q;

    public b(ImageManager imageManager, @o0 Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.Q = imageManager;
        this.O = uri;
        this.P = parcelFileDescriptor;
    }

    public final void run() {
        c.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.P;
        Bitmap bitmap = null;
        boolean z10 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.O));
                z10 = true;
            }
            try {
                this.P.close();
            } catch (IOException unused2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.Q;
        imageManager.f5751b.post(new d(imageManager, this.O, bitmap, z10, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            "Latch interrupted while posting ".concat(String.valueOf(this.O));
        }
    }
}
