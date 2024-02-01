package t2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.u;
import e1.n;
import t2.e0;
import t2.m;

public final class d<K> extends m.b<K> {

    /* renamed from: e  reason: collision with root package name */
    public static final Rect f12784e = new Rect(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f12785a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f12786b;

    /* renamed from: c  reason: collision with root package name */
    public final o<K> f12787c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.c<K> f12788d;

    public class a extends RecyclerView.n {
        public a() {
        }

        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            d.this.l(canvas);
        }
    }

    public d(@m0 RecyclerView recyclerView, @u int i10, @m0 o<K> oVar, @m0 e0.c<K> cVar) {
        boolean z10 = true;
        n.a(recyclerView != null);
        this.f12785a = recyclerView;
        Drawable i11 = i0.d.i(recyclerView.getContext(), i10);
        this.f12786b = i11;
        n.a(i11 != null);
        n.a(oVar != null);
        n.a(cVar == null ? false : z10);
        this.f12787c = oVar;
        this.f12788d = cVar;
        recyclerView.n(new a());
    }

    public void a(@m0 RecyclerView.t tVar) {
        this.f12785a.r(tVar);
    }

    public m<K> b() {
        return new m<>(this, this.f12787c, this.f12788d);
    }

    public void c() {
        this.f12786b.setBounds(f12784e);
        this.f12785a.invalidate();
    }

    public void d(@m0 Rect rect) {
        this.f12786b.setBounds(rect);
        this.f12785a.invalidate();
    }

    public Point e(@m0 Point point) {
        return new Point(point.x + this.f12785a.computeHorizontalScrollOffset(), point.y + this.f12785a.computeVerticalScrollOffset());
    }

    public Rect f(int i10) {
        View childAt = this.f12785a.getChildAt(i10);
        Rect rect = new Rect();
        childAt.getHitRect(rect);
        rect.left += this.f12785a.computeHorizontalScrollOffset();
        rect.right += this.f12785a.computeHorizontalScrollOffset();
        rect.top += this.f12785a.computeVerticalScrollOffset();
        rect.bottom += this.f12785a.computeVerticalScrollOffset();
        return rect;
    }

    public int g(int i10) {
        RecyclerView recyclerView = this.f12785a;
        return recyclerView.o0(recyclerView.getChildAt(i10));
    }

    public int h() {
        RecyclerView.o layoutManager = this.f12785a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).H3();
        }
        return 1;
    }

    public int i() {
        return this.f12785a.getChildCount();
    }

    public boolean j(int i10) {
        return this.f12785a.g0(i10) != null;
    }

    public void k(@m0 RecyclerView.t tVar) {
        this.f12785a.t1(tVar);
    }

    public void l(@m0 Canvas canvas) {
        this.f12786b.draw(canvas);
    }
}
