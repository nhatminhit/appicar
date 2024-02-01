package n0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import d.t0;
import fh.g;
import kotlin.Metadata;
import we.q;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\bø\u0001\u0000\u001aU\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lzd/v0;", "name", "info", "source", "Lzd/u2;", "Lzd/u;", "action", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/drawable/Drawable;", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class g0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, u2> f10719a;

        public a(q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, u2> qVar) {
            this.f10719a = qVar;
        }

        public final void onHeaderDecoded(@g ImageDecoder imageDecoder, @g ImageDecoder.ImageInfo imageInfo, @g ImageDecoder.Source source) {
            l0.p(imageDecoder, "decoder");
            l0.p(imageInfo, "info");
            l0.p(source, b4.a.P);
            this.f10719a.y(imageDecoder, imageInfo, source);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, u2> f10720a;

        public b(q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, u2> qVar) {
            this.f10720a = qVar;
        }

        public final void onHeaderDecoded(@g ImageDecoder imageDecoder, @g ImageDecoder.ImageInfo imageInfo, @g ImageDecoder.Source source) {
            l0.p(imageDecoder, "decoder");
            l0.p(imageInfo, "info");
            l0.p(source, b4.a.P);
            this.f10720a.y(imageDecoder, imageInfo, source);
        }
    }

    @t0(28)
    @g
    public static final Bitmap a(@g ImageDecoder.Source source, @g q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, u2> qVar) {
        l0.p(source, "<this>");
        l0.p(qVar, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new a(qVar));
        l0.o(decodeBitmap, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Bitmap {\n    return ImageDecoder.decodeBitmap(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return decodeBitmap;
    }

    @t0(28)
    @g
    public static final Drawable b(@g ImageDecoder.Source source, @g q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, u2> qVar) {
        l0.p(source, "<this>");
        l0.p(qVar, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new b(qVar));
        l0.o(decodeDrawable, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Drawable {\n    return ImageDecoder.decodeDrawable(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return decodeDrawable;
    }
}
