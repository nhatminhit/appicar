package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import pl.droidsonroids.gif.GifImageView;
import vn.icar.entertaiment.R;

public abstract class c extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final GifImageView f25158t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final e f25159u0;

    public c(Object obj, View view, int i10, GifImageView gifImageView, e eVar) {
        super(obj, view, i10);
        this.f25158t0 = gifImageView;
        this.f25159u0 = eVar;
    }

    public static c m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static c n1(@m0 View view, @o0 Object obj) {
        return (c) ViewDataBinding.o(obj, view, R.layout.activity_logo);
    }

    @m0
    public static c o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static c p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static c q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (c) ViewDataBinding.a0(layoutInflater, R.layout.activity_logo, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static c r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (c) ViewDataBinding.a0(layoutInflater, R.layout.activity_logo, (ViewGroup) null, false, obj);
    }
}
