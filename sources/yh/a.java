package yh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.ArrayList;
import vn.icar.baseauthentication.a;
import vn.icar.baseauthentication.data.model.Device;

public class a extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<Device> f24834c;

    /* renamed from: d  reason: collision with root package name */
    public Context f24835d;

    /* renamed from: e  reason: collision with root package name */
    public ki.a f24836e;

    /* renamed from: yh.a$a  reason: collision with other inner class name */
    public class C0493a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public C0493a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            a.this.f24836e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;
        public TextView I;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(a.i.txt_device);
            this.I = (TextView) view.findViewById(a.i.bt_device);
        }
    }

    public a(ArrayList<Device> arrayList, Context context) {
        this.f24834c = arrayList;
        this.f24835d = context;
    }

    public void F(ki.a aVar) {
        this.f24836e = aVar;
    }

    /* renamed from: G */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        bVar.H.setText(this.f24834c.get(i10).getDeviceName().equals("") ? "--/--" : this.f24834c.get(i10).getDeviceName());
        bVar.I.setOnClickListener(new C0493a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(a.l.item_device_limit, (ViewGroup) null));
    }

    public int e() {
        return this.f24834c.size();
    }
}
