package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import d.m0;
import d.o0;
import java.util.List;
import java.util.Queue;
import q4.o;
import q4.p;
import r4.f;
import t4.m;

public class e<T> implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f4958a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4959b;

    /* renamed from: c  reason: collision with root package name */
    public final l f4960c;

    /* renamed from: d  reason: collision with root package name */
    public final a<T> f4961d;

    /* renamed from: e  reason: collision with root package name */
    public final b<T> f4962e;

    /* renamed from: f  reason: collision with root package name */
    public int f4963f;

    /* renamed from: g  reason: collision with root package name */
    public int f4964g;

    /* renamed from: h  reason: collision with root package name */
    public int f4965h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f4966i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4967j = true;

    public interface a<U> {
        @m0
        List<U> a(int i10);

        @o0
        k<?> b(@m0 U u10);
    }

    public interface b<T> {
        @o0
        int[] a(@m0 T t10, int i10, int i11);
    }

    public static final class c implements p<Object> {
        public int O;
        public int P;
        @o0
        public p4.d Q;

        public void a() {
        }

        public void b() {
        }

        public void e(@m0 o oVar) {
        }

        public void f(@o0 Drawable drawable) {
        }

        public void h(@o0 p4.d dVar) {
            this.Q = dVar;
        }

        public void l(@o0 Drawable drawable) {
        }

        public void o(@m0 o oVar) {
            oVar.d(this.P, this.O);
        }

        public void onDestroy() {
        }

        @o0
        public p4.d q() {
            return this.Q;
        }

        public void r(@o0 Drawable drawable) {
        }

        public void s(@m0 Object obj, @o0 f<? super Object> fVar) {
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<c> f4968a;

        public d(int i10) {
            this.f4968a = m.f(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f4968a.offer(new c());
            }
        }

        public c a(int i10, int i11) {
            c poll = this.f4968a.poll();
            this.f4968a.offer(poll);
            poll.P = i10;
            poll.O = i11;
            return poll;
        }
    }

    public e(@m0 l lVar, @m0 a<T> aVar, @m0 b<T> bVar, int i10) {
        this.f4960c = lVar;
        this.f4961d = aVar;
        this.f4962e = bVar;
        this.f4958a = i10;
        this.f4959b = new d(i10 + 1);
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f4959b.f4968a.size(); i10++) {
            this.f4960c.B(this.f4959b.a(0, 0));
        }
    }

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        if (i10 < i11) {
            i12 = Math.max(this.f4963f, i10);
            i13 = i11;
        } else {
            i13 = Math.min(this.f4964g, i10);
            i12 = i11;
        }
        int min = Math.min(this.f4966i, i13);
        int min2 = Math.min(this.f4966i, Math.max(0, i12));
        if (i10 < i11) {
            for (int i14 = min2; i14 < min; i14++) {
                d(this.f4961d.a(i14), i14, true);
            }
        } else {
            for (int i15 = min - 1; i15 >= min2; i15--) {
                d(this.f4961d.a(i15), i15, false);
            }
        }
        this.f4964g = min2;
        this.f4963f = min;
    }

    public final void c(int i10, boolean z10) {
        if (this.f4967j != z10) {
            this.f4967j = z10;
            a();
        }
        b(i10, (z10 ? this.f4958a : -this.f4958a) + i10);
    }

    public final void d(List<T> list, int i10, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e(list.get(i11), i10, i11);
            }
            return;
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            e(list.get(i12), i10, i12);
        }
    }

    public final void e(@o0 T t10, int i10, int i11) {
        int[] a10;
        k<?> b10;
        if (t10 != null && (a10 = this.f4962e.a(t10, i10, i11)) != null && (b10 = this.f4961d.b(t10)) != null) {
            b10.m1(this.f4959b.a(a10[0], a10[1]));
        }
    }

    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        this.f4966i = i12;
        int i13 = this.f4965h;
        if (i10 > i13) {
            c(i11 + i10, true);
        } else if (i10 < i13) {
            c(i10, false);
        }
        this.f4965h = i10;
    }

    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
