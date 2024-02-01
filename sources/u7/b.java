package u7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import t7.j;
import t7.o;
import u7.a;
import w7.b0;
import w7.p;
import w7.q0;

public final class b implements j {

    /* renamed from: l  reason: collision with root package name */
    public static final long f13766l = 5242880;

    /* renamed from: m  reason: collision with root package name */
    public static final int f13767m = 20480;

    /* renamed from: n  reason: collision with root package name */
    public static final long f13768n = 2097152;

    /* renamed from: o  reason: collision with root package name */
    public static final String f13769o = "CacheDataSink";

    /* renamed from: a  reason: collision with root package name */
    public final a f13770a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13771b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13772c;

    /* renamed from: d  reason: collision with root package name */
    public o f13773d;

    /* renamed from: e  reason: collision with root package name */
    public long f13774e;

    /* renamed from: f  reason: collision with root package name */
    public File f13775f;

    /* renamed from: g  reason: collision with root package name */
    public OutputStream f13776g;

    /* renamed from: h  reason: collision with root package name */
    public FileOutputStream f13777h;

    /* renamed from: i  reason: collision with root package name */
    public long f13778i;

    /* renamed from: j  reason: collision with root package name */
    public long f13779j;

    /* renamed from: k  reason: collision with root package name */
    public b0 f13780k;

    public static class a extends a.C0232a {
        public a(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    public b(a aVar, long j10) {
        this(aVar, j10, f13767m);
    }

    public b(a aVar, long j10, int i10) {
        w7.a.j(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i11 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
        if (i11 != 0 && j10 < 2097152) {
            p.l(f13769o, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f13770a = (a) w7.a.g(aVar);
        this.f13771b = i11 == 0 ? Long.MAX_VALUE : j10;
        this.f13772c = i10;
    }

    public void a(o oVar) throws a {
        if (oVar.f13136g != -1 || !oVar.c(4)) {
            this.f13773d = oVar;
            this.f13774e = oVar.c(16) ? this.f13771b : Long.MAX_VALUE;
            this.f13779j = 0;
            try {
                c();
            } catch (IOException e10) {
                throw new a(e10);
            }
        } else {
            this.f13773d = null;
        }
    }

    public final void b() throws IOException {
        OutputStream outputStream = this.f13776g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                q0.q(this.f13776g);
                this.f13776g = null;
                File file = this.f13775f;
                this.f13775f = null;
                this.f13770a.i(file, this.f13778i);
            } catch (Throwable th2) {
                q0.q(this.f13776g);
                this.f13776g = null;
                File file2 = this.f13775f;
                this.f13775f = null;
                file2.delete();
                throw th2;
            }
        }
    }

    public final void c() throws IOException {
        long j10 = this.f13773d.f13136g;
        long j11 = -1;
        if (j10 != -1) {
            j11 = Math.min(j10 - this.f13779j, this.f13774e);
        }
        a aVar = this.f13770a;
        o oVar = this.f13773d;
        this.f13775f = aVar.c(oVar.f13137h, oVar.f13134e + this.f13779j, j11);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f13775f);
        this.f13777h = fileOutputStream;
        OutputStream outputStream = fileOutputStream;
        if (this.f13772c > 0) {
            b0 b0Var = this.f13780k;
            if (b0Var == null) {
                this.f13780k = new b0(this.f13777h, this.f13772c);
            } else {
                b0Var.c(fileOutputStream);
            }
            outputStream = this.f13780k;
        }
        this.f13776g = outputStream;
        this.f13778i = 0;
    }

    public void close() throws a {
        if (this.f13773d != null) {
            try {
                b();
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }

    public void write(byte[] bArr, int i10, int i11) throws a {
        if (this.f13773d != null) {
            int i12 = 0;
            while (i12 < i11) {
                try {
                    if (this.f13778i == this.f13774e) {
                        b();
                        c();
                    }
                    int min = (int) Math.min((long) (i11 - i12), this.f13774e - this.f13778i);
                    this.f13776g.write(bArr, i10 + i12, min);
                    i12 += min;
                    long j10 = (long) min;
                    this.f13778i += j10;
                    this.f13779j += j10;
                } catch (IOException e10) {
                    throw new a(e10);
                }
            }
        }
    }
}
