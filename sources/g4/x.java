package g4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import d.o0;
import d.t0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import w3.k;
import w3.m;

public interface x {

    public static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final k f8032a;

        /* renamed from: b  reason: collision with root package name */
        public final z3.b f8033b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f8034c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, z3.b bVar) {
            this.f8033b = (z3.b) t4.k.d(bVar);
            this.f8034c = (List) t4.k.d(list);
            this.f8032a = new k(inputStream, bVar);
        }

        public int a() throws IOException {
            return com.bumptech.glide.load.a.a(this.f8034c, this.f8032a.a(), this.f8033b);
        }

        @o0
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f8032a.a(), (Rect) null, options);
        }

        public void c() {
            this.f8032a.c();
        }

        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.d(this.f8034c, this.f8032a.a(), this.f8033b);
        }
    }

    @t0(21)
    public static final class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public final z3.b f8035a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f8036b;

        /* renamed from: c  reason: collision with root package name */
        public final m f8037c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, z3.b bVar) {
            this.f8035a = (z3.b) t4.k.d(bVar);
            this.f8036b = (List) t4.k.d(list);
            this.f8037c = new m(parcelFileDescriptor);
        }

        public int a() throws IOException {
            return com.bumptech.glide.load.a.b(this.f8036b, this.f8037c, this.f8035a);
        }

        @o0
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f8037c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void c() {
        }

        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.f8036b, this.f8037c, this.f8035a);
        }
    }

    int a() throws IOException;

    @o0
    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
