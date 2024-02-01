package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class b implements DynamiteModule.b {
    public final DynamiteModule.b.C0096b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0096b bVar = new DynamiteModule.b.C0096b();
        int a10 = aVar.a(context, str, true);
        bVar.f5830b = a10;
        if (a10 != 0) {
            bVar.f5831c = 1;
        } else {
            int b10 = aVar.b(context, str);
            bVar.f5829a = b10;
            if (b10 != 0) {
                bVar.f5831c = -1;
            }
        }
        return bVar;
    }
}
