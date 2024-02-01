package f1;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final View f7148a;

    /* renamed from: b  reason: collision with root package name */
    public final c f7149b;

    /* renamed from: c  reason: collision with root package name */
    public int f7150c;

    /* renamed from: d  reason: collision with root package name */
    public int f7151d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7152e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnLongClickListener f7153f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final View.OnTouchListener f7154g = new b();

    public class a implements View.OnLongClickListener {
        public a() {
        }

        public boolean onLongClick(View view) {
            return h.this.d(view);
        }
    }

    public class b implements View.OnTouchListener {
        public b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return h.this.e(view, motionEvent);
        }
    }

    public interface c {
        boolean a(View view, h hVar);
    }

    public h(View view, c cVar) {
        this.f7148a = view;
        this.f7149b = cVar;
    }

    public void a() {
        this.f7148a.setOnLongClickListener(this.f7153f);
        this.f7148a.setOnTouchListener(this.f7154g);
    }

    public void b() {
        this.f7148a.setOnLongClickListener((View.OnLongClickListener) null);
        this.f7148a.setOnTouchListener((View.OnTouchListener) null);
    }

    public void c(Point point) {
        point.set(this.f7150c, this.f7151d);
    }

    public boolean d(View view) {
        return this.f7149b.a(view, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 != 3) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L_0x0049
            r4 = 1
            if (r2 == r4) goto L_0x0046
            r5 = 2
            if (r2 == r5) goto L_0x001b
            r7 = 3
            if (r2 == r7) goto L_0x0046
            goto L_0x004d
        L_0x001b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = f1.g0.l(r8, r2)
            if (r2 == 0) goto L_0x004d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            boolean r8 = r6.f7152e
            if (r8 == 0) goto L_0x0030
            goto L_0x004d
        L_0x0030:
            int r8 = r6.f7150c
            if (r8 != r0) goto L_0x0039
            int r8 = r6.f7151d
            if (r8 != r1) goto L_0x0039
            goto L_0x004d
        L_0x0039:
            r6.f7150c = r0
            r6.f7151d = r1
            f1.h$c r8 = r6.f7149b
            boolean r7 = r8.a(r7, r6)
            r6.f7152e = r7
            return r7
        L_0x0046:
            r6.f7152e = r3
            goto L_0x004d
        L_0x0049:
            r6.f7150c = r0
            r6.f7151d = r1
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.h.e(android.view.View, android.view.MotionEvent):boolean");
    }
}
