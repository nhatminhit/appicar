package w3;

import d.m0;
import g4.b0;
import java.io.IOException;
import java.io.InputStream;
import w3.e;
import z3.b;

public final class k implements e<InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f14608b = 5242880;

    /* renamed from: a  reason: collision with root package name */
    public final b0 f14609a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f14610a;

        public a(b bVar) {
            this.f14610a = bVar;
        }

        @m0
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @m0
        /* renamed from: c */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f14610a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        b0 b0Var = new b0(inputStream, bVar);
        this.f14609a = b0Var;
        b0Var.mark(5242880);
    }

    public void b() {
        this.f14609a.a();
    }

    public void c() {
        this.f14609a.f();
    }

    @m0
    /* renamed from: d */
    public InputStream a() throws IOException {
        this.f14609a.reset();
        return this.f14609a;
    }
}
