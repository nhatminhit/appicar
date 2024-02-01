package t2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import e1.n;

public final class h implements RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    public final i0<RecyclerView.s> f12836a = new i0<>(new f());

    public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        this.f12836a.a(motionEvent).a(recyclerView, motionEvent);
    }

    public void b(int i10, @m0 RecyclerView.s sVar) {
        n.a(sVar != null);
        this.f12836a.b(i10, sVar);
    }

    public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        return this.f12836a.a(motionEvent).c(recyclerView, motionEvent);
    }

    public void e(boolean z10) {
    }
}
