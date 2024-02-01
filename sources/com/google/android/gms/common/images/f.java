package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import b9.k;
import com.google.android.gms.internal.base.zal;
import d.o0;
import j8.c;
import j8.q;
import java.lang.ref.WeakReference;

public final class f extends h {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f5760c;

    public f(ImageView imageView, int i10) {
        super(Uri.EMPTY, i10);
        c.c(imageView);
        this.f5760c = new WeakReference(imageView);
    }

    public f(ImageView imageView, Uri uri) {
        super(uri, 0);
        c.c(imageView);
        this.f5760c = new WeakReference(imageView);
    }

    public final void a(@o0 Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageView imageView = (ImageView) this.f5760c.get();
        if (imageView == null) {
            return;
        }
        if (z11 || z12 || !(imageView instanceof zal)) {
            boolean z13 = false;
            if (!z11 && !z10) {
                z13 = true;
            }
            if (z13) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof k) {
                    drawable2 = ((k) drawable2).a();
                }
                drawable = new k(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zal) {
                zal zal = (zal) imageView;
                throw null;
            } else if (drawable != null && z13) {
                ((k) drawable).b(250);
            }
        } else {
            zal zal2 = (zal) imageView;
            throw null;
        }
    }

    public final boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        ImageView imageView = (ImageView) this.f5760c.get();
        ImageView imageView2 = (ImageView) ((f) obj).f5760c.get();
        return (imageView2 == null || imageView == null || !q.b(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
