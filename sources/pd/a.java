package pd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentMap<String, ConcurrentLinkedQueue<C0385a>> f21977a = new ConcurrentHashMap();

    /* renamed from: pd.a$a  reason: collision with other inner class name */
    public interface C0385a {
        void c(Object... objArr);
    }

    public class b implements C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final String f21978a;

        /* renamed from: b  reason: collision with root package name */
        public final C0385a f21979b;

        public b(String str, C0385a aVar) {
            this.f21978a = str;
            this.f21979b = aVar;
        }

        public void c(Object... objArr) {
            a.this.f(this.f21978a, this);
            this.f21979b.c(objArr);
        }
    }

    public static boolean i(C0385a aVar, C0385a aVar2) {
        if (aVar.equals(aVar2)) {
            return true;
        }
        if (aVar2 instanceof b) {
            return aVar.equals(((b) aVar2).f21979b);
        }
        return false;
    }

    public a a(String str, Object... objArr) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f21977a.get(str);
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((C0385a) it.next()).c(objArr);
            }
        }
        return this;
    }

    public boolean b(String str) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f21977a.get(str);
        return concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty();
    }

    public List<C0385a> c(String str) {
        ArrayList arrayList;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f21977a.get(str);
        if (concurrentLinkedQueue == null) {
            arrayList = new ArrayList(0);
        }
        return arrayList;
    }

    public a d() {
        this.f21977a.clear();
        return this;
    }

    public a e(String str) {
        this.f21977a.remove(str);
        return this;
    }

    public a f(String str, C0385a aVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f21977a.get(str);
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i(aVar, (C0385a) it.next())) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = new java.util.concurrent.ConcurrentLinkedQueue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pd.a g(java.lang.String r3, pd.a.C0385a r4) {
        /*
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<pd.a$a>> r0 = r2.f21977a
            java.lang.Object r0 = r0.get(r3)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            if (r0 != 0) goto L_0x001a
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<pd.a$a>> r1 = r2.f21977a
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            if (r3 == 0) goto L_0x001a
            r0 = r3
        L_0x001a:
            r0.add(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.a.g(java.lang.String, pd.a$a):pd.a");
    }

    public a h(String str, C0385a aVar) {
        g(str, new b(str, aVar));
        return this;
    }
}
