package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b9.l;
import d.o0;
import j8.c;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final e f5762a;

    /* renamed from: b  reason: collision with root package name */
    public int f5763b = 0;

    public h(Uri uri, int i10) {
        this.f5762a = new e(uri);
        this.f5763b = i10;
    }

    public abstract void a(@o0 Drawable drawable, boolean z10, boolean z11, boolean z12);

    public final void b(Context context, l lVar, boolean z10) {
        int i10 = this.f5763b;
        a(i10 != 0 ? context.getResources().getDrawable(i10) : null, z10, false, false);
    }

    public final void c(Context context, Bitmap bitmap, boolean z10) {
        c.c(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
