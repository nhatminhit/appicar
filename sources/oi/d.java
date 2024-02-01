package oi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.ArrayList;
import pj.g;
import sj.k;
import vn.icar.entertaiment.R;

public class d extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f21800c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21801d;

    /* renamed from: e  reason: collision with root package name */
    public g f21802e;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            k.c(view);
            d.this.f21802e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.txt_name_device);
        }
    }

    public d(ArrayList<String> arrayList, Context context) {
        this.f21800c = arrayList;
        this.f21801d = context;
    }

    public void F(g gVar) {
        this.f21802e = gVar;
    }

    /* renamed from: G */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        bVar.H.setText(this.f21800c.get(i10));
        bVar.H.setOnClickListener(new a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_device, (ViewGroup) null));
    }

    public int e() {
        return this.f21800c.size();
    }
}
