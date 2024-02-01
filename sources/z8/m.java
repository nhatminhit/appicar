package z8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class m implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f16022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater f16023b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16024c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f16025d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f16026e;

    public m(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16026e = aVar;
        this.f16022a = frameLayout;
        this.f16023b = layoutInflater;
        this.f16024c = viewGroup;
        this.f16025d = bundle;
    }

    public final void a(e eVar) {
        this.f16022a.removeAllViews();
        this.f16022a.addView(this.f16026e.f16009a.f(this.f16023b, this.f16024c, this.f16025d));
    }

    public final int c() {
        return 2;
    }
}
