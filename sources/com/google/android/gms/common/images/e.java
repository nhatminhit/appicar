package com.google.android.gms.common.images;

import android.net.Uri;
import d.o0;
import j8.q;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f5759a;

    public e(Uri uri) {
        this.f5759a = uri;
    }

    public final boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return q.b(((e) obj).f5759a, this.f5759a);
    }

    public final int hashCode() {
        return q.c(this.f5759a);
    }
}
