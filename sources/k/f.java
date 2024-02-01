package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.i;
import d.x0;
import java.util.ArrayList;
import k.b;
import l.c;
import l.e;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9827a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9828b;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f9829a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f9830b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<f> f9831c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final i<Menu, Menu> f9832d = new i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f9830b = context;
            this.f9829a = callback;
        }

        public boolean a(b bVar, MenuItem menuItem) {
            return this.f9829a.onActionItemClicked(e(bVar), new c(this.f9830b, (s0.c) menuItem));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f9829a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean c(b bVar, Menu menu) {
            return this.f9829a.onPrepareActionMode(e(bVar), f(menu));
        }

        public void d(b bVar) {
            this.f9829a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f9831c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f9831c.get(i10);
                if (fVar != null && fVar.f9828b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f9830b, bVar);
            this.f9831c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f9832d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            e eVar = new e(this.f9830b, (s0.a) menu);
            this.f9832d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f9827a = context;
        this.f9828b = bVar;
    }

    public void finish() {
        this.f9828b.c();
    }

    public View getCustomView() {
        return this.f9828b.d();
    }

    public Menu getMenu() {
        return new e(this.f9827a, (s0.a) this.f9828b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f9828b.f();
    }

    public CharSequence getSubtitle() {
        return this.f9828b.g();
    }

    public Object getTag() {
        return this.f9828b.h();
    }

    public CharSequence getTitle() {
        return this.f9828b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f9828b.j();
    }

    public void invalidate() {
        this.f9828b.k();
    }

    public boolean isTitleOptional() {
        return this.f9828b.l();
    }

    public void setCustomView(View view) {
        this.f9828b.n(view);
    }

    public void setSubtitle(int i10) {
        this.f9828b.o(i10);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f9828b.p(charSequence);
    }

    public void setTag(Object obj) {
        this.f9828b.q(obj);
    }

    public void setTitle(int i10) {
        this.f9828b.r(i10);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9828b.s(charSequence);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f9828b.t(z10);
    }
}
