package t2;

import d.j0;
import d.m0;
import d.x0;
import e1.n;
import java.util.ArrayList;
import java.util.List;

public final class w {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12891d = "OperationMonitor";

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f12892a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final b0 f12893b = new a();

    /* renamed from: c  reason: collision with root package name */
    public int f12894c = 0;

    public class a implements b0 {
        public a() {
        }

        public boolean b() {
            return w.this.d();
        }

        public void reset() {
            w.this.h();
        }
    }

    public interface b {
        void a();
    }

    public void a(@m0 b bVar) {
        n.a(bVar != null);
        this.f12892a.add(bVar);
    }

    @x0({x0.a.LIBRARY})
    @m0
    public b0 b() {
        return this.f12893b;
    }

    public void c(boolean z10) {
        boolean z11 = true;
        if (!z10 ? this.f12894c != 0 : this.f12894c <= 0) {
            z11 = false;
        }
        n.i(z11);
    }

    @x0({x0.a.LIBRARY})
    public synchronized boolean d() {
        return e();
    }

    public synchronized boolean e() {
        return this.f12894c > 0;
    }

    public final void f() {
        for (b a10 : this.f12892a) {
            a10.a();
        }
    }

    public void g(@m0 b bVar) {
        n.a(bVar != null);
        this.f12892a.remove(bVar);
    }

    @x0({x0.a.LIBRARY})
    @j0
    public synchronized void h() {
        if (this.f12894c > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Resetting OperationMonitor with ");
            sb2.append(this.f12894c);
            sb2.append(" active operations.");
        }
        this.f12894c = 0;
        f();
    }

    @j0
    public synchronized void i() {
        int i10 = this.f12894c + 1;
        this.f12894c = i10;
        if (i10 == 1) {
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        return;
     */
    @d.j0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void j() {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12894c     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            int r0 = r0 + -1
            r1.f12894c = r0     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0010
            r1.f()     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.w.j():void");
    }
}
