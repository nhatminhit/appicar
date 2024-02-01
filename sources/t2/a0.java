package t2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.ArrayList;
import java.util.List;
import t2.e0;

public final class a0<K> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12760d = "ResetManager";

    /* renamed from: a  reason: collision with root package name */
    public final List<b0> f12761a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.s f12762b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final e0.b<K> f12763c = new b();

    public class a implements RecyclerView.s {
        public a() {
        }

        public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        }

        public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
            if (!p.c(motionEvent)) {
                return false;
            }
            a0.this.b();
            return false;
        }

        public void e(boolean z10) {
        }
    }

    public class b extends e0.b<K> {
        public b() {
        }

        public void c() {
            a0.this.b();
        }
    }

    public void a(@m0 b0 b0Var) {
        this.f12761a.add(b0Var);
    }

    public void b() {
        for (b0 next : this.f12761a) {
            if (next.b()) {
                next.reset();
            }
        }
    }

    public RecyclerView.s c() {
        return this.f12762b;
    }

    public e0.b<K> d() {
        return this.f12763c;
    }
}
