package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class h implements DynamiteModule.b {
    public final DynamiteModule.b.C0096b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0096b bVar = new DynamiteModule.b.C0096b();
        int b10 = aVar.b(context, str);
        bVar.f5829a = b10;
        int i10 = 0;
        int a10 = b10 != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        bVar.f5830b = a10;
        int i11 = bVar.f5829a;
        if (i11 != 0) {
            i10 = i11;
        } else if (a10 == 0) {
            bVar.f5831c = 0;
            return bVar;
        }
        if (a10 >= i10) {
            bVar.f5831c = 1;
        } else {
            bVar.f5831c = -1;
        }
        return bVar;
    }
}
