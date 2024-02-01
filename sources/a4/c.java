package a4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import t4.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f140a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f141b = new b();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Lock f142a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f143b;
    }

    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f144b = 10;

        /* renamed from: a  reason: collision with root package name */
        public final Queue<a> f145a = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.f145a) {
                poll = this.f145a.poll();
            }
            return poll == null ? new a() : poll;
        }

        public void b(a aVar) {
            synchronized (this.f145a) {
                if (this.f145a.size() < 10) {
                    this.f145a.offer(aVar);
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f140a.get(str);
            if (aVar == null) {
                aVar = this.f141b.a();
                this.f140a.put(str, aVar);
            }
            aVar.f143b++;
        }
        aVar.f142a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) k.d(this.f140a.get(str));
            int i10 = aVar.f143b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f143b = i11;
                if (i11 == 0) {
                    a remove = this.f140a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f141b.b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f143b);
            }
        }
        aVar.f142a.unlock();
    }
}
