package zi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class r extends q {
    @o0
    public static final ViewDataBinding.i Q0 = null;
    @o0
    public static final SparseIntArray R0;
    @m0
    public final RelativeLayout O0;
    public long P0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(R.id.view, 1);
        sparseIntArray.put(R.id.refresh_recycler_offline, 2);
        sparseIntArray.put(R.id.recycler_offline, 3);
        sparseIntArray.put(R.id.view_loading_data, 4);
        sparseIntArray.put(R.id.progress_loading, 5);
        sparseIntArray.put(R.id.layout_advertisement, 6);
        sparseIntArray.put(R.id.txt_playing, 7);
        sparseIntArray.put(R.id.img_news, 8);
        sparseIntArray.put(R.id.advertisement, 9);
        sparseIntArray.put(R.id.view_play_music, 10);
        sparseIntArray.put(R.id.surface_view, 11);
        sparseIntArray.put(R.id.view_music, 12);
        sparseIntArray.put(R.id.view_on_touch_listener, 13);
        sparseIntArray.put(R.id.view_progress_bar, 14);
        sparseIntArray.put(R.id.txt_time_play, 15);
        sparseIntArray.put(R.id.img_play_type, 16);
        sparseIntArray.put(R.id.txt_time_video, 17);
        sparseIntArray.put(R.id.progress_bar, 18);
        sparseIntArray.put(R.id.img_play, 19);
        sparseIntArray.put(R.id.view_time, 20);
        sparseIntArray.put(R.id.txt_time, 21);
    }

    public r(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 22, Q0, R0));
    }

    public r(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[9], objArr[8], objArr[19], objArr[16], objArr[6], objArr[18], objArr[5], objArr[3], objArr[2], objArr[11], objArr[7], objArr[21], objArr[15], objArr[17], objArr[1], objArr[4], objArr[12], objArr[13], objArr[10], objArr[14], objArr[20]);
        this.P0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.O0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.P0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.P0 = 1;
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
            this.P0 = 0;
        }
    }
}
