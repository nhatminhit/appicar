package o0;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import d.t0;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\b¨\u0006\b"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "a", "b", "Landroid/net/Uri;", "c", "", "d", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class l {
    @t0(26)
    @g
    public static final Icon a(@g Bitmap bitmap) {
        l0.p(bitmap, "<this>");
        Icon a10 = Icon.createWithAdaptiveBitmap(bitmap);
        l0.o(a10, "createWithAdaptiveBitmap(this)");
        return a10;
    }

    @t0(26)
    @g
    public static final Icon b(@g Bitmap bitmap) {
        l0.p(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        l0.o(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @t0(26)
    @g
    public static final Icon c(@g Uri uri) {
        l0.p(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        l0.o(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @t0(26)
    @g
    public static final Icon d(@g byte[] bArr) {
        l0.p(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        l0.o(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
