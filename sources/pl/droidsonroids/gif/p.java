package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.view.View;
import d.m0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

public class p implements Drawable.Callback {
    public final CopyOnWriteArrayList<a> O;
    public final boolean P;

    public static final class a extends WeakReference<Drawable.Callback> {
        public a(Drawable.Callback callback) {
            super(callback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return get() == ((a) obj).get();
        }

        public int hashCode() {
            Drawable.Callback callback = (Drawable.Callback) get();
            if (callback != null) {
                return callback.hashCode();
            }
            return 0;
        }
    }

    public p() {
        this(false);
    }

    public p(boolean z10) {
        this.O = new CopyOnWriteArrayList<>();
        this.P = z10;
    }

    public void a(Drawable.Callback callback) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            a aVar = this.O.get(i10);
            if (((Drawable.Callback) aVar.get()) == null) {
                this.O.remove(aVar);
            }
        }
        this.O.addIfAbsent(new a(callback));
    }

    public void b(Drawable.Callback callback) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            a aVar = this.O.get(i10);
            Drawable.Callback callback2 = (Drawable.Callback) aVar.get();
            if (callback2 == null || callback2 == callback) {
                this.O.remove(aVar);
            }
        }
    }

    public void invalidateDrawable(@m0 Drawable drawable) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            a aVar = this.O.get(i10);
            Drawable.Callback callback = (Drawable.Callback) aVar.get();
            if (callback == null) {
                this.O.remove(aVar);
            } else if (!this.P || !(callback instanceof View)) {
                callback.invalidateDrawable(drawable);
            } else {
                ((View) callback).invalidate();
            }
        }
    }

    public void scheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable, long j10) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            a aVar = this.O.get(i10);
            Drawable.Callback callback = (Drawable.Callback) aVar.get();
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            } else {
                this.O.remove(aVar);
            }
        }
    }

    public void unscheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable) {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            a aVar = this.O.get(i10);
            Drawable.Callback callback = (Drawable.Callback) aVar.get();
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            } else {
                this.O.remove(aVar);
            }
        }
    }
}
