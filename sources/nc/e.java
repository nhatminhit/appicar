package nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import com.tatv.baseapp.a;
import d.m0;
import d.o0;
import eightbitlab.com.blurview.BlurView;

public abstract class e extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final BlurView f21224t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f21225u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final RelativeLayout f21226v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f21227w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f21228x0;

    public e(Object obj, View view, int i10, BlurView blurView, TextView textView, RelativeLayout relativeLayout, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f21224t0 = blurView;
        this.f21225u0 = textView;
        this.f21226v0 = relativeLayout;
        this.f21227w0 = textView2;
        this.f21228x0 = textView3;
    }

    public static e m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static e n1(@m0 View view, @o0 Object obj) {
        return (e) ViewDataBinding.o(obj, view, a.l.dialog_permission);
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
        return (e) ViewDataBinding.a0(layoutInflater, a.l.dialog_permission, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static e r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (e) ViewDataBinding.a0(layoutInflater, a.l.dialog_permission, (ViewGroup) null, false, obj);
    }
}
