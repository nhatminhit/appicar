package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class e extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final g f19634t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final i f19635u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final k f19636v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final m f19637w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final o f19638x0;

    public e(Object obj, View view, int i10, g gVar, i iVar, k kVar, m mVar, o oVar) {
        super(obj, view, i10);
        this.f19634t0 = gVar;
        this.f19635u0 = iVar;
        this.f19636v0 = kVar;
        this.f19637w0 = mVar;
        this.f19638x0 = oVar;
    }

    public static e m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static e n1(@m0 View view, @o0 Object obj) {
        return (e) ViewDataBinding.o(obj, view, a.l.activity_qr_login_auth);
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
        return (e) ViewDataBinding.a0(layoutInflater, a.l.activity_qr_login_auth, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static e r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (e) ViewDataBinding.a0(layoutInflater, a.l.activity_qr_login_auth, (ViewGroup) null, false, obj);
    }
}
