package w7;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<b<T>> f14732a = new CopyOnWriteArrayList<>();

    public interface a<T> {
        void a(T t10);
    }

    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f14733a;

        /* renamed from: b  reason: collision with root package name */
        public final T f14734b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14735c;

        public b(Handler handler, T t10) {
            this.f14733a = handler;
            this.f14734b = t10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(a aVar) {
            if (!this.f14735c) {
                aVar.a(this.f14734b);
            }
        }

        public void c(a<T> aVar) {
            this.f14733a.post(new j(this, aVar));
        }

        public void e() {
            this.f14735c = true;
        }
    }

    public void a(Handler handler, T t10) {
        a.a((handler == null || t10 == null) ? false : true);
        c(t10);
        this.f14732a.add(new b(handler, t10));
    }

    public void b(a<T> aVar) {
        Iterator<b<T>> it = this.f14732a.iterator();
        while (it.hasNext()) {
            it.next().c(aVar);
        }
    }

    public void c(T t10) {
        Iterator<b<T>> it = this.f14732a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f14734b == t10) {
                next.e();
                this.f14732a.remove(next);
            }
        }
    }
}
