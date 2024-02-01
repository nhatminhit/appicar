package hi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public class l extends k {
    @o0
    public static final ViewDataBinding.i O0 = null;
    @o0
    public static final SparseIntArray P0;
    public long N0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P0 = sparseIntArray;
        sparseIntArray.put(a.i.txt_login, 1);
        sparseIntArray.put(a.i.view_mode, 2);
        sparseIntArray.put(a.i.txt_login_qr, 3);
        sparseIntArray.put(a.i.view_login_qr, 4);
        sparseIntArray.put(a.i.txt_login_sdt, 5);
        sparseIntArray.put(a.i.view_login_sdt, 6);
        sparseIntArray.put(a.i.txt_note_login, 7);
        sparseIntArray.put(a.i.txt_note_login_qr, 8);
        sparseIntArray.put(a.i.view_sdt, 9);
        sparseIntArray.put(a.i.edt_sdt, 10);
        sparseIntArray.put(a.i.view_password, 11);
        sparseIntArray.put(a.i.edt_password, 12);
        sparseIntArray.put(a.i.img_eye, 13);
        sparseIntArray.put(a.i.txt_forgot_password, 14);
        sparseIntArray.put(a.i.bt_confirm, 15);
        sparseIntArray.put(a.i.txt_signup, 16);
        sparseIntArray.put(a.i.img_qr_login, 17);
        sparseIntArray.put(a.i.bt_get_qr_code, 18);
        sparseIntArray.put(a.i.progress_bar_login, 19);
    }

    public l(@o0 androidx.databinding.l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 20, O0, P0));
    }

    public l(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[15], objArr[18], objArr[12], objArr[10], objArr[13], objArr[17], objArr[19], objArr[14], objArr[1], objArr[3], objArr[5], objArr[7], objArr[8], objArr[16], objArr[0], objArr[4], objArr[6], objArr[2], objArr[11], objArr[9]);
        this.N0 = -1;
        this.H0.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.N0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.N0 = 1;
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
            this.N0 = 0;
        }
    }
}
