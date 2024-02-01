package n3;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;

public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f10797c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10798d = -2;

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f10799a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    public DataSetObserver f10800b;

    @Deprecated
    public void a(@m0 View view, int i10, @m0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@m0 ViewGroup viewGroup, int i10, @m0 Object obj) {
        a(viewGroup, i10, obj);
    }

    @Deprecated
    public void c(@m0 View view) {
    }

    public void d(@m0 ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(@m0 Object obj) {
        return -1;
    }

    @o0
    public CharSequence g(int i10) {
        return null;
    }

    public float h(int i10) {
        return 1.0f;
    }

    @Deprecated
    @m0
    public Object i(@m0 View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @m0
    public Object j(@m0 ViewGroup viewGroup, int i10) {
        return i(viewGroup, i10);
    }

    public abstract boolean k(@m0 View view, @m0 Object obj);

    public void l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f10800b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f10799a.notifyChanged();
    }

    public void m(@m0 DataSetObserver dataSetObserver) {
        this.f10799a.registerObserver(dataSetObserver);
    }

    public void n(@o0 Parcelable parcelable, @o0 ClassLoader classLoader) {
    }

    @o0
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@m0 View view, int i10, @m0 Object obj) {
    }

    public void q(@m0 ViewGroup viewGroup, int i10, @m0 Object obj) {
        p(viewGroup, i10, obj);
    }

    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f10800b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(@m0 View view) {
    }

    public void t(@m0 ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(@m0 DataSetObserver dataSetObserver) {
        this.f10799a.unregisterObserver(dataSetObserver);
    }
}
