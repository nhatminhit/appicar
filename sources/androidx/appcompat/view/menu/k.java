package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import d.x0;

@x0({x0.a.Q})
public interface k {

    public interface a {
        void b(boolean z10, char c10);

        boolean d();

        boolean f();

        void g(h hVar, int i10);

        h getItemData();

        void setCheckable(boolean z10);

        void setChecked(boolean z10);

        void setEnabled(boolean z10);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void e(e eVar);

    int getWindowAnimations();
}
