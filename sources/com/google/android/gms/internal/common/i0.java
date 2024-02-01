package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final z f5837a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5838b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f5839c;

    public i0(f0 f0Var, boolean z10, z zVar, int i10, byte[] bArr) {
        this.f5839c = f0Var;
        this.f5838b = z10;
        this.f5837a = zVar;
    }

    public static i0 c(z zVar) {
        return new i0(new f0(zVar), false, y.f5846b, Integer.MAX_VALUE, (byte[]) null);
    }

    public final i0 b() {
        return new i0(this.f5839c, true, this.f5837a, Integer.MAX_VALUE, (byte[]) null);
    }

    public final Iterable d(CharSequence charSequence) {
        return new g0(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h10 = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h10.hasNext()) {
            arrayList.add((String) h10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator h(CharSequence charSequence) {
        return new e0(this.f5839c, this, charSequence);
    }
}
