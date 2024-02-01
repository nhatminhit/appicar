package t4;

import d.m0;
import d.o0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class h<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<T, Y> f12947a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f12948b;

    /* renamed from: c  reason: collision with root package name */
    public long f12949c;

    /* renamed from: d  reason: collision with root package name */
    public long f12950d;

    public h(long j10) {
        this.f12948b = j10;
        this.f12949c = j10;
    }

    public void b() {
        q(0);
    }

    public synchronized void c(float f10) {
        if (f10 >= 0.0f) {
            this.f12949c = (long) Math.round(((float) this.f12948b) * f10);
            j();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    public synchronized long d() {
        return this.f12950d;
    }

    public synchronized long e() {
        return this.f12949c;
    }

    public synchronized boolean i(@m0 T t10) {
        return this.f12947a.containsKey(t10);
    }

    public final void j() {
        q(this.f12949c);
    }

    @o0
    public synchronized Y k(@m0 T t10) {
        return this.f12947a.get(t10);
    }

    public synchronized int l() {
        return this.f12947a.size();
    }

    public int m(@o0 Y y10) {
        return 1;
    }

    public void n(@m0 T t10, @o0 Y y10) {
    }

    @o0
    public synchronized Y o(@m0 T t10, @o0 Y y10) {
        long m10 = (long) m(y10);
        if (m10 >= this.f12949c) {
            n(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f12950d += m10;
        }
        Y put = this.f12947a.put(t10, y10);
        if (put != null) {
            this.f12950d -= (long) m(put);
            if (!put.equals(y10)) {
                n(t10, put);
            }
        }
        j();
        return put;
    }

    @o0
    public synchronized Y p(@m0 T t10) {
        Y remove;
        remove = this.f12947a.remove(t10);
        if (remove != null) {
            this.f12950d -= (long) m(remove);
        }
        return remove;
    }

    public synchronized void q(long j10) {
        while (this.f12950d > j10) {
            Iterator<Map.Entry<T, Y>> it = this.f12947a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f12950d -= (long) m(value);
            Object key = next.getKey();
            it.remove();
            n(key, value);
        }
    }
}
