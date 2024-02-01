package t;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import d.t0;
import t.g;

@t0(17)
public class a extends c {

    /* renamed from: t.a$a  reason: collision with other inner class name */
    public class C0212a implements g.a {
        public C0212a() {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void k() {
        g.f12743s = new C0212a();
    }
}
