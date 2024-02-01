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
import i0.d;
import java.util.ArrayList;
import sj.k;
import vi.c;
import vn.icar.entertaiment.R;
import y3.j;

public class b extends RecyclerView.g<c> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<c.a> f21795c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21796d;

    /* renamed from: e  reason: collision with root package name */
    public pj.c f21797e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21798f;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            k.c(view);
            b.this.f21797e.a(this.O);
        }
    }

    /* renamed from: oi.b$b  reason: collision with other inner class name */
    public class C0383b implements View.OnClickListener {
        public final /* synthetic */ int O;
        public final /* synthetic */ c P;

        public C0383b(int i10, c cVar) {
            this.O = i10;
            this.P = cVar;
        }

        public void onClick(View view) {
            c.a aVar;
            boolean z10;
            k.c(view);
            b.this.f21797e.b(this.O);
            if (b.this.f21795c.get(this.O).j()) {
                this.P.J.setImageResource(R.drawable.ic_prioritize_on);
                aVar = b.this.f21795c.get(this.O);
                z10 = true;
            } else {
                this.P.J.setImageResource(R.drawable.ic_prioritize_off);
                aVar = b.this.f21795c.get(this.O);
                z10 = false;
            }
            aVar.p(z10);
        }
    }

    public class c extends RecyclerView.e0 {
        public TextView H;
        public ImageView I;
        public ImageView J;

        public c(@m0 View view) {
            super(view);
            this.I = (ImageView) view.findViewById(R.id.img_logo_channel);
            this.H = (TextView) view.findViewById(R.id.txt_channel);
            this.J = (ImageView) view.findViewById(R.id.img_prioritize);
        }
    }

    public b(ArrayList<c.a> arrayList, Context context, boolean z10) {
        this.f21795c = arrayList;
        this.f21796d = context;
        this.f21798f = z10;
    }

    public void F(pj.c cVar) {
        this.f21797e = cVar;
    }

    /* renamed from: G */
    public void u(@m0 c cVar, @SuppressLint({"RecyclerView"}) int i10) {
        int i11;
        ImageView imageView;
        int i12;
        Context context;
        TextView textView;
        cVar.H.setText(this.f21795c.get(i10).d());
        ((com.bumptech.glide.k) com.bumptech.glide.b.D(this.f21796d).t(this.f21795c.get(i10).f()).y(j.f15396e)).p1(cVar.I);
        if (this.f21795c.get(i10).j()) {
            imageView = cVar.J;
            i11 = R.drawable.ic_prioritize_on;
        } else {
            imageView = cVar.J;
            i11 = R.drawable.ic_prioritize_off;
        }
        imageView.setImageResource(i11);
        if (this.f21795c.get(i10).i()) {
            textView = cVar.H;
            context = this.f21796d;
            i12 = R.color.red;
        } else {
            textView = cVar.H;
            context = this.f21796d;
            i12 = R.color.white;
        }
        textView.setTextColor(d.f(context, i12));
        cVar.f3220a.setOnClickListener(new a(i10));
        cVar.J.setOnClickListener(new C0383b(i10, cVar));
    }

    @m0
    /* renamed from: H */
    public c w(@m0 ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(this.f21798f ? R.layout.item_channel_tv_radio_square_screen : R.layout.item_channel_tv_radio, (ViewGroup) null));
    }

    public int e() {
        return this.f21795c.size();
    }
}
