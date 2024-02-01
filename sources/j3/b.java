package j3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import d.m0;
import d.t0;

public interface b extends Animatable {

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public Animatable2.AnimationCallback f9424a;

        /* renamed from: j3.b$a$a  reason: collision with other inner class name */
        public class C0158a extends Animatable2.AnimationCallback {
            public C0158a() {
            }

            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @t0(23)
        public Animatable2.AnimationCallback a() {
            if (this.f9424a == null) {
                this.f9424a = new C0158a();
            }
            return this.f9424a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    void b(@m0 a aVar);

    boolean c(@m0 a aVar);

    void clearAnimationCallbacks();
}
