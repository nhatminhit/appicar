package yb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import qa.n;
import qa.t;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public r f24758a;

    /* renamed from: b  reason: collision with root package name */
    public int f24759b;

    /* renamed from: c  reason: collision with root package name */
    public int f24760c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f24761d;

    /* renamed from: e  reason: collision with root package name */
    public int f24762e = 1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24763f;

    public y(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f24758a = new r(bArr, i10, i11);
        this.f24760c = i13;
        this.f24759b = i12;
        if (i10 * i11 > bArr.length) {
            throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
        }
    }

    public n a() {
        r a10 = this.f24758a.h(this.f24760c).a(this.f24761d, this.f24762e);
        return new n(a10.b(), a10.d(), a10.c(), 0, 0, a10.d(), a10.c(), false);
    }

    public Bitmap b() {
        return c(1);
    }

    public Bitmap c(int i10) {
        return d(this.f24761d, i10);
    }

    public Bitmap d(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f24758a.d(), this.f24758a.c());
        } else if (l()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f24758a.b(), this.f24759b, this.f24758a.d(), this.f24758a.c(), (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f24760c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) this.f24760c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    public Rect e() {
        return this.f24761d;
    }

    public byte[] f() {
        return this.f24758a.b();
    }

    public int g() {
        return this.f24758a.c();
    }

    public int h() {
        return this.f24758a.d();
    }

    public int i() {
        return this.f24759b;
    }

    public int j() {
        return this.f24762e;
    }

    public boolean k() {
        return this.f24763f;
    }

    public boolean l() {
        return this.f24760c % 180 != 0;
    }

    public void m(Rect rect) {
        this.f24761d = rect;
    }

    public void n(boolean z10) {
        this.f24763f = z10;
    }

    public void o(int i10) {
        this.f24762e = i10;
    }

    public t p(t tVar) {
        float c10 = (tVar.c() * ((float) this.f24762e)) + ((float) this.f24761d.left);
        float d10 = (tVar.d() * ((float) this.f24762e)) + ((float) this.f24761d.top);
        if (this.f24763f) {
            c10 = ((float) this.f24758a.d()) - c10;
        }
        return new t(c10, d10);
    }
}
