package oi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import vn.icar.entertaiment.R;

public class c extends BaseAdapter {
    public Context O;
    public String[] P;
    public LayoutInflater Q;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f21799a;
    }

    public c(Context context, String[] strArr) {
        this.O = context;
        this.P = strArr;
        this.Q = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.P.length;
    }

    public Object getItem(int i10) {
        return null;
    }

    public long getItemId(int i10) {
        return 0;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.Q.inflate(R.layout.item_spinner, viewGroup, false);
            aVar = new a();
            aVar.f21799a = (TextView) view.findViewById(R.id.txt_device);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f21799a.setText(this.P[i10]);
        return view;
    }
}
