package com.fasterxml.jackson.databind.node;

import i5.m;
import i5.v;
import i5.w;
import java.io.IOException;
import r5.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5008a;

    /* renamed from: b  reason: collision with root package name */
    public static final w f5009b;

    /* renamed from: c  reason: collision with root package name */
    public static final w f5010c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f5011d;

    static {
        a aVar = new a();
        f5008a = aVar;
        f5009b = aVar.H3();
        f5010c = aVar.H3().X();
        f5011d = aVar.B2(m.class);
    }

    public static m a(byte[] bArr) throws IOException {
        return (m) f5011d.V0(bArr);
    }

    public static String b(m mVar) {
        try {
            return f5010c.A0(mVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String c(m mVar) {
        try {
            return f5009b.A0(mVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static byte[] d(Object obj) throws IOException {
        return f5008a.F3(obj);
    }
}
