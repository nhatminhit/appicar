package o0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import d.m0;
import d.o0;
import f1.j;
import java.io.InputStream;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11027a = "RoundedBitmapDrawableFa";

    public static class a extends n {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
            j.b(i10, i11, i12, rect, rect2, 0);
        }

        public boolean h() {
            Bitmap bitmap = this.f11014a;
            return bitmap != null && n0.a.b(bitmap);
        }

        public void o(boolean z10) {
            Bitmap bitmap = this.f11014a;
            if (bitmap != null) {
                n0.a.c(bitmap, z10);
                invalidateSelf();
            }
        }
    }

    @m0
    public static n a(@m0 Resources resources, @o0 Bitmap bitmap) {
        return new m(resources, bitmap);
    }

    @m0
    public static n b(@m0 Resources resources, @m0 InputStream inputStream) {
        n a10 = a(resources, BitmapFactory.decodeStream(inputStream));
        if (a10.b() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RoundedBitmapDrawable cannot decode ");
            sb2.append(inputStream);
        }
        return a10;
    }

    @m0
    public static n c(@m0 Resources resources, @m0 String str) {
        n a10 = a(resources, BitmapFactory.decodeFile(str));
        if (a10.b() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RoundedBitmapDrawable cannot decode ");
            sb2.append(str);
        }
        return a10;
    }
}
