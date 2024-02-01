package nc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import com.tatv.baseapp.a;
import d.m0;
import d.o0;

public class h extends g {
    @o0

    /* renamed from: x0  reason: collision with root package name */
    public static final ViewDataBinding.i f21233x0 = null;
    @o0

    /* renamed from: y0  reason: collision with root package name */
    public static final SparseIntArray f21234y0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final RelativeLayout f21235v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f21236w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21234y0 = sparseIntArray;
        sparseIntArray.put(a.i.root_layout, 1);
        sparseIntArray.put(a.i.txt_description, 2);
    }

    public h(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 3, f21233x0, f21234y0));
    }

    public h(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[1], objArr[2]);
        this.f21236w0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.f21235v0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.f21236w0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.f21236w0 = 1;
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
            this.f21236w0 = 0;
        }
    }
}
