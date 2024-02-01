package f1;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final a f7155a;

    public interface a {
        boolean a(MotionEvent motionEvent);

        void b(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        void c(boolean z10);

        boolean d();
    }

    public static class b implements a {

        /* renamed from: v  reason: collision with root package name */
        public static final int f7156v = ViewConfiguration.getTapTimeout();

        /* renamed from: w  reason: collision with root package name */
        public static final int f7157w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: x  reason: collision with root package name */
        public static final int f7158x = 1;

        /* renamed from: y  reason: collision with root package name */
        public static final int f7159y = 2;

        /* renamed from: z  reason: collision with root package name */
        public static final int f7160z = 3;

        /* renamed from: a  reason: collision with root package name */
        public int f7161a;

        /* renamed from: b  reason: collision with root package name */
        public int f7162b;

        /* renamed from: c  reason: collision with root package name */
        public int f7163c;

        /* renamed from: d  reason: collision with root package name */
        public int f7164d;

        /* renamed from: e  reason: collision with root package name */
        public final Handler f7165e;

        /* renamed from: f  reason: collision with root package name */
        public final GestureDetector.OnGestureListener f7166f;

        /* renamed from: g  reason: collision with root package name */
        public GestureDetector.OnDoubleTapListener f7167g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f7168h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f7169i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f7170j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f7171k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f7172l;

        /* renamed from: m  reason: collision with root package name */
        public MotionEvent f7173m;

        /* renamed from: n  reason: collision with root package name */
        public MotionEvent f7174n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f7175o;

        /* renamed from: p  reason: collision with root package name */
        public float f7176p;

        /* renamed from: q  reason: collision with root package name */
        public float f7177q;

        /* renamed from: r  reason: collision with root package name */
        public float f7178r;

        /* renamed from: s  reason: collision with root package name */
        public float f7179s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f7180t;

        /* renamed from: u  reason: collision with root package name */
        public VelocityTracker f7181u;

        public class a extends Handler {
            public a() {
            }

            public a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1) {
                    b bVar = b.this;
                    bVar.f7166f.onShowPress(bVar.f7173m);
                } else if (i10 == 2) {
                    b.this.g();
                } else if (i10 == 3) {
                    b bVar2 = b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f7167g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f7168h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f7173m);
                    } else {
                        bVar2.f7169i = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f7165e = new a(handler);
            } else {
                this.f7165e = new a();
            }
            this.f7166f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                b((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f7181u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f7181u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f7181u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = r2
                goto L_0x001d
            L_0x001c:
                r4 = r3
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = r3
                r9 = r7
                r10 = r9
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bb
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x012d
                if (r0 == r4) goto L_0x00b8
                if (r0 == r5) goto L_0x00b3
                r2 = 5
                if (r0 == r2) goto L_0x00a6
                if (r0 == r1) goto L_0x005b
                goto L_0x024c
            L_0x005b:
                r12.f7176p = r9
                r12.f7178r = r9
                r12.f7177q = r10
                r12.f7179s = r10
                android.view.VelocityTracker r0 = r12.f7181u
                int r1 = r12.f7164d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f7181u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f7181u
                float r1 = r4.getYVelocity(r1)
                r4 = r3
            L_0x0080:
                if (r4 >= r6) goto L_0x024c
                if (r4 != r0) goto L_0x0085
                goto L_0x00a3
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f7181u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f7181u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a3
                android.view.VelocityTracker r13 = r12.f7181u
                r13.clear()
                goto L_0x024c
            L_0x00a3:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a6:
                r12.f7176p = r9
                r12.f7178r = r9
                r12.f7177q = r10
                r12.f7179s = r10
                r12.f()
                goto L_0x024c
            L_0x00b3:
                r12.e()
                goto L_0x024c
            L_0x00b8:
                boolean r0 = r12.f7170j
                if (r0 == 0) goto L_0x00be
                goto L_0x024c
            L_0x00be:
                float r0 = r12.f7176p
                float r0 = r0 - r9
                float r1 = r12.f7177q
                float r1 = r1 - r10
                boolean r6 = r12.f7175o
                if (r6 == 0) goto L_0x00d1
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f7167g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024c
            L_0x00d1:
                boolean r6 = r12.f7171k
                if (r6 == 0) goto L_0x010d
                float r6 = r12.f7178r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f7179s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f7161a
                if (r6 <= r7) goto L_0x0104
                android.view.GestureDetector$OnGestureListener r7 = r12.f7166f
                android.view.MotionEvent r8 = r12.f7173m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f7176p = r9
                r12.f7177q = r10
                r12.f7171k = r3
                android.os.Handler r0 = r12.f7165e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f7165e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f7165e
                r0.removeMessages(r4)
                goto L_0x0105
            L_0x0104:
                r13 = r3
            L_0x0105:
                int r0 = r12.f7161a
                if (r6 <= r0) goto L_0x01b8
                r12.f7172l = r3
                goto L_0x01b8
            L_0x010d:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x011f
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024c
            L_0x011f:
                android.view.GestureDetector$OnGestureListener r2 = r12.f7166f
                android.view.MotionEvent r3 = r12.f7173m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f7176p = r9
                r12.f7177q = r10
                goto L_0x024c
            L_0x012d:
                r12.f7168h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f7175o
                if (r1 == 0) goto L_0x013f
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f7167g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x0197
            L_0x013f:
                boolean r1 = r12.f7170j
                if (r1 == 0) goto L_0x014b
                android.os.Handler r13 = r12.f7165e
                r13.removeMessages(r5)
                r12.f7170j = r3
                goto L_0x018d
            L_0x014b:
                boolean r1 = r12.f7171k
                if (r1 == 0) goto L_0x0162
                android.view.GestureDetector$OnGestureListener r1 = r12.f7166f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f7169i
                if (r5 == 0) goto L_0x0160
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f7167g
                if (r5 == 0) goto L_0x0160
                r5.onSingleTapConfirmed(r13)
            L_0x0160:
                r13 = r1
                goto L_0x0197
            L_0x0162:
                android.view.VelocityTracker r1 = r12.f7181u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f7164d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f7163c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x018f
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f7163c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x018d
                goto L_0x018f
            L_0x018d:
                r13 = r3
                goto L_0x0197
            L_0x018f:
                android.view.GestureDetector$OnGestureListener r5 = r12.f7166f
                android.view.MotionEvent r7 = r12.f7173m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x0197:
                android.view.MotionEvent r1 = r12.f7174n
                if (r1 == 0) goto L_0x019e
                r1.recycle()
            L_0x019e:
                r12.f7174n = r0
                android.view.VelocityTracker r0 = r12.f7181u
                if (r0 == 0) goto L_0x01aa
                r0.recycle()
                r0 = 0
                r12.f7181u = r0
            L_0x01aa:
                r12.f7175o = r3
                r12.f7169i = r3
                android.os.Handler r0 = r12.f7165e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f7165e
                r0.removeMessages(r4)
            L_0x01b8:
                r3 = r13
                goto L_0x024c
            L_0x01bb:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f7167g
                if (r0 == 0) goto L_0x01f7
                android.os.Handler r0 = r12.f7165e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01cc
                android.os.Handler r1 = r12.f7165e
                r1.removeMessages(r5)
            L_0x01cc:
                android.view.MotionEvent r1 = r12.f7173m
                if (r1 == 0) goto L_0x01ef
                android.view.MotionEvent r6 = r12.f7174n
                if (r6 == 0) goto L_0x01ef
                if (r0 == 0) goto L_0x01ef
                boolean r0 = r12.i(r1, r6, r13)
                if (r0 == 0) goto L_0x01ef
                r12.f7175o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f7167g
                android.view.MotionEvent r1 = r12.f7173m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f7167g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01f8
            L_0x01ef:
                android.os.Handler r0 = r12.f7165e
                int r1 = f7157w
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01f7:
                r0 = r3
            L_0x01f8:
                r12.f7176p = r9
                r12.f7178r = r9
                r12.f7177q = r10
                r12.f7179s = r10
                android.view.MotionEvent r1 = r12.f7173m
                if (r1 == 0) goto L_0x0207
                r1.recycle()
            L_0x0207:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f7173m = r1
                r12.f7171k = r2
                r12.f7172l = r2
                r12.f7168h = r2
                r12.f7170j = r3
                r12.f7169i = r3
                boolean r1 = r12.f7180t
                if (r1 == 0) goto L_0x0235
                android.os.Handler r1 = r12.f7165e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f7165e
                android.view.MotionEvent r3 = r12.f7173m
                long r5 = r3.getDownTime()
                int r3 = f7156v
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = android.view.ViewConfiguration.getLongPressTimeout()
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0235:
                android.os.Handler r1 = r12.f7165e
                android.view.MotionEvent r3 = r12.f7173m
                long r3 = r3.getDownTime()
                int r5 = f7156v
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f7166f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.i.b.a(android.view.MotionEvent):boolean");
        }

        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f7167g = onDoubleTapListener;
        }

        public void c(boolean z10) {
            this.f7180t = z10;
        }

        public boolean d() {
            return this.f7180t;
        }

        public final void e() {
            this.f7165e.removeMessages(1);
            this.f7165e.removeMessages(2);
            this.f7165e.removeMessages(3);
            this.f7181u.recycle();
            this.f7181u = null;
            this.f7175o = false;
            this.f7168h = false;
            this.f7171k = false;
            this.f7172l = false;
            this.f7169i = false;
            if (this.f7170j) {
                this.f7170j = false;
            }
        }

        public final void f() {
            this.f7165e.removeMessages(1);
            this.f7165e.removeMessages(2);
            this.f7165e.removeMessages(3);
            this.f7175o = false;
            this.f7171k = false;
            this.f7172l = false;
            this.f7169i = false;
            if (this.f7170j) {
                this.f7170j = false;
            }
        }

        public void g() {
            this.f7165e.removeMessages(3);
            this.f7169i = false;
            this.f7170j = true;
            this.f7166f.onLongPress(this.f7173m);
        }

        public final void h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f7166f != null) {
                this.f7180t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f7163c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f7164d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f7161a = scaledTouchSlop * scaledTouchSlop;
                this.f7162b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        public final boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f7172l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f7157w)) {
                return false;
            }
            int x10 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y10 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x10 * x10) + (y10 * y10) < this.f7162b;
        }
    }

    public static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final GestureDetector f7183a;

        public c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f7183a = new GestureDetector(context, onGestureListener, handler);
        }

        public boolean a(MotionEvent motionEvent) {
            return this.f7183a.onTouchEvent(motionEvent);
        }

        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f7183a.setOnDoubleTapListener(onDoubleTapListener);
        }

        public void c(boolean z10) {
            this.f7183a.setIsLongpressEnabled(z10);
        }

        public boolean d() {
            return this.f7183a.isLongpressEnabled();
        }
    }

    public i(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public i(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f7155a = new c(context, onGestureListener, handler);
    }

    public boolean a() {
        return this.f7155a.d();
    }

    public boolean b(MotionEvent motionEvent) {
        return this.f7155a.a(motionEvent);
    }

    public void c(boolean z10) {
        this.f7155a.c(z10);
    }

    public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f7155a.b(onDoubleTapListener);
    }
}
