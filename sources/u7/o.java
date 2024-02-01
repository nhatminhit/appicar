package u7;

import d.m0;
import j6.c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import u7.a;
import w7.q0;

public final class o implements a.b {
    public static final String T = "CachedRegionTracker";
    public static final int U = -1;
    public static final int V = -2;
    public final a O;
    public final String P;
    public final c Q;
    public final TreeSet<a> R = new TreeSet<>();
    public final a S = new a(0, 0);

    public static class a implements Comparable<a> {
        public long O;
        public long P;
        public int Q;

        public a(long j10, long j11) {
            this.O = j10;
            this.P = j11;
        }

        /* renamed from: a */
        public int compareTo(@m0 a aVar) {
            return q0.s(this.O, aVar.O);
        }
    }

    public o(a aVar, String str, c cVar) {
        this.O = aVar;
        this.P = str;
        this.Q = cVar;
        synchronized (this) {
            Iterator<j> descendingIterator = aVar.e(str, this).descendingIterator();
            while (descendingIterator.hasNext()) {
                h(descendingIterator.next());
            }
        }
    }

    public synchronized void b(a aVar, j jVar) {
        h(jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(u7.a r7, u7.j r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            u7.o$a r7 = new u7.o$a     // Catch:{ all -> 0x0061 }
            long r0 = r8.P     // Catch:{ all -> 0x0061 }
            long r2 = r8.Q     // Catch:{ all -> 0x0061 }
            long r2 = r2 + r0
            r7.<init>(r0, r2)     // Catch:{ all -> 0x0061 }
            java.util.TreeSet<u7.o$a> r8 = r6.R     // Catch:{ all -> 0x0061 }
            java.lang.Object r8 = r8.floor(r7)     // Catch:{ all -> 0x0061 }
            u7.o$a r8 = (u7.o.a) r8     // Catch:{ all -> 0x0061 }
            if (r8 != 0) goto L_0x001e
            java.lang.String r7 = "CachedRegionTracker"
            java.lang.String r8 = "Removed a span we were not aware of"
            w7.p.d(r7, r8)     // Catch:{ all -> 0x0061 }
            monitor-exit(r6)
            return
        L_0x001e:
            java.util.TreeSet<u7.o$a> r0 = r6.R     // Catch:{ all -> 0x0061 }
            r0.remove(r8)     // Catch:{ all -> 0x0061 }
            long r0 = r8.O     // Catch:{ all -> 0x0061 }
            long r2 = r7.O     // Catch:{ all -> 0x0061 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0046
            u7.o$a r4 = new u7.o$a     // Catch:{ all -> 0x0061 }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x0061 }
            j6.c r0 = r6.Q     // Catch:{ all -> 0x0061 }
            long[] r0 = r0.f9556f     // Catch:{ all -> 0x0061 }
            long r1 = r4.P     // Catch:{ all -> 0x0061 }
            int r0 = java.util.Arrays.binarySearch(r0, r1)     // Catch:{ all -> 0x0061 }
            if (r0 >= 0) goto L_0x003f
            int r0 = -r0
            int r0 = r0 + -2
        L_0x003f:
            r4.Q = r0     // Catch:{ all -> 0x0061 }
            java.util.TreeSet<u7.o$a> r0 = r6.R     // Catch:{ all -> 0x0061 }
            r0.add(r4)     // Catch:{ all -> 0x0061 }
        L_0x0046:
            long r0 = r8.P     // Catch:{ all -> 0x0061 }
            long r2 = r7.P     // Catch:{ all -> 0x0061 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x005f
            u7.o$a r7 = new u7.o$a     // Catch:{ all -> 0x0061 }
            r4 = 1
            long r2 = r2 + r4
            r7.<init>(r2, r0)     // Catch:{ all -> 0x0061 }
            int r8 = r8.Q     // Catch:{ all -> 0x0061 }
            r7.Q = r8     // Catch:{ all -> 0x0061 }
            java.util.TreeSet<u7.o$a> r8 = r6.R     // Catch:{ all -> 0x0061 }
            r8.add(r7)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r6)
            return
        L_0x0061:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o.c(u7.a, u7.j):void");
    }

    public void d(a aVar, j jVar, j jVar2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int g(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            u7.o$a r0 = r8.S     // Catch:{ all -> 0x0050 }
            r0.O = r9     // Catch:{ all -> 0x0050 }
            java.util.TreeSet<u7.o$a> r1 = r8.R     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r1.floor(r0)     // Catch:{ all -> 0x0050 }
            u7.o$a r0 = (u7.o.a) r0     // Catch:{ all -> 0x0050 }
            r1 = -1
            if (r0 == 0) goto L_0x004e
            long r2 = r0.P     // Catch:{ all -> 0x0050 }
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x004e
            int r9 = r0.Q     // Catch:{ all -> 0x0050 }
            if (r9 != r1) goto L_0x001b
            goto L_0x004e
        L_0x001b:
            j6.c r10 = r8.Q     // Catch:{ all -> 0x0050 }
            int r0 = r10.f9554d     // Catch:{ all -> 0x0050 }
            int r0 = r0 + -1
            if (r9 != r0) goto L_0x0034
            long[] r0 = r10.f9556f     // Catch:{ all -> 0x0050 }
            r4 = r0[r9]     // Catch:{ all -> 0x0050 }
            int[] r0 = r10.f9555e     // Catch:{ all -> 0x0050 }
            r0 = r0[r9]     // Catch:{ all -> 0x0050 }
            long r0 = (long) r0
            long r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r9 = -2
        L_0x0032:
            monitor-exit(r8)
            return r9
        L_0x0034:
            long[] r0 = r10.f9557g     // Catch:{ all -> 0x0050 }
            r4 = r0[r9]     // Catch:{ all -> 0x0050 }
            long[] r0 = r10.f9556f     // Catch:{ all -> 0x0050 }
            r6 = r0[r9]     // Catch:{ all -> 0x0050 }
            long r2 = r2 - r6
            long r4 = r4 * r2
            int[] r0 = r10.f9555e     // Catch:{ all -> 0x0050 }
            r0 = r0[r9]     // Catch:{ all -> 0x0050 }
            long r0 = (long) r0     // Catch:{ all -> 0x0050 }
            long r4 = r4 / r0
            long[] r10 = r10.f9558h     // Catch:{ all -> 0x0050 }
            r9 = r10[r9]     // Catch:{ all -> 0x0050 }
            long r9 = r9 + r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            int r9 = (int) r9
            goto L_0x0032
        L_0x004e:
            monitor-exit(r8)
            return r1
        L_0x0050:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.o.g(long):int");
    }

    public final void h(j jVar) {
        long j10 = jVar.P;
        a aVar = new a(j10, jVar.Q + j10);
        a floor = this.R.floor(aVar);
        a ceiling = this.R.ceiling(aVar);
        boolean i10 = i(floor, aVar);
        if (i(aVar, ceiling)) {
            if (i10) {
                floor.P = ceiling.P;
                floor.Q = ceiling.Q;
            } else {
                aVar.P = ceiling.P;
                aVar.Q = ceiling.Q;
                this.R.add(aVar);
            }
            this.R.remove(ceiling);
        } else if (i10) {
            floor.P = aVar.P;
            int i11 = floor.Q;
            while (true) {
                c cVar = this.Q;
                if (i11 >= cVar.f9554d - 1) {
                    break;
                }
                int i12 = i11 + 1;
                if (cVar.f9556f[i12] > floor.P) {
                    break;
                }
                i11 = i12;
            }
            floor.Q = i11;
        } else {
            int binarySearch = Arrays.binarySearch(this.Q.f9556f, aVar.P);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            aVar.Q = binarySearch;
            this.R.add(aVar);
        }
    }

    public final boolean i(a aVar, a aVar2) {
        return (aVar == null || aVar2 == null || aVar.P != aVar2.O) ? false : true;
    }

    public void j() {
        this.O.j(this.P, this);
    }
}
