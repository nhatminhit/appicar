package ea;

import android.graphics.RectF;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final f f18434a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final f f18435b = new b();

    public static class a implements f {
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float m10 = u.m(f13, f15, f11, f12, f10, true);
            float f17 = m10 / f13;
            float f18 = m10 / f15;
            return new h(f17, f18, m10, f14 * f17, m10, f16 * f18);
        }

        public void b(RectF rectF, float f10, h hVar) {
            rectF.bottom -= Math.abs(hVar.f18441f - hVar.f18439d) * f10;
        }

        public boolean c(h hVar) {
            return hVar.f18439d > hVar.f18441f;
        }
    }

    public static class b implements f {
        public h a(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            float m10 = u.m(f14, f16, f11, f12, f10, true);
            float f17 = m10 / f14;
            float f18 = m10 / f16;
            return new h(f17, f18, f13 * f17, m10, f15 * f18, m10);
        }

        public void b(RectF rectF, float f10, h hVar) {
            float abs = (Math.abs(hVar.f18440e - hVar.f18438c) / 2.0f) * f10;
            rectF.left += abs;
            rectF.right -= abs;
        }

        public boolean c(h hVar) {
            return hVar.f18438c > hVar.f18440e;
        }
    }

    public static f a(int i10, boolean z10, RectF rectF, RectF rectF2) {
        if (i10 == 0) {
            return b(z10, rectF, rectF2) ? f18434a : f18435b;
        }
        if (i10 == 1) {
            return f18434a;
        }
        if (i10 == 2) {
            return f18435b;
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
