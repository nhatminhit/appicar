package hi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import androidx.lifecycle.y;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public class f extends e {
    @o0
    public static final ViewDataBinding.i A0;
    @o0
    public static final SparseIntArray B0 = null;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final RelativeLayout f19639y0;

    /* renamed from: z0  reason: collision with root package name */
    public long f19640z0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(6);
        A0 = iVar;
        iVar.a(0, new String[]{"view_option_login", "view_login", "view_device_limit", "view_sign_up", "view_forgot_password"}, new int[]{1, 2, 3, 4, 5}, new int[]{a.l.view_option_login, a.l.view_login, a.l.view_device_limit, a.l.view_sign_up, a.l.view_forgot_password});
    }

    public f(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 6, A0, B0));
    }

    public f(l lVar, View view, Object[] objArr) {
        super(lVar, view, 5, objArr[3], objArr[5], objArr[2], objArr[1], objArr[4]);
        this.f19640z0 = -1;
        G0(this.f19634t0);
        G0(this.f19635u0);
        G0(this.f19636v0);
        G0(this.f19637w0);
        G0(this.f19638x0);
        RelativeLayout relativeLayout = objArr[0];
        this.f19639y0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public void I0(@o0 y yVar) {
        super.I0(yVar);
        this.f19637w0.I0(yVar);
        this.f19636v0.I0(yVar);
        this.f19634t0.I0(yVar);
        this.f19638x0.I0(yVar);
        this.f19635u0.I0(yVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r4.f19636v0.Z() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r4.f19634t0.Z() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r4.f19638x0.Z() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r4.f19635u0.Z() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.f19637w0.Z() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f19640z0     // Catch:{ all -> 0x003c }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            hi.m r0 = r4.f19637w0
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            hi.k r0 = r4.f19636v0
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x001f
            return r1
        L_0x001f:
            hi.g r0 = r4.f19634t0
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0028
            return r1
        L_0x0028:
            hi.o r0 = r4.f19638x0
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0031
            return r1
        L_0x0031:
            hi.i r0 = r4.f19635u0
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x003a
            return r1
        L_0x003a:
            r0 = 0
            return r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.f.Z():boolean");
    }

    public void b0() {
        synchronized (this) {
            this.f19640z0 = 32;
        }
        this.f19637w0.b0();
        this.f19636v0.b0();
        this.f19634t0.b0();
        this.f19638x0.b0();
        this.f19635u0.b0();
        w0();
    }

    public boolean e1(int i10, @o0 Object obj) {
        return true;
    }

    public boolean h0(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return u1((k) obj, i11);
        }
        if (i10 == 1) {
            return t1((i) obj, i11);
        }
        if (i10 == 2) {
            return s1((g) obj, i11);
        }
        if (i10 == 3) {
            return w1((o) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return v1((m) obj, i11);
    }

    public void r() {
        synchronized (this) {
            this.f19640z0 = 0;
        }
        ViewDataBinding.t(this.f19637w0);
        ViewDataBinding.t(this.f19636v0);
        ViewDataBinding.t(this.f19634t0);
        ViewDataBinding.t(this.f19638x0);
        ViewDataBinding.t(this.f19635u0);
    }

    public final boolean s1(g gVar, int i10) {
        if (i10 != xh.a.f24581a) {
            return false;
        }
        synchronized (this) {
            this.f19640z0 |= 4;
        }
        return true;
    }

    public final boolean t1(i iVar, int i10) {
        if (i10 != xh.a.f24581a) {
            return false;
        }
        synchronized (this) {
            this.f19640z0 |= 2;
        }
        return true;
    }

    public final boolean u1(k kVar, int i10) {
        if (i10 != xh.a.f24581a) {
            return false;
        }
        synchronized (this) {
            this.f19640z0 |= 1;
        }
        return true;
    }

    public final boolean v1(m mVar, int i10) {
        if (i10 != xh.a.f24581a) {
            return false;
        }
        synchronized (this) {
            this.f19640z0 |= 16;
        }
        return true;
    }

    public final boolean w1(o oVar, int i10) {
        if (i10 != xh.a.f24581a) {
            return false;
        }
        synchronized (this) {
            this.f19640z0 |= 8;
        }
        return true;
    }
}
