package zi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import androidx.lifecycle.y;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class d extends c {
    @o0

    /* renamed from: x0  reason: collision with root package name */
    public static final ViewDataBinding.i f25160x0;
    @o0

    /* renamed from: y0  reason: collision with root package name */
    public static final SparseIntArray f25161y0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final RelativeLayout f25162v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f25163w0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        f25160x0 = iVar;
        iVar.a(0, new String[]{"activity_type_device"}, new int[]{1}, new int[]{R.layout.activity_type_device});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25161y0 = sparseIntArray;
        sparseIntArray.put(R.id.card, 2);
    }

    public d(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 3, f25160x0, f25161y0));
    }

    public d(l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, objArr[2], objArr[1]);
        this.f25163w0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.f25162v0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        G0(this.f25159u0);
        J0(view);
        b0();
    }

    public void I0(@o0 y yVar) {
        super.I0(yVar);
        this.f25159u0.I0(yVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.f25159u0.Z() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f25163w0     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            zi.e r0 = r4.f25159u0
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zi.d.Z():boolean");
    }

    public void b0() {
        synchronized (this) {
            this.f25163w0 = 2;
        }
        this.f25159u0.b0();
        w0();
    }

    public boolean e1(int i10, @o0 Object obj) {
        return true;
    }

    public boolean h0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return s1((e) obj, i11);
    }

    public void r() {
        synchronized (this) {
            this.f25163w0 = 0;
        }
        ViewDataBinding.t(this.f25159u0);
    }

    public final boolean s1(e eVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f25163w0 |= 1;
        }
        return true;
    }
}
