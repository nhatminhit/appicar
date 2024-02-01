package g4;

import android.graphics.Bitmap;
import d.m0;
import g4.q;
import java.io.IOException;
import java.io.InputStream;
import t4.d;
import v3.i;
import v3.k;
import y3.v;
import z3.b;
import z3.e;

public class f0 implements k<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final q f7919a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7920b;

    public static class a implements q.b {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f7921a;

        /* renamed from: b  reason: collision with root package name */
        public final d f7922b;

        public a(b0 b0Var, d dVar) {
            this.f7921a = b0Var;
            this.f7922b = dVar;
        }

        public void a() {
            this.f7921a.f();
        }

        public void b(e eVar, Bitmap bitmap) throws IOException {
            IOException f10 = this.f7922b.f();
            if (f10 != null) {
                if (bitmap != null) {
                    eVar.d(bitmap);
                }
                throw f10;
            }
        }
    }

    public f0(q qVar, b bVar) {
        this.f7919a = qVar;
        this.f7920b = bVar;
    }

    /* renamed from: c */
    public v<Bitmap> a(@m0 InputStream inputStream, int i10, int i11, @m0 i iVar) throws IOException {
        b0 b0Var;
        boolean z10;
        if (inputStream instanceof b0) {
            b0Var = (b0) inputStream;
            z10 = false;
        } else {
            z10 = true;
            b0Var = new b0(inputStream, this.f7920b);
        }
        d g10 = d.g(b0Var);
        try {
            return this.f7919a.g(new t4.i(g10), i10, i11, iVar, new a(b0Var, g10));
        } finally {
            g10.a();
            if (z10) {
                b0Var.a();
            }
        }
    }

    /* renamed from: d */
    public boolean b(@m0 InputStream inputStream, @m0 i iVar) {
        return this.f7919a.p(inputStream);
    }
}
