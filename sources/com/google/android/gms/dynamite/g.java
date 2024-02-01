package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class g implements DynamiteModule.b {
    public final DynamiteModule.b.C0096b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0096b bVar = new DynamiteModule.b.C0096b();
        bVar.f5829a = aVar.b(context, str);
        int a10 = aVar.a(context, str, true);
        bVar.f5830b = a10;
        int i10 = bVar.f5829a;
        if (i10 == 0) {
            if (a10 == 0) {
                bVar.f5831c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (a10 >= i10) {
            bVar.f5831c = 1;
        } else {
            bVar.f5831c = -1;
        }
        return bVar;
    }
}
