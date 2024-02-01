package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import d.j0;
import d.m0;
import d.o0;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f623a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f624b;

    public class LifecycleOnBackPressedCancellable implements u, a {
        public final p O;
        public final b P;
        @o0
        public a Q;

        public LifecycleOnBackPressedCancellable(@m0 p pVar, @m0 b bVar) {
            this.O = pVar;
            this.P = bVar;
            pVar.a(this);
        }

        public void cancel() {
            this.O.d(this);
            this.P.e(this);
            a aVar = this.Q;
            if (aVar != null) {
                aVar.cancel();
                this.Q = null;
            }
        }

        public void d(@m0 y yVar, @m0 p.a aVar) {
            if (aVar == p.a.ON_START) {
                this.Q = OnBackPressedDispatcher.this.c(this.P);
            } else if (aVar == p.a.ON_STOP) {
                a aVar2 = this.Q;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == p.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements a {
        public final b O;

        public a(b bVar) {
            this.O = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f624b.remove(this.O);
            this.O.e(this);
        }
    }

    public OnBackPressedDispatcher() {
        this((Runnable) null);
    }

    public OnBackPressedDispatcher(@o0 Runnable runnable) {
        this.f624b = new ArrayDeque<>();
        this.f623a = runnable;
    }

    @j0
    public void a(@m0 b bVar) {
        c(bVar);
    }

    @SuppressLint({"LambdaLast"})
    @j0
    public void b(@m0 y yVar, @m0 b bVar) {
        p lifecycle = yVar.getLifecycle();
        if (lifecycle.b() != p.b.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    @j0
    @m0
    public a c(@m0 b bVar) {
        this.f624b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    @j0
    public boolean d() {
        Iterator<b> descendingIterator = this.f624b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    @j0
    public void e() {
        Iterator<b> descendingIterator = this.f624b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f623a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
