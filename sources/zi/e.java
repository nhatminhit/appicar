package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public abstract class e extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f25164t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f25165u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final RelativeLayout f25166v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final Spinner f25167w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f25168x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final TextView f25169y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final RelativeLayout f25170z0;

    public e(Object obj, View view, int i10, TextView textView, ImageView imageView, RelativeLayout relativeLayout, Spinner spinner, TextView textView2, TextView textView3, RelativeLayout relativeLayout2) {
        super(obj, view, i10);
        this.f25164t0 = textView;
        this.f25165u0 = imageView;
        this.f25166v0 = relativeLayout;
        this.f25167w0 = spinner;
        this.f25168x0 = textView2;
        this.f25169y0 = textView3;
        this.f25170z0 = relativeLayout2;
    }

    public static e m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static e n1(@m0 View view, @o0 Object obj) {
        return (e) ViewDataBinding.o(obj, view, R.layout.activity_type_device);
    }

    @m0
    public static e o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static e p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static e q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (e) ViewDataBinding.a0(layoutInflater, R.layout.activity_type_device, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static e r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (e) ViewDataBinding.a0(layoutInflater, R.layout.activity_type_device, (ViewGroup) null, false, obj);
    }
}
