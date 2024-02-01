package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.w0;
import d.x0;

@x0({x0.a.Q})
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {
    public static final int[] Q = {16842964, 16843049};
    public e O;
    public int P;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 G = w0.G(context, attributeSet, Q, i10, 0);
        if (G.C(0)) {
            setBackgroundDrawable(G.h(0));
        }
        if (G.C(1)) {
            setDivider(G.h(1));
        }
        G.I();
    }

    public boolean a(h hVar) {
        return this.O.O(hVar, 0);
    }

    public void e(e eVar) {
        this.O = eVar;
    }

    public int getWindowAnimations() {
        return this.P;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((h) getAdapter().getItem(i10));
    }
}
