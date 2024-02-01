package zi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class z extends y {
    @o0
    public static final ViewDataBinding.i N0 = null;
    @o0
    public static final SparseIntArray O0;
    @m0
    public final RelativeLayout L0;
    public long M0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O0 = sparseIntArray;
        sparseIntArray.put(R.id.view, 1);
        sparseIntArray.put(R.id.refresh_recycler_video, 2);
        sparseIntArray.put(R.id.recycler_video, 3);
        sparseIntArray.put(R.id.view_loading_data, 4);
        sparseIntArray.put(R.id.layout_advertisement, 5);
        sparseIntArray.put(R.id.txt_playing, 6);
        sparseIntArray.put(R.id.img_news, 7);
        sparseIntArray.put(R.id.youtube_player_view, 8);
        sparseIntArray.put(R.id.rlt_youtube_player_view, 9);
        sparseIntArray.put(R.id.view_on_touch_listener, 10);
        sparseIntArray.put(R.id.view_progress_bar, 11);
        sparseIntArray.put(R.id.txt_time_play, 12);
        sparseIntArray.put(R.id.txt_time_video, 13);
        sparseIntArray.put(R.id.progress_bar, 14);
        sparseIntArray.put(R.id.img_play, 15);
        sparseIntArray.put(R.id.view_time, 16);
        sparseIntArray.put(R.id.txt_time, 17);
        sparseIntArray.put(R.id.view_click_video, 18);
    }

    public z(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 19, N0, O0));
    }

    public z(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[7], objArr[15], objArr[5], objArr[14], objArr[3], objArr[2], objArr[9], objArr[6], objArr[17], objArr[12], objArr[13], objArr[1], objArr[18], objArr[4], objArr[10], objArr[11], objArr[16], objArr[8]);
        this.M0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.L0 = relativeLayout;
        relativeLayout.setTag((Object) null);
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
