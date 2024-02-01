package t2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import e1.n;

public final class x implements RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    public final n<?> f12896a;

    /* renamed from: b  reason: collision with root package name */
    public final u f12897b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.s f12898c;

    public x(n<?> nVar, u uVar, @o0 RecyclerView.s sVar) {
        boolean z10 = true;
        n.a(nVar != null);
        n.a(uVar == null ? false : z10);
        this.f12896a = nVar;
        this.f12897b = uVar;
        if (sVar != null) {
            this.f12898c = sVar;
        } else {
            this.f12898c = new f();
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f12898c.a(recyclerView, motionEvent);
    }

    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return (!p.n(motionEvent) || !this.f12896a.d(motionEvent)) ? this.f12898c.c(recyclerView, motionEvent) : this.f12897b.a(motionEvent);
    }

    public void e(boolean z10) {
        this.f12898c.e(z10);
    }
}
