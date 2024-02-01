package f4;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import d.m0;
import d.o0;
import d.t0;
import g4.p;
import g4.q;
import g4.w;
import java.io.IOException;
import v3.b;
import v3.h;
import v3.i;
import v3.j;
import v3.k;
import y3.v;

@t0(api = 28)
public abstract class a<T> implements k<ImageDecoder.Source, T> {

    /* renamed from: b  reason: collision with root package name */
    public static final String f7328b = "ImageDecoder";

    /* renamed from: a  reason: collision with root package name */
    public final w f7329a = w.a();

    /* renamed from: f4.a$a  reason: collision with other inner class name */
    public class C0122a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7330a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f7331b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f7332c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f7333d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p f7334e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ j f7335f;

        /* renamed from: f4.a$a$a  reason: collision with other inner class name */
        public class C0123a implements ImageDecoder.OnPartialImageListener {
            public C0123a() {
            }

            public boolean onPartialImage(@m0 ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0122a(int i10, int i11, boolean z10, b bVar, p pVar, j jVar) {
            this.f7330a = i10;
            this.f7331b = i11;
            this.f7332c = z10;
            this.f7333d = bVar;
            this.f7334e = pVar;
            this.f7335f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z10 = false;
            if (a.this.f7329a.c(this.f7330a, this.f7331b, this.f7332c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f7333d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0123a());
            Size size = imageInfo.getSize();
            int i10 = this.f7330a;
            if (i10 == Integer.MIN_VALUE) {
                i10 = size.getWidth();
            }
            int i11 = this.f7331b;
            if (i11 == Integer.MIN_VALUE) {
                i11 = size.getHeight();
            }
            float b10 = this.f7334e.b(size.getWidth(), size.getHeight(), i10, i11);
            int round = Math.round(((float) size.getWidth()) * b10);
            int round2 = Math.round(((float) size.getHeight()) * b10);
            if (Log.isLoggable(a.f7328b, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Resizing from [");
                sb2.append(size.getWidth());
                sb2.append("x");
                sb2.append(size.getHeight());
                sb2.append("] to [");
                sb2.append(round);
                sb2.append("x");
                sb2.append(round2);
                sb2.append("] scaleFactor: ");
                sb2.append(b10);
            }
            imageDecoder.setTargetSize(round, round2);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (this.f7335f == j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                if (z10) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i12 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    public abstract v<T> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @o0
    /* renamed from: d */
    public final v<T> a(@m0 ImageDecoder.Source source, int i10, int i11, @m0 i iVar) throws IOException {
        b bVar = (b) iVar.c(q.f7992g);
        p pVar = (p) iVar.c(p.f7989h);
        h hVar = q.f7996k;
        return c(source, i10, i11, new C0122a(i10, i11, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), bVar, pVar, (j) iVar.c(q.f7993h)));
    }

    /* renamed from: e */
    public final boolean b(@m0 ImageDecoder.Source source, @m0 i iVar) {
        return true;
    }
}
