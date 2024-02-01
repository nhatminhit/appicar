package t7;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import d.o0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class c extends e {

    /* renamed from: f  reason: collision with root package name */
    public final AssetManager f13053f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public Uri f13054g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public InputStream f13055h;

    /* renamed from: i  reason: collision with root package name */
    public long f13056i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13057j;

    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(Context context) {
        super(false);
        this.f13053f = context.getAssets();
    }

    @Deprecated
    public c(Context context, @o0 r0 r0Var) {
        this(context);
        if (r0Var != null) {
            d(r0Var);
        }
    }

    public long a(o oVar) throws a {
        try {
            Uri uri = oVar.f13130a;
            this.f13054g = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            j(oVar);
            InputStream open = this.f13053f.open(path, 1);
            this.f13055h = open;
            if (open.skip(oVar.f13135f) >= oVar.f13135f) {
                long j10 = oVar.f13136g;
                if (j10 != -1) {
                    this.f13056i = j10;
                } else {
                    long available = (long) this.f13055h.available();
                    this.f13056i = available;
                    if (available == y4.c.M0) {
                        this.f13056i = -1;
                    }
                }
                this.f13057j = true;
                k(oVar);
                return this.f13056i;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public void close() throws a {
        this.f13054g = null;
        try {
            InputStream inputStream = this.f13055h;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13055h = null;
            if (this.f13057j) {
                this.f13057j = false;
                i();
            }
        } catch (IOException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            this.f13055h = null;
            if (this.f13057j) {
                this.f13057j = false;
                i();
            }
            throw th2;
        }
    }

    @o0
    public Uri g() {
        return this.f13054g;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13056i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int read = this.f13055h.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f13056i;
            if (j11 != -1) {
                this.f13056i = j11 - ((long) read);
            }
            h(read);
            return read;
        } else if (this.f13056i == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }
}
