package g3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import d.m0;
import d.t0;

@t0(18)
public class v0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f7890a;

    public v0(@m0 ViewGroup viewGroup) {
        this.f7890a = viewGroup.getOverlay();
    }

    public void a(@m0 Drawable drawable) {
        this.f7890a.add(drawable);
    }

    public void b(@m0 Drawable drawable) {
        this.f7890a.remove(drawable);
    }

    public void c(@m0 View view) {
        this.f7890a.add(view);
    }

    public void d(@m0 View view) {
        this.f7890a.remove(view);
    }
}
