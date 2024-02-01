package oi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import i0.d;
import java.util.ArrayList;
import pj.g;
import qj.c;
import sj.k;
import vn.icar.entertaiment.R;

public class h extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<c> f21813c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21814d;

    /* renamed from: e  reason: collision with root package name */
    public g f21815e;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            k.c(view);
            h.this.f21815e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.txt_tab);
        }
    }

    public h(ArrayList<c> arrayList, Context context) {
        this.f21813c = arrayList;
        this.f21814d = context;
    }

    public void F(g gVar) {
        this.f21815e = gVar;
    }

    /* renamed from: G */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        int i11;
        Context context;
        TextView textView;
        bVar.H.setText(this.f21813c.get(i10).getTab());
        if (this.f21813c.get(i10).isClick()) {
            textView = bVar.H;
            context = this.f21814d;
            i11 = R.color.white;
        } else {
            textView = bVar.H;
            context = this.f21814d;
            i11 = R.color.grey;
        }
        textView.setTextColor(d.f(context, i11));
        bVar.f3220a.setOnClickListener(new a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tab, (ViewGroup) null));
    }

    public int e() {
        return this.f21813c.size();
    }
}
