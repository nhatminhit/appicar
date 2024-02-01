package hi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public class d extends c {
    @o0
    public static final ViewDataBinding.i B0 = null;
    @o0
    public static final SparseIntArray C0;
    public long A0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final RelativeLayout f19633z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(a.i.btn_back, 1);
        sparseIntArray.put(a.i.txt_title, 2);
        sparseIntArray.put(a.i.txt_description, 3);
        sparseIntArray.put(a.i.img_qrcode, 4);
        sparseIntArray.put(a.i.btn_recreate_code, 5);
        sparseIntArray.put(a.i.progress_bar, 6);
    }

    public d(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 7, B0, C0));
    }

    public d(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[1], objArr[5], objArr[4], objArr[6], objArr[3], objArr[2]);
        this.A0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.f19633z0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.A0 = 1;
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
            this.A0 = 0;
        }
    }
}
