package t7;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import d.o0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class m0 extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final String f13111l = "rawresource";

    /* renamed from: f  reason: collision with root package name */
    public final Resources f13112f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public Uri f13113g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f13114h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public InputStream f13115i;

    /* renamed from: j  reason: collision with root package name */
    public long f13116j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13117k;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str) {
            super(str);
        }
    }

    public m0(Context context) {
        super(false);
        this.f13112f = context.getResources();
    }

    @Deprecated
    public m0(Context context, @o0 r0 r0Var) {
        this(context);
        if (r0Var != null) {
            d(r0Var);
        }
    }

    public static Uri l(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public long a(o oVar) throws a {
        try {
            Uri uri = oVar.f13130a;
            this.f13113g = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                int parseInt = Integer.parseInt(this.f13113g.getLastPathSegment());
                j(oVar);
                this.f13114h = this.f13112f.openRawResourceFd(parseInt);
                FileInputStream fileInputStream = new FileInputStream(this.f13114h.getFileDescriptor());
                this.f13115i = fileInputStream;
                fileInputStream.skip(this.f13114h.getStartOffset());
                if (this.f13115i.skip(oVar.f13135f) >= oVar.f13135f) {
                    long j10 = oVar.f13136g;
                    long j11 = -1;
                    if (j10 != -1) {
                        this.f13116j = j10;
                    } else {
                        long length = this.f13114h.getLength();
                        if (length != -1) {
                            j11 = length - oVar.f13135f;
                        }
                        this.f13116j = j11;
                    }
                    this.f13117k = true;
                    k(oVar);
                    return this.f13116j;
                }
                throw new EOFException();
            }
            throw new a("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.");
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public void close() throws a {
        this.f13113g = null;
        try {
            InputStream inputStream = this.f13115i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13115i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f13114h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f13114h = null;
                if (this.f13117k) {
                    this.f13117k = false;
                    i();
                }
            } catch (IOException e10) {
                throw new a(e10);
            } catch (Throwable th2) {
                this.f13114h = null;
                if (this.f13117k) {
                    this.f13117k = false;
                    i();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a(e11);
        } catch (Throwable th3) {
            this.f13115i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f13114h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f13114h = null;
                if (this.f13117k) {
                    this.f13117k = false;
                    i();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a(e12);
            } catch (Throwable th4) {
                this.f13114h = null;
                if (this.f13117k) {
                    this.f13117k = false;
                    i();
                }
                throw th4;
            }
        }
    }

    @o0
    public Uri g() {
        return this.f13113g;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13116j;
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
        int read = this.f13115i.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f13116j;
            if (j11 != -1) {
                this.f13116j = j11 - ((long) read);
            }
            h(read);
            return read;
        } else if (this.f13116j == -1) {
            return -1;
        } else {
            throw new a((IOException) new EOFException());
        }
    }
}
