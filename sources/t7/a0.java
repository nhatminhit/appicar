package t7;

import android.net.Uri;
import d.o0;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import zb.r;

public final class a0 extends e {
    @o0

    /* renamed from: f  reason: collision with root package name */
    public RandomAccessFile f13048f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public Uri f13049g;

    /* renamed from: h  reason: collision with root package name */
    public long f13050h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13051i;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public a0() {
        super(false);
    }

    @Deprecated
    public a0(@o0 r0 r0Var) {
        this();
        if (r0Var != null) {
            d(r0Var);
        }
    }

    public long a(o oVar) throws a {
        try {
            this.f13049g = oVar.f13130a;
            j(oVar);
            RandomAccessFile randomAccessFile = new RandomAccessFile(oVar.f13130a.getPath(), r.f25096b);
            this.f13048f = randomAccessFile;
            randomAccessFile.seek(oVar.f13135f);
            long j10 = oVar.f13136g;
            if (j10 == -1) {
                j10 = this.f13048f.length() - oVar.f13135f;
            }
            this.f13050h = j10;
            if (j10 >= 0) {
                this.f13051i = true;
                k(oVar);
                return this.f13050h;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public void close() throws a {
        this.f13049g = null;
        try {
            RandomAccessFile randomAccessFile = this.f13048f;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f13048f = null;
            if (this.f13051i) {
                this.f13051i = false;
                i();
            }
        } catch (IOException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            this.f13048f = null;
            if (this.f13051i) {
                this.f13051i = false;
                i();
            }
            throw th2;
        }
    }

    @o0
    public Uri g() {
        return this.f13049g;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13050h;
        if (j10 == 0) {
            return -1;
        }
        try {
            int read = this.f13048f.read(bArr, i10, (int) Math.min(j10, (long) i11));
            if (read > 0) {
                this.f13050h -= (long) read;
                h(read);
            }
            return read;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }
}
