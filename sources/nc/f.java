package nc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import com.tatv.baseapp.a;
import d.m0;
import d.o0;

public class f extends e {
    @o0
    public static final SparseIntArray A0;
    @o0

    /* renamed from: z0  reason: collision with root package name */
    public static final ViewDataBinding.i f21229z0 = null;

    /* renamed from: y0  reason: collision with root package name */
    public long f21230y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(a.i.blur_layout, 1);
        sparseIntArray.put(a.i.txt_title, 2);
        sparseIntArray.put(a.i.txt_description, 3);
        sparseIntArray.put(a.i.btn_confirm, 4);
    }

    public f(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 5, f21229z0, A0));
    }

    public f(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[1], objArr[4], objArr[0], objArr[3], objArr[2]);
        this.f21230y0 = -1;
        this.f21226v0.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.f21230y0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.f21230y0 = 1;
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
            this.f21230y0 = 0;
        }
    }
}
