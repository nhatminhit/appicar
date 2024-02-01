package t7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import d.o0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import zb.r;

public final class h extends e {

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f13072f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public Uri f13073g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f13074h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public FileInputStream f13075i;

    /* renamed from: j  reason: collision with root package name */
    public long f13076j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13077k;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public h(Context context) {
        super(false);
        this.f13072f = context.getContentResolver();
    }

    @Deprecated
    public h(Context context, @o0 r0 r0Var) {
        this(context);
        if (r0Var != null) {
            d(r0Var);
        }
    }

    public long a(o oVar) throws a {
        try {
            this.f13073g = oVar.f13130a;
            j(oVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f13072f.openAssetFileDescriptor(this.f13073g, r.f25096b);
            this.f13074h = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f13075i = new FileInputStream(this.f13074h.getFileDescriptor());
                long startOffset = this.f13074h.getStartOffset();
                long skip = this.f13075i.skip(oVar.f13135f + startOffset) - startOffset;
                if (skip == oVar.f13135f) {
                    long j10 = oVar.f13136g;
                    long j11 = -1;
                    if (j10 != -1) {
                        this.f13076j = j10;
                    } else {
                        long length = this.f13074h.getLength();
                        if (length == -1) {
                            FileChannel channel = this.f13075i.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j11 = size - channel.position();
                            }
                            this.f13076j = j11;
                        } else {
                            this.f13076j = length - skip;
                        }
                    }
                    this.f13077k = true;
                    k(oVar);
                    return this.f13076j;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f13073g);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public void close() throws a {
        this.f13073g = null;
        try {
            FileInputStream fileInputStream = this.f13075i;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f13075i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f13074h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f13074h = null;
                if (this.f13077k) {
                    this.f13077k = false;
                    i();
                }
            } catch (IOException e10) {
                throw new a(e10);
            } catch (Throwable th2) {
                this.f13074h = null;
                if (this.f13077k) {
                    this.f13077k = false;
                    i();
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw new a(e11);
        } catch (Throwable th3) {
            this.f13075i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f13074h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f13074h = null;
                if (this.f13077k) {
                    this.f13077k = false;
                    i();
                }
                throw th3;
            } catch (IOException e12) {
                throw new a(e12);
            } catch (Throwable th4) {
                this.f13074h = null;
                if (this.f13077k) {
                    this.f13077k = false;
                    i();
                }
                throw th4;
            }
        }
    }

    @o0
    public Uri g() {
        return this.f13073g;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13076j;
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
        int read = this.f13075i.read(bArr, i10, i11);
        if (read != -1) {
            long j11 = this.f13076j;
            if (j11 != -1) {
                this.f13076j = j11 - ((long) read);
            }
            h(read);
            return read;
        } else if (this.f13076j == -1) {
            return -1;
        } else {
            throw new a(new EOFException());
        }
    }
}
