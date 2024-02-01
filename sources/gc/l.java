package gc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import gc.b0;
import gc.v;
import java.io.IOException;
import w1.a;

public class l extends g {
    public l(Context context) {
        super(context);
    }

    public static int k(Uri uri) throws IOException {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt(a.f14555y, 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public boolean c(z zVar) {
        return "file".equals(zVar.f19165d.getScheme());
    }

    public b0.a f(z zVar, int i10) throws IOException {
        return new b0.a((Bitmap) null, j(zVar), v.e.DISK, k(zVar.f19165d));
    }
}
