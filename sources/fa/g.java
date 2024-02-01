package fa;

import android.graphics.RectF;
import d.t0;

@t0(21)
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final f f18739a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final f f18740b = new b();

    public static class a implements f {
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float m10 = v.m(f13, f15, f11, f12, f10, true);
            float f17 = m10 / f13;
            float f18 = m10 / f15;
            return new h(f17, f18, m10, f14 * f17, m10, f16 * f18);
        }

        public boolean b(h hVar) {
            return hVar.f18744d > hVar.f18746f;
        }

        public void c(RectF rectF, float f10, h hVar) {
            rectF.bottom -= Math.abs(hVar.f18746f - hVar.f18744d) * f10;
        }
    }

    public static class b implements f {
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float m10 = v.m(f14, f16, f11, f12, f10, true);
            float f17 = m10 / f14;
            float f18 = m10 / f16;
            return new h(f17, f18, f13 * f17, m10, f15 * f18, m10);
        }

        public boolean b(h hVar) {
            return hVar.f18743c > hVar.f18745e;
        }

        public void c(RectF rectF, float f10, h hVar) {
            float abs = (Math.abs(hVar.f18745e - hVar.f18743c) / 2.0f) * f10;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    public static f a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f18739a : f18740b;
        }
        if (i10 == 1) {
            return f18739a;
        }
        if (i10 == 2) {
            return f18740b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i10);
    }

    public static boolean b(boolean z10, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f10 = (height2 * width) / width2;
        float f11 = (width2 * height) / width;
        if (z10) {
            if (f10 >= height) {
                return true;
            }
        } else if (f11 >= height2) {
            return true;
        }
        return false;
    }
}
