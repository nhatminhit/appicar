package hi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public class h extends g {
    @o0
    public static final ViewDataBinding.i A0 = null;
    @o0
    public static final SparseIntArray B0;

    /* renamed from: z0  reason: collision with root package name */
    public long f19647z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(a.i.card_device_limit, 1);
        sparseIntArray.put(a.i.txt_device_limit, 2);
        sparseIntArray.put(a.i.txt_note_device_limit, 3);
        sparseIntArray.put(a.i.img_close_note_device_limit, 4);
        sparseIntArray.put(a.i.recycler_device_limit, 5);
    }

    public h(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 6, A0, B0));
    }

    public h(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[1], objArr[4], objArr[5], objArr[2], objArr[3], objArr[0]);
        this.f19647z0 = -1;
        this.f19646y0.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.f19647z0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.f19647z0 = 1;
        }
        w0();
    }

    public boolean e1(int i10, @o0 Object obj) {
        return true;
    }

    public boolean h0(int i10, Object obj, int i11) {
        return false;
    }

    public void r() {
        synchronized (this) {
            this.f19647z0 = 0;
        }
    }
}
