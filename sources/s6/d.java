package s6;

import b6.j0;
import d6.l0;
import j6.j;
import java.io.IOException;
import w7.p;
import w7.w;
import y4.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12653a = "WavHeaderReader";

    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f12654c = 8;

        /* renamed from: a  reason: collision with root package name */
        public final int f12655a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12656b;

        public a(int i10, long j10) {
            this.f12655a = i10;
            this.f12656b = j10;
        }

        public static a a(j jVar, w wVar) throws IOException, InterruptedException {
            jVar.k(wVar.f14880a, 0, 8);
            wVar.Q(0);
            return new a(wVar.l(), wVar.s());
        }
    }

    public static c a(j jVar) throws IOException, InterruptedException {
        a a10;
        StringBuilder sb2;
        w7.a.g(jVar);
        w wVar = new w(16);
        if (a.a(jVar, wVar).f12655a != l0.f6435a) {
            return null;
        }
        jVar.k(wVar.f14880a, 0, 4);
        wVar.Q(0);
        int l10 = wVar.l();
        if (l10 != l0.f6436b) {
            sb2 = new StringBuilder();
            sb2.append("Unsupported RIFF format: ");
            sb2.append(l10);
        } else {
            while (true) {
                a10 = a.a(jVar, wVar);
                if (a10.f12655a == l0.f6437c) {
                    break;
                }
                jVar.e((int) a10.f12656b);
            }
            w7.a.i(a10.f12656b >= 16);
            jVar.k(wVar.f14880a, 0, 16);
            wVar.Q(0);
            int v10 = wVar.v();
            int v11 = wVar.v();
            int u10 = wVar.u();
            int u11 = wVar.u();
            int v12 = wVar.v();
            int v13 = wVar.v();
            int i10 = (v11 * v13) / 8;
            if (v12 == i10) {
                int a11 = l0.a(v10, v13);
                if (a11 == 0) {
                    sb2 = new StringBuilder();
                    sb2.append("Unsupported WAV format: ");
                    sb2.append(v13);
                    sb2.append(" bit/sample, type ");
                    sb2.append(v10);
                } else {
                    jVar.e(((int) a10.f12656b) - 16);
                    return new c(v11, u10, u11, v12, v13, a11);
                }
            } else {
                throw new j0("Expected block alignment: " + i10 + "; got: " + v12);
            }
        }
        p.d(f12653a, sb2.toString());
        return null;
    }

    public static void b(j jVar, c cVar) throws IOException, InterruptedException {
        w7.a.g(jVar);
        w7.a.g(cVar);
        jVar.h();
        w wVar = new w(8);
        while (true) {
            a a10 = a.a(jVar, wVar);
            int i10 = a10.f12655a;
            if (i10 != l0.f6438d) {
                int i11 = l0.f6435a;
                if (!(i10 == i11 || i10 == l0.f6437c)) {
                    p.l(f12653a, "Ignoring unknown WAV chunk: " + a10.f12655a);
                }
                long j10 = a10.f12656b + 8;
                if (a10.f12655a == i11) {
                    j10 = 12;
                }
                if (j10 <= c.M0) {
                    jVar.i((int) j10);
                } else {
                    throw new j0("Chunk is too large (~2GB+) to skip; id: " + a10.f12655a);
                }
            } else {
                jVar.i(8);
                int position = (int) jVar.getPosition();
                long j11 = ((long) position) + a10.f12656b;
                long length = jVar.getLength();
                if (length != -1 && j11 > length) {
                    p.l(f12653a, "Data exceeds input length: " + j11 + ", " + length);
                    j11 = length;
                }
                cVar.m(position, j11);
                return;
            }
        }
    }
}
