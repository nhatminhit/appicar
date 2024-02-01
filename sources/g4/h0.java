package g4;

import android.graphics.Bitmap;
import d.m0;
import t4.m;
import v3.i;
import v3.k;
import y3.v;

public final class h0 implements k<Bitmap, Bitmap> {

    public static final class a implements v<Bitmap> {
        public final Bitmap O;

        public a(@m0 Bitmap bitmap) {
            this.O = bitmap;
        }

        public void a() {
        }

        @m0
        /* renamed from: b */
        public Bitmap get() {
            return this.O;
        }

        public int c() {
            return m.h(this.O);
        }

        @m0
        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    /* renamed from: c */
    public v<Bitmap> a(@m0 Bitmap bitmap, int i10, int i11, @m0 i iVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean b(@m0 Bitmap bitmap, @m0 i iVar) {
        return true;
    }
}
