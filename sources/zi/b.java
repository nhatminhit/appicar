package zi;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import androidx.lifecycle.y;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public class b extends a {
    @o0
    public static final ViewDataBinding.i Q0;
    @o0
    public static final SparseIntArray R0;
    public long P0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(22);
        Q0 = iVar;
        iVar.a(0, new String[]{"setting"}, new int[]{1}, new int[]{R.layout.setting});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(R.id.layout_option, 2);
        sparseIntArray.put(R.id.view_search, 3);
        sparseIntArray.put(R.id.img_back, 4);
        sparseIntArray.put(R.id.edt_search, 5);
        sparseIntArray.put(R.id.tv_list_play, 6);
        sparseIntArray.put(R.id.list_channels, 7);
        sparseIntArray.put(R.id.search_channels, 8);
        sparseIntArray.put(R.id.view_distance, 9);
        sparseIntArray.put(R.id.img_youtube, 10);
        sparseIntArray.put(R.id.img_selection, 11);
        sparseIntArray.put(R.id.recycler_tab, 12);
        sparseIntArray.put(R.id.margin_distance, 13);
        sparseIntArray.put(R.id.layout_content, 14);
        sparseIntArray.put(R.id.img_ping, 15);
        sparseIntArray.put(R.id.list_search_youtube, 16);
        sparseIntArray.put(R.id.view_notification, 17);
        sparseIntArray.put(R.id.txt_title_notification, 18);
        sparseIntArray.put(R.id.txt_content_notification, 19);
        sparseIntArray.put(R.id.img_exit_notification, 20);
        sparseIntArray.put(R.id.progress_bar, 21);
    }

    public b(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 22, Q0, R0));
    }

    public b(l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, objArr[5], objArr[4], objArr[20], objArr[15], objArr[11], objArr[10], objArr[14], objArr[2], objArr[1], objArr[7], objArr[16], objArr[13], objArr[21], objArr[12], objArr[8], objArr[6], objArr[19], objArr[18], objArr[9], objArr[0], objArr[17], objArr[3]);
        this.P0 = -1;
        G0(this.B0);
        this.M0.setTag("icarEntertaiment");
        J0(view);
        b0();
    }

    public void I0(@o0 y yVar) {
        super.I0(yVar);
        this.B0.I0(yVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4.B0.Z() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.P0     // Catch:{ all -> 0x0018 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r1
        L_0x000c:
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            zi.s0 r0 = r4.B0
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
        throw new UnsupportedOperationException("Method not decompiled: zi.b.Z():boolean");
    }

    public void b0() {
        synchronized (this) {
            this.P0 = 2;
        }
        this.B0.b0();
        w0();
    }

    public boolean e1(int i10, @o0 Object obj) {
        return true;
    }

    public boolean h0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return s1((s0) obj, i11);
    }

    public void r() {
        synchronized (this) {
            this.P0 = 0;
        }
        ViewDataBinding.t(this.B0);
    }

    public final boolean s1(s0 s0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.P0 |= 1;
        }
        return true;
    }
}
