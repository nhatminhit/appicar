package w2;

import a3.f;
import android.database.Cursor;
import androidx.paging.PositionalDataSource;
import androidx.room.c;
import d.m0;
import d.x0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u2.n2;
import u2.q2;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public abstract class a<T> extends PositionalDataSource<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q2 f14597a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14598b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14599c;

    /* renamed from: d  reason: collision with root package name */
    public final n2 f14600d;

    /* renamed from: e  reason: collision with root package name */
    public final c.C0053c f14601e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14602f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f14603g;

    /* renamed from: w2.a$a  reason: collision with other inner class name */
    public class C0235a extends c.C0053c {
        public C0235a(String[] strArr) {
            super(strArr);
        }

        public void b(@m0 Set<String> set) {
            a.this.invalidate();
        }
    }

    public a(@m0 n2 n2Var, @m0 f fVar, boolean z10, boolean z11, @m0 String... strArr) {
        this(n2Var, q2.k(fVar), z10, z11, strArr);
    }

    public a(@m0 n2 n2Var, @m0 f fVar, boolean z10, @m0 String... strArr) {
        this(n2Var, q2.k(fVar), z10, strArr);
    }

    public a(@m0 n2 n2Var, @m0 q2 q2Var, boolean z10, boolean z11, @m0 String... strArr) {
        this.f14603g = new AtomicBoolean(false);
        this.f14600d = n2Var;
        this.f14597a = q2Var;
        this.f14602f = z10;
        this.f14598b = "SELECT COUNT(*) FROM ( " + q2Var.f() + " )";
        this.f14599c = "SELECT * FROM ( " + q2Var.f() + " ) LIMIT ? OFFSET ?";
        this.f14601e = new C0235a(strArr);
        if (z11) {
            h();
        }
    }

    public a(@m0 n2 n2Var, @m0 q2 q2Var, boolean z10, @m0 String... strArr) {
        this(n2Var, q2Var, z10, true, strArr);
    }

    @m0
    public abstract List<T> a(@m0 Cursor cursor);

    public int b() {
        h();
        q2 h10 = q2.h(this.f14598b, this.f14597a.c());
        h10.i(this.f14597a);
        Cursor D = this.f14600d.D(h10);
        try {
            if (D.moveToFirst()) {
                return D.getInt(0);
            }
            D.close();
            h10.a();
            return 0;
        } finally {
            D.close();
            h10.a();
        }
    }

    public final q2 c(int i10, int i11) {
        q2 h10 = q2.h(this.f14599c, this.f14597a.c() + 2);
        h10.i(this.f14597a);
        h10.q0(h10.c() - 1, (long) i11);
        h10.q0(h10.c(), (long) i10);
        return h10;
    }

    public boolean d() {
        h();
        this.f14600d.n().l();
        return a.super.isInvalid();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(@d.m0 androidx.paging.PositionalDataSource.LoadInitialParams r7, @d.m0 androidx.paging.PositionalDataSource.LoadInitialCallback<T> r8) {
        /*
            r6 = this;
            r6.h()
            java.util.List r0 = java.util.Collections.emptyList()
            u2.n2 r1 = r6.f14600d
            r1.e()
            r1 = 0
            int r2 = r6.b()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0035
            int r0 = computeInitialLoadPosition(r7, r2)     // Catch:{ all -> 0x004a }
            int r7 = computeInitialLoadSize(r7, r0, r2)     // Catch:{ all -> 0x004a }
            u2.q2 r7 = r6.c(r0, r7)     // Catch:{ all -> 0x004a }
            u2.n2 r3 = r6.f14600d     // Catch:{ all -> 0x0033 }
            android.database.Cursor r1 = r3.D(r7)     // Catch:{ all -> 0x0033 }
            java.util.List r3 = r6.a(r1)     // Catch:{ all -> 0x0033 }
            u2.n2 r4 = r6.f14600d     // Catch:{ all -> 0x0033 }
            r4.I()     // Catch:{ all -> 0x0033 }
            r5 = r3
            r3 = r7
            r7 = r0
            r0 = r5
            goto L_0x0037
        L_0x0033:
            r8 = move-exception
            goto L_0x004c
        L_0x0035:
            r7 = 0
            r3 = r1
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            u2.n2 r1 = r6.f14600d
            r1.k()
            if (r3 == 0) goto L_0x0046
            r3.a()
        L_0x0046:
            r8.onResult(r0, r7, r2)
            return
        L_0x004a:
            r8 = move-exception
            r7 = r1
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            u2.n2 r0 = r6.f14600d
            r0.k()
            if (r7 == 0) goto L_0x005b
            r7.a()
        L_0x005b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.e(androidx.paging.PositionalDataSource$LoadInitialParams, androidx.paging.PositionalDataSource$LoadInitialCallback):void");
    }

    @m0
    public List<T> f(int i10, int i11) {
        List<T> a10;
        q2 c10 = c(i10, i11);
        if (this.f14602f) {
            this.f14600d.e();
            Cursor cursor = null;
            try {
                cursor = this.f14600d.D(c10);
                a10 = a(cursor);
                this.f14600d.I();
                if (cursor != null) {
                    cursor.close();
                }
                this.f14600d.k();
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                this.f14600d.k();
                c10.a();
                throw th2;
            }
        } else {
            Cursor D = this.f14600d.D(c10);
            try {
                a10 = a(D);
                D.close();
            } catch (Throwable th3) {
                D.close();
                c10.a();
                throw th3;
            }
        }
        c10.a();
        return a10;
    }

    public void g(@m0 PositionalDataSource.LoadRangeParams loadRangeParams, @m0 PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(f(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public final void h() {
        if (this.f14603g.compareAndSet(false, true)) {
            this.f14600d.n().b(this.f14601e);
        }
    }
}
