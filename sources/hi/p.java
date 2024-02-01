package hi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public class p extends o {
    @o0
    public static final ViewDataBinding.i M0 = null;
    @o0
    public static final SparseIntArray N0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(a.i.card_sign_up, 1);
        sparseIntArray.put(a.i.img_close_sign_up, 2);
        sparseIntArray.put(a.i.txt_title_signup, 3);
        sparseIntArray.put(a.i.txt_note_signup, 4);
        sparseIntArray.put(a.i.view_sdt_sign_up, 5);
        sparseIntArray.put(a.i.edt_sdt_sign_up, 6);
        sparseIntArray.put(a.i.bt_send_otp, 7);
        sparseIntArray.put(a.i.txt_time_otp, 8);
        sparseIntArray.put(a.i.edt_otp, 9);
        sparseIntArray.put(a.i.txt_send_otp, 10);
        sparseIntArray.put(a.i.txt_content_password, 11);
        sparseIntArray.put(a.i.edt_password_new, 12);
        sparseIntArray.put(a.i.txt_password_new, 13);
        sparseIntArray.put(a.i.edt_password_new_again, 14);
        sparseIntArray.put(a.i.txt_password_new_again, 15);
        sparseIntArray.put(a.i.bt_sign_up, 16);
        sparseIntArray.put(a.i.progress_bar_sign_up, 17);
    }

    public p(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 18, M0, N0));
    }

    public p(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[7], objArr[16], objArr[1], objArr[9], objArr[12], objArr[14], objArr[6], objArr[2], objArr[17], objArr[11], objArr[4], objArr[13], objArr[15], objArr[10], objArr[8], objArr[3], objArr[5], objArr[0]);
        this.L0 = -1;
        this.K0.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.L0 = 1;
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
            this.L0 = 0;
        }
    }
}
