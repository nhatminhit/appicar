package hi;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public class b extends a {
    @o0
    public static final SparseIntArray A0;
    @o0

    /* renamed from: z0  reason: collision with root package name */
    public static final ViewDataBinding.i f19624z0 = null;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final RelativeLayout f19625x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f19626y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(a.i.txt_title, 1);
        sparseIntArray.put(a.i.txt_description, 2);
        sparseIntArray.put(a.i.btn_left, 3);
        sparseIntArray.put(a.i.btn_right, 4);
    }

    public b(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 5, f19624z0, A0));
    }

    public b(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[3], objArr[4], objArr[2], objArr[1]);
        this.f19626y0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.f19625x0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.f19626y0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.f19626y0 = 1;
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
            this.f19626y0 = 0;
        }
    }
}
