package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import d.m0;
import d8.f;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int O;

    public GooglePlayServicesManifestException(int i10, @m0 String str) {
        super(str);
        this.O = i10;
    }

    public int a() {
        return this.O;
    }

    public int b() {
        return f.f6595a;
    }
}
