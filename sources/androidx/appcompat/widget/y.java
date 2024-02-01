package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import d.x0;

@x0({x0.a.Q})
public interface y {
    void c(Menu menu, j.a aVar);

    boolean f();

    void g();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    boolean m();

    void n(SparseArray<Parcelable> sparseArray);

    void o(int i10);

    void p();

    void q(SparseArray<Parcelable> sparseArray);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setUiOptions(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
