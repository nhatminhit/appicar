package yb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qa.a;
import qa.r;
import qa.s;
import qa.t;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static final float f24699d = 4.0f;

    /* renamed from: e  reason: collision with root package name */
    public static final float f24700e = 10.0f;

    /* renamed from: a  reason: collision with root package name */
    public r f24701a;

    /* renamed from: b  reason: collision with root package name */
    public y f24702b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24703c = 2;

    public d(r rVar, y yVar) {
        this.f24701a = rVar;
        this.f24702b = yVar;
    }

    public static void a(Canvas canvas, Paint paint, t tVar, t tVar2, int i10) {
        if (tVar != null && tVar2 != null) {
            float f10 = (float) i10;
            canvas.drawLine(tVar.c() / f10, tVar.d() / f10, tVar2.c() / f10, tVar2.d() / f10, paint);
        }
    }

    public static List<t> m(List<t> list, y yVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (t p10 : list) {
            arrayList.add(yVar.p(p10));
        }
        return arrayList;
    }

    public a b() {
        return this.f24701a.b();
    }

    public Bitmap c() {
        return this.f24702b.d((Rect) null, 2);
    }

    public int d() {
        return 2;
    }

    public Bitmap e(int i10) {
        t tVar;
        Bitmap c10 = c();
        List<t> l10 = l();
        if (l10.isEmpty() || c10 == null) {
            return c10;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c10.getWidth(), c10.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(c10, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(i10);
        int i11 = 1;
        if (l10.size() == 2) {
            paint.setStrokeWidth(4.0f);
            tVar = l10.get(0);
        } else if (l10.size() == 4 && (this.f24701a.b() == a.UPC_A || this.f24701a.b() == a.EAN_13)) {
            a(canvas, paint, l10.get(0), l10.get(1), 2);
            tVar = l10.get(2);
            i11 = 3;
        } else {
            paint.setStrokeWidth(10.0f);
            for (t next : l10) {
                if (next != null) {
                    canvas.drawPoint(next.c() / 2.0f, next.d() / 2.0f, paint);
                }
            }
            return createBitmap;
        }
        a(canvas, paint, tVar, l10.get(i11), 2);
        return createBitmap;
    }

    public byte[] f() {
        return this.f24701a.d();
    }

    public r g() {
        return this.f24701a;
    }

    public Map<s, Object> h() {
        return this.f24701a.e();
    }

    public t[] i() {
        return this.f24701a.f();
    }

    public String j() {
        return this.f24701a.g();
    }

    public long k() {
        return this.f24701a.h();
    }

    public List<t> l() {
        return this.f24701a.f() == null ? Collections.emptyList() : m(Arrays.asList(this.f24701a.f()), this.f24702b);
    }

    public String toString() {
        return this.f24701a.g();
    }
}
