package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import d.x0;
import f.a;
import java.util.ArrayList;

@x0({x0.a.Q})
public class c implements j, AdapterView.OnItemClickListener {
    public static final String Y = "ListMenuPresenter";
    public static final String Z = "android:menu:list";
    public Context O;
    public LayoutInflater P;
    public e Q;
    public ExpandedMenuView R;
    public int S;
    public int T;
    public int U;
    public j.a V;
    public a W;
    public int X;

    public class a extends BaseAdapter {
        public int O = -1;

        public a() {
            a();
        }

        public void a() {
            h y10 = c.this.Q.y();
            if (y10 != null) {
                ArrayList<h> C = c.this.Q.C();
                int size = C.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (C.get(i10) == y10) {
                        this.O = i10;
                        return;
                    }
                }
            }
            this.O = -1;
        }

        /* renamed from: b */
        public h getItem(int i10) {
            ArrayList<h> C = c.this.Q.C();
            int i11 = i10 + c.this.S;
            int i12 = this.O;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return C.get(i11);
        }

        public int getCount() {
            int size = c.this.Q.C().size() - c.this.S;
            return this.O < 0 ? size : size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.P.inflate(cVar.U, viewGroup, false);
            }
            ((k.a) view).g(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.U = i10;
        this.T = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.O = context;
        this.P = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.W == null) {
            this.W = new a();
        }
        return this.W;
    }

    public void b(e eVar, boolean z10) {
        j.a aVar = this.V;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public int c() {
        return this.S;
    }

    public void d(boolean z10) {
        a aVar = this.W;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
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
        this.V = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.T
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.T
            r0.<init>(r3, r1)
            r2.O = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.P = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.O
            if (r0 == 0) goto L_0x0023
            r2.O = r3
            android.view.LayoutInflater r0 = r2.P
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.Q = r4
            androidx.appcompat.view.menu.c$a r3 = r2.W
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.i(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    public void j(Parcelable parcelable) {
        k((Bundle) parcelable);
    }

    public void k(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.R.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public boolean l(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).e((IBinder) null);
        j.a aVar = this.V;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    public k m(ViewGroup viewGroup) {
        if (this.R == null) {
            this.R = (ExpandedMenuView) this.P.inflate(a.k.abc_expanded_menu_layout, viewGroup, false);
            if (this.W == null) {
                this.W = new a();
            }
            this.R.setAdapter(this.W);
            this.R.setOnItemClickListener(this);
        }
        return this.R;
    }

    public Parcelable n() {
        if (this.R == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    public void o(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.R;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.Q.P(this.W.getItem(i10), this, 0);
    }

    public void p(int i10) {
        this.X = i10;
    }

    public void q(int i10) {
        this.S = i10;
        if (this.R != null) {
            d(false);
        }
    }
}
