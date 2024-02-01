package dd;

import android.graphics.Bitmap;
import android.widget.ImageView;
import qa.w;
import ya.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17825a = "QRUtil";

    public void a(String str, ImageView imageView, int i10) {
        try {
            b a10 = new ub.b().a(str, qa.a.QR_CODE, i10, i10);
            int s10 = a10.s();
            int n10 = a10.n();
            Bitmap createBitmap = Bitmap.createBitmap(s10, n10, Bitmap.Config.RGB_565);
            for (int i11 = 0; i11 < s10; i11++) {
                for (int i12 = 0; i12 < n10; i12++) {
                    createBitmap.setPixel(i11, i12, a10.j(i11, i12) ? -16777216 : -1);
                }
            }
            imageView.setImageBitmap(createBitmap);
        } catch (w e10) {
            e10.getMessage();
        }
    }
}
