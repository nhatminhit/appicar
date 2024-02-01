package g3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import d.m0;
import d.t0;

@t0(18)
public class c1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f7660a;

    public c1(@m0 View view) {
        this.f7660a = view.getOverlay();
    }

    public void a(@m0 Drawable drawable) {
        this.f7660a.add(drawable);
    }

    public void b(@m0 Drawable drawable) {
        this.f7660a.remove(drawable);
    }
}
