package h5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8851a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Map<SoftReference<a>, Boolean> f8852b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<a> f8853c = new ReferenceQueue<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final o f8854a = new o();
    }

    public static o a() {
        return a.f8854a;
    }

    public int b() {
        int i10;
        synchronized (this.f8851a) {
            i10 = 0;
            c();
            for (SoftReference<a> clear : this.f8852b.keySet()) {
                clear.clear();
                i10++;
            }
            this.f8852b.clear();
        }
        return i10;
    }

    public final void c() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f8853c.poll();
            if (softReference != null) {
                this.f8852b.remove(softReference);
            } else {
                return;
            }
        }
    }

    public SoftReference<a> d(a aVar) {
        SoftReference<a> softReference = new SoftReference<>(aVar, this.f8853c);
        this.f8852b.put(softReference, Boolean.TRUE);
        c();
        return softReference;
    }
}
