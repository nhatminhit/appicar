package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import x0.b0;

public final class l implements Runnable {
    public static final ThreadLocal<l> S = new ThreadLocal<>();
    public static Comparator<c> T = new a();
    public ArrayList<RecyclerView> O = new ArrayList<>();
    public long P;
    public long Q;
    public ArrayList<c> R = new ArrayList<>();

    public static class a implements Comparator<c> {
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3604d;
            if ((recyclerView == null) != (cVar2.f3604d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3601a;
            if (z10 != cVar2.f3601a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f3602b - cVar.f3602b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3603c - cVar2.f3603c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        public int f3597a;

        /* renamed from: b  reason: collision with root package name */
        public int f3598b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f3599c;

        /* renamed from: d  reason: collision with root package name */
        public int f3600d;

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f3600d * 2;
                int[] iArr = this.f3599c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3599c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 2)];
                    this.f3599c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3599c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f3600d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b() {
            int[] iArr = this.f3599c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3600d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f3600d = 0;
            int[] iArr = this.f3599c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f3142d0;
            if (recyclerView.f3140c0 != null && oVar != null && oVar.I0()) {
                if (z10) {
                    if (!recyclerView.R.q()) {
                        oVar.s(recyclerView.f3140c0.e(), this);
                    }
                } else if (!recyclerView.C0()) {
                    oVar.r(this.f3597a, this.f3598b, recyclerView.V0, this);
                }
                int i10 = this.f3600d;
                if (i10 > oVar.f3274m) {
                    oVar.f3274m = i10;
                    oVar.f3275n = z10;
                    recyclerView.P.L();
                }
            }
        }

        public boolean d(int i10) {
            if (this.f3599c != null) {
                int i11 = this.f3600d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3599c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f3597a = i10;
            this.f3598b = i11;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3601a;

        /* renamed from: b  reason: collision with root package name */
        public int f3602b;

        /* renamed from: c  reason: collision with root package name */
        public int f3603c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f3604d;

        /* renamed from: e  reason: collision with root package name */
        public int f3605e;

        public void a() {
            this.f3601a = false;
            this.f3602b = 0;
            this.f3603c = 0;
            this.f3604d = null;
            this.f3605e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.S.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.e0 t02 = RecyclerView.t0(recyclerView.S.i(i11));
            if (t02.f3222c == i10 && !t02.u()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.O.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.O.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.O.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.U0.c(recyclerView, false);
                i10 += recyclerView.U0.f3600d;
            }
        }
        this.R.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.O.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.U0;
                int abs = Math.abs(bVar.f3597a) + Math.abs(bVar.f3598b);
                for (int i14 = 0; i14 < bVar.f3600d * 2; i14 += 2) {
                    if (i12 >= this.R.size()) {
                        cVar = new c();
                        this.R.add(cVar);
                    } else {
                        cVar = this.R.get(i12);
                    }
                    int[] iArr = bVar.f3599c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3601a = i15 <= abs;
                    cVar.f3602b = abs;
                    cVar.f3603c = i15;
                    cVar.f3604d = recyclerView2;
                    cVar.f3605e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.R, T);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.e0 i10 = i(cVar.f3604d, cVar.f3605e, cVar.f3601a ? Long.MAX_VALUE : j10);
        if (i10 != null && i10.f3221b != null && i10.t() && !i10.u()) {
            h(i10.f3221b.get(), j10);
        }
    }

    public final void d(long j10) {
        int i10 = 0;
        while (i10 < this.R.size()) {
            c cVar = this.R.get(i10);
            if (cVar.f3604d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.P == 0) {
            this.P = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.U0.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(@o0 RecyclerView recyclerView, long j10) {
        if (recyclerView != null) {
            if (recyclerView.f3168u0 && recyclerView.S.j() != 0) {
                recyclerView.n1();
            }
            b bVar = recyclerView.U0;
            bVar.c(recyclerView, true);
            if (bVar.f3600d != 0) {
                try {
                    b0.b(RecyclerView.N1);
                    recyclerView.V0.k(recyclerView.f3140c0);
                    for (int i10 = 0; i10 < bVar.f3600d * 2; i10 += 2) {
                        i(recyclerView, bVar.f3599c[i10], j10);
                    }
                } finally {
                    b0.d();
                }
            }
        }
    }

    public final RecyclerView.e0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.P;
        try {
            recyclerView.Z0();
            RecyclerView.e0 J = wVar.J(i10, false, j10);
            if (J != null) {
                if (!J.t() || J.u()) {
                    wVar.a(J, false);
                } else {
                    wVar.C(J.f3220a);
                }
            }
            return J;
        } finally {
            recyclerView.b1(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.O.remove(recyclerView);
    }

    public void run() {
        try {
            b0.b(RecyclerView.M1);
            if (!this.O.isEmpty()) {
                int size = this.O.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.O.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.Q);
                    this.P = 0;
                    b0.d();
                }
            }
        } finally {
            this.P = 0;
            b0.d();
        }
    }
}
