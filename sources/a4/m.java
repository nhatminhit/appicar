package a4;

import d.m0;
import e1.m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t4.h;
import t4.k;
import u4.a;
import u4.c;
import v3.f;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final h<f, String> f189a = new h<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final m.a<b> f190b = u4.a.e(10, new a());

    public class a implements a.d<b> {
        public a() {
        }

        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements a.f {
        public final MessageDigest O;
        public final c P = c.a();

        public b(MessageDigest messageDigest) {
            this.O = messageDigest;
        }

        @m0
        public c i() {
            return this.P;
        }
    }

    public final String a(f fVar) {
        b bVar = (b) k.d(this.f190b.b());
        try {
            fVar.a(bVar.O);
            return t4.m.w(bVar.O.digest());
        } finally {
            this.f190b.a(bVar);
        }
    }

    public String b(f fVar) {
        String k10;
        synchronized (this.f189a) {
            k10 = this.f189a.k(fVar);
        }
        if (k10 == null) {
            k10 = a(fVar);
        }
        synchronized (this.f189a) {
            this.f189a.o(fVar, k10);
        }
        return k10;
    }
}
