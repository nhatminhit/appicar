package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class d implements DynamiteModule.b {
    public final DynamiteModule.b.C0096b a(Context context, String str, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        DynamiteModule.b.C0096b bVar = new DynamiteModule.b.C0096b();
        int a10 = aVar.a(context, str, false);
        bVar.f5830b = a10;
        if (a10 == 0) {
            bVar.f5831c = 0;
        } else {
            bVar.f5831c = 1;
        }
        return bVar;
    }
}
