package nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import com.tatv.baseapp.a;
import d.m0;
import d.o0;

public abstract class c extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f21217t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f21218u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ImageView f21219v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f21220w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f21221x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final RelativeLayout f21222y0;

    public c(Object obj, View view, int i10, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f21217t0 = textView;
        this.f21218u0 = textView2;
        this.f21219v0 = imageView;
        this.f21220w0 = textView3;
        this.f21221x0 = textView4;
        this.f21222y0 = relativeLayout;
    }

    public static c m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static c n1(@m0 View view, @o0 Object obj) {
        return (c) ViewDataBinding.o(obj, view, a.l.dialog_error_message);
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
        return (c) ViewDataBinding.a0(layoutInflater, a.l.dialog_error_message, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static c r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (c) ViewDataBinding.a0(layoutInflater, a.l.dialog_error_message, (ViewGroup) null, false, obj);
    }
}
