package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import d.x0;
import java.util.ArrayList;

@x0({x0.a.Q})
public abstract class a implements j {
    public Context O;
    public Context P;
    public e Q;
    public LayoutInflater R;
    public LayoutInflater S;
    public j.a T;
    public int U;
    public int V;
    public k W;
    public int X;

    public a(Context context, int i10, int i11) {
        this.O = context;
        this.R = LayoutInflater.from(context);
        this.U = i10;
        this.V = i11;
    }

    public void b(e eVar, boolean z10) {
        j.a aVar = this.T;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public void c(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.W).addView(view, i10);
    }

    public void d(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.W;
        if (viewGroup != null) {
            e eVar = this.Q;
            int i10 = 0;
            if (eVar != null) {
                eVar.u();
                ArrayList<h> H = this.Q.H();
                int size = H.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    h hVar = H.get(i12);
                    if (t(i11, hVar)) {
                        View childAt = viewGroup.getChildAt(i11);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View r10 = r(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            r10.setPressed(false);
                            r10.jumpDrawablesToCurrentState();
                        }
                        if (r10 != childAt) {
                            c(r10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!p(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f(e eVar, h hVar) {
        return false;
    }

    public boolean g(e eVar, h hVar) {
        return false;
    }

    public int getId() {
        return this.X;
    }

    public void h(j.a aVar) {
        this.T = aVar;
    }

    public void i(Context context, e eVar) {
        this.P = context;
        this.S = LayoutInflater.from(context);
        this.Q = eVar;
    }

    public abstract void k(h hVar, k.a aVar);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(androidx.appcompat.view.menu.m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.T
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.Q
        L_0x0009:
            boolean r2 = r0.c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.l(androidx.appcompat.view.menu.m):boolean");
    }

    public k m(ViewGroup viewGroup) {
        if (this.W == null) {
            k kVar = (k) this.R.inflate(this.U, viewGroup, false);
            this.W = kVar;
            kVar.e(this.Q);
            d(true);
        }
        return this.W;
    }

    public k.a o(ViewGroup viewGroup) {
        return (k.a) this.R.inflate(this.V, viewGroup, false);
    }

    public boolean p(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a q() {
        return this.T;
    }

    public View r(h hVar, View view, ViewGroup viewGroup) {
        k.a o10 = view instanceof k.a ? (k.a) view : o(viewGroup);
        k(hVar, o10);
        return (View) o10;
    }

    public void s(int i10) {
        this.X = i10;
    }

    public boolean t(int i10, h hVar) {
        return true;
    }
}
