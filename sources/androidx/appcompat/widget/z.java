package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import d.x0;
import f1.s2;

@x0({x0.a.Q})
public interface z {
    Menu A();

    boolean B();

    int C();

    void D(int i10);

    s2 E(int i10, long j10);

    void F(int i10);

    void G(int i10);

    void H(j.a aVar, e.a aVar2);

    ViewGroup I();

    void J(boolean z10);

    void K(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void L(SparseArray<Parcelable> sparseArray);

    CharSequence M();

    int N();

    int O();

    void P(int i10);

    void Q(View view);

    void R();

    int S();

    void T();

    void U(Drawable drawable);

    void V(boolean z10);

    int a();

    void b(Drawable drawable);

    void c(Menu menu, j.a aVar);

    void collapseActionView();

    int d();

    Context e();

    boolean f();

    void g();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    boolean m();

    void n(int i10);

    void o();

    View p();

    void q(ScrollingTabContainerView scrollingTabContainerView);

    void r(Drawable drawable);

    boolean s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean t();

    void u(int i10);

    void v(CharSequence charSequence);

    void w(CharSequence charSequence);

    void x(Drawable drawable);

    void y(SparseArray<Parcelable> sparseArray);

    void z(int i10);
}
