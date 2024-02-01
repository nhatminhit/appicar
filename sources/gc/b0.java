package gc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import gc.v;
import java.io.IOException;
import java.io.InputStream;

public abstract class b0 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final v.e f18974a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f18975b;

        /* renamed from: c  reason: collision with root package name */
        public final InputStream f18976c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18977d;

        public a(Bitmap bitmap, v.e eVar) {
            this((Bitmap) j0.e(bitmap, "bitmap == null"), (InputStream) null, eVar, 0);
        }

        public a(Bitmap bitmap, InputStream inputStream, v.e eVar, int i10) {
            boolean z10 = true;
            if ((inputStream == null ? false : z10) ^ (bitmap != null)) {
                this.f18975b = bitmap;
                this.f18976c = inputStream;
                this.f18974a = (v.e) j0.e(eVar, "loadedFrom == null");
                this.f18977d = i10;
                return;
            }
            throw new AssertionError();
        }

        public a(InputStream inputStream, v.e eVar) {
            this((Bitmap) null, (InputStream) j0.e(inputStream, "stream == null"), eVar, 0);
        }

        public Bitmap a() {
            return this.f18975b;
        }

        public int b() {
            return this.f18977d;
        }

        public v.e c() {
            return this.f18974a;
        }

        public InputStream d() {
            return this.f18976c;
        }
    }

    public static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, z zVar) {
        int i14;
        double d10;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                d10 = (double) (((float) i12) / ((float) i10));
            } else if (i10 == 0) {
                d10 = (double) (((float) i13) / ((float) i11));
            } else {
                int floor = (int) Math.floor((double) (((float) i13) / ((float) i11)));
                int floor2 = (int) Math.floor((double) (((float) i12) / ((float) i10)));
                i14 = zVar.f19172k ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i14 = (int) Math.floor(d10);
        } else {
            i14 = 1;
        }
        options.inSampleSize = i14;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i10, int i11, BitmapFactory.Options options, z zVar) {
        a(i10, i11, options.outWidth, options.outHeight, options, zVar);
    }

    public static BitmapFactory.Options d(z zVar) {
        boolean d10 = zVar.d();
        boolean z10 = zVar.f19178q != null;
        BitmapFactory.Options options = null;
        if (d10 || z10) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = d10;
            if (z10) {
                options.inPreferredConfig = zVar.f19178q;
            }
        }
        return options;
    }

    public static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(z zVar);

    public int e() {
        return 0;
    }

    public abstract a f(z zVar, int i10) throws IOException;

    public boolean h(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    public boolean i() {
        return false;
    }
}
