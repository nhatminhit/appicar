package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class p {

    /* renamed from: j  reason: collision with root package name */
    public static final int f3663j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f3664k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f3665l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public static final int f3666m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f3667n = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3668a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f3669b;

    /* renamed from: c  reason: collision with root package name */
    public int f3670c;

    /* renamed from: d  reason: collision with root package name */
    public int f3671d;

    /* renamed from: e  reason: collision with root package name */
    public int f3672e;

    /* renamed from: f  reason: collision with root package name */
    public int f3673f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3674g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3675h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3676i;

    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f3670c;
        return i10 >= 0 && i10 < b0Var.d();
    }

    public View b(RecyclerView.w wVar) {
        View p10 = wVar.p(this.f3670c);
        this.f3670c += this.f3671d;
        return p10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3669b + ", mCurrentPosition=" + this.f3670c + ", mItemDirection=" + this.f3671d + ", mLayoutDirection=" + this.f3672e + ", mStartLine=" + this.f3673f + ", mEndLine=" + this.f3674g + '}';
    }
}
