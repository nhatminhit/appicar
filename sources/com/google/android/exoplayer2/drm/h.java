package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.e;
import java.io.IOException;
import java.util.UUID;
import w7.a;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5160a;

    public h(byte[] bArr) {
        this.f5160a = (byte[]) a.g(bArr);
    }

    public byte[] a(UUID uuid, e.a aVar) throws Exception {
        return this.f5160a;
    }

    public byte[] b(UUID uuid, e.C0086e eVar) throws IOException {
        throw new UnsupportedOperationException();
    }
}
