package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import d.o0;
import j8.c;
import j8.q;
import java.lang.ref.WeakReference;

public final class g extends h {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f5761c;

    public g(ImageManager.a aVar, Uri uri) {
        super(uri, 0);
        c.c(aVar);
        this.f5761c = new WeakReference(aVar);
    }

    public final void a(@o0 Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageManager.a aVar;
        if (!z11 && (aVar = (ImageManager.a) this.f5761c.get()) != null) {
            aVar.a(this.f5762a.f5759a, drawable, z12);
        }
    }

    public final boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        ImageManager.a aVar = (ImageManager.a) this.f5761c.get();
        ImageManager.a aVar2 = (ImageManager.a) gVar.f5761c.get();
        return aVar2 != null && aVar != null && q.b(aVar2, aVar) && q.b(gVar.f5762a, this.f5762a);
    }

    public final int hashCode() {
        return q.c(this.f5762a);
    }
}
