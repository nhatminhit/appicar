package oi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.ArrayList;
import pj.f;
import sj.k;
import vn.icar.entertaiment.R;
import y3.j;
import yi.b;

public class i extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<b.a> f21816c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21817d;

    /* renamed from: e  reason: collision with root package name */
    public f f21818e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21819f;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        @SuppressLint({"ResourceAsColor"})
        public void onClick(View view) {
            k.c(view);
            i.this.f21818e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;
        public TextView I;
        public TextView J;
        public TextView K;
        public ImageView L;
        public ImageView M;
        public RelativeLayout N;

        public b(@m0 View view) {
            super(view);
            this.L = (ImageView) view.findViewById(R.id.img_video);
            this.H = (TextView) view.findViewById(R.id.txt_time_video);
            this.I = (TextView) view.findViewById(R.id.txt_name_video);
            this.M = (ImageView) view.findViewById(R.id.img_logo_channels);
            this.J = (TextView) view.findViewById(R.id.txt_name_channels);
            this.K = (TextView) view.findViewById(R.id.txt_posting_time_video);
            this.N = (RelativeLayout) view.findViewById(R.id.view_playing);
        }
    }

    public i(ArrayList<b.a> arrayList, Context context, boolean z10) {
        this.f21816c = arrayList;
        this.f21817d = context;
        this.f21819f = z10;
    }

    public void F(f fVar) {
        this.f21818e = fVar;
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        int i11;
        RelativeLayout relativeLayout;
        bVar.I.setText(this.f21816c.get(i10).f());
        bVar.H.setText(this.f21816c.get(i10).g());
        bVar.J.setText(this.f21816c.get(i10).b().b());
        TextView textView = bVar.K;
        textView.setText(" . " + this.f21816c.get(i10).i());
        com.bumptech.glide.k<Drawable> O = com.bumptech.glide.b.D(this.f21817d).t(this.f21816c.get(i10).k());
        j jVar = j.f15396e;
        ((com.bumptech.glide.k) O.y(jVar)).p1(bVar.L);
        ((com.bumptech.glide.k) com.bumptech.glide.b.D(this.f21817d).t(this.f21816c.get(i10).b().c()).y(jVar)).p1(bVar.M);
        if (this.f21816c.get(i10).m()) {
            relativeLayout = bVar.N;
            i11 = 0;
        } else {
            relativeLayout = bVar.N;
            i11 = 8;
        }
        relativeLayout.setVisibility(i11);
        bVar.f3220a.setOnClickListener(new a(i10));
    }

    @m0
    /* renamed from: H */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(this.f21819f ? R.layout.item_video_youtube_square_screen : R.layout.item_video_youtube, (ViewGroup) null));
    }

    public int e() {
        return this.f21816c.size();
    }
}
