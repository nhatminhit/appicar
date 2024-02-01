package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import b9.l;
import b9.t;
import b9.u;
import com.google.android.gms.common.annotation.KeepName;
import d.m0;
import d.o0;
import j8.c;
import j8.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f5747h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static HashSet f5748i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public static ImageManager f5749j;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5750a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5751b = new u(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f5752c = t.a().a(4, 2);

    /* renamed from: d  reason: collision with root package name */
    public final l f5753d = new l();

    /* renamed from: e  reason: collision with root package name */
    public final Map f5754e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map f5755f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map f5756g = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        public final Uri O;
        public final ArrayList P = new ArrayList();

        public ImageReceiver(Uri uri) {
            super(new u(Looper.getMainLooper()));
            this.O = uri;
        }

        public final void b(h hVar) {
            c.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.P.add(hVar);
        }

        public final void c(h hVar) {
            c.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.P.remove(hVar);
        }

        public final void d() {
            Intent intent = new Intent(f.f9753c);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(f.f9754d, this.O);
            intent.putExtra(f.f9755e, this);
            intent.putExtra(f.f9756f, 3);
            ImageManager.this.f5750a.sendBroadcast(intent);
        }

        public final void onReceiveResult(int i10, Bundle bundle) {
            ImageManager imageManager = ImageManager.this;
            imageManager.f5752c.execute(new b(imageManager, this.O, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface a {
        void a(@m0 Uri uri, @o0 Drawable drawable, boolean z10);
    }

    public ImageManager(Context context, boolean z10) {
        this.f5750a = context.getApplicationContext();
    }

    @m0
    public static ImageManager a(@m0 Context context) {
        if (f5749j == null) {
            f5749j = new ImageManager(context, false);
        }
        return f5749j;
    }

    public void b(@m0 ImageView imageView, int i10) {
        p(new f(imageView, i10));
    }

    public void c(@m0 ImageView imageView, @m0 Uri uri) {
        p(new f(imageView, uri));
    }

    public void d(@m0 ImageView imageView, @m0 Uri uri, int i10) {
        f fVar = new f(imageView, uri);
        fVar.f5763b = i10;
        p(fVar);
    }

    public void e(@m0 a aVar, @m0 Uri uri) {
        p(new g(aVar, uri));
    }

    public void f(@m0 a aVar, @m0 Uri uri, int i10) {
        g gVar = new g(aVar, uri);
        gVar.f5763b = i10;
        p(gVar);
    }

    public final void p(h hVar) {
        c.a("ImageManager.loadImage() must be called in the main thread");
        new c(this, hVar).run();
    }
}
