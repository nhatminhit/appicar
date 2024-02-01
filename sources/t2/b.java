package t2;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import e1.n;
import t2.n;

public abstract class b {

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f12766a;

        public a(@m0 RecyclerView recyclerView) {
            n.a(recyclerView != null);
            this.f12766a = recyclerView;
        }

        public boolean a(@m0 MotionEvent motionEvent) {
            if (!b.b(this.f12766a) || this.f12766a.C0()) {
                return false;
            }
            View Z = this.f12766a.Z(motionEvent.getX(), motionEvent.getY());
            return (Z != null ? this.f12766a.o0(Z) : -1) == -1;
        }
    }

    /* renamed from: t2.b$b  reason: collision with other inner class name */
    public static final class C0214b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f12767a;

        /* renamed from: b  reason: collision with root package name */
        public final n<?> f12768b;

        public C0214b(@m0 RecyclerView recyclerView, @m0 n<?> nVar) {
            boolean z10 = true;
            n.a(recyclerView != null);
            n.a(nVar == null ? false : z10);
            this.f12767a = recyclerView;
            this.f12768b = nVar;
        }

        public boolean a(@m0 MotionEvent motionEvent) {
            if (!b.b(this.f12767a) || this.f12767a.C0()) {
                return false;
            }
            n.a<?> a10 = this.f12768b.a(motionEvent);
            return a10 == null || !a10.d(motionEvent);
        }
    }

    public static boolean b(@m0 RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        return (layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager);
    }

    public abstract boolean a(@m0 MotionEvent motionEvent);
}
