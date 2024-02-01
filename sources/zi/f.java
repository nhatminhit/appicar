package zi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class f extends e {
    @o0
    public static final ViewDataBinding.i B0 = null;
    @o0
    public static final SparseIntArray C0;
    public long A0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(R.id.img_logo, 1);
        sparseIntArray.put(R.id.txt_content, 2);
        sparseIntArray.put(R.id.txt_title_device, 3);
        sparseIntArray.put(R.id.layout_type_device, 4);
        sparseIntArray.put(R.id.spn_type_device, 5);
        sparseIntArray.put(R.id.bt_confirm, 6);
    }

    public f(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 7, B0, C0));
    }

    public f(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[6], objArr[1], objArr[4], objArr[5], objArr[2], objArr[3], objArr[0]);
        this.A0 = -1;
        this.f25170z0.setTag((Object) null);
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
