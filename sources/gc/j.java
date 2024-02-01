package gc;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f19068a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f19069b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19070c;

        /* renamed from: d  reason: collision with root package name */
        public final long f19071d;

        @Deprecated
        public a(Bitmap bitmap, boolean z10) {
            if (bitmap != null) {
                this.f19068a = null;
                this.f19069b = bitmap;
                this.f19070c = z10;
                this.f19071d = -1;
                return;
            }
            throw new IllegalArgumentException("Bitmap may not be null.");
        }

        @Deprecated
        public a(Bitmap bitmap, boolean z10, long j10) {
            this(bitmap, z10);
        }

        @Deprecated
        public a(InputStream inputStream, boolean z10) {
            this(inputStream, z10, -1);
        }

        public a(InputStream inputStream, boolean z10, long j10) {
            if (inputStream != null) {
                this.f19068a = inputStream;
                this.f19069b = null;
                this.f19070c = z10;
                this.f19071d = j10;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Deprecated
        public Bitmap a() {
            return this.f19069b;
        }

        public long b() {
            return this.f19071d;
        }

        public InputStream c() {
            return this.f19068a;
        }
    }

    public static class b extends IOException {
        public final boolean O;
        public final int P;

        public b(String str, int i10, int i11) {
            super(str);
            this.O = s.a(i10);
            this.P = i11;
        }
    }

    a a(Uri uri, int i10) throws IOException;

    void shutdown();
}
