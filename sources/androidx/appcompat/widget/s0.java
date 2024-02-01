package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import d.m0;
import d.o0;
import k.d;

public interface s0 extends SpinnerAdapter {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1433a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f1434b;

        /* renamed from: c  reason: collision with root package name */
        public LayoutInflater f1435c;

        public a(@m0 Context context) {
            this.f1433a = context;
            this.f1434b = LayoutInflater.from(context);
        }

        @m0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f1435c;
            return layoutInflater != null ? layoutInflater : this.f1434b;
        }

        @o0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f1435c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@o0 Resources.Theme theme) {
            this.f1435c = theme == null ? null : theme == this.f1433a.getTheme() ? this.f1434b : LayoutInflater.from(new d(this.f1433a, theme));
        }
    }

    @o0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@o0 Resources.Theme theme);
}
