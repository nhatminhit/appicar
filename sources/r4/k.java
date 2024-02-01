package r4;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import r4.f;

public class k<R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    public final a f12116a;

    public interface a {
        Animation a(Context context);
    }

    public k(a aVar) {
        this.f12116a = aVar;
    }

    public boolean a(R r10, f.a aVar) {
        View d10 = aVar.d();
        if (d10 == null) {
            return false;
        }
        d10.clearAnimation();
        d10.startAnimation(this.f12116a.a(d10.getContext()));
        return false;
    }
}
