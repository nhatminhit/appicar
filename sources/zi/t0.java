package zi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class t0 extends s0 {
    @o0

    /* renamed from: d1  reason: collision with root package name */
    public static final ViewDataBinding.i f25196d1 = null;
    @o0

    /* renamed from: e1  reason: collision with root package name */
    public static final SparseIntArray f25197e1;
    @m0

    /* renamed from: b1  reason: collision with root package name */
    public final RelativeLayout f25198b1;

    /* renamed from: c1  reason: collision with root package name */
    public long f25199c1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25197e1 = sparseIntArray;
        sparseIntArray.put(R.id.view_background_setting, 1);
        sparseIntArray.put(R.id.view_setting, 2);
        sparseIntArray.put(R.id.img_exit, 3);
        sparseIntArray.put(R.id.view_default_play, 4);
        sparseIntArray.put(R.id.txt_title_language, 5);
        sparseIntArray.put(R.id.txt_language, 6);
        sparseIntArray.put(R.id.txt_title_device, 7);
        sparseIntArray.put(R.id.txt_device, 8);
        sparseIntArray.put(R.id.spn_type_device, 9);
        sparseIntArray.put(R.id.txt_title, 10);
        sparseIntArray.put(R.id.txt_note, 11);
        sparseIntArray.put(R.id.recycler_list_default_play, 12);
        sparseIntArray.put(R.id.list_language, 13);
        sparseIntArray.put(R.id.view_continue, 14);
        sparseIntArray.put(R.id.txt_continue, 15);
        sparseIntArray.put(R.id.img_continue_play, 16);
        sparseIntArray.put(R.id.txt_note_continue, 17);
        sparseIntArray.put(R.id.view_separation, 18);
        sparseIntArray.put(R.id.txt_daily_news, 19);
        sparseIntArray.put(R.id.img_daily_news, 20);
        sparseIntArray.put(R.id.txt_note_daily_news, 21);
        sparseIntArray.put(R.id.view_hide_app, 22);
        sparseIntArray.put(R.id.txt_hide_app, 23);
        sparseIntArray.put(R.id.img_hide_app, 24);
        sparseIntArray.put(R.id.txt_note_hide_app, 25);
        sparseIntArray.put(R.id.view_picture_in_picture, 26);
        sparseIntArray.put(R.id.txt_picture_in_picture, 27);
        sparseIntArray.put(R.id.img_picture_in_picture, 28);
        sparseIntArray.put(R.id.txt_note_picture_in_picture, 29);
        sparseIntArray.put(R.id.view_ping_internet, 30);
        sparseIntArray.put(R.id.txt_title_ping_internet, 31);
        sparseIntArray.put(R.id.img_ping_internet, 32);
        sparseIntArray.put(R.id.txt_ping_internet, 33);
        sparseIntArray.put(R.id.btn_send_report, 34);
    }

    public t0(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 35, f25196d1, f25197e1));
    }

    public t0(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[34], objArr[16], objArr[20], objArr[3], objArr[24], objArr[28], objArr[32], objArr[13], objArr[12], objArr[9], objArr[15], objArr[19], objArr[8], objArr[23], objArr[6], objArr[11], objArr[17], objArr[21], objArr[25], objArr[29], objArr[27], objArr[33], objArr[10], objArr[7], objArr[5], objArr[31], objArr[1], objArr[14], objArr[4], objArr[22], objArr[26], objArr[30], objArr[18], objArr[2]);
        this.f25199c1 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.f25198b1 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.f25199c1 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.f25199c1 = 1;
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
            this.f25199c1 = 0;
        }
    }
}
