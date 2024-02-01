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
import e7.d;
import java.util.ArrayList;
import sj.k;
import vn.icar.entertaiment.R;

public class f extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<ti.a> f21806c;

    /* renamed from: d  reason: collision with root package name */
    public Context f21807d;

    /* renamed from: e  reason: collision with root package name */
    public pj.f f21808e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21809f;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        @SuppressLint({"ResourceAsColor"})
        public void onClick(View view) {
            k.c(view);
            f.this.f21808e.a(this.O);
        }
    }

    public class b extends RecyclerView.e0 {
        public TextView H;
        public TextView I;
        public ImageView J;

        public b(@m0 View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.txt_name);
            this.I = (TextView) view.findViewById(R.id.txt_time);
            this.J = (ImageView) view.findViewById(R.id.img_music);
        }
    }

    public f(ArrayList<ti.a> arrayList, Context context, boolean z10) {
        this.f21806c = arrayList;
        this.f21807d = context;
        this.f21809f = z10;
    }

    public void F(pj.f fVar) {
        this.f21808e = fVar;
    }

    public final String G(float f10) {
        int i10 = (int) (f10 / 3600.0f);
        int i11 = (int) ((f10 % 3600.0f) / 60.0f);
        int i12 = (int) (f10 % 60.0f);
        if (i10 > 0) {
            return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    /* renamed from: H */
    public void u(@m0 b bVar, @SuppressLint({"RecyclerView"}) int i10) {
        int i11;
        ImageView imageView;
        int i12;
        TextView textView;
        bVar.H.setText(this.f21806c.get(i10).e());
        TextView textView2 = bVar.I;
        textView2.setText("Thời lượng: " + G((float) (this.f21806c.get(i10).d() / 1000)));
        if (this.f21806c.get(i10).f().equals(d.f6880h)) {
            imageView = bVar.J;
            i11 = R.drawable.ic_music;
        } else {
            imageView = bVar.J;
            i11 = R.drawable.ic_video;
        }
        imageView.setImageResource(i11);
        if (this.f21806c.get(i10).g()) {
            textView = bVar.H;
            i12 = s0.a.f12612c;
        } else {
            textView = bVar.H;
            i12 = -1;
        }
        textView.setTextColor(i12);
        bVar.f3220a.setOnClickListener(new a(i10));
    }

    @m0
    /* renamed from: I */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_music_and_video_offline, (ViewGroup) null));
    }

    public int e() {
        return this.f21806c.size();
    }
}
