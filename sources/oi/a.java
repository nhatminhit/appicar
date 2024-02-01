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
import xi.a;
import y3.j;

public class a extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a.C0490a> f21792c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21793d;

    /* renamed from: e  reason: collision with root package name */
    public pj.b f21794e;

    /* renamed from: oi.a$a  reason: collision with other inner class name */
    public class C0382a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public C0382a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            k.c(view);
            a.this.f21794e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;
        public ImageView I;
        public ImageView J;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.txt_channel);
            this.I = (ImageView) view.findViewById(R.id.img_channel);
            this.J = (ImageView) view.findViewById(R.id.tg_channel);
        }
    }

    public a(ArrayList<a.C0490a> arrayList, Context context) {
        this.f21792c = arrayList;
        this.f21793d = context;
    }

    public void F(pj.b bVar) {
        this.f21794e = bVar;
    }

    /* renamed from: G */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        int i11;
        ImageView imageView;
        bVar.H.setText(this.f21792c.get(i10).f());
        ((com.bumptech.glide.k) com.bumptech.glide.b.D(this.f21793d).t(this.f21792c.get(i10).h()).y(j.f15396e)).p1(bVar.I);
        if (this.f21792c.get(i10).j()) {
            imageView = bVar.J;
            i11 = R.drawable.ic_tg_on;
        } else {
            imageView = bVar.J;
            i11 = R.drawable.ic_tg_off;
        }
        imageView.setImageResource(i11);
        bVar.J.setOnClickListener(new C0382a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_channel, (ViewGroup) null));
    }

    public int e() {
        return this.f21792c.size();
    }
}
