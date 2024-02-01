package oi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.ArrayList;
import sj.k;
import vn.icar.entertaiment.R;

public class e extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<ti.a> f21803c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21804d;

    /* renamed from: e  reason: collision with root package name */
    public pj.b f21805e;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            k.c(view);
            e.this.f21805e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;
        public TextView I;
        public ImageView J;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.txt_folder);
            this.I = (TextView) view.findViewById(R.id.txt_source);
            this.J = (ImageView) view.findViewById(R.id.tg_folder);
        }
    }

    public e(ArrayList<ti.a> arrayList, Context context) {
        this.f21803c = arrayList;
        this.f21804d = context;
    }

    public void F(pj.b bVar) {
        this.f21805e = bVar;
    }

    /* renamed from: G */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        int i11;
        ImageView imageView;
        bVar.H.setText(this.f21803c.get(i10).a());
        bVar.I.setText(this.f21803c.get(i10).c());
        if (this.f21803c.get(i10).h()) {
            imageView = bVar.J;
            i11 = R.drawable.ic_tg_on;
        } else {
            imageView = bVar.J;
            i11 = R.drawable.ic_tg_off;
        }
        imageView.setImageResource(i11);
        bVar.J.setOnClickListener(new a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_folder, (ViewGroup) null));
    }

    public int e() {
        return this.f21803c.size();
    }
}
