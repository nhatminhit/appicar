package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import d.m0;
import java.util.ArrayList;
import java.util.List;

public final class c implements ViewPager2.m {

    /* renamed from: a  reason: collision with root package name */
    public final List<ViewPager2.m> f3999a = new ArrayList();

    public void a(@m0 View view, float f10) {
        for (ViewPager2.m a10 : this.f3999a) {
            a10.a(view, f10);
        }
    }

    public void b(@m0 ViewPager2.m mVar) {
        this.f3999a.add(mVar);
    }

    public void c(@m0 ViewPager2.m mVar) {
        this.f3999a.remove(mVar);
    }
}
