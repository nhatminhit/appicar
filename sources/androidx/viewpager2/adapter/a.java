package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import f1.w1;

public final class a extends RecyclerView.e0 {
    public a(@m0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @m0
    public static a O(@m0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(w1.B());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    @m0
    public FrameLayout P() {
        return (FrameLayout) this.f3220a;
    }
}
