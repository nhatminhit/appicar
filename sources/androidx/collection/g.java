package androidx.collection;

import d.m0;
import d.o0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import w7.l;

public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f1531a;

    /* renamed from: b  reason: collision with root package name */
    public int f1532b;

    /* renamed from: c  reason: collision with root package name */
    public int f1533c;

    /* renamed from: d  reason: collision with root package name */
    public int f1534d;

    /* renamed from: e  reason: collision with root package name */
    public int f1535e;

    /* renamed from: f  reason: collision with root package name */
    public int f1536f;

    /* renamed from: g  reason: collision with root package name */
    public int f1537g;

    /* renamed from: h  reason: collision with root package name */
    public int f1538h;

    public g(int i10) {
        if (i10 > 0) {
            this.f1533c = i10;
            this.f1531a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    @o0
    public V a(@m0 K k10) {
        return null;
    }

    public final synchronized int b() {
        return this.f1535e;
    }

    public void c(boolean z10, @m0 K k10, @m0 V v10, @o0 V v11) {
    }

    public final void d() {
        r(-1);
    }

    public final synchronized int e() {
        return this.f1536f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f1535e++;
        r1 = r4.f1531a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4.f1531a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.f1532b += n(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        c(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r(r4.f1533c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V f(@d.m0 K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f1531a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f1537g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f1537g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f1538h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f1538h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f1535e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f1535e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.f1531a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f1531a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f1532b     // Catch:{ all -> 0x004e }
            int r3 = r4.n(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f1532b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.c(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f1533c
            r4.r(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.g.f(java.lang.Object):java.lang.Object");
    }

    public final synchronized int g() {
        return this.f1537g;
    }

    public final synchronized int h() {
        return this.f1533c;
    }

    public final synchronized int i() {
        return this.f1538h;
    }

    @o0
    public final V j(@m0 K k10, @m0 V v10) {
        V put;
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1534d++;
            this.f1532b += n(k10, v10);
            put = this.f1531a.put(k10, v10);
            if (put != null) {
                this.f1532b -= n(k10, put);
            }
        }
        if (put != null) {
            c(false, k10, put, v10);
        }
        r(this.f1533c);
        return put;
    }

    public final synchronized int k() {
        return this.f1534d;
    }

    @o0
    public final V l(@m0 K k10) {
        V remove;
        if (k10 != null) {
            synchronized (this) {
                remove = this.f1531a.remove(k10);
                if (remove != null) {
                    this.f1532b -= n(k10, remove);
                }
            }
            if (remove != null) {
                c(false, k10, remove, (V) null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public void m(int i10) {
        if (i10 > 0) {
            synchronized (this) {
                this.f1533c = i10;
            }
            r(i10);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int n(K k10, V v10) {
        int p10 = p(k10, v10);
        if (p10 >= 0) {
            return p10;
        }
        throw new IllegalStateException("Negative size: " + k10 + l.f14755k + v10);
    }

    public final synchronized int o() {
        return this.f1532b;
    }

    public int p(@m0 K k10, @m0 V v10) {
        return 1;
    }

    public final synchronized Map<K, V> q() {
        return new LinkedHashMap(this.f1531a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f1532b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f1531a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f1532b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f1532b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f1531a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1531a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f1531a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f1532b     // Catch:{ all -> 0x0071 }
            int r3 = r4.n(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f1532b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f1536f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f1536f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.c(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.g.r(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f1537g;
        i11 = this.f1538h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f1533c), Integer.valueOf(this.f1537g), Integer.valueOf(this.f1538h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0)});
    }
}
