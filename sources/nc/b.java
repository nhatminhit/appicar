package nc;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.l;
import com.tatv.baseapp.a;
import d.m0;
import d.o0;

public class b extends a {
    @o0
    public static final ViewDataBinding.i B0 = null;
    @o0
    public static final SparseIntArray C0;
    public long A0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final RelativeLayout f21216z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(a.i.root_layout, 1);
        sparseIntArray.put(a.i.txt_title, 2);
        sparseIntArray.put(a.i.txtContent, 3);
        sparseIntArray.put(a.i.layout_action, 4);
        sparseIntArray.put(a.i.txt_confirm, 5);
        sparseIntArray.put(a.i.txt_cancel, 6);
    }

    public b(@o0 l lVar, @m0 View view) {
        this(lVar, view, ViewDataBinding.f0(lVar, view, 7, B0, C0));
    }

    public b(l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, objArr[4], objArr[1], objArr[6], objArr[5], objArr[3], objArr[2]);
        this.A0 = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.f21216z0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        J0(view);
        b0();
    }

    public boolean Z() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    public void b0() {
        synchronized (this) {
            this.A0 = 1;
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
            this.A0 = 0;
        }
    }
}
