package t2;

import android.view.MotionEvent;
import d.m0;
import d.o0;
import d.x0;

public abstract class n<K> {

    public static abstract class a<K> {
        public abstract int a();

        @o0
        public abstract K b();

        public boolean c() {
            return b() != null;
        }

        public boolean d(@m0 MotionEvent motionEvent) {
            return false;
        }

        public boolean e(@m0 MotionEvent motionEvent) {
            return false;
        }

        public boolean equals(@o0 Object obj) {
            return (obj instanceof a) && f((a) obj);
        }

        public final boolean f(@m0 a<?> aVar) {
            Object b10 = b();
            return (b10 == null ? aVar.b() == null : b10.equals(aVar.b())) && a() == aVar.a();
        }

        public int hashCode() {
            return a() >>> 8;
        }
    }

    public static boolean c(@o0 a<?> aVar) {
        return (aVar == null || aVar.b() == null) ? false : true;
    }

    @o0
    public abstract a<K> a(@m0 MotionEvent motionEvent);

    public final int b(@m0 MotionEvent motionEvent) {
        a a10 = a(motionEvent);
        if (a10 != null) {
            return a10.a();
        }
        return -1;
    }

    public final boolean d(@m0 MotionEvent motionEvent) {
        return f(motionEvent) && a(motionEvent).d(motionEvent);
    }

    public final boolean e(@m0 MotionEvent motionEvent) {
        return f(motionEvent) && a(motionEvent).e(motionEvent);
    }

    public final boolean f(@m0 MotionEvent motionEvent) {
        return b(motionEvent) != -1;
    }

    @x0({x0.a.LIBRARY})
    public boolean g(@m0 MotionEvent motionEvent) {
        return f(motionEvent) && c(a(motionEvent));
    }
}
