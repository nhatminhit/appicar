package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import d.x0;
import java.util.ArrayList;

@x0({x0.a.Q})
public class d extends BaseAdapter {
    public e O;
    public int P = -1;
    public boolean Q;
    public final boolean R;
    public final LayoutInflater S;
    public final int T;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.R = z10;
        this.S = layoutInflater;
        this.O = eVar;
        this.T = i10;
        a();
    }

    public void a() {
        h y10 = this.O.y();
        if (y10 != null) {
            ArrayList<h> C = this.O.C();
            int size = C.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C.get(i10) == y10) {
                    this.P = i10;
                    return;
                }
            }
        }
        this.P = -1;
    }

    public e b() {
        return this.O;
    }

    public boolean c() {
        return this.Q;
    }

    /* renamed from: d */
    public h getItem(int i10) {
        ArrayList<h> C = this.R ? this.O.C() : this.O.H();
        int i11 = this.P;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return C.get(i10);
    }

    public void e(boolean z10) {
        this.Q = z10;
    }

    public int getCount() {
        ArrayList<h> C = this.R ? this.O.C() : this.O.H();
        int i10 = this.P;
        int size = C.size();
        return i10 < 0 ? size : size - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.S.inflate(this.T, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.O.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.Q) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.g(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
