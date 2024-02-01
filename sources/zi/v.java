package zi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class v extends u {
    @o0
    public static final ViewDataBinding.i N0 = null;
    @o0
    public static final SparseIntArray O0;
    public long M0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O0 = sparseIntArray;
        sparseIntArray.put(R.id.view, 1);
        sparseIntArray.put(R.id.refresh_recycler_channels, 2);
        sparseIntArray.put(R.id.recycler_channels, 3);
        sparseIntArray.put(R.id.player_view, 4);
        sparseIntArray.put(R.id.progress_bar, 5);
        sparseIntArray.put(R.id.view_on_touch_listener, 6);
        sparseIntArray.put(R.id.view_on_touch_listener_radio, 7);
        sparseIntArray.put(R.id.card_img_logo_channel, 8);
        sparseIntArray.put(R.id.img_logo_channel, 9);
        sparseIntArray.put(R.id.txt_categories, 10);
        sparseIntArray.put(R.id.txt_name_channels, 11);
        sparseIntArray.put(R.id.img_next, 12);
        sparseIntArray.put(R.id.img_play, 13);
        sparseIntArray.put(R.id.img_pause, 14);
        sparseIntArray.put(R.id.img_back, 15);
        sparseIntArray.put(R.id.layout_advertisement, 16);
        sparseIntArray.put(R.id.txt_playing, 17);
        sparseIntArray.put(R.id.img_news, 18);
    }

    public v(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 19, N0, O0));
    }

    public v(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[8], objArr[15], objArr[9], objArr[18], objArr[12], objArr[14], objArr[13], objArr[16], objArr[4], objArr[5], objArr[3], objArr[2], objArr[10], objArr[11], objArr[17], objArr[1], objArr[6], objArr[7], objArr[0]);
        this.M0 = -1;
        this.L0.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.M0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.M0 = 1;
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
            this.M0 = 0;
        }
    }
}
