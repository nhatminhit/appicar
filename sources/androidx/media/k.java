package androidx.media;

import android.content.Context;
import androidx.media.j;
import d.m0;
import d.t0;

@t0(21)
public class k extends n {
    public k(Context context) {
        super(context);
        this.f3016a = context;
    }

    public boolean a(@m0 j.c cVar) {
        return d(cVar) || super.a(cVar);
    }

    public final boolean d(@m0 j.c cVar) {
        return e().checkPermission(n.f3014f, cVar.c(), cVar.b()) == 0;
    }
}
