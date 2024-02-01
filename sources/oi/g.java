package oi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.ArrayList;
import qj.c;
import sj.k;
import vn.icar.entertaiment.R;

public class g extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<c> f21810c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21811d;

    /* renamed from: e  reason: collision with root package name */
    public pj.g f21812e;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            k.c(view);
            g.this.f21812e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;
        public ImageView I;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.txt_default);
            this.I = (ImageView) view.findViewById(R.id.img_check);
        }
    }

    public g(ArrayList<c> arrayList, Context context) {
        this.f21810c = arrayList;
        this.f21811d = context;
    }

    public void F(pj.g gVar) {
        this.f21812e = gVar;
    }

    /* renamed from: G */
    public void u(@m0 b bVar, int i10) {
        int i11;
        ImageView imageView;
        bVar.H.setText(this.f21810c.get(i10).getTab());
        if (this.f21810c.get(i10).isClick()) {
            imageView = bVar.I;
            i11 = R.drawable.ic_check_on;
        } else {
            imageView = bVar.I;
            i11 = R.drawable.ic_check_off;
        }
        imageView.setImageResource(i11);
        bVar.I.setOnClickListener(new a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_default_play, (ViewGroup) null));
    }

    public int e() {
        return this.f21810c.size();
    }
}
