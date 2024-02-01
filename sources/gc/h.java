package gc;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public class h implements ViewTreeObserver.OnPreDrawListener {
    public final a0 O;
    public final WeakReference<ImageView> P;
    public e Q;

    public h(a0 a0Var, ImageView imageView) {
        this(a0Var, imageView, (e) null);
    }

    public h(a0 a0Var, ImageView imageView, e eVar) {
        this.O = a0Var;
        this.P = new WeakReference<>(imageView);
        this.Q = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void a() {
        this.Q = null;
        ImageView imageView = this.P.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = this.P.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.O.I().z(width, height).m(imageView, this.Q);
        }
        return true;
    }
}
